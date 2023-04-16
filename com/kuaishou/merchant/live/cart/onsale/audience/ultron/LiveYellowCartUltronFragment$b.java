package com.kuaishou.merchant.live.cart.onsale.audience.ultron.LiveYellowCartUltronFragment$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.kuaishou.merchant.live.cart.onsale.audience.ultron.LiveYellowCartUltronFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.MutableLiveData;
import f54.a;
import androidx.lifecycle.LiveData;
import x44.a;
import java.util.Objects;
import lnc.l1;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.a;
import android.app.Activity;
import com.yxcorp.utility.n;
import et3.a;
import android.content.Context;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import com.yxcorp.gifshow.fragment.BottomSheetFragment;
import android.view.ViewTreeObserver;

public final class LiveYellowCartUltronFragment$b implements ViewTreeObserver$OnGlobalLayoutListener	// class@00197b
{
    public final LiveYellowCartUltronFragment b;
    public final View c;

    public void LiveYellowCartUltronFragment$b(LiveYellowCartUltronFragment p0,View p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onGlobalLayout(){
       boolean b;
       if (PatchProxy.applyVoid(null, this, LiveYellowCartUltronFragment$b.class, "1")) {
          return;
       }
       LiveYellowCartUltronFragment g = this.b.G;
       int i = 0;
       if (g != null) {
          MutableLiveData mutableLiveD = g.p0();
          if (mutableLiveD != null) {
             a value = mutableLiveD.getValue();
             if (value != null) {
                b = value.a();
             label_0027 :
                LiveYellowCartUltronFragment$b tb = this.b;
                LiveYellowCartUltronFragment l = tb.L;
                Objects.requireNonNull(l, "null cannot be cast to non-null type android.view.ViewGroup");
                if (!l1.a()) {
                   FragmentActivity activity = this.b.getActivity();
                   a.m(activity);
                   FragmentActivity activity1 = this.b.getActivity();
                   a.m(activity1);
                   i = (int)(((float)n.j(activity) * ((float)1 - a.a)) - (float)n.A(activity1));
                }
                tb.Lh(l, i, b);
                LiveYellowCartUltronFragment$b tb1 = this.b;
                tb1.Bh(tb1.getDialog());
                tb1 = this.c;
                a.m(tb1);
                tb1.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                return;
             }
          }
       }
       b = false;
       goto label_0027 ;
    }
}
