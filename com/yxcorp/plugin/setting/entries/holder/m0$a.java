package com.yxcorp.plugin.setting.entries.holder.m0$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.setting.entries.holder.m0;
import com.yxcorp.plugin.setting.entries.holder.m0$a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import com.kwai.framework.model.user.QCurrentUser;
import android.view.View;
import android.view.View$OnClickListener;
import kgd.n1;
import erd.g;
import crd.b;
import brd.t;
import com.yxcorp.gifshow.util.rx.RxBus;
import lgd.a;
import kgd.m1;
import java.lang.Integer;
import tkd.b;
import tkd.d;
import nx5.d;
import kgd.o1;
import sfc.a;
import com.yxcorp.plugin.setting.startup.MessagePrivacySettingsDialogConfig;
import java.lang.CharSequence;
import io.reactivex.subjects.PublishSubject;
import ekd.m1;

public class m0$a extends PresenterV2	// class@000875
{
    public TextView p;
    public View$OnClickListener q;
    public final m0 r;

    public void m0$a(m0 p0){
       this.r = p0;
       super();
       this.q = new m0$a$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, m0$a.class, "2")) {
          return;
       }
       this.p.setVisibility(0);
       this.R8(QCurrentUser.ME.getMessagePrivacy());
       this.m8().setOnClickListener(this.q);
       this.X7(this.r.f.subscribe(new n1(this)));
       this.X7(RxBus.f.f(a.class).subscribe(new m1(this)));
       return;
    }
    public final void P8(String p0,int p1){
       m0$a uoa = m0$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "9")) {
          return;
       }
       this.X7(d.a(0x47047d).n0(p0, p1).subscribe(new o1(this, p1), new a()));
       return;
    }
    public final void R8(int p0){
       m0$a uoa = m0$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "5")) {
          return;
       }
       if (p0 == 1) {
          this.p.setText(this.r.g.getAllTypeCopy());
       }else if(p0 == 2){
          this.p.setText(this.r.g.getFollowTypeCopy());
       }else if(p0 == 3){
          this.p.setText(R.string.arg_RES_7f1010c7);
       }else {
          this.p.setText(this.r.g.getAllTypeCopy());
       }
       return;
    }
    public final void S8(int p0){
       m0$a uoa = m0$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "10")) {
          return;
       }
       this.r.e = p0;
       QCurrentUser.ME.startEdit().setMessagePrivacy(this.r.e).commitChanges();
       this.r.f.onNext(Integer.valueOf(p0));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m0$a.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0d6a);
       p0.f = PublishSubject.g();
       return;
    }
}
