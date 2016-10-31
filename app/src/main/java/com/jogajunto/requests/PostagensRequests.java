package com.jogajunto.requests;

import com.jogajunto.modelo.Quadra;

import java.util.List;

import feign.Param;
import feign.RequestLine;

/**
 * Created by aluno on 28/10/2016.
 */
public interface PostagensRequests {

    @RequestLine("GET /posts")
    List<Quadra> receberQuadras();

    @RequestLine("GET /posts/{id}")
    Quadra receberQuadra(@Param("id") Integer id);
}
