package com.tudresden.tropos.manufacturing;

public class ManufacturingInfo {
	
    public ManufacturingInfo(float maxPriceForBargain, float minInventoryLevelForBargain) {
		super();
		this.maxPriceForBargain = maxPriceForBargain;
		this.minInventoryLevelForBargain = minInventoryLevelForBargain;
	}
    
	public float maxPriceForBargain;
	  public float minInventoryLevelForBargain;
	  private static final long serialVersionUID = -4333298041938820117L;
}
