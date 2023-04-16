package com.yxcorp.gifshow.v3.editor.sticker.f0$a;
import com.yxcorp.gifshow.util.PostBaseResourceDownloadHelper$a;
import com.yxcorp.gifshow.v3.editor.sticker.f0;
import java.lang.Object;
import com.yxcorp.gifshow.util.PostBaseResourceDownloadHelper$InfoWithResource;
import java.lang.String;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import itc.l1;
import java.util.Objects;
import itc.j1;
import java.util.concurrent.Callable;
import brd.a0;
import t45.d;
import brd.z;
import erd.a;
import com.kwai.performance.stability.crash.monitor.util.a;
import com.yxcorp.gifshow.v3.editor.sticker.e0;
import erd.g;
import crd.b;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Integer;
import java.lang.Throwable;

public class f0$a implements PostBaseResourceDownloadHelper$a	// class@001247
{
    public final PostBaseResourceDownloadHelper$a a;
    public final f0 b;

    public void f0$a(f0 p0,PostBaseResourceDownloadHelper$a p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(PostBaseResourceDownloadHelper$InfoWithResource p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f0$a.class, "3")) {
       }else {
          f0$a tb = this.b;
          l1 ol1 = new l1(this.a, p0, p1);
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidTwoRefs(p0, ol1, tb, f0.class, "2")) {
             a0.y(new j1(p0)).T(d.c).G(d.a).m(ol1).R(a.b, e0.b);
          }
          Object[] objArray = new Object[0];
          a.D().w("StickerDownloadHelper", "download complete stickerDetailInfo:"+p0, objArray);
       }
       return;
    }
    public void b(PostBaseResourceDownloadHelper$InfoWithResource p0,int p1,int p2){
       if (!PatchProxy.isSupport(f0$a.class) || !PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, f0$a.class, "1")) {
          f0$a ta = this.a;
          if (ta != null) {
             ta.b(p0, p1, p2);
          }
       }
       return;
    }
    public void c(PostBaseResourceDownloadHelper$InfoWithResource p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f0$a.class, "2")) {
       }else {
          f0$a ta = this.a;
          if (ta != null) {
             ta.c(p0, p1);
          }
          Object[] objArray = new Object[0];
          a.D().w("StickerDownloadHelper", "download failed stickerDetailInfo:"+p0, objArray);
       }
       return;
    }
}
