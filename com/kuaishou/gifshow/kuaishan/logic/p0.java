package com.kuaishou.gifshow.kuaishan.logic.p0;
import com.yxcorp.gifshow.util.PostBaseInfoManager;
import java.io.File;
import g26.d;
import java.lang.String;
import com.kuaishou.gifshow.kuaishan.logic.p0$c;
import com.kuaishou.gifshow.kuaishan.logic.p0$a;
import com.kuaishou.gifshow.kuaishan.logic.p0$b;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import pkd.a;
import java.lang.NullPointerException;
import java.util.List;
import lnc.e0;
import android.net.Uri;
import ekd.w0;
import ekd.a0;
import com.kuaishou.gifshow.kuaishan.network.KSTemplateGroupListResponse;
import java.util.Map;
import java.lang.Boolean;
import java.util.HashMap;
import java.util.Iterator;
import com.kuaishou.gifshow.kuaishan.network.KSTemplateGroupInfo;
import java.util.Collection;
import ekd.q;
import com.kuaishou.gifshow.kuaishan.network.KSTemplateGroupInfo$TemplateSimpleInfo;
import com.yxcorp.gifshow.util.PostBaseInfoManager$UnionResponse;
import erd.g;
import com.kuaishou.gifshow.kuaishan.logic.n0;
import erd.o;
import x80.z0;
import com.kuaishou.gifshow.kuaishan.logic.o0;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostBaseInfoManager$a;
import x80.y0;

public class p0 extends PostBaseInfoManager	// class@001a6a
{
    public KSTemplateGroupListResponse f;
    public String g;
    public p0$c h;
    public boolean i;
    public static final File j;

    static {
       p0.j = new File(d.a(), "kuaishan_template_data");
    }
    public void p0(){
       super(1);
       this.h = new p0$c(null);
       this.i = true;
    }
    public void p0(p0$a p0){
       super(1);
       this.h = new p0$c(null);
       this.i = true;
    }
    public static p0 j(){
       return p0$b.a;
    }
    public static String k(KSTemplateDetailInfo p0){
       object oobject;
       String obj = PatchProxy.applyOneRefs(p0, null, p0.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       if (p0 == null) {
          if (!a.a) {
             return obj;
          }else {
             throw new NullPointerException("template info is null");
          }
       }else {
          String[] stringArray = e0.a(p0.mResourceUrls, obj);
          if (stringArray.length > 0) {
             oobject = stringArray[0];
          }
          return a0.c(w0.f(oobject).getPath());
       }
    }
    public static Map l(KSTemplateGroupListResponse p0,boolean p1){
       HashMap obj;
       Iterator iterator;
       KSTemplateGroupInfo kSTemplateGr;
       Iterator iterator1;
       String uniqueIdenti;
       p0 op0 = p0.class;
       if (PatchProxy.isSupport(op0)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, op0, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new HashMap();
       if (p0 == null) {
          return obj;
       }else if(p1){
          iterator = p0.mTemplateGroupList.iterator();
          while (iterator.hasNext()) {
             kSTemplateGr = iterator.next();
             if (kSTemplateGr == null || q.f(kSTemplateGr.mTemplateDetailInfoList)) {
             }else {
                iterator1 = kSTemplateGr.mTemplateDetailInfoList.iterator();
                while (iterator1.hasNext()) {
                   KSTemplateDetailInfo kSTemplateDe = iterator1.next();
                   uniqueIdenti = kSTemplateDe.getUniqueIdentifier();
                   obj.put(uniqueIdenti, kSTemplateDe.mTemplateId);
                }
             }
          }
       }else {
          iterator = p0.mTemplateGroupList.iterator();
          while (iterator.hasNext()) {
             kSTemplateGr = iterator.next();
             if (kSTemplateGr == null || q.f(kSTemplateGr.mTemplateSimpleInfoList)) {
             }else {
                iterator1 = kSTemplateGr.mTemplateSimpleInfoList.iterator();
                while (iterator1.hasNext()) {
                   KSTemplateGroupInfo$TemplateSimpleInfo templateSimp = iterator1.next();
                   uniqueIdenti = templateSimp.getUniqueIdentifier();
                   obj.put(uniqueIdenti, templateSimp.mTemplateId);
                }
             }
          }
       }
       return obj;
    }
    public File a(){
       return p0.j;
    }
    public PostBaseInfoManager$UnionResponse b(){
       Object obj = PatchProxy.apply(null, this, p0.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new KSTemplateGroupListResponse();
    }
    public g c(){
       Object obj = PatchProxy.apply(null, this, p0.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new n0(this);
    }
    public o d(){
       Object obj = PatchProxy.apply(null, this, p0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new z0(this);
    }
    public o e(){
       Object obj = PatchProxy.apply(null, this, p0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return o0.b;
    }
    public void f(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p0.class, "5")) {
          return;
       }
       this.d.onError();
       return;
    }
    public o g(){
       Object obj = PatchProxy.apply(null, this, p0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new y0(this);
    }
    public PostBaseInfoManager$UnionResponse h(){
       return this.f;
    }
    public boolean i(){
       return this.i;
    }
}
