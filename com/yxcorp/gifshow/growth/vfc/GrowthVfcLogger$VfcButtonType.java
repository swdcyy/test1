package com.yxcorp.gifshow.growth.vfc.GrowthVfcLogger$VfcButtonType;
import java.lang.Enum;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class GrowthVfcLogger$VfcButtonType extends Enum	// class@0015a3
{
    public String key;
    public final String type;
    public static final GrowthVfcLogger$VfcButtonType[] $VALUES;
    public static final GrowthVfcLogger$VfcButtonType ADD_BUTTON;
    public static final GrowthVfcLogger$VfcButtonType MAIN_BUTTON;
    public static final GrowthVfcLogger$VfcButtonType RULE;
    public static final GrowthVfcLogger$VfcButtonType SUB_BUTTON;
    public static final GrowthVfcLogger$VfcButtonType X_CLOSE_BUTTON;

    static {
       GrowthVfcLogger$VfcButtonType vfcButtonTyp1;
       GrowthVfcLogger$VfcButtonType[] vfcButtonTyp = new GrowthVfcLogger$VfcButtonType[]{v8,vfcButtonTyp1,vfcButtonTyp1,vfcButtonTyp1,vfcButtonTyp1};
       vfcButtonTyp1 = new GrowthVfcLogger$VfcButtonType("MAIN_BUTTON", 0, "MAIN_BUTTON", null, 2, null);
       GrowthVfcLogger$VfcButtonType.MAIN_BUTTON = v8;
       GrowthVfcLogger$VfcButtonType vfcButtonTyp2 = new GrowthVfcLogger$VfcButtonType("X_CLOSE_BUTTON", 1, "X_CLOSE_BUTTON", null, 2, null);
       GrowthVfcLogger$VfcButtonType.X_CLOSE_BUTTON = vfcButtonTyp1;
       GrowthVfcLogger$VfcButtonType vfcButtonTyp3 = new GrowthVfcLogger$VfcButtonType("ADD_BUTTON", 2, "ADD_BUTTON", null, 2, null);
       GrowthVfcLogger$VfcButtonType.ADD_BUTTON = vfcButtonTyp1;
       vfcButtonTyp3 = new GrowthVfcLogger$VfcButtonType("RULE", 3, "RULE", null, 2, null);
       GrowthVfcLogger$VfcButtonType.RULE = vfcButtonTyp1;
       vfcButtonTyp3 = new GrowthVfcLogger$VfcButtonType("SUB_BUTTON", 4, "SUB_BUTTON", null, 2, null);
       GrowthVfcLogger$VfcButtonType.SUB_BUTTON = vfcButtonTyp1;
       GrowthVfcLogger$VfcButtonType.$VALUES = vfcButtonTyp;
    }
    public void GrowthVfcLogger$VfcButtonType(String p0,int p1,String p2,String p3){
       super(p0, p1);
       this.type = p2;
       this.key = p3;
    }
    public void GrowthVfcLogger$VfcButtonType(String p0,int p1,String p2,String p3,int p4,u p5){
       if (p4 & 0x02) {
          p3 = "button";
       }
       super(p0, p1, p2, p3);
       return;
    }
    public static GrowthVfcLogger$VfcButtonType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, GrowthVfcLogger$VfcButtonType.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(GrowthVfcLogger$VfcButtonType.class, p0);
    }
    public static GrowthVfcLogger$VfcButtonType[] values(){
       Object obj = PatchProxy.apply(null, null, GrowthVfcLogger$VfcButtonType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GrowthVfcLogger$VfcButtonType.$VALUES.clone();
    }
    public final String getKey(){
       return this.key;
    }
    public final String getType(){
       return this.type;
    }
    public final void setKey(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthVfcLogger$VfcButtonType.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.key = p0;
       return;
    }
}
