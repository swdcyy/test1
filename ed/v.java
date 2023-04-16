package ed.v;
import ed.u;
import java.lang.Object;
import ab.e;
import ed.d;
import java.lang.String;
import ed.h;
import eb.c;
import ed.w;
import ed.x;
import ed.j;
import ed.o;
import ed.r;
import ed.m;
import ed.l;
import ed.n;
import com.facebook.imagepipeline.memory.c;
import com.facebook.imagepipeline.memory.AshmemMemoryChunkPool;
import java.lang.Class;
import java.lang.reflect.Constructor;
import java.lang.IllegalArgumentException;
import com.facebook.imagepipeline.memory.BufferMemoryChunkPool;
import com.facebook.imagepipeline.memory.NativeMemoryChunkPool;
import java.lang.Throwable;
import cb.a;
import com.facebook.common.memory.b;
import vc.k;
import java.lang.StringBuilder;
import com.facebook.imagepipeline.memory.e;
import com.facebook.common.memory.c;
import eb.a;
import com.facebook.imagepipeline.memory.a;

public class v	// class@00153e
{
    public final u a;
    public c b;
    public d c;
    public c d;
    public n e;
    public c f;
    public b g;
    public c h;
    public y i;
    public a j;

    public void v(u p0){
       super();
       e.d(p0);
       this.a = p0;
    }
    public d a(){
       if (this.c == null) {
          String str = this.a.e();
          v ov = -1;
          v ov1 = 3;
          v ov2 = 2;
          switch (str.hashCode()){
              case 0x909b147a:
                if (str.equals("legacy_default_params")) {
                   ov = 3;
                }
                break;
              case 0xbe0af3c9:
                if (str.equals("legacy")) {
                   ov = 4;
                }
                break;
              case 0xe7e2dce8:
                if (str.equals("experimental")) {
                   ov = 2;
                }
                break;
              case 0xe807aeb9:
                if (str.equals("dummy_with_tracking")) {
                   ov = 1;
                }
                break;
              case 0x5b804a8:
                if (str.equals("dummy")) {
                   ov = null;
                }
                break;
              default:
          }
       label_0047 :
          if (ov) {
             if (ov != 1) {
                if (ov != ov2) {
                   if (ov != ov1) {
                      this.c = new h(this.a.i(), this.a.c(), this.a.d(), this.a.j());
                   }else {
                      this.c = new h(this.a.i(), j.a(), this.a.d(), this.a.j());
                   }
                }else {
                   int i = this.a.b();
                   int i1 = this.a.a();
                   r or = r.h();
                   c uoc = (this.a.k())? this.a.i(): null;
                   this.c = new o(i, i1, or, uoc);
                }
             }else {
                this.c = new m();
             }
          }else {
             this.c = new l();
          }
       }
       return this.c;
    }
    public n b(){
       if (this.e == null) {
          this.e = new n(this.a.i(), this.a.f());
       }
       return this.e;
    }
    public int c(){
       return this.a.f().h;
    }
    public final c d(int p0){
       Class[] uClassArray;
       Object[] objArray;
       x ox = x.class;
       w ow = w.class;
       c uoc = c.class;
       if (p0) {
          if (p0 != 1) {
             if (p0 == 2) {
                if (this.b == null) {
                   try{
                      uClassArray = new Class[]{uoc,ow,ox};
                      objArray = new Object[]{this.a.i(),this.a.g(),this.a.h()};
                      this.b = AshmemMemoryChunkPool.class.getConstructor(uClassArray).newInstance(objArray);
                   }catch(java.lang.ClassNotFoundException e0){
                      this.b = null;
                   }catch(java.lang.IllegalAccessException e0){
                      this.b = null;
                   }catch(java.lang.InstantiationException e0){
                      this.b = null;
                   }catch(java.lang.NoSuchMethodException e0){
                      this.b = null;
                   }catch(java.lang.reflect.InvocationTargetException e0){
                      this.b = null;
                   }
                }
             }else {
                throw new IllegalArgumentException("Invalid MemoryChunkType");
             }
          }else if(this.d == null){
             try{
                uClassArray = new Class[]{uoc,ow,ox};
                objArray = new Object[]{this.a.i(),this.a.g(),this.a.h()};
                this.d = BufferMemoryChunkPool.class.getConstructor(uClassArray).newInstance(objArray);
             }catch(java.lang.ClassNotFoundException e0){
                this.d = null;
             }catch(java.lang.IllegalAccessException e0){
                this.d = null;
             }catch(java.lang.InstantiationException e0){
                this.d = null;
             }catch(java.lang.NoSuchMethodException e0){
                this.d = null;
             }catch(java.lang.reflect.InvocationTargetException e0){
                this.d = null;
             }
          }
       }else if(this.f == null){
          try{
             Class[] uClassArray1 = new Class[]{uoc,ow,ox};
             Object[] objArray1 = new Object[]{this.a.i(),this.a.g(),this.a.h()};
             this.f = NativeMemoryChunkPool.class.getConstructor(uClassArray1).newInstance(objArray1);
          }catch(java.lang.ClassNotFoundException e0){
             a.h("PoolFactory", "", e0);
             this.f = null;
          }catch(java.lang.IllegalAccessException e0){
             a.h("PoolFactory", "", e0);
             this.f = null;
          }catch(java.lang.InstantiationException e0){
             a.h("PoolFactory", "", e0);
             this.f = null;
          }catch(java.lang.NoSuchMethodException e0){
             a.h("PoolFactory", "", e0);
             this.f = null;
          }catch(java.lang.reflect.InvocationTargetException e0){
             a.h("PoolFactory", "", e0);
             this.f = null;
          }
       }
    }
    public b e(){
       return this.f((k.a() ^ 0x01));
    }
    public b f(int p0){
       if (this.g == null) {
          e.e(this.d(p0), "failed to get pool for chunk type: "+p0);
          this.g = new e(this.d(p0), this.g());
       }
       return this.g;
    }
    public c g(){
       if (this.h == null) {
          this.h = new c(this.h());
       }
       return this.h;
    }
    public a h(){
       if (this.j == null) {
          v ta = this.a;
          this.j = new a(this.a.i(), ta.g, ta.h);
       }
       return this.j;
    }
}
