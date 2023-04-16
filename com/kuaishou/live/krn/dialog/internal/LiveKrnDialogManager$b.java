package com.kuaishou.live.krn.dialog.internal.LiveKrnDialogManager$b;
import java.lang.Comparable;
import android.net.Uri;
import com.kuaishou.livestream.message.nano.LiveCommonRoutePopupStrategy;
import s63.s;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.StringBuilder;

public final class LiveKrnDialogManager$b implements Comparable	// class@001d59
{
    public final Uri b;
    public final LiveCommonRoutePopupStrategy c;
    public final s d;
    public final a e;

    public void LiveKrnDialogManager$b(Uri p0,LiveCommonRoutePopupStrategy p1,s p2,a p3){
       a.p(p0, "uri");
       a.p(p1, "strategy");
       a.p(p2, "lazyKrnPage");
       a.p(p3, "showDialogCallback");
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final LiveCommonRoutePopupStrategy a(){
       return this.c;
    }
    public final Uri b(){
       return this.b;
    }
    public int compareTo(Object p0){
       int i;
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveKrnDialogManager$b.class, "1");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          a.p(p0, "other");
          i = p0.c.pendingStrategy - this.c.pendingStrategy;
       }
       return i;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveKrnDialogManager$b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveKrnDialogManager$b && (a.g(this.b, p0.b) && (a.g(this.c, p0.c) && (a.g(this.d, p0.d) && a.g(this.e, p0.e)))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveKrnDialogManager$b obj = PatchProxy.apply(null, this, LiveKrnDialogManager$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.b;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveKrnDialogManager$b tc = this.c;
       int i2 = (tc != null)? tc.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tc = this.d;
       i2 = (tc != null)? tc.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tc = this.e;
       if (tc != null) {
          i = tc.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveKrnDialogManager$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PendingDialog\(uri="+this.b+", strategy="+this.c+", lazyKrnPage="+this.d+", showDialogCallback="+this.e+"\)";
    }
}
