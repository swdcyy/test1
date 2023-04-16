package com.yxcorp.gifshow.record.album.LocalAlbumUploadFragment$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.record.album.LocalAlbumUploadFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.DialogFragment;
import k8c.w0;
import android.view.View$OnClickListener;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import kotlin.jvm.internal.a;
import androidx.fragment.app.KwaiDialogFragment;
import o8c.i;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import java.util.Collection;
import o8c.k;
import o8c.j;
import o8c.k$a;
import com.kwai.framework.model.router.RouteType;
import t45.d;
import brd.z;
import com.yxcorp.retrofit.a;
import com.yxcorp.retrofit.e;
import o8c.c;
import java.util.Set;
import java.util.concurrent.Callable;
import o8c.d;
import erd.o;
import cjd.e;
import o8c.e;
import o8c.f;
import o8c.g;
import erd.a;
import o8c.h;
import k8c.x0;
import erd.g;
import k8c.y0;
import k8c.z0;
import k8c.a1;
import k8c.b1;
import k8c.c1;
import crd.b;
import crd.a;

public final class LocalAlbumUploadFragment$a extends m	// class@001704
{
    public final LocalAlbumUploadFragment c;

    public void LocalAlbumUploadFragment$a(LocalAlbumUploadFragment p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalAlbumUploadFragment$a.class, "1")) {
          return;
       }
       LocalAlbumUploadFragment$a tc = this.c;
       Objects.requireNonNull(tc);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tc, LocalAlbumUploadFragment.class, "7")) {
          ProgressFragment progressFrag = new ProgressFragment();
          tc.q = progressFrag;
          int i = 0;
          progressFrag.Fh(i, 100, true);
          LocalAlbumUploadFragment q = tc.q;
          if (q != null) {
             q.Ih(R.string.arg_RES_7f100add);
          }
          q = tc.q;
          if (q != null) {
             q.setCancelable(i);
          }
          q = tc.q;
          if (q != null) {
             q.vh(R.string.cancel);
          }
          q = tc.q;
          if (q != null) {
             q.xh(new w0(tc));
          }
          q = tc.q;
          if (q != null) {
             FragmentActivity activity = tc.getActivity();
             c supportFragm = (activity != null)? activity.getSupportFragmentManager(): objArray;
             a.m(supportFragm);
             q.show(supportFragm, "LocalAlbumUploadFragment");
          }
          q = tc.p;
          i c = i.c;
          LocalAlbumUploadFragment o = tc.o;
          Objects.requireNonNull(c);
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          t ot = PatchProxy.applyOneRefs(o, c, i.class, "1");
          if (ot != patchProxyRe) {
          }else {
             a.p(o, "projects");
             if (o.isEmpty()) {
                ot = t.just(objArray);
                a.o(ot, "Observable.just\(null\)");
             }else {
                k ok = k.class;
                _monitor_enter(ok);
                j oj = PatchProxy.apply(objArray, objArray, ok, "1");
                if (oj != patchProxyRe) {
                   _monitor_exit(ok);
                }else if(k.a == null){
                   k.a = e.b(new k$a(RouteType.API, d.b), j.class);
                }
                oj = k.a;
                _monitor_exit(ok);
                ot = t.fromCallable(new c(o)).flatMap(new d(oj)).map(new e()).map(e.b).flatMap(f.b).subscribeOn(d.c).doOnComplete(new g(oj)).doFinally(h.b);
                a.o(ot, "Observable.fromCallable ¡­CacheFilePath\)\)\n        }");
             }
          }
          q.c(ot.subscribeOn(d.c).observeOn(d.a).doOnNext(new x0(tc)).doOnComplete(new y0(tc)).doOnError(new z0(tc)).doOnDispose(new a1(tc)).subscribe(b1.b, c1.b));
       }
       return;
    }
}
