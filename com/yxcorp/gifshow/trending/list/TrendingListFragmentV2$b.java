package com.yxcorp.gifshow.trending.list.TrendingListFragmentV2$b;
import com.kwai.library.widget.viewpager.tabstrip.b;
import com.yxcorp.gifshow.trending.list.TrendingListFragmentV2;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import java.lang.Class;
import android.os.Bundle;
import java.util.List;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.trending.list.TrendingSubListFragment;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.entity.TrendingTitleInfo;
import java.util.Objects;

public class TrendingListFragmentV2$b extends b	// class@001dac
{
    public final List d;
    public final TrendingListFragmentV2 e;

    public void TrendingListFragmentV2$b(TrendingListFragmentV2 p0,PagerSlidingTabStrip$d p1,Class p2,Bundle p3,List p4){
       this.e = p0;
       this.d = p4;
       super(p1, p2, p3);
    }
    public void d(int p0,Fragment p1){
       TrendingListFragmentV2$b uob = TrendingListFragmentV2$b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "1")) {
          if ((this.d.get(p0).mTrendingType).equals(this.e.I)) {
             TrendingListFragmentV2 e = this.e.E;
             Objects.requireNonNull(p1);
             if (e != null) {
                p1.F = e;
             }
          }
          TrendingListFragmentV2$b te = this.e;
          if (te.Y0 != null) {
             p1.K = true;
             p1.L = te.a1;
             p1.M = te.b1;
             p1.N = te.J;
          }
          p1.H = te.F;
          p1.I = te.K;
          p1.O = te.H;
          p1.Q = te.S;
       }
       return;
    }
}
