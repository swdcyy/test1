package fo.b;
import java.lang.Object;
import android.os.HandlerThread;
import java.lang.String;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;
import bo.t;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;
import fo.b$a;
import bo.s;
import fo.b$c;
import java.lang.CharSequence;
import android.text.TextUtils;
import org.json.JSONObject;
import com.google.gson.Gson;
import java.lang.Exception;
import android.os.Handler;
import fo.b$b;
import android.os.Looper;
import android.os.Message;
import java.lang.System;
import java.lang.Long;
import java.io.File;
import java.lang.Throwable;
import android.util.Log;
import aegon.chrome.net.d;
import com.kuaishou.aegon.Aegon;

public class b	// class@001625
{
    public String a;
    public b$b b;
    public final Object c;
    public final HandlerThread d;
    public s e;
    public final AtomicBoolean f;
    public b$a g;

    public void b(){
       super();
       this.c = new Object();
       this.d = new HandlerThread("NetLog", 10);
       this.f = new AtomicBoolean(false);
    }
    public static long e(String p0){
       String str = "netLog has a wrong timestamp. timestamp: ";
       String[] obj = PatchProxy.applyOneRefs(p0, null, b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       int i = p0.lastIndexOf(".");
       if (i == -1) {
          return 0;
       }
       int i1 = 0;
       obj = (p0.substring(i1, i)).split("_");
       if (obj.length != 2) {
          t.d("RemoteNetlogCollection", "netLog has a wrong name. "+p0);
          return 0;
       }else if(!(obj[i1]).equals("autoNetLog")){
          return 0;
       }else {
          object oobject = obj[1];
          try{
             SimpleDateFormat simpleDateFo = new SimpleDateFormat("yyyyMMdd-HHmmss-SSS");
             Date uDate = simpleDateFo.parse(oobject);
             if (uDate != null) {
                return uDate.getTime();
             }
             t.d("RemoteNetlogCollection", str+oobject);
             return 0;
          }catch(java.text.ParseException e1){
             t.d("RemoteNetlogCollection", str+oobject+", exception: "+e1);
             return 0;
          }
       }
    }
    public final void a(){
       long l1;
       b$a uoa2;
       b$a uoa = this;
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, uoa, uob, "3")) {
          return;
       }
       b e = uoa.e;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       b$a uoa1 = PatchProxy.applyOneRefs(e, objArray, b$a.class, str);
       if (uoa1 != patchProxyRe) {
       }else if(e == null){
          uoa1 = b$a.d;
       }else {
          String str1 = "aegonNetlogConfig";
          String str2 = e.c(str1, "");
          b$c uoc = b$c.class;
          Object obj = PatchProxy.applyOneRefs(str2, objArray, uoc, str);
          if (obj != patchProxyRe) {
          }else if(TextUtils.isEmpty(str2)){
             try{
                if (str2.contains(str1)) {
                   obj = new Gson().h(new JSONObject(str2).getString(str1), uoc);
                }else {
                   obj = new Gson().h(str2, uoc);
                }
             }catch(java.lang.Exception e0){
                t.d("RemoteNetlogCollection", "parse netlog config error: "+e0.getMessage());
             }
          }
          if (obj == null) {
             uoa1 = b$a.d;
          }else {
             long l = (long)obj.periodSecs * 1000;
             b$c expirationDa = obj.expirationDate;
             SimpleDateFormat obj1 = PatchProxy.applyOneRefs(expirationDa, objArray, uob, "12");
             if (obj1 != patchProxyRe) {
                l1 = obj1.longValue();
             }else {
                l1 = null;
                if (!TextUtils.isEmpty(expirationDa)) {
                   try{
                      obj1 = new SimpleDateFormat("yyyyMMdd-HHmm");
                      Date uDate = obj1.parse(expirationDa);
                      if (uDate != null) {
                         l1 = uDate.getTime();
                      }
                   }catch(java.text.ParseException e0){
                      t.d("RemoteNetlogCollection", "can\'t parse expired date. "+e0);
                   }
                }
             }
          }
       }
       uoa.g = uoa1;
       uoa.a = uoa1.c;
       uob = uoa.c;
       _monitor_enter(uob);
       if (uoa.g.a()) {
          e = uoa.b;
          if (e != null) {
             e.sendEmptyMessage(3);
             uoa.b = objArray;
          }
          _monitor_exit(uob);
          return;
       }else if(uoa.b == null){
          if (!uoa.d.isAlive()) {
             uoa.d.start();
          }
          uoa.b = new b$b(uoa, uoa.d.getLooper());
       }
       uoa.b.sendMessageDelayed(uoa.b.obtainMessage(0, uoa.g), 500);
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       try{
          this.c((System.currentTimeMillis() - 0xf731400));
       }catch(java.lang.Exception e0){
          t.c("RemoteNetlogCollection", "Couldn\'t delete expired logFiles."+e0);
       }
       return;
    }
    public final void c(long p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uob, "9")) {
          return;
       }
       File[] uFileArray = this.d();
       if (uFileArray == null) {
          return;
       }
       int len = uFileArray.length;
       int i = 0;
       while (i < len) {
          object oobject = uFileArray[i];
          long l = b.e(oobject.getName());
          if (l && l - p0 < 0) {
             t.c("RemoteNetlogCollection", "delete expired log file. "+oobject.getName()+", "+oobject.delete());
          }
          i = i + 1;
       }
       return;
    }
    public File[] d(){
       File obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f();
       if (obj == null) {
          return null;
       }
       return obj.listFiles();
    }
    public final File f(){
       b$a c;
       b obj = PatchProxy.apply(null, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (TextUtils.isEmpty(obj)) {
          b tg = this.g;
          if (tg != null) {
             c = tg.c;
          }
       }
       if (TextUtils.isEmpty(c)) {
          return null;
       }else {
          try{
             File uFile = new File(new File(this.a), "netlog");
             if (!uFile.isDirectory()) {
                uFile.delete();
             }
             if (!uFile.exists()) {
                uFile.mkdir();
             }
             if (uFile.isDirectory() && uFile.exists()) {
                return uFile;
             }else {
                return null;
             }
          }catch(java.lang.Exception e0){
             t.d("RemoteNetlogCollection", Log.getStackTraceString(e0));
             return null;
          }
       }
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, b.class, "11")) {
          return;
       }
       d uod = Aegon.c();
       if (uod != null) {
          uod.h();
          this.f.set(false);
       }
       return;
    }
}
