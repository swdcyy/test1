package com.kuaishou.utils.SnowAudioMuteManager$a;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class SnowAudioMuteManager$a	// class@001190
{
    public final String a;
    public final boolean b;

    public void SnowAudioMuteManager$a(String p0,boolean p1){
       a.p(p0, "bizKey");
       super();
       this.a = p0;
       this.b = p1;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SnowAudioMuteManager$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof SnowAudioMuteManager$a) {
          return false;
       }
       return (this.a).equals(p0.a);
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, SnowAudioMuteManager$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (this.a).hashCode() * 31;
       int i1 = (this.b != null)? 1231: 1237;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SnowAudioMuteManager$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "bizKey: "+this.a+", fillComfortableNoise:"+this.b;
    }
}
