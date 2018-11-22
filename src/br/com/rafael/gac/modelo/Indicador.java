package br.com.rafael.gac.modelo;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Indicador {
	@Id
	@GeneratedValue
	private Long cd_in;
	@Size(min = 5)
	private String nm_in;
	@DateTimeFormat(pattern="dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Calendar dt_incl;
	
	public Long getCd_in() {
		return cd_in;
	}
	public void setCd_in(Long cd_in) {
		this.cd_in = cd_in;
	}
	public String getNm_in() {
		return nm_in;
	}
	public void setNm_in(String nm_in) {
		this.nm_in = nm_in;
	}
	public Calendar getDt_incl() {
		return dt_incl;
	}
	public void setDt_incl(Calendar dt_incl) {
		this.dt_incl = dt_incl;
	}	
	
}
