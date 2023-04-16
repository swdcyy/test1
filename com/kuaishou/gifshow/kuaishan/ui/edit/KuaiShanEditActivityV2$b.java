package com.kuaishou.gifshow.kuaishan.ui.edit.KuaiShanEditActivityV2$b;
import y80.d;
import com.kuaishou.gifshow.kuaishan.ui.edit.KuaiShanEditActivityV2;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import y80.d$a;
import java.util.List;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import e17.i;
import com.yxcorp.gifshow.activity.BasePostActivity;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import u80.e;
import java.lang.StringBuilder;
import q87.c;
import lnc.g7;
import w46.b;
import java.util.Objects;
import n90.g;
import androidx.lifecycle.LifecycleOwner;
import o90.f;
import o90.e;
import androidx.lifecycle.Observer;
import com.kuaishou.gifshow.kuaishan.logic.o1;
import com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX;
import com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX$a;
import com.kuaishou.gifshow.kuaishan.logic.m1;
import java.lang.Boolean;
import java.lang.Integer;

public final class KuaiShanEditActivityV2$b implements d	// class@001ab7
{
    public final KuaiShanEditActivityV2 b;

    public void KuaiShanEditActivityV2$b(KuaiShanEditActivityV2 p0){
       this.b = p0;
       super();
    }
    public void A6(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KuaiShanEditActivityV2$b.class, "10")) {
          return;
       }
       a.p(p0, "requestGroupId");
       d$a.a(this, p0);
       return;
    }
    public void H0(List p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, KuaiShanEditActivityV2$b.class, "1")) {
          return;
       }
       a.p(p0, "templateList");
       String str = "KuaiShanEditActivityV2";
       if (p0.isEmpty()) {
          PostUtils.D(str, "onTemplateListByIdsFetched templateList is empty", new IllegalArgumentException());
          i.a(R.style.arg_RES_7f110668, 0x7f101bbb);
          this.b.finish();
          return;
       }else {
          i = 0;
          KSTemplateDetailInfo kSTemplateDe = p0.get(i);
          Object[] objArray = new Object[i];
          e.D().w(str, "onTemplateListByIdsFetched templateInfo: "+kSTemplateDe, objArray);
          if (!g7.b(kSTemplateDe)) {
             objArray = new Object[i];
             e.D().t(str, "onTemplateListByIdsFetched not available for silent"+" loading. templateInfo= "+kSTemplateDe, objArray);
             KuaiShanEditActivityV2$b tb = this.b;
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoidOneRefs(kSTemplateDe, tb, KuaiShanEditActivityV2.class, "6")) {
                if (tb.S == null) {
                   tb.S = new g(tb);
                }
                KuaiShanEditActivityV2 s = tb.S;
                a.m(s);
                s.i(new f(tb, kSTemplateDe));
                KuaiShanEditActivityV2 s1 = tb.S;
                a.m(s1);
                s1.h(new e(tb, kSTemplateDe));
                KuaiShanEditActivityV2 s2 = tb.S;
                a.m(s2);
                s2.e(kSTemplateDe, i, true);
             }
             return;
          }else {
             m1 om1 = m1.w0();
             a.o(om1, "KuaiShanManager.getInstance\(\)");
             om1.y0(new o1(kSTemplateDe, KSDownloadHelperX.o.d(kSTemplateDe)));
             this.b.K3(kSTemplateDe);
             return;
          }
       }
    }
    public void N3(String p0,List p1,boolean p2,boolean p3,boolean p4){
       KuaiShanEditActivityV2$b uob = KuaiShanEditActivityV2$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Boolean.valueOf(p3),Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uob, "7")) {
             return;
          }
       }
       a.p(p0, "groupId");
       a.p(p1, "templateList");
       d$a.b(this, p0, p1, p2, p3, p4);
       return;
    }
    public void P6(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KuaiShanEditActivityV2$b.class, "3")) {
          return;
       }
       a.p(p0, "templateList");
       Object[] objArray = new Object[0];
       e.D().w("KuaiShanEditActivityV2", "onTemplateListZTFetched\(\) fetch ZT templateList="+p0, objArray);
       this.H0(p0);
       return;
    }
    public void Q2(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KuaiShanEditActivityV2$b.class, "4")) {
          return;
       }
       a.p(p0, "groupList");
       if (!PatchProxy.applyVoidTwoRefs(this, p0, null, d$a.class, "1")) {
          a.p(p0, "groupList");
       }
       return;
    }
    public void R(KSTemplateDetailInfo p0,int p1){
       KuaiShanEditActivityV2$b uob = KuaiShanEditActivityV2$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "9")) {
          return;
       }
       a.p(p0, "selectedTemplate");
       if (!PatchProxy.isSupport(d$a.class) || !PatchProxy.applyVoidThreeRefs(this, p0, Integer.valueOf(p1), null, d$a.class, "7")) {
          a.p(p0, "selectedTemplate");
       }
       return;
    }
    public void R3(String p0,int p1){
       KuaiShanEditActivityV2$b uob = KuaiShanEditActivityV2$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "11")) {
          return;
       }
       a.p(p0, "requestGroupId");
       d$a.c(this, p0, p1);
       return;
    }
    public void Z0(KSTemplateDetailInfo p0,boolean p1){
       KuaiShanEditActivityV2$b uob = KuaiShanEditActivityV2$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uob, "12")) {
          return;
       }
       a.p(p0, "templateInfo");
       if (!PatchProxy.isSupport(d$a.class) || !PatchProxy.applyVoidThreeRefs(this, p0, Boolean.valueOf(p1), null, d$a.class, "10")) {
          a.p(p0, "templateInfo");
       }
       return;
    }
    public void a3(String p0,List p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(KuaiShanEditActivityV2$b.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), Boolean.valueOf(p3), this, KuaiShanEditActivityV2$b.class, "6")) {
          return;
       }
       a.p(p0, "groupId");
       a.p(p1, "templateList");
       if (PatchProxy.isSupport(d$a.class)) {
          Object[] objArray = new Object[]{this,p0,p1,Boolean.valueOf(p2),Boolean.valueOf(p3)};
          if (PatchProxy.applyVoid(objArray, null, d$a.class, "2")) {
          label_005a :
             return;
          }
       }
       a.p(p0, "groupId");
       a.p(p1, "templateList");
       goto label_005a ;
    }
    public void f4(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KuaiShanEditActivityV2$b.class, "13")) {
          return;
       }
       a.p(p0, "templateInfoList");
       if (!PatchProxy.applyVoidTwoRefs(this, p0, null, d$a.class, "11")) {
          a.p(p0, "templateInfoList");
       }
       return;
    }
    public void g4(){
       PatchProxy.applyVoid(null, this, KuaiShanEditActivityV2$b.class, "5");
    }
    public void w4(String p0,boolean p1){
       KuaiShanEditActivityV2$b uob = KuaiShanEditActivityV2$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uob, "8")) {
          return;
       }
       a.p(p0, "groupId");
       if (!PatchProxy.isSupport(d$a.class) || !PatchProxy.applyVoidThreeRefs(this, p0, Boolean.valueOf(p1), null, d$a.class, "5")) {
          a.p(p0, "groupId");
       }
       return;
    }
    public void x3(){
       if (PatchProxy.applyVoid(null, this, KuaiShanEditActivityV2$b.class, "2")) {
          return;
       }
       i.a(R.style.arg_RES_7f110668, 0x7f1038e5);
       this.b.finish();
       return;
    }
}
