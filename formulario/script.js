document.getElementById('contactForm').addEventListener('submit', function(event) {
    event.preventDefault();
    let valid = true;

    
    document.querySelectorAll('.error').forEach(function(error) {
        error.style.display = 'none';
    });

   
    const name = document.getElementById('name').value;
    if (name.trim() === '') {
        document.getElementById('nameError').textContent = 'El nombre es obligatorio';
        document.getElementById('nameError').style.display = 'block';
        valid = false;
    }

   
    const lastname = document.getElementById('lastname').value;
    if (lastname.trim() === '') {
        document.getElementById('lastnameError').textContent = 'El apellido es obligatorio';
        document.getElementById('lastnameError').style.display = 'block';
        valid = false;
    }

   
    const email = document.getElementById('email').value;
    if (email.trim() === '') {
        document.getElementById('emailError').textContent = 'El correo electrónico es obligatorio';
        document.getElementById('emailError').style.display = 'block';
        valid = false;
    } else if (!validateEmail(email)) {
        document.getElementById('emailError').textContent = 'El correo electrónico no es válido';
        document.getElementById('emailError').style.display = 'block';
        valid = false;
    }

   
    if (!document.querySelector('input[name="query"]:checked')) {
        document.getElementById('queryError').textContent = 'Seleccione un tipo de consulta';
        document.getElementById('queryError').style.display = 'block';
        valid = false;
    }

   
    const message = document.getElementById('message').value;
    if (message.trim() === '') {
        document.getElementById('messageError').textContent = 'El mensaje es obligatorio';
        document.getElementById('messageError').style.display = 'block';
        valid = false;
    }

    
    if (!document.getElementById('cbox1').checked) {
        document.getElementById('checkboxError').textContent = 'Debe aceptar los términos y condiciones';
        document.getElementById('checkboxError').style.display = 'block';
        valid = false;
    }

    
    if (valid) {
        alert('Formulario enviado con éxito');
    
    }
});

function validateEmail(email) {
    const re = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return re.test(email);
}
