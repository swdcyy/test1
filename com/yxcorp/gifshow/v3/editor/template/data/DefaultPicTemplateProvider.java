package com.yxcorp.gifshow.v3.editor.template.data.DefaultPicTemplateProvider;
import ztc.i;
import com.yxcorp.gifshow.v3.editor.template.data.DefaultPicTemplateProvider$a;
import nsd.u;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplate;
import asd.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.template.data.PicResourceHelper;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateInfo;
import eb7.a;
import java.io.File;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.template.data.DefaultPicTemplateProvider$fetchPicTemplateInfo$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import wkd.b;
import ia0.g;
import com.kwai.framework.model.router.RouteType;
import t45.d;
import brd.z;
import com.yxcorp.retrofit.a;
import ztc.l;
import com.yxcorp.retrofit.e;
import java.lang.Iterable;
import java.lang.CharSequence;
import msd.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import njd.a;
import com.kwai.middleware.resourcemanager.material.cache.model.MaterialDetailResponse;
import java.util.ArrayList;
import trd.u;
import java.util.Iterator;
import com.kwai.middleware.resourcemanager.material.cache.model.MaterialDetailInfo;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Collection;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import lnc.p3;
import w46.b;
import com.yxcorp.gifshow.v3.editor.template.data.DefaultPicTemplateProvider$fetchPicGroupInfo$1;
import com.kwai.middleware.resourcemanager.ResourceSdk;
import com.kwai.middleware.resourcemanager.cache.BaseResourceCacheRepo;
import ztc.h;
import com.kwai.middleware.resourcemanager.cache.type.CachePolicy;
import brd.t;
import com.yxcorp.gifshow.v3.editor.template.data.DefaultPicTemplateProvider$b;
import erd.o;
import kotlin.jvm.internal.a;
import brd.w;
import com.kwai.middleware.resourcemanager.material.cache.model.MaterialGroupInfo;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateGroupInfo;

public final class DefaultPicTemplateProvider implements i	// class@001316
{
    public int a;
    public static final DefaultPicTemplateProvider$a b;

    static {
       DefaultPicTemplateProvider.b = new DefaultPicTemplateProvider$a(null);
    }
    public void DefaultPicTemplateProvider(int p0){
       super();
       this.a = p0;
    }
    public Object a(PicTemplate p0,c p1){
       PicResourceHelper obj = PatchProxy.applyTwoRefs(p0, p1, this, DefaultPicTemplateProvider.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = PicResourceHelper.b;
       if (!obj.d(p0.getPicTemplateInfo())) {
          return obj.a(p0.getPicTemplateInfo(), null, p1);
       }
       String str = obj.c(p0.getPicTemplateInfo());
       if (str == null) {
          str = "";
       }
       return str;
    }
    public File b(){
       Object obj = PatchProxy.apply(null, this, DefaultPicTemplateProvider.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PicResourceHelper.b.b();
    }
    public Object c(List p0,c p1){
       int i;
       String str;
       ArrayList uArrayList;
       Object obj = this;
       DefaultPicTemplateProvider$fetchPicTemplateInfo$1 obj1 = p0;
       DefaultPicTemplateProvider$fetchPicTemplateInfo$1 obj2 = p1;
       DefaultPicTemplateProvider$fetchPicTemplateInfo$1 obj3 = PatchProxy.applyTwoRefs(obj1, obj2, obj, DefaultPicTemplateProvider.class, "3");
       if (obj3 != PatchProxyResult.class) {
          return obj3;
       }
       if (obj2 instanceof DefaultPicTemplateProvider$fetchPicTemplateInfo$1) {
          i = obj2;
          DefaultPicTemplateProvider$fetchPicTemplateInfo$1 label = i.label;
          int i1 = Integer.MIN_VALUE;
          if (label & i1) {
             i.label = label - i1;
             try{
             label_002b :
                Object obj4 = i;
                obj2 = obj4.result;
                Object obj5 = b.h();
                obj3 = obj4.label;
                int i2 = 0;
                str = "DefaultPicTemplateProvider";
                if (obj3 != null) {
                   if (obj3 == 1) {
                      obj1 = obj4.L$0;
                      j0.n(obj2);
                      String str1 = str;
                   }else {
                      throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                   }
                }else {
                   j0.n(obj2);
                   Object[] objArray = new Object[i2];
                   a.D().w(str, "fetchPicTemplateInfo\(\) called with: picTemplateId = "+obj1, objArray);
                   obj4.L$0 = obj;
                   obj4.L$1 = obj1;
                   obj4.label = 1;
                   obj2 = e.b(b.a(-1961311520).a(RouteType.API, d.b), l.class).b(obj.a, CollectionsKt___CollectionsKt.V2(p0, ",", null, null, 0, null, 0, 62, 0), obj4);
                   if (obj2 == obj5) {
                      return obj5;
                   }else {
                      obj1 = obj;
                   }
                }
                MaterialDetailResponse materialDeta = obj2.a();
                if (materialDeta != null) {
                   List detailList = materialDeta.getDetailList();
                   if (detailList != null) {
                      detailList = CollectionsKt___CollectionsKt.d2(detailList);
                      if (detailList != null) {
                         uArrayList = new ArrayList(u.Y(detailList, 10));
                         Iterator iterator = detailList.iterator();
                         while (iterator.hasNext()) {
                            MaterialDetailInfo materialDeta1 = iterator.next();
                            String materialName = materialDeta1.getMaterialName();
                            if (materialName == null) {
                               materialName = "";
                            }
                            String str3 = materialName;
                            String id = materialDeta1.getId();
                            List iconUrls = materialDeta1.getIconUrls();
                            if (iconUrls == null) {
                               iconUrls = CollectionsKt__CollectionsKt.E();
                            }
                            List list = iconUrls;
                            iconUrls = materialDeta1.getResourceUrls();
                            if (iconUrls == null) {
                               iconUrls = CollectionsKt__CollectionsKt.E();
                            }
                            PicTemplateInfo picTemplateI = new PicTemplateInfo(str3, id, list, iconUrls, materialDeta1.getMd5(), obj1.a);
                            uArrayList.add(obj5);
                         }
                         return uArrayList;
                      }
                   }
                }
                uArrayList = CollectionsKt__CollectionsKt.E();
                goto label_0125 ;
             }catch(com.yxcorp.retrofit.model.RetrofitException e0){
                String str2 = str;
                p3.D().e(str2, "download pic group from internet failed", e0);
                throw e0;
             }
          }
       }
       i = new DefaultPicTemplateProvider$fetchPicTemplateInfo$1(obj, obj2);
       goto label_002b ;
    }
    public Object d(c p0){
       int i;
       ArrayList uArrayList;
       Object obj = this;
       DefaultPicTemplateProvider$fetchPicGroupInfo$1 obj1 = p0;
       DefaultPicTemplateProvider$fetchPicGroupInfo$1 obj2 = PatchProxy.applyOneRefs(obj1, obj, DefaultPicTemplateProvider.class, "2");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       if (obj1 instanceof DefaultPicTemplateProvider$fetchPicGroupInfo$1) {
          i = obj1;
          DefaultPicTemplateProvider$fetchPicGroupInfo$1 label = i.label;
          int i1 = Integer.MIN_VALUE;
          if (label & i1) {
             i.label = label - i1;
             try{
             label_0029 :
                obj1 = i.result;
                ArrayList obj3 = b.h();
                DefaultPicTemplateProvider$fetchPicGroupInfo$1 label1 = i.label;
                int i2 = 1;
                if (label1 != null) {
                   if (label1 == i2) {
                      obj2 = i.L$0;
                      j0.n(obj1);
                   }else {
                      throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                   }
                }else {
                   j0.n(obj1);
                   Object[] objArray1 = new Object[0];
                   a.D().w("DefaultPicTemplateProvider", "fetchPicGroupInfo\(\) called", objArray1);
                   t ot = h.b(ResourceSdk.f, obj.a).a(CachePolicy.NETWORK_ELSE_CACHE).map(DefaultPicTemplateProvider$b.b);
                   a.o(ot, "ResourceSdk.picTemplateR…      it.infoList\n      }");
                   i.L$0 = obj;
                   i.label = i2;
                   obj1 = h.a(ot, CollectionsKt__CollectionsKt.E(), i);
                   if (obj1 == obj3) {
                      return obj3;
                   }else {
                      obj2 = obj;
                   }
                }
                try{
                   if (obj1 != null) {
                      i1 = 10;
                      obj3 = new ArrayList(u.Y(obj1, i1));
                      Iterator iterator = obj1.iterator();
                      while (iterator.hasNext()) {
                         MaterialGroupInfo materialGrou = iterator.next();
                         String groupName = materialGrou.getGroupName();
                         if (groupName == null) {
                            groupName = "";
                         }
                         String groupId = materialGrou.getGroupId();
                         if (groupId == null) {
                            groupId = "0";
                         }
                         List detailInfoLi = materialGrou.getDetailInfoList();
                         if (detailInfoLi != null) {
                            uArrayList = new ArrayList(u.Y(detailInfoLi, i1));
                            Iterator iterator1 = detailInfoLi.iterator();
                            while (iterator1.hasNext()) {
                               MaterialDetailInfo materialDeta = iterator1.next();
                               String materialName = materialDeta.getMaterialName();
                               String str = (materialName != null)? materialName: "";
                               String id = materialDeta.getId();
                               List iconUrls = materialDeta.getIconUrls();
                               if (iconUrls == null) {
                                  iconUrls = CollectionsKt__CollectionsKt.E();
                               }
                               List list = iconUrls;
                               iconUrls = materialDeta.getResourceUrls();
                               if (iconUrls == null) {
                                  iconUrls = CollectionsKt__CollectionsKt.E();
                               }
                               PicTemplateInfo picTemplateI = new PicTemplateInfo(str, id, list, iconUrls, materialDeta.getMd5(), obj2.a);
                               uArrayList.add(v15);
                               PicTemplateGroupInfo picTemplateG = 10;
                            }
                         }else {
                            uArrayList = CollectionsKt__CollectionsKt.E();
                         }
                         obj3.add(new PicTemplateGroupInfo(groupName, groupId, uArrayList));
                         i1 = 10;
                      }
                   }else {
                      List list1 = CollectionsKt__CollectionsKt.E();
                   }
                   return obj3;
                }catch(java.util.concurrent.CancellationException e0){
                   p3.D().e("DefaultPicTemplateProvider", "download cancel", e0);
                }
             label_0148 :
                Object[] objArray = new Object[0];
                a.D().w("DefaultPicTemplateProvider", "fetchPicGroupInfo\(\) 返回结果为空", objArray);
                return CollectionsKt__CollectionsKt.E();
             }catch(com.yxcorp.retrofit.model.RetrofitException e0){
                p3.D().e("DefaultPicTemplateProvider", "download pic group from internet failed", e0);
                goto label_0148 ;
             }catch(java.util.concurrent.CancellationException e0){
             }
          }
       }
       i = new DefaultPicTemplateProvider$fetchPicGroupInfo$1(obj, obj1);
       goto label_0029 ;
    }
    public final int e(){
       return this.a;
    }
}
