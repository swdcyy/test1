package com.yxcorp.gifshow.activity.share.topic.ShareTopicExtra;
import java.io.Serializable;
import vsd.n;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import java.lang.Class;
import java.lang.String;
import kotlin.jvm.internal.MutablePropertyReference1;
import vsd.l;
import nsd.m0;
import com.yxcorp.gifshow.activity.share.topic.ShareTopicExtra$a;
import nsd.u;
import java.lang.Object;
import java.util.HashMap;
import com.yxcorp.gifshow.activity.share.topic.ShareTopicExtra$Proxy;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import km6.f;
import com.yxcorp.gifshow.activity.share.topic.ShareTopicExtra$ExtraParams;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import qr4.k$e;
import qr4.i;
import qr4.e$h;
import qr4.k$j;
import qr4.j$a;
import com.kuaishou.android.model.music.MusicType;
import java.lang.Integer;
import java.lang.Long;
import com.yxcorp.gifshow.activity.share.topic.ShareTopicExtra$MagicFaceInfo;
import j2b.s;
import com.kwai.framework.location.model.LocationCityInfo;
import o96.u;
import com.yxcorp.gifshow.activity.share.topic.ShareTopicExtra$LocationInfo;
import java.lang.Double;
import qrd.l1;
import qr4.m$k0;
import qr4.m$n;
import qr4.m$s;
import qr4.m$a;
import qr4.m$p;
import qr4.e$e;
import tb7.j;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Workspace;
import com.kuaishou.edit.draft.Text;
import com.kwai.gifshow.post.api.core.camerasdk.model.b;
import java.util.Collection;
import java.util.Map;
import java.util.LinkedHashMap;
import trd.s0;
import java.util.Set;
import java.util.Map$Entry;
import java.lang.CharSequence;
import msd.l;
import kotlin.collections.CollectionsKt___CollectionsKt;

public final class ShareTopicExtra implements Serializable	// class@00146d
{
    public final HashMap data;
    public final ShareTopicExtra$Proxy extraParams$delegate;
    public List forceTopItems;
    public final ShareTopicExtra$Proxy magicFaceIdList$delegate;
    public final ShareTopicExtra$Proxy musicId$delegate;
    public final ShareTopicExtra$Proxy musicType$delegate;
    public final ShareTopicExtra$Proxy usedDuration$delegate;
    public final ShareTopicExtra$Proxy usedStart$delegate;
    public static final n[] $$delegatedProperties;
    public static final ShareTopicExtra$a Companion;

    static {
       n[] onArray = new n[]{m0.j(new MutablePropertyReference1Impl(ShareTopicExtra.class, "magicFaceIdList", "getMagicFaceIdList\(\)Ljava/util/List;", 0)),m0.j(new MutablePropertyReference1Impl(ShareTopicExtra.class, "musicId", "getMusicId\(\)Ljava/lang/String;", 0)),m0.j(new MutablePropertyReference1Impl(ShareTopicExtra.class, "musicType", "getMusicType\(\)Ljava/lang/Integer;", 0)),m0.j(new MutablePropertyReference1Impl(ShareTopicExtra.class, "usedStart", "getUsedStart\(\)Ljava/lang/Long;", 0)),m0.j(new MutablePropertyReference1Impl(ShareTopicExtra.class, "usedDuration", "getUsedDuration\(\)Ljava/lang/Long;", 0)),m0.j(new MutablePropertyReference1Impl(ShareTopicExtra.class, "extraParams", "getExtraParams\(\)Ljava/lang/String;", 0))};
       ShareTopicExtra.$$delegatedProperties = onArray;
       ShareTopicExtra.Companion = new ShareTopicExtra$a(null);
    }
    public void ShareTopicExtra(){
       super();
       this.data = new HashMap();
       this.magicFaceIdList$delegate = new ShareTopicExtra$Proxy("magicFaceIdList");
       this.musicId$delegate = new ShareTopicExtra$Proxy("musicId");
       this.musicType$delegate = new ShareTopicExtra$Proxy("musicType");
       this.usedStart$delegate = new ShareTopicExtra$Proxy("usedStart");
       this.usedDuration$delegate = new ShareTopicExtra$Proxy("usedDuration");
       this.extraParams$delegate = new ShareTopicExtra$Proxy("extParam");
    }
    public static final ShareTopicExtra generateData(c p0,List p1,String p2){
       ShareTopicExtra$LocationInfo obj1;
       i b;
       m$k0 t;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, ShareTopicExtra.class, "14");
       if (obj != patchProxyRe) {
          return obj;
       }
       ShareTopicExtra$a companion = ShareTopicExtra.Companion;
       Objects.requireNonNull(companion);
       obj = f.class;
       ShareTopicExtra shareTopicEx = PatchProxy.applyThreeRefs(p0, p1, p2, companion, ShareTopicExtra$a.class, "1");
       if (shareTopicEx != patchProxyRe) {
       }else if(p0 != null){
          shareTopicEx = new ShareTopicExtra();
          ShareTopicExtra$ExtraParams uExtraParams = new ShareTopicExtra$ExtraParams();
          VideoContext videoContext = p0.d1();
          a.o(videoContext, "draft.videoContext");
          List list = null;
          ArrayList uArrayList = PatchProxy.applyOneRefs(videoContext, list, obj, "1");
          int i = 10;
          if (uArrayList != patchProxyRe) {
          }else {
             List list2 = f.c(videoContext);
             ArrayList uArrayList2 = new ArrayList(u.Y(list2, i));
             Iterator iterator1 = list2.iterator();
             while (iterator1.hasNext()) {
                uArrayList2.add(iterator1.next().b);
             }
             uArrayList = uArrayList2;
          }
          shareTopicEx.setMagicFaceIdList(uArrayList);
          ArrayList uArrayList1 = PatchProxy.applyOneRefs(videoContext, list, obj, "3");
          if (uArrayList1 != patchProxyRe) {
          }else {
             uArrayList1 = new ArrayList();
             if (videoContext != null) {
                b = videoContext.F();
                if (b != null) {
                   i d = b.d;
                   if (d != null) {
                      e$h i2 = d.i;
                      if (i2 != null) {
                         uArrayList1.add(i2);
                      }
                   }
                   b = b.c;
                   if (b != null) {
                      k$j o = b.o;
                      if (o != null) {
                         uArrayList1.add(o);
                      }
                   }
                }
             }
          }
          Iterator iterator = uArrayList1.iterator();
          while (true) {
             int i1 = 0;
             if (iterator.hasNext()) {
                obj1 = iterator.next();
                j$a uoa = (obj1.e != MusicType.LOCAL.mValue)? 1: null;
                if (!uoa) {
                   continue ;
                }
             }else {
                obj1 = list;
             }
             if (obj1 != null) {
                shareTopicEx.setMusicId(obj1.a);
                shareTopicEx.setMusicType(Integer.valueOf(obj1.e));
                shareTopicEx.setUsedStart(Long.valueOf(obj1.g));
                long l = videoContext.C();
                j$a h = obj1.h;
                if (1 - h <= 0 && l - h >= 0) {
                   shareTopicEx.setUsedDuration(Long.valueOf(h));
                }else {
                   shareTopicEx.setUsedDuration(Long.valueOf(l));
                }
                uExtraParams.setMusicId(obj1.a);
                uExtraParams.setMusicName(obj1.b);
                uExtraParams.setMusicType(Integer.valueOf(obj1.e));
                uExtraParams.setMusicTab(String.valueOf(obj1.f));
             }
             List list1 = f.c(videoContext);
             uArrayList = new ArrayList(u.Y(list1, i));
             iterator = list1.iterator();
             while (iterator.hasNext()) {
                k$e uoe = iterator.next();
                ShareTopicExtra$MagicFaceInfo magicFaceInf = new ShareTopicExtra$MagicFaceInfo();
                magicFaceInf.setId(uoe.b);
                magicFaceInf.setName(uoe.a);
                magicFaceInf.setTab(String.valueOf(uoe.n));
                uArrayList.add(magicFaceInf);
             }
             if (uArrayList.isEmpty()) {
                uArrayList = list;
             }
             uExtraParams.setMagicFaceList(uArrayList);
             LocationCityInfo locationCity = PatchProxy.apply(list, list, s.class, "2");
             if (locationCity != patchProxyRe) {
             }else {
                locationCity = u.e("default");
             }
             if (locationCity != null) {
                obj1 = new ShareTopicExtra$LocationInfo();
                obj1.setLatitude(Double.valueOf(locationCity.mLatitude));
                obj1.setLongitude(Double.valueOf(locationCity.mLongitude));
                obj1.setCityName(locationCity.mCityName);
                obj1.setProvince(locationCity.mProvince);
                obj1.setCountry(locationCity.mCountry);
                obj1.setAddress(locationCity.mAddress);
                uExtraParams.setLocation(obj1);
             }
             uArrayList1 = new ArrayList();
             b = videoContext.F().b;
             if (b != null) {
                m$k0 e = b.E;
                if (e != null) {
                   int len = e.length;
                   while (i1 < len) {
                      m$n m = e[i1].m;
                      if (m != null) {
                         ShareTopicExtra$LocationInfo locationInfo = new ShareTopicExtra$LocationInfo();
                         locationInfo.setLongitude(Double.valueOf(m.a));
                         locationInfo.setLatitude(Double.valueOf(m.b));
                         uArrayList1.add(locationInfo);
                      }
                      i1 = i1 + 1;
                   }
                }
             }
             if (uArrayList1.isEmpty() ^ 1) {
                uExtraParams.setAssetLocations(uArrayList1);
             }
             i b1 = videoContext.F().b;
             if (b1 != null) {
                t = b1.T;
                if (t != null) {
                   uExtraParams.setTemplateId(t.l);
                   uExtraParams.setTemplateName(t.m);
                }
             }
             b1 = videoContext.F().b;
             if (b1 != null) {
                t = b1.I;
                if (t != null) {
                   uExtraParams.setTemplateId(String.valueOf(t.c));
                   uExtraParams.setTemplateName(t.d);
                }
             }
             e$h k = f.d(videoContext).k;
             e$e b2 = (k != null)? k.b: list;
             uExtraParams.setCoverTitle(j.b(b2));
             Workspace workspace = p0.v();
             if (workspace != null) {
                list1 = workspace.getTextsList();
                if (list1 != null) {
                   uArrayList = new ArrayList(u.Y(list1, i));
                   iterator = list1.iterator();
                   while (iterator.hasNext()) {
                      Text text = iterator.next();
                      a.o(text, "it");
                      uArrayList.add(text.getText());
                   }
                   if (!uArrayList.isEmpty()) {
                   label_026b :
                      uExtraParams.setTexts(uArrayList);
                      String str = PatchProxy.apply(list, videoContext, VideoContext.class, "172");
                      if (str != patchProxyRe) {
                      }else {
                         str = b.i(videoContext.i());
                      }
                      uExtraParams.setActivityId(j.b(str));
                      if (p1 != null && !p1.isEmpty()) {
                         list = p1;
                      }
                      uExtraParams.setDefaultTag(list);
                      uExtraParams.setEditSessionId(j.b(p2));
                      shareTopicEx.setExtraParams(uExtraParams.toString());
                   }
                }
             }
             uArrayList = list;
             goto label_026b ;
          }
       }else {
          shareTopicEx = new ShareTopicExtra();
       }
       return shareTopicEx;
    }
    public final Map flatValues(){
       String value;
       ShareTopicExtra obj = PatchProxy.apply(null, this, ShareTopicExtra.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.data;
       LinkedHashMap linkedHashMa = new LinkedHashMap(s0.j(obj.size()));
       Iterator iterator = obj.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          Object key = uEntry.getKey();
          if (uEntry.getValue() instanceof List) {
             value = uEntry.getValue();
             Objects.requireNonNull(value, "null cannot be cast to non-null type kotlin.collections.List<*>");
             value = CollectionsKt___CollectionsKt.V2(value, ",", null, null, 0, null, null, 62, null);
          }else {
             value = uEntry.getValue();
          }
          linkedHashMa.put(key, value);
       }
       return linkedHashMa;
    }
    public final String getExtraParams(){
       Object obj = PatchProxy.apply(null, this, ShareTopicExtra.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.extraParams$delegate.getValue(this, ShareTopicExtra.$$delegatedProperties[5]);
    }
    public final List getForceTopItems(){
       return this.forceTopItems;
    }
    public final List getMagicFaceIdList(){
       Object obj = PatchProxy.apply(null, this, ShareTopicExtra.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.magicFaceIdList$delegate.getValue(this, ShareTopicExtra.$$delegatedProperties[0]);
    }
    public final String getMusicId(){
       Object obj = PatchProxy.apply(null, this, ShareTopicExtra.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.musicId$delegate.getValue(this, ShareTopicExtra.$$delegatedProperties[1]);
    }
    public final Integer getMusicType(){
       Object obj = PatchProxy.apply(null, this, ShareTopicExtra.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.musicType$delegate.getValue(this, ShareTopicExtra.$$delegatedProperties[2]);
    }
    public final Long getUsedDuration(){
       Object obj = PatchProxy.apply(null, this, ShareTopicExtra.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.usedDuration$delegate.getValue(this, ShareTopicExtra.$$delegatedProperties[4]);
    }
    public final Long getUsedStart(){
       Object obj = PatchProxy.apply(null, this, ShareTopicExtra.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.usedStart$delegate.getValue(this, ShareTopicExtra.$$delegatedProperties[3]);
    }
    public final void setExtraParams(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShareTopicExtra.class, "12")) {
          return;
       }
       this.extraParams$delegate.setValue(this, ShareTopicExtra.$$delegatedProperties[5], p0);
       return;
    }
    public final void setForceTopItems(List p0){
       this.forceTopItems = p0;
    }
    public final void setMagicFaceIdList(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShareTopicExtra.class, "2")) {
          return;
       }
       this.magicFaceIdList$delegate.setValue(this, ShareTopicExtra.$$delegatedProperties[0], p0);
       return;
    }
    public final void setMusicId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShareTopicExtra.class, "4")) {
          return;
       }
       this.musicId$delegate.setValue(this, ShareTopicExtra.$$delegatedProperties[1], p0);
       return;
    }
    public final void setMusicType(Integer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShareTopicExtra.class, "6")) {
          return;
       }
       this.musicType$delegate.setValue(this, ShareTopicExtra.$$delegatedProperties[2], p0);
       return;
    }
    public final void setUsedDuration(Long p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShareTopicExtra.class, "10")) {
          return;
       }
       this.usedDuration$delegate.setValue(this, ShareTopicExtra.$$delegatedProperties[4], p0);
       return;
    }
    public final void setUsedStart(Long p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShareTopicExtra.class, "8")) {
          return;
       }
       this.usedStart$delegate.setValue(this, ShareTopicExtra.$$delegatedProperties[3], p0);
       return;
    }
}
