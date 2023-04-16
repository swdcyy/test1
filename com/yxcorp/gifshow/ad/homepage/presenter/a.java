package com.yxcorp.gifshow.ad.homepage.presenter.a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.ad.homepage.presenter.PhotoRatePresenter;
import java.lang.Object;
import android.view.View;
import com.kuaishou.android.model.mix.VideoQualityInfo;
import android.widget.RadioGroup;
import java.util.List;
import com.kuaishou.android.model.mix.ScoreMark;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import mxb.j0;
import com.yxcorp.gifshow.photoad.o;
import com.kwai.framework.model.feed.BaseFeed;
import u29.e;
import erd.g;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;

public final class a implements View$OnClickListener	// class@001787
{
    public final PhotoRatePresenter b;

    public void a(PhotoRatePresenter p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       PhotoRatePresenter s = tb.s;
       if (s == null) {
       }else {
          PhotoRatePresenter w = tb.w;
          int i = w.indexOfChild(w.findViewById(s.mSelectRateViewId));
          ScoreMark mScoreValue = tb.D.get(i).mScoreValue;
          w = PhotoRatePresenter.class;
          if (!PatchProxy.isSupport(w) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(mScoreValue), tb, w, "19") && tb.s != null)) {
             o.z().e(225, tb.p).d(new e(tb, mScoreValue)).a();
          }
          i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f1040d6));
          tb.S8();
       }
       return;
    }
}
