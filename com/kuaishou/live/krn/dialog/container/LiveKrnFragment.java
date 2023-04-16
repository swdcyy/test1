package com.kuaishou.live.krn.dialog.container.LiveKrnFragment;
import s63.c;
import com.kwai.kds.krn.api.page.KwaiRnFragment;
import com.kuaishou.live.krn.dialog.container.LiveKrnFragment$Companion;
import nsd.u;
import crd.a;
import com.kuaishou.live.jsbridge.LiveKrnPageKey;
import lp3.e;
import o63.c;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.jsbridge.rn.LiveKrnDialogData;
import o63.d;
import androidx.fragment.app.Fragment;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import java.lang.Number;
import java.lang.Integer;
import android.view.View;
import android.os.Bundle;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import com.kuaishou.krn.model.LaunchModel;
import pp.c;
import com.kuaishou.android.live.log.b;
import sq5.a;
import lp3.c;
import sq5.b;
import com.kwai.feature.api.live.base.service.perf.LivePerfBizType;
import zj0.x;
import java.util.HashMap;
import x86.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import xp5.i;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import aq5.d;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AnchorBizRelation;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;

public final class LiveKrnFragment extends KwaiRnFragment implements c	// class@001d57
{
    public d C;
    public final a D;
    public String E;
    public c F;
    public e G;
    public HashMap H;
    public static final LiveKrnFragment$Companion I;

    static {
       LiveKrnFragment.I = new LiveKrnFragment$Companion(null);
    }
    public void LiveKrnFragment(){
       super();
       this.D = new a();
    }
    public static final LiveKrnFragment ch(LiveKrnPageKey p0,e p1,c p2,Map p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, LiveKrnFragment.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveKrnFragment$Companion.c(LiveKrnFragment.I, p0, p1, p2, p3, false, 16, null);
    }
    public static final LiveKrnFragment dh(LiveKrnDialogData p0,e p1,c p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, LiveKrnFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveKrnFragment.I.b(p0, p1, p2, false);
    }
    public void L(){
       if (PatchProxy.applyVoid(null, this, LiveKrnFragment.class, "8")) {
          return;
       }
       LiveKrnFragment tF = this.F;
       if (tF != null) {
          tF.L();
       }
       return;
    }
    public boolean b1(Fragment p0,String p1){
       int i1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Fragment obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveKrnFragment.class, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       a.p(p0, "fragment");
       obj = this.getParentFragment();
       int i = 0;
       if (obj == null) {
          return i;
       }
       a.o(obj, "parentFragment ?: return false");
       e uoe = obj.getChildFragmentManager().beginTransaction();
       uoe.z(R.anim.arg_RES_7f010109, 0x7f01004c, R.anim.arg_RES_7f01004a, 0x7f010112);
       Object[] objArray = null;
       Object obj1 = PatchProxy.apply(objArray, this, LiveKrnFragment.class, "1");
       if (obj1 != patchProxyRe) {
          i1 = obj1.intValue();
       }else {
          LiveKrnFragment tF = this.F;
          if (tF != null) {
             Integer integer = tF.I2();
             if (integer != null) {
                objArray = integer;
             }else {
             label_0059 :
                Fragment parentFragme = this.getParentFragment();
                if (parentFragme != null) {
                   View view = parentFragme.requireView();
                   if (view != null) {
                      objArray = Integer.valueOf(view.getId());
                   }
                }
             }
          }else {
             goto label_0059 ;
          }
          if (objArray != null) {
             i = objArray.intValue();
          }
          i1 = i;
       }
       uoe.v(i1, p0);
       uoe.j(p1);
       uoe.m();
       return true;
    }
    public String f(){
       return this.E;
    }
    public void l0(boolean p0){
       if (PatchProxy.isSupport(LiveKrnFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveKrnFragment.class, "10")) {
          return;
       }
       LiveKrnFragment tF = this.F;
       if (tF != null) {
          tF.l0(p0);
       }
       return;
    }
    public void n0(){
       if (PatchProxy.applyVoid(null, this, LiveKrnFragment.class, "9")) {
          return;
       }
       LiveKrnFragment tF = this.F;
       if (tF != null) {
          tF.n0();
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveKrnFragment.class, "4")) {
          return;
       }
       super.onCreate(p0);
       b.Z(LiveLogTag.LIVE_KRN_DIALOG, "LiveKrnFragment.onCreate: "+this.Wg());
       LiveKrnFragment tG = this.G;
       if (tG == null) {
          a.S("serviceManager");
       }
       String str = this.Wg().a();
       a.o(str, "mLaunchModel.bundleId");
       if (!PatchProxy.applyVoidTwoRefs(tG, str, this, LiveKrnFragment.class, "6") && !tG.b()) {
          a uoa = tG.c(a.class);
          if (uoa != null) {
             a.o(uoa, "serviceManager.getServic\x20\x02ce::class.java\) ?: return\x00");
             uoa.Hc(new b().c(LivePerfBizType.KRN).d(str));
          }
       }
       try{
          this.E = this.Wg().g().getString("pageId");
          tG = this.F;
          if (tG != null) {
             x ox = tG.ea();
             if (ox != null) {
                this.Gg(ox);
             }
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, LiveKrnFragment.class, "5")) {
          return;
       }
       LiveKrnFragment tF = this.F;
       if (tF != null) {
          x ox = tF.ea();
          if (ox != null) {
             this.Rb(ox);
          }
       }
       this.D.dispose();
       super.onDestroy();
       tF = this.G;
       if (tF == null) {
          a.S("serviceManager");
       }
       String str = this.Wg().a();
       a.o(str, "mLaunchModel.bundleId");
       if (!PatchProxy.applyVoidTwoRefs(tF, str, this, LiveKrnFragment.class, "7") && !tF.b()) {
          a uoa = tF.c(a.class);
          if (uoa != null) {
             a.o(uoa, "serviceManager.getServic\x20\x02ce::class.java\) ?: return\x00");
             uoa.zm(new b().c(LivePerfBizType.KRN).d(str));
          }
       }
       return;
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, LiveKrnFragment.class, "13")) {
       }else {
          LiveKrnFragment tH = this.H;
          if (tH != null) {
             tH.clear();
          }
       }
       return;
    }
    public boolean v0(Fragment p0,String p1){
       Fragment obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveKrnFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "fragment");
       obj = this.getParentFragment();
       if (obj == null) {
          return false;
       }
       a.o(obj, "parentFragment ?: return false");
       e uoe = obj.getChildFragmentManager().beginTransaction();
       uoe.z(R.anim.arg_RES_7f010109, 0x7f01004c, R.anim.arg_RES_7f01004a, 0x7f010112);
       View view = this.requireView();
       a.o(view, "requireView\(\)");
       uoe.g(view.getId(), p0, p1);
       e uoe1 = uoe.E(p0);
       uoe1.j(p1);
       uoe1.m();
       return true;
    }
    public a we(String p0){
       int i;
       LiveKrnFragment obj = PatchProxy.applyOneRefs(p0, this, LiveKrnFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.G;
       String str = "serviceManager";
       if (obj == null) {
          a.S(str);
       }
       if (obj.b()) {
          return null;
       }else if(p0 == null){
          int i1 = p0.hashCode();
          if (i1 != 0x122c474) {
             if (i1 == 0x514674c2 && p0.equals("addElementShowEvent")) {
                i = 9;
             label_0048 :
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                LiveKrnFragment tG = this.G;
                if (tG == null) {
                   a.S(str);
                }
                c uoc = tG.a(i.class);
                a.o(uoc, "serviceManager.getServic¡­kageProvider::class.java\)");
                uContentPack.liveStreamPackage = uoc.a();
                LiveKrnFragment tG1 = this.G;
                if (tG1 == null) {
                   a.S(str);
                }
                d uod = tG1.c(d.class);
                if (uod != null && (uod.r2(AudienceBizRelation.VOICE_PARTY) || uod.r2(AnchorBizRelation.VOICE_PARTY))) {
                   uContentPack.liveVoicePartyPackage = uoc.b4();
                }
                return new a(i, uContentPack, null, null);
             }
          }else if(p0.equals("addTaskEvent")){
             i = 1;
             goto label_0048 ;
          }
       }
       i = 0;
       goto label_0048 ;
    }
}
