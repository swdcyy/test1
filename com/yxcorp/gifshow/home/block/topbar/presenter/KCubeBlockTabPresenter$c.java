package com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabPresenter$c;
import fr6.i;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabPresenter;
import java.lang.Object;
import wq6.h;
import fr6.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Objects;
import wra.b;
import com.yxcorp.utility.Log;
import wq6.f;
import com.kwai.kcube.decorator.IContainerDecorator;
import wq6.g;
import pr6.d;
import po5.c;
import pr6.b;
import k2b.e0;
import ura.b;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;
import com.kwai.kcube.TabIdentifier;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import java.util.Map;
import com.yxcorp.gifshow.DefaultHelper;
import yq6.d;
import un5.a;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabPresenter$c$a;
import yq6.a;
import z1.a;
import tra.a;
import on5.b;
import uv8.r0;

public final class KCubeBlockTabPresenter$c implements i	// class@00166b
{
    public final KCubeBlockTabPresenter a;

    public void KCubeBlockTabPresenter$c(KCubeBlockTabPresenter p0){
       this.a = p0;
       super();
    }
    public void a(h p0,int p1){
       h.a(this, p0, p1);
    }
    public void b(h p0,h p1,int p2,int p3,float p4){
       h.b(this, p0, p1, p2, p3, p4);
    }
    public void c(h p0,int p1){
       KCubeBlockTabPresenter s;
       boolean b;
       KCubeBlockTabPresenter kCubeBlockTa = KCubeBlockTabPresenter.class;
       KCubeBlockTabPresenter$c uoc = KCubeBlockTabPresenter$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "1")) {
          return;
       }
       a.p(p0, "tab");
       KCubeBlockTabPresenter$c ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.isSupport(kCubeBlockTa) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p1), ta, kCubeBlockTa, "9")) {
          KCubeBlockTabPresenter t = ta.t;
          if (t == null) {
             a.S("mHomeBlockViewState");
          }
          if (!t.c()) {
             Log.b("BLOCK_APP_BAR", "logTabClick");
             t = ta.s;
             if (t == null) {
                a.S("mContainerDecorator");
             }
             h oh = t.c().U(p1);
             b = false;
             s = ta.s;
             if (s == null) {
                a.S("mContainerDecorator");
             }
             b c = c.C;
             a.o(c, "HomeFragmentFuncIds.LOG_PAGE");
             e0 uoe0 = s.e().e(c);
             b.b(oh, p1, "HOT_CHANNEL_TAB", b, uoe0);
          }
       }
       Set set = this.a.v.keySet();
       a.o(set, "mMap.keys");
       Iterator iterator = set.iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          if (TextUtils.n(str, KCubeBlockTabPresenter.P8(this.a).c().U(p1).M2().getId())) {
             this.a.v.put(str, Boolean.TRUE);
          }
       }
       DefaultHelper.h(this.a.v);
       ta = this.a;
       if (ta.p != null) {
          a g = a.g;
          a.o(g, "HomeCommonAction.RECYCLERVIEW_REFRESH_ENABLE");
          KCubeBlockTabPresenter.P8(ta).c().d().e(g, new KCubeBlockTabPresenter$c$a(this));
       }
       DefaultHelper.a();
       a.j(Boolean.TRUE);
       ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.isSupport(kCubeBlockTa) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p1), ta, kCubeBlockTa, "7")) {
          kCubeBlockTa = ta.s;
          if (kCubeBlockTa == null) {
             a.S("mContainerDecorator");
          }
          TabIdentifier tabIdentifie = kCubeBlockTa.c().M2();
          if (a.g(tabIdentifie, b.F)) {
             s = ta.s;
             if (s == null) {
                a.S("mContainerDecorator");
             }
             r0.c(s.c().U(p1).M2());
          }else if(a.g(tabIdentifie, b.G)){
             s = ta.s;
             if (s == null) {
                a.S("mContainerDecorator");
             }
             TabIdentifier tabIdentifie1 = s.c().U(p1).M2();
             if (!PatchProxy.applyVoidOneRefs(tabIdentifie1, null, r0.class, "11")) {
                a.i(tabIdentifie1.getId());
             }
          }
       }
    label_0160 :
       return;
    }
}
