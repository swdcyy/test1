package l90.m;
import u80.j;
import java.lang.Object;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import t90.h;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.kuaishou.gifshow.kuaishan.utils.e;
import s00.a;
import u80.e;
import w46.b;
import brd.t;
import com.kuaishou.gifshow.kuaishan.logic.h1;
import com.yxcorp.gifshow.activity.GifshowActivity;
import g26.d;
import com.kwai.feature.post.api.feature.kuaishan.model.KSException;
import java.lang.Throwable;
import t45.d;
import brd.z;
import l90.k;
import erd.o;
import android.app.Activity;
import java.lang.Runnable;
import java.lang.Integer;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager;
import l90.l;
import java.lang.StringBuilder;
import ekd.a0;
import java.io.File;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import u80.d;
import java.util.List;
import com.kuaishou.gifshow.kuaishan.logic.m1;
import com.kuaishou.gifshow.kuaishan.logic.o1;
import java.lang.IllegalArgumentException;
import android.content.Context;
import com.kuaishou.gifshow.kuaishan.KSSource;
import com.kwai.feature.post.api.feature.memory.MemorySceneType;
import q87.c;
import com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX;
import com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX$a;
import java.util.Objects;
import t90.f;
import t90.d;
import t90.e;
import l90.h;
import io.reactivex.g;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.gifshow.kuaishan.logic.h1$a;
import java.util.ArrayList;
import com.kuaishou.gifshow.kuaishan.logic.KSResourceDownloader;
import com.kuaishou.gifshow.kuaishan.logic.u0;
import com.kuaishou.gifshow.kuaishan.logic.v0;
import x80.v1;
import x80.g1;
import java.lang.Iterable;
import x80.d1;
import java.lang.Number;
import java.util.concurrent.CopyOnWriteArrayList;
import t36.f;
import crd.a;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import j90.a;
import java.util.HashSet;
import n3d.a;
import com.kuaishou.gifshow.kuaishan.ui.album.KSPostAlbumProcessActivity;
import com.yxcorp.gifshow.postwork.PostWorkErrorTips;
import com.yxcorp.gifshow.util.PostUtils;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import android.content.Intent;
import ekd.j0;
import com.kuaishou.gifshow.kuaishan.model.KSLaunchParams$b;
import com.kuaishou.gifshow.kuaishan.model.KSLaunchParams;
import com.kuaishou.gifshow.kuaishan.ui.edit.KuaiShanEditActivityV2;
import lnc.g7;
import x80.j1;
import com.kuaishou.gifshow.kuaishan.logic.t0;
import l90.i;
import l90.j;
import erd.g;
import crd.b;
import ekd.q;
import com.kuaishou.gifshow.kuaishan.logic.s0;
import x80.p1;
import erd.r;
import brd.w;
import x80.n1;
import com.kwai.feature.post.api.feature.kuaishan.model.KuaishanPageParam;
import mm6.c;
import com.kuaishou.gifshow.kuaishan.ui.feed.KSFeedGroupPagerFragment;
import com.kuaishou.gifshow.kuaishan.ui.feed.KSFeedGroupPagerFragment$a;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import androidx.fragment.app.Fragment;
import com.kwai.video.clipkit.mv.EditorSdk2MvCreationResult;
import com.kwai.video.editorsdk2.EditorSdk2Utils$PreviewSizeLimitation;
import rk7.a;
import com.kuaishou.gifshow.kuaishan.logic.c1;

public class m implements j	// class@002539
{

    public void m(){
       super();
    }
    public boolean AL(c p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, m.class, "27");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.applyOneRefs(p0, null, h.class, "3");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "draft");
          b = DraftUtils.P(p0);
       }
       return b;
    }
    public byte[] C00(byte[] p0){
       Object obj1;
       Object[] objArray;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, m.class, "25");
       if (obj != patchProxyRe) {
          return obj;
       }
       try{
          obj1 = null;
          byte[] obj2 = PatchProxy.applyOneRefs(p0, obj1, e.class, "57");
          if (obj2 != patchProxyRe) {
             obj1 = obj2;
          }else {
             int i = 0;
             obj2 = ("42779bd57531b5a484cde2c4e7af2e88").getBytes("UTF-8");
             try{
                p0 = a.a(obj2, "89ce48561bc3e6ae", p0);
                if (p0 != null && p0.length > 0) {
                   obj1 = p0;
                }
             }catch(java.lang.RuntimeException e0){
                objArray = new Object[e0];
                e.D().t("KSUtil", "failed to decrypt kuaishan video", objArray);
             }
          }
       }catch(java.io.UnsupportedEncodingException e0){
          objArray = new Object[e0];
          e.D().t("KSUtil", "failed to get currentKey", objArray);
       }
       return obj1;
    }
    public t G30(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, m.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return h1.h(p0);
    }
    public boolean JN(){
       Object obj = PatchProxy.apply(null, this, m.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.z();
    }
    public t L3(GifshowActivity p0,String p1,String p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, m.class, "14");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       if (!d.b()) {
          return t.error(new KSException(-17, "KuaiShan is not support"));
       }
       return this.G30(p1).observeOn(d.c).flatMap(new k(p2, p1));
    }
    public void Lt(Activity p0,Runnable p1,Runnable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, m.class, "19")) {
          return;
       }
       e.E(p0, p1, p2);
       return;
    }
    public t MJ(int p0){
       m om = m.class;
       if (PatchProxy.isSupport(om)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, om, "17");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return KSDataManager.B0().C0(String.valueOf(p0)).map(l.b);
    }
    public String NF(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, m.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new File(e.h(), a0.c(p0)+".mp4").getAbsolutePath();
    }
    public boolean TT(KSTemplateDetailInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, m.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.q(p0);
    }
    public void Xr(Activity p0,Runnable p1,Runnable p2,String p3,String p4){
       m om = m.class;
       if (PatchProxy.isSupport(om)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, om, "22")) {
             return;
          }
       }
       e.C(p0, p1, p2, p3, p4);
       return;
    }
    public t cc(d p0,List p1,String p2,boolean p3){
       if (PatchProxy.isSupport(m.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, m.class, "29");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       e.w("reSetupMedias media list size="+p1.size()+", refId="+p2);
       m1.w0().y0(p0);
       o1 oo1 = m1.w0().v0();
       if (oo1 == null || !oo1.H0()) {
          return t.error(new IllegalArgumentException("project is not ready"));
       }else {
          return oo1.O0(p1, p2, p3).observeOn(d.c);
       }
    }
    public t d60(Context p0,KSTemplateDetailInfo p1,String p2,List p3,KSSource p4,boolean p5,MemorySceneType p6){
       Object[] objArray;
       h obj;
       t ot;
       t ot1;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p4;
       object oobject5 = p6;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       m om = m.class;
       int i = 6;
       int i1 = 7;
       int i2 = 2;
       int i3 = 5;
       if (PatchProxy.isSupport(om)) {
          objArray = new Object[i1];
          objArray[0] = oobject;
          objArray[1] = oobject1;
          objArray[i2] = oobject2;
          objArray[3] = oobject3;
          objArray[4] = oobject4;
          objArray[i3] = Boolean.valueOf(p5);
          objArray[i] = oobject5;
          obj = PatchProxy.apply(objArray, this, om, "6");
          if (obj != patchProxyRe) {
             return obj;
          }
       }else {
          i3 = this;
       }
       obj = h.class;
       if (PatchProxy.isSupport(obj)) {
          objArray = new Object[i1];
          objArray[0] = oobject;
          objArray[1] = oobject1;
          objArray[i2] = oobject2;
          objArray[3] = oobject3;
          objArray[4] = oobject4;
          objArray[5] = Boolean.valueOf(p5);
          objArray[6] = oobject5;
          ot = PatchProxy.apply(objArray, null, obj, "1");
          if (ot != patchProxyRe) {
          }else {
          label_006f :
             a.p(oobject, "context");
             a.p(oobject1, "templateInfo");
             a.p(oobject3, "mediaList");
             a.p(oobject4, "ksSource");
             Object[] objArray1 = new Object[0];
             e.D().w("KSFlexibleTemplateHelper", "applyFlexibleKuaiShanProject invoked with templateId = "+oobject1.mTemplateId+", warmUpPath = "+oobject2, objArray1);
             if (!d.b()) {
                ot = t.error(new KSException(-17, "kuaishan is incompatible"));
                a.o(ot, "Observable.error\(KSExcep¡­n is \" + \"incompatible\"\)\)");
             }else {
                oobject1.mExternalTemplateFolderPath = oobject2;
                String str = KSDownloadHelperX.o.d(oobject1);
                o1 oo1 = new o1(oobject1, str);
                h b = h.b;
                Objects.requireNonNull(b);
                if (PatchProxy.isSupport(obj)) {
                   objArray1 = new Object[]{oobject,oobject1,str,oobject3,oobject5};
                   ot1 = PatchProxy.apply(objArray1, b, obj, "10");
                   if (ot1 != patchProxyRe) {
                   label_0125 :
                      d uod = new d(p3, p1, str, oo1, p6, p5);
                      ot = ot1.flatMap(objArray1).takeLast(1).map(new e(oo1));
                      a.o(ot, "generateCustomImageForCl¡­       .map { ksProject }");
                   }
                }
                Object[] objArray2 = new Object[0];
                e.D().w("KSFlexibleTemplateHelper", "generateCustomImageForClips invoked with mediaList: "+oobject3, objArray2);
                ot1 = t.just(p3).observeOn(d.c).map(new f(oobject, str, oobject1, oobject5));
                a.o(ot1, "Observable.just\(mediaLis¡­\n          true\n        }");
                goto label_0125 ;
             }
          }
       }else {
          goto label_006f ;
       }
       return ot;
    }
    public t e20(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, m.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.create(new h(p0, p1));
    }
    public t eZ(String p0,KSTemplateDetailInfo p1,boolean p2){
       t obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(m.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, m.class, "4");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (PatchProxy.isSupport(h1.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, h1.class, "5");
          if (obj != patchProxyRe) {
          }else {
          label_003d :
             Object[] objArray = new Object[0];
             e.D().w("KuaiShanAPI", "downloadKuaiShanTemplate\(\) called with: downloadSourceType = ["+p0+"], templateInfo = ["+p1+"]", objArray);
             if (!d.b()) {
                obj = t.error(new KSException(-17, "kuaishan is incompatible"));
             }else if(TextUtils.x(p0)){
                obj = t.error(new IllegalArgumentException("downloadSourceType is empty"));
             }else {
                h1$a uoa = new h1$a();
                int i = (p2)? 100: 85;
                ArrayList uArrayList = new ArrayList();
                uArrayList.add(KSResourceDownloader.d().c(p1).map(u0.b));
                uArrayList.add(KSDownloadHelperX.p(p1).map(uoa.b));
                uArrayList.add(KSDownloadHelperX.h(p1, p0, 0).map(new v1(i)));
                if (!p2) {
                   uArrayList.add(h1.l(KSDownloadHelperX.n(p1), p1, p0, 0).map(new g1(uoa, i)));
                }
                obj = t.concat(uArrayList).map(new d1(uoa));
             }
          }
       }else {
          goto label_003d ;
       }
       return obj;
    }
    public int fX(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(null, this, m.class, "10");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = PatchProxy.apply(null, null, h.class, "4");
       int i = (obj != patchProxyRe)? obj.intValue(): h.a.size();
       return i;
    }
    public void fd(){
       if (PatchProxy.applyVoid(null, this, m.class, "16")) {
          return;
       }
       KSDataManager kSDataManage = KSDataManager.B0();
       Objects.requireNonNull(kSDataManage);
       KSDataManager kSDataManage1 = KSDataManager.class;
       if (!PatchProxy.applyVoid(null, kSDataManage, kSDataManage1, "24")) {
          Object[] objArray = new Object[0];
          e.D().w("KSDataManager", "clearData\(\) invoked", objArray);
          if (!PatchProxy.applyVoid(null, kSDataManage, kSDataManage1, "23")) {
             Object[] objArray1 = new Object[0];
             e.D().w("KSDataManager", "disconnect\(\) invoked", objArray1);
             kSDataManage.b();
             kSDataManage.g.dispose();
             kSDataManage.g = new a();
             Iterator iterator = kSDataManage.j.values().iterator();
             while (iterator.hasNext()) {
                a uoa = iterator.next();
                a.o(uoa, "pageList");
                kSDataManage.D0(uoa);
             }
             kSDataManage.j.clear();
          }
          kSDataManage.i.clear();
          kSDataManage.h.clear();
          kSDataManage.l.clear();
          kSDataManage.m = null;
          kSDataManage.d = null;
          kSDataManage.f = 0;
          kSDataManage.e = null;
          kSDataManage.n = null;
          kSDataManage.u0();
       }
       return;
    }
    public void fy(GifshowActivity p0,d p1,ArrayList p2,boolean p3,a p4){
       m om = m.class;
       int i = 0;
       if (PatchProxy.isSupport(om)) {
          Object[] objArray = new Object[]{p0,p1,p2,Boolean.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, om, "13")) {
             return;
          }
       }
       if (!d.b() || !p1 instanceof o1) {
          Object[] objArray1 = new Object[i];
          e.D().t("KuaiShanPostPluginImpl", "startKuaiShanAlbumActivity launch failed, not support", objArray1);
          return;
       }else {
          KSPostAlbumProcessActivity.C3(p0, p1, p2, null, true, p3, false, "", p4);
          return;
       }
    }
    public void g40(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "11")) {
          return;
       }
       h1.a(p0);
       return;
    }
    public t gt(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, m.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return h1.c(p0, p1);
    }
    public boolean isAvailable(){
       return true;
    }
    public void iy(GifshowActivity p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, m.class, "30")) {
          return;
       }
       if (e.s(p1)) {
          PostWorkErrorTips.b(R.string.arg_RES_7f1043cd);
       }else {
          e.p(p1);
       }
       return;
    }
    public byte[] ld(byte[] p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, m.class, "24");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.applyOneRefs(p0, null, e.class, "56");
       byte[] uobyteArray = (obj != patchProxyRe)? obj: a.b(("42779bd57531b5a484cde2c4e7af2e88").getBytes("UTF-8"), "89ce48561bc3e6ae", p0);
    }
    public final void n(Activity p0,d p1,VideoContext p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, m.class, "23")) {
          return;
       }
       String str = j0.f(p0.getIntent(), "photo_task_id");
       KSLaunchParams$b uob = new KSLaunchParams$b();
       uob.h(p1.getTemplateId());
       uob.b((j0.a(p0.getIntent(), "returnToOriginalPage", false) ^ 0x01));
       uob.c(p1.getGroupId());
       if (!TextUtils.x(str)) {
          uob.g(str);
       }
       if (p2 != null) {
          uob.k = p2;
       }
       m1.w0().y0(p1);
       KuaiShanEditActivityV2.I3(uob.a(), p1, p0);
       return;
    }
    public boolean oT(KSTemplateDetailInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, m.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return KSDownloadHelperX.o(p0);
    }
    public void pC(Activity p0,d p1,VideoContext p2,boolean p3){
       t ot;
       if (PatchProxy.isSupport(m.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, m.class, "12")) {
          return;
       }
       if (!d.b() || !p1 instanceof o1) {
          Object[] objArray = new Object[0];
          e.D().t("KuaiShanPostPluginImpl", "startKuaiShanEditActivity launch failed, not support", objArray);
          return;
       }else {
          KSTemplateDetailInfo kSTemplateDe = p1.k0();
          if (g7.b(kSTemplateDe) || (p1.E() && !p3)) {
             this.n(p0, p1, p2);
             return;
          }else if(PatchProxy.isSupport(h1.class)){
             ot = PatchProxy.applyThreeRefs(kSTemplateDe, null, Boolean.FALSE, null, h1.class, "17");
             if (ot != PatchProxyResult.class) {
             label_0085 :
                ot.observeOn(d.a).subscribe(new i(this, p0, p2), j.b);
                return;
             }
          }
          ot = h1.l(KSDownloadHelperX.n(kSTemplateDe), kSTemplateDe, null, true).takeLast(true).observeOn(d.a).flatMap(new j1(kSTemplateDe, null, 0)).takeLast(true).map(t0.b);
          goto label_0085 ;
       }
    }
    public t rz(String p0,String p1,List p2){
       t ot;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, m.class, "7");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, h1.class, "7");
       if (obj != patchProxyRe) {
       }else {
          String str = "], templateId = [";
          String str1 = "]";
          Object[] objArray = new Object[0];
          e.D().w("KuaiShanAPI", "createKuaiShanProjectWithMedia\(\) called with: downloadSourceType = ["+p0+str+p1+"], mediaList = ["+p2+str1, objArray);
          if (!d.b()) {
             obj = t.error(new KSException(-17, "kuaishan is incompatible"));
          }else if(TextUtils.x(p1)){
             obj = t.error(new IllegalArgumentException("template id is empty"));
          }else if(q.f(p2)){
             obj = t.error(new IllegalArgumentException("mediaList is empty"));
          }else {
             int i = p2.size();
             h1 oh1 = h1.class;
             if (PatchProxy.isSupport(oh1)) {
                ot = PatchProxy.applyTwoRefs(Integer.valueOf(i), p1, null, oh1, "3");
                if (ot != patchProxyRe) {
                label_0105 :
                   obj = ot.flatMap(new n1(p0, p2));
                }
             }
             Object[] objArray1 = new Object[0];
             e.D().w("KuaiShanAPI", "getTemplateInfoWithMedia\(\) called with: picNum = ["+i+str+p1+str1, objArray1);
             ot = h1.i(i).concatMap(s0.b).filter(new p1(p1)).switchIfEmpty(t.error(new KSException(-6, "cant find this template for id="+p1)));
             goto label_0105 ;
          }
       }
       return obj;
    }
    public c uH(KuaishanPageParam p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       KSFeedGroupPagerFragment$a obj = PatchProxy.applyOneRefs(p0, this, m.class, "15");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.applyOneRefs(p0, null, KSFeedGroupPagerFragment.class, "21");
       if (obj != patchProxyRe) {
       }else {
          obj = KSFeedGroupPagerFragment.p;
          Objects.requireNonNull(obj);
          KSFeedGroupPagerFragment kSFeedGroupP = PatchProxy.applyOneRefs(p0, obj, KSFeedGroupPagerFragment$a.class, "1");
          if (kSFeedGroupP != patchProxyRe) {
          }else {
             a.p(p0, "param");
             KSLaunchParams kSLaunchPara = KSLaunchParams.createdByKSPageParam(p0);
             a.o(kSLaunchPara, "KSLaunchParams.createdByKSPageParam\(param\)");
             Bundle uBundle = new Bundle();
             SerializableHook.putSerializable(uBundle, "intent_ks_launch_param", kSLaunchPara);
             KSFeedGroupPagerFragment kSFeedGroupP1 = new KSFeedGroupPagerFragment();
             kSFeedGroupP1.setArguments(uBundle);
             kSFeedGroupP = kSFeedGroupP1;
          }
       }
       return obj;
    }
    public t wp(EditorSdk2MvCreationResult p0,KSTemplateDetailInfo p1,List p2,KSSource p3){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, m.class, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       t ot = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, h1.class, "6");
       if (ot != patchProxyRe) {
       }else {
          Object[] objArray = new Object[0];
          e.D().w("KuaiShanAPI", "applyKuaiShanTemplate\(\) called with: templateInfo = ["+p1+"]", objArray);
          if (!d.b()) {
             ot = t.error(new KSException(-17, "kuaishan is incompatible"));
          }else if(q.f(p2)){
             ot = t.error(new IllegalArgumentException("mediaList is empty"));
          }else {
             ArrayList uArrayList = new ArrayList();
             KSTemplateDetailInfo mMediaCount = p1.mMediaCount;
             if (p2.size() > mMediaCount) {
                uArrayList.addAll(p2.subList(0, mMediaCount));
             }else {
                uArrayList.addAll(p2);
             }
             ot = h1.j(p0, p1, uArrayList, EditorSdk2Utils$PreviewSizeLimitation.PREVIEW_SIZE_LIMITATION_720P, 0).takeLast(1).map(t0.b);
          }
       }
       return ot;
    }
    public boolean wv(){
       Object obj = PatchProxy.apply(null, this, m.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.A();
    }
    public a xY(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a obj = PatchProxy.applyOneRefs(p0, this, m.class, "28");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = null;
       obj = PatchProxy.applyOneRefs(p0, obj1, h.class, "5");
       if (obj != patchProxyRe) {
          obj1 = obj;
       }else {
          a.p(p0, "groupId");
          Object[] objArray = new Object[0];
          e.D().w("KSFlexibleTemplateHelper", "getAlbumPhotoByGroupId invoked with"+"groupId = "+p0, objArray);
          Iterator iterator = h.a.iterator();
          while (iterator.hasNext()) {
             obj = iterator.next();
             if (TextUtils.n(p0, String.valueOf(obj.a))) {
                obj1 = obj;
                break ;
             }
          }
       }
       return obj1;
    }
    public d yK(String p0,String p1,EditorSdk2MvCreationResult p2){
       o1 obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, m.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.x(p0) && (TextUtils.x(p1) || p2 == null)) {
          return null;
       }
       KSTemplateDetailInfo kSTemplateDe = g7.g(p0);
       if (kSTemplateDe == null) {
          return null;
       }
       obj = new o1(kSTemplateDe, p1);
       obj.N0(kSTemplateDe.getPreviewSizeLimitation());
       obj.G0(p2);
       return obj;
    }
    public t yg(int p0){
       h1 obj;
       t ot;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       m om = m.class;
       if (PatchProxy.isSupport(om)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, om, "1");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = h1.class;
       if (PatchProxy.isSupport(obj)) {
          ot = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, obj, "2");
          if (ot != patchProxyRe) {
          label_0061 :
             return ot;
          }
       }
       if (p0 > 0) {
          Object[] objArray = new Object[0];
          e.D().w("KuaiShanAPI", "getTemplates\(\) called with: picNum = ["+p0+"]", objArray);
          ot = h1.i(p0).map(c1.b);
          goto label_0061 ;
       }else {
          throw new IllegalArgumentException("Invalid input param, picNum must be a positive integer");
       }
    }
}
