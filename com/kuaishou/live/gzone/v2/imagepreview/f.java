package com.kuaishou.live.gzone.v2.imagepreview.f;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.gzone.v2.imagepreview.g;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a63.a;
import android.util.SparseArray;
import com.kuaishou.live.gzone.v2.imagepreview.n;
import java.util.List;
import com.yxcorp.gifshow.model.PreviewModel;
import android.net.Uri;
import ekd.w0;
import java.util.Objects;
import java.lang.Boolean;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import brd.t;
import a63.l;
import erd.o;
import a63.i;
import a63.f;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class f extends m	// class@001ccb
{
    public final g c;

    public void f(g p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       f tc = this.c;
       n on = tc.w.i.get(tc.u);
       f tc1 = this.c;
       Uri uri = w0.f(tc1.t.get(tc1.u).d);
       f tc2 = this.c;
       boolean b = tc2.t.get(tc2.u).d();
       Objects.requireNonNull(on);
       n on1 = n.class;
       if (!PatchProxy.isSupport(on1) || !PatchProxy.applyVoidTwoRefs(uri, Boolean.valueOf(b), on, on1, "12")) {
          on.X7(t.just(Boolean.valueOf(PermissionUtils.a(on.x, "android.permission.WRITE_EXTERNAL_STORAGE"))).flatMap(new l(on, "android.permission.WRITE_EXTERNAL_STORAGE")).flatMap(new i(uri, b)).subscribe(new f(on), Functions.d()));
       }
       return;
    }
}
