package com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3$p;
import erd.o;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3;
import java.lang.Object;
import com.kwai.middleware.resourcemanager.cache.type.Result;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.Pair;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.middleware.resourcemanager.material.cache.model.MaterialGroupInfo;
import com.kwai.middleware.resourcemanager.material.cache.model.MaterialDetailInfo;
import com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicParamsExt;
import nuc.a;
import java.lang.Integer;
import nsd.u;
import java.util.concurrent.ConcurrentHashMap;
import ood.b;
import ood.d;
import java.io.File;
import com.yxcrop.gifshow.v3.editor.text_v3.utils.TextTemplateEnvV3;
import qkd.b;
import faa.a;
import java.lang.StringBuilder;
import q87.c;

public final class TextTemplateRepoV3$p implements o	// class@000c31
{
    public final TextTemplateRepoV3 b;
    public final Object c;

    public void TextTemplateRepoV3$p(TextTemplateRepoV3 p0,Object p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       MaterialDetailInfo obj2;
       DynamicParamsExt obj3;
       String str1;
       String str4;
       String str5;
       Object obj = this;
       Object obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Pair pair = PatchProxy.applyOneRefs(obj1, obj, TextTemplateRepoV3$p.class, "1");
       if (pair != patchProxyRe) {
       }else {
          a.p(obj1, "it");
          TextTemplateRepoV3$p b = obj.b;
          TextTemplateRepoV3$p c = obj.c;
          String str = "";
          if (c instanceof String) {
          }else {
             c = str;
          }
          Objects.requireNonNull(b);
          ArrayList uArrayList = PatchProxy.applyTwoRefs(obj1, c, b, TextTemplateRepoV3.class, "10");
          if (uArrayList != patchProxyRe) {
          }else {
             uArrayList = new ArrayList();
             List list = obj1.a();
             if (list != null) {
                ArrayList uArrayList2 = new ArrayList();
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                   obj2 = iterator.next();
                   obj3 = obj2;
                   str1 = 1;
                   int i2 = (!c.length())? 1: 0;
                   if (!i2 && !a.g(obj3.getGroupId(), c)) {
                      str1 = null;
                   }
                   if (str1) {
                      uArrayList2.add(obj2);
                   }
                }
                iterator = uArrayList2.iterator();
                while (iterator.hasNext()) {
                   MaterialGroupInfo materialGrou = iterator.next();
                   List detailInfoLi = materialGrou.getDetailInfoList();
                   if (detailInfoLi != null) {
                      Iterator iterator1 = detailInfoLi.iterator();
                      while (iterator1.hasNext()) {
                         obj2 = iterator1.next();
                         obj3 = obj2.getExtObject();
                         String materialId = obj2.getMaterialId();
                         str1 = (materialId != null)? materialId: str;
                         materialId = obj2.getMaterialName();
                         String str2 = (materialId != null)? materialId: str;
                         materialId = obj2.getMd5();
                         String str3 = (materialId != null)? materialId: str;
                         List iconUrls = obj2.getIconUrls();
                         if (iconUrls == null) {
                            iconUrls = new ArrayList();
                         }
                         List list1 = iconUrls;
                         List resourceUrls = obj2.getResourceUrls();
                         if (resourceUrls == null) {
                            resourceUrls = new ArrayList();
                         }
                         List list2 = resourceUrls;
                         int i3 = (obj3 != null)? obj3.getControlType(): 0;
                         int i4 = (obj3 != null)? obj3.getShowWhere(): 0;
                         boolean b2 = (obj3 != null)? obj3.getNeedLogin(): false;
                         if (obj3 != null) {
                            String defaultText = obj3.getDefaultText();
                            if (defaultText != null) {
                               str4 = defaultText;
                            label_0111 :
                               if (obj3 != null) {
                                  defaultText = obj3.getDefaultFontId();
                                  if (defaultText != null) {
                                     str5 = defaultText;
                                  label_011e :
                                     defaultText = materialGrou.getGroupId();
                                     String str6 = (defaultText != null)? defaultText: str;
                                     defaultText = materialGrou.getGroupName();
                                     String str7 = (defaultText != null)? defaultText: str;
                                     Integer groupType = materialGrou.getGroupType();
                                     int i5 = (groupType != null)? groupType.intValue(): 0;
                                     groupType = materialGrou.getGroupRank();
                                     int i6 = (groupType != null)? groupType.intValue(): false;
                                     a uoa1 = new a(str1, str6, str7, i5, i6, str2, str3, list1, list2, i3, i4, b2, str5, str4, null, false, false, null, 0, null, null, null, null, null, 0xffc000, null);
                                     uArrayList.add(v15);
                                  }
                               }
                               str5 = str;
                               goto label_011e ;
                            }
                         }
                         str4 = str;
                         goto label_0111 ;
                      }
                   }
                }
             }
          }
          ArrayList uArrayList1 = new ArrayList();
          int i = uArrayList.size();
          int i1 = 0;
          while (i1 < i) {
             a uoa = uArrayList.get(i1);
             try{
                TextTemplateRepoV3$p b1 = obj.b;
                uArrayList1.add(b1.c(uoa, b1.f.get(uoa.m())));
             }catch(java.lang.Exception e0){
                b.p(TextTemplateEnvV3.a(uoa.m(), uoa.o()));
                Object[] objArray = new Object[0];
                a.D().w("TextTemplateRepoV3", "loadItemList error to delete template templateUnzipPath:"+uoa, objArray);
             }
             i1 = i1 + 1;
          }
          pair = new Pair(uArrayList1, obj1);
       }
       return pair;
    }
}
