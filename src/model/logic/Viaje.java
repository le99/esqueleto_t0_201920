package model.logic;

public class Viaje 
{
	//Atributos
	
	private int sourceID;
	
	private int dstID;
	
	private int month;
	
	private int meanTravelTime;
	
	private int standardDeviationTravelTime;
	
	private int geometricMeanTravelTime;
	
	private int geometricStandardDeviationTravelTime;
	
	//Constructor
	
	public Viaje (int p1, int p2, int p3, int p4, int p5, int p6, int p7)
	{
		sourceID=p1;
		dstID=p2;
		month=p3;
		meanTravelTime=p4;
		standardDeviationTravelTime=p5;
		geometricMeanTravelTime=p6;
		geometricStandardDeviationTravelTime=p7;
	}

	
	
	//Métodos
	
	public int getSourceID() {
		return sourceID;
	}

	public void setSourceID(int sourceID) {
		this.sourceID = sourceID;
	}

	public int getDstID() {
		return dstID;
	}

	public void setDstID(int dstID) {
		this.dstID = dstID;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getMeanTravelTime() {
		return meanTravelTime;
	}

	public void setMeanTravelTime(int meanTravelTime) {
		this.meanTravelTime = meanTravelTime;
	}

	public int getStandardDeviationTravelTime() {
		return standardDeviationTravelTime;
	}

	public void setStandardDeviationTravelTime(int standardDeviationTravelTime) {
		this.standardDeviationTravelTime = standardDeviationTravelTime;
	}

	public int getGeometricMeanTravelTime() {
		return geometricMeanTravelTime;
	}

	public void setGeometricMeanTravelTime(int geometricMeanTravelTime) {
		this.geometricMeanTravelTime = geometricMeanTravelTime;
	}

	public int getGeometricStandardDeviationTravelTime() {
		return geometricStandardDeviationTravelTime;
	}

	public void setGeometricStandardDeviationTravelTime(int geometricStandardDeviationTravelTime) {
		this.geometricStandardDeviationTravelTime = geometricStandardDeviationTravelTime;
	}
	
	
	
	
	
	
}
