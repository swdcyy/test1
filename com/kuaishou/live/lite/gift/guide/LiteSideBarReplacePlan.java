package com.kuaishou.live.lite.gift.guide.LiteSideBarReplacePlan;
import java.io.Serializable;
import java.lang.Object;

public class LiteSideBarReplacePlan implements Serializable	// class@000994
{
    public int mLiteSideBarReplacePlan;
    public static final long serialVersionUID = 0x4f0a5d916457b05d;

    public void LiteSideBarReplacePlan(){
       super();
    }
    public static boolean isValidReplacePlan(int p0){
       int i = 1;
       if (p0 == i || (p0 == 2 || (p0 != 3 && p0 != 4))) {
          i = false;
       }
    label_000e :
       return i;
    }
}
