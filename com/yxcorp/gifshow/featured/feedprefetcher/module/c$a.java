package com.yxcorp.gifshow.featured.feedprefetcher.module.c$a;
import androidx.fragment.app.c$b;
import com.yxcorp.gifshow.featured.feedprefetcher.module.c;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import iea.e;
import pea.b;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import brd.t;
import sea.k;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.yxcorp.gifshow.featured.feedprefetcher.module.PhotoPrefetcherInitModule;
import lnc.b9;

public class c$a extends c$b	// class@000fc7
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public void b(c p0,Fragment p1,Context p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c$a.class, "1")) {
          return;
       }
       if (p1 instanceof BaseFragment && p1 instanceof e) {
          BaseFragment uBaseFragmen = p1;
          if (p1.y3()) {
             b.g("InitModule onFragmentAttached feature_page or thanos_hot");
             p1.w = uBaseFragmen.Vg().i().subscribe(new k(this), Functions.d());
          }
       }
       return;
    }
    public void e(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c$a.class, "2")) {
          return;
       }
       if (p1 instanceof e && p1.y3()) {
          p0.t = false;
          b.g("InitModule onFragmentDetached feature_page or thanos_hot");
          b9.a(this.a.c.w);
       }
       return;
    }
}
