package controllers;

import models.FuncionarioModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import services.FuncionarioServices;

public class SecuriyConfig {


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping(path = "/funcionarios")
    public class FuncionarioController {

        @Autowired
        private FuncionarioServices funcionarioServices;

        @GetMapping
        public ResponseEntity<List<FuncionarioModel>> findAll(){
            List<FuncionarioModel> response = FuncionarioServices.findAll();
            return ResponseEntity.ok().body(response);
        }

        @PostMapping
        public ResponseEntity<FuncionarioModel> (@RequestBody FuncionarioModel  funcionariosModel){
            FuncionarioModel response = FuncionarioServices.(funcionarioModel);
            return ResponseEntity.ok().body(response);
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<?> deletarId( @PathVariable Long id){
            FuncionarioServices.deletarfuncionario (id);
            return ResponseEntity.noContent().build();
        }

        @PutMapping("/{id}")
        public ResponseEntity<FuncionarioModel>(@PathVariable Long id, @RequestBody FuncionarioModel padariaModel) {
            FuncionarioModel response = FuncionarioServices.(id, FuncionarioModel);
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
        }

        @GetMapping("/{id}")
        public ResponseEntity<FuncionarioModel> buscarId(@PathVariable Long id){
            FuncionarioModel response = FuncionariosServices.buscarPorId(id);
            return ResponseEntity.ok().body(response);
        }



    }

}
