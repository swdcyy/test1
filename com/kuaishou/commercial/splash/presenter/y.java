package com.kuaishou.commercial.splash.presenter.y;
import java.lang.Runnable;
import com.kuaishou.commercial.splash.presenter.z;
import java.lang.Object;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gz.s;
import android.net.Uri;
import java.io.File;
import j80.g;
import com.yxcorp.utility.n;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.util.BitmapUtil;
import gz.s2;
import ekd.k1;

public final class y implements Runnable	// class@001615
{
    public final z b;

    public void y(z p0){
       this.b = p0;
    }
    public final void run(){
       y tb = this.b;
       Context context = tb.getContext();
       if (PatchProxy.applyVoidOneRefs(context, tb, z.class, "6")) {
       }else if(context == null){
          s l = tb.A.l;
          if (l != null) {
             tb.B = BitmapUtil.r(g.b(l), n.c(context, (float)tb.C), n.c(context, (float)tb.D), false);
             k1.o(new s2(tb));
          }
       }
       return;
    }
}
