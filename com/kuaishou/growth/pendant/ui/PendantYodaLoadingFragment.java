package com.kuaishou.growth.pendant.ui.PendantYodaLoadingFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import b9c.b0;
import b9c.w;
import b9c.a;
import b9c.c;
import nsd.u;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import java.lang.System;
import nf0.c;
import com.google.common.collect.ImmutableMap$b;
import com.google.common.collect.ImmutableMap;
import java.lang.Long;

public final class PendantYodaLoadingFragment extends BaseFragment	// class@0006f1
{
    public PresenterV2 j;

    public void PendantYodaLoadingFragment(){
       super(null, null, null, null, 15, null);
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, PendantYodaLoadingFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       return a.g(p0, 0x7f0d110b, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, PendantYodaLoadingFragment.class, "3")) {
          return;
       }
       super.onDestroyView();
       PendantYodaLoadingFragment tj = this.j;
       if (tj != null) {
          tj.destroy();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       String str1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PendantYodaLoadingFragment.class, "2")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       p1 = this.getArguments();
       String str = "PENDANT_LOAD_URL";
       if (p1 != null) {
          str1 = p1.getString(str, "");
          if (str1 != null) {
          label_002c :
             Bundle arguments = this.getArguments();
             long longx = (arguments != null)? arguments.getLong("PENDANT_CLICK_TIME_STAMP", System.currentTimeMillis()): System.currentTimeMillis();
             PresenterV2 presenterV2 = new PresenterV2();
             this.j = presenterV2;
             presenterV2.U7(new c());
             presenterV2.f(p0);
             Object[] objArray = new Object[]{ImmutableMap.builder().c("FRAGMENT", presenterV2).c(str, str1).c("PENDANT_CLICK_TIME_STAMP", Long.valueOf(longx)).a()};
             presenterV2.i(objArray);
             return;
          }
       }
       this.requireActivity().finish();
       str1 = this;
       goto label_002c ;
    }
}
