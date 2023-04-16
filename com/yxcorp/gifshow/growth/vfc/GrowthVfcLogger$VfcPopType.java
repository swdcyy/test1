package com.yxcorp.gifshow.growth.vfc.GrowthVfcLogger$VfcPopType;
import java.lang.Enum;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class GrowthVfcLogger$VfcPopType extends Enum	// class@0015a4
{
    public String key;
    public final int type;
    public static final GrowthVfcLogger$VfcPopType[] $VALUES;
    public static final GrowthVfcLogger$VfcPopType TYPE1;
    public static final GrowthVfcLogger$VfcPopType TYPE4;

    static {
       GrowthVfcLogger$VfcPopType vfcPopType;
       GrowthVfcLogger$VfcPopType[] vfcPopTypeAr = new GrowthVfcLogger$VfcPopType[]{v8,vfcPopType};
       vfcPopType = new GrowthVfcLogger$VfcPopType("TYPE1", 0, 1, null, 2, null);
       GrowthVfcLogger$VfcPopType.TYPE1 = v8;
       GrowthVfcLogger$VfcPopType vfcPopType1 = new GrowthVfcLogger$VfcPopType("TYPE4", 1, 4, null, 2, null);
       GrowthVfcLogger$VfcPopType.TYPE4 = vfcPopType;
       GrowthVfcLogger$VfcPopType.$VALUES = vfcPopTypeAr;
    }
    public void GrowthVfcLogger$VfcPopType(String p0,int p1,int p2,String p3){
       super(p0, p1);
       this.type = p2;
       this.key = p3;
    }
    public void GrowthVfcLogger$VfcPopType(String p0,int p1,int p2,String p3,int p4,u p5){
       if (p4 & 0x02) {
          p3 = "pop_type";
       }
       super(p0, p1, p2, p3);
       return;
    }
    public static GrowthVfcLogger$VfcPopType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, GrowthVfcLogger$VfcPopType.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(GrowthVfcLogger$VfcPopType.class, p0);
    }
    public static GrowthVfcLogger$VfcPopType[] values(){
       Object obj = PatchProxy.apply(null, null, GrowthVfcLogger$VfcPopType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GrowthVfcLogger$VfcPopType.$VALUES.clone();
    }
    public final String getKey(){
       return this.key;
    }
    public final int getType(){
       return this.type;
    }
    public final void setKey(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthVfcLogger$VfcPopType.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.key = p0;
       return;
    }
}
