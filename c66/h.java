package c66.h;
import java.util.Random;
import java.lang.String;
import java.util.concurrent.ExecutorService;
import t45.c;
import java.util.concurrent.Executor;
import brd.z;
import lrd.b;
import java.lang.Object;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.app.Application;
import o56.a;
import android.content.Context;
import android.content.SharedPreferences;
import vid.b;
import e66.a;
import tkd.b;
import tkd.d;
import c66.p;
import org.json.JSONArray;
import com.yxcorp.utility.SystemUtil;
import com.yxcorp.utility.TextUtils;
import ekd.a0;
import h30.a;
import com.kwai.robust.PatchProxyResult;
import qe6.b;
import java.util.List;
import java.util.ArrayList;
import java.lang.StringBuffer;
import java.lang.CharSequence;
import android.text.TextUtils;
import h66.c;
import h66.b;
import java.util.Objects;
import h66.a;
import fg6.a;
import com.google.gson.Gson;
import k2b.u1;
import com.kwai.framework.network.util.SafeModeLogEncryptor;
import android.util.Base64;
import c66.h$a;
import wkd.b;
import com.kwai.framework.network.monitor.IPv6AddressMonitor;
import c66.i;
import gb6.a;
import z56.c;
import c66.k;
import lnc.t3;
import com.yxcorp.utility.n;
import com.kwai.library.thirdparty.adchannelutils.AdChannelUtils;
import org.json.JSONObject;
import com.yxcorp.utility.RomUtils;
import com.kwai.library.thirdparty.adchannelutils.AdChannelUtils$RomType;
import android.net.Uri;
import android.content.ContentResolver;
import android.content.ContentProviderClient;
import android.os.Bundle;
import java.lang.Exception;
import cz6.a;
import org.json.JSONException;
import brd.t;
import cjd.e;
import erd.o;
import c66.c;
import erd.g;
import c66.f;
import cjd.a;
import c66.d;
import c66.e;
import c66.a;
import c66.g;
import c66.b;
import erd.a;

public class h	// class@00065a
{
    public static final Random a;
    public static z b;

    static {
       h.a = new Random();
       h.b = b.b(c.f("SystemStat"));
    }
    public void h(){
       super();
    }
    public static void a(RequestTiming p0){
       String a;
       String str9;
       String str10;
       String str16;
       String str17;
       int i;
       h oh = h.class;
       ContentProviderClient obj = null;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, obj, oh, str)) {
          return;
       }
       Application uApplication = a.b();
       SharedPreferences sharedPrefer = b.c(a.b(), a.w, 0);
       String str1 = d.a(0x602408db).QA(uApplication).toString();
       String str2 = "";
       String str3 = sharedPrefer.getString("push_channel_id", str2);
       String str4 = sharedPrefer.getString("push_user_id", str2);
       String str5 = sharedPrefer.getString("origin_channel", "UNKNOWN");
       String str6 = String.valueOf(a.e());
       long longx = sharedPrefer.getLong("LastShowUpdateTime", 0);
       String str7 = a0.c(TextUtils.L(SystemUtil.m(uApplication)));
       String str8 = TextUtils.k(a.d());
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       k obj1 = PatchProxy.applyOneRefs(uApplication, obj, oh, "2");
       if (obj1 != patchProxyRe) {
          str = obj1;
       }else if(b.a()){
          List list = SystemUtil.j(uApplication);
          List list1 = list;
          if (!list1.isEmpty()) {
             str10 = PatchProxy.applyOneRefs(list, obj, oh, "3");
             if (str10 != patchProxyRe) {
             }else {
                str10 = "";
                if (!list1.isEmpty()) {
                   str10 = str10+"[";
                   int i1 = 0;
                   while (i1 < list1.size()) {
                      str16 = list1.get(i1);
                      if (!TextUtils.x(str16)) {
                         str17 = "\"";
                         if (str16.contains(str17)) {
                            str16 = str16.replaceAll(str17, str2);
                         }
                         String str18 = "\'";
                         if (str16.contains(str18)) {
                            str16 = str16.replaceAll(str18, str2);
                         }
                         if (!TextUtils.isEmpty(str16)) {
                            str10 = str10+str17+str16+str17;
                            int i2 = list1.size() - 1;
                            if (i1 != i2) {
                               str10 = str10+",";
                            }
                         }
                      }
                   label_00ee :
                      i1 = i1 + 1;
                   }
                   str10 = str10+"]";
                }
                str10.setLength(0);
                str10 = str10;
             }
             c a2 = c.a;
             b uob = new b();
             Objects.requireNonNull(a2);
             if (!PatchProxy.applyVoidTwoRefs(list, uob, a2, c.class, str) && uob.e()) {
                str = "";
                str9 = a.a.q(list);
                if (!TextUtils.x(str9)) {
                   str = str+str9;
                }
                str = str+"_"+a.a;
                str9 = str;
                i = 0;
                str.setLength(i);
                u1.R("key_cu_env_gson_imei", str9, 9);
             }else {
                i = 0;
             }
          }else {
             i = 0;
             str10 = str2;
          }
          str = Base64.encodeToString(SafeModeLogEncryptor.b.a(str10.getBytes()), i);
       }else {
          str = str2;
       }
       a = h$a.a;
       str9 = b.a(-1554820802).b();
       str10 = b.a(-1554820802).a();
       i oi = new i();
       a uoa = oi.a();
       obj1 = b.a(0x557c1e76);
       String a1 = a.a;
       String j = a.j;
       String k = a.k;
       String str11 = t3.c(uApplication);
       String str12 = String.valueOf(n.y(uApplication));
       String str13 = String.valueOf(n.u(uApplication));
       String u = a.u;
       String str14 = (TextUtils.x(str9))? obj: str9;
       String str15 = (TextUtils.x(str10))? obj: str10;
       uApplication = a.b();
       str10 = AdChannelUtils.b;
       if (str10 == null) {
          try{
             JSONObject jSONObject = new JSONObject();
             str16 = "data";
             str17 = "type";
             if (RomUtils.w()) {
                jSONObject.put(str17, AdChannelUtils$RomType.VIVO.getType());
                jSONObject.put(str16, AdChannelUtils.c(uApplication));
                jSONObject.put("data_v2", AdChannelUtils.d(uApplication));
             }else if(RomUtils.n()){
                jSONObject.put(str17, AdChannelUtils$RomType.HUAWEI.getType());
                jSONObject.put(str16, AdChannelUtils.b(uApplication));
             }else if(!RomUtils.s() && (RomUtils.r() || RomUtils.t())){
                jSONObject.put(str17, AdChannelUtils$RomType.OPPO.getType());
                Uri uri = Uri.parse("content://com.heytap.market.TrackProvider");
                ContentResolver contentResol = uApplication.getContentResolver();
                try{
                   ContentProviderClient uContentProv = contentResol.acquireUnstableContentProviderClient(uri);
                   if (uContentProv != null) {
                      try{
                         Bundle uBundle = uContentProv.call("getTrackInfo", obj, obj);
                         if (uBundle != null) {
                            str10 = uBundle.getString("key_track_info");
                         label_0243 :
                            if (uContentProv != null) {
                               uContentProv.release();
                            }
                         }else {
                         label_0242 :
                            str10 = str2;
                            goto label_0243 ;
                         }
                      }catch(java.lang.Exception e0){
                         obj = uContentProv;
                      }
                      e0.printStackTrace();
                      if (obj) {
                         obj.release();
                      }
                      str10 = str2;
                   }else {
                      goto label_0242 ;
                   }
                   jSONObject.put(str16, str10);
                }catch(java.lang.Exception e0){
                   goto label_024c ;
                }
             }
             jSONObject.put("activation", a.a(uApplication));
             AdChannelUtils.b = jSONObject.toString();
          }catch(org.json.JSONException e0){
             e0.printStackTrace();
             AdChannelUtils.b = str2;
          }
          str10 = AdChannelUtils.b;
       }
       obj1.a(a1, j, str6, k, str5, "", str1, str3, str4, "1", str11, "", str7, str8, str, str12, str13, u, "", a, longx, str14, str15, str10, uoa.a(), uoa.b(), p0).map(new e()).observeOn(h.b).map(oi).doOnSubscribe(c.b).doOnNext(a.a(f.b)).doAfterNext(d.b).doOnError(a.a(e.b)).doOnNext(a.a).doOnError(g.b).doOnComplete(b.b).blockingFirst();
       return;
    }
}
