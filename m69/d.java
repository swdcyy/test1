package m69.d;
import j69.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.yxcorp.gifshow.aicut.api.AICutErrorCode;
import java.util.List;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LocalIntelligentAlbumPackage;
import java.lang.Long;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import h69.g;
import java.lang.StringBuilder;
import q87.c;
import q2b.h$b;
import java.lang.Number;
import m69.c;
import java.lang.Enum;
import java.lang.Iterable;
import java.lang.CharSequence;
import msd.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import wkd.b;
import com.yxcorp.gifshow.log.h;

public final class d implements b	// class@002e14
{

    public void d(){
       super();
    }
    public void a(boolean p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "3")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "AICUT_PRODUCE_FAILED_TOAST";
       String str = (p0)? "2178829": "2178830";
       u1.D0(str, null, 4, uElementPack, null, null);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "CANCEL_PRODUCE_AI_CUT";
       u1.u(6, uElementPack, null);
       return;
    }
    public void c(boolean p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "2")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "AICUT_PRODUCE_RETRY";
       String str = (p0)? "2178827": "2178828";
       u1.M(str, null, 1, uElementPack, null, null);
       return;
    }
    public void d(boolean p0,boolean p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uod, "1")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "AICUT_MANUAL_EDIT";
       JsonObject jsonObject = new JsonObject();
       String str = (p1)? "loading": "fail";
       jsonObject.c0("aicut_progress", str);
       uElementPack.params = jsonObject.toString();
       if (p0) {
          u1.D0("2463110", null, 6, uElementPack, null, null);
       }else {
          u1.M("2463111", null, 1, uElementPack, null, null);
       }
       return;
    }
    public void e(long p0,int p1,AICutErrorCode p2,List p3,long p4,String p5,ClientContent$LocalIntelligentAlbumPackage p6){
       Object[] objArray;
       int i10;
       h$b this;
       int i = p1;
       object oobject = p2;
       object oobject1 = p3;
       object oobject2 = p5;
       object oobject3 = p6;
       d uod = d.class;
       int i1 = 7;
       int i2 = 5;
       int i3 = 4;
       int i4 = 3;
       int i5 = 2;
       int i6 = 6;
       int i7 = 1;
       int i8 = 0;
       if (PatchProxy.isSupport(uod)) {
          objArray = new Object[i1];
          objArray[i8] = Long.valueOf(p0);
          objArray[i7] = Integer.valueOf(p1);
          objArray[i5] = oobject;
          objArray[i4] = oobject1;
          objArray[i3] = Long.valueOf(p4);
          objArray[i2] = oobject2;
          objArray[i6] = oobject3;
          if (PatchProxy.applyVoid(objArray, this, uod, "5")) {
             return;
          }
       }else {
          i6 = this;
       }
       a.p(oobject, "produceFailCode");
       a.p(oobject1, "costs");
       a.p(oobject2, "taskName");
       String str = ", ";
       Object[] objArray1 = new Object[i8];
       g.D().w("AICutLogger", "logAICutTask: "+i+str+oobject1, objArray1);
       h$b uob = h$b.e(i, oobject2);
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       JsonObject jsonObject = new JsonObject();
       jsonObject.a0("produce_time", Long.valueOf(p0));
       int i9 = c.a[p2.ordinal()];
       String str1 = "error_reason";
       if (i9 != i7) {
          if (i9 != i5) {
             if (i9 != i4) {
                if (i9 != 4) {
                   if (i9 != 5) {
                      jsonObject.c0(str1, "null");
                   }else {
                      jsonObject.c0(str1, "trans_code_failed");
                   }
                }else {
                   jsonObject.c0(str1, "ycnn_download_failed");
                }
             }else {
                jsonObject.c0(str1, "metadata_download_failed");
             }
          }else {
             jsonObject.c0(str1, "style_download_failed");
          }
       }else {
          jsonObject.c0(str1, "music_download_failed");
       }
       String str2 = "produce_status";
       if (i != 7) {
          if (i != 9) {
             jsonObject.c0(str2, "fail");
          }else {
             jsonObject.c0(str2, "interrupt");
          }
       }else {
          jsonObject.c0(str2, "success");
       }
       if (p3.size() < 6) {
          i9 = p3.size() - 6;
          for (i10 = 0; i10 < i9; i10 = i10 + 1) {
             oobject1.add(Long.valueOf(0));
          }
       }
       JsonObject jsonObject1 = jsonObject;
       ClientEvent$ElementPackage uElementPack1 = uElementPack;
       String str3 = str;
       this = uob;
       str2 = CollectionsKt___CollectionsKt.V2(p3, "&", null, null, null, 0, 0, 62, 0);
       i10 = (oobject1.get(0).longValue() - (long)1000 > 0)? 1: 0;
       objArray = new Object[0];
       g.D().s("AICutLogger", "logAICutTask: "+i+str3+str2+' '+i10, objArray);
       jsonObject1.c0("produce_time_detail", str2);
       jsonObject1.a0("is_first_loading", Integer.valueOf(i10));
       jsonObject1.a0("voice_check_time", Long.valueOf(p4));
       ClientEvent$ElementPackage uElementPack2 = uElementPack1;
       uElementPack2.params = jsonObject1.toString();
       a.o(this, "builder");
       this.k(uElementPack2);
       this.h(new ClientContent$ContentPackage());
       this.a().localIntelligentAlbumPackage = oobject3;
       u1.p0("", null, this);
       return;
    }
    public void logCustomEvent(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "6")) {
          return;
       }
       a.p(p0, "key");
       a.p(p1, "value");
       b.a(0x4b316083).logCustomEvent(p0, p1);
       return;
    }
}
