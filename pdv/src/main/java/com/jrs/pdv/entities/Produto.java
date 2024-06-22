package com.jrs.pdv.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
public class Produto {
    @Id
    private Long id;

    private  String descricao;
    private String codigoDeBarras;


}
