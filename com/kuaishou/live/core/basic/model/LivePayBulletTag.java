package com.kuaishou.live.core.basic.model.LivePayBulletTag;
import java.io.Serializable;
import com.kuaishou.live.core.basic.model.LivePayBulletTag$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LivePayBulletTag implements Serializable	// class@00087c
{
    public final String backgroundColor;
    public final String text;
    public final String textColor;
    public static final LivePayBulletTag$a Companion;
    public static final long serialVersionUID;

    static {
       LivePayBulletTag.Companion = new LivePayBulletTag$a(null);
    }
    public void LivePayBulletTag(String p0,String p1,String p2){
       a.p(p0, "backgroundColor");
       a.p(p1, "text");
       a.p(p2, "textColor");
       super();
       this.backgroundColor = p0;
       this.text = p1;
       this.textColor = p2;
    }
    public static LivePayBulletTag copy$default(LivePayBulletTag p0,String p1,String p2,String p3,int p4,Object p5){
       LivePayBulletTag backgroundCo;
       LivePayBulletTag text;
       LivePayBulletTag textColor;
       if (p4 & 0x01) {
          backgroundCo = p0.backgroundColor;
       }
       if (p4 & 0x02) {
          text = p0.text;
       }
       if (p4 & 0x04) {
          textColor = p0.textColor;
       }
       return p0.copy(backgroundCo, text, textColor);
    }
    public final String component1(){
       return this.backgroundColor;
    }
    public final String component2(){
       return this.text;
    }
    public final String component3(){
       return this.textColor;
    }
    public final LivePayBulletTag copy(String p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LivePayBulletTag.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "backgroundColor");
       a.p(p1, "text");
       a.p(p2, "textColor");
       return new LivePayBulletTag(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LivePayBulletTag.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LivePayBulletTag && (a.g(this.backgroundColor, p0.backgroundColor) && (a.g(this.text, p0.text) && a.g(this.textColor, p0.textColor))))) {
          return true;
       }
       return false;
    }
    public final String getBackgroundColor(){
       return this.backgroundColor;
    }
    public final String getText(){
       return this.text;
    }
    public final String getTextColor(){
       return this.textColor;
    }
    public int hashCode(){
       LivePayBulletTag obj = PatchProxy.apply(null, this, LivePayBulletTag.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.backgroundColor;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LivePayBulletTag ttext = this.text;
       int i2 = (ttext != null)? ttext.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttext = this.textColor;
       if (ttext != null) {
          i = ttext.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LivePayBulletTag.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LivePayBulletTag\(backgroundColor="+this.backgroundColor+", text="+this.text+", textColor="+this.textColor+"\)";
    }
}
