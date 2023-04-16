package com.kuaishou.live.core.show.quiz.question.f;
import k51.c;
import gg2.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.quiz.question.c;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import android.view.View;
import com.kuaishou.live.common.core.basic.widget.LiveViewFlipper$a;
import com.kuaishou.live.common.core.basic.widget.LiveViewFlipper;
import bg2.b;
import android.widget.ViewFlipper;
import android.widget.TextView;
import java.lang.CharSequence;
import com.kuaishou.live.core.show.quiz.question.LiveQuizDialogType;
import eg2.b;
import gg2.g;
import java.lang.Runnable;
import ekd.k1;
import dg2.d;
import com.kuaishou.live.core.show.quiz.manager.j;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import ekd.m1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class f extends c	// class@000e42
{
    public c p;
    public j q;
    public View r;
    public View s;
    public TextView t;
    public LiveViewFlipper u;
    public b v;
    public final LiveViewFlipper$a w;
    public static String sLivePresenterClassName = "LiveQuizQuestionPropsWidgetPresenter";

    public void f(){
       super();
       this.w = new f(this);
    }
    public void E8(){
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof, "3")) {
          return;
       }
       f tp = this.p;
       this.q = tp.m;
       f ts = this.s;
       int i = 0;
       int i1 = (tp.b.isQuizGroupEnable())? 0: 8;
       ts.setVisibility(i1);
       tp = this.r;
       if (!this.p.b.isQuizReviveCardEnable()) {
          i = 8;
       }
       tp.setVisibility(i);
       if (!PatchProxy.applyVoid(objArray, this, uof, "5")) {
          this.u.a(this.w);
          b uob = new b(this.u, 0x7f0604eb);
          this.v = uob;
          String str = String.valueOf(this.P8());
          if (!PatchProxy.applyVoidOneRefs(str, uob, b.class, "2") && uob.a.getCurrentView() instanceof TextView) {
             uob.a.getCurrentView().setText(str);
          }
          if (this.P8() > 0) {
             uof = this.p;
             if (uof.f == LiveQuizDialogType.USER_RESULT_WRONG) {
                c g = uof.g;
                if (g.g == null && g.l != null) {
                   k1.s(new g(this), this, 1000);
                }
             }
          }
       }
    label_009e :
       if (this.q.e().g == null) {
          this.t.setText("橡皮擦未获得");
          this.t.setAlpha(0.40f);
       }else {
          this.t.setText("橡皮擦生效中");
          this.t.setAlpha(0x3f800000);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       k1.n(this);
       return;
    }
    public final int P8(){
       Object obj = PatchProxy.apply(null, this, f.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.q.e().a();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a2450);
       this.s = m1.f(p0, 0x7f0a244d);
       this.t = m1.f(p0, 0x7f0a244e);
       this.u = m1.f(p0, 0x7f0a245c);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.p = this.q8(c.class);
       return;
    }
}
