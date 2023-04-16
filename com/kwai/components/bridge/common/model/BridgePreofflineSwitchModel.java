package com.kwai.components.bridge.common.model.BridgePreofflineSwitchModel;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;

public class BridgePreofflineSwitchModel implements Serializable	// class@000c09
{
    public List mExpiredBcBridges;
    public List mExpiredRnBridges;
    public static final long serialVersionUID = 0x9ccc2eb2a5c406cc;

    public void BridgePreofflineSwitchModel(){
       super();
       this.mExpiredRnBridges = new ArrayList();
       this.mExpiredBcBridges = new ArrayList();
    }
}
