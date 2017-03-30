/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.LivrariaDao;
import dao.PessoaDao;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import modelo.Autor;
import modelo.Editora;
import modelo.Pessoa;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author DesenvolvedorJava
 */
@Controller("/primeiro")
public class PrimeiroControle {
    
    @RequestMapping(value="/index.htm", method = RequestMethod.GET)
    public String chamarIndex()
    {
        return "index";
    }
    
    @RequestMapping(value="/preparaCadastrarPessoa.htm", method = RequestMethod.GET)
    public String preparaCadastrarPessoa(@ModelAttribute("pessoa") Pessoa pessoa)
    {
        return "cadastroPessoa";
    }
    
    @RequestMapping(value="/cadastrarPessoa.htm", method = RequestMethod.POST)
    public String cadastrarPessoa(@ModelAttribute("pessoa") Pessoa pessoa)
    {
        PessoaDao dao = new PessoaDao();
        dao.cadastrarPessoa(pessoa);
        
        return "index";
    }
    
    @RequestMapping(value="/listarPessoa.htm", method = RequestMethod.GET)
    public String listarPessoa(HttpServletRequest req) {
        PessoaDao dao = new PessoaDao();
        List<Pessoa> lista = dao.listarPessoas();
        req.setAttribute("listaPessoas", lista);
        return "listaPessoas";
    }
    
    @RequestMapping(value="/preparaCadastrarAutor.htm", method = RequestMethod.GET)
    public String preparaCadastrarAutor(@ModelAttribute("autor") Autor autor) {
        
        return "cadastroAutor";
    }
    
    @RequestMapping(value="/preparaCadastrarEditora.htm", method = RequestMethod.GET)
    public String preparaCadastrarAutor(@ModelAttribute("editora") Editora editora) {
        
        return "cadastroEditora";
    }
    
    @RequestMapping(value="/cadastrarAutor.htm", method = RequestMethod.POST)
    public String cadastrarAutor(@ModelAttribute("autor") Autor autor) {
        
        new LivrariaDao().cadastrarAutor(autor);
        return "index";
    }
    
    @RequestMapping(value="/cadastrarEditora.htm", method = RequestMethod.POST)
    public String cadastrarEditora(@ModelAttribute("editora") Editora editora) {
        
        new LivrariaDao().cadastrarEditora(editora);
        return "index";
    }
    
    
}
