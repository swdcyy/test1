package c.t.m.g.eu;
import android.content.Context;
import java.lang.Object;
import java.util.List;
import c.t.m.g.fh;
import java.lang.String;
import c.t.m.g.ex;
import java.lang.StringBuilder;
import c.t.m.g.en;
import java.lang.Throwable;
import c.t.m.g.ev;
import java.io.File;
import c.t.m.g.fj;
import c.t.m.g.fi;
import java.util.ArrayList;
import c.t.m.g.fc;
import c.t.m.g.ff;
import c.t.m.g.fa;

public class eu	// class@000c7c
{
    public String a;
    public Context b;

    public void eu(Context p0){
       super();
       this.a = "ModuleUpadateImpl";
       this.b = p0;
    }
    public void a(List p0,List p1){
       fh.a(this.b).a("update");
       int i = 0;
       while (i < 3) {
          boolean b = this.c(p0, p1);
          if (ex.a) {
             ex.a(this.a, "down load new module result "+b+", retry "+i);
          }
          if (b) {
             break ;
          }
          i = i + 1;
       }
       fh.a(this.b).b("update");
       en.a().d();
       return;
    }
    public final boolean a(String p0,ev p1){
       boolean b = false;
       try{
          File uFile = new File(p0, p1.e+"."+p1.f);
          if (!uFile.exists()) {
             if (ex.a) {
                ex.b(this.a, "checkIsDownLoadMoudle path is not exists,"+uFile.getAbsolutePath());
             }
             return b;
          }else {
             long l = uFile.length();
             p0 = fj.a(uFile);
             if (p0 == null) {
                return b;
             }else if(!p1.d - l && (p1.e).equals(p0)){
                if (ex.a) {
                   ex.a(this.a, "module to download is same to update dir ,so donot to download "+p1);
                }
                return true;
             }
          }
       }catch(java.lang.Exception e7){
          if (ex.a) {
             ex.a(this.a, e7);
          }
       }
       return b;
    }
    public final boolean a(String p0,byte[] p1,ev p2){
       boolean b = false;
       if (p1 == null || !p1.length) {
          if (ex.a) {
             ex.a(this.a, "write to this path with data null,"+p0);
          }
          return b;
       }else if(!new fi(p0).a(p1, b)){
          if (ex.a) {
             ex.a(this.a, "write to this path failed !!!,"+p0);
          }
          return b;
       }else {
          String str = fj.a(new File(p0));
          if (str == null || !(p2.e).equals(str)) {
             if (ex.a) {
                ex.a(this.a, "check data from server failed !!!,"+p0);
             }
             return b;
          }else if(ex.a){
             ex.a(this.a, "download and check data from server success !!!,"+p0);
          }
          return true;
       }
    }
    public final List b(List p0,List p1){
       ArrayList uArrayList = new ArrayList();
       int i = 0;
       while (i < p0.size()) {
          ev uoev = p0.get(i);
          int i1 = 0;
          while (true) {
             if (i1 < p1.size()) {
                if (uoev.a == p1.get(i1).a) {
                   uArrayList.add(p1.get(i1));
                   i1 = 1;
                label_0033 :
                   if (!i1) {
                      uArrayList.add(uoev);
                   }
                   i = i + 1;
                }else {
                   i1 = i1 + 1;
                }
             }else {
                i1 = 0;
                goto label_0033 ;
             }
          }
       }
       return uArrayList;
    }
    public synchronized final boolean c(List p0,List p1){
       boolean b1;
       long l = fj.e();
       boolean b = false;
       if (l - 0xa00000 < 0) {
          if (ex.a) {
             ex.a(this.a, "Not enough storage, cancel!");
          }
          en.a().a("MDS", "NoSpaceEnough,"+l);
          return b;
       }else {
          String str = fj.b(this.b, "TMLSDK_hp");
          ArrayList uArrayList = new ArrayList();
          int i = 0;
          while (i < p0.size()) {
             ev uoev = p0.get(i);
             if (this.a(str, uoev)) {
                uArrayList.add(uoev);
                en.a().a("MDS", "already,"+uoev.c);
             }else if(ex.a){
                ex.b(this.a, "current download module is "+uoev.toString());
             }
             String str1 = "https://maplbs-40171.sh.gfp.tencent-cloud.com/modules/"+uoev.e;
             if (ex.a) {
                ex.a(this.a, "dex down load url is "+str1);
             }
             byte[] uobyteArray = fc.a(str1);
             if (uobyteArray != null) {
                b1 = this.a(str+File.separator+uoev.e+"."+uoev.f, fj.a(fa.b(uobyteArray, fj.a("m_plugin_pwd", ff.n))), uoev);
                if (ex.a) {
                   ex.a(this.a, "down load so check result:"+b1);
                }
                en.a().a("MDS", "download res,"+b1+","+uoev.c);
                if (b1) {
                   uArrayList.add(uoev);
                }
             }else {
                en.a().a("MDS", "netError");
                if (ex.a) {
                   ex.a(this.a, "down load module failed!!!,"+str1);
                }
             }
          label_016e :
             i = i + 1;
          }
          if (ex.a) {
             eu ta = this.a;
             StringBuilder str2 = "all module download ";
             b1 = (p0.size() == uArrayList.size())? true: false;
             ex.a(ta, str2+b1);
             ex.a(this.a, "start rename download files");
          }
          en.a().a("MDS", "should download,"+p0.size()+",real download suc,"+uArrayList.size());
          if (p0.size() == uArrayList.size()) {
             String str3 = fj.a(this.b(p1, uArrayList));
             boolean b2 = fj.a(this.b, "SP_TMLSDK_MODULE_INFO", str3);
             if (ex.a) {
                ex.b(this.a, "module update success desc "+str3);
             }
             en.a().a("MDS", "update result,"+b2+","+str3);
             return true;
          }else {
             return b;
          }
       }
    }
}
