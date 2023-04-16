package com.ta.utdid2.b.a.d$a;
import com.ta.utdid2.b.a.b;
import java.lang.Object;
import java.io.File;
import java.util.Map;
import com.ta.utdid2.b.a.d;
import java.util.HashMap;
import java.util.WeakHashMap;
import com.ta.utdid2.b.a.b$a;
import com.ta.utdid2.b.a.d$a$a;
import java.io.FileOutputStream;
import java.lang.String;
import java.io.OutputStream;
import com.ta.utdid2.b.a.e;
import java.lang.Long;

public final class d$a implements b	// class@000cce
{
    public Map a;
    public WeakHashMap a;
    public final File b;
    public final int c;
    public final File c;
    public boolean j;
    public static final Object c;

    static {
       d$a.c = new Object();
    }
    public void d$a(File p0,int p1,Map p2){
       super();
       this.j = false;
       this.b = p0;
       this.c = d.b(p0);
       this.c = p1;
       if (p2 != null) {
       }else {
          HashMap hashMap = new HashMap();
       }
       this.a = p2;
       this.a = new WeakHashMap();
       return;
    }
    public static Map a(d$a p0){
       return p0.a;
    }
    public static WeakHashMap a(d$a p0){
       return p0.a;
    }
    public static boolean a(d$a p0){
       return p0.e();
    }
    public b$a a(){
       return new d$a$a(this);
    }
    public final FileOutputStream a(File p0){
       FileOutputStream uFileOutputS;
       int i = 0;
       try{
          uFileOutputS = new FileOutputStream(p0);
       }catch(java.io.FileNotFoundException e0){
          if (!p0.getParentFile().mkdir()) {
             return e0;
          }
          try{
             uFileOutputS = new FileOutputStream(p0);
          }catch(java.io.FileNotFoundException e0){
             return e0;
          }
       }
       FileOutputStream uFileOutputS1 = uFileOutputS;
       goto label_001a ;
    }
    public void a(Map p0){
       if (p0 != null) {
          _monitor_enter(this);
          this.a = p0;
          _monitor_exit(this);
       }
       return;
    }
    public void a(boolean p0){
       _monitor_enter(this);
       this.j = p0;
       _monitor_exit(this);
    }
    public boolean b(){
       if (this.b != null && new File(this.b.getAbsolutePath()).exists()) {
          return true;
       }
       return false;
    }
    public boolean d(){
       _monitor_enter(this);
       _monitor_exit(this);
       return this.j;
    }
    public final boolean e(){
       if (this.b.exists()) {
          if (!this.c.exists()) {
             if (!this.b.renameTo(this.c)) {
                return false;
             }
          }else {
             this.b.delete();
          }
       }
       try{
          FileOutputStream uFileOutputS = this.a(this.b);
          if (uFileOutputS == null) {
             return false;
          }else {
             e.a(this.a, uFileOutputS);
             uFileOutputS.close();
             this.c.delete();
             return true;
          }
       }catch(java.lang.Exception e0){
          if (this.b.exists()) {
             this.b.delete();
          }
          return false;
       }
    }
    public Map getAll(){
       _monitor_enter(this);
       _monitor_exit(this);
       return new HashMap(this.a);
    }
    public long getLong(String p0,long p1){
       _monitor_enter(this);
       Long longx = this.a.get(p0);
       if (longx != null) {
          p1 = longx.longValue();
       }
       _monitor_exit(this);
       return p1;
    }
    public String getString(String p0,String p1){
       _monitor_enter(this);
       p0 = this.a.get(p0);
       if (p0 != null) {
          p1 = p0;
       }
       _monitor_exit(this);
       return p1;
    }
}
