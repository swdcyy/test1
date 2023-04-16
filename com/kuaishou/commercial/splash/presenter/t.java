package com.kuaishou.commercial.splash.presenter.t;
import java.lang.Runnable;
import com.kuaishou.commercial.splash.presenter.u;
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
import gz.o2;
import ekd.k1;

public final class t implements Runnable	// class@00160a
{
    public final u b;

    public void t(u p0){
       this.b = p0;
    }
    public final void run(){
       t tb = this.b;
       Context context = tb.getContext();
       if (PatchProxy.applyVoidOneRefs(context, tb, u.class, "8")) {
       }else if(context == null){
          s l = tb.D.l;
          if (l != null) {
             tb.F = BitmapUtil.r(g.b(l), n.c(context, (float)tb.G), n.c(context, (float)tb.H), false);
          }
          k1.o(new o2(tb));
       }
       return;
    }
}
