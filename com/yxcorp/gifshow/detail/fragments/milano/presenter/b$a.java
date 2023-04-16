package com.yxcorp.gifshow.detail.fragments.milano.presenter.b$a;
import df5.b;
import com.yxcorp.gifshow.detail.fragments.milano.presenter.b;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import df5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Objects;
import tkd.b;
import tkd.d;
import nx5.c;
import brd.t;
import com.yxcorp.gifshow.detail.fragments.milano.presenter.a;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import android.view.View;
import u6a.a;
import com.yxcorp.gifshow.nasa.NasaTagInfo;
import brd.y;

public class b$a implements b	// class@001519
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void a(QPhoto p0){
       a.a(this, p0);
    }
    public void b(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       if (p0 != null && TextUtils.x(this.a.v)) {
          b$a ta = this.a;
          if (ta.D == null) {
             ta.v = p0.getUserId();
             b$a ta1 = this.a;
             Objects.requireNonNull(ta1);
             if (!PatchProxy.applyVoid(null, ta1, b.class, "6") && (!TextUtils.x(ta1.p) && (("share").equalsIgnoreCase(ta1.q) && (!TextUtils.x(ta1.v) && !TextUtils.n(ta1.p, ta1.v))))) {
                d.a(0x37332120).V1(ta1.p, "external_share_follow", "external_share_follow_tip").subscribe(new a(ta1), Functions.d());
             }
          }
       }
    label_0077 :
       return;
    }
    public void c(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "2")) {
          return;
       }
       b x = this.a.x;
       if (x != null) {
          x.setVisibility(8);
          x = this.a.t;
          if (x != null) {
             x.onNext(new a(false, new NasaTagInfo()));
          }
       }
       return;
    }
}
