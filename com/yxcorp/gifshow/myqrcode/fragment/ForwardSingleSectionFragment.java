package com.yxcorp.gifshow.myqrcode.fragment.ForwardSingleSectionFragment;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment;
import com.yxcorp.gifshow.myqrcode.fragment.ForwardSingleSectionFragment$a;
import nsd.u;
import mp7.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.myqrcode.fragment.ForwardSingleSectionFragment$b;
import yic.s0;
import com.yxcorp.gifshow.activity.GifshowActivity;
import lnc.a1;
import android.app.Activity;
import androidx.recyclerview.widget.RecyclerView$n;
import yic.s0$a;
import androidx.fragment.app.KwaiDialogFragment;
import java.util.HashMap;

public final class ForwardSingleSectionFragment extends ForwardGridSectionFragment	// class@0020b4
{
    public HashMap X0;
    public static final ForwardSingleSectionFragment$a Y0;

    static {
       ForwardSingleSectionFragment.Y0 = new ForwardSingleSectionFragment$a(null);
    }
    public void ForwardSingleSectionFragment(){
       super();
    }
    public e Nh(){
       Object obj = PatchProxy.apply(null, this, ForwardSingleSectionFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ForwardSingleSectionFragment$b(this, s0.a.a(this.Lh(), a1.e(20.00f), a1.e(336.00f), 0x7f0a134d, (- a1.e(11.00f))));
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, ForwardSingleSectionFragment.class, "3")) {
       }else {
          ForwardSingleSectionFragment tX0 = this.X0;
          if (tX0 != null) {
             tX0.clear();
          }
       }
       return;
    }
}
