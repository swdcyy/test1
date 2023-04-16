package com.kwai.nearby.local.presenter.r;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import crd.b;
import jrb.b;
import krb.a;
import com.kwai.feature.api.social.nearby.LocalDelegateType;
import tw5.d;
import brd.t;
import dd7.h0;
import erd.g;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import android.view.View;
import ekd.m1;
import android.widget.ImageButton;
import dd7.g0;
import android.view.View$OnClickListener;

public class r extends PresenterV2	// class@000fc7
{
    public TextView p;
    public ImageButton q;
    public String r;

    public void r(String p0){
       super();
       this.r = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, r.class, "2")) {
          return;
       }
       this.X7(b.e());
       this.P8(this.r);
       this.X7(a.b().a(LocalDelegateType.ACTIVITY_LOCAL).a().distinctUntilChanged().subscribe(new h0(this)));
       return;
    }
    public final void P8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "3")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          this.p.setText(p0);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a2929);
       ImageButton imageButton = m1.f(p0, R.id.local_contianer_ac_back_btn);
       this.q = imageButton;
       m1.a(imageButton, new g0(this), R.id.local_contianer_ac_back_btn);
       return;
    }
}
