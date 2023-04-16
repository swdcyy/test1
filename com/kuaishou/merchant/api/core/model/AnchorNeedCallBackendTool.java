package com.kuaishou.merchant.api.core.model.AnchorNeedCallBackendTool;
import java.io.Serializable;
import java.lang.Object;

public class AnchorNeedCallBackendTool implements Serializable	// class@00150b
{
    public boolean switchOpen;
    public int type;
    public static final long serialVersionUID = 0xbf2ef319152594ef;

    public void AnchorNeedCallBackendTool(int p0,boolean p1){
       super();
       this.type = p0;
       this.switchOpen = p1;
    }
}
