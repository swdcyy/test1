package com.yxcorp.gifshow.commercial.api.AdBusinessType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class AdBusinessType extends Enum	// class@001119
{
    public final int type;
    public static final AdBusinessType[] $VALUES;
    public static final AdBusinessType FESTIVAL_ACTIVITY;
    public static final AdBusinessType GENERAL_BUSINESS;
    public static final AdBusinessType MAIN_APPLETS;
    public static final AdBusinessType MAIN_GAME;
    public static final AdBusinessType MAIN_TASK;
    public static final AdBusinessType MAIN_TASK_BOX;
    public static final AdBusinessType NEBULA_APPLETS;
    public static final AdBusinessType NEBULA_COIN;
    public static final AdBusinessType NEBULA_EVERY_DAY_SIGN_IN;
    public static final AdBusinessType NEBULA_GAME;
    public static final AdBusinessType NEBULA_TASK_BOX;
    public static final AdBusinessType NEBULA_TASK_SIGN_IN;

    static {
       AdBusinessType[] uAdBusinessT = new AdBusinessType[12];
       AdBusinessType uAdBusinessT1 = new AdBusinessType("NEBULA_COIN", 0, -1);
       AdBusinessType.NEBULA_COIN = uAdBusinessT1;
       uAdBusinessT[0] = uAdBusinessT1;
       uAdBusinessT1 = new AdBusinessType("NEBULA_TASK_BOX", 1, -2);
       AdBusinessType.NEBULA_TASK_BOX = uAdBusinessT1;
       uAdBusinessT[1] = uAdBusinessT1;
       uAdBusinessT1 = new AdBusinessType("NEBULA_GAME", 2, -3);
       AdBusinessType.NEBULA_GAME = uAdBusinessT1;
       uAdBusinessT[2] = uAdBusinessT1;
       uAdBusinessT1 = new AdBusinessType("MAIN_GAME", 3, -4);
       AdBusinessType.MAIN_GAME = uAdBusinessT1;
       uAdBusinessT[3] = uAdBusinessT1;
       uAdBusinessT1 = new AdBusinessType("NEBULA_APPLETS", 4, -5);
       AdBusinessType.NEBULA_APPLETS = uAdBusinessT1;
       uAdBusinessT[4] = uAdBusinessT1;
       uAdBusinessT1 = new AdBusinessType("MAIN_APPLETS", 5, -6);
       AdBusinessType.MAIN_APPLETS = uAdBusinessT1;
       uAdBusinessT[5] = uAdBusinessT1;
       uAdBusinessT1 = new AdBusinessType("NEBULA_TASK_SIGN_IN", 6, -7);
       AdBusinessType.NEBULA_TASK_SIGN_IN = uAdBusinessT1;
       uAdBusinessT[6] = uAdBusinessT1;
       uAdBusinessT1 = new AdBusinessType("NEBULA_EVERY_DAY_SIGN_IN", 7, -8);
       AdBusinessType.NEBULA_EVERY_DAY_SIGN_IN = uAdBusinessT1;
       uAdBusinessT[7] = uAdBusinessT1;
       uAdBusinessT1 = new AdBusinessType("GENERAL_BUSINESS", 8, -9);
       AdBusinessType.GENERAL_BUSINESS = uAdBusinessT1;
       uAdBusinessT[8] = uAdBusinessT1;
       uAdBusinessT1 = new AdBusinessType("MAIN_TASK", 9, 1);
       AdBusinessType.MAIN_TASK = uAdBusinessT1;
       uAdBusinessT[9] = uAdBusinessT1;
       uAdBusinessT1 = new AdBusinessType("MAIN_TASK_BOX", 10, 2);
       AdBusinessType.MAIN_TASK_BOX = uAdBusinessT1;
       uAdBusinessT[10] = uAdBusinessT1;
       uAdBusinessT1 = new AdBusinessType("FESTIVAL_ACTIVITY", 11, 3);
       AdBusinessType.FESTIVAL_ACTIVITY = uAdBusinessT1;
       uAdBusinessT[11] = uAdBusinessT1;
       AdBusinessType.$VALUES = uAdBusinessT;
    }
    public void AdBusinessType(String p0,int p1,int p2){
       super(p0, p1);
       this.type = p2;
    }
    public static AdBusinessType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AdBusinessType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(AdBusinessType.class, p0);
    }
    public static AdBusinessType[] values(){
       Object obj = PatchProxy.apply(null, null, AdBusinessType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AdBusinessType.$VALUES.clone();
    }
    public final int getType(){
       return this.type;
    }
}
