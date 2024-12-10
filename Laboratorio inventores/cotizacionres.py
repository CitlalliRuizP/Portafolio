from librerias import *

def open_window_cotizacionres(root):

    def cotizacionres_window():
        cotizacionres.destroy()  # Cierra la ventana actual
        open_window_cotizacionres(cotizacionres)  # Abre la ventana de cotizacionfil y pasa la referencia de la ventana actual

    def regresar_a_filamento():
        from cotizacionfil import open_window_cotizacionfil
        cotizacionres.destroy()
        open_window_cotizacionfil(cotizacionres)

    with open('perfiles.txt', 'r') as archivo:
        lineas = archivo.readlines()

    listado = []
    name_r = []

    for i in range(len(lineas)):
        linea_check = lineas[i].strip()

    # Busca "Nombre del Perfil" y verifica si en la siguiente línea está el tipo "RESINA"
        if linea_check.startswith("Nombre del Perfil:"):
            nombre_perfil = linea_check.split(":")[1].strip()  # Extrae el nombre del perfil
        
        # Verifica que la línea siguiente contenga "Tipo de Impresora: RESINA"
        if i + 1 < len(lineas) and "Tipo de Impresora: RESINA" in lineas[i + 1].strip():
            listado.append(nombre_perfil)

    # CREA LA VENTANA DE cotizacion principal
    cotizacionres = tk.Tk()
    # Obtiene la resolución de la pantalla
    width = cotizacionres.winfo_screenwidth()
    height = cotizacionres.winfo_screenheight()

    # Configura la ventana para que ocupe toda la pantalla
    cotizacionres.geometry(f"{width}x{height}")
    cotizacionres.resizable(width=False, height=False)

    # HEADER CONFIG
    header = tk.Frame(cotizacionres, bg="#E07B09")
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
    lbl_logo = tk.Label(cotizacionres, image=logo)
    lbl_logo.place(x=0, y=60)
    lbl_logo.image = logo

    btn_salir = ctk.CTkButton(
        cotizacionres, 
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
    cotizacionres.title("Cotización")
    title_label = ctk.CTkLabel(
        cotizacionres,
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
        cotizacionres, 
        text="FILAMENTO", 
        fg_color="white",  
        text_color="blue", 
        font=("Helvetica", 40, "bold"),
        hover_color="#85c1e9",
        corner_radius=10,
        border_color="blue",
        border_width=6,
        width=300,  # Ancho del botón
        height=80,  # Altura del botón
        command=regresar_a_filamento
    )
    btn_filamento.place(relx=0.3, y=250, anchor=tk.CENTER)
    btn_filamento._original_fg_color = btn_filamento.cget("fg_color")
    btn_filamento._original_text_color = btn_filamento.cget("text_color")
    btn_filamento._pressed_color = "black"  # Color al presionar el botón
    btn_filamento._pressed_text_color = "white"  # Color del texto al presionar el botón

    #Resina
    btn_resina = ctk.CTkButton(
        cotizacionres, 
        text="RESINA", 
        fg_color="#85c1e9",  # Fondo blanco por defecto
        text_color="blue",  # Texto azul por defecto
        font=("Helvetica", 40, "bold"),
        hover_color="#85c1e9",  # Fondo azul al pasar el mouse
        corner_radius=10,
        border_color="blue",  # Borde azul
        border_width=6,
        width=300,  # Ancho del botón
        height=80,  # Altura del botón
    )
    btn_resina.place(relx=0.7, y=250, anchor=tk.CENTER)
    btn_resina._original_fg_color = btn_resina.cget("fg_color")
    btn_resina._original_text_color = btn_resina.cget("text_color")
    btn_resina._pressed_color = "blue"  # Fondo azul al presionar
    btn_resina._pressed_text_color = "white"  # Texto blanco al presionar

    # Pantalla de cotizacion de filamento
    # Posicionamiento de las etiquetas
    label_n = ctk.CTkLabel(
        cotizacionres,
        text="Nombre del proyecto", # Texto del título
        font=("Helvetica", 30, "bold"), # Fuente y tamaño
        text_color="white", # Color del texto
        fg_color="black", # Color de fondo del título
        corner_radius=10, # Bordes redondeados
        width=200,  # Ancho del botón
        height=60,  # Altura del botón
    )
    # Posicionamiento de las etiquetas
    label_n.place(relx=0.1, y=450, anchor=tk.CENTER)

    label_1 = ctk.CTkLabel(
        cotizacionres,
        text="Gramos o mililitros\n de la pieza", # Texto del título
        font=("Helvetica", 30, "bold"), # Fuente y tamaño
        text_color="white", # Color del texto
        fg_color="black", # Color de fondo del título
        corner_radius=10, # Bordes redondeados
        width=200,  # Ancho del botón
        height=60,  # Altura del botón
    )
    # Posicionamiento de las etiquetas
    label_1.place(relx=0.1, y=550, anchor=tk.CENTER)

    label_2 = ctk.CTkLabel(
        cotizacionres,
        text="Tiempo de impresión", # Texto del título
        font=("Helvetica", 30, "bold"), # Fuente y tamaño
        text_color="white", # Color del texto
        fg_color="black", # Color de fondo del título
        corner_radius=10, # Bordes redondeados
        width=200,  # Ancho del botón
        height=60,  # Altura del botón
    )

     # Posicionamiento de las etiquetas
    label_2.place(relx=0.6, y=450, anchor=tk.CENTER)

    label_3 = ctk.CTkLabel(
        cotizacionres,
        text="Fecha estimada", # Texto del título
        font=("Helvetica", 30, "bold"), # Fuente y tamaño
        text_color="white", # Color del texto
        fg_color="black", # Color de fondo del título
        corner_radius=10, # Bordes redondeados
        width=200,  # Ancho del botón
        height=60,  # Altura del botón
    )

     # Posicionamiento de las etiquetas
    label_3.place(relx=0.6, y=550, anchor=tk.CENTER)

    label_4 = ctk.CTkLabel(
        cotizacionres,
        text="Perfil asignado", # Texto del título
        font=("Helvetica", 30, "bold"), # Fuente y tamaño
        text_color="white", # Color del texto
        fg_color="black", # Color de fondo del título
        corner_radius=10, # Bordes redondeados
        width=200,  # Ancho del botón
        height=60,  # Altura del botón
    )

     # Posicionamiento de las etiquetas
    label_4.place(relx=0.35, y=650, anchor=tk.CENTER)

    entry_n = ctk.CTkEntry(
        cotizacionres,
        font=("Helvetica", 16),  # Fuente de la caja de texto
        fg_color="white",
        text_color="black",
        border_color="orange",
        placeholder_text="Ingrese el nombre del proyecto",
        corner_radius=15,
        width=400,  # Ancho del botón
        height=60,  # Altura del botón
    )
    entry_n.place(relx=0.35, y=450, anchor=tk.CENTER)
    
    entry_resina = ctk.CTkEntry(
        cotizacionres,
        font=("Helvetica", 16),  # Fuente de la caja de texto
        fg_color="white",
        text_color="black",
        border_color="orange",
        placeholder_text="Ingrese los gramos o mililitros",
        corner_radius=15,
        width=400,  # Ancho del botón
        height=60,  # Altura del botón
    )
    entry_resina.place(relx=0.35, y=550, anchor=tk.CENTER)

    entry2_resina = ctk.CTkEntry(
        cotizacionres,
        font=("Helvetica", 16),  # Fuente de la caja de texto
        fg_color="white",
        text_color="black",
        placeholder_text="Ingrese el tiempo",
        corner_radius=15,
        border_color="orange",
        width=400,  # Ancho del botón
        height=60,  # Altura del botón
    )
    entry2_resina.place(relx=0.85, y=450, anchor=tk.CENTER)

    entry3_resina = ctk.CTkEntry(
        cotizacionres,
        font=("Helvetica", 16),  # Fuente de la caja de texto
        fg_color="white",
        text_color="black",
        placeholder_text="Ingrese fecha estimada",
        corner_radius=15,
        border_color="orange",
        width=400,  # Ancho del botón
        height=60,  # Altura del botón
    )
    entry3_resina.place(relx=0.85, y=550, anchor=tk.CENTER)

    combobox_resina = ttk.Combobox(
        cotizacionres,
        values=listado,
        state="readonly",  # Solo lectura, evita edición
        font=("Helvetica", 16),  # Fuente del Combobox
        width=30,  # Ancho del botón
        height=70,  # Altura del botón
    )
    combobox_resina.set("Seleccione un perfil")  # Texto inicial
    combobox_resina.place(relx=0.56, y=650, anchor=tk.CENTER)

    #Funcion para guardar en el txt 

    def guardar_informacion():
        nombre = entry_n.get()
        perfil = combobox_resina.get()
        mililitros = entry_resina.get()
        tiempo = entry2_resina.get()
        fecha = entry3_resina.get()
        

        # Validación: verificar que todos los campos estén llenos
        if not nombre or not perfil or not mililitros or not tiempo  or not fecha:
            messagebox.showwarning("Advertencia", "Por favor, complete todos los campos obligatorios.")
            cotizacionres_window()
            return  # No continuar si falta algún campo


        #Aqui se guarda el archivo txt
        with open("cotizaciones.txt", "a") as file:
            file.write(f"\nNombre del proyecto: {nombre}\n")
            file.write(f"Perfil asignado: {perfil}\n")
            file.write(f"Mililitros: {mililitros}\n")
            file.write(f"Tiempo: {tiempo}\n")
            file.write(f"Fecha estimada: {fecha}\n")
            
        messagebox.showinfo("Notificacion", "La informacion fue guardada correctamente.")
        cotizacionres_window()

        
        cotizacionres.destroy()
        open_window_cotizacionres(cotizacionres)
        print("Informacion guardada correctamente")

    btn_aceptar = ctk.CTkButton(
        cotizacionres, 
        text="Finalizar cotización", 
        fg_color="#d2b4de",  
        text_color="white", 
        font=("Helvetica", 24),
        hover_color="#8e44ad",
        corner_radius=20,
        border_color="black",
        border_width=2,
        width=300,  # Ancho del botón
        height=60,  # Altura del botón
        command=guardar_informacion
    )
    btn_aceptar.place(relx=0.5, y=850, anchor=tk.CENTER)
    btn_aceptar.bind("<Button-1>", lambda e: on_closing())

    # Función para manejar el cierre de la ventana
    def on_closing():
        cotizacionres.destroy()  

    cotizacionres.protocol("WM_DELETE_WINDOW", on_closing)

    cotizacionres.mainloop()

