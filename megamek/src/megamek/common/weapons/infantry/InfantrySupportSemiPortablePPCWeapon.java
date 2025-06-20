/**
 * MegaMek - Copyright (C) 2004,2005 Ben Mazur (bmazur@sev.org)
 *
 *  This program is free software; you can redistribute it and/or modify it
 *  under the terms of the GNU General Public License as published by the Free
 *  Software Foundation; either version 2 of the License, or (at your option)
 *  any later version.
 *
 *  This program is distributed in the hope that it will be useful, but
 *  WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 *  or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 *  for more details.
 */
/*
 * Created on Sep 7, 2005
 *
 */
package megamek.common.weapons.infantry;

import megamek.common.AmmoType;

/**
 * @author Ben Grills
 */
public class InfantrySupportSemiPortablePPCWeapon extends InfantryWeapon {

	/**
	 *
	 */
	private static final long serialVersionUID = -3164871600230559641L;

	public InfantrySupportSemiPortablePPCWeapon() {
		super();

		name = "Particle Cannon (Semi-Portable)";
		setInternalName(name);
		addLookupName("InfantrySemiPortablePPC");
		addLookupName("InfantryManPackPPC");
		addLookupName("Infantry Semi-Portable PPC");
		ammoType = AmmoType.AmmoTypeEnum.INFANTRY;
		cost = 7000;
		bv = 3.68;
		flags = flags.or(F_NO_FIRES).or(F_DIRECT_FIRE).or(F_ENERGY).or(F_PPC).or(F_INF_SUPPORT);
		infantryDamage = 0.72;
		infantryRange = 2;
		crew = 2;
		ammoWeight = 0.003;
		shots = 25;
		tonnage = .040;
		rulesRefs = "273, TM";
		techAdvancement.setTechBase(TechBase.ALL).setISAdvancement(2430, 2436, 2450, DATE_NONE, DATE_NONE)
		        .setISApproximate(true, false, false, false, false)
		        .setClanAdvancement(2430, 2436, 2450, DATE_NONE, DATE_NONE)
		        .setClanApproximate(true, false, false, false, false).setPrototypeFactions(Faction.DC)
		        .setProductionFactions(Faction.DC).setTechRating(TechRating.E)
		        .setAvailability(AvailabilityValue.D, AvailabilityValue.E, AvailabilityValue.D, AvailabilityValue.C);

	}
}
