package com.yxcorp.login.debuglogin.a$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.login.debuglogin.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import lnc.a1;
import j1d.e;
import com.yxcorp.login.debuglogin.DebugAccountInfo;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.widget.EmojiTextView;
import com.yxcorp.login.debuglogin.a$a$a;
import com.yxcorp.gifshow.widget.m;
import java.lang.Integer;

public class a$a extends PresenterV2	// class@001aaa
{
    public int p;
    public DebugAccountInfo q;
    public EmojiTextView r;
    public TextView s;
    public final a t;

    public void a$a(a p0){
       this.t = p0;
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "3")) {
          return;
       }
       int i = 0x7f0600a6;
       int i1 = 4;
       if (this.q == null) {
          this.r.setVisibility(i1);
          this.s.setTextColor(a1.a(i));
          return;
       }else if((e.c().a()).equals(this.q.mEnv) && (QCurrentUser.me().getId()).equals(this.q.mUid)){
          this.r.setVisibility(0);
          this.s.setTextColor(a1.a(R.color.arg_RES_7f061cfc));
       }else {
          this.r.setVisibility(i1);
          this.s.setTextColor(a1.a(i));
       }
       this.s.setText("\("+this.q.mEnv+"\) UID:"+this.q.mUid+" Í«≥∆:"+this.q.mName);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a0ce6);
       this.s = m1.f(p0, 0x7f0a40d9);
       m1.b(p0, new a$a$a(this), R.id.consl_root);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       this.p = this.r8("ADAPTER_POSITION").intValue();
       this.q = this.q8(DebugAccountInfo.class);
       return;
    }
}
