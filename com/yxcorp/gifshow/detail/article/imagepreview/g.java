package com.yxcorp.gifshow.detail.article.imagepreview.g;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.detail.article.imagepreview.h;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xw9.a;
import android.util.SparseArray;
import com.yxcorp.gifshow.detail.article.imagepreview.r;
import java.util.List;
import com.yxcorp.gifshow.model.PreviewModel;
import android.net.Uri;
import ekd.w0;
import java.util.Objects;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import java.lang.Boolean;
import brd.t;
import xw9.k;
import erd.o;
import com.yxcorp.gifshow.detail.article.imagepreview.l;
import xw9.g;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class g extends m	// class@001351
{
    public final h c;

    public void g(h p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       g tc = this.c;
       r or = tc.y.i.get(tc.u);
       g tc1 = this.c;
       Uri uri = w0.f(tc1.t.get(tc1.u).d);
       Objects.requireNonNull(or);
       if (!PatchProxy.applyVoidOneRefs(uri, or, r.class, "12")) {
          or.Z8("DOWNLOAD_BUTTON");
          or.X7(t.just(Boolean.valueOf(PermissionUtils.a(or.y, "android.permission.WRITE_EXTERNAL_STORAGE"))).flatMap(new k(or, "android.permission.WRITE_EXTERNAL_STORAGE")).flatMap(new l(or, uri)).subscribe(new g(or), Functions.d()));
       }
       return;
    }
}
