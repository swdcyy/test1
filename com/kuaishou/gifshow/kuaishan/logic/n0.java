package com.kuaishou.gifshow.kuaishan.logic.n0;
import erd.g;
import com.kuaishou.gifshow.kuaishan.logic.p0;
import java.lang.Object;
import com.yxcorp.gifshow.util.PostBaseInfoManager$DetailResponse;
import com.kuaishou.gifshow.kuaishan.logic.p0$c;
import com.kuaishou.gifshow.kuaishan.network.KSTemplateDetailListResponse;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.Map;
import java.util.HashMap;
import com.kuaishou.gifshow.kuaishan.network.KSTemplateGroupListResponse;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.kuaishou.gifshow.kuaishan.network.KSTemplateGroupInfo;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import com.kuaishou.gifshow.kuaishan.network.KSTemplateGroupInfo$TemplateSimpleInfo;
import u80.e;
import w46.b;
import x80.x0;
import java.lang.Iterable;
import ok.o;
import com.google.common.base.Optional;
import qk.y;
import java.lang.Boolean;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.util.PostBaseInfoManager;
import com.yxcorp.gifshow.util.PostBaseInfoManager$a;

public final class n0 implements g	// class@001a61
{
    public final p0 b;

    public void n0(p0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       boolean b1;
       int i1;
       n0 b = this.b;
       Iterator obj = p0;
       p0$c a = b.h.a;
       ArrayList uArrayList = PatchProxy.applyTwoRefs(a, obj, b, p0.class, "10");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          uArrayList = Lists.b();
          if (a != null) {
             p0 f = b.f;
             KSTemplateGroupInfo obj1 = null;
             HashMap hashMap = PatchProxy.applyOneRefs(f, obj1, p0.class, "14");
             if (hashMap != PatchProxyResult.class) {
             }else {
                hashMap = new HashMap();
                if (f != null && !q.f(f.mTemplateGroupList)) {
                   Iterator iterator1 = f.mTemplateGroupList.iterator();
                   while (iterator1.hasNext()) {
                      KSTemplateGroupInfo kSTemplateGr2 = iterator1.next();
                      if (kSTemplateGr2 == null || q.f(kSTemplateGr2.mTemplateDetailInfoList)) {
                      }else {
                         Iterator iterator2 = kSTemplateGr2.mTemplateDetailInfoList.iterator();
                         while (iterator2.hasNext()) {
                            KSTemplateDetailInfo kSTemplateDe2 = iterator2.next();
                            if (kSTemplateDe2 == null) {
                               continue ;
                            }
                            hashMap.put(kSTemplateDe2.getUniqueIdentifier(), kSTemplateDe2);
                         }
                      }
                   }
                }
             }
             HashMap hashMap1 = PatchProxy.applyOneRefs(obj, obj1, p0.class, "15");
             if (hashMap1 != PatchProxyResult.class) {
             }else {
                hashMap1 = new HashMap();
                if (obj != null && !q.f(obj.mTemplatesInfo)) {
                   obj = obj.mTemplatesInfo.iterator();
                   while (obj.hasNext()) {
                      KSTemplateDetailInfo kSTemplateDe1 = obj.next();
                      if (kSTemplateDe1 == null) {
                         continue ;
                      }
                      hashMap1.put(kSTemplateDe1.getUniqueIdentifier(), kSTemplateDe1);
                   }
                }
             }
             hashMap.putAll(hashMap1);
             obj = a.mTemplateGroupList.iterator();
             while (obj.hasNext()) {
                KSTemplateGroupInfo kSTemplateGr = obj.next();
                if (kSTemplateGr == null || kSTemplateGr.mVersion > null) {
                }else {
                   KSTemplateGroupInfo kSTemplateGr1 = new KSTemplateGroupInfo(kSTemplateGr);
                   obj1 = kSTemplateGr.mTemplateDetailInfoList;
                   if (obj1 == null) {
                      kSTemplateGr.mTemplateDetailInfoList = Lists.b();
                   }else {
                      obj1.clear();
                   }
                   Iterator iterator = kSTemplateGr.mTemplateSimpleInfoList.iterator();
                   while (iterator.hasNext()) {
                      KSTemplateGroupInfo$TemplateSimpleInfo templateSimp = iterator.next();
                      String uniqueIdenti = templateSimp.getUniqueIdentifier();
                      KSTemplateDetailInfo kSTemplateDe = hashMap.get(uniqueIdenti);
                      int i = 0;
                      if (kSTemplateDe == null) {
                         Object[] objArray = new Object[i];
                         e.D().t("KuaiShanTemplateInfoManager", "wrong checksum", objArray);
                         kSTemplateDe = y.y(hashMap.values(), new x0(templateSimp)).orNull();
                         if (kSTemplateDe != null) {
                            templateSimp.mCheckSum = kSTemplateDe.mCheckSum;
                         }
                      }
                      if (kSTemplateDe != null) {
                         Object obj2 = PatchProxy.applyOneRefs(kSTemplateDe, b, p0.class, "11");
                         if (obj2 != PatchProxyResult.class) {
                            b1 = obj2.booleanValue();
                            i1 = 0;
                         }else if(!q.f(kSTemplateDe.mCoverUrls) && (q.f(kSTemplateDe.mDemoUrls) || q.f(kSTemplateDe.mResourceUrls))){
                            i1 = 0;
                            Object[] objArray2 = new Object[i1];
                            e.D().t("KuaiShanTemplateInfoManager", "wrong detail info, coverUrl = ["+kSTemplateDe.mCoverUrls+"], demoUrl = ["+kSTemplateDe.mDemoUrls+"], resourceUrl = ["+kSTemplateDe.mResourceUrls+"], ID = "+kSTemplateDe.mTemplateId+", name = "+kSTemplateDe.mName, objArray2);
                            b1 = false;
                         }else {
                            i1 = 0;
                            b1 = true;
                         }
                         if (!b1) {
                            Object[] objArray1 = new Object[i1];
                            e.D().t("KuaiShanTemplateInfoManager", "detail info invalidate", objArray1);
                         }else if(kSTemplateDe.mVersion > 17){
                            continue ;
                         }else {
                            kSTemplateDe.mGroupId = kSTemplateGr.mGroupId;
                            kSTemplateDe.mGroupName = kSTemplateGr.mGroupName;
                            kSTemplateGr.mTemplateDetailInfoList.add(kSTemplateDe);
                            kSTemplateGr1.mTemplateDetailInfoList.add(kSTemplateDe);
                            continue ;
                         }
                      }else {
                         Object[] objArray3 = new Object[0];
                         e.D().t("KuaiShanTemplateInfoManager", "can not find "+uniqueIdenti, objArray3);
                         continue ;
                      }
                   }
                   if (!q.f(kSTemplateGr1.mTemplateDetailInfoList)) {
                      uArrayList.add(kSTemplateGr1);
                   }
                }
             }
          }
       }
       b.c = uArrayList;
       b.f = b.h.a;
       PostBaseInfoManager d = b.d;
       if (d != null) {
          d.a(uArrayList, 1);
       }
       return;
    }
}
