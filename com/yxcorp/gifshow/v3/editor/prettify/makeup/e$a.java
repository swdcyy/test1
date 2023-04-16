package com.yxcorp.gifshow.v3.editor.prettify.makeup.e$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.editor.prettify.makeup.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Handler;
import vsc.i;
import xvc.e;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.Loader;
import java.util.List;
import java.util.Collections;
import kotlin.jvm.internal.a;
import xvc.l;
import java.util.Objects;
import lq.i;
import xvc.f;

public class e$a implements Runnable	// class@001197
{
    public final e b;

    public void e$a(e p0){
       this.b = p0;
       super();
    }
    public void run(){
       l a;
       String str = "1";
       if (PatchProxy.applyVoid(null, this, e$a.class, str)) {
          return;
       }
       this.b.r.removeCallbacks(this);
       if (this.b.t.b != null) {
          e uoe = new e();
          List list = Collections.singletonList(Loader.Makeup);
          if (!PatchProxy.applyVoidOneRefs(list, uoe, e.class, str)) {
             a.p(list, "<set-?>");
             uoe.a = list;
          }
          a = l.a;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidOneRefs(uoe, a, l.class, "2")) {
             a.p(uoe, "config");
             if (i.h()) {
                f uof = i.m().o();
                if (uof != null) {
                   f.h(uof, uoe, false, 2, null);
                }
             }
          }
       }else {
          l.a.a();
       }
    label_0066 :
       return;
    }
}
