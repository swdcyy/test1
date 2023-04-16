package ld.f;
import ld.d;
import java.lang.Integer;
import java.lang.Object;
import com.facebook.imageformat.a;
import ld.c;
import com.facebook.imagepipeline.nativecode.NativeJpegTranscoderFactory;
import java.lang.Class;
import java.lang.Boolean;
import java.lang.reflect.Constructor;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Throwable;
import ld.h;
import java.lang.IllegalArgumentException;
import vc.k;

public class f implements d	// class@001d7d
{
    public final int a;
    public final boolean b;
    public final d c;
    public final Integer d;
    public final boolean e;

    public void f(int p0,boolean p1,d p2,Integer p3,boolean p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public final c a(a p0,boolean p1){
       Class tYPE;
       f ta = this.a;
       f tb = this.b;
       f te = this.e;
       try{
          Class[] uClassArray = new Class[]{Integer.TYPE,tYPE,tYPE};
          tYPE = Boolean.TYPE;
          Object[] objArray = new Object[]{Integer.valueOf(ta),Boolean.valueOf(tb),Boolean.valueOf(te)};
          return NativeJpegTranscoderFactory.class.getConstructor(uClassArray).newInstance(objArray).createImageTranscoder(p0, p1);
       }catch(java.lang.NoSuchMethodException e11){
       }catch(java.lang.SecurityException e11){
       }catch(java.lang.InstantiationException e11){
       }catch(java.lang.reflect.InvocationTargetException e11){
       }catch(java.lang.IllegalAccessException e11){
       }catch(java.lang.IllegalArgumentException e11){
       }catch(java.lang.ClassNotFoundException e11){
       }
       throw new RuntimeException("Dependency \':native-imagetranscoder\' is needed to use the default native image transcoder.", e11);
    }
    public final c b(a p0,boolean p1){
       return new h(this.a).createImageTranscoder(p0, p1);
    }
    public c createImageTranscoder(a p0,boolean p1){
       f tc = this.c;
       boolean b = false;
       c uoc = (tc == null)? b: tc.createImageTranscoder(p0, p1);
       if (uoc == null) {
          tc = this.d;
          if (tc != null) {
             int i = tc.intValue();
             if (i) {
                if (i == 1) {
                   b = this.b(p0, p1);
                }else {
                   throw new IllegalArgumentException("Invalid ImageTranscoderType");
                }
             }else {
                b = this.a(p0, p1);
             }
          }
          uoc = b;
       }
       if (uoc == null && k.a()) {
          uoc = this.a(p0, p1);
       }
       if (uoc == null) {
          uoc = this.b(p0, p1);
       }
       return uoc;
    }
}
