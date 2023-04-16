package b08.f;
import tu.g;
import com.kwaishou.merchant.daccore.data.PendantDataServer;
import c08.a;
import java.lang.Object;
import java.util.Map;
import f08.f;
import java.util.Objects;
import java.util.List;
import b08.a;
import java.lang.String;
import com.kwaishou.merchant.daccore.log.DACKeyNode;
import java.lang.StringBuilder;
import com.kwaishou.merchant.daccore.log.DyTroubleShooting;
import com.kwaishou.merchant.troubleshooting.core.model.RubasParams;
import java.lang.System;
import f08.d;
import java.lang.Runnable;
import ekd.s1;
import f08.b;
import f08.b$a;
import java.lang.Throwable;
import java.util.concurrent.ConcurrentHashMap;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import uu.e;
import com.kuaishou.bowl.data.center.data.model.ResourceItem;
import java.util.ArrayList;
import java.lang.Iterable;
import com.kuaishou.bowl.data.center.data.model.MaterialDataItem;
import java.lang.Long;
import com.kwaishou.merchant.daccore.util.PendantUtil;
import n08.a;
import com.kuaishou.bowl.data.center.data.model.RegionDecorativeInfo;
import fg6.a;
import com.kwaishou.merchant.daccore.data.model.PendantMountInfo;
import com.google.gson.JsonElement;
import java.lang.Class;
import com.google.gson.Gson;
import java.lang.CharSequence;
import zsd.u;
import kotlin.Pair;
import qrd.r0;
import trd.t0;
import f08.f$a;
import com.kwaishou.merchant.daccore.data.context.PendantLiveContext;
import qrd.l1;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.Context;
import android.app.Activity;
import h08.b;
import com.kwaishou.merchant.daccore.util.DynamicPendantSwitch;
import com.kwaishou.merchant.daccore.util.DynamicPendantSwitch$a;
import com.kwaishou.merchant.daccore.data.model.PendantMountInfo$DyAnimationConfig;
import java.util.Collection;
import java.lang.Boolean;
import kotlin.collections.CollectionsKt___CollectionsKt;
import bh.d;
import com.kuaishou.bowl.core.live.BusinessDataSource;
import com.kwaishou.merchant.daccore.data.model.DataSource;
import b08.c;
import java.lang.Enum;
import f08.c;
import f08.e;

public final class f implements g	// class@0002ee
{
    public final PendantDataServer a;
    public final a b;

    public void f(PendantDataServer p0,a p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(Map p0){
       f b;
       int i;
       Object obj1;
       String obj3;
       boolean b1;
       Iterator iterator3;
       String str2;
       int i2;
       PendantMountInfo pendantMount;
       int i3;
       Context baseContext;
       ArrayList uArrayList3;
       f uof = this;
       Map map = p0;
       f$a a = f.a;
       PendantDataServer h = uof.a.h;
       try{
          Objects.requireNonNull(a);
          DyTroubleShooting.e(a.d(h), DACKeyNode.DAC_ENV_INIT, "DAC receive agreement from SPB:"+a.g(p0).toString(), DyTroubleShooting.c.m(), false, null, false, 112, null);
          s1.d(new d(h, map, System.currentTimeMillis()));
       }catch(java.lang.Exception e0){
          b$a.b(b.a, "logAgreement error", e0, null, 4, null);
       }
       uof.a.h().clear();
       ConcurrentHashMap uConcurrentH = uof.a.h();
       f a1 = uof.a;
       b = uof.b;
       Objects.requireNonNull(a1);
       if (b != null) {
          LiveMerchantBaseContext liveMerchant = b.c();
          if (liveMerchant != null) {
             i = liveMerchant.getLiveType();
          label_007a :
             LinkedHashMap linkedHashMa = new LinkedHashMap();
             a1.b().clear();
             if (map != null) {
                Iterator iterator = p0.entrySet().iterator();
                while (iterator.hasNext()) {
                   Long obj = iterator.next().getValue();
                   e a2 = obj.a;
                   if (a2 != null) {
                      ResourceItem materialData = a2.materialDatas;
                      if (materialData != null) {
                         ArrayList uArrayList = new ArrayList();
                         Iterator iterator1 = materialData.iterator();
                         String str = "";
                         MaterialDataItem materialData1 = 1;
                         while (iterator1.hasNext()) {
                            obj1 = iterator1.next();
                            MaterialDataItem obj2 = obj1;
                            obj3 = obj;
                            a1.b().add(Long.valueOf(obj2.materialId));
                            obj2 = obj2.belonging;
                            if (obj2 != null) {
                               Objects.requireNonNull(PendantUtil.a);
                               if (i != materialData1) {
                                  if (i != 2) {
                                     if (i != 3) {
                                        if (i == 4) {
                                           str = "Playback";
                                        }
                                     }else {
                                        str = "Escrow";
                                     }
                                  }else {
                                     str = "Anchor";
                                  }
                               }else {
                                  str = "Audience";
                               }
                               b1 = obj2.contains(str);
                            }else {
                               b1 = false;
                            }
                            if (b1) {
                               uArrayList.add(obj1);
                            }
                            obj = obj3;
                         }
                         obj3 = obj;
                         Iterator iterator2 = uArrayList.iterator();
                         while (iterator2.hasNext()) {
                            Object obj4 = iterator2.next();
                            obj = Long.valueOf(obj4.materialId);
                            a uoa = new a();
                            obj1 = obj3;
                            uoa.a = obj1;
                            obj3 = str;
                            uoa.b = obj4.materialId;
                            uoa.c = obj4;
                            a2 = obj1.a;
                            String str1 = (a2 != null)? a.a(a2): null;
                            e a3 = obj1.a;
                            ResourceItem regionDecora = (a3 != null)? a3.regionDecorativeInfo: null;
                            try{
                               iterator3 = iterator;
                               str2 = obj4.pendantCode+'_'+obj4.materialId;
                               RegionDecorativeInfo androidMount = (regionDecora != null)? regionDecora.androidMountInfo: null;
                               if (androidMount != null) {
                                  pendantMount = a.a.c(regionDecora.androidMountInfo, PendantMountInfo.class);
                               }else if(regionDecora != null){
                                  androidMount = regionDecora.androidDecorativeInfo;
                                  if (androidMount != null && u.S1(androidMount) == true) {
                                     pendantMount = null;
                                  }
                               }
                               Gson a6 = a.a;
                               RegionDecorativeInfo androidDecor = (regionDecora != null)? regionDecora.androidDecorativeInfo: null;
                               pendantMount = a6.h(androidDecor, PendantMountInfo.class);
                            }catch(java.lang.Exception e0){
                               f$a a4 = f.a;
                               PendantDataServer i1 = a1.i;
                               i2 = a1;
                               Pair[] pairArray = new Pair[1];
                               if (!str2) {
                                  Object obj6 = obj3;
                               }
                               pairArray[0] = r0.a("pendantCode", str2);
                               a4.n(i1, "mountInfo deSerialize error", e0, t0.j0(pairArray));
                               pendantMount = null;
                            }
                            if (pendantMount != null) {
                               pendantMount.setMaterialId(obj4.materialId);
                               pendantMount.setPendantCode(obj4.pendantCode);
                               if (b != null) {
                                  PendantLiveContext pendantLiveC = b.d();
                                  if (pendantLiveC != null) {
                                     str1 = pendantLiveC.getLiveId();
                                  label_01fe :
                                     pendantMount.setLiveId(str1);
                                     str1 = (b != null)? a.e(b): null;
                                     pendantMount.setLiveStreamId(str1);
                                     l1 a5 = l1.a;
                                  }
                               }
                               str1 = null;
                               goto label_01fe ;
                            }else {
                               pendantMount = null;
                            }
                            uoa.d = pendantMount;
                            linkedHashMa.put(obj, uoa);
                            iterator = iterator3;
                            str = obj3;
                            a1 = i2;
                            Object obj5 = obj1;
                               if (pendantMount != null) {
                                  pendantMount.setArea(str1);
                                  if (str1 != null) {
                                     int i4 = str1.hashCode();
                                     if (i4 != -607775924) {
                                        if (i4 == 0x1d285c0d && str1.equals("TEMP_PLAY_AREA")) {
                                           i3 = 2;
                                        label_01ba :
                                           pendantMount.setLayoutArea(i3);
                                        }
                                     }else if(str1.equals("ASSOCIATED_CONTENT_AREA")){
                                        i3 = 1;
                                        goto label_01ba ;
                                     }
                                  }
                                  i3 = 0;
                                  goto label_01ba ;
                               }else {
                                  pendantMount = null;
                               }
                               i2 = a1;
                               StringBuilder str3 = null;
                               goto label_01e4 ;
                         }
                      }
                   }
                   iterator = iterator;
                   a1 = a1;
                }
             }
             uConcurrentH.putAll(linkedHashMa);
             uof = this;
             uof.a.f().onNext(uof.a.h());
             PendantDataServer h1 = uof.a.h;
             if (h1 != null) {
                GifshowActivity gifshowActiv = h1.a();
                if (gifshowActiv != null) {
                   baseContext = gifshowActiv.getBaseContext();
                label_0253 :
                   if (baseContext != null) {
                      b$a a7 = b.a;
                      uConcurrentH = uof.a.h();
                      try{
                         Objects.requireNonNull(a7);
                         if (DynamicPendantSwitch.a.b()) {
                            ArrayList uArrayList1 = new ArrayList();
                            if (uConcurrentH != null) {
                               ArrayList uArrayList2 = new ArrayList(uConcurrentH.size());
                               Iterator iterator4 = uConcurrentH.entrySet().iterator();
                               while (iterator4.hasNext()) {
                                  PendantMountInfo pendantMount1 = iterator4.next().getValue().e();
                                  if (pendantMount1 != null) {
                                     Map animationUrl = pendantMount1.getAnimationUrls();
                                     if (animationUrl != null) {
                                        uArrayList3 = new ArrayList();
                                        Iterator iterator5 = animationUrl.entrySet().iterator();
                                        while (iterator5.hasNext()) {
                                           String animationUrl1 = iterator5.next().getValue().getAnimationUrl();
                                           if (animationUrl1 != null) {
                                              uArrayList3.add(animationUrl1);
                                           }
                                        }
                                        Boolean uBoolean = (uArrayList3 != null)? Boolean.valueOf(uArrayList1.addAll(uArrayList3)): null;
                                        uArrayList2.add(uBoolean);
                                     }
                                  }
                                  uArrayList3 = null;
                                  goto label_02ca ;
                               }
                            }
                            List list = CollectionsKt___CollectionsKt.L1(uArrayList1);
                            d.c().e(baseContext, list);
                            b$a.e(b.a, "preload dynamic anim:size:"+list.size(), null, 2, null);
                         }
                      }catch(java.lang.Exception e0){
                         b$a.b(b.a, "DynamicResourcePreload.preloadAnim error", e0, null, 4, null);
                      }
                   }
                }
             }
             baseContext = null;
             goto label_0253 ;
          }
       }
       i = -1;
       goto label_007a ;
    }
    public void b(Map p0,Map p1){
       f uof;
       Map map;
       Map map1;
       int i;
       int i1;
       Enum uEnum;
       DataSource eNTER_MATERI;
       int i2;
       String str;
       Map map3;
       try{
          uof = this;
          map = p0;
          map1 = p1;
          Objects.requireNonNull(uof.a);
          i = 2;
          i1 = 0;
          if (map1) {
             uEnum = map1.get("businessSource");
          label_001b :
             if (!uEnum instanceof BusinessDataSource) {
                eNTER_MATERI = DataSource.ENTER_MATERIAL;
             }else {
                i2 = c.a[uEnum.ordinal()];
                if (i2 != 1) {
                   eNTER_MATERI = (i2 != i)? DataSource.ENTER_MATERIAL: DataSource.ENTER_MATERIAL;
                }else {
                   eNTER_MATERI = DataSource.PAGE_BACK_DATA;
                }
             }
          }else {
             uEnum = i1;
             goto label_001b ;
          }
       }catch(java.lang.Exception e0){
          Throwable throwable = e0;
          DyTroubleShooting.j(uof.a.i, DACKeyNode.DAC_RECEIVER_REQUEST_DATA, "getDataSource error", throwable, null, true, null, 80, null);
          eNTER_MATERI = DataSource.ENTER_MATERIAL;
       }
       DataSource uDataSource = eNTER_MATERI;
       f$a a = f.a;
       PendantDataServer h = uof.a.h;
       try{
          Objects.requireNonNull(a);
          i2 = c.a[uDataSource.ordinal()];
          if (i2 != 1) {
             str = (i2 != i)? "receive business data from SPB": "receive page back data from SPB";
          }else {
             str = "receive enter material from SPB";
          }
          String str1 = str+':'+a.h(p0)+" source:"+uDataSource;
          Map map2 = DyTroubleShooting.c.m();
          if (map2 != null) {
             map2.put("extraMap", map1);
             map3 = map2;
          }else {
             map3 = i1;
          }
          DyTroubleShooting.e(a.d(h), DACKeyNode.DAC_RECEIVER_REQUEST_DATA, str1, map3, true, null, false, 96, null);
          e uoe = new e(h, p0, uDataSource, p1, System.currentTimeMillis());
          s1.d(map2);
       }catch(java.lang.Exception e0){
          b$a.b(b.a, "logEnterMaterial error", e0, null, 4, null);
       }
       if (map) {
          uof.a.k(1, map, uDataSource);
       }
       return;
    }
}
