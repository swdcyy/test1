package com.kwai.social.startup.local.model.DarkLightModel;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import zf6.k;
import java.lang.Number;
import java.lang.StringBuilder;

public final class DarkLightModel implements Serializable	// class@0018ab
{
    public final String mDark;
    public final String mLight;

    public void DarkLightModel(String p0,String p1){
       a.p(p0, "mLight");
       a.p(p1, "mDark");
       super();
       this.mLight = p0;
       this.mDark = p1;
    }
    public static DarkLightModel copy$default(DarkLightModel p0,String p1,String p2,int p3,Object p4){
       DarkLightModel mLight;
       DarkLightModel mDark;
       if (p3 & 0x01) {
          mLight = p0.mLight;
       }
       if (p3 & 0x02) {
          mDark = p0.mDark;
       }
       return p0.copy(mLight, mDark);
    }
    public final String component1(){
       return this.mLight;
    }
    public final String component2(){
       return this.mDark;
    }
    public final DarkLightModel copy(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, DarkLightModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "mLight");
       a.p(p1, "mDark");
       return new DarkLightModel(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DarkLightModel.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof DarkLightModel && (a.g(this.mLight, p0.mLight) && a.g(this.mDark, p0.mDark)))) {
          return true;
       }
       return false;
    }
    public final String getMDark(){
       return this.mDark;
    }
    public final String getMLight(){
       return this.mLight;
    }
    public final String getMUrl(){
       DarkLightModel obj = PatchProxy.apply(null, this, DarkLightModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (k.d())? this.mDark: this.mLight;
       return obj;
    }
    public int hashCode(){
       DarkLightModel obj = PatchProxy.apply(null, this, DarkLightModel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mLight;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       DarkLightModel tmDark = this.mDark;
       if (tmDark != null) {
          i = tmDark.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, DarkLightModel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DarkLightModel\(mLight="+this.mLight+", mDark="+this.mDark+"\)";
    }
}
