package com.yxcorp.gifshow.prettify.v4.magic.filter.Filters;
import java.io.Serializable;
import java.lang.Cloneable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import com.google.common.collect.HashBiMap;
import com.yxcorp.gifshow.prettify.v4.magic.filter.InternalFilterInfo;
import java.lang.Integer;
import java.lang.Object;
import java.util.Map;
import com.yxcorp.gifshow.video.api.prettify.filter.FilterVideoPlugin$FilterEntranceType;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterGroupResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xyb.a;
import q87.c;
import wkd.b;
import com.kwai.framework.cache.CacheManager;
import o1c.u;
import java.lang.reflect.Type;
import java.util.List;
import java.util.ArrayList;
import e1c.b;
import java.util.Iterator;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import java.lang.StringBuilder;
import java.util.Collection;
import ekd.q;
import qk.f;
import com.yxcorp.utility.Log;
import java.io.File;
import lxc.c;
import java.lang.Boolean;
import brd.t;
import o1c.q1;
import o1c.r1;
import erd.g;
import crd.b;
import qkd.b;
import java.lang.Exception;
import w46.b;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper;
import tkd.b;
import tkd.d;
import z0c.o;
import com.yxcorp.gifshow.video.api.prettify.filter.FilterVideoPlugin;
import java.lang.System;

public final class Filters implements Serializable, Cloneable	// class@0011a7
{
    public static Map b;
    public static Map c;
    public static Map d;
    public static Map e;
    public static final Map f;
    public static final f g;
    public static final Map h;

    static {
       Filters.b = new ConcurrentHashMap();
       Filters.c = new HashMap();
       Filters.d = new HashMap();
       Filters.e = new HashMap();
       Filters.f = new HashMap();
       Filters.g = HashBiMap.create();
       Filters.h = new HashMap();
       InternalFilterInfo[] internalFilt = InternalFilterInfo.values();
       int len = internalFilt.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = internalFilt[i];
          Filters.h.put(Integer.valueOf(oobject.mId), oobject);
       }
    }
    public void Filters(){
       super();
    }
    public static FilterGroupResponse a(FilterVideoPlugin$FilterEntranceType p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Filters.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (Filters.getFilterResponse(p0) == null) {
          return b.a(0x5f2ddeb4).g(u.c(p0), FilterGroupResponse.class);
       }
       Object[] objArray = new Object[0];
       a.D().w("Filters", "getResponseOrReadFile sFilterResponse", objArray);
       return Filters.getFilterResponse(p0);
    }
    public static void addCollectedFilterId(FilterVideoPlugin$FilterEntranceType p0,int p1){
       if (PatchProxy.isSupport(Filters.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, Filters.class, "20")) {
          return;
       }
       Map f = Filters.f;
       _monitor_enter(f);
       List list = f.get(p0);
       if (list == null) {
          list = new ArrayList();
       }
       list.add(Integer.valueOf(p1));
       f.put(p0, list);
       b.b(p0, list);
       _monitor_exit(f);
       return;
    }
    public static synchronized void b(FilterGroupResponse p0,FilterVideoPlugin$FilterEntranceType p1){
       _monitor_enter(Filters.class);
       Object obj = null;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, obj, Filters.class, "3")) {
          _monitor_exit(Filters.class);
          return;
       }else if(!p0.getAllFilters().size() || !Filters.getGroupedFilters(p1).isEmpty()){
          _monitor_exit(Filters.class);
          return;
       }else {
          ArrayList uArrayList = new ArrayList();
          ArrayList uArrayList1 = new ArrayList();
          ArrayList uArrayList2 = new ArrayList();
          boolean b = false;
          Iterator iterator = p0.getNormal(b).iterator();
          while (iterator.hasNext()) {
             uArrayList.add(iterator.next().clone());
          }
          iterator = p0.getPhotoMovie().iterator();
          while (iterator.hasNext()) {
             uArrayList1.add(iterator.next().clone());
          }
          iterator = p0.getNormal(true).iterator();
          while (iterator.hasNext()) {
             uArrayList2.add(iterator.next().clone());
          }
          Object[] objArray = new Object[b];
          a.D().w("Filters", "init group filters is empty: "+q.f(uArrayList2), objArray);
          if (uArrayList.size() > 0) {
             Filters.initExtraInfo(uArrayList);
             Filters.getAllFilterForType(p1).addAll(uArrayList);
             Filters.initExtraInfo(uArrayList2);
             Filters.getGroupedFilters(p1).addAll(uArrayList2);
             Object[] objArray1 = new Object[b];
             a.D().w("Filters", "init sNormalWithDividerFilters empty"+q.f(uArrayList2), objArray1);
             Filters.getGroupsInfo(p1).addAll(p0.getGroupsInfo());
          }
          if (uArrayList1.size() > 0) {
             Filters.initExtraInfo(uArrayList1);
             Filters.getAllFilterForType(p1).addAll(uArrayList1);
          }
          if (p0.mEnhanced != null) {
             Filters.getAllFilterForType(p1).add(p0.mEnhanced.clone());
          }
          if (uArrayList1.size() > 0 && uArrayList.size() > 0) {
             List allFilterFor = Filters.getAllFilterForType(p1);
             if (!PatchProxy.applyVoidOneRefs(allFilterFor, obj, Filters.class, "5")) {
                Iterator iterator1 = allFilterFor.iterator();
                while (iterator1.hasNext()) {
                   FilterConfig uFilterConfi = iterator1.next();
                   FilterConfig mFeatureId = uFilterConfi.mFeatureId;
                   if (mFeatureId == null) {
                      continue ;
                   }
                   Filters.g.put(Integer.valueOf(mFeatureId), uFilterConfi);
                }
             }
          }
          Filters.changeAllCollectedFilter(p1, b.a(p1));
          _monitor_exit(Filters.class);
          return;
       }
    }
    public static void changeAllCollectedFilter(FilterVideoPlugin$FilterEntranceType p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, Filters.class, "19")) {
          return;
       }
       Log.g("Filters", "changeAllCollectedFilter "+p1);
       Map f = Filters.f;
       _monitor_enter(f);
       List list = f.get(p0);
       if (list == null) {
          list = new ArrayList();
       }
       list.clear();
       if (p1 != null) {
          list.addAll(p1);
       }
       f.put(p0, list);
       _monitor_exit(f);
       return;
    }
    public static List getAllFilterForType(FilterVideoPlugin$FilterEntranceType p0){
       ArrayList uArrayList;
       List obj = PatchProxy.applyOneRefs(p0, null, Filters.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Filters.d.get(p0);
       if (obj == null) {
          uArrayList = new ArrayList();
          Filters.d.put(p0, uArrayList);
       }
       return uArrayList;
    }
    public static List getCollectedFilterIdList(FilterVideoPlugin$FilterEntranceType p0){
       Map obj = PatchProxy.applyOneRefs(p0, null, Filters.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Filters.f;
       _monitor_enter(obj);
       List list = obj.get(p0);
       if (list == null) {
          _monitor_exit(obj);
          return new ArrayList();
       }else {
          _monitor_exit(obj);
          return new ArrayList(list);
       }
    }
    public static FilterConfig getFilterConfigFromFeatureId(int p0,FilterVideoPlugin$FilterEntranceType p1){
       if (PatchProxy.isSupport(Filters.class)) {
          p1 = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, null, Filters.class, "10");
          if (p1 != PatchProxyResult.class) {
             return p1;
          }
       }
       if (!p0) {
          return null;
       }else {
          return Filters.g.get(Integer.valueOf(p0));
       }
    }
    public static FilterConfig getFilterInfoFromFilterId(int p0,FilterVideoPlugin$FilterEntranceType p1){
       FilterConfig obj;
       if (PatchProxy.isSupport(Filters.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, null, Filters.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Iterator iterator = Filters.getAllFilterForType(p1).iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          obj = iterator.next();
          if (obj.mFilterId == p0) {
             break ;
          }
       }
       return obj;
    }
    public static String getFilterResourcePath(FilterConfig p0){
       File obj = PatchProxy.applyOneRefs(p0, null, Filters.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = "";
       if (p0.mSourceType == null) {
          if (q.f(p0.mFilterResources)) {
             return str;
          }
          return new File(c.a(), p0.mFilterResources.get(0)).getAbsolutePath();
       }else {
          obj = new File(c.a(), p0.getUnZipDir());
          if (!obj.exists() || !obj.isDirectory()) {
             return str;
          }
          return obj.getAbsolutePath();
       }
    }
    public static FilterGroupResponse getFilterResponse(FilterVideoPlugin$FilterEntranceType p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Filters.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Filters.b.get(p0);
    }
    public static List getGroupedFilters(FilterVideoPlugin$FilterEntranceType p0){
       ArrayList uArrayList;
       List obj = PatchProxy.applyOneRefs(p0, null, Filters.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Filters.e.get(p0);
       if (obj == null) {
          uArrayList = new ArrayList();
          Filters.e.put(p0, uArrayList);
       }
       return uArrayList;
    }
    public static List getGroupsInfo(FilterVideoPlugin$FilterEntranceType p0){
       ArrayList uArrayList;
       List obj = PatchProxy.applyOneRefs(p0, null, Filters.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Filters.c.get(p0);
       if (obj == null) {
          uArrayList = new ArrayList();
          Filters.c.put(p0, uArrayList);
       }
       return uArrayList;
    }
    public static boolean hasFilterConfigs(FilterVideoPlugin$FilterEntranceType p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Filters.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (Filters.getFilterResponse(p0) != null || u.b(p0).exists())? true: false;
       return b;
    }
    public static boolean hasInit(FilterVideoPlugin$FilterEntranceType p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Filters.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (Filters.getAllFilterForType(p0).isEmpty() ^ 0x01);
    }
    public static void init(FilterVideoPlugin$FilterEntranceType p0){
       File c;
       String str = "Filters";
       if (PatchProxy.applyVoidOneRefs(p0, null, Filters.class, "2")) {
          return;
       }
       if (!Filters.getGroupedFilters(p0).isEmpty()) {
          return;
       }
       int i = 0;
       try{
          FilterGroupResponse uFilterGroup = Filters.a(p0);
          if (uFilterGroup != null) {
             Object[] objArray1 = new Object[i];
             a.D().w(str, "init curResponse", objArray1);
             Filters.b(uFilterGroup, p0);
          label_0040 :
             c = u.c;
             if (c.exists()) {
                b.q(c);
             }
             c = u.d;
             if (c.exists()) {
             }
          }else {
             Filters.updateFilterConfig(p0).subscribe(new q1(p0), new r1(p0));
             goto label_0040 ;
          }
       label_00a6 :
          return;
       }catch(java.lang.Exception e3){
          if (Filters.getFilterResponse(p0) != null) {
             Filters.setFilterResponse(null, p0);
          }
          if (u.b(p0).exists()) {
             b.q(u.b(p0));
          }
          Object[] objArray = new Object[i];
          a.D().t(str, "init error "+e3.getMessage(), objArray);
          c = u.c;
          if (c.exists()) {
             b.q(c);
          }
          c = u.d;
          if (c.exists()) {
          }else {
             goto label_00a6 ;
          }
       }
       b.q(c);
       goto label_00a6 ;
    }
    public static void initExtraInfo(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, Filters.class, "4")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          FilterConfig uFilterConfi = iterator.next();
          InternalFilterInfo internalFilt = Filters.h.get(Integer.valueOf(uFilterConfi.mFilterId));
          if (internalFilt != null) {
             uFilterConfi.mFeatureId = internalFilt.mFeatureId;
          }
          if (uFilterConfi.mFeatureId == null) {
             FilterConfig mFilterId = uFilterConfi.mFilterId;
             if (mFilterId > null) {
                uFilterConfi.mFeatureId = mFilterId;
             }
          }
          int i = 2;
          if (!uFilterConfi.getColorFilterType(i)) {
             FilterConfig mImageType = uFilterConfi.mImageType;
             if (mImageType == null) {
                mImageType = uFilterConfi.mDimension;
                if (mImageType == 8) {
                   uFilterConfi.setColorFilterType(i);
                }else if(mImageType == 4){
                   uFilterConfi.setColorFilterType(7);
                }else if(mImageType == 16){
                   uFilterConfi.setColorFilterType(8);
                }
             }else if(mImageType == 1 && uFilterConfi.mDimension == 32){
                uFilterConfi.setColorFilterType(9);
             }
          }
       }
       return;
    }
    public static void removeCollectedFilterId(FilterVideoPlugin$FilterEntranceType p0,Integer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, Filters.class, "21")) {
          return;
       }
       Map f = Filters.f;
       _monitor_enter(f);
       List list = f.get(p0);
       if (list == null) {
          _monitor_exit(f);
          return;
       }else {
          list.remove(p1);
          f.put(p0, list);
          b.b(p0, list);
          _monitor_exit(f);
          return;
       }
    }
    public static void setFilterResponse(FilterGroupResponse p0,FilterVideoPlugin$FilterEntranceType p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, Filters.class, "17")) {
          return;
       }
       if (p0 == null) {
          Filters.b.remove(p1);
       }else {
          Filters.b.put(p1, p0);
       }
       return;
    }
    public static t updateFilterConfig(FilterVideoPlugin$FilterEntranceType p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Filters.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.D().w("Filters", "updateFilterConfig "+p0, objArray);
       if (Filters.getFilterResponse(p0) != null) {
          return t.just(Filters.getFilterResponse(p0));
       }
       return d.a(-860154223).PQ(p0);
    }
    public static void writeFilterFile(FilterGroupResponse p0,FilterVideoPlugin$FilterEntranceType p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, Filters.class, "14")) {
          return;
       }
       b.a(0x5f2ddeb4).c(u.c(p1), p0, FilterGroupResponse.class, (System.currentTimeMillis() + u.b));
       return;
    }
}
