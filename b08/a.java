package b08.a;
import com.kuaishou.bowl.data.center.data.model.ResourceItem;
import java.lang.String;
import com.kuaishou.bowl.data.center.data.model.BaseInfo;
import n08.a;
import com.kuaishou.bowl.data.center.data.model.MaterialDataItem;
import com.kuaishou.bowl.data.center.data.model.RenderInfo;
import android.net.Uri;
import ekd.x0;
import java.lang.CharSequence;
import zsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import f08.f;
import com.kwaishou.merchant.daccore.data.model.PendantMountInfo;
import java.lang.StringBuilder;
import f08.f$a;
import java.lang.Throwable;
import java.util.Map;
import com.kwaishou.merchant.daccore.log.DACKeyNode;
import com.kwaishou.merchant.daccore.log.DyTroubleShooting;
import c08.a;
import com.kwaishou.merchant.daccore.data.context.PendantLiveContext;
import fq5.b;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import uu.e;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.lang.Long;
import java.util.Collection;
import f08.b;
import f08.b$a;
import com.kuaishou.bowl.data.center.data.model.MaterialMap;
import java.lang.Number;
import com.kwaishou.merchant.daccore.PendantHolder;
import l08.c;

public final class a	// class@0002e9
{

    public static final String a(ResourceItem p0){
       p0 = p0.baseInfo;
       BaseInfo pageModuleCo = (p0 != null)? p0.pageModuleCode: null;
       return pageModuleCo;
    }
    public static final String b(a p0){
       String str1;
       RenderInfo renderType;
       f$a a;
       String str = null;
       if (p0 == null) {
          return str;
       }
       MaterialDataItem materialData = p0.c();
       if (materialData != null) {
          materialData = materialData.renderInfo;
          if (materialData != null) {
             RenderInfo renderUrl = materialData.renderUrl;
          label_0012 :
             str1 = (renderUrl != null)? x0.a(Uri.parse(renderUrl), "componentName"): str;
             int i = 1;
             MaterialDataItem materialData1 = (str1 == null || u.S1(str1))? 1: null;
             if (materialData1) {
                materialData1 = p0.c();
                if (materialData1 != null) {
                   materialData1 = materialData1.renderInfo;
                   if (materialData1 != null) {
                      renderType = materialData1.renderType;
                   label_003d :
                      if (i ^ a.g("OriginalNative", renderType)) {
                         a = f.a;
                         PendantMountInfo pendantMount = p0.e();
                         String str2 = (pendantMount != null)? pendantMount.getLiveId(): str;
                         StringBuilder str3 = "";
                         MaterialDataItem materialData2 = p0.c();
                         if (materialData2 != null) {
                            str = materialData2.pendantCode;
                         }
                         f$a.o(a, str2, str3+str+'_'+p0.d()+" getComponentName from renderUrl failed", null, null, 12, null);
                      }
                   }
                }
                renderType = str;
                goto label_003d ;
             }
             return str1;
          }
       }
       str1 = str;
       goto label_0012 ;
    }
    public static String c(DACKeyNode p0,String p1,String p2,int p3,Object p4){
       p2 = null;
       if (p0 == null) {
       }else {
          p2 = DyTroubleShooting.c.p(p1, p2, p0);
       }
       return p2;
    }
    public static final String d(a p0){
       String str = null;
       if (p0 == null) {
          return str;
       }
       PendantLiveContext pendantLiveC = p0.d();
       if (pendantLiveC != null) {
          str = pendantLiveC.getLiveId();
       }
       return str;
    }
    public static final String e(a p0){
       b uob = p0.b();
       String liveStreamId = (uob != null)? uob.getLiveStreamId(): null;
       return liveStreamId;
    }
    public static final int f(a p0){
       PendantLiveContext pendantLiveC = p0.d();
       int liveType = (pendantLiveC != null)? pendantLiveC.getLiveType(): -1;
       return liveType;
    }
    public static final List g(Map p0){
       b$a uoa;
       MaterialDataItem materialData1;
       try{
          uoa = null;
          if (p0 != null) {
             ArrayList uArrayList = new ArrayList(p0.size());
             Iterator iterator = p0.entrySet().iterator();
             while (iterator.hasNext()) {
                e value = iterator.next().getValue();
                if (value != null) {
                   value = value.a;
                   if (value != null) {
                      ResourceItem materialData = value.materialDatas;
                      if (materialData != null) {
                         materialData1 = CollectionsKt___CollectionsKt.p2(materialData);
                      label_0038 :
                         StringBuilder str = "";
                         MaterialDataItem pendantCode = (materialData1 != null)? materialData1.pendantCode: uoa;
                         str = str+pendantCode+'_';
                         Long longx = (materialData1 != null)? Long.valueOf(materialData1.materialId): uoa;
                         uArrayList.add(str+longx);
                      }
                   }
                }
                materialData1 = uoa;
                goto label_0038 ;
             }
             uoa = uArrayList;
          label_0065 :
             if (uoa == null) {
                uoa = new ArrayList();
             }
          }else {
             goto label_0065 ;
          }
       }catch(java.lang.Exception e6){
          Throwable throwable = e6;
          b$a.b(b.a, "getMaterialFromAgreementMap error", throwable, null, 4, null);
          uoa = new ArrayList();
       }
       return uoa;
    }
    public static final List h(Map p0){
       b$a uoa;
       try{
          uoa = null;
          if (p0 != null) {
             ArrayList uArrayList = new ArrayList(p0.size());
             Iterator iterator = p0.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                StringBuilder str = "";
                if (uEntry != null) {
                   MaterialMap value = uEntry.getValue();
                   if (value != null) {
                      value = value.pendantCode;
                   label_0033 :
                      uArrayList.add(str+value+'_'+uEntry.getKey().longValue());
                   }
                }
                b$a uoa1 = uoa;
                goto label_0033 ;
             }
             uoa = uArrayList;
          label_0055 :
             if (uoa == null) {
                uoa = new ArrayList();
             }
          }else {
             goto label_0055 ;
          }
       }catch(java.lang.Exception e6){
          Throwable throwable = e6;
          b$a.b(b.a, "getMaterialFromMaterialMap error", throwable, null, 4, null);
          uoa = new ArrayList();
       }
       return uoa;
    }
    public static final String i(a p0){
       b uob = p0.b();
       String str = (uob != null)? uob.s5(): null;
       return str;
    }
    public static final boolean j(PendantHolder p0,String p1){
       boolean b = (p0 != null && p0.b(p1) != null)? true: false;
       return b;
    }
}
