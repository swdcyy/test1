package com.yxcorp.gifshow.magic.ui.magicemoji.swap.album.MagicMultiSelectSelectedItemViewBinder;
import com.yxcorp.gifshow.album.viewbinder.MultiSelectSelectedItemViewBinder;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import ag6.a;
import ec7.a;
import java.util.List;
import androidx.lifecycle.ViewModel;
import java.lang.Integer;
import com.yxcorp.gifshow.models.QMedia;
import com.yxcorp.gifshow.models.EmptyQMedia;

public final class MagicMultiSelectSelectedItemViewBinder extends MultiSelectSelectedItemViewBinder	// class@001c35
{
    public View m;

    public void MagicMultiSelectSelectedItemViewBinder(Fragment p0,int p1){
       a.p(p0, "fragment");
       super(p0, p1);
    }
    public void e(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicMultiSelectSelectedItemViewBinder.class, "2")) {
          return;
       }
       a.p(p0, "rootView");
       super.e(p0);
       this.m = p0.findViewById(0x7f0a3837);
       return;
    }
    public View f(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MagicMultiSelectSelectedItemViewBinder.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       View view = a.c(p0, R.layout.arg_RES_7f0d0ec3, p1, false);
       a.o(view, "inflater.inflate\(R.layou¡­d_item, container, false\)");
       return view;
    }
    public void i(a p0,int p1,List p2,ViewModel p3){
       MagicMultiSelectSelectedItemViewBinder tm;
       if (PatchProxy.isSupport(MagicMultiSelectSelectedItemViewBinder.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, MagicMultiSelectSelectedItemViewBinder.class, "3")) {
          return;
       }
       a.p(p0, "adapter");
       a.p(p2, "payloads");
       super.i(p0, p1, p2, p3);
       p0 = p0.M0(p1);
       if (p0 instanceof QMedia && !p0 instanceof EmptyQMedia) {
          tm = this.m;
          if (tm != null) {
             tm.setVisibility(0);
          }
       }else {
          tm = this.m;
          if (tm != null) {
             tm.setVisibility(8);
          }
       }
       return;
    }
}
