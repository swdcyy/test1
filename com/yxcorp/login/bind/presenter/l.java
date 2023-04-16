package com.yxcorp.login.bind.presenter.l;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.social.login.model.BindPhoneParams$ActionBarType;
import com.kwai.feature.api.social.login.model.BindPhoneParams;
import java.lang.Enum;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import e1d.l;
import android.view.View$OnClickListener;
import e1d.m;
import android.view.View;
import ekd.m1;
import java.lang.Boolean;

public class l extends PresenterV2	// class@001a86
{
    public KwaiActionBar p;
    public BindPhoneParams q;
    public boolean r;

    public void l(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, l.class, "3")) {
          return;
       }
       if (BindPhoneParams$ActionBarType.TYPE_SKIP.equals(this.q.mBindPhoneBarType)) {
          this.R8();
       }else if(BindPhoneParams$ActionBarType.TYPE_BACK_AND_SKIP.equals(this.q.mBindPhoneBarType)){
          this.R8();
          this.P8();
       }else {
          this.P8();
       }
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, l.class, "4")) {
          return;
       }
       int i = (this.r != null)? 0x7f0819e0: 0x7f0819d9;
       this.p.i(i).h(new l(this));
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, l.class, "5")) {
          return;
       }
       this.p.m(R.string.arg_RES_7f104838).l(new m(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3f6a);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       this.q = this.r8("BIND_PHONE_PARAMS");
       this.r = this.r8("KEY_SHOW_CLOSE_BTN").booleanValue();
       return;
    }
}
