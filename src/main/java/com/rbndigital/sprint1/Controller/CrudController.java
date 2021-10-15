package com.rbndigital.sprint1.Controller;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.rbndigital.sprint1.Entidades.Votantes;
import com.rbndigital.sprint1.Servicios.CrudServicio;

@Controller
public class CrudController {
	
	@Autowired
	private CrudServicio crudservicio;
	

	@GetMapping("/votantes")
	public String visualizarVotantes(Model model) {
		model.addAttribute("votantes", new Votantes());
		try {
			List<Votantes> listaVotantes = crudservicio.findAll();
			
			model.addAttribute("votantes", listaVotantes);
		} catch (Exception e) {
			System.out.println("Error: " + e.getCause());
		}
		
		return "votantes";
	}

	@GetMapping("/nuevoVotante")
	public String addVotante(Model model) {
		model.addAttribute("votantes", new Votantes());
		return "/regVotantes";
	}
	@PostMapping("/saveVotantes")
	public String addVotantes(@Validated Votantes votantes) {
		crudservicio.save(votantes);
		return "redirect:/votantes";
	}

	@GetMapping("/modVotantes/{id}")
		public String Editar(@PathVariable int id,Model model){
			Optional<Votantes> votantes = crudservicio.findById(id);
			model.addAttribute("votantes",votantes.get());
			return "/modVotantes";
		}
	



	@RequestMapping("/index")
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	@RequestMapping("/estadisticas")
	public ModelAndView estadisticas() {
		return new ModelAndView("estadisticas");
	}
	@RequestMapping("/fajardo")
	public ModelAndView fajardo() {
		return new ModelAndView("fajardo");
	}
	@RequestMapping("/gaviria")
	public ModelAndView gaviria() {
		return new ModelAndView("gaviria");
	}
	@RequestMapping("/gutierrez")
	public ModelAndView gutierrez() {
		return new ModelAndView("gutierrez");
	}
	@RequestMapping("/mapa")
	public ModelAndView mapa() {
		return new ModelAndView("mapa");
	}
	@RequestMapping("/marquez")
	public ModelAndView marquez() {
		return new ModelAndView("marquez");
	}
	@RequestMapping("/petro")
	public ModelAndView petro() {
		return new ModelAndView("petro");
	}
	@RequestMapping("/registro")
	public ModelAndView registro() {
		return new ModelAndView("registro");
	}
	@RequestMapping("/Votación")
	public ModelAndView Votación() {
		return new ModelAndView("Votación");
	}
	@RequestMapping("/zuluaga")
	public ModelAndView zuluaga() {
		return new ModelAndView("zuluaga");
	}
	@RequestMapping("/acercaDe")
	public ModelAndView acercaDe() {
		return new ModelAndView("acercaDe");
	}

}
