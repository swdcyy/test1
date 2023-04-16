package com.kuaishou.live.preview.container.data.a;
import qvb.f;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import qvb.n0;
import com.kuaishou.live.preview.container.data.LivePreviewResponse;
import qvb.a;
import java.lang.Throwable;
import java.util.Objects;
import o56.a;
import android.content.Context;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import t45.d;
import brd.z;
import bk3.c;
import bk3.b;
import cjd.e;
import erd.o;
import ak3.a;
import erd.g;

public class a extends f	// class@000d79
{
    public final String p;
    public final int q;

    public void a(int p0,String p1,List p2){
       super();
       this.q = p0;
       this.p = p1;
       if (!p2.isEmpty() && !PatchProxy.applyVoidOneRefs(p2, this, a.class, "3")) {
          LivePreviewResponse livePreviewR = this.L0();
          if (livePreviewR == null) {
             livePreviewR = new LivePreviewResponse();
             livePreviewR.mItems = p2;
          }
          this.S1(livePreviewR);
          this.b(p2);
       }
       return;
    }
    public static void h2(a p0,Throwable p1){
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoidOneRefs(p1, p0, a.class, "4")) {
       }else {
          ExceptionHandler.handleException(a.B, p1);
       }
       return;
    }
    public t I1(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.k2().subscribeOn(d.b).observeOn(d.a);
    }
    public boolean i(){
       return false;
    }
    public final String i2(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.K() && this.L0() != null) {
          objArray = this.L0().mCursor;
       }
       return objArray;
    }
    public final int j2(){
       a tq = this.q;
       if (tq == 6) {
          return 71;
       }
       if (tq == 7) {
          return 69;
       }
       if (tq != 8) {
          return 25;
       }
       return 70;
    }
    public final t k2(){
       a obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q;
       if (obj != 8 && (obj == 6 || obj == 7)) {
          return b.b().b(this.i2(), this.p, this.j2()).map(new e()).doOnError(new a(this));
       }
       return b.b().a(this.i2(), this.p, this.j2()).map(new e()).doOnError(new a(this));
    }
}
