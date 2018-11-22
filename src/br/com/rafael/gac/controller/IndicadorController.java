package br.com.rafael.gac.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.rafael.gac.dao.IndicadorDao;

@Transactional
@Controller
public class IndicadorController {
	@Autowired
	IndicadorDao dao; //usa apenas a interface!	

}

