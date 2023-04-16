package e0d.d;
import java.lang.Double;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.util.HashMap;
import android.os.Build$VERSION;
import java.util.ArrayList;
import com.yxcorp.image.cache.CacheKeyOptions;
import com.google.gson.c;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import java.util.Iterator;
import java.util.Set;
import java.lang.StringBuilder;
import com.yxcorp.image.common.log.Log;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Float;
import java.lang.Number;
import java.lang.Integer;
import java.lang.Enum;

public class d	// class@001505
{
    public boolean A;
    public boolean B;
    public boolean C;
    public String D;
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public ArrayList I;
    public int J;
    public d$b K;
    public d$a L;
    public Log$b M;
    public d$c N;
    public c O;
    public d$d P;
    public CacheKeyOptions Q;
    public a R;
    public d S;
    public d T;
    public Interceptor U;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public float i;
    public float j;
    public final HashMap k;
    public final HashMap l;
    public final HashMap m;
    public final HashMap n;
    public final HashMap o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public static final Double V;
    public static final Double W;
    public static final Double X;
    public static final String Y;

    static {
       Double uDouble = Double.valueOf(0x3f50624dd2f1a9fc);
       d.V = uDouble;
       d.W = uDouble;
       d.X = Double.valueOf(0x3ff0000000000000);
       d.Y = d.class.getSimpleName();
    }
    public void d(){
       super();
       this.a = 3000;
       this.b = 5000;
       this.c = 5000;
       this.d = 2;
       int i = 0;
       this.e = i;
       this.f = 10;
       this.g = 5;
       this.h = 1024;
       this.i = 0.01f;
       this.j = 0x3f800000;
       this.k = new HashMap();
       this.l = new HashMap();
       this.m = new HashMap();
       this.n = new HashMap();
       this.o = new HashMap();
       this.p = true;
       this.q = true;
       this.r = i;
       this.s = true;
       this.t = i;
       this.u = i;
       this.v = i;
       this.w = i;
       boolean b = (Build$VERSION.SDK_INT <= 26)? true: false;
       this.x = b;
       this.y = i;
       this.z = true;
       this.A = true;
       this.B = i;
       this.C = true;
       this.E = 256;
       this.F = i;
       this.G = true;
       this.H = i;
       this.I = new ArrayList();
       this.J = 1;
       this.Q = CacheKeyOptions.URL;
       return;
    }
    public void d(String p0){
       String str = "caller_class_name_filters";
       super();
       this.a = 3000;
       this.b = 5000;
       this.c = 5000;
       this.d = 2;
       this.e = 0;
       this.f = 10;
       this.g = 5;
       this.h = 1024;
       this.i = 0.01f;
       this.j = 0x3f800000;
       this.k = new HashMap();
       this.l = new HashMap();
       this.m = new HashMap();
       this.n = new HashMap();
       this.o = new HashMap();
       this.p = true;
       this.q = true;
       this.r = false;
       this.s = true;
       this.t = false;
       this.u = false;
       this.v = false;
       this.w = false;
       boolean sDK_INT = Build$VERSION.SDK_INT;
       d uod = 26;
       boolean b = (sDK_INT <= uod)? true: false;
       try{
          this.x = b;
          this.y = false;
          this.z = true;
          this.A = true;
          this.B = false;
          this.C = true;
          this.E = 256;
          this.F = false;
          this.G = true;
          this.H = false;
          this.I = new ArrayList();
          this.J = 1;
          this.Q = CacheKeyOptions.URL;
          this.D = p0;
          if (p0 != null && !p0.isEmpty()) {
             JsonObject jsonObject = new c().a(p0).r();
             this.a = this.e(jsonObject, "connect_timeout_ms", 1, 0xea60, 3000);
             this.b = this.e(jsonObject, "read_timeout_ms", 1, 0xea60, 5000);
             this.c = this.e(jsonObject, "write_timeout_ms", 1, 0xea60, 5000);
             this.d = this.e(jsonObject, "max_retry_count", 0, 10, 2);
             this.e = this.e(jsonObject, "main_disk_cache_size_limit", 1, 0x2800, 0);
             this.f = this.e(jsonObject, "small_disk_cache_size_limit", 0, 0x2800, 10);
             this.g = this.e(jsonObject, "fresco_log_level", 2, 7, 5);
             this.E = this.e(jsonObject, "recycled_tracker_lru_cache_size", 0, 0x2800, 256);
             this.h = this.e(jsonObject, "max_bitmap_cache_size_mb", -1, 1024, 1024);
             this.Q = this.a(this.e(jsonObject, "cache_key_options", 0, 2, 0));
             this.i = this.d(jsonObject, "cdn_resource_download_success_ratio", 0, 0x3f800000, 0.01f);
             this.j = this.d(jsonObject, "cdn_resource_download_failed_ratio", 0, 0x3f800000, 0x3f800000);
             this.q = this.c(jsonObject, "enable_bitmap_cache_eviction_queue_size_limit", true);
             this.p = this.c(jsonObject, "use_larger_fresco_cache_memory", true);
             this.r = this.c(jsonObject, "force_rgb565", 0);
             this.s = this.c(jsonObject, "enable_anti_aliasing", true);
             this.t = this.c(jsonObject, "is_debug", 0);
             this.u = this.c(jsonObject, "enable_debug_overlay", 0);
             this.v = this.c(jsonObject, "enable_ffmpeg_sw_scale", 0);
             this.w = this.c(jsonObject, "trim_memory_on_background", 0);
             Object String str1 = "trim_memory_on_low_memory";
             sDK_INT = (sDK_INT <= uod)? true: false;
             this.x = this.c(jsonObject, str1, sDK_INT);
             this.y = this.c(jsonObject, "force_png_argb8888_if_resize", 0);
             this.z = this.c(jsonObject, "enable_aegon_cronet", true);
             this.F = this.c(jsonObject, "enable_resolve_exclusive_cache_crash", 0);
             this.G = this.c(jsonObject, "enable_recycled_tracker", true);
             this.H = this.c(jsonObject, "enable_caller_class_name_collector", 0);
             this.A = this.c(jsonObject, "enable_prefetch", true);
             this.C = this.c(jsonObject, "enable_image_metrics_reporter", true);
             if (jsonObject.g0(str) != null) {
                Iterator iterator = jsonObject.g0(str).iterator();
                while (iterator.hasNext()) {
                   this.I.add(iterator.next().w());
                }
             }
             JsonObject jsonObject1 = jsonObject.m0("metrics_ratio");
             if (jsonObject1 != null) {
                Iterator iterator1 = jsonObject1.w0().iterator();
                while (iterator1.hasNext()) {
                   String str2 = iterator1.next();
                   str1 = -1;
                   String str3 = 4;
                   int i = 3;
                   switch (str2.hashCode()){
                       case 0xa7cf59f8:
                         if (str2.equals("bundle_id")) {
                            str1 = 2;
                         }
                         break;
                       case 0xad3b777a:
                         if (str2.equals("biz_ft")) {
                            str1 = 3;
                         }
                         break;
                       case 0x30f5a8:
                         if (str2.equals("host")) {
                            str1 = null;
                         }
                         break;
                       case 0x346425:
                         if (str2.equals("path")) {
                            str1 = 1;
                         }
                         break;
                       case 0x5c13d641:
                         if (str2.equals("default")) {
                            str1 = 4;
                         }
                         break;
                       default:
                   }
                label_0259 :
                   if (str1) {
                      if (str1 != true) {
                         if (str1 != 2) {
                            if (str1 != i) {
                               if (str1 != str3) {
                                  continue ;
                               }
                            }else {
                               this.b(jsonObject1.e0(str2).r(), this.n);
                            }
                         }else {
                            this.b(jsonObject1.e0(str2).r(), this.m);
                         }
                      }else {
                         this.b(jsonObject1.e0(str2).r(), this.l);
                      }
                   }else {
                      this.b(jsonObject1.e0(str2).r(), this.k);
                   }
                   this.b(jsonObject1.e0(str2).r(), this.o);
                }
             }
             this.J = this.e(jsonObject, "ffmpeg_decode_heif_thread_count", 1, 8, 1);
          }
       }catch(java.lang.Exception e13){
          Log.e(d.Y, "json config parse error occurred caused by : "+e13);
       }
       return;
    }
    public final CacheKeyOptions a(int p0){
       if (p0 == 1) {
          return CacheKeyOptions.PATH;
       }
       if (p0 != 2) {
          return CacheKeyOptions.URL;
       }
       return CacheKeyOptions.PATH_CDN_SIZE;
    }
    public final void b(JsonObject p0,HashMap p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "6")) {
          return;
       }
       Iterator iterator = p0.w0().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          p1.put(str, Double.valueOf(p0.e0(str).m()));
       }
       return;
    }
    public final boolean c(JsonObject p0,String p1,boolean p2){
       if (PatchProxy.isSupport(d.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, d.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       JsonElement jsonElement = p0.e0(p1);
       if (jsonElement == null) {
          return p2;
       }else if(!(jsonElement.w()).equals("true") && !(jsonElement.w()).equals("false")){
          return p2;
       }else {
          return jsonElement.d();
       }
    }
    public final float d(JsonObject p0,String p1,float p2,float p3,float p4){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{p0,p1,Float.valueOf(p2),Float.valueOf(p3),Float.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, this, uod, "2");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       JsonElement jsonElement = p0.e0(p1);
       float f = (jsonElement == null)? p4: jsonElement.n();
       if (f - p3 > 0 || f - p2 < 0) {
          return p4;
       }else {
          return f;
       }
    }
    public final int e(JsonObject p0,String p1,int p2,int p3,int p4){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, this, uod, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       JsonElement jsonElement = p0.e0(p1);
       int i = (jsonElement == null)? p4: jsonElement.p();
       if (i > p3 || i < p2) {
          return p4;
       }else {
          return i;
       }
    }
    public String toString(){
       Double x;
       JsonObject obj = PatchProxy.apply(null, this, d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JsonObject();
       obj.a0("connect_timeout_ms", Integer.valueOf(this.a));
       obj.a0("read_timeout_ms", Integer.valueOf(this.b));
       obj.a0("write_timeout_ms", Integer.valueOf(this.c));
       obj.a0("max_retry_count", Integer.valueOf(this.d));
       obj.a0("main_disk_cache_size_limit", Integer.valueOf(this.e));
       obj.a0("small_disk_cache_size_limit", Integer.valueOf(this.f));
       obj.a0("fresco_log_level", Integer.valueOf(this.g));
       obj.a0("max_bitmap_cache_size_mb", Integer.valueOf(this.h));
       obj.c0("cache_key_options", this.Q.toString());
       obj.a0("cdn_resource_download_success_ratio", Float.valueOf(this.i));
       obj.a0("cdn_resource_download_failed_ratio", Float.valueOf(this.j));
       obj.H("enable_bitmap_cache_eviction_queue_size_limit", Boolean.valueOf(this.q));
       obj.H("use_larger_fresco_cache_memory", Boolean.valueOf(this.p));
       obj.H("force_rgb565", Boolean.valueOf(this.r));
       obj.H("enable_anti_aliasing", Boolean.valueOf(this.s));
       obj.H("is_debug", Boolean.valueOf(this.t));
       obj.H("enable_debug_overlay", Boolean.valueOf(this.u));
       obj.H("enable_ffmpeg_sw_scale", Boolean.valueOf(this.v));
       obj.H("trim_memory_on_background", Boolean.valueOf(this.w));
       obj.H("trim_memory_on_low_memory", Boolean.valueOf(this.x));
       obj.H("force_png_argb8888_if_resize", Boolean.valueOf(this.y));
       obj.H("enable_aegon_cronet", Boolean.valueOf(this.z));
       obj.H("enable_prefetch", Boolean.valueOf(this.A));
       obj.H("enable_image_metrics_reporter", Boolean.valueOf(this.C));
       obj.c0("caller_class_name_filters", this.I.toString());
       obj.a0("recycled_tracker_lru_cache_size", Integer.valueOf(this.E));
       obj.H("enable_resolve_exclusive_cache_crash", Boolean.valueOf(this.F));
       obj.H("enable_recycled_tracker", Boolean.valueOf(this.G));
       obj.H("enable_caller_class_name_collector", Boolean.valueOf(this.H));
       if (!this.k.isEmpty()) {
          obj.c0("host_metrics_ratio", this.k.toString());
       }
       if (!this.l.isEmpty()) {
          obj.c0("path_metrics_ratio", this.l.toString());
       }
       if (!this.m.isEmpty()) {
          obj.c0("bundle_id_metrics_ratio", this.m.toString());
       }
       if (!this.n.isEmpty()) {
          obj.c0("biz_ft_metrics_ratio", this.n.toString());
       }
       String str = "success";
       Number number = (this.o.get(str) != null)? this.o.get(str): d.V;
       obj.a0("default_metrics_ratio_success", number);
       str = "canceled";
       number = (this.o.get(str) != null)? this.o.get(str): d.W;
       obj.a0("default_metrics_ratio_canceled", number);
       str = "error";
       number = (this.o.get(str) != null)? this.o.get(str): d.X;
       obj.a0("default_metrics_ratio_error", number);
       obj.a0("ffmpeg_decode_heif_thread_count", Integer.valueOf(this.J));
       return obj.toString();
    }
}
