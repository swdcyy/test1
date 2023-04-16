package com.yxcorp.gifshow.detail.article.imagepreview.o;
import android.view.View$OnLongClickListener;
import com.yxcorp.gifshow.detail.article.imagepreview.r;
import java.lang.Object;
import android.view.View;
import com.yxcorp.gifshow.model.PreviewModel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import brd.t;
import com.yxcorp.gifshow.detail.article.imagepreview.m;
import erd.r;
import com.yxcorp.gifshow.detail.article.imagepreview.j;
import erd.o;
import com.yxcorp.gifshow.detail.article.imagepreview.n;
import xw9.i;
import xw9.j;
import com.yxcorp.gifshow.detail.article.imagepreview.k;
import android.net.Uri;
import xw9.f;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class o implements View$OnLongClickListener	// class@001359
{
    public final r b;

    public void o(r p0){
       this.b = p0;
    }
    public final boolean onLongClick(View p0){
       o tb = this.b;
       if (tb.t.h != null) {
          r e = tb.E;
          if (!PatchProxy.applyVoidOneRefs(e, tb, r.class, "11")) {
             tb.Z8("SAVE_PICTURE");
             tb.X7(t.just(Boolean.valueOf(tb.F)).filter(m.b).flatMap(new j(tb)).filter(n.b).map(new i(tb, "android.permission.WRITE_EXTERNAL_STORAGE")).flatMap(new j(tb, "android.permission.WRITE_EXTERNAL_STORAGE")).flatMap(new k(tb, e)).subscribe(new f(tb), Functions.d()));
          }
       }
       return true;
    }
}
