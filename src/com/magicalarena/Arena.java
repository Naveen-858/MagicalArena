package com.magicalarena;

public class Arena {

	private Player playerA;
	private Player playerB;
	private Dice dice;

	public Arena(Player playerA, Player playerB) {
		this.playerA = playerA;
		this.playerB = playerB;
		this.dice = new Dice();
	}
	public void fight() {
		Player attacker = playerA.getHealth() < playerB.getHealth() ? playerA : playerB;
		Player defender = attacker == playerA ? playerB : playerA;

		while (attacker.isAlive() && defender.isAlive()) {
			takeTurn(attacker, defender);
			if (!defender.isAlive()) {
				System.out.println("Player " + (defender == playerA ? "A" : "B") + " is dead.");
				break;
			}
			Player temp = attacker;
			attacker = defender;
			defender = temp;
		}

		System.out.println("Game Over");
	}

	private void takeTurn(Player attacker, Player defender) {
		int attackRoll = dice.roll();
		int defenseRoll = dice.roll();
		int attackDamage = attacker.getAttack() * attackRoll;
		int defenseStrength = defender.getStrength() * defenseRoll;
		int damageToDefender = Math.max(0, attackDamage - defenseStrength);

		defender.reduceHealth(damageToDefender);

		System.out.println("Attacker rolls: " + attackRoll + " (damage: " + attackDamage + ")");
		System.out.println("Defender rolls: " + defenseRoll + " (defense: " + defenseStrength + ")");
		System.out.println("Defender takes damage: " + damageToDefender);
		System.out.println("Defender health: " + defender.getHealth());
	}




}