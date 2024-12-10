from librerias import *


def open_window_cotizacionfil(root):

    # Variable global para rastrear el botón actualmente presionado 
    current_button = None

    # FUNCIONES
    # Función para cambiar el color del botón al ser presionado y resetear el botón previamente presionado
    def on_button_click(button):
        global current_button
        
        if current_button is not None:
            current_button.configure(fg_color=current_button._original_fg_color, text_color=current_button._original_text_color)
        
        button.configure(fg_color=button._pressed_color, text_color=button._pressed_text_color)
        current_button = button

    def cotizacionfil_window():
        cotizacionfil.destroy()  # Cierra la ventana actual
        open_window_cotizacionfil(cotizacionfil)  # Abre la ventana de cotizacionfil y pasa la referencia de la ventana actual

    def regresar_a_resina():
        from cotizacionres import open_window_cotizacionres
        cotizacionfil.destroy()
        open_window_cotizacionres(cotizacionfil)

    with open('perfiles.txt', 'r') as archivo:
        lineas = archivo.readlines()

    listado = []
    name_r = []

    for i in range(len(lineas)):
        linea_check = lineas[i].strip()

    # Busca "Nombre del Perfil" y verifica si en la siguiente línea está el tipo "FILAMENTO"
        if linea_check.startswith("Nombre del Perfil:"):
            nombre_perfil = linea_check.split(":")[1].strip()  # Extrae el nombre del perfil
        
        # Verifica que la línea siguiente contenga "Tipo de Impresora: FILAMENTO"
        if i + 1 < len(lineas) and "Tipo de Impresora: FILAMENTO" in lineas[i + 1].strip():
            listado.append(nombre_perfil)

    # CREA LA VENTANA DE cotizacion principal
    cotizacionfil = tk.Tk()
    # Obtiene la resolución de la pantalla
    width = cotizacionfil.winfo_screenwidth()
    height = cotizacionfil.winfo_screenheight()

    # Configura la ventana para que ocupe toda la pantalla
    cotizacionfil.geometry(f"{width}x{height}")
    cotizacionfil.resizable(width=False, height=False)

    # HEADER CONFIG
    header = tk.Frame(cotizacionfil, bg="#E07B09")
    header.place(x=0, y=0, width=width, height=60)

    # BUTTONS HEADER
    btn_perfiles = ctk.CTkButton(
        header, 
        text="PERFILES", 
        fg_color="white",  
        text_color="black", 
        font=("Helvetica", 24),
        hover_color="#555555",
        corner_radius=20,
        border_color="black",
        border_width=2,
    )
    btn_perfiles.place(relx=0.2, rely=0.5, anchor=tk.CENTER)
    btn_perfiles._original_fg_color = btn_perfiles.cget("fg_color")
    btn_perfiles._original_text_color = btn_perfiles.cget("text_color")
    btn_perfiles._pressed_color = "black"  # Color al presionar el botón
    btn_perfiles._pressed_text_color = "white"  # Color del texto al presionar el botón
    btn_perfiles.bind("<Button-1>", lambda e: on_button_click(btn_perfiles), )

    btn_cotizaciones = ctk.CTkButton(
        header, 
        text="COTIZACIONES", 
        fg_color="black",  # Establece el color resaltado manualmente
        text_color="white",  # Establece el color del texto resaltado manualmente
        font=("Helvetica", 24),
        hover_color="#555555",
        corner_radius=20,
        border_color="black",
        border_width=2,
    )
    btn_cotizaciones.place(relx=0.5, rely=0.5, anchor=tk.CENTER)
    btn_cotizaciones._original_fg_color = "black"  # Almacena el color original ya resaltado
    btn_cotizaciones._original_text_color = "white"  # Almacena el color original ya resaltado
    btn_cotizaciones._pressed_color = "black"  # Color al presionar el botón
    btn_cotizaciones._pressed_text_color = "white"  # Color del texto al presionar el botón

    btn_impresiones = ctk.CTkButton(
        header, 
        text="IMPRESIONES", 
        fg_color="white",  
        text_color="black", 
        font=("Helvetica", 24),
        hover_color="#555555",
        corner_radius=20,
        border_color="black",
        border_width=2,
    )
    btn_impresiones.place(relx=0.8, rely=0.5, anchor=tk.CENTER)
    btn_impresiones._original_fg_color = btn_impresiones.cget("fg_color")
    btn_impresiones._original_text_color = btn_impresiones.cget("text_color")
    btn_impresiones._pressed_color = "black"  # Color al presionar el botón
    btn_impresiones._pressed_text_color = "white"  # Color del texto al presionar el botón
    btn_impresiones.bind("<Button-1>", lambda e: on_button_click(btn_impresiones))

    

    # CARGAR IMAGEN DE FONDO
    image_logo = "InventoresBannerHDWhiteBorder.jpg"
    image = Image.open(image_logo)
    image = image.resize((width, height - 100))
    image = image.convert("RGBA")

    def make_transparent(img, alpha_value):
        r, g, b, a = img.split()
        a = a.point(lambda p: int(p * alpha_value / 255))
        img = Image.merge("RGBA", (r, g, b, a))
        return img
    
    transparency_level = 0.5
    image = make_transparent(image, int(255 * transparency_level))
    logo = ImageTk.PhotoImage(image)
    lbl_logo = tk.Label(cotizacionfil, image=logo)
    lbl_logo.place(x=0, y=60)
    lbl_logo.image = logo

    btn_salir = ctk.CTkButton(
        cotizacionfil, 
        text="Salir", 
        fg_color="red",  
        text_color="white", 
        font=("Helvetica", 24),
        hover_color="orange",
        corner_radius=20,
        border_color="black",
        border_width=2,
    )
    btn_salir.place(relx=0.93, rely=0.93, anchor=tk.CENTER)
    btn_salir.bind("<Button-1>", lambda e: on_closing())

    #PANTALLA PRINCIPAL DE COTIZACIONES
    cotizacionfil.title("Cotización")
    title_label = ctk.CTkLabel(
        cotizacionfil,
        text="SELECCIONE EL TIPO\n DE IMPRESIÓN", # Texto del título
        font=("Helvetica", 30, "bold"), # Fuente y tamaño
        text_color="white", # Color del texto
        fg_color="black", # Color de fondo del título
        corner_radius=10, # Bordes redondeados
    )
    # Posicionamiento del título
    title_label.place(relx=0.5, y=120, anchor=tk.CENTER)

    #filamento
    btn_filamento = ctk.CTkButton(
        cotizacionfil, 
        text="FILAMENTO", 
        fg_color="#85c1e9",  
        text_color="blue", 
        font=("Helvetica", 40, "bold"),
        hover_color="#85c1e9",
        corner_radius=10,
        border_color="blue",
        border_width=6,
        width=300,  # Ancho del botón
        height=80,  # Altura del botón
        command=cotizacionfil_window
    )
    btn_filamento.place(relx=0.3, y=250, anchor=tk.CENTER)
    btn_filamento._original_fg_color = btn_filamento.cget("fg_color")
    btn_filamento._original_text_color = btn_filamento.cget("text_color")
    btn_filamento._pressed_color = "black"  # Color al presionar el botón
    btn_filamento._pressed_text_color = "white"  # Color del texto al presionar el botón
    btn_filamento.bind("<Button-1>", lambda e: on_button_click(btn_filamento), )

    #Resina
    btn_resina = ctk.CTkButton(
        cotizacionfil, 
        text="RESINA", 
        fg_color="white",  # Fondo blanco por defecto
        text_color="blue",  # Texto azul por defecto
        font=("Helvetica", 40, "bold"),
        hover_color="#85c1e9",  # Fondo azul al pasar el mouse
        corner_radius=10,
        border_color="blue",  # Borde azul
        border_width=6,
        width=300,  # Ancho del botón
        height=80,  # Altura del botón
        command=regresar_a_resina
    )
    btn_resina.place(relx=0.7, y=250, anchor=tk.CENTER)
    btn_resina._original_fg_color = btn_resina.cget("fg_color")
    btn_resina._original_text_color = btn_resina.cget("text_color")
    btn_resina._pressed_color = "blue"  # Fondo azul al presionar
    btn_resina._pressed_text_color = "white"  # Texto blanco al presionar
    btn_resina.bind("<Button-1>", lambda e: on_button_click(btn_resina), )

    #Pantalla de cotizacion de filamento
    label_n = ctk.CTkLabel(
        cotizacionfil,
        text="Nombre del proyecto", # Texto del título
        font=("Helvetica", 25, "bold"), # Fuente y tamaño
        text_color="white", # Color del texto
        fg_color="black", # Color de fondo del título
        corner_radius=10, # Bordes redondeados
        width=150,  # Ancho del botón
        height=40,  # Altura del botón
    )
    # Posicionamiento del título
    label_n.place(relx=0.1, y=350, anchor=tk.CENTER)

    label_1 = ctk.CTkLabel(
        cotizacionfil,
        text="Gramos de la pieza", # Texto del título
        font=("Helvetica", 25, "bold"), # Fuente y tamaño
        text_color="white", # Color del texto
        fg_color="black", # Color de fondo del título
        corner_radius=10, # Bordes redondeados
        width=150,  # Ancho del botón
        height=40,  # Altura del botón
    )
    # Posicionamiento del título
    label_1.place(relx=0.1, y=450, anchor=tk.CENTER)

    label_2 = ctk.CTkLabel(
        cotizacionfil,
        text="Tiempo de impresión", # Texto del título
        font=("Helvetica", 25, "bold"), # Fuente y tamaño
        text_color="white", # Color del texto
        fg_color="black", # Color de fondo del título
        corner_radius=10, # Bordes redondeados
        width=150,  # Ancho del botón
        height=40,  # Altura del botón
    )
    # Posicionamiento del título
    label_2.place(relx=0.1, y=550, anchor=tk.CENTER)

    label_3 = ctk.CTkLabel(
        cotizacionfil,
        text="Tipo de filamento", # Texto del título
        font=("Helvetica", 25, "bold"), # Fuente y tamaño
        text_color="white", # Color del texto
        fg_color="black", # Color de fondo del título
        corner_radius=10, # Bordes redondeados
        width=150,  # Ancho del botón
        height=40,  # Altura del botón
    )
    # Posicionamiento del título
    label_3.place(relx=0.6, y=350, anchor=tk.CENTER)

    label_4 = ctk.CTkLabel(
        cotizacionfil,
        text="Fecha estimada", # Texto del título
        font=("Helvetica", 25, "bold"), # Fuente y tamaño
        text_color="white", # Color del texto
        fg_color="black", # Color de fondo del título
        corner_radius=10, # Bordes redondeados
        width=150,  # Ancho del botón
        height=40,  # Altura del botón
    )
    # Posicionamiento del título
    label_4.place(relx=0.6, y=450, anchor=tk.CENTER)

    label_5 = ctk.CTkLabel(
        cotizacionfil,
        text="Perfil asignado", # Texto del título
        font=("Helvetica", 25, "bold"), # Fuente y tamaño
        text_color="white", # Color del texto
        fg_color="black", # Color de fondo del título
        corner_radius=10, # Bordes redondeados
        width=150,  # Ancho del botón
        height=40,  # Altura del botón
    )
    # Posicionamiento del título
    label_5.place(relx=0.6, y=550, anchor=tk.CENTER)

    entryn_filamento = ctk.CTkEntry(
        cotizacionfil,
        font=("Helvetica", 16),  # Fuente de la caja de texto
        fg_color="white",
        text_color="black",
        placeholder_text="Ingrese el nombre del proyecto",
        corner_radius=15,
        border_color="orange",
        width=400,  # Ancho del botón
        height=40,  # Altura del botón
    )
    entryn_filamento.place(relx=0.32, y=350, anchor=tk.CENTER)

    entry_filamento = ctk.CTkEntry(
        cotizacionfil,
        font=("Helvetica", 16),  # Fuente de la caja de texto
        fg_color="white",
        text_color="black",
        border_color="orange",
        placeholder_text="Ingrese los gramos",
        corner_radius=15,
        width=400,  # Ancho del botón
        height=40,  # Altura del botón
    )
    entry_filamento.place(relx=0.32, y=450, anchor=tk.CENTER)

    entry2_filamento = ctk.CTkEntry(
        cotizacionfil,
        font=("Helvetica", 16),  # Fuente de la caja de texto
        fg_color="white",
        text_color="black",
        placeholder_text="Ingrese el tiempo",
        corner_radius=15,
        border_color="orange",
        width=400,  # Ancho del botón
        height=40,  # Altura del botón
    )
    entry2_filamento.place(relx=0.32, y=550, anchor=tk.CENTER)

    # Dropdown Menú Desplegable (Combobox)
    opciones_filamento = ["PLA", "ABS", "PETG", "Nylon", "TPU"]  # Opciones de filamento
    combobox_filamento = ttk.Combobox(
        cotizacionfil,
        values=opciones_filamento,
        state="readonly",  # Solo lectura, evita edición
        font=("Helvetica", 16),  # Fuente del Combobox
        width=30,  # Ancho del botón
        height=70,  # Altura del botón
    )
    combobox_filamento.set("Seleccione un filamento")  # Texto inicial
    combobox_filamento.place(relx=0.8, y=350, anchor=tk.CENTER)

    entry3_filamento = ctk.CTkEntry(
        cotizacionfil,
        font=("Helvetica", 16),  # Fuente de la caja de texto
        fg_color="white",
        text_color="black",
        placeholder_text="Ingrese fecha estimada",
        corner_radius=15,
        border_color="orange",
        width=400,  # Ancho del botón
        height=40,  # Altura del botón
    )
    entry3_filamento.place(relx=0.8, y=450, anchor=tk.CENTER)

    combobox_filamento2 = ttk.Combobox(
    cotizacionfil,
    values=listado,  # Pasa las líneas filtradas como opciones
    state="readonly",  # Solo lectura, evita edición
    font=("Helvetica", 16),  # Fuente del Combobox
    width=30,  # Ancho del botón
    height=70,  # Altura del botón
)
    combobox_filamento2.set("Seleccione un perfil")  # Texto inicial
    combobox_filamento2.place(relx=0.8, y=550, anchor=tk.CENTER)

    #Funcion para guardar en el txt 

    def guardar_informacion():
    # Obtener los valores de los campos
        nombre = entryn_filamento.get()
        perfil = combobox_filamento2.get()
        gramos = entry_filamento.get()
        tiempo = entry2_filamento.get()
        filamento = combobox_filamento.get()
        fecha = entry3_filamento.get()

    # Validación: verificar que todos los campos estén llenos
        if not nombre or not perfil or not gramos or not tiempo or not filamento or not fecha:
            messagebox.showwarning("Advertencia", "Por favor, complete todos los campos obligatorios.")
            cotizacionfil_window()
            return  # No continuar si falta algún campo

    # Aquí se guarda el archivo txt
        with open("cotizaciones.txt", "a") as file:
            file.write(f"\nNombre del proyecto: {nombre}\n")
            file.write(f"Perfil asignado: {perfil}\n")
            file.write(f"Gramos: {gramos}\n")
            file.write(f"Tiempo: {tiempo}\n")
            file.write(f"Filamento: {filamento}\n")
            file.write(f"Fecha estimada: {fecha}\n")

        messagebox.showinfo("Notificacion", "La informacion fue guardada correctamente.")
        cotizacionfil_window()

    
        

    btn_aceptar = ctk.CTkButton(
        cotizacionfil, 
        text="Finalizar cotización", 
        fg_color="#d2b4de",  
        text_color="white", 
        font=("Helvetica", 24),
        hover_color="#8e44ad",
        corner_radius=20,
        border_color="black",
        border_width=2,
        width=200,  # Ancho del botón
        height=60,  # Altura del botón
        command=guardar_informacion
    )
    btn_aceptar.place(relx=0.5, y=850, anchor=tk.CENTER)
    btn_aceptar.bind("<Button-1>", lambda e: on_closing())


    # Función para manejar el cierre de la ventana
    def on_closing():
        cotizacionfil.destroy()  

    cotizacionfil.protocol("WM_DELETE_WINDOW", on_closing)

    cotizacionfil.mainloop()
