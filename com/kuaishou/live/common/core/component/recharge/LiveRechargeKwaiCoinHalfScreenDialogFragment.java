package com.kuaishou.live.common.core.component.recharge.LiveRechargeKwaiCoinHalfScreenDialogFragment;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import com.kuaishou.live.common.core.component.recharge.LiveRechargeKwaiCoinHalfScreenDialogFragment$a;

public class LiveRechargeKwaiCoinHalfScreenDialogFragment extends LiveDialogContainerFragment	// class@001746
{
    public WebViewFragment A;
    public LiveRechargeKwaiCoinHalfScreenDialogFragment$a B;
    public static final int C;

    public void LiveRechargeKwaiCoinHalfScreenDialogFragment(){
       super();
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRechargeKwaiCoinHalfScreenDialogFragment.class, "3")) {
          return;
       }
       super.onActivityCreated(p0);
       if (!this.isAdded()) {
          return;
       }
       e uoe = this.getChildFragmentManager().beginTransaction();
       uoe.v(R.id.content_fragment, this.A);
       uoe.m();
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveRechargeKwaiCoinHalfScreenDialogFragment.class, "2");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       return a.g(p0, 0x7f0d0db9, null, false);
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, LiveRechargeKwaiCoinHalfScreenDialogFragment.class, "4")) {
          return;
       }
       super.onDestroy();
       LiveRechargeKwaiCoinHalfScreenDialogFragment tB = this.B;
       if (tB != null) {
          tB.a();
       }
       return;
    }
}
