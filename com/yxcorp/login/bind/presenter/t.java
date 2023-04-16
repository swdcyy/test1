package com.yxcorp.login.bind.presenter.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.social.login.model.BindPhoneParams$ActionBarType;
import com.kwai.feature.api.social.login.model.BindPhoneParams;
import java.lang.Enum;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import e1d.b0;
import android.view.View$OnClickListener;
import e1d.c0;
import android.view.View;
import ekd.m1;

public class t extends PresenterV2	// class@001a9e
{
    public KwaiActionBar p;
    public BindPhoneParams q;

    public void t(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, t.class, "3")) {
          return;
       }
       if (BindPhoneParams$ActionBarType.TYPE_SKIP.equals(this.q.mPhoneOneKeyBindBarType)) {
          this.R8();
       }else if(BindPhoneParams$ActionBarType.TYPE_BACK_AND_SKIP.equals(this.q.mPhoneOneKeyBindBarType)){
          this.R8();
          this.P8();
       }else {
          this.P8();
       }
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, t.class, "4")) {
          return;
       }
       this.p.i(R.drawable.arg_RES_7f0819d9).h(new b0(this));
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, t.class, "5")) {
          return;
       }
       this.p.m(R.string.arg_RES_7f104838).l(new c0(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3f6a);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, t.class, "1")) {
          return;
       }
       this.q = this.r8("BIND_PHONE_PARAMS");
       return;
    }
}
