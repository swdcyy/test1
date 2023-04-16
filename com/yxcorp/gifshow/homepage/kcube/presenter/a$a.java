package com.yxcorp.gifshow.homepage.kcube.presenter.a$a;
import fr6.i;
import com.yxcorp.gifshow.homepage.kcube.presenter.a;
import java.lang.Object;
import wq6.h;
import fr6.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Objects;
import dta.l0;
import wq6.g;
import androidx.fragment.app.Fragment;
import wq6.f;
import k2b.e0;
import dta.j0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import k2b.u1;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kwai.kcube.TabIdentifier;
import on5.n;
import com.kwai.framework.model.channel.HotChannel;
import on5.a;
import com.google.common.base.Optional;
import hb5.d;
import java.lang.Boolean;
import wkd.b;
import com.yxcorp.gifshow.w;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LaunchTimeDifferencePackage;
import android.os.SystemClock;
import android.view.View;
import hb5.b;
import msd.a;
import com.kwai.framework.kgi.sdk.Kgi;
import hsa.a;
import isa.a;
import com.yxcorp.gifshow.homepage.activity.e;
import uv8.g0;
import com.kwai.robust.PatchProxyResult;
import wo5.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import vjc.b;

public class a$a implements i	// class@00174d
{
    public final a a;

    public void a$a(a p0){
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
       ClientEvent$ElementPackage obj3;
       boolean b;
       String str1;
       l0 ol0;
       Object obj = this;
       Object obj1 = p0;
       int i = p1;
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(obj1, Integer.valueOf(p1), obj, uoa, "1")) {
          return;
       }
       uoa = obj.a;
       a q = uoa.q;
       Activity activity = uoa.getActivity();
       Objects.requireNonNull(q);
       if (!PatchProxy.isSupport(l0.class) || !PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), activity, q, l0.class, "1")) {
          l0 a = q.a;
          h oh = a.U(i);
          String str = "HOT_CHANNEL_TAB";
          Fragment uFragment = q.a.Q();
          j0 oj0 = j0.class;
          l0 obj2 = null;
          int i1 = 0;
          int i2 = 5;
          int i3 = 1;
          if (PatchProxy.isSupport(oj0)) {
             Object[] objArray = new Object[i2];
             objArray[i1] = a;
             objArray[i3] = oh;
             objArray[2] = Integer.valueOf(p1);
             objArray[3] = str;
             objArray[4] = uFragment;
             if (PatchProxy.applyVoid(objArray, obj2, oj0, "2")) {
             label_0095 :
                obj3 = obj2;
                b = false;
                str1 = 1;
             label_00aa :
                String str2 = "";
                HotChannel mId = (n.b(p0.M2()))? obj1.q("KEY_TAB_HOT_CHANNEL").mId: Optional.fromNullable(a.d(p0.M2())).or(str2);
                obj2 = q.b;
                if (PatchProxy.isSupport(d.class)) {
                   ol0 = obj2;
                   if (PatchProxy.applyVoidThreeRefs(mId, Boolean.valueOf(obj2), null, null, d.class, "11")) {
                   label_014c :
                      if (("ato_operate").equals(p0.M2().getType())) {
                         TabIdentifier tabIdentifie = p0.M2();
                         if (!PatchProxy.applyVoidOneRefs(tabIdentifie, obj3, a.class, "5")) {
                            a.d(e.a(tabIdentifie));
                         }
                         g0 og0 = g0.o0(activity);
                         TabIdentifier tabIdentifie1 = p0.M2();
                         obj3 = PatchProxy.applyOneRefs(tabIdentifie1, obj3, e.class, "2");
                         if (obj3 != PatchProxyResult.class) {
                            str2 = obj3;
                         }else {
                            a uoa1 = e.a(tabIdentifie1);
                            if (uoa1 != null) {
                               str2 = uoa1.m();
                            }
                         }
                         b uob = og0.p0(str2);
                         str = (q.b != null)? "clickTab": "scroll";
                         uob.a(str);
                      }
                      q.b = b;
                      RxBus.f.b(new b(activity));
                   }
                }else {
                   ol0 = obj2;
                }
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.name = mId;
                uElementPack.type = str1;
                int i4 = (ol0 != null)? 1: 5;
                uElementPack.status = b;
                uElementPack.action = 803;
                w ow = b.a(-1343064608);
                ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
                ClientContentWrapper$LaunchTimeDifferencePackage launchTimeDi = new ClientContentWrapper$LaunchTimeDifferencePackage();
                uContentWrap.launchTimeDifferencePackage = launchTimeDi;
                launchTimeDi.isColdStart = ow.isColdStart();
                uContentWrap.launchTimeDifferencePackage.timeDifferenceSinceAppLaunched = SystemClock.elapsedRealtime() - ow.getHomeStartTime();
                u1.K("", i4, uElementPack, null, uContentWrap, false, null);
                Kgi.c(new b(uElementPack));
                goto label_014c ;
             }
          }
          obj3 = new ClientEvent$ElementPackage();
          obj3.action2 = str;
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.tagPackage = j0.a(a, oh, i);
          if (uFragment == null) {
             u1.u(i3, obj3, uContentPack);
             goto label_0095 ;
          }else {
             str1 = 1;
             b = false;
             obj3 = obj2;
             u1.M("", uFragment, 1, obj3, uContentPack, null);
             goto label_00aa ;
          }
       }
       return;
    }
}
