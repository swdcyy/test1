package com.kuaishou.gifshow.kuaishan.ui.preview.KSPreviewFragmentVertical;
import com.kuaishou.gifshow.kuaishan.ui.preview.BaseTemplatePreviewFragment;
import java.util.ArrayList;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager;
import com.kuaishou.gifshow.kuaishan.logic.m1;
import com.kuaishou.gifshow.kuaishan.ui.preview.KSPreviewFragmentVertical$a;
import com.kuaishou.gifshow.kuaishan.ui.preview.KSPreviewFragmentVertical$b;
import com.kuaishou.gifshow.kuaishan.ui.preview.KSPreviewFragmentVertical$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u80.e;
import q87.c;
import com.kuaishou.gifshow.kuaishan.model.KSLaunchParams;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.kuaishou.gifshow.kuaishan.ui.preview.KSPostPreviewActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import w46.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import android.widget.FrameLayout;
import java.util.Objects;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.util.HashMap;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Collection;
import java.util.List;
import com.yxcorp.gifshow.kuaishan.model.KSFeedTemplateDetailInfo;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$c;
import com.kuaishou.gifshow.kuaishan.network.feed.KSTemplateFeedListResponse;
import brd.t;
import trd.t;
import y80.b;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$f0;
import erd.o;
import t45.d;
import brd.z;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$c0;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$d0;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$e0;
import erd.g;
import crd.b;
import crd.a;
import java.util.HashSet;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$x;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$s;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$t;
import erd.a;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$u;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$v;
import java.util.Map;
import androidx.viewpager.widget.ViewPager$i;
import lnc.a1;
import e17.i;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import com.yxcorp.gifshow.kuaishan.model.KSFeedTemplateDetailInfo$UnSupportReason;
import com.kuaishou.gifshow.kuaishan.utils.e;
import r90.m;
import java.lang.Runnable;
import u79.a;
import r90.n;
import android.view.View;
import com.kuaishou.gifshow.kuaishan.KSSource;
import k90.a;
import ekd.q;
import t90.c;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.gifshow.kuaishan.ui.preview.c;
import com.kuaishou.gifshow.kuaishan.ui.preview.b;
import u79.o;
import com.kuaishou.gifshow.kuaishan.ui.preview.c$b;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import xf6.g;
import oa0.a;
import r90.c0;
import android.content.Intent;
import java.lang.Integer;
import t36.f;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import java.util.Collections;
import t90.k;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.Serializable;
import ekd.j0;
import com.kwai.feature.post.api.mediascene.MediaSceneLaunchParams;
import t90.j;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import r90.p;
import android.view.View$OnClickListener;
import lnc.g7;
import com.kuaishou.gifshow.kuaishan.logic.o1;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import java.lang.System;
import com.kwai.feature.post.api.mediascene.MediaSceneConfig;
import com.yxcorp.gifshow.activity.GifshowActivity;
import t90.i;
import b90.c;
import lnc.r5;
import b90.a;
import z80.c;
import com.kuaishou.gifshow.kuaishan.ui.edit.KuaiShanEditActivityV2;
import u80.d;
import com.kuaishou.gifshow.kuaishan.ui.edit.KuaiShanEditActivityV2$a;
import java.lang.IllegalStateException;
import lnc.i1;
import com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX;
import android.text.TextPaint;
import r90.l;
import android.view.View$OnTouchListener;
import r90.q;

public class KSPreviewFragmentVertical extends BaseTemplatePreviewFragment	// class@001ae0
{
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final ArrayList J;
    public KSTemplateDetailInfo K;
    public long L;
    public LinearLayout M;
    public TextView N;
    public boolean O;
    public boolean P;
    public KSLaunchParams Q;
    public final KSDataManager R;
    public final m1 S;
    public final c T;
    public final d U;
    public final ViewPager$i V;
    public static final int W;

    public void KSPreviewFragmentVertical(){
       super();
       this.E = true;
       this.I = true;
       this.J = new ArrayList();
       this.O = false;
       this.P = false;
       this.R = KSDataManager.B0();
       this.S = m1.w0();
       this.T = new KSPreviewFragmentVertical$a(this);
       this.U = new KSPreviewFragmentVertical$b(this);
       this.V = new KSPreviewFragmentVertical$c(this);
    }
    public void L(){
       if (PatchProxy.applyVoid(null, this, KSPreviewFragmentVertical.class, "13")) {
          return;
       }
       if (this.G != null && this.Q != null) {
          Object[] objArray = new Object[0];
          e.D().w("KSPreviewFragmentVertical", "onClickClose: remove first item", objArray);
          this.R.y(this.Q.getGroupId(), this.Q.getTemplateId());
       }
       this.S.a();
       this.ph();
       this.vh(true);
       FragmentActivity activity = this.getActivity();
       if (activity != null && !activity.isFinishing()) {
          if (this.I != null) {
             c supportFragm = activity.getSupportFragmentManager();
             supportFragm.beginTransaction().s(this).m();
             supportFragm.executePendingTransactions();
             activity.finishAfterTransition();
          }else {
             activity.finish();
          }
          activity.overridePendingTransition(R.anim.arg_RES_7f0100e5, 0x7f010112);
       }
       return;
    }
    public void eh(){
       KSDataManager$f0 obj1;
       t ot;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KSPreviewFragmentVertical.class, "11")) {
          return;
       }
       KSPreviewFragmentVertical tQ = this.Q;
       String str = "KSPreviewFragmentVertical";
       int i = 0;
       if (tQ == null) {
          objArray = new Object[i];
          e.D().t(str, "fetchFirstPage: wrong param in INTENT_KS_LAUNCH_PARAM", objArray);
          return;
       }else if(TextUtils.x(tQ.getTemplateId())){
          Object[] objArray1 = new Object[i];
          e.D().t(str, "fetchFirstPage: wrong args no template id "+this.Q, objArray1);
          return;
       }else if(this.F != null){
          objArray = new Object[i];
          e.D().w(str, "fetchFirstPage: is loading ignore this", objArray);
          return;
       }else {
          this.r.setVisibility(4);
          Object[] objArray2 = new Object[i];
          e.D().w(str, "fetchFirstPage: mKSLaunchParams="+this.Q, objArray2);
          if (("1").equals(this.Q.getTemplateSrc())) {
             this.R.K(this.Q.getTemplateId());
          }else {
             tQ = this.R;
             String templateId = this.Q.getTemplateId();
             String groupId = this.Q.getGroupId();
             boolean b = this.qh();
             Objects.requireNonNull(tQ);
             if (!PatchProxy.isSupport(KSDataManager.class) || !PatchProxy.applyVoidThreeRefs(templateId, groupId, Boolean.valueOf(b), tQ, KSDataManager.class, "12")) {
                str = "templateId";
                a.p(templateId, str);
                Object[] objArray3 = new Object[i];
                e.D().w("KSDataManager", "fetchTemplatesForDeepLink templateId: "+templateId+", groupId: "+groupId, objArray3);
                Ref$ObjectRef objectRef = new Ref$ObjectRef();
                objectRef.element = objArray;
                int i1 = -1;
                if (groupId != null) {
                   KSDataManager$d uod = tQ.h.get(groupId);
                   if (uod != null) {
                      Object obj = PatchProxy.applyOneRefs(templateId, uod, KSDataManager$d.class, "4");
                      if (obj != PatchProxyResult.class) {
                         i1 = obj.intValue();
                      }else {
                         a.p(templateId, str);
                         int i2 = uod.a.size();
                         while (i < i2) {
                            if (TextUtils.n(templateId, uod.a.get(i).mId)) {
                               i1 = i;
                               break ;
                            }
                            i = i + 1;
                         }
                      }
                   }
                }
                Ref$ObjectRef objectRef1 = new Ref$ObjectRef();
                str = (groupId != null)? groupId: "";
                objectRef1.element = str;
                if (i1 >= 0) {
                   obj1 = tQ.h.get(str);
                   a.m(obj1);
                   objectRef.element = obj1.f(i1);
                   ot = t.just(new KSDataManager$c(tQ, tQ.P(objectRef1.element), true));
                }else {
                   obj1 = new KSDataManager$f0(tQ, groupId, b, objectRef, objectRef1);
                   ot = tQ.k.g(t.k(templateId)).flatMap(v14);
                }
                tQ.g.c(ot.observeOn(d.a).map(new KSDataManager$c0(tQ, objectRef, templateId, objectRef1)).subscribe(new KSDataManager$d0(tQ, objectRef1), new KSDataManager$e0(tQ, templateId, groupId, objectRef1)));
             }
             this.F = true;
          }
          return;
       }
    }
    public void fh(){
       Object[] objArray;
       if (PatchProxy.applyVoid(null, this, KSPreviewFragmentVertical.class, "8")) {
          return;
       }
       KSPreviewFragmentVertical tQ = this.Q;
       String str = "KSPreviewFragmentVertical";
       int i = 0;
       if (tQ == null) {
          objArray = new Object[i];
          e.D().t(str, "fetchNextPage: wrong param in INTENT_KS_LAUNCH_PARAM", objArray);
          return;
       }else if(TextUtils.x(tQ.getGroupId()) || TextUtils.x(this.Q.getTemplateId())){
          objArray = new Object[i];
          e.D().t(str, "fetchNextPage: wrong args no group id or template id "+this.Q, objArray);
          return;
       }else if(this.F != null){
          objArray = new Object[i];
          e.D().w(str, "fetchNextPage: is loading ignore this", objArray);
          return;
       }else if(this.E == null){
          objArray = new Object[i];
          e.D().w(str, "fetchNextPage: no more to load", objArray);
          return;
       }else {
          tQ = this.R;
          str = this.Q.getGroupId();
          Objects.requireNonNull(tQ);
          if (!PatchProxy.isSupport(KSDataManager.class) || !PatchProxy.applyVoidThreeRefs(str, Boolean.FALSE, Boolean.TRUE, tQ, KSDataManager.class, "9")) {
             a.p(str, "groupId");
             String str1 = "Fetch Templates By "+str+' '+tQ.y0(str, i);
             String str2 = "KSDataManager";
             if (tQ.i.contains(str1)) {
                Object[] objArray1 = new Object[i];
                e.D().w(str2, "Request is in process", objArray1);
             }else {
                Object[] objArray2 = new Object[i];
                e.D().w(str2, "fetchTemplatesByGroup groupId: "+str+", isFirstPage: "+i+", applyCache: "+true, objArray2);
                tQ.i.add(str1);
                tQ.g.c(tQ.v(str, i).flatMap(new KSDataManager$x(tQ)).observeOn(d.a).doOnNext(new KSDataManager$s(str)).doFinally(new KSDataManager$t(tQ, str1)).subscribe(new KSDataManager$u(tQ, str, i), new KSDataManager$v(tQ, str, i)));
             }
          }
          this.F = true;
          return;
       }
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KSPreviewFragmentVertical.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(KSPreviewFragmentVertical.class, null);
       return objectsByTag;
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, KSPreviewFragmentVertical.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "task_id="+m1.w0().f;
    }
    public ViewPager$i gh(){
       return this.V;
    }
    public void ih(){
       if (PatchProxy.applyVoid(null, this, KSPreviewFragmentVertical.class, "10")) {
          return;
       }
       if (!this.sh()) {
          KSPreviewFragmentVertical tQ = this.Q;
          if (tQ != null && !tQ.getDisableSliding()) {
             if (this.E != null) {
                this.fh();
             }else {
                tQ = this.Q;
                if (tQ != null && (("1").equals(tQ.getGroupId()) || ("999").equals(this.Q.getGroupId()))) {
                   i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f101bc7));
                }else if(!this.qh()){
                   i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f101bd7));
                }
             }
          }
       }
       return;
    }
    public void jh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KSPreviewFragmentVertical.class, "9")) {
          return;
       }
       KSTemplateDetailInfo kSTemplateDe = this.R.l0();
       int i = 0;
       String str = "KSPreviewFragmentVertical";
       if (kSTemplateDe == null) {
          objArray = new Object[i];
          e.D().t(str, "Missing selected template in KSDataManager", objArray);
          return;
       }else if(this.getActivity() == null || this.getActivity().isFinishing()){
          objArray = new Object[i];
          e.D().t(str, "Activity is null or finishing", objArray);
          return;
       }else {
          KSTemplateDetailInfo mUnSupportRe = kSTemplateDe.mUnSupportReason;
          if (mUnSupportRe != null) {
             String reasonConten = mUnSupportRe.getReasonContent();
             Object[] objArray1 = new Object[i];
             e.D().t(str, "This template is no longer available due to: "+reasonConten, objArray1);
             i.d(R.style.arg_RES_7f11066a, reasonConten);
             return;
          }else if(e.q(kSTemplateDe) && e.z()){
             e.C(this.getActivity(), new m(this), objArray, kSTemplateDe.mPrivacyPolicyTitle, kSTemplateDe.mPrivacyPolicyUrl);
             return;
          }else {
             this.uh();
             return;
          }
       }
    }
    public String o(){
       return "KUAISHAN_PREVIEW";
    }
    public void oh(String p0,List p1,boolean p2,boolean p3,boolean p4){
       Object[] objArray;
       Object[] objArray1;
       c a;
       ArrayList uArrayList1;
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(KSPreviewFragmentVertical.class)) {
          objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Boolean.valueOf(p3),Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, KSPreviewFragmentVertical.class, "3")) {
             return;
          }
       }
       KSPreviewFragmentVertical tQ = this.Q;
       if (tQ == null) {
          objArray1 = new Object[0];
          e.D().t("KSPreviewFragmentVertical", "addTemplateList: mKSLaunchParams is null", objArray1);
          return;
       }else if(!TextUtils.n(p0, tQ.getGroupId())){
          Object[] objArray2 = new Object[0];
          e.D().y("KSPreviewFragmentVertical", "addTemplateList: ignore this "+p0, objArray2);
          return;
       }else {
          Object[] objArray3 = new Object[0];
          e.D().w("KSPreviewFragmentVertical", "addTemplateList: groupId="+p0+" isFirstPage="+p2+" isLastPage="+p3+" templateList size="+p1.size(), objArray3);
          if (p2 && this.w.j() > 0) {
             objArray1 = new Object[0];
             e.D().A("KSPreviewFragmentVertical", "addTemplateList: first page is already", objArray1);
             return;
          }else if(p1.isEmpty()){
             if (p4) {
                i.a(R.style.arg_RES_7f11066a, 0x7f101bbb);
             }
             FragmentActivity activity = this.getActivity();
             Objects.requireNonNull(activity);
             activity.finish();
             return;
          }else if(p2){
             this.r.setVisibility(8);
             this.s.postDelayed(new n(this), 350);
          }
          if (this.E == null) {
             objArray1 = new Object[0];
             e.D().t("KSPreviewFragmentVertical", "addTemplateList: mHasMorePage is false", objArray1);
             return;
          }else {
             this.E = p3 ^ 0x01;
             this.F = false;
             Object[] objArray4 = null;
             if (this.Q.getKSSource() == KSSource.SEARCH) {
                KSDataManager kSDataManage = KSDataManager.B0();
                Objects.requireNonNull(kSDataManage);
                ArrayList uArrayList = PatchProxy.apply(objArray4, kSDataManage, KSDataManager.class, "39");
                if (uArrayList != patchProxyRe) {
                }else {
                   kSDataManage = kSDataManage.o;
                   uArrayList = (kSDataManage != null)? kSDataManage.b(): objArray4;
                }
                if (!q.f(uArrayList)) {
                   a = c.a;
                   Objects.requireNonNull(a);
                   uArrayList1 = PatchProxy.applyOneRefs(uArrayList, a, c.class, "2");
                   if (uArrayList1 != patchProxyRe) {
                   }else {
                      a.p(uArrayList, "list");
                      uArrayList1 = new ArrayList();
                      Iterator iterator = uArrayList.iterator();
                      while (iterator.hasNext()) {
                         uArrayList1.add(iterator.next().toKSTemplateDetailInfo());
                      }
                   }
                }else {
                label_0160 :
                   uArrayList1 = p1;
                }
             }else {
                goto label_0160 ;
             }
             objArray = new Object[0];
             e.D().w("KSPreviewFragmentVertical", "addTemplateList: first item="+uArrayList1.get(0), objArray);
             if (p2) {
                this.dh();
                this.w.z();
                this.w.J(this.R.v0(uArrayList1));
                this.w.q();
                i = 0;
                while (true) {
                   if (i < uArrayList1.size()) {
                      KSTemplateDetailInfo kSTemplateDe = uArrayList1.get(i);
                      if ((kSTemplateDe.getId()).equals(this.Q.getTemplateId())) {
                         this.rh(kSTemplateDe, i);
                         i = true;
                      label_01bf :
                         objArray3 = new Object[0];
                         e.D().w("KSPreviewFragmentVertical", "addTemplateList: find="+i, objArray3);
                         if (!i && !uArrayList1.isEmpty()) {
                            this.rh(uArrayList1.get(0), 0);
                         }
                      }else {
                         i++;
                      }
                   }else {
                      i = false;
                      goto label_01bf ;
                   }
                }
             }else {
                this.w.J(this.R.v0(uArrayList1));
                this.w.q();
             }
             BaseTemplatePreviewFragment tv = this.v;
             if (tv != null) {
                tv.a(this.E);
                this.v.b(this.w.j());
             }
             if (!this.sh() && !PatchProxy.applyVoid(objArray4, this, KSPreviewFragmentVertical.class, "4")) {
                if (this.w.C() == null) {
                   Object[] objArray5 = new Object[0];
                   e.D().t("KSPreviewFragmentVertical", "showCollectionBubble\(\) no current selected item", objArray5);
                }else if(this.w.C().C()){
                   View view = this.w.C().getView();
                   if (view == null) {
                      PostUtils.D("KSPreviewFragmentVertical", "showCollectionBubble\(\) current selected item has no view, current item="+this.w.C(), new IllegalArgumentException());
                   }else {
                      view = view.findViewById(R.id.template_collection_icon);
                      this.o = view;
                      if (view != null && (!g.e0() && !a.J())) {
                         FragmentActivity activity1 = this.getActivity();
                         Objects.requireNonNull(activity1);
                         e.B(this.o, activity1);
                      }
                   }
                }
             }
             this.hh();
             tv = this.k;
             if (tv != null) {
                tv.R8(1);
             }
             if (p2 && p1.size() > 1) {
                tv = this.k;
                if (tv != null) {
                   tv.V8();
                }
             }
             return;
          }
       }
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(KSPreviewFragmentVertical.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, KSPreviewFragmentVertical.class, "15")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       Object[] objArray = new Object[0];
       e.D().w("KSPreviewFragmentVertical", "onActivityResult: ", objArray);
       if (p0 == 1003) {
          this.kh();
       }
       return;
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KSPreviewFragmentVertical.class, "16")) {
          return;
       }
       super.onDestroyView();
       KSPreviewFragmentVertical tR = this.R;
       tR.n = objArray;
       tR.c(this.U);
       this.S.c(this.T);
       if (!PatchProxy.applyVoid(objArray, this, KSPreviewFragmentVertical.class, "17") && PostExperimentUtils.m0() == 1) {
          Collections.reverse(this.J);
          k.a.e(this.J, this.R);
          this.J.clear();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KSPreviewFragmentVertical.class, "5")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.w.K();
       this.S.d(this.T);
       this.R.d(this.U);
       this.M = p0.findViewById(0x7f0a1683);
       this.N = p0.findViewById(0x7f0a1685);
       this.wh();
       if (this.P == null) {
          this.lh();
       }
       FragmentActivity activity = this.getActivity();
       Objects.requireNonNull(activity);
       KSLaunchParams kSLaunchPara = j0.e(activity.getIntent(), "intent_ks_launch_param");
       this.Q = kSLaunchPara;
       if (kSLaunchPara != null) {
          p1.f = kSLaunchPara.getTaskId();
          kSLaunchPara.g = this.Q.getTemplateId();
       }
       kSLaunchPara.m = this.Q;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, KSPreviewFragmentVertical.class, "21")) {
          String str = "KSPreviewFragmentVertical";
          int i = 0;
          if (this.Q == null) {
             objArray = new Object[i];
             e.D().w(str, "bindMoreTemplateBtn\(\) no KSLaunchParams", objArray);
          }else {
             int i1 = 8;
             if (this.sh() && this.Q.getMediaSceneLaunchParams().mAllowJumpToolbox == null) {
                objArray = new Object[i];
                e.D().w(str, "bindMoreTemplateBtn\(\) media scene dont show more button", objArray);
                this.p.setVisibility(i1);
             }else if(!this.Q.getAllowJumpToolbox() && !this.sh()){
                objArray = new Object[i];
                e.D().w(str, "bindMoreTemplateBtn\(\) cant allow jump toolbox", objArray);
                this.p.setVisibility(i1);
             }else {
                String templateId = this.Q.getTemplateId();
                BaseTemplatePreviewFragment tl = this.l;
                if (!PatchProxy.applyVoidTwoRefs(tl, templateId, objArray, j.class, "38")) {
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "MORE_TEMPLATE";
                   i3 oi3 = i3.f();
                   oi3.d("template_id", templateId);
                   uElementPack.params = oi3.e();
                   u1.C0("3912871", tl, i, uElementPack, objArray);
                }
                this.p.setVisibility(i);
                this.p.setOnClickListener(new p(this, templateId));
             }
          }
       }
       KSPreviewFragmentVertical tQ = this.Q;
       if (tQ != null && tQ.isEnableStrengthenEntrance()) {
          this.R.t(this.Q.getGroupId(), this.Q.getPositionInGroup());
          KSTemplateDetailInfo kSTemplateDe = this.R.l0();
          if (kSTemplateDe != null && (kSTemplateDe.mUnSupportReason == null && !g7.b(kSTemplateDe))) {
             this.uh();
          }
       }
    label_0142 :
       return;
    }
    public void ph(){
       if (PatchProxy.applyVoid(null, this, KSPreviewFragmentVertical.class, "7")) {
          return;
       }
       o1 oo1 = this.S.v0();
       if (oo1 != null) {
          oo1.close();
       }
       this.S.y0(null);
       return;
    }
    public final boolean qh(){
       FragmentActivity obj = PatchProxy.apply(null, this, KSPreviewFragmentVertical.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getActivity();
       boolean b = false;
       if (!this.sh() && (obj == null || !j0.a(obj.getIntent(), "disable_scroll", b))) {
          KSPreviewFragmentVertical tQ = this.Q;
          if (tQ == null || !tQ.getDisableSliding()) {
          label_0038 :
             return b;
          }
       }
       b = true;
       goto label_0038 ;
    }
    public final void rh(KSTemplateDetailInfo p0,int p1){
       String str = "2";
       if (PatchProxy.isSupport(KSPreviewFragmentVertical.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, KSPreviewFragmentVertical.class, str)) {
          return;
       }
       String str1 = "KSPreviewFragmentVertical";
       if (!this.isResumed()) {
          Object[] objArray = new Object[0];
          e.D().A(str1, "initWidthTemplate: fragment not resumed", objArray);
          return;
       }else {
          Object[] objArray1 = new Object[0];
          e.D().w(str1, "initWidthTemplate: "+p0, objArray1);
          this.n.I(p1, 0);
          this.w.I(p1);
          this.nh(true);
          KSPreviewFragmentVertical tQ = this.Q;
          if (tQ == null || tQ.getKSSource() != KSSource.SEARCH) {
             str = p0.mGroupId;
          }
          this.R.t(str, p1);
          this.K = this.R.l0();
          this.L = System.currentTimeMillis();
          return;
       }
    }
    public boolean sh(){
       KSPreviewFragmentVertical obj = PatchProxy.apply(null, this, KSPreviewFragmentVertical.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.Q;
       boolean b = (obj != null && (obj.getMediaSceneLaunchParams() != null || this.Q.getMediaSceneConfig() != null))? true: false;
       return b;
    }
    public void th(o1 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSPreviewFragmentVertical.class, "19")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "KSPreviewFragmentVertical";
       e.D().w(str, "launchKuaiShanNextStep: template="+p0.getTemplateId(), objArray);
       FragmentActivity activity = this.getActivity();
       if (!activity instanceof GifshowActivity) {
          Object[] objArray1 = new Object[i];
          e.D().t(str, "activity is not GifshowActivity ="+activity, objArray1);
          return;
       }else {
          this.w.H();
          String templateId = p0.getTemplateId();
          if (!PatchProxy.applyVoidOneRefs(templateId, null, i.class, "1")) {
             a.p(templateId, "id");
             i.a = templateId;
             i.d = i;
          }
          KSPreviewFragmentVertical tQ = this.Q;
          if (tQ != null && (tQ.getMediaSceneLaunchParams() != null || this.Q.getMediaSceneConfig() != null)) {
             MediaSceneLaunchParams mediaSceneLa = this.Q.getMediaSceneLaunchParams();
             MediaSceneConfig mediaSceneCo = this.Q.getMediaSceneConfig();
             if (mediaSceneLa != null) {
                i = mediaSceneLa.mRequireAlbum;
             }else if(mediaSceneCo != null){
                i = mediaSceneCo.getRequireAlbum();
             }
             if (i) {
                c b = c.b;
                tQ = this.Q;
                Objects.requireNonNull(b);
                if (!PatchProxy.applyVoidThreeRefs(activity, p0, tQ, b, c.class, "6")) {
                   a.p(activity, "activity");
                   a.p(p0, "project");
                   a.p(tQ, "ksLaunchParams");
                   tQ.setAlbumTaskImplKey(r5.b().c(new a()));
                   c.j.x(tQ.getMediaSceneConfig(), tQ.getTaskId(), tQ.getMediaSceneLaunchParams());
                   a.o(tQ, "Objects.requireNonNull\(ksLaunchParams\)");
                   KuaiShanEditActivityV2.X.a(tQ, p0, activity);
                }
             }else {
                c.b.d(activity, mediaSceneCo, mediaSceneLa);
             }
             return;
          }else {
             KSPreviewFragmentVertical tQ1 = this.Q;
             Objects.requireNonNull(tQ1);
             if (!KuaiShanEditActivityV2.I3(tQ1, p0, this.getActivity())) {
                this.kh();
             }
             return;
          }
       }
    }
    public void uh(){
       if (PatchProxy.applyVoid(null, this, KSPreviewFragmentVertical.class, "6")) {
          return;
       }
       KSTemplateDetailInfo kSTemplateDe = this.R.l0();
       if (kSTemplateDe == null) {
          i1.c(new IllegalStateException("now select template in mDataManager"));
          return;
       }else {
          k.a.d(kSTemplateDe, this.R);
          e.w("Launch template: id="+kSTemplateDe.mTemplateId+", name="+kSTemplateDe.mName+", groupId="+kSTemplateDe.mGroupId+", groupName="+kSTemplateDe.mGroupName);
          this.t.setClickable(false);
          KSTemplateDetailInfo mTemplateId = kSTemplateDe.mTemplateId;
          KSTemplateDetailInfo mName = kSTemplateDe.mName;
          KSTemplateDetailInfo mGroupId = kSTemplateDe.mGroupId;
          KSTemplateDetailInfo mGroupName = kSTemplateDe.mGroupName;
          int currentItem = this.n.getCurrentItem();
          boolean b = (kSTemplateDe.mTemplateType == 12)? true: false;
          j.b(this, mTemplateId, mName, mGroupId, mGroupName, currentItem, b);
          if (g7.b(kSTemplateDe)) {
             this.th(new o1(kSTemplateDe, KSDownloadHelperX.n(kSTemplateDe)));
          }else {
             this.S.x0(kSTemplateDe);
          }
          return;
       }
    }
    public void vh(boolean p0){
       if (PatchProxy.isSupport(KSPreviewFragmentVertical.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, KSPreviewFragmentVertical.class, "14")) {
          return;
       }
       if (PostExperimentUtils.m0() != 1) {
          return;
       }
       long l = System.currentTimeMillis();
       Object[] objArray = new Object[0];
       e.D().w("KSPreviewFragmentVertical", "tag template as viewed  templateInfo: "+this.K+"  view duration: "+(l - this.L)+"  isLast: "+p0, objArray);
       KSPreviewFragmentVertical tK = this.K;
       if (tK != null && (l - this.L) - 2000 > 0) {
          tK.mRecentViewedTime = l;
          this.J.remove(tK);
          this.J.add(this.K);
       }
       if (p0) {
          this.K = null;
          this.L = -1;
       }else {
          this.K = this.R.l0();
          this.L = l;
       }
       return;
    }
    public void wh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KSPreviewFragmentVertical.class, "23")) {
          return;
       }
       KSTemplateDetailInfo kSTemplateDe = this.R.l0();
       int i = 8;
       if (kSTemplateDe != null && kSTemplateDe.mTemplateType == 12) {
          if (!PatchProxy.applyVoid(objArray, this, KSPreviewFragmentVertical.class, "22")) {
             this.t.setVisibility(i);
             this.M.setVisibility(0);
             this.N.getPaint().setFakeBoldText(true);
             this.M.setClickable(0);
             this.M.setOnTouchListener(new l(this));
             this.M.setOnClickListener(new q(this));
          }
       }else {
          this.ch();
          this.M.setVisibility(i);
       }
       return;
    }
}
