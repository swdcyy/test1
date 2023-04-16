package c.t.m.g.af;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import java.lang.Throwable;
import c.t.m.g.bt;
import java.lang.reflect.Method;

public class af	// class@000bb9
{
    public final String a;
    public Context b;
    public Class c;
    public Object d;
    public Method e;

    public void af(Context p0){
       super();
       this.a = "XiaomiDeviceIDHelper";
       try{
          this.b = p0;
          Class uClass = Class.forName("com.android.id.impl.IdProviderImpl");
          this.c = uClass;
          this.d = uClass.newInstance();
       }catch(java.lang.Exception e7){
          bt.a("XiaomiDeviceIDHelper", "constructor", e7);
       }
       try{
          Class[] uClassArray = new Class[]{Context.class};
          this.e = this.c.getMethod("getOAID", uClassArray);
       }catch(java.lang.Exception e7){
          bt.a("XiaomiDeviceIDHelper", "constructor", e7);
       }
       return;
    }
    public String a(){
       return this.a(this.b, this.e);
    }
    public final String a(Context p0,Method p1){
       String str;
       af td = this.d;
       if (td != null && p1 != null) {
          int i = 1;
          try{
             Object[] objArray = new Object[i];
             objArray[0] = p0;
             str = p1.invoke(td, objArray);
          label_001c :
             return str;
          }catch(java.lang.Exception e4){
             bt.a("XiaomiDeviceIDHelper", "invoke", e4);
          }
       label_001b :
          str = null;
          goto label_001c ;
       }else {
          goto label_001b ;
       }
    }
}
