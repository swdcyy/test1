package com.yxcorp.gifshow.camera.record.album.slideup.list.f;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.album.slideup.list.h;
import java.lang.Object;
import java.util.Objects;
import wb9.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.camera.record.base.d;
import oc9.w;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.bubble.c;
import wb9.k;
import com.yxcorp.gifshow.bubble.a;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import com.yxcorp.gifshow.camera.bubble.RecordBubbleItem;
import ra9.c;

public final class f implements Runnable	// class@001cd9
{
    public final h b;

    public void f(h p0){
       this.b = p0;
    }
    public final void run(){
       f tb = this.b;
       Objects.requireNonNull(tb);
       i oi = new i(tb);
       if (PatchProxy.applyVoidOneRefs(oi, tb, h.class, "15")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().w("AlbumToolController", "requestShowBubble AUTO_SHOW_ALBUM_TOOL", objArray);
          if (tb.B == null && tb.d.b().V7() != null) {
             tb.d.b().V7().n(new k(tb, oi));
          }else {
             oi.run();
          }
          tb.B = true;
          if (tb.d.b().V7() != null) {
             tb.d.b().V7().u(RecordBubbleItem.AUTO_SHOW_ALBUM_TOOL);
          }
       }
       return;
    }
}
