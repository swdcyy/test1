package eub.n$a;
import r26.d;
import eub.n;
import brd.v;
import java.lang.Object;
import com.yxcorp.gifshow.postwork.PostStatus;
import r26.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import kotlin.jvm.internal.a;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import kotlin.Pair;
import java.lang.Math;
import java.lang.Double;
import g6c.m;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.b$a;
import y26.b$a;
import nsd.u;
import brd.g;
import eub.i$e;
import eub.i;
import eub.j;
import java.lang.Enum;
import tkd.b;
import tkd.d;
import f0c.t;
import com.yxcorp.gifshow.postwork.a;
import r26.e;
import java.lang.RuntimeException;
import java.lang.Throwable;

public final class n$a implements d	// class@00282e
{
    public PostStatus b;
    public final n c;
    public final v d;

    public void n$a(n p0,v p1){
       this.c = p0;
       this.d = p1;
       super();
       this.b = PostStatus.ENCODE_PENDING;
    }
    public void V4(float p0,a p1){
       n$a uoa = n$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), p1, this, uoa, "2")) {
          return;
       }
       a.p(p1, "postWorkInfo");
       Object[] objArray = new Object[0];
       a.D().s("EditPageNoUiPublishStageImpl", "upload onProgressChanged "+p0, objArray);
       m om = new m(null, null, this.b, p1, null, 19, null);
       this.d.onNext(new Pair(Double.valueOf(Math.min(99.00f, 100.00f)), v10));
       return;
    }
    public void w9(PostStatus p0,a p1){
       Object[] objArray;
       b uob;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, n$a.class, "1")) {
          return;
       }
       a.p(p0, "status");
       a.p(p1, "postWorkInfo");
       if (p1.getId() != this.c.b.b.d) {
          return;
       }
       this.b = p0;
       int i = j.a[p0.ordinal()];
       int i1 = 0;
       String str = "EditPageNoUiPublishStageImpl";
       if (i != 1 && i != 2) {
          if (i != 3 && i != 4) {
             if (i != 5) {
                objArray = new Object[i1];
                a.D().w(str, "upload status:"+this.b, objArray);
             }else {
                Object[] objArray1 = new Object[i1];
                a.D().w(str, "upload complete postWorkInfo:"+p1, objArray1);
                m om = new m(null, null, this.b, p1, null, 19, null);
                this.d.onNext(new Pair(Double.valueOf(100.00f), v12));
                this.d.onComplete();
                uob = d.a(-273232199);
                a.o(uob, "PluginManager.get\(PostWo¡­ternalPlugin::class.java\)");
                uob.a20().K3(this.c.b.b.e);
             }
          }else {
             this.d.onError(new RuntimeException("upload failed status:"+this.b));
             uob = d.a(-273232199);
             a.o(uob, "PluginManager.get\(PostWo¡­ternalPlugin::class.java\)");
             uob.a20().K3(this.c.b.b.e);
          }
       }else {
          objArray = new Object[i1];
          a.D().w(str, "upload cancel status:"+this.b, objArray);
          uob = d.a(-273232199);
          a.o(uob, "PluginManager.get\(PostWo¡­ternalPlugin::class.java\)");
          uob.a20().K3(this.c.b.b.e);
       }
       return;
    }
}
