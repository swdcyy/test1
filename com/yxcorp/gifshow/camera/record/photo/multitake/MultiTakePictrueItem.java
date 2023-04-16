package com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictrueItem;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictrueItem$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictrueItem$score$2;
import msd.a;
import qrd.p;
import qrd.s;
import io.reactivex.subjects.SingleSubject;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class MultiTakePictrueItem	// class@000ecb
{
    public int a;
    public final p b;
    public boolean c;
    public String d;
    public final int e;
    public final int f;
    public final int g;
    public static final MultiTakePictrueItem$a h;

    static {
       MultiTakePictrueItem.h = new MultiTakePictrueItem$a(null);
    }
    public void MultiTakePictrueItem(String p0,int p1,int p2,int p3){
       a.p(p0, "path");
       super();
       this.d = p0;
       this.e = p1;
       this.f = p2;
       this.g = p3;
       this.a = -1;
       this.b = s.c(MultiTakePictrueItem$score$2.INSTANCE);
    }
    public final int a(){
       return this.g;
    }
    public final int b(){
       return this.a;
    }
    public final String c(){
       return this.d;
    }
    public final boolean d(){
       return this.c;
    }
    public final SingleSubject e(){
       Object obj = PatchProxy.apply(null, this, MultiTakePictrueItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MultiTakePictrueItem.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof MultiTakePictrueItem && (a.g(this.d, p0.d) && (this.e == p0.e && (this.f == p0.f && this.g == p0.g))))) {
          return true;
       }
       return false;
    }
    public final boolean f(){
       boolean b = (this.a != -1)? true: false;
       return b;
    }
    public final int g(){
       return this.f;
    }
    public final void h(int p0){
       this.a = p0;
    }
    public int hashCode(){
       MultiTakePictrueItem obj = PatchProxy.apply(null, this, MultiTakePictrueItem.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.d;
       int i = (obj != null)? obj.hashCode(): 0;
       return ((((((i * 31) + this.e) * 31) + this.f) * 31) + this.g);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MultiTakePictrueItem.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MultiTakePictrueItem\(path="+this.d+", rotation="+this.e+", width="+this.f+", height="+this.g+"\)";
    }
}
