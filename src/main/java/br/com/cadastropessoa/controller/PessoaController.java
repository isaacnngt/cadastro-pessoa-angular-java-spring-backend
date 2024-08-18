package br.com.cadastropessoa.controller;

import br.com.cadastropessoa.entity.Pessoa;
import br.com.cadastropessoa.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pessoas")
@CrossOrigin(origins = "http://localhost:4200")
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @PostMapping
    public Pessoa cadastrarPessoa(@RequestBody Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    @GetMapping
    public List<Pessoa> listarPessoas() {
        return pessoaRepository.findAll();
    }
}