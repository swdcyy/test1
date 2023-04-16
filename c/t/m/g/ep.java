package c.t.m.g.ep;
import android.content.Context;
import java.lang.Object;
import c.t.m.g.eu;
import c.t.m.g.ep$a;
import c.t.m.g.en;
import android.os.Looper;
import java.lang.String;
import java.util.List;
import c.t.m.g.ff;
import c.t.m.g.fj;
import c.t.m.g.fa;
import c.t.m.g.ex;
import java.lang.StringBuilder;
import java.util.ArrayList;
import c.t.m.g.fc;
import java.io.File;
import android.os.Handler;
import java.util.Iterator;
import c.t.m.g.ev;
import java.lang.CharSequence;
import java.lang.Throwable;
import org.json.JSONObject;
import org.json.JSONArray;
import java.lang.Exception;
import java.lang.System;
import java.lang.Long;

public class ep	// class@000c75
{
    public Context a;
    public ep$a b;
    public String c;
    public boolean d;
    public eu e;
    public boolean f;

    public void ep(Context p0){
       super();
       this.c = "CheckUpdate";
       this.d = true;
       this.f = false;
       this.a = p0;
       this.e = new eu(p0);
       this.b = new ep$a(this, en.a(p0).c());
    }
    public static String a(ep p0){
       return p0.c;
    }
    public static void a(ep p0,boolean p1){
       p0.b(p1);
    }
    public static boolean b(ep p0){
       return p0.d;
    }
    public static void c(ep p0){
       p0.a();
    }
    public final List a(String p0,List p1){
       p0 = fa.b(p0, fj.a("m_update_pwd", ff.m));
       if (ex.a) {
          ex.a(this.c, "decryAes256 the response is : "+p0);
       }
       p0 = this.b(p0, p1);
       String str = "parseJson is ";
       if (ex.a) {
          ex.a(this.c, str+p0);
       }
       String str1 = "MCUS";
       en.a(this.a).a(str1, "updateModules,"+p0);
       p1 = null;
       if (p0 == null) {
          if (ex.a) {
             ex.a(this.c, str+p0);
          }
          return p1;
       }else {
          List list = fj.a(p0);
          if (list == null || list.isEmpty()) {
             if (ex.a) {
                ex.a(this.c, "update desc complist is empty");
             }
             return p1;
          }else if(ex.a){
             ex.a(this.c, "need update module string : "+fj.a(list));
          }
          String str2 = "preference_default";
          String str3 = fj.b(this.a, "SP_bad_TMLSDK_info", str2);
          if (ex.a) {
             ex.a(this.c, "badDexInfoStr : "+str3);
          }
          List list1 = fj.a(str3);
          if (!str3.equals(str2) && !list1.isEmpty()) {
             ArrayList uArrayList = fj.a(list, list1);
             if (ex.a) {
                ex.a(this.c, "the num update dex in bad dex is "+uArrayList.size());
             }
             if (uArrayList.size() > 0) {
                en.a(this.a).a(str1, "updateModules is bad,donot update");
                return p1;
             }
          }
       label_0110 :
          if (ex.a) {
             ex.b(this.c, "update desc prepared, prepare download,"+p0);
          }
          return list;
       }
    }
    public final List a(List p0){
       String str = this.b(p0);
       List list = null;
       if (str == null) {
          if (ex.a) {
             ex.a(this.c, "download desc file postjsondata is null !!!");
          }
          return list;
       }else if(ex.a){
          ex.a(this.c, "desc file request postjson "+str);
       }
       byte[] bytes = str.getBytes();
       if (bytes != null) {
          StringBuilder str1 = 3;
          int i = 0;
          while (true) {
             int i1 = i + 1;
             if (i < str1) {
                if (ex.a) {
                   ex.a(this.c, "desc file request times is "+i1);
                }
                byte[] uobyteArray = fc.a("https://cc.map.qq.com?desc_c", bytes);
                if (uobyteArray != null) {
                   str = new String(uobyteArray);
                   if (ex.a) {
                      ex.a(this.c, "download dex desc file: "+str);
                      break ;
                   }
                   break ;
                }else {
                   en.a(this.a).a("MCUS", "response failed,try:"+i1);
                   i = i1;
                }
             }
          }
          return this.a(str, p0);
       }
       return list;
    }
    public final void a(){
       String str2;
       if (this.f != null) {
          return;
       }
       this.f = true;
       String str = "loaddir,";
       File[] uFileArray = fj.a(this.a, "TMLSDK_hp").listFiles();
       if (uFileArray != null && uFileArray.length > 0) {
          for (int i = 0; i < uFileArray.length; i = i + 1) {
             object oobject = uFileArray[i];
             String str1 = "";
             if (oobject.isFile()) {
                str1 = ",";
                str2 = str1+"f,"+oobject.getName()+str1+oobject.length()+str1+oobject.canRead()+str1+oobject.canWrite();
             }else {
                str2 = str1+"d,"+oobject.getName();
             }
             str = str+str2+";";
          }
       }
       en.a().a("MCUS", str);
       return;
    }
    public void a(boolean p0){
       this.d = p0;
       this.b.sendEmptyMessageDelayed(0x2716, 1000);
    }
    public final boolean a(int p0,String p1,long p2,String p3,List p4){
       try{
          Iterator iterator = p4.iterator();
          while (iterator.hasNext()) {
             ev uoev = iterator.next();
             if (p0 == uoev.a && (!p2 - uoev.d && ((uoev.c).contains(p3) && (uoev.e).equals(p1)))) {
                return true;
             }
             continue ;
          }
       }catch(java.lang.Exception e5){
          if (ex.a) {
             ex.a(this.c, e5);
          }
       }
       return false;
    }
    public final String b(String p0,List p1){
       String str3;
       ep uoep = this;
       String str = p0;
       String str1 = null;
       try{
          JSONObject jSONObject = new JSONObject(str);
          String str2 = jSONObject.getString("status");
          en.a(uoep.a).a("MCUS", "statucode,"+str2+","+str);
          if (str2.equals("-3")) {
             if (ex.a) {
                ex.a(uoep.c, "local dex version is the same to the lasted version in server,not need to update!!");
             }
             return str1;
          }else if(str2.equals("0")){
             if (ex.a) {
                ex.a(uoep.c, "need to update dex from server !!");
             }
             str = "";
             JSONArray jSONArray = jSONObject.getJSONArray("compList");
             int i = 0;
             while (true) {
                if (i >= jSONArray.length()) {
                   return str;
                }
                jSONObject = jSONArray.getJSONObject(i);
                int intx = jSONObject.getInt("compId");
                String str4 = jSONObject.getString("compVer");
                String str5 = jSONObject.getString("md5");
                long longx = jSONObject.getLong("size");
                String str6 = jSONObject.getString("compName");
                String str7 = str5;
                long l = longx;
                p0 = str6;
                str1 = str5;
                if (this.a(intx, str7, longx, str6, p1)) {
                   if (ex.a) {
                      ex.b(uoep.c, "current comp from server is already new,so donot need to update:"+intx+","+str4+","+p0+","+l+","+str1);
                   }
                }else {
                   str3 = intx+","+str4+","+p0+","+l+","+str1+",;";
                   if (str.contains(str3)) {
                      if (ex.a) {
                         ex.b(uoep.c, "server response error,current comp is repeat from server,donot update,"+str3);
                         break ;
                      }
                      break ;
                   }else {
                      str = str+str3;
                   }
                }
                i = i + 1;
                str1 = null;
             }
             return null;
          }else if(str2.equals("-1")){
             if (ex.a) {
                ex.a(uoep.c, "sever parse json error,pelase check!");
             }
             return null;
          }else if(str2.equals("-2")){
             if (ex.a) {
                ex.a(uoep.c, "the params in json is error,please check!");
             }
             return null;
          }else if(str2.equals("-4")){
             if (ex.a) {
                ex.a(uoep.c, "server has not config this version !!!");
             }
             return null;
          }else if(str2.equals("-5")){
             if (ex.a) {
                ex.a(uoep.c, "server unkown error!!!");
             }
             return null;
          }
       }catch(java.lang.Exception e0){
          if (ex.a) {
             ex.a(uoep.c, e0);
          }
          str = e0.toString();
          if (str != null) {
             str3 = "\n";
             if (str.contains(str3)) {
                str.replaceAll(str3, ",");
             }
          }
          en.a(uoep.a).a("MCUS", "parser exp:"+str);
       }
       return null;
    }
    public final String b(List p0){
       String str = "MCUS";
       try{
          JSONObject jSONObject = new JSONObject();
          jSONObject.put("projName", "TMLSDK");
          jSONObject.put("appkey", fj.a(this.a));
          jSONObject.put("appversion", fj.b(this.a));
          jSONObject.put("imei", fj.c(this.a));
          jSONObject.put("coverSDKver", ff.g);
          jSONObject.put("model", fj.b()+"_"+fj.a());
          jSONObject.put("APILevel", fj.c());
          JSONArray jSONArray = new JSONArray();
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             ev uoev = iterator.next();
             if (uoev != null) {
                JSONObject jSONObject1 = new JSONObject();
                jSONObject1.put("compId", uoev.a);
                jSONObject1.put("compVer", uoev.b);
                jSONObject1.put("size", uoev.d);
                jSONObject1.put("md5", uoev.e);
                jSONArray.put(jSONObject1);
             }
          }
          jSONObject.put("compList", jSONArray);
          String str3 = jSONObject.toString();
          en.a(this.a).a(str, "req:"+str3);
          if (ex.a) {
             ex.a(this.c, "download desc file PostJsonData : "+str3);
          }
          return fa.a(str3, fj.a("m_update_pwd", ff.m));
       }catch(java.lang.Exception e9){
          String str1 = e9.toString();
          if (str1 != null) {
             String str2 = "\n";
             if (str1.contains(str2)) {
                str1.replaceAll(str2, ",");
             }
          }
          en.a(this.a).a(str, "reqDerror:"+str1);
          if (ex.a) {
             ex.a(this.c, e9);
          }
          return null;
       }
    }
    public final void b(boolean p0){
       String str = "MCUS";
       if (!p0) {
          boolean b = this.b();
          en.a(this.a).a(str, "t:"+b+",i:"+p0);
          if (!b) {
             if (ex.a) {
                ex.b(this.c, "runCheck t:"+b+",i:"+p0);
             }
             return;
          }
       }
       if (ex.a) {
          ex.a(this.c, "begin to sendrequest download desc");
       }
       String str1 = fj.b(this.a, "SP_TMLSDK_MODULE_INFO", "default");
       en.a(this.a).a(str, "load desc,"+str1);
       List list = fj.a(str1);
       if (ex.a) {
          ex.a(this.c, "local comp infos = "+str1);
       }
       if (list != null && !list.isEmpty()) {
          List list1 = this.a(list);
          if (ex.a) {
             ex.a(this.c, " sendrequest download desc result");
          }
          fj.a(this.a, "SP_last_check_TMLSDK_update_time", Long.valueOf(System.currentTimeMillis()));
          if (list1 == null) {
             return;
          }else {
             this.e.a(list1, list);
          }
       }
       return;
    }
    public final boolean b(){
       long l = System.currentTimeMillis() - fj.b(this.a, "SP_last_check_TMLSDK_update_time", Long.valueOf(0)).longValue();
       if (ex.a) {
          ex.a(this.c, "check time period is "+l+","+(l / 0x36ee80)+"days");
       }
       if (l > 0) {
          return true;
       }else {
          return false;
       }
    }
}
