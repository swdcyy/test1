package com.yxcorp.gifshow.ad.homepage.presenter.PhotoRatePresenter$1;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.ad.homepage.presenter.PhotoRatePresenter;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Boolean;
import java.lang.System;
import oe6.e;
import com.kuaishou.android.model.mix.VideoQualityInfo;
import wkd.b;
import mxb.f0;
import com.kwai.framework.model.feed.BaseFeed;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.android.model.mix.ScoreMark;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioButton;
import u29.c;
import android.widget.RadioGroup$OnCheckedChangeListener;
import com.yxcorp.gifshow.ad.homepage.presenter.a;
import android.view.View$OnClickListener;
import u29.b;
import u29.a;
import mxb.j0;
import com.yxcorp.gifshow.photoad.o;
import u29.d;
import erd.g;

public class PhotoRatePresenter$1 implements LifecycleObserver	// class@001785
{
    public final PhotoRatePresenter b;

    public void PhotoRatePresenter$1(PhotoRatePresenter p0){
       this.b = p0;
       super();
    }
    public void onResume(){
       boolean b;
       PhotoRatePresenter x;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PhotoRatePresenter photoRatePre = PhotoRatePresenter.class;
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, PhotoRatePresenter$1.class, str)) {
          return;
       }
       PhotoRatePresenter$1 tb = this.b;
       if (tb.E != null) {
          Objects.requireNonNull(tb);
          Object obj = PatchProxy.apply(objArray, tb, photoRatePre, "3");
          int i = 1;
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if((System.currentTimeMillis() - e.c()) - e.E() <= 0){
             b = true;
          }else {
             b = false;
          }
          if (!b) {
             tb = this.b;
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoid(objArray, tb, photoRatePre, "12")) {
                if (!PatchProxy.applyVoid(objArray, tb, photoRatePre, "13")) {
                   PhotoRatePresenter p = tb.p;
                   VideoQualityInfo videoQuality = PatchProxy.applyOneRefs(p, tb, photoRatePre, "14");
                   if (videoQuality != patchProxyRe) {
                   }else {
                      Object obj1 = b.a(-762347696).x1(p, "key_feedbacktype");
                      if (obj1 != null) {
                         Iterator iterator = tb.r.iterator();
                         while (true) {
                            if (iterator.hasNext()) {
                               videoQuality = iterator.next();
                               if (videoQuality == null || (!obj1.equals(videoQuality.mType) && (!obj1.equals(str) || !("2").equals(videoQuality.mType)))) {
                                  continue ;
                               }
                            }
                         }
                      }
                      videoQuality = objArray;
                   }
                   tb.s = videoQuality;
                   if (videoQuality != null && !PatchProxy.applyVoidOneRefs(videoQuality, tb, photoRatePre, "15")) {
                      tb.D.clear();
                      int i1 = 0;
                      while (i1 < videoQuality.mScoreMarkList.size() && tb.D.size() < 3) {
                         ScoreMark scoreMark = videoQuality.mScoreMarkList.get(i1);
                         if (scoreMark != null && !TextUtils.x(scoreMark.mScoreTitle)) {
                            tb.D.add(scoreMark);
                         }
                         i1 = i1 + 1;
                      }
                   }
                }
             label_00e6 :
                if (tb.P8()) {
                   if (!PatchProxy.applyVoid(objArray, tb, photoRatePre, "6") && (tb.v == null && tb.u.getParent() != null)) {
                      View view = tb.u.inflate();
                      tb.v = view;
                      tb.w = view.findViewById(0x7f0a341e);
                      tb.z = tb.v.findViewById(0x7f0a3f2c);
                      tb.x = tb.v.findViewById(0x7f0a3c20);
                      tb.y = tb.v.findViewById(0x7f0a0782);
                      tb.A = tb.v.findViewById(0x7f0a341d);
                      tb.B = tb.v.findViewById(0x7f0a341b);
                      tb.C = tb.v.findViewById(0x7f0a341c);
                   }
                label_015e :
                   if (!PatchProxy.applyVoid(objArray, tb, photoRatePre, "5")) {
                      tb.z.setText(tb.s.mTitle);
                      tb.A.setText(tb.D.get(false).mScoreTitle);
                      tb.B.setText(tb.D.get(i).mScoreTitle);
                      tb.C.setText(tb.D.get(2).mScoreTitle);
                      x = tb.x;
                      boolean b1 = (tb.s.mSelectRateViewId != -1)? true: false;
                      x.setEnabled(b1);
                      tb.w.check(tb.s.mSelectRateViewId);
                   }
                   if (!PatchProxy.applyVoid(objArray, tb, photoRatePre, "11")) {
                      tb.w.setOnCheckedChangeListener(new c(tb));
                      tb.x.setOnClickListener(new a(tb));
                      tb.v.setOnClickListener(new b(tb));
                      tb.y.setOnClickListener(new a(tb));
                   }
                   e.m0(System.currentTimeMillis());
                   tb.s.mRateCoverShowStatus = i;
                   tb.v.setVisibility(false);
                   b.a(-762347696).r1(tb.p, "key_feedbacktype", "-1");
                   if (!PatchProxy.applyVoid(objArray, tb, photoRatePre, "18") && tb.s != null) {
                      o.z().e(224, tb.p).d(new d(tb)).a();
                   }
                }else {
                   x = tb.v;
                   if (x != null) {
                      x.setVisibility(8);
                   }
                }
             }
          }
       label_0234 :
          this.b.E = false;
       }
       return;
    }
}
