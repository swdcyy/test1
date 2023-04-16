package com.ta.utdid2.b.a.c;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import android.content.SharedPreferences;
import oe6.o;
import android.os.Environment;
import java.lang.Exception;
import com.ta.utdid2.a.a.g;
import com.ta.utdid2.b.a.d;
import com.ta.utdid2.b.a.b;
import java.lang.System;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.ta.utdid2.b.a.b$a;
import java.io.File;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Float;
import java.lang.Boolean;

public class c	// class@000ccc
{
    public SharedPreferences$Editor a;
    public SharedPreferences a;
    public b$a a;
    public b a;
    public d a;
    public String b;
    public String c;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public Context mContext;

    public void c(Context p0,String p1,String p2,boolean p3,boolean p4){
       long longx;
       String externalStor;
       long longx1;
       long l;
       c ti;
       SharedPreferences$Editor uEditor;
       b$a uoa;
       super();
       this.b = "";
       this.c = "";
       this.f = false;
       this.g = false;
       this.h = false;
       SharedPreferences sharedPrefer = null;
       this.a = sharedPrefer;
       this.a = sharedPrefer;
       this.a = sharedPrefer;
       this.a = sharedPrefer;
       this.mContext = sharedPrefer;
       this.a = sharedPrefer;
       this.i = false;
       this.f = p3;
       this.i = p4;
       this.b = p2;
       this.c = p1;
       this.mContext = p0;
       String str = "t";
       if (p0 != null) {
          SharedPreferences sharedPrefer1 = o.c(p0, p2, false);
          this.a = sharedPrefer1;
          longx = sharedPrefer1.getLong(str, 0);
       }else {
          longx = 0;
       }
       try{
          externalStor = Environment.getExternalStorageState();
       }catch(java.lang.Exception e6){
          e6.printStackTrace();
       }
       if (g.a(externalStor)) {
          this.h = false;
          this.g = false;
       }else {
          boolean b = true;
          if (externalStor.equals("mounted")) {
             this.h = b;
             this.g = b;
          }else if(externalStor.equals("mounted_ro")){
             this.g = b;
             this.h = false;
          }else {
             this.h = false;
             this.g = false;
          }
       }
       if (this.g != null || (this.h != null && (p0 != null && !g.a(p1)))) {
          d uod = this.a(p1);
          this.a = uod;
          if (uod != null) {
             try{
                b uob = uod.a(p2, false);
                this.a = uob;
                longx1 = uob.getLong(str, 0);
                if (!p4) {
                   uob = longx - longx1;
                   if (uob > 0) {
                      this.a(this.a, this.a);
                      this.a = this.a.a(p2, false);
                   }else if(uob < 0){
                      this.a(this.a, this.a);
                      this.a = o.c(p0, p2, false);
                   }else if(!uob){
                      this.a(this.a, this.a);
                      this.a = this.a.a(p2, false);
                   }
                }else {
                   longx = this.a.getLong("t2", 0);
                   longx1 = this.a.getLong("t2", 0);
                   uob = longx - longx1;
                   if (uob < 0 && longx > 0) {
                      this.a(this.a, this.a);
                      this.a = this.a.a(p2, false);
                   }else if(uob > 0 && longx1 > 0){
                      this.a(this.a, this.a);
                      this.a = o.c(p0, p2, false);
                   }else {
                      str = longx;
                      if (!str && longx1 > 0) {
                         this.a(this.a, this.a);
                         this.a = o.c(p0, p2, false);
                      }else if(!longx1 && str > 0){
                         this.a(this.a, this.a);
                         this.a = this.a.a(p2, false);
                      }else if(!uob){
                         this.a(this.a, this.a);
                         this.a = this.a.a(p2, false);
                      }
                   }
                }
             }catch(java.lang.Exception e0){
             label_0145 :
                longx1 = 0;
             }catch(java.lang.Exception e0){
             }
          }else {
             goto label_0145 ;
          }
       }else {
          goto label_0145 ;
       }
    }
    public final d a(String p0){
       File uFile = this.a(p0);
       if (uFile == null) {
          return null;
       }
       d uod = new d(uFile.getAbsolutePath());
       this.a = uod;
       return uod;
    }
    public final File a(String p0){
       File externalStor = Environment.getExternalStorageDirectory();
       if (externalStor == null) {
          return null;
       }
       Object[] objArray = new Object[]{externalStor.getAbsolutePath(),File.separator,p0};
       File uFile = new File(String.format("%s%s%s", objArray));
       if (!uFile.exists()) {
          uFile.mkdirs();
       }
       return uFile;
    }
    public final void a(SharedPreferences p0,b p1){
       try{
          if (p0 != null && p1 != null) {
             b$a uoa = p1.a();
             if (uoa != null) {
                uoa.b();
                Iterator iterator = p0.getAll().entrySet().iterator();
                while (iterator.hasNext()) {
                   Map$Entry uEntry = iterator.next();
                   String key = uEntry.getKey();
                   Object value = uEntry.getValue();
                   if (value instanceof String) {
                      uoa.a(key, value);
                   }else if(value instanceof Integer){
                      uoa.a(key, value.intValue());
                   }else if(value instanceof Long){
                      uoa.a(key, value.longValue());
                   }else if(value instanceof Float){
                      uoa.a(key, value.floatValue());
                   }else if(value instanceof Boolean){
                      uoa.a(key, value.booleanValue());
                   }
                }
                uoa.commit();
             }
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public final void a(b p0,SharedPreferences p1){
       if (p0 != null && p1 != null) {
          SharedPreferences$Editor uEditor = p1.edit();
          if (uEditor != null) {
             uEditor.clear();
             Iterator iterator = p0.getAll().entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                String key = uEntry.getKey();
                Object value = uEntry.getValue();
                if (value instanceof String) {
                   uEditor.putString(key, value);
                }else if(value instanceof Integer){
                   uEditor.putInt(key, value.intValue());
                }else if(value instanceof Long){
                   uEditor.putLong(key, value.longValue());
                }else if(value instanceof Float){
                   uEditor.putFloat(key, value.floatValue());
                }else if(value instanceof Boolean){
                   uEditor.putBoolean(key, value.booleanValue());
                }
             }
             g.b(uEditor);
          }
       }
       return;
    }
    public final void b(){
       c ta;
       if (this.a == null) {
          ta = this.a;
          if (ta != null) {
             this.a = ta.edit();
          }
       }
       if (this.h != null && this.a == null) {
          ta = this.a;
          if (ta != null) {
             this.a = ta.a();
          }
       }
       this.c();
       return;
    }
    public final boolean c(){
       c ta = this.a;
       if (ta == null) {
          return false;
       }
       boolean b = ta.b();
       if (!b) {
          this.commit();
       }
       return b;
    }
    public boolean commit(){
       boolean b;
       long l = System.currentTimeMillis();
       c ta = this.a;
       if (ta != null) {
          if (this.i == null && this.a != null) {
             ta.putLong("t", l);
          }
          if (!g.b(this.a)) {
             b = false;
          label_0021 :
             if (this.a != null) {
                c tmContext = this.mContext;
                if (tmContext != null) {
                   this.a = o.c(tmContext, this.b, 0);
                }
             }
             String str = null;
             try{
                str = Environment.getExternalStorageState();
             }catch(java.lang.Exception e2){
                e2.printStackTrace();
             }
             try{
                if (!g.a(str)) {
                   String str1 = "mounted";
                   if (str.equals(str1)) {
                      if (this.a == null) {
                         d uod = this.a(this.c);
                         if (uod != null) {
                            b uob = uod.a(this.b, 0);
                            this.a = uob;
                            if (this.i == null) {
                               this.a(this.a, uob);
                            }else {
                               this.a(uob, this.a);
                            }
                            this.a = this.a.a();
                         }
                      }else {
                         try{
                            c ta1 = this.a;
                            if (ta1 != null && !ta1.commit()) {
                               b = false;
                            }
                         }catch(java.lang.Exception e0){
                         }
                      }
                   }
                }
             label_009e :
                return e0;
             }catch(java.lang.Exception e0){
             }
          }
       }
       b = true;
       goto label_0021 ;
    }
    public String getString(String p0){
       this.c();
       c ta = this.a;
       if (ta != null) {
          String str = ta.getString(p0, "");
          if (!g.a(str)) {
             return str;
          }
       }
       ta = this.a;
       if (ta != null) {
          return ta.getString(p0, "");
       }else {
          return "";
       }
    }
    public void putString(String p0,String p1){
       if (!g.a(p0) && !p0.equals("t")) {
          this.b();
          c ta = this.a;
          if (ta != null) {
             ta.putString(p0, p1);
          }
          ta = this.a;
          if (ta != null) {
             ta.a(p0, p1);
          }
       }
    label_001f :
       return;
    }
    public void remove(String p0){
       if (!g.a(p0) && !p0.equals("t")) {
          this.b();
          c ta = this.a;
          if (ta != null) {
             ta.remove(p0);
          }
          ta = this.a;
          if (ta != null) {
             ta.a(p0);
          }
       }
    label_001f :
       return;
    }
}
