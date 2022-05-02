package team.os.model;

public abstract class Core {
	// 전력 소모량  PCore = 3, ECore = 1 
	private int powerConsumption;
	// 작업량 PCore = 2, ECore = 1
	private int power;
	// 누적 전력 소모량
	private int accConsumption = 0;
	
	public int getPowerConsumption() {
		return powerConsumption;
	}
	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getAccConsumption() {
		return accConsumption;
	}
	public void setAccConsumption(int accConsumption) {
		this.accConsumption = accConsumption;
	}
}
