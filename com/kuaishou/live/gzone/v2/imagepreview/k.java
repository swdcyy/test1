package com.kuaishou.live.gzone.v2.imagepreview.k;
import android.view.View$OnLongClickListener;
import com.kuaishou.live.gzone.v2.imagepreview.n;
import java.lang.Object;
import android.view.View;
import com.yxcorp.gifshow.model.PreviewModel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import brd.t;
import com.kuaishou.live.gzone.v2.imagepreview.i;
import erd.r;
import com.kuaishou.live.gzone.v2.imagepreview.h;
import erd.o;
import com.kuaishou.live.gzone.v2.imagepreview.j;
import a63.j;
import a63.k;
import a63.h;
import android.net.Uri;
import a63.r;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class k implements View$OnLongClickListener	// class@001cd0
{
    public final n b;

    public void k(n p0){
       this.b = p0;
    }
    public final boolean onLongClick(View p0){
       k tb = this.b;
       n t = tb.t;
       if (t.h != null) {
          n d = tb.D;
          boolean b = t.d();
          n on = n.class;
          if (!PatchProxy.isSupport(on) || !PatchProxy.applyVoidTwoRefs(d, Boolean.valueOf(b), tb, on, "11")) {
             tb.X7(t.just(Boolean.valueOf(tb.E)).filter(i.b).flatMap(new h(tb)).filter(j.b).map(new j(tb, "android.permission.WRITE_EXTERNAL_STORAGE")).flatMap(new k(tb, "android.permission.WRITE_EXTERNAL_STORAGE")).flatMap(new h(d, b)).subscribe(new r(tb), Functions.d()));
          }
       }
       return true;
    }
}
