package com.kuaishou.live.core.show.photoalbum.a;
import n3d.a;
import com.kuaishou.live.core.show.photoalbum.LiveEntryCoverSelectSupplier;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.io.File;
import java.io.Serializable;
import ekd.j0;
import java.util.List;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.models.QMedia;
import qkd.b;
import android.net.Uri;
import ekd.w0;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.kuaishou.live.core.show.photoalbum.e;
import java.lang.Runnable;
import t45.c;
import w69.i;
import com.kuaishou.live.core.show.photoalbum.LiveEntryCoverSelectSupplier$SelectType;

public final class a implements a	// class@000d52
{
    public final LiveEntryCoverSelectSupplier b;

    public void a(LiveEntryCoverSelectSupplier p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.isSupport(LiveEntryCoverSelectSupplier.class) && (PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, tb, LiveEntryCoverSelectSupplier.class, "4") || (p0 == 257 && p1 == -1))) {
          Uri obj = PatchProxy.applyOneRefs(p2, tb, LiveEntryCoverSelectSupplier.class, "8");
          if (obj != PatchProxyResult.class) {
          }else {
             List list = j0.e(p2, "album_data_list");
             if (q.f(list)) {
                obj = null;
             }else {
                p1 = 0;
                String[] stringArray = new String[]{list.get(p1).path};
                obj = b.B(stringArray);
             }
          }
          if (obj != null && obj.exists()) {
             obj = w0.c(obj);
             Fresco.getImagePipeline().evictFromCache(obj);
             if (!PatchProxy.applyVoidOneRefs(obj, tb, LiveEntryCoverSelectSupplier.class, "7")) {
                c.a(new e(tb, obj));
             }
          }else {
             tb.b(tb.e, tb.f);
          }
       }
    label_0085 :
       return;
    }
}
