from librerias import *
from cotizacionfil import open_window_cotizacionfil
from cotizacionres import open_window_cotizacionres

def open_window_cotizacionm(root):

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
    
    # Función para abrir la ventana de cotizacionfil y cerrar la actual
    def cotizacionfil_window():
        cotizacionm.destroy()  # Cierra la ventana actual
        open_window_cotizacionfil(cotizacionm)  # Abre la ventana de cotizacionfil y pasa la referencia de la ventana actual

    def cotizacionres_window():
        cotizacionm.destroy()  # Cierra la ventana actual
        open_window_cotizacionres(cotizacionm)  # Abre la ventana de cotizacionfil y pasa la referencia de la ventana actual

    # CREA LA VENTANA DE cotizacion principal
    cotizacionm = tk.Tk()
    # Obtiene la resolución de la pantalla
    width = cotizacionm.winfo_screenwidth()
    height = cotizacionm.winfo_screenheight()

    # Configura la ventana para que ocupe toda la pantalla
    cotizacionm.geometry(f"{width}x{height}")
    cotizacionm.resizable(width=False, height=False)

    # HEADER CONFIG
    header = tk.Frame(cotizacionm, bg="#E07B09")
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
    lbl_logo = tk.Label(cotizacionm, image=logo)
    lbl_logo.place(x=0, y=60)
    lbl_logo.image = logo

    btn_salir = ctk.CTkButton(
        cotizacionm, 
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
    cotizacionm.title("Cotización")
    title_label = ctk.CTkLabel(
        cotizacionm,
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
        cotizacionm, 
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
        cotizacionm, 
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
        command=cotizacionres_window
    )
    btn_resina.place(relx=0.7, y=250, anchor=tk.CENTER)
    btn_resina._original_fg_color = btn_resina.cget("fg_color")
    btn_resina._original_text_color = btn_resina.cget("text_color")
    btn_resina._pressed_color = "blue"  # Fondo azul al presionar
    btn_resina._pressed_text_color = "white"  # Texto blanco al presionar
    btn_resina.bind("<Button-1>", lambda e: on_button_click(btn_resina), )

    # Función para manejar el cierre de la ventana
    def on_closing():
        cotizacionm.destroy()  

    cotizacionm.protocol("WM_DELETE_WINDOW", on_closing)

    cotizacionm.mainloop()
