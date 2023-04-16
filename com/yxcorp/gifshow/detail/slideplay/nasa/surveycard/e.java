package com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.entity.SurveyBigCardMeta;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.entity.SurveyBigCardQuestionMeta;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import k17.b;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$n;
import q6a.b;
import com.smile.gifmaker.mvps.utils.observable.ObservableList;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kwai.robust.PatchProxyResult;
import android.text.SpannableStringBuilder;
import s6a.a;
import android.widget.Button;
import brd.t;
import com.smile.gifmaker.mvps.utils.DefaultObservable;
import q6a.h;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class e extends PresenterV2	// class@0017c1
{
    public BaseFragment p;
    public TextView q;
    public TextView r;
    public TextView s;
    public RecyclerView t;
    public Button u;
    public SurveyBigCardMeta v;
    public SurveyBigCardQuestionMeta w;
    public b x;
    public List y;
    public ObservableList z;

    public void e(){
       super();
       this.y = new ArrayList();
    }
    public void E8(){
       e tv;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, e.class, "3")) {
          return;
       }
       String str = "5";
       e uoe = null;
       if (!PatchProxy.applyVoidWithListener(objArray, this, e.class, str)) {
          tv = this.v;
          if (tv != null && !q.f(tv.mQuestions)) {
             SurveyBigCardQuestionMeta surveyBigCar = this.v.mQuestions.get(uoe);
             this.w = surveyBigCar;
             if (surveyBigCar != null) {
                this.y.addAll(surveyBigCar.mOptions);
             }
          }
          PatchProxy.onMethodExit(e.class, str);
       }
       str = "6";
       if (!PatchProxy.applyVoidWithListener(objArray, this, e.class, str)) {
          int i = 1;
          this.t.setLayoutManager(new LinearLayoutManager(this.getContext(), i, uoe));
          this.t.addItemDecoration(new b(i, a1.e(0), a1.e(0), a1.e(12.00f)));
          b uob = new b(this.v, this.z);
          this.x = uob;
          uob.W0(this.y);
          this.t.setAdapter(this.x);
          PatchProxy.onMethodExit(e.class, str);
       }
       str = "7";
       if (!PatchProxy.applyVoidWithListener(objArray, this, e.class, str)) {
          tv = this.v;
          if (tv == null) {
             PatchProxy.onMethodExit(e.class, str);
          }else {
             this.r.setText(tv.mTitle);
             tv = this.s;
             Object obj = PatchProxy.applyWithListener(objArray, this, e.class, "8");
             if (obj != PatchProxyResult.class) {
                objArray = obj;
             }else if(this.w == null){
                PatchProxy.onMethodExit(e.class, "8");
             }else {
                objArray = new SpannableStringBuilder();
                objArray.append(this.w.mText);
                objArray.append(this.w.mIconText);
                objArray.setSpan(new a(this.getContext(), a1.d(R.dimen.arg_RES_7f070f6c), a1.a(R.color.arg_RES_7f061ff3), a1.a(R.color.arg_RES_7f060621)), objArray.length(), objArray.length(), 33);
                PatchProxy.onMethodExit(e.class, "8");
             }
             tv.setText(objArray);
             this.u.setText(this.v.mSubmitButtonText);
             this.q.setText(this.v.mSlideToContinueText);
             PatchProxy.onMethodExit(e.class, str);
          }
       }
       this.X7(this.z.observable().subscribe(new h(this), Functions.d()));
       PatchProxy.onMethodExit(e.class, "3");
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, e.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a3c2b);
       this.s = m1.f(p0, 0x7f0a3c2d);
       this.t = m1.f(p0, 0x7f0a3c27);
       this.u = m1.f(p0, 0x7f0a3c24);
       this.q = m1.f(p0, 0x7f0a3a3d);
       PatchProxy.onMethodExit(e.class, "2");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoidWithListener(null, this, e.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.v = this.q8(SurveyBigCardMeta.class);
       this.z = this.r8("SELECTED_SURVEY");
       PatchProxy.onMethodExit(e.class, "1");
       return;
    }
}
