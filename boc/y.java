package boc.y;
import java.lang.Runnable;
import com.yxcorp.download.DownloadTask;
import boc.b;
import java.lang.String;
import t16.a;
import coc.a;
import java.lang.Object;
import java.io.File;
import com.yxcorp.gifshow.util.resource.n;
import android.os.SystemClock;
import java.lang.StringBuilder;
import qfc.a;
import q87.c;
import java.nio.charset.Charset;
import com.yxcorp.gifshow.util.u0;
import qkd.b;
import java.lang.Long;
import java.util.Map;
import com.yxcorp.gifshow.util.resource.p;
import java.lang.Throwable;
import java.lang.Class;
import java.io.IOException;
import com.yxcorp.gifshow.util.resource.d;

public final class y implements Runnable	// class@000454
{
    public final DownloadTask b;
    public final b c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final a h;
    public final a i;

    public void y(DownloadTask p0,b p1,String p2,boolean p3,boolean p4,boolean p5,a p6,a p7){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = p7;
    }
    public final void run(){
       y oy1;
       int i1;
       File uFile1;
       Object[] objArray;
       boolean b;
       Object[] objArray2;
       y oy2;
       Object[] objArray4;
       y oy = this;
       y c = oy.c;
       y d = oy.d;
       y e = oy.e;
       y f = oy.f;
       y g = oy.g;
       y h = oy.h;
       y i = oy.i;
       File uFile = new File(oy.b.getTargetFilePath());
       String str = "md5 check fail";
       String str1 = "cost";
       String str2 = "resourcemanager";
       if (uFile.exists()) {
          long l = SystemClock.elapsedRealtime();
          try{
             StringBuilder str3 = new File(c.getResourceDir()).getPath()+"_resource_";
             oy1 = g;
             try{
                oy2 = h;
                String str4 = str3+SystemClock.elapsedRealtime();
                try{
                   uFile1 = new File(str4);
                   new File(c.getResourceDir()).renameTo(uFile1);
                   if (c.isNeedUnzip()) {
                      objArray4 = new Object[0];
                      a.C().w(str2, "upZipResource need unzip", objArray4);
                      if (c.needRename()) {
                         u0.k(uFile, c.getUnzipDir(), c.getResourceName(), c.getCharset());
                      }else {
                         u0.l(uFile, c.getUnzipDir(), c.getCharset());
                      }
                   }else {
                      objArray = new Object[0];
                      a.C().w(str2, "do not need unzip", objArray);
                      b.g(uFile, new File(c.getResourceDir()));
                   }
                   boolean b1 = c.checkFileValid();
                   if (b1) {
                      n.b(c);
                      objArray = new Object[0];
                      a.C().y(str2, "unzip success "+uFile.getAbsolutePath()+" to "+c.getUnzipDir(), objArray);
                      b = b1;
                      objArray4 = new Object[]{str1,Long.valueOf((SystemClock.elapsedRealtime() - l)),"total_cost",Long.valueOf((SystemClock.elapsedRealtime() - n.b.get(c).longValue()))};
                      p.onEvent(c.getEventUrl(), "upzip_success", objArray4);
                      n.i(c);
                   }else {
                      b = b1;
                      objArray2 = new Object[0];
                      a.C().t(str2, str, objArray2);
                      n.g(c, new Throwable(str));
                   }
                   uFile.delete();
                   b.m(uFile1);
                   uFile1.delete();
                label_01c7 :
                   if (!b) {
                      n on = n.class;
                      _monitor_enter(on);
                      str = n.r(c);
                      if (str == null) {
                         _monitor_exit(on);
                         objArray = 0;
                      }else {
                         i.d();
                         objArray2 = new Object[]{"current",d,"next",str};
                         p.onEvent(c.getEventUrl(), "switch_cdn", objArray2);
                         n.v(new d(str), c, e, f, oy1, i1, i);
                         Object[] objArray3 = new Object[0];
                         a.C().y("resourcemanager", "try next cdn", objArray3);
                         _monitor_exit(on);
                         objArray = 1;
                      }
                      if (!objArray) {
                         i.b(1006, "unzipFailed");
                         n.g(c, new Throwable("unzip fail"));
                      }
                   }else {
                      i.a();
                      c.markHaveDownloaded(d);
                      c.e(false);
                      c.c(new File(c.getUnzipDir(), "check.json").exists());
                   }
                   return;
                }catch(java.io.IOException e0){
                }
                n.g(c, e0);
                objArray = new Object[0];
                a.C().u("ResourceManager", e0, objArray);
                a.C().e(str2, "unzip", e0);
                Object[] objArray1 = new Object[]{str1,Long.valueOf((SystemClock.elapsedRealtime() - l)),"reason",e0.getClass().getName()+":"+e0.getMessage()};
                p.onEvent(c.getEventUrl(), "upzip_fail", objArray1);
                uFile.delete();
                if (uFile1) {
                   b.m(uFile1);
                   uFile1.delete();
                label_01c5 :
                   b = false;
                   goto label_01c7 ;
                }else {
                   goto label_01c5 ;
                }
             }catch(java.io.IOException e0){
             }
             uFile1 = null;
             goto label_014f ;
          }catch(java.io.IOException e0){
             oy1 = g;
             i1 = h;
             goto label_014e ;
          }
       }else {
          oy1 = g;
          oy2 = h;
          goto label_01c5 ;
       }
    }
}
