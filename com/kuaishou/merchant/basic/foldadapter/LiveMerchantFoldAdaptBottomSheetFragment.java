package com.kuaishou.merchant.basic.foldadapter.LiveMerchantFoldAdaptBottomSheetFragment;
import gt3.e;
import com.kuaishou.merchant.basic.fragment.MerchantInterceptDismissBottomSheetFragment;
import gt3.d;
import androidx.fragment.app.DialogFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.kuaishou.merchant.basic.foldadapter.LiveMerchantFoldWrapperActivity;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import java.util.Objects;
import crd.b;
import lnc.b9;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.app.Activity;
import androidx.fragment.app.c;
import com.kuaishou.merchant.basic.util.FoldUtils;
import com.yxcorp.gifshow.util.rx.RxBus;
import gt3.f;
import brd.t;
import t45.d;
import brd.z;
import gt3.c;
import erd.r;
import gt3.a;
import gt3.b;
import erd.g;
import android.content.Intent;
import android.content.Context;

public abstract class LiveMerchantFoldAdaptBottomSheetFragment extends MerchantInterceptDismissBottomSheetFragment implements e	// class@0015b0
{
    public final d D;

    public void LiveMerchantFoldAdaptBottomSheetFragment(){
       super();
       this.D = new d(this);
    }
    public boolean Ch(){
       Object obj = PatchProxy.apply(null, this, LiveMerchantFoldAdaptBottomSheetFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.getActivity() instanceof LiveMerchantFoldWrapperActivity ^ 0x01);
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantFoldAdaptBottomSheetFragment.class, "3")) {
          return;
       }
       super.onDestroy();
       LiveMerchantFoldAdaptBottomSheetFragment tD = this.D;
       Objects.requireNonNull(tD);
       if (!PatchProxy.applyVoid(null, tD, d.class, "2")) {
          b9.a(tD.b);
          d c = tD.c;
          if (c != null) {
             c.finish();
             tD.c = null;
          }
       }
       return;
    }
    public void rc(Activity p0,c p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveMerchantFoldAdaptBottomSheetFragment.class, "1")) {
          return;
       }
       LiveMerchantFoldAdaptBottomSheetFragment tD = this.D;
       String str = this.Me();
       Objects.requireNonNull(tD);
       if (!PatchProxy.applyVoidFourRefs(p0, p1, p2, str, tD, d.class, "1")) {
          if (FoldUtils.b(p0)) {
             tD.b = RxBus.f.f(f.class).observeOn(d.a).filter(new c(str)).subscribe(new a(tD, p2), new b(str));
             Intent intent = new Intent(p0, LiveMerchantFoldWrapperActivity.class);
             intent.putExtra("fragment_tag", str);
             p0.startActivity(intent);
          }else {
             tD.a.show(p1, p2);
          }
       }
       return;
    }
}
