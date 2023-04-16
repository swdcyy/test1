package com.yxcorp.plugin.setting.presenter.AtMeTabSettingPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import java.lang.CharSequence;
import android.widget.TextView;
import com.yxcorp.plugin.setting.presenter.AtMeTabSettingPresenter$onBind$1$1;
import tgd.d;
import msd.l;
import erd.g;
import crd.b;
import brd.t;
import com.yxcorp.plugin.setting.presenter.AtMeTabSettingPresenter$b;
import android.view.View$OnClickListener;
import android.view.View;
import android.app.Activity;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.plugin.setting.presenter.AtMeTabSettingPresenter$c;
import java.lang.Integer;
import wkd.b;
import com.yxcorp.gifshow.retrofit.service.KwaiApiService;
import com.yxcorp.plugin.setting.presenter.AtMeTabSettingPresenter$a;
import k2b.e0;
import sgd.b;
import ekd.m1;

public final class AtMeTabSettingPresenter extends PresenterV2	// class@0008d3
{
    public final int A;
    public PublishSubject B;
    public g C;
    public int D;
    public GifshowActivity p;
    public View q;
    public TextView r;
    public TextView s;
    public final String t;
    public final String u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    public void AtMeTabSettingPresenter(){
       super();
       this.t = "at_me_tab_privacy_setting";
       this.u = "WHO_CAN_VIEW_MY_BE_AT_LIST";
       this.v = 1;
       this.w = 2;
       this.x = 3;
       this.z = 1;
       this.A = 2;
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       this.D = mE.getMentionedMeWorksSetting();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, AtMeTabSettingPresenter.class, "3")) {
          return;
       }
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       this.D = mE.getMentionedMeWorksSetting();
       AtMeTabSettingPresenter tr = this.r;
       if (tr == null) {
          a.S("mTitle");
       }
       tr.setText(a1.p(R.string.arg_RES_7f10024a));
       this.R8(this.D);
       tr = this.B;
       if (tr != null) {
          this.X7(tr.subscribe(new d(new AtMeTabSettingPresenter$onBind$1$1(this)), this.C));
       }
       tr = this.q;
       if (tr == null) {
          a.S("mContainer");
       }
       tr.setOnClickListener(new AtMeTabSettingPresenter$b(this));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, AtMeTabSettingPresenter.class, "1")) {
          return;
       }
       Activity activity = this.getActivity();
       Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       this.p = activity;
       this.B = PublishSubject.g();
       this.C = AtMeTabSettingPresenter$c.b;
       return;
    }
    public final void P8(int p0){
       AtMeTabSettingPresenter uAtMeTabSett = AtMeTabSettingPresenter.class;
       if (PatchProxy.isSupport(uAtMeTabSett) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAtMeTabSett, "4")) {
          return;
       }
       b.a(0x330163e).changePrivateOption(this.t, String.valueOf(p0)).subscribe(new AtMeTabSettingPresenter$a(this, p0), this.C);
       AtMeTabSettingPresenter tp = this.p;
       if (tp == null) {
          a.S("mActivity");
       }
       b.k(tp, this.u, 6);
       return;
    }
    public final void R8(int p0){
       AtMeTabSettingPresenter ts;
       AtMeTabSettingPresenter uAtMeTabSett = AtMeTabSettingPresenter.class;
       if (PatchProxy.isSupport(uAtMeTabSett) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAtMeTabSett, "5")) {
          return;
       }
       if (p0 == this.v) {
          ts = this.s;
          if (ts == null) {
             a.S("mEntrySubText");
          }
          ts.setText(R.string.arg_RES_7f103afd);
       }else if(p0 == this.w){
          ts = this.s;
          if (ts == null) {
             a.S("mEntrySubText");
          }
          ts.setText(R.string.arg_RES_7f1017e4);
       }else if(p0 == this.x){
          ts = this.s;
          if (ts == null) {
             a.S("mEntrySubText");
          }
          ts.setText(R.string.arg_RES_7f103ae1);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AtMeTabSettingPresenter.class, "2")) {
          return;
       }
       p0 = m1.f(p0, R.id.set_who_can_see_tab);
       a.o(p0, "ViewBindUtils.bindWidget¡­R.id.set_who_can_see_tab\)");
       this.q = p0;
       String str = "mContainer";
       if (p0 == null) {
          a.S(str);
       }
       p0 = m1.f(p0, R.id.entry_text);
       a.o(p0, "ViewBindUtils.bindWidget¡­ntainer, R.id.entry_text\)");
       this.r = p0;
       AtMeTabSettingPresenter tq = this.q;
       if (tq == null) {
          a.S(str);
       }
       tq = m1.f(tq, R.id.entry_sub_text);
       a.o(tq, "ViewBindUtils.bindWidget¡­ner, R.id.entry_sub_text\)");
       this.s = tq;
       return;
    }
}
