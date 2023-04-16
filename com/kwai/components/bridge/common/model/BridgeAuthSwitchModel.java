package com.kwai.components.bridge.common.model.BridgeAuthSwitchModel;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;

public class BridgeAuthSwitchModel implements Serializable	// class@000c08
{
    public List mBridges;
    public static final long serialVersionUID = 0xcbe5d9eadeb83e91;

    public void BridgeAuthSwitchModel(){
       super();
       this.mBridges = new ArrayList();
    }
}
