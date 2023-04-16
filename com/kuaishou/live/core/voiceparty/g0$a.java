package com.kuaishou.live.core.voiceparty.g0$a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;

public class g0$a	// class@0014f3
{
    public final int a;
    public final int b;
    public final View c;

    public void g0$a(int p0,int p1,View p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public boolean equals(Object p0){
       g0$a uoa = g0$a.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uoa, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || uoa != p0.getClass()) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       if (this.b != p0.b) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       return ((this.a * 31) + this.b);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, g0$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CoreUIFeatureChangeMessage{feature="+this.a+", featureBottom="+this.b+'}';
    }
}
