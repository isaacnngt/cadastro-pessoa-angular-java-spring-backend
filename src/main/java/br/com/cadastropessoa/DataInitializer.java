package br.com.cadastropessoa;

import br.com.cadastropessoa.entity.Pessoa;
import br.com.cadastropessoa.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Override
    public void run(String... args) throws Exception {
        pessoaRepository.save(new Pessoa("João"));
        pessoaRepository.save(new Pessoa("Maria"));
        pessoaRepository.save(new Pessoa("Pedro"));
    }
}
