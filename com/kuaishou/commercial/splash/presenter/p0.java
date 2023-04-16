package com.kuaishou.commercial.splash.presenter.p0;
import java.lang.Runnable;
import com.kuaishou.commercial.splash.presenter.q0;
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
import gz.n4;
import ekd.k1;

public final class p0 implements Runnable	// class@0015ff
{
    public final q0 b;

    public void p0(q0 p0){
       this.b = p0;
    }
    public final void run(){
       p0 tb = this.b;
       Context context = tb.getContext();
       if (PatchProxy.applyVoidOneRefs(context, tb, q0.class, "9")) {
       }else if(context == null){
          s l = tb.E.l;
          if (l != null) {
             tb.H = BitmapUtil.r(g.b(l), n.c(context, (float)tb.I), n.c(context, (float)tb.J), false);
             k1.o(new n4(tb));
          }
       }
       return;
    }
}
