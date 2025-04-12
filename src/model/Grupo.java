/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author iband
 */
public class Grupo {
  private int pkGrupo;
  private String tema;
  private String integrantes;

  public Grupo() {
  }

  public int getPkGrupo() {
    return pkGrupo;
  }

  public void setPkGrupo(int pkGrupo) {
    this.pkGrupo = pkGrupo;
  }

  public String getTema() {
    return tema;
  }

  public void setTema(String tema) {
    this.tema = tema;
  }

  public String getIntegrantes() {
    return integrantes;
  }

  public void setIntegrantes(String integrantes) {
    this.integrantes = integrantes;
  }
}
