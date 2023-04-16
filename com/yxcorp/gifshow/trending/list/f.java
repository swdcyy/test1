package com.yxcorp.gifshow.trending.list.f;
import java.lang.Runnable;
import com.yxcorp.gifshow.trending.list.TrendingListFragmentV2;
import android.view.View;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import android.os.Bundle;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import ykc.m;
import ekd.k1;
import ykc.n;
import android.animation.Animator$AnimatorListener;
import ekd.f;

public final class f implements Runnable	// class@001db6
{
    public final TrendingListFragmentV2 b;
    public final View c;
    public final Runnable d;

    public void f(TrendingListFragmentV2 p0,View p1,Runnable p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       int i;
       f tb = this.b;
       f tc = this.c;
       f td = this.d;
       if (tb.getView() != null && tb.C != null) {
          tc.setTranslationY(0);
          Object[] objArray = null;
          Object obj = PatchProxy.apply(objArray, tb, TrendingListFragmentV2.class, "3");
          boolean b = false;
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else {
             i = 0;
             while (true) {
                if (i < tb.W.size()) {
                   if (!(tb.W.get(i)).equals(tb.I)) {
                      i = i + 1;
                   }
                }else {
                   i = 0;
                }
             }
          }
          if (tb.L != i) {
             tb.X = b;
             tb.Gh(i, objArray);
             tb.L = i;
          }
          k1.r(new m(tb), 10);
          f.j(tb.getView(), tb.C, 0, true, 300, new n(tb, td));
       }
       return;
    }
}
