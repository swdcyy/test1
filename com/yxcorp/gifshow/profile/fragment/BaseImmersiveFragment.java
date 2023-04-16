package com.yxcorp.gifshow.profile.fragment.BaseImmersiveFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import b9c.b0;
import b9c.w;
import b9c.a;
import b9c.c;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;
import android.os.Bundle;
import kotlin.jvm.internal.a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import z5c.k1;
import android.view.View;
import android.content.res.Configuration;
import lnc.d2;
import ekd.m1;

public class BaseImmersiveFragment extends BaseFragment	// class@001301
{
    public View j;
    public HashMap k;

    public void BaseImmersiveFragment(){
       super(null, null, null, null, 15, null);
    }
    public void ch(){
       if (PatchProxy.applyVoid(null, this, BaseImmersiveFragment.class, "5")) {
          return;
       }
       BaseImmersiveFragment tk = this.k;
       if (tk != null) {
          tk.clear();
       }
       return;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseImmersiveFragment.class, "2")) {
          return;
       }
       super.onActivityCreated(p0);
       BaseImmersiveFragment tj = this.j;
       if (tj == null) {
          a.S("mActionBarView");
       }
       k1.b(tj, k1.a(this.getActivity()));
       return;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseImmersiveFragment.class, "3")) {
          return;
       }
       a.p(p0, "newConfig");
       super.onConfigurationChanged(p0);
       d2.n();
       BaseImmersiveFragment tj = this.j;
       if (tj == null) {
          a.S("mActionBarView");
       }
       k1.b(tj, k1.a(this.getActivity()));
       return;
    }
    public void onDestroyView(){
       super.onDestroyView();
       this.ch();
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseImmersiveFragment.class, "1")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       p0 = m1.f(p0, R.id.title_root);
       a.o(p0, "ViewBindUtils.bindWidget\(view, R.id.title_root\)");
       this.j = p0;
       return;
    }
}
