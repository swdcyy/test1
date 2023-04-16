package com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoProfileSidePresenter$b;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoProfileSidePresenter;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.b5;
import uw9.o;
import q87.c;

public class MilanoProfileSidePresenter$b implements ViewPager$i	// class@001537
{
    public final MilanoProfileSidePresenter b;

    public void MilanoProfileSidePresenter$b(MilanoProfileSidePresenter p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       MilanoProfileSidePresenter$b uob = MilanoProfileSidePresenter$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       int i = 1;
       if (p0 == i) {
          MilanoProfileSidePresenter$b tb = this.b;
          tb.a1 = b5.a(tb.getActivity());
       }
       if (!p0) {
          MilanoProfileSidePresenter$b tb1 = this.b;
          tb1.Z0 = false;
          if (tb1.b1 != null) {
             Object[] objArray = new Object[false];
             o.C().w("MilanoProfileSideP", "scroll state idle, fit play view.", objArray);
             this.b.V8();
          }
          tb1.b1 = false;
       }else {
          p0.Z0 = i;
       }
       return;
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
    }
}
