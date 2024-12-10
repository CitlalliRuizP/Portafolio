import tkinter as tk
from tkinter import *
from tkinter.ttk import *
import customtkinter as ctk
from PIL import Image, ImageTk

from cotizacionmain import open_window_cotizacionm
from cotizacionfil import open_window_cotizacionfil
from cotizacionres import open_window_cotizacionres
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

#def perfiles_window():
    #inicio.destroy()  # Ocultar la ventana actual
   # open_window_perfiles(inicio)  # Abrir la nueva ventana y pasar la referencia de la ventana actual
    
def cotizacionm_window():
    inicio.destroy()  # Ocultar la ventana actual
    open_window_cotizacionm(inicio)  # Abrir la nueva ventana y pasar la referencia de la ventana actual



# CREA LA VENTANA DE INICIO
inicio = tk.Tk()
# Obtiene la resolución de la pantalla
width = inicio.winfo_screenwidth()
height = inicio.winfo_screenheight()

# Configura la ventana para que ocupe toda la pantalla
inicio.geometry(f"{width}x{height}")
inicio.resizable(width=False, height=False)

# HEADER CONFIG
header = tk.Frame(inicio, bg="#E07B09")
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
   #command=perfiles_window
)
btn_perfiles.place(relx=0.2, rely=0.5, anchor=tk.CENTER)
btn_perfiles._original_fg_color = btn_perfiles.cget("fg_color")
btn_perfiles._original_text_color = btn_perfiles.cget("text_color")
btn_perfiles._pressed_color = "black"  # Color al presionar el botón
btn_perfiles._pressed_text_color = "white"  # Color del texto al presionar el botón
btn_perfiles.bind("<Button-1>", lambda e: on_button_click(btn_perfiles))


btn_cotizaciones = ctk.CTkButton(
    header, 
    text="COTIZACIONES", 
    fg_color="white",  
    text_color="black", 
    font=("Helvetica", 24),
    hover_color="#555555",
    corner_radius=20,
    border_color="black",
    border_width=2,
    command=cotizacionm_window
)
btn_cotizaciones.place(relx=0.5, rely=0.5, anchor=tk.CENTER)
btn_cotizaciones._original_fg_color = btn_cotizaciones.cget("fg_color")
btn_cotizaciones._original_text_color = btn_cotizaciones.cget("text_color")
btn_cotizaciones._pressed_color = "black"  # Color al presionar el botón
btn_cotizaciones._pressed_text_color = "white"  # Color del texto al presionar el botón
btn_cotizaciones.bind("<Button-1>", lambda e: on_button_click(btn_cotizaciones))

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
logo = ImageTk.PhotoImage(image)
lbl_logo = tk.Label(inicio, image=logo)
lbl_logo.place(x=0, y=60)
lbl_logo.image = logo

btn_salir = ctk.CTkButton(
    inicio, 
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

# Función para manejar el cierre de la ventana
def on_closing():
    inicio.destroy()  

inicio.protocol("WM_DELETE_WINDOW", on_closing)

inicio.mainloop()
