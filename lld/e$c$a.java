package lld.e$c$a;
import erd.a;
import lld.e$c;
import maa.a;
import lnc.d1;
import lnc.d1$a;
import java.lang.Integer;
import com.kuaishou.edit.draft.Asset;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import java.io.File;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.edit.draft.model.c;
import rld.d;
import lnc.d1$c;
import kotlin.jvm.internal.a;
import nld.a;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Asset$b;
import com.kuaishou.edit.draft.CropOptions;
import lld.e;
import lld.e$c$a$a;
import t36.f$a;
import t36.f;
import voc.t;
import android.util.LruCache;
import android.graphics.Bitmap;

public final class e$c$a implements a	// class@001c48
{
    public final e$c b;
    public final a c;
    public final d1 d;
    public final d1$a e;
    public final Integer f;
    public final Asset g;
    public final Size h;
    public final File i;

    public void e$c$a(e$c p0,a p1,d1 p2,d1$a p3,Integer p4,Asset p5,Size p6,File p7){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = p7;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, e$c$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("CropPicTemplateProcessor", "apply: crop done", objArray);
       if (!this.c.D()) {
          return;
       }
       d1$c uoc = this.d.d(this.e);
       a.m(uoc);
       a uoa = d.a.a(uoc);
       Asset$b uob = this.c.n(this.f.intValue());
       uob.q(this.c.Q(uoa.b()));
       uob.h(uoa.a());
       this.b.a.c.s0(new e$c$a$a(this, uob, uoa));
       t ot = t.a();
       String path = this.i.getPath();
       String str = uoa.b();
       _monitor_enter(ot);
       if (PatchProxy.applyVoidTwoRefs(path, str, ot, t.class, "2")) {
          _monitor_exit(ot);
       }else {
          Bitmap uBitmap = ot.a.get(path);
          if (uBitmap != null) {
             ot.c(str, uBitmap);
          }
          _monitor_exit(ot);
       }
       return;
    }
}
