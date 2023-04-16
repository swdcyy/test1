package com.yxcorp.gifshow.v3.editor.text.subtitle.n;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.v3.editor.text.subtitle.m;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.AbsoluteLayout;
import android.view.ViewTreeObserver;
import java.util.Objects;
import dvc.q;
import dvc.p;
import erd.g;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import hba.a;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import lwc.h;
import faa.a;
import java.lang.StringBuilder;
import java.util.ArrayList;
import q87.c;
import evc.b$a;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.edit.draft.TimeRange$b;
import com.kuaishou.edit.draft.TimeRange;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.yxcorp.gifshow.widget.adv.model.f;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import brd.a0;
import t45.d;
import brd.z;
import dvc.o;
import com.yxcorp.gifshow.v3.editor.text.subtitle.l;
import brd.y;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.yxcorp.gifshow.edit.draft.DraftUtils;

public class n implements ViewTreeObserver$OnGlobalLayoutListener	// class@0014a3
{
    public final m b;

    public void n(m p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       double d;
       double d1;
       Object obj = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, n.class, "1")) {
          return;
       }
       if (obj.b.u.getWidth() > 0 && obj.b.u.getHeight() > 0) {
          obj.b.u.getViewTreeObserver().removeOnGlobalLayoutListener(obj);
          n b = obj.b;
          Objects.requireNonNull(b);
          m om = m.class;
          if (!PatchProxy.applyVoid(objArray, b, om, "5")) {
             if (!PatchProxy.applyVoid(objArray, b, om, "6")) {
                b.X7(b.v.subscribe(new q(b), new p(b)));
             }
             b.y.X0(b.q, false);
             b.y.q1(false, b.z);
             m e = b.E;
             if (!PatchProxy.applyVoidOneRefs(e, b, om, "7")) {
                Object[] objArray1 = new Object[false];
                a.D().w("SubtitleAutoTextPresenter", "handleSubtitleInTextUpdate subtitle size: "+e.size(), objArray1);
                int i = 0;
                int i1 = 0;
                while (i < e.size()) {
                   b$a uoa = e.get(i);
                   if (PatchProxy.isSupport(om)) {
                      Object obj1 = PatchProxy.applyTwoRefs(e, Integer.valueOf(i), b, om, "8");
                      if (obj1 != PatchProxyResult.class) {
                         d = obj1.doubleValue();
                      }else {
                      label_00be :
                         d = (double)e.get(i).b();
                         if (i > 0) {
                            int i2 = i - 1;
                            b$a uoa1 = e.get(i2);
                            double d2 = d - (double)uoa1.a();
                            if (d2 - null >= 0) {
                               d1 = d - (double)uoa1.a();
                               double d3 = 0x3f50624dd2f1a9fc;
                               if (d1 - d3 < 0) {
                                  d = d + d3;
                               }
                            }
                         }
                      }
                   }else {
                      goto label_00be ;
                   }
                   Object[] objArray2 = new Object[false];
                   a.D().w("SubtitleAutoTextPresenter", "handleSubtitleInTextUpdate subTitle: "+uoa.toString()+" startTime = "+d, objArray2);
                   TimeRange$b uob = TimeRange.newBuilder();
                   uob.b(d);
                   d1 = (double)uoa.a() - d;
                   uob.a(d1);
                   GeneratedMessageLite generatedMes = uob.build();
                   if (i) {
                      b.y.o0(generatedMes, new ArrayList(), uoa.c(), false, b.s.f(false));
                   }else {
                      i1 = b.y.o0(generatedMes, new ArrayList(), uoa.c(), false, b.s.f(false));
                   }
                   i = i + 1;
                   String str = null;
                }
                b.u.y0(i1);
                Object[] objArray3 = new Object[false];
                a.D().w("SubtitleAutoTextPresenter", "handleSubtitleInTextUpdate", objArray3);
             }
             if (!PatchProxy.applyVoid(null, b, om, "9")) {
                if (!TextUtils.x(b.y.V0())) {
                   b.u.R();
                   b.X7(b.y.D1().G(d.a).R(new o(b), l.b));
                }else {
                   b.v.onNext(Integer.valueOf(12));
                   b.A.play();
                   DraftUtils.g0(1, b.q);
                }
             }
          }
       }
       return;
    }
}
