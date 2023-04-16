package vid.b;
import java.util.concurrent.ConcurrentHashMap;
import vid.d;
import java.lang.String;
import vid.d$a;
import java.lang.UnsatisfiedLinkError;
import android.content.SharedPreferences;
import java.util.Set;
import com.tencent.mmkv.MMKV;
import java.lang.Object;
import ekd.j;
import java.util.Collections;
import java.util.HashSet;
import com.google.common.collect.o;
import java.util.Map;
import java.lang.StringBuilder;
import vid.c;
import android.content.Context;
import vid.c$a;
import java.io.File;
import vid.a;
import com.tencent.mmkv.MMKV$LibLoader;
import vid.b$a;
import com.tencent.mmkv.MMKVHandler;
import java.lang.IllegalArgumentException;
import com.yxcorp.preferences.mmkv.MMKVCheckError;
import com.google.gson.Gson;
import com.yxcorp.preferences.mmkv.MMKVTrimMessage;
import java.lang.Throwable;
import android.util.Log;
import java.util.HashMap;
import java.lang.Integer;

public class b	// class@0026bf
{
    public static final Map a;
    public static boolean b;

    static {
       boolean b;
       b.a = new ConcurrentHashMap();
       b = true;
       try{
          b.b = b;
          b.b();
          d$a a = d.a;
          if (a != null) {
             a.a("mmkv_init_state", "success");
          }
       }catch(java.lang.UnsatisfiedLinkError e1){
          b.b = false;
          d$a a1 = d.a;
          if (a1 != null) {
             a1.a("mmkv_init_error", e1.toString());
             d.a.a("mmkv_init_state", "fail");
          }
       }
    }
    public static Set a(SharedPreferences p0){
       if (!p0 instanceof MMKV) {
          return p0.getAll().keySet();
       }
       String[] stringArray = p0.allKeys();
       if (j.h(stringArray)) {
          return Collections.emptySet();
       }
       return o.k(stringArray);
    }
    public static void b(){
       MMKV.initialize(c.a.getContext().getFilesDir().getAbsolutePath()+"/mmkv", a.a);
       MMKV.disableProcessModeChecker();
       MMKV.registerHandler(new b$a());
    }
    public static SharedPreferences c(Context p0,String p1,int p2){
       if (p0 == null) {
          throw new IllegalArgumentException("context is null!");
       }
       if (p1 == null) {
          throw new IllegalArgumentException("name is null!");
       }
       Map a = b.a;
       SharedPreferences sharedPrefer = a.get(p1);
       if (sharedPrefer != null) {
          return sharedPrefer;
       }
       String str = p1.intern();
       _monitor_enter(str);
       if (!b.b) {
          SharedPreferences sharedPrefer1 = p0.getSharedPreferences(p1, p2);
          a.put(p1, sharedPrefer1);
          _monitor_exit(str);
          return sharedPrefer1;
       }else {
          File uFile = new File(MMKV.getRootDir(), p1);
          int i = 0;
          if (uFile.exists()) {
             File uFile1 = new File(c.a.b(), p1+".xml");
             if (!uFile1.exists() || uFile1.lastModified() - uFile.lastModified() <= 0) {
             label_0063 :
                MMKV mMKV = MMKV.mmkvWithID(p1, 2, c.a.a("5Sl#^JVKLzvbiJgt"));
                if (i) {
                   mMKV.importFromSharedPreferences(p0.getSharedPreferences(p1, p2));
                }
                a.put(p1, mMKV);
                b.e(p1, mMKV);
                _monitor_exit(str);
                return mMKV;
             }
          }
          i = 1;
          goto label_0063 ;
       }
    }
    public static void d(String p0,String p1){
       MMKVCheckError mMKVCheckErr = new MMKVCheckError();
       mMKVCheckErr.mFile = p0;
       mMKVCheckErr.mType = p1;
       d$a a = d.a;
       if (a != null) {
          a.a("mmkv_check_error", c.a.d().q(mMKVCheckErr));
       }
       return;
    }
    public static void e(String p0,MMKV p1){
       long l = p1.totalSize();
       long l1 = ((c.a.e()).equals(p0))? 0x800000: 0x400000;
       if (l - l1 > 0) {
          p1.trim();
          MMKVTrimMessage mMKVTrimMess = new MMKVTrimMessage();
          long l2 = 1024;
          mMKVTrimMess.mBeforeTrimKb = l / l2;
          mMKVTrimMess.mAfterTrimKb = p1.totalSize() / l2;
          mMKVTrimMess.mFile = p0;
          mMKVTrimMess.mProcessName = c.a.c();
          mMKVTrimMess.mStackTrace = Log.getStackTraceString(new Throwable());
          String[] stringArray = p1.allKeys();
          mMKVTrimMess.mValueSizeMap = new HashMap();
          if (stringArray != null) {
             int len = stringArray.length;
             for (int i = 0; i < len; i = i + 1) {
                object oobject = stringArray[i];
                mMKVTrimMess.mValueSizeMap.put(oobject, Integer.valueOf(p1.getValueSize(oobject)));
             }
          }
          d$a a = d.a;
          if (a != null) {
             a.a("mmkv_trim", c.a.d().q(mMKVTrimMess));
          }
       }
       return;
    }
}
