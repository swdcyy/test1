package c.t.m.g.eo;
import android.content.Context;
import java.lang.Object;
import java.util.List;
import c.t.m.g.ex;
import java.lang.String;
import c.t.m.g.fj;
import c.t.m.g.ev;
import java.io.File;
import java.lang.StringBuilder;
import java.lang.Throwable;
import c.t.m.g.ff;
import c.t.m.g.en;
import java.util.ArrayList;
import java.lang.CharSequence;
import java.lang.Runtime;

public class eo	// class@000c73
{
    public final String a;
    public Context b;

    public void eo(Context p0){
       super();
       this.a = "ModuleCheckImpl";
       this.b = p0;
    }
    public int a(List p0){
       String str = "ModuleCheckImpl";
       try{
          if (ex.a) {
             ex.a(str, "start checkLoadModules");
          }
          if (p0 == null || p0.isEmpty()) {
             if (ex.a) {
                ex.a(str, "local comp list is empty return error\(1\) ");
             }
             return 2;
          }else {
             String str1 = fj.b(this.b, "TMLSDK_hp");
             int i = 0;
             while (true) {
                if (i < p0.size()) {
                   ev uoev = p0.get(i);
                   if (uoev == null) {
                      if (ex.a) {
                         ex.a(str, "module info is null, return directly");
                         break ;
                      }
                      break ;
                   }else if(uoev.a < null){
                      if (ex.a) {
                         ex.a(str, uoev.toString());
                         ex.a(str, "moduleId < 0, return directly");
                      }
                   }else {
                      ev e = uoev.e;
                      if (e == null) {
                         if (ex.a) {
                            ex.a(str, uoev.toString());
                            ex.a(str, "module info md5 is null, return directly");
                         }
                         return 4;
                      }else {
                         File uFile = new File(str1, e+"."+uoev.f);
                         if (!uFile.exists() || !uFile.isFile()) {
                            if (ex.a) {
                               ex.a(str, uoev.toString());
                               ex.a(str, "this module local is not existed, return directly");
                            }
                            return 5;
                         }else if(!uFile.length() - uoev.d){
                            return 6;
                         }
                      }
                   }
                   i = i + 1;
                }else if(ex.a){
                   ex.a(str, "local module files check success");
                }
                return 0;
             }
             return 3;
          }
       }catch(java.lang.Exception e10){
          if (ex.a) {
             ex.a(str, e10);
          }
          return 7;
       }
    }
    public List a(){
       int b1;
       this.e();
       String g = ff.g;
       String str = "ModuleCheckImpl";
       if (ex.a) {
          ex.b(str, "current shell version "+g);
       }
       String str1 = "SP_TMLSDK_MODULE_SHELL_SDK_VERSION";
       String str2 = fj.b(this.b, str1, "");
       if (ex.a) {
          ex.b(str, "sp shell version "+str2);
       }
       en.a(this.b).a("MCS", "mainVer,"+str2+"-"+g);
       str2 = "TMLSDK_hp";
       String str3 = "SP_TMLSDK_MODULE_INFO";
       String str4 = "default";
       if (!g.equals(str2)) {
          boolean b = fj.a(this.b, str1, ff.g);
          b1 = fj.b(fj.a(this.b, str2));
          boolean b2 = fj.a(this.b, str3, str4);
          boolean b3 = this.b();
          if (ex.a) {
             ex.a(str, "main SDK version changed, clear load dir, reset local desc to asset desc");
          }
          en.a(this.b).a("MCS", "MainVersion Changed,use base,"+b+","+b1+","+b2+","+b3);
          return null;
       }else {
          this.c();
          g = fj.b(this.b, str3, str4);
          if (ex.a) {
             ex.a(str, "main SDK version not changed,load desc is "+g);
          }
          en.a(this.b).a("MCS", "load desc,"+g);
          if (g == null || g.equals(str4)) {
             if (ex.a) {
                ex.a(str, "load desc is null or is default, release assets config");
             }
             en.a(this.b).a("MCS", "load desc invalid,use base,"+this.b());
             return null;
          }else if(!this.a(g)){
             if (ex.a) {
                ex.a(str, "version rules check not pass,so reset and clear");
             }
             en.a(this.b).a("MCS", "reset2:"+fj.a(this.b, str1, ff.g)+","+fj.b(fj.a(this.b, str2))+","+fj.a(this.b, str3, str4)+","+this.b());
             return null;
          }else {
             List list = fj.a(g);
             if (list.isEmpty()) {
                if (ex.a) {
                   ex.a(str, "load modules parse from loadDesc is empty");
                }
                en.a(this.b).a("MCS", "load modules empty,use base");
                return null;
             }else {
                b1 = this.b(list);
                if (ex.a) {
                   ex.a(str, "check is Bad dex : "+b1);
                }
                if (b1) {
                   en.a(this.b).a("MCS", "consider bad dex,use base");
                   return null;
                }else {
                   this.d();
                   b1 = this.a(list);
                   if (ex.a) {
                      ex.a(str, "check module in load dir result is "+b1);
                   }
                   en.a(this.b).a("MCS", "load file check result,"+b1);
                   if (b1) {
                      en.a(this.b).a("MCS", "load file check failed,use base");
                      return null;
                   }else if(ex.a){
                      ex.a(str, "load modules check all is ok");
                   }
                   return list;
                }
             }
          }
       }
    }
    public final void a(ArrayList p0){
       String str = "removeBadDexFiles";
       try{
          String str1 = fj.b(this.b, "TMLSDK_hp");
          int i = 0;
          if (ex.a) {
             ex.a(str, "before remove:");
             File[] uFileArray = new File(str1).listFiles();
             if (uFileArray != null) {
                for (boolean i1 = 0; i1 < uFileArray.length; i1 = i1 + 1) {
                   ex.a(str, uFileArray[i1].getName());
                }
             label_002f :
                int i2 = 0;
                while (i2 < p0.size()) {
                   ev uoev = p0.get(i2);
                   if (uoev != null && uoev.a >= null) {
                      ev e = uoev.e;
                      uoev = uoev.f;
                      if (e != null) {
                         File uFile = new File(str1, e+"."+uoev);
                         if (uFile.exists() && uFile.isFile()) {
                            i1 = uFile.delete();
                            if (ex.a) {
                               ex.a("ModuleCheckImpl", "bad dex is deleted:"+i1+" : "+uFile.getAbsolutePath());
                            }
                         }
                      }
                   }
                   i2 = i2 + 1;
                }
                if (ex.a) {
                   ex.a(str, "after remove:");
                   File[] uFileArray1 = new File(str1).listFiles();
                   if (uFileArray1 != null) {
                      for (; i < uFileArray1.length; i = i + 1) {
                         ex.a(str, uFileArray1[i].getName());
                      }
                   }
                }
             }else {
                goto label_002f ;
             }
          }else {
             goto label_002f ;
          }
       }catch(java.lang.Exception e10){
          if (ex.a) {
             ex.a(str, e10);
          }
       }
       return;
    }
    public boolean a(String p0){
       if (ex.a) {
          ex.a("checkversion", "local comp str:"+p0);
       }
       boolean b = false;
       if (p0 == null || p0.equals("")) {
          return b;
       }else {
          String[] stringArray = p0.split(";");
          if (stringArray == null && !stringArray.length) {
             if (ex.a) {
                ex.a("checkversion", "local comp strs split by ; is null,"+p0);
             }
             return b;
          }else {
             int i = 0;
             while (true) {
                if (i < stringArray.length) {
                   object oobject = stringArray[i];
                   if (oobject != null && (oobject.contains("TMLSDK") && !oobject.contains("7.3.7"))) {
                      if (ex.a) {
                         ex.a("checkversion", "this plugin donot constains shell Version,7.3.7,plugin:"+oobject);
                         break ;
                      }
                      break ;
                   }else {
                      i = i + 1;
                   }
                }else if(ex.a){
                   ex.a("checkversion", "this plugin and shell Version is matched,7.3.7,plugin:"+p0);
                }
                return true;
             }
             return b;
          }
       }
    }
    public boolean b(){
       if (ex.a) {
          ex.b("ModuleCheckImpl", "assets desc : 72,0,TMLSDK,0,0,;82,0,liblocationbeaconid,0,0,;90,0,libtencentloc,0,0,;84,0,liblocationbeaconid,0,0,;92,0,libtencentloc,0,0,;83,0,liblocationbeaconid,0,0,;91,0,libtencentloc,0,0,;");
       }
       String str = "SP_TMLSDK_MODULE_INFO";
       boolean b = fj.a(this.b, str, fj.a(fj.a("72,0,TMLSDK,0,0,;82,0,liblocationbeaconid,0,0,;90,0,libtencentloc,0,0,;84,0,liblocationbeaconid,0,0,;92,0,libtencentloc,0,0,;83,0,liblocationbeaconid,0,0,;91,0,libtencentloc,0,0,;")));
       if (ex.a) {
          ex.b("ModuleCheckImpl", "release assets desc config result : "+b);
       }
       if (ex.a) {
          ex.b("ModuleCheckImpl", "read assets desc from sp :"+fj.b(this.b, str, "default"));
       }
       return b;
    }
    public boolean b(List p0){
       String str = "preference_default";
       String str1 = fj.b(this.b, "SP_bad_TMLSDK_info", str);
       if (ex.a) {
          ex.a("ModuleCheckImpl", "start compare badcomps, badDexInfoStr : "+str1);
       }
       en.a(this.b).a("MCS", "baddesc,"+str1);
       List list = fj.a(str1);
       if (str1.equals(str) || list.isEmpty()) {
          if (ex.a) {
             ex.a("ModuleCheckImpl", "badDexInfoStr preference getString is default! or badComplist is empty!");
          }
          return false;
       }else {
          ArrayList uArrayList = fj.a(p0, list);
          if (uArrayList.size() > 0) {
             if (ex.a) {
                ex.a("ModuleCheckImpl", "current complist is bad dex");
             }
             this.a(uArrayList);
             return true;
          }else if(ex.a){
             ex.a("ModuleCheckImpl", "current complist is good dex");
          }
          return false;
       }
    }
    public final void c(){
       String str = ",";
       String str1 = "ModuleCheckImpl";
       long l = Runtime.getRuntime().freeMemory();
       long l1 = Runtime.getRuntime().maxMemory();
       long l2 = Runtime.getRuntime().totalMemory();
       float f = (float)(((double)l * 0x3ff0000000000000) / (double)l1);
       if (ex.a) {
          ex.a(str1, "check maxMemory:"+l1);
          ex.a(str1, "check totalMemory:"+l2);
          ex.a(str1, "check freeMemory:"+l);
          ex.a(str1, "check rate:"+f);
       }
       en.a(this.b).a("MCS", "Memory,"+l+str+l1+str+l2+str+f);
       return;
    }
    public final void d(){
       try{
          String str = fj.b(this.b, "TMLSDK_hp");
          File uFile = new File(str);
          if (!uFile.exists()) {
             en.a(this.b).a("MCS", "load dir is not existed,"+str);
             return;
          }else {
             File[] uFileArray = uFile.listFiles();
             if (uFileArray == null) {
                en.a(this.b).a("MCS", "load files is null");
                return;
             }else {
                String str1 = "";
                for (int i = 0; i < uFileArray.length; i = i + 1) {
                   str1 = str1+uFileArray[i].getName()+",";
                }
                en.a(this.b).a("MCS", "loadFiles:"+str1);
                return;
             }
          }
       }catch(java.lang.Exception e0){
       }
    }
    public final void e(){
       File uFile = fj.a(this.b, "TMLSDK_hp");
       if (ex.a) {
          ex.b("ModuleCheckImpl", "moduledir, "+uFile.getAbsolutePath()+",isExists="+uFile.exists());
       }
       if (ex.a) {
          File[] uFileArray = uFile.listFiles();
          for (int i = 0; i < uFileArray.length; i = i + 1) {
             ex.b("ModuleCheckImpl", "check load dir files:"+uFileArray[i].getName());
          }
       }
       uFile = fj.a(this.b, ff.c);
       if (ex.a) {
          ex.b("ModuleCheckImpl", "odexdir, "+uFile.getAbsolutePath()+",isExists="+uFile.exists());
       }
       return;
    }
}
