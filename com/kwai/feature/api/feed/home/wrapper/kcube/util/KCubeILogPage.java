package com.kwai.feature.api.feed.home.wrapper.kcube.util.KCubeILogPage;
import k2b.e0;
import ta9.b;
import lnc.s5;
import com.kwai.feature.api.feed.home.wrapper.kcube.util.KCubeILogPage$a;
import nsd.u;
import wq6.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.feature.api.feed.home.wrapper.kcube.util.KCubeILogPage$getFollowPageRef$1;
import java.lang.Integer;
import msd.l;
import k2b.d0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import com.kwai.feature.api.feed.home.wrapper.kcube.util.KCubeILogPage$getExpTagTrans$1;
import com.kwai.feature.api.feed.home.wrapper.kcube.util.KCubeILogPage$getEntryExpTagTrans$1;
import com.kwai.feature.api.feed.home.wrapper.kcube.util.KCubeILogPage$getSubPage$1;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.feed.home.wrapper.kcube.util.KCubeILogPage$getCategory$1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.feature.api.feed.home.wrapper.kcube.util.KCubeILogPage$getContentPackageOnLeave$1;
import com.kwai.feature.api.feed.home.wrapper.kcube.util.KCubeILogPage$getScene$1;
import com.kwai.feature.api.feed.home.wrapper.kcube.util.KCubeILogPage$getContentPackage$1;
import com.kwai.feature.api.feed.home.wrapper.kcube.util.KCubeILogPage$getSubPages$1;
import wq6.e;
import wq6.g;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.kwai.feature.api.feed.home.wrapper.kcube.util.KCubeILogPage$getHostActivity$1;
import com.kwai.feature.api.feed.home.wrapper.kcube.util.KCubeILogPage$getPageId$1;
import com.kwai.feature.api.feed.home.wrapper.kcube.util.KCubeILogPage$getPage$1;
import com.kwai.feature.api.feed.home.wrapper.kcube.util.KCubeILogPage$getPageParams$1;
import com.kwai.feature.api.feed.home.wrapper.kcube.util.KCubeILogPage$getUrl$1;
import java.lang.StringBuilder;
import k2b.u1;
import java.lang.RuntimeException;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import com.kwai.feature.api.feed.home.wrapper.kcube.util.KCubeILogPage$getLogExtraName$1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kwai.feature.api.feed.home.wrapper.kcube.util.KCubeILogPage$getElementPackage$1;
import com.kwai.feature.api.feed.home.wrapper.kcube.util.KCubeILogPage$getPage2$1;
import com.kwai.feature.api.feed.home.wrapper.kcube.util.KCubeILogPage$getTopPageSuffix$1;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kwai.feature.api.feed.home.wrapper.kcube.util.KCubeILogPage$getContentWrapper$1;

public final class KCubeILogPage implements e0, b, s5	// class@000f35
{
    public int b;
    public final f c;
    public static final KCubeILogPage$a d;

    static {
       KCubeILogPage.d = new KCubeILogPage$a(null);
    }
    public void KCubeILogPage(f p0){
       super();
       this.c = p0;
    }
    public static synchronized final KCubeILogPage a(f p0){
       _monitor_enter(KCubeILogPage.class);
       Object obj = PatchProxy.applyOneRefs(p0, null, KCubeILogPage.class, "25");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(KCubeILogPage.class);
          return obj;
       }else {
          _monitor_exit(KCubeILogPage.class);
          return KCubeILogPage.d.a(p0);
       }
    }
    public int Ab(){
       Object obj = PatchProxy.apply(null, this, KCubeILogPage.class, "6");
       if (obj == PatchProxyResult.class) {
          obj = this.c(KCubeILogPage$getFollowPageRef$1.INSTANCE, Integer.valueOf(0));
       }
       return obj.intValue();
    }
    public int D4(){
       return d0.h(this);
    }
    public ClientEvent$ExpTagTrans I1(){
       Object obj = PatchProxy.apply(null, this, KCubeILogPage.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b(KCubeILogPage$getExpTagTrans$1.INSTANCE, null);
    }
    public ClientEvent$ExpTagTrans K5(){
       Object obj = PatchProxy.apply(null, this, KCubeILogPage.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b(KCubeILogPage$getEntryExpTagTrans$1.INSTANCE, null);
    }
    public int Lb(){
       Object obj = PatchProxy.apply(null, this, KCubeILogPage.class, "21");
       if (obj == PatchProxyResult.class) {
          obj = this.b(KCubeILogPage$getSubPage$1.INSTANCE, Integer.valueOf(d0.j(this)));
          a.m(obj);
       }
       return obj.intValue();
    }
    public int M(){
       Object obj = PatchProxy.apply(null, this, KCubeILogPage.class, "8");
       if (obj == PatchProxyResult.class) {
          obj = this.b(KCubeILogPage$getCategory$1.INSTANCE, Integer.valueOf(0));
          a.m(obj);
       }
       return obj.intValue();
    }
    public ClientContent$ContentPackage Nf(){
       Object obj = PatchProxy.apply(null, this, KCubeILogPage.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b(KCubeILogPage$getContentPackageOnLeave$1.INSTANCE, null);
    }
    public String P7(){
       Object obj = PatchProxy.apply(null, this, KCubeILogPage.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b(KCubeILogPage$getScene$1.INSTANCE, "");
    }
    public ClientContent$ContentPackage Q3(){
       Object obj = PatchProxy.apply(null, this, KCubeILogPage.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b(KCubeILogPage$getContentPackage$1.INSTANCE, null);
    }
    public String a2(){
       Object obj = PatchProxy.apply(null, this, KCubeILogPage.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b(KCubeILogPage$getSubPages$1.INSTANCE, "");
    }
    public final Object b(l p0,Object p1){
       Fragment obj = PatchProxy.applyTwoRefs(p0, p1, this, KCubeILogPage.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c.N().p();
       if (!obj instanceof e0) {
          obj = null;
       }
       if (obj != null) {
          p0 = p0.invoke(obj);
          if (p0 != null) {
             p1 = p0;
          }
       }
       return p1;
    }
    public final Object c(l p0,Object p1){
       Fragment obj = PatchProxy.applyTwoRefs(p0, p1, this, KCubeILogPage.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c.N().p();
       if (!obj instanceof s5) {
          obj = null;
       }
       if (obj != null) {
          p0 = p0.invoke(obj);
          if (p0 != null) {
             p1 = p0;
          }
       }
       return p1;
    }
    public Activity cd(){
       Object obj = PatchProxy.apply(null, this, KCubeILogPage.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b(KCubeILogPage$getHostActivity$1.INSTANCE, null);
    }
    public boolean eg(){
       return d0.a(this);
    }
    public int f(){
       Object obj = PatchProxy.apply(null, this, KCubeILogPage.class, "5");
       if (obj == PatchProxyResult.class) {
          obj = this.c(KCubeILogPage$getPageId$1.INSTANCE, Integer.valueOf(0));
       }
       return obj.intValue();
    }
    public int getPage(){
       Object obj = PatchProxy.apply(null, this, KCubeILogPage.class, "9");
       if (obj == PatchProxyResult.class) {
          obj = this.b(KCubeILogPage$getPage$1.INSTANCE, Integer.valueOf(0));
          a.m(obj);
       }
       return obj.intValue();
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, KCubeILogPage.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b(KCubeILogPage$getPageParams$1.INSTANCE, "");
    }
    public String getUrl(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       KCubeILogPage kCubeILogPag = KCubeILogPage.class;
       Object[] objArray = null;
       KCubeILogPage$getUrl$1 obj = PatchProxy.apply(objArray, this, kCubeILogPag, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = KCubeILogPage$getUrl$1.INSTANCE;
       String str = "";
       StringBuilder obj1 = PatchProxy.applyTwoRefs(obj, str, this, kCubeILogPag, "2");
       if (obj1 != patchProxyRe) {
          str = obj1;
       }else {
          KCubeILogPage tc = this.c;
          int i = this.b + 1;
          this.b = i;
          if (i == 10) {
             this.b = 0;
             if (!PatchProxy.applyVoidOneRefs(tc, this, kCubeILogPag, "3")) {
                e uoe = tc.N();
                Fragment uFragment = uoe.p();
                obj1 = "containerTab: "+tc.e()+", "+"currentAtomic: "+uoe.toString()+"currentFragment: ";
                String str1 = (uFragment == null)? "null": uFragment.getClass().getName();
                str1 = obj1+str1;
                String str2 = "AtomicUrlDelegeteStackOverFlow";
                if (!PatchProxy.applyVoidTwoRefs(str2, str1, this, kCubeILogPag, "4")) {
                   u1.R("XfCommonLowFreqCustomEvent", "[`"+str2+"`]"+str1, 14);
                }
                Log.e("KCubeILogPage", "getUrl StackOverFlow, "+str1, new RuntimeException());
             }
          }else {
             Fragment uFragment1 = tc.N().p();
             if (uFragment1 instanceof b) {
                objArray = uFragment1;
             }
             if (objArray != null) {
                Object obj2 = obj.invoke(objArray);
                if (obj2 != null) {
                   str = obj2;
                }
             }
             this.b = 0;
          }
       }
       return str;
    }
    public String h5(){
       Object obj = PatchProxy.apply(null, this, KCubeILogPage.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b(KCubeILogPage$getLogExtraName$1.INSTANCE, "");
    }
    public ClientEvent$ElementPackage j4(){
       Object obj = PatchProxy.apply(null, this, KCubeILogPage.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b(KCubeILogPage$getElementPackage$1.INSTANCE, null);
    }
    public String o(){
       Object obj = PatchProxy.apply(null, this, KCubeILogPage.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b(KCubeILogPage$getPage2$1.INSTANCE, "");
    }
    public String pg(){
       Object obj = PatchProxy.apply(null, this, KCubeILogPage.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b(KCubeILogPage$getTopPageSuffix$1.INSTANCE, d0.k(this));
    }
    public ClientContentWrapper$ContentWrapper ye(){
       Object obj = PatchProxy.apply(null, this, KCubeILogPage.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b(KCubeILogPage$getContentWrapper$1.INSTANCE, null);
    }
}
