package com.yxcorp.gifshow.homepage.kcube.presenter.j$a;
import androidx.slidingpanelayout.widget.SlidingPaneLayout$d;
import com.yxcorp.gifshow.homepage.kcube.presenter.j;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;
import java.lang.Float;
import java.util.Objects;
import com.yxcorp.gifshow.util.rx.RxBus;
import ju5.b;
import gsa.l0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$FeatureSwitchPackage;
import wh5.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import k2b.u1;
import wkd.b;
import tka.m;
import com.kwai.framework.preference.startup.GameCenterConfig;
import com.yxcorp.gifshow.homepage.wiget.a;
import nc5.i;
import java.lang.Integer;
import java.lang.Boolean;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;
import java.lang.Double;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;

public class j$a implements SlidingPaneLayout$d	// class@001760
{
    public final j a;

    public void j$a(j p0){
       this.a = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$a.class, "3")) {
          return;
       }
       Iterator iterator = this.a.q.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0);
       }
       return;
    }
    public void b(View p0,float p1){
       j$a uoa = j$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, uoa, "1")) {
          return;
       }
       Iterator iterator = this.a.q.iterator();
       while (iterator.hasNext()) {
          iterator.next().b(p0, p1);
       }
       j$a ta = this.a;
       Objects.requireNonNull(ta);
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && (!PatchProxy.applyVoidOneRefs(Float.valueOf(p1), ta, oj, "4") && (ta.r == null && p1 - null > 0))) {
          RxBus.f.b(new b());
          ta.r = true;
       }
    label_005d :
       return;
    }
    public void c(View p0){
       boolean b;
       String str1;
       l0 ol0 = l0.class;
       String str = "2";
       if (PatchProxy.applyVoidOneRefs(p0, this, j$a.class, str)) {
          return;
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, objArray, ol0, "1")) {
          ClientContent$FeatureSwitchPackage uFeatureSwit = new ClientContent$FeatureSwitchPackage();
          uFeatureSwit.name = "child_lock";
          uFeatureSwit.on = c.b();
          ClientEvent$ElementPackage uElementPack1 = new ClientEvent$ElementPackage();
          uElementPack1.type = 1;
          uElementPack1.name = "child_lock";
          uElementPack1.action = 1072;
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.featureSwitchPackage = uFeatureSwit;
          ClientEvent$ShowEvent showEvent1 = new ClientEvent$ShowEvent();
          showEvent1.contentPackage = uContentPack;
          showEvent1.elementPackage = uElementPack1;
          u1.g0(showEvent1);
       }
       if (!PatchProxy.applyVoid(objArray, objArray, ol0, str)) {
          GameCenterConfig gameCenterCo = b.a(0x668f8fc7).a();
          if (gameCenterCo != null && (gameCenterCo.mEnableEntrance != null && !c.b())) {
             a uoa = a.b();
             int i = 1539;
             GameCenterConfig mGuidanceTit = gameCenterCo.mGuidanceTitle;
             gameCenterCo = gameCenterCo.mGuidanceId;
             b = i.c(1028);
             Objects.requireNonNull(uoa);
             if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(i), mGuidanceTit, gameCenterCo, Boolean.valueOf(b), uoa, a.class, "5")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action = i;
                uElementPack.name = TextUtils.k(mGuidanceTit);
                if (TextUtils.x(gameCenterCo)) {
                   str1 = "0";
                }
                uElementPack.value = Double.valueOf(str1).doubleValue();
                uElementPack.index = b;
                ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
                showEvent.elementPackage = uElementPack;
                showEvent.status = 1;
                showEvent.type = 6;
                ClientEvent$UrlPackage urlPackage = u1.k();
                if (urlPackage != null) {
                   urlPackage.page = 46;
                   urlPackage.page2 = "MENU";
                }
                u1.z0(urlPackage, showEvent);
             }
          }
       }
       Iterator iterator = this.a.q.iterator();
       while (iterator.hasNext()) {
          iterator.next().c(p0);
       }
       return;
    }
}
