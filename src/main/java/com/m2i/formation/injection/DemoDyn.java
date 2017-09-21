package com.m2i.formation.injection;

import java.io.File;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class DemoDyn {

	private static final Logger l = Logger.getLogger(DemoDyn.class);

	// Injection de dépendances dynamique :
	public ScrumTeam scrumTeam() {
		ScrumTeam scrumTeam = new ScrumTeam();
		try {
			l.info("Entrée dans la méthode creatScrumTeam()");
			Scanner scanner = new Scanner(new File("config.txt"));
			String menberClassName = scanner.nextLine();
			l.info("menberClassName : " + menberClassName);
			Class cmember = Class.forName(menberClassName);
			l.info("cmember : " + cmember);
			ITeamMember member = (ITeamMember) cmember.newInstance();
			l.info(member.getMemberDatails()[0]);
			l.info(member.getMemberDatails()[1]);
			l.info(member.getMemberDatails()[2]);
		} catch (Exception e) {
			l.error("dans le catch" + e);
		}
		return scrumTeam;
	}

}
