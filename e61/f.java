package e61.f;
import e61.c;
import java.lang.String;
import java.io.File;
import java.lang.reflect.Type;
import java.lang.Object;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.util.v;
import java.lang.IllegalArgumentException;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import gkd.a;
import java.lang.Exception;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import gkd.a$e;
import java.lang.Long;
import gkd.a$c;
import fg6.a;
import com.google.gson.Gson;
import e61.f$a;
import java.lang.System;
import java.lang.NullPointerException;
import java.util.Objects;
import java.lang.Throwable;
import java.lang.Number;

public class f implements c	// class@0020ad
{
    public Type a;
    public File b;
    public a c;
    public long d;

    public void f(String p0,File p1,Type p2,long p3){
       super();
       if (TextUtils.isEmpty(p0)) {
          throw new IllegalArgumentException("LiveDiskCache cacheKey can\'t be null");
       }
       this.a = p2;
       this.b = new File(p1, v.h(p0));
       this.d = p3;
       this.a();
       return;
    }
    public final boolean a(){
       Object obj = PatchProxy.apply(null, this, f.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       try{
          this.c = a.l(this.b, 1, 1, this.d);
          return 1;
       }catch(java.io.IOException e0){
          this.f(e0);
          return false;
       }
    }
    public final boolean b(){
       Object obj = PatchProxy.apply(null, this, f.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.c == null)? true: false;
       if (b) {
          return this.a();
       }else {
          return true;
       }
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, f.class, "11")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_CACHE_MANAGER, "cache not available");
       return;
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, f.class, "8")) {
          return;
       }
       if (this.b()) {
          try{
             this.c.c();
          }catch(java.io.IOException e0){
             this.f(e0);
          }
       }else {
          this.c();
       }
    }
    public boolean contains(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.b()) {
          try{
             a$e uoe = this.c.h(p0);
             if (uoe != null) {
                uoe.close();
                return true;
             }else if(uoe != null){
                uoe.close();
             }
          }catch(java.io.IOException e3){
             this.f(e3);
          }
       }else {
          this.c();
       }
    }
    public void d(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "1")) {
          return;
       }
       this.e(p0, p1, 0);
       return;
    }
    public void e(String p0,Object p1,long p2){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Long.valueOf(p2), this, f.class, "2")) {
          return;
       }
       if (this.b()) {
          try{
             if (this.a != null) {
                a$c uoc = this.c.g(p0);
                Gson a = a.a;
                p1 = a.r(p1, this.a);
                long l = 0;
                if (p2 - l > 0) {
                   l = System.currentTimeMillis() + p2;
                }
                uoc.f(0, a.r(new f$a(this, p1, l), f$a.class));
                uoc.b();
             }else {
                throw new NullPointerException("mType can\'t be null when put object to cache");
             }
          }catch(java.io.IOException e8){
             this.f(e8);
          }
       }else {
          this.c();
       }
    }
    public final void f(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "10")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_CACHE_MANAGER, p0.getMessage());
       return;
    }
    public Object get(String p0){
       f obj = PatchProxy.applyOneRefs(p0, this, f.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b()) {
          obj = this.a;
          String str = "mType can\'t be null when get object from cache";
          try{
             Objects.requireNonNull(obj, str);
             a$e uoe = this.c.h(p0);
             if (uoe == null) {
                if (uoe != null) {
                   uoe.close();
                }
                return null;
             }else {
                Gson a = a.a;
                f$a uoa = a.h(uoe.getString(0), f$a.class);
                f$a b = uoa.b;
                if (b > 0 && b - System.currentTimeMillis() < 0) {
                   this.remove(p0);
                   uoe.close();
                   return null;
                }else {
                   uoe.close();
                   return a.i(uoa.a, this.a);
                }
             }
          }catch(java.io.IOException e10){
             this.f(e10);
          }
          return null;
       }else {
          this.c();
          goto label_006d ;
       }
    }
    public void remove(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "5")) {
          return;
       }
       if (this.b()) {
          try{
             this.c.u(p0);
          }catch(java.io.IOException e3){
             this.f(e3);
          }
       }else {
          this.c();
       }
    }
    public long size(){
       Object obj = PatchProxy.apply(null, this, f.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (this.b()) {
          return this.c.x();
       }
       return 0;
    }
}
