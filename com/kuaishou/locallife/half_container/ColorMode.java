package com.kuaishou.locallife.half_container.ColorMode;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ColorMode	// class@00148d
{
    public final String dark;
    public final String light;

    public void ColorMode(String p0,String p1){
       a.p(p0, "dark");
       a.p(p1, "light");
       super();
       this.dark = p0;
       this.light = p1;
    }
    public static ColorMode copy$default(ColorMode p0,String p1,String p2,int p3,Object p4){
       ColorMode dark;
       ColorMode light;
       if (p3 & 0x01) {
          dark = p0.dark;
       }
       if (p3 & 0x02) {
          light = p0.light;
       }
       return p0.copy(dark, light);
    }
    public final String component1(){
       return this.dark;
    }
    public final String component2(){
       return this.light;
    }
    public final ColorMode copy(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, ColorMode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "dark");
       a.p(p1, "light");
       return new ColorMode(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ColorMode.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof ColorMode && (a.g(this.dark, p0.dark) && a.g(this.light, p0.light)))) {
          return true;
       }
       return false;
    }
    public final String getDark(){
       return this.dark;
    }
    public final String getLight(){
       return this.light;
    }
    public int hashCode(){
       ColorMode obj = PatchProxy.apply(null, this, ColorMode.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.dark;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       ColorMode tlight = this.light;
       if (tlight != null) {
          i = tlight.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ColorMode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ColorMode\(dark="+this.dark+", light="+this.light+"\)";
    }
}
