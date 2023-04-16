package com.kuaishou.live.core.show.test.debug.LiveMockRouterPresenter$localBroadCastReceiver$1;
import android.content.BroadcastReceiver;
import com.kuaishou.live.core.show.test.debug.LiveMockRouterPresenter;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import rp5.a;
import lp3.c;
import lp3.e;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.component.photo.detail.slide.DetailSlidePlayFragment;
import f12.d;
import d61.s;
import kotlin.jvm.internal.a;
import d61.s$a;
import xp5.g;
import vq5.d;

public final class LiveMockRouterPresenter$localBroadCastReceiver$1 extends BroadcastReceiver	// class@00119d
{
    public final LiveMockRouterPresenter a;

    public void LiveMockRouterPresenter$localBroadCastReceiver$1(LiveMockRouterPresenter p0){
       this.a = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       boolean b;
       s$a a;
       LiveMockRouterPresenter p;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMockRouterPresenter$localBroadCastReceiver$1.class, "1")) {
          return;
       }
       if (p1 != null) {
          String stringExtra = p1.getStringExtra("live_router_scheme");
          if (stringExtra != null) {
             LiveMockRouterPresenter$localBroadCastReceiver$1 ta = this.a;
             Objects.requireNonNull(ta);
             Object[] objArray = null;
             LiveMockRouterPresenter obj = PatchProxy.apply(objArray, ta, LiveMockRouterPresenter.class, "4");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else {
                obj = ta.q;
                if (obj != null) {
                   p = ta.r;
                   if (p != null) {
                      BaseFragment uBaseFragmen = p.a(a.class).t();
                      if (uBaseFragmen instanceof DetailSlidePlayFragment) {
                         b = obj.C(uBaseFragmen);
                      }else {
                         b = true;
                      }
                   }
                }
                b = false;
             }
             if (b) {
                a = s.a;
                a.o(stringExtra, "router");
                if (a.a(stringExtra)) {
                   obj = this.a.r;
                   g og = (obj != null)? obj.a(g.class): objArray;
                   String str = (og != null)? og.d(): objArray;
                   if (og != null) {
                      objArray = og.getLiveStreamId();
                   }
                   stringExtra = a.b(stringExtra, str, objArray);
                }
                p = this.a.p;
                if (p != null) {
                   p.r4(stringExtra, p0);
                }
             }
          }
       }
       return;
    }
}
