package com.kuaishou.merchant.basic.foldadapter.LiveMerchantFoldWrapperActivity$FoldWrapperFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import gt3.f;
import androidx.fragment.app.c;
import com.yxcorp.gifshow.util.rx.RxBus;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import xm4.a;

public final class LiveMerchantFoldWrapperActivity$FoldWrapperFragment extends BaseFragment	// class@0015b2
{
    public String j;
    public static final int k;

    public void LiveMerchantFoldWrapperActivity$FoldWrapperFragment(){
       super();
    }
    public boolean Zg(){
       return false;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantFoldWrapperActivity$FoldWrapperFragment.class, "3")) {
          return;
       }
       super.onActivityCreated(p0);
       f uof = new f(this.getActivity());
       uof.b = this.j;
       uof.c = this.getChildFragmentManager();
       RxBus.f.b(uof);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveMerchantFoldWrapperActivity$FoldWrapperFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.d(p0, 0x7f0d04c6, p1, false);
    }
}
