package com.kuaishou.gifshow.kuaishan.ui.preview.KSPreviewFragmentVertical$b;
import y80.d;
import com.kuaishou.gifshow.kuaishan.ui.preview.KSPreviewFragmentVertical;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import u80.e;
import java.lang.StringBuilder;
import q87.c;
import java.util.List;
import java.lang.Boolean;
import lnc.i1;
import e17.i;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import java.util.Objects;
import android.app.Activity;
import com.kuaishou.gifshow.kuaishan.model.KSLaunchParams;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Integer;
import com.kuaishou.gifshow.kuaishan.ui.preview.BaseTemplatePreviewFragment;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import com.kuaishou.gifshow.kuaishan.logic.m1;
import com.kuaishou.gifshow.kuaishan.logic.KSResourceDownloader;
import x80.a;
import com.yxcorp.gifshow.util.PostBaseResourceDownloadHelper$InfoWithResource;
import com.kuaishou.gifshow.kuaishan.logic.h1;
import k36.c;
import h36.j;
import k36.f;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$d;
import com.yxcorp.gifshow.kuaishan.model.KSFeedTemplateDetailInfo;
import u79.o;
import u79.a;
import com.kuaishou.gifshow.kuaishan.ui.preview.c$b;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import com.kuaishou.gifshow.kuaishan.model.UITemplatePreviewItem;
import android.view.View;

public class KSPreviewFragmentVertical$b implements d	// class@001ade
{
    public final KSPreviewFragmentVertical b;

    public void KSPreviewFragmentVertical$b(KSPreviewFragmentVertical p0){
       this.b = p0;
       super();
    }
    public void A6(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSPreviewFragmentVertical$b.class, "8")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.D().s("KSPreviewFragmentVertical", "onGroupNotFound\(\) called with: requestGroupId = ["+p0+"]", objArray);
       return;
    }
    public void H0(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSPreviewFragmentVertical$b.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.D().w("KSPreviewFragmentVertical", "onTemplateListByIdsFetched: ", objArray);
       return;
    }
    public void N3(String p0,List p1,boolean p2,boolean p3,boolean p4){
       Object[] objArray;
       KSPreviewFragmentVertical$b uob = KSPreviewFragmentVertical$b.class;
       int i = 0;
       if (PatchProxy.isSupport(uob)) {
          objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Boolean.valueOf(p3),Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uob, "1")) {
             return;
          }
       }
       Object[] objArray1 = new Object[i];
       e.D().w("KSPreviewFragmentVertical", "onGroupTemplateListForDeepLinkFetched: groupId="+p0+" size="+p1.size()+" isLastPage="+p3+" isTargetTemplateInsertedToHead="+p2, objArray1);
       if (p1.isEmpty()) {
          i1.a("KSPreviewFragmentVertical", "onGroupTemplateListForDeepLinkFetched is empty");
          if (p4) {
             i.a(R.style.arg_RES_7f11066a, 0x7f101bbb);
          }
          FragmentActivity activity = this.b.getActivity();
          Objects.requireNonNull(activity);
          activity.finish();
          return;
       }else {
          uob = this.b;
          uob.G = p2;
          uob.Q.setGroupId(p0);
          KSTemplateDetailInfo kSTemplateDe = p1.get(i);
          if (!TextUtils.n(kSTemplateDe.mGroupId, p0)) {
             objArray = new Object[i];
             e.D().A("KSPreviewFragmentVertical", " group is = "+p0+" first template group = "+kSTemplateDe.mGroupId, objArray);
          }
          this.b.oh(p0, p1, true, p3, p4);
          return;
       }
    }
    public void P6(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSPreviewFragmentVertical$b.class, "5")) {
          return;
       }
       KSTemplateDetailInfo kSTemplateDe = p0.get(0);
       this.b.Q.setGroupId(kSTemplateDe.mGroupId);
       this.b.Q.resetTemplateSrc();
       KSPreviewFragmentVertical$b tb = this.b;
       tb.F = false;
       tb.oh(kSTemplateDe.mGroupId, p0, true, true, true);
       return;
    }
    public void Q2(List p0){
    }
    public void R(KSTemplateDetailInfo p0,int p1){
       KSPreviewFragmentVertical$b uob = KSPreviewFragmentVertical$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "7")) {
          return;
       }
       String str = "KSPreviewFragmentVertical";
       int i = 0;
       if (!this.b.isResumed()) {
          Object[] objArray = new Object[i];
          e.D().A(str, "onTemplateSelected: fragment not resumed", objArray);
          return;
       }else {
          Object[] objArray1 = new Object[i];
          e.D().s(str, "onTemplateSelected\(\) called with: templateInfo = ["+p0+"], position = ["+p1+"]", objArray1);
          this.b.n.I(p1, i);
          KSPreviewFragmentVertical s = this.b.S;
          Objects.requireNonNull(s);
          if (!PatchProxy.applyVoid(null, s, m1.class, "6") && s.e != null) {
             Object[] objArray2 = new Object[i];
             e.D().s("KuaiShanManager", "cancelDownload\(\) called", objArray2);
             s.u0();
             KSResourceDownloader.d().i();
             s.h.b();
             s.h.c(s.e, "KuaiShanManager");
             h1.b(s.e.mTemplateId, "KuaiShanManager");
          }
          this.b.ph();
          this.b.nh(i);
          this.b.wh();
          KSPreviewFragmentVertical$b tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, KSPreviewFragmentVertical.class, "1")) {
             if (p0 == null) {
                c.d().g(new j());
             }else {
                c uoc = c.d();
                s = tb.Q;
                String groupId = (s != null)? s.getGroupId(): "";
                uoc.g(new j(groupId, p0.mTemplateId, p0.mName));
             }
          }
          return;
       }
    }
    public void R3(String p0,int p1){
       KSPreviewFragmentVertical$b uob = KSPreviewFragmentVertical$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "9")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.D().s("KSPreviewFragmentVertical", "onTemplateNotFound\(\) called with: requestGroupId = ["+p0+"], indexInGroup = ["+p1+"]", objArray);
       return;
    }
    public void Z0(KSTemplateDetailInfo p0,boolean p1){
       Object[] objArray;
       KSPreviewFragmentVertical$b uob = KSPreviewFragmentVertical$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uob, "10")) {
          return;
       }
       if (!this.b.R.i0()) {
          objArray = new Object[0];
          e.D().w("KSPreviewFragmentVertical", "onTemplateCollectionChanged\(\) no group cache", objArray);
          return;
       }else {
          HashMap hashMap = this.b.R.z0();
          if (!hashMap.containsKey(p0.mGroupId)) {
             objArray = new Object[0];
             e.D().w("KSPreviewFragmentVertical", "onTemplateCollectionChanged\(\) no targetGroup", objArray);
             return;
          }else {
             Iterator iterator = hashMap.entrySet().iterator();
             while (iterator.hasNext()) {
                KSFeedTemplateDetailInfo kSFeedTempla = iterator.next().getValue().g(p0.mTemplateId);
                if (kSFeedTempla == null) {
                   continue ;
                }
                kSFeedTempla.mIsCollect = p1;
             }
             if (!hashMap.containsKey("1")) {
                objArray = new Object[0];
                e.D().w("KSPreviewFragmentVertical", "onTemplateCollectionChanged\(\) no collect group", objArray);
                return;
             }else {
                KSDataManager$d uod = hashMap.get("1");
                if (uod != null) {
                   uod.i();
                }
                if ("1".equals(p0.mGroupId)) {
                   this.b.I = false;
                }
                c$b uob1 = this.b.w.C();
                if (uob1 == null) {
                   PostUtils.D("KSPreviewFragmentVertical", "onTemplateCollectionChanged\(\) mAdapter has no current item, templateInfo="+p0, new IllegalArgumentException());
                   return;
                }else {
                   UITemplatePreviewItem mDataSource = uob1.R.mDataSource;
                   if (mDataSource instanceof KSTemplateDetailInfo) {
                      mDataSource.mIsCollect = p1;
                   }
                   return;
                }
             }
          }
       }
    }
    public void a3(String p0,List p1,boolean p2,boolean p3){
       Object[] objArray;
       if (PatchProxy.isSupport(KSPreviewFragmentVertical$b.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), Boolean.valueOf(p3), this, KSPreviewFragmentVertical$b.class, "2")) {
          return;
       }
       if (!this.b.w.j()) {
          objArray = new Object[0];
          e.D().w("KSPreviewFragmentVertical", "onGroupTemplateListFetched: first page is not ready ignore this call back", objArray);
          return;
       }else if(p1.isEmpty()){
          objArray = new Object[0];
          e.D().w("KSPreviewFragmentVertical", "onGroupTemplateListFetched: templateList is empty", objArray);
          return;
       }else {
          this.b.oh(p0, p1, p2, p3, true);
          return;
       }
    }
    public void f4(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSPreviewFragmentVertical$b.class, "11")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.D().w("KSPreviewFragmentVertical", "onTemplatesRecentInteract\(\)"+p0, objArray);
       return;
    }
    public void g4(){
    }
    public void w4(String p0,boolean p1){
       KSPreviewFragmentVertical$b uob = KSPreviewFragmentVertical$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uob, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.D().s("KSPreviewFragmentVertical", "onGroupTemplateListRequestError\(\) called with: groupId = ["+p0+"], isFirstPage = ["+p1+"]", objArray);
       if (p1 && !this.b.w.j()) {
          this.b.s.setVisibility(0);
          this.b.mh();
       }
       p0.F = false;
       return;
    }
    public void x3(){
       if (PatchProxy.applyVoid(null, this, KSPreviewFragmentVertical$b.class, "6")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.D().s("KSPreviewFragmentVertical", "onTemplateListByIdsRequestError\(\) called", objArray);
       return;
    }
}
