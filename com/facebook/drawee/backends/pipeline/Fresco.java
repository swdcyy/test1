package com.facebook.drawee.backends.pipeline.Fresco;
import java.lang.Object;
import pb.e;
import com.facebook.imagepipeline.core.ImagePipeline;
import vc.j;
import android.content.Context;
import vc.h;
import pb.b;
import kd.b;
import java.lang.String;
import java.lang.Class;
import cb.a;
import vc.k;
import gg.a;
import com.facebook.imagepipeline.nativecode.NativeCodeInitializer;
import java.lang.reflect.Method;
import gg.c;
import gg.b;
import vc.h$b;
import ab.h;
import com.facebook.drawee.view.SimpleDraweeView;
import pb.d;
import tc.s;
import ab.f;
import ab.a;

public class Fresco	// class@000457
{
    public static final Class TAG;
    public static e sDraweeControllerBuilderSupplier;
    public static boolean sIsInitialized;

    static {
       Fresco.TAG = Fresco.class;
    }
    public void Fresco(){
       super();
    }
    public static e getDraweeControllerBuilderSupplier(){
       return Fresco.sDraweeControllerBuilderSupplier;
    }
    public static ImagePipeline getImagePipeline(){
       return Fresco.getImagePipelineFactory().h();
    }
    public static j getImagePipelineFactory(){
       return j.j();
    }
    public static boolean hasBeenInitialized(){
       return Fresco.sIsInitialized;
    }
    public static void initialize(Context p0){
       Fresco.initialize(p0, null, null);
    }
    public static void initialize(Context p0,h p1){
       Fresco.initialize(p0, p1, null);
    }
    public static void initialize(Context p0,h p1,b p2){
       Fresco.initialize(p0, p1, p2, true);
    }
    public static void initialize(Context p0,h p1,b p2,boolean p3){
       if (b.d()) {
          b.a("Fresco#initialize");
       }
       int i = 1;
       if (Fresco.sIsInitialized) {
          a.t(Fresco.TAG, "Fresco has already been initialized! `Fresco.initialize\(...\)` should only be called 1 single time to avoid memory leaks!");
       }else {
          Fresco.sIsInitialized = i;
       }
       k.a = p3;
       if (!a.b()) {
          if (b.d()) {
             b.a("Fresco.initialize->SoLoader.init");
          }
          try{
             Class[] uClassArray = new Class[i];
             uClassArray[0] = Context.class;
             Object[] objArray = new Object[i];
             objArray[0] = p0;
             NativeCodeInitializer.class.getMethod("init", uClassArray).invoke(null, objArray);
             if (!b.d()) {
             label_0096 :
                p0 = p0.getApplicationContext();
                if (p1 == null) {
                   _monitor_enter(j.class);
                   if (b.d()) {
                      b.a("ImagePipelineFactory#initialize");
                   }
                   j.s(h.y(p0).a());
                   if (b.d()) {
                      b.b();
                   }
                   _monitor_exit(j.class);
                }else {
                   j.s(p1);
                }
                Fresco.initializeDrawee(p0, p2);
                if (b.d()) {
                   b.b();
                }
                return;
             }
          }catch(java.lang.ClassNotFoundException e0){
             a.a(new c());
             if (!b.d()) {
             }
          }catch(java.lang.IllegalAccessException e0){
             a.a(new c());
             if (!b.d()) {
             }
          }catch(java.lang.reflect.InvocationTargetException e0){
             a.a(new c());
             if (!b.d()) {
             }
          }catch(java.lang.NoSuchMethodException e0){
             a.a(new c());
             if (!b.d()) {
             }
          }
          b.b();
          goto label_0096 ;
       }else {
          goto label_0096 ;
       }
    }
    public static void initializeDrawee(Context p0,b p1){
       if (b.d()) {
          b.a("Fresco.initializeDrawee");
       }
       e uoe = new e(p0, p1);
       Fresco.sDraweeControllerBuilderSupplier = uoe;
       SimpleDraweeView.s(uoe);
       if (b.d()) {
          b.b();
       }
       return;
    }
    public static d newDraweeControllerBuilder(){
       return Fresco.sDraweeControllerBuilderSupplier.b();
    }
    public static void shutDown(){
       Fresco.sDraweeControllerBuilderSupplier = null;
       SimpleDraweeView.i = null;
       _monitor_enter(j.class);
       j u = j.u;
       if (u != null) {
          u.e().p(a.a());
          j.u.g().p(a.a());
          j.u = null;
       }
       _monitor_exit(j.class);
       return;
    }
}
