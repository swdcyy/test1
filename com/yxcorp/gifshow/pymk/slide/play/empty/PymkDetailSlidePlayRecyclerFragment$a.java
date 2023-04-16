package com.yxcorp.gifshow.pymk.slide.play.empty.PymkDetailSlidePlayRecyclerFragment$a;
import y8c.g;
import com.yxcorp.gifshow.pymk.slide.play.empty.PymkDetailSlidePlayRecyclerFragment;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import ekd.p1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ml8.c;

public class PymkDetailSlidePlayRecyclerFragment$a extends g	// class@0016d4
{
    public final PymkDetailSlidePlayRecyclerFragment w;

    public void PymkDetailSlidePlayRecyclerFragment$a(PymkDetailSlidePlayRecyclerFragment p0){
       this.w = p0;
       super();
    }
    public f h1(ViewGroup p0,int p1){
       PymkDetailSlidePlayRecyclerFragment$a uoa = PymkDetailSlidePlayRecyclerFragment$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(p1.b(p0), new PresenterV2());
    }
}
