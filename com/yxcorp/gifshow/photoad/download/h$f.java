package com.yxcorp.gifshow.photoad.download.h$f;
import android.os.FileObserver;
import com.yxcorp.gifshow.photoad.download.h;
import android.os.Environment;
import java.lang.String;
import java.io.File;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import nxb.y;
import java.util.concurrent.Callable;
import brd.z;
import t45.d;
import erd.o;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;

public class h$f extends FileObserver	// class@000f85
{
    public final h a;

    public void h$f(h p0){
       this.a = p0;
       super(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath());
    }
    public void onEvent(int p0,String p1){
       if (PatchProxy.isSupport(h$f.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, h$f.class, "1")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       if (p0 == 512) {
          h$f ta = this.a;
          Objects.requireNonNull(ta);
          t ot = PatchProxy.applyOneRefs(p1, ta, h.class, "29");
          if (ot != PatchProxyResult.class) {
          }else {
             ot = t.fromCallable(new y(ta, p1)).subscribeOn(ta.b).observeOn(d.a).map(ta.h);
          }
          ot.subscribe(Functions.d(), Functions.d());
       }
       return;
    }
}
