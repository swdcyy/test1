package com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.HashMap;
import com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.d$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import qw6.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.entity.SurveyBigCardMeta;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import k2b.u1;
import android.view.View;
import ekd.m1;
import android.widget.Button;
import q6a.a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.entity.QPhoto;
import com.smile.gifmaker.mvps.utils.observable.ObservableList;

public class d extends PresenterV2	// class@0017c0
{
    public QPhoto p;
    public BaseFragment q;
    public SlidePlayViewModel r;
    public SurveyBigCardMeta s;
    public ObservableList t;
    public String u;
    public Map v;
    public final a w;

    public void d(){
       super();
       this.v = new HashMap();
       this.w = new d$a(this);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, d.class, "3")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.q.getParentFragment());
       this.r = slidePlayVie;
       slidePlayVie.h(this.w);
       if (!PatchProxy.applyVoidWithListener(objArray, this, d.class, "12")) {
          if (this.s == null) {
             PatchProxy.onMethodExit(d.class, "12");
          }else {
             ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
             urlPackage.page2 = this.q.o();
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "KWAI_SURVEY_QUESTIONNAIRE_POPUP";
             i3 oi3 = i3.f();
             oi3.d("questionnaire_type", this.s.mSurveyTag);
             uElementPack.params = oi3.e();
             ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
             showEvent.elementPackage = uElementPack;
             u1.z0(urlPackage, showEvent);
             PatchProxy.onMethodExit(d.class, "12");
          }
       }
       PatchProxy.onMethodExit(d.class, "3");
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoidWithListener(null, this, d.class, "4")) {
          return;
       }
       this.r.l(this.w);
       PatchProxy.onMethodExit(d.class, "4");
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, d.class, "2")) {
          return;
       }
       Button uButton = m1.f(p0, R.id.survey_button);
       uButton.setOnClickListener(new a(this, uButton));
       PatchProxy.onMethodExit(d.class, "2");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoidWithListener(null, this, d.class, "1")) {
          return;
       }
       this.q = this.r8("FRAGMENT");
       this.p = this.q8(QPhoto.class);
       this.s = this.q8(SurveyBigCardMeta.class);
       this.t = this.r8("SELECTED_SURVEY");
       PatchProxy.onMethodExit(d.class, "1");
       return;
    }
}
