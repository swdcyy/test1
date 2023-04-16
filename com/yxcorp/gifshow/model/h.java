package com.yxcorp.gifshow.model.h;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import crd.a;
import com.yxcorp.gifshow.model.h$a;
import com.yxcorp.gifshow.models.QMedia;
import brd.m;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;
import io.reactivex.subjects.SingleSubject;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import gq.a;
import q87.c;
import java.lang.IllegalArgumentException;
import brd.a0;
import elb.r;
import java.lang.Runnable;
import t45.c;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.model.g;
import erd.o;
import elb.p;
import elb.q;
import erd.g;
import crd.b;

public class h	// class@001ef4
{
    public final ConcurrentHashMap a;
    public SingleSubject b;
    public a c;

    public void h(){
       super();
       this.a = new ConcurrentHashMap();
       this.c = new a();
    }
    public static h a(){
       return h$a.a;
    }
    public m b(QMedia p0){
       h oh = h.class;
       SingleSubject obj = PatchProxy.applyOneRefs(p0, this, oh, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.c.isDisposed()) {
          RuntimeException runtimeExcep = new RuntimeException("MediaTrackAssetManager CompositeDisposable is disposed");
          i1.c(runtimeExcep);
          return m.l(runtimeExcep);
       }else {
          obj = SingleSubject.k0();
          QMedia path = p0.path;
          int i = 0;
          if (TextUtils.x(path)) {
             Object[] objArray = new Object[i];
             a.D().w("MediaTrackAssetManager", "getTrackAsset: error, empty media path", objArray);
             return m.l(new IllegalArgumentException("MediaTrackAssetManagergetTrackAsset: error, empty media path"));
          }else {
             SingleSubject singleSubjec = this.a.putIfAbsent(path, obj);
             if (singleSubjec != null) {
                return singleSubjec.c0();
             }
             if (this.b == null && !PatchProxy.applyVoid(null, this, oh, "2")) {
                this.b = SingleSubject.k0();
                c.a(new r(this));
             }
             Object[] objArray1 = new Object[i];
             a.D().w("MediaTrackAssetManager", "getTrackAsset, start open track asset, path = "+path, objArray1);
             this.c.c(this.b.c0().n(new g(path, p0)).y(new p(this, path), new q(this, path)));
             return obj.c0();
          }
       }
    }
}
