package com.kwai.middleware.resourcemanager.cache.BaseResourceCacheRepo;
import bb7.a;
import db7.b;
import db7.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.middleware.resourcemanager.cache.type.RequestState;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import com.kwai.middleware.resourcemanager.cache.type.Result$SOURCE;
import java.util.List;
import com.kwai.middleware.resourcemanager.cache.type.Result;
import com.kwai.middleware.resourcemanager.cache.type.CachePolicy;
import brd.t;
import java.lang.System;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.util.Map;
import ab7.f;
import java.util.concurrent.Callable;
import ab7.n;
import erd.o;
import ab7.g;
import ab7.h;
import t45.d;
import brd.z;
import ab7.c;
import ab7.i;
import ab7.a;
import java.lang.Enum;
import ab7.l;
import ab7.m;
import kotlin.NoWhenBranchMatchedException;
import brd.w;
import ab7.k;
import ab7.j;
import ab7.d;
import erd.g;
import ab7.e;
import java.util.Iterator;
import java.lang.Iterable;
import cb7.b;
import com.kwai.middleware.resourcemanager.cache.BaseResourceCacheRepo$filterSupportedGroupList$$inlined$forEach$lambda$1;
import msd.l;
import trd.y;
import java.util.Collection;
import com.kwai.middleware.resourcemanager.cache.adt.UnionResponse;
import com.kwai.middleware.resourcemanager.cache.adt.DetailResponse;
import java.util.HashMap;
import com.kwai.middleware.resourcemanager.cache.adt.DetailInfo;
import cb7.a;
import com.kwai.middleware.resourcemanager.cache.adt.SimpleInfo;
import ekd.k1;
import trd.u;
import kotlin.collections.CollectionsKt___CollectionsKt;

public class BaseResourceCacheRepo	// class@000f37
{
    public final String a;
    public boolean b;
    public RequestState c;
    public List d;
    public List e;
    public Map f;
    public UnionResponse g;
    public Map h;
    public long i;
    public final a j;
    public final b k;
    public final a l;

    public void BaseResourceCacheRepo(a p0,b p1,a p2){
       a.p(p0, "adapter");
       a.p(p1, "remoteDataLoader");
       a.p(p2, "localDataLoader");
       super();
       this.j = p0;
       this.k = p1;
       this.l = p2;
       this.a = "[RMResource] CacheRepo";
       this.b = true;
       this.c = RequestState.NONE;
       this.e = new ArrayList();
       this.f = new LinkedHashMap();
       this.h = new LinkedHashMap();
    }
    public static Result e(BaseResourceCacheRepo p0,Result$SOURCE p1,List p2,boolean p3,int p4,Object p5){
       if (p4 & 0x04) {
          p3 = false;
       }
       return p0.d(p1, p2, p3);
    }
    public t a(CachePolicy p0){
       a.p(p0, "cachePolicy");
       this.i = System.currentTimeMillis();
       Log.g(this.f(), "fetch\(\) called with: cachePolicy = ["+p0+']');
       this.d = null;
       this.f.clear();
       this.c().clear();
       this.h.clear();
       this.g = null;
       boolean b = true;
       this.b = b;
       this.c = RequestState.PROCESSING;
       t ot = t.fromCallable(new f(this)).map(new n(this)).map(new g(this));
       t ot1 = ot.onErrorReturn(new h(this));
       z c = d.c;
       t ot2 = this.k.b().subscribeOn(c).observeOn(c).flatMap(new c(this)).map(new i(this, p0));
       int i = a.a[p0.ordinal()];
       if (i != b) {
          if (i != 2) {
             if (i != 3) {
                if (i != 4) {
                   if (i == 5) {
                      ot = ot1.flatMap(new l(ot2)).onErrorReturn(new m(this));
                   }else {
                      throw new NoWhenBranchMatchedException();
                   }
                }else {
                   ot = ot1.concatWith(ot2).onErrorResumeNext(new k(this));
                }
             }else {
                ot = ot.onErrorResumeNext(ot2);
             }
          }else {
             ot = ot1.flatMap(new j(ot2));
          }
       }
       t ot3 = ot.subscribeOn(c).observeOn(d.a).doOnNext(new d(this)).doOnError(new e(this));
       a.o(ot3, "observable");
       return ot3;
    }
    public final List b(List p0){
       Log.g(this.f(), "filterValidGroup called\(\)");
       ArrayList uArrayList = new ArrayList();
       if (p0 != null) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             b uob = iterator.next();
             if (uob == null || !this.j.d(uob)) {
                continue ;
             }else {
                List detailInfoLi = uob.getDetailInfoList();
                if (detailInfoLi != null) {
                   y.K0(detailInfoLi, new BaseResourceCacheRepo$filterSupportedGroupList$$inlined$forEach$lambda$1(this, uArrayList));
                }
                detailInfoLi = uob.getDetailInfoList();
                if (detailInfoLi != null) {
                   int i = 1;
                   int i1 = detailInfoLi.isEmpty() ^ i;
                   if (i1 == i) {
                      uArrayList.add(uob);
                   }
                }
             }
          }
       }
       Log.g(this.f(), "groupInfoList = "+uArrayList.size());
       return uArrayList;
    }
    public List c(){
       return this.e;
    }
    public final Result d(Result$SOURCE p0,List p1,boolean p2){
       int i = 1;
       if (p2) {
          i = i ^ a.g(this.d, p1);
       }
       this.d = p1;
       Log.b(this.f(), "getResult\(\) called with: source = ["+p0+"], isChanged=["+i+"], list = ["+p1.size()+']');
       return new Result(p0, i, p1);
    }
    public String f(){
       return this.a;
    }
    public List g(UnionResponse p0,DetailResponse p1){
       Iterator iterator;
       b uob;
       List detailList;
       List groupList;
       Object obj;
       a.p(p0, "networkUnionResponse");
       BaseResourceCacheRepo tf = this.f;
       String str = "[RMResource] Helper";
       Log.g(str, "fillUnionResponseWithDetailResponse called\(\)");
       ArrayList uArrayList = new ArrayList();
       if (p0 == null) {
       }else {
          LinkedHashMap linkedHashMa = new LinkedHashMap();
          if (tf != null) {
             linkedHashMa.putAll(tf);
          }
          Log.g(str, "getInfoFromDetailResponse called\(\)");
          HashMap hashMap = new HashMap();
          int i = 1;
          if (p1 != null) {
             detailList = p1.getDetailList();
             detailList = (detailList == null || detailList.isEmpty())? 1: null;
             if (!detailList) {
                groupList = p1.getDetailList();
                if (groupList != null) {
                   iterator = groupList.iterator();
                   while (iterator.hasNext()) {
                      DetailInfo uDetailInfo1 = iterator.next();
                      if (uDetailInfo1 != null) {
                         hashMap.put(uDetailInfo1.getUniqueIdentifier(), uDetailInfo1);
                      }
                   }
                }
                Log.g(str, "result size = "+hashMap.size());
             }
          }
          linkedHashMa.putAll(hashMap);
          groupList = p0.getGroupList();
          if (groupList != null) {
             iterator = groupList.iterator();
             while (iterator.hasNext()) {
                uob = iterator.next();
                if (uob == null) {
                }else {
                   detailList = uob.getDetailInfoList();
                   if (detailList != null) {
                      detailList.clear();
                   }else {
                      uob.setDetailInfoList(new ArrayList());
                   }
                   detailList = uob.getSimpleInfoList();
                   if (detailList != null) {
                      Iterator iterator1 = detailList.iterator();
                      while (iterator1.hasNext()) {
                         SimpleInfo simpleInfo = iterator1.next();
                         if (simpleInfo == null) {
                         }else {
                            String uniqueIdenti = simpleInfo.getUniqueIdentifier();
                            DetailInfo uDetailInfo = linkedHashMa.get(uniqueIdenti);
                            if (uDetailInfo == null) {
                               Log.d(str, "wrong checksum");
                               Iterator iterator2 = linkedHashMa.values().iterator();
                               while (true) {
                                  if (iterator2.hasNext()) {
                                     obj = iterator2.next();
                                     if (!a.g(obj.getId(), simpleInfo.getId())) {
                                        continue ;
                                     }
                                  }else {
                                     obj = 0;
                                  }
                                  uDetailInfo = obj;
                               }
                            }
                            if (uDetailInfo != null) {
                               uDetailInfo.setGroupId(uob.getGroupId());
                               uDetailInfo.setGroupName(uob.getGroupName());
                               List detailInfoLi1 = uob.getDetailInfoList();
                               if (detailInfoLi1 != null) {
                                  detailInfoLi1.add(uDetailInfo);
                               }else {
                                  continue ;
                               }
                            }else {
                               Log.d(str, "can not find "+uniqueIdenti);
                               continue ;
                            }
                         }
                      }
                   }
                   detailList = uob.getDetailInfoList();
                   if (detailList != null) {
                      int i1 = detailList.isEmpty() ^ i;
                      if (i1 == i) {
                         uArrayList.add(uob);
                      }
                   }
                }
             }
          }
          Log.g(str, "groupInfoList = "+uArrayList.size());
       }
       Log.b(this.f(), "saveUnionResponse\(\) called");
       if (p0 == null || this.b == null) {
          Log.d(this.f(), "do not need save union response");
       }else {
          this.l.b(p0);
          Log.g(this.f(), "saveUnionResponse cost = "+k1.t(System.currentTimeMillis()));
       }
       this.g = p0;
       ArrayList uArrayList1 = new ArrayList(u.Y(uArrayList, 10));
       iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          uob = iterator.next();
          str = uob.getGroupId();
          if (str != null) {
             BaseResourceCacheRepo th = this.h;
             List detailInfoLi = uob.getDetailInfoList();
             detailInfoLi = (detailInfoLi != null)? CollectionsKt___CollectionsKt.J5(detailInfoLi): null;
             th.put(str, detailInfoLi);
          }else {
             str = null;
          }
          uArrayList1.add(str);
       }
       this.h(this.b(uArrayList));
       return this.c();
    }
    public void h(List p0){
       a.p(p0, "<set-?>");
       this.e = p0;
    }
}
