package webApps;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {
	
	@RequestMapping("/mostrarFormulario")
	public String mostrarFormulario(Model modelo) {
		
		Alumno alumnoX = new Alumno();
		
		modelo.addAttribute("estudianteX", alumnoX);
		
		return "formularioRegistroAlumno";
	}
	
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario(@ModelAttribute("estudianteX") Alumno alumnoXi) {
		return "confirmacionRegistroAlumno";
	}

}














/*

addAttribute(String attributeName, Object attributeValue)

<> alumnoX 
Representa a un parámetro de tipo objeto, ..así que es un objeto ...

<> estudianteX
Representa al nombre que representará al objeto

*/


