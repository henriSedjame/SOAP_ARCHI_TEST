package com.shj.formation.soa;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.time.Year;

@WebService(serviceName = "LifeLeft")
public class LifeLeftService {

  private static final Integer ESPERANCE_VIE_HOMMES = 79;
  private static final Integer ESPERANCE_VIE_FEMMES = 85;
  private Integer evDeReference = 0;
  private String homme = "homme";
  private String femme = "femme";

  @WebMethod
  public String anneeRestantesAVivre(String prenom, String sexe, Integer anneeNaissance) {

    if (sexe.equalsIgnoreCase(homme)) evDeReference = ESPERANCE_VIE_HOMMES;
    else if (sexe.equalsIgnoreCase(femme)) evDeReference = ESPERANCE_VIE_FEMMES;

    //Remarque, en cas de problème, vous pouvez changer Year.now().getValue() par Calendar.getInstance().get(Calendar.YEAR)
    Integer anneeRestantes = evDeReference - (Year.now().getValue() - anneeNaissance);

    return "Bonjour " + prenom + ", il vous reste " + anneeRestantes + " ans à vivre, profitez-en au maximum !";
  }

}

