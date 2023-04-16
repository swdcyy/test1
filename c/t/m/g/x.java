package c.t.m.g.x;
import c.t.m.g.x$a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import java.lang.reflect.Method;
import android.content.Context;
import java.lang.StringBuilder;
import c.t.m.g.bt;
import c.t.m.g.z;
import c.t.m.g.aa;
import c.t.m.g.ab;
import c.t.m.g.ae;
import c.t.m.g.af;
import java.lang.Thread;
import c.t.m.g.x$1;
import java.lang.Runnable;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.os.Build;

public class x	// class@000cb4
{
    public final String a;
    public x$a b;

    public void x(x$a p0){
       super();
       this.a = "DevicesIDsHelper";
       this.b = p0;
    }
    public static x$a a(x p0){
       return p0.b;
    }
    public final String a(String p0){
       String str = String.class;
       String str1 = null;
       if (p0 == null) {
          return str1;
       }
       try{
          Class uClass = Class.forName("android.os.SystemProperties");
          Class[] uClassArray = new Class[]{str,str};
          Object[] objArray = new Object[]{p0,"unknown"};
          str1 = uClass.getMethod("get", uClassArray).invoke(uClass, objArray);
          return str1;
       }catch(java.lang.Exception e0){
       }
    }
    public void a(Context p0){
       String str1;
       bt.a("OAID_TOOL", "getManufacturer ===> "+this.c());
       String str = (this.c()).toUpperCase();
       if (("ASUS").equals(str)) {
          this.a(p0, str);
       }else if(("HUAWEI").equals(str)){
          this.a(p0, str);
       }else if(("LENOVO").equals(str)){
          new z(p0).a(this.b);
       }else if(("MOTOLORA").equals(str)){
          new z(p0).a(this.b);
       }else if(("MEIZU").equals(str)){
          new aa(p0).a(this.b);
       }else if(("NUBIA").equals(str)){
          str1 = new ab(p0).a();
       label_0118 :
          boolean b = (str1 != null)? true: false;
          x tb = this.b;
          if (tb != null) {
             tb.a(str1, b);
          }
          return;
       }else if(("OPPO").equals(str)){
          this.a(p0, str);
       }else if(("SAMSUNG").equals(str)){
          this.d();
       }else if(("VIVO").equals(str)){
          str1 = new ae(p0).a();
          goto label_0118 ;
       }else if(("XIAOMI").equals(str)){
          str1 = new af(p0).a();
          goto label_0118 ;
       }else if(("BLACKSHARK").equals(str)){
          str1 = new af(p0).a();
          goto label_0118 ;
       }else if(("ONEPLUS").equals(str)){
          this.a(p0, str);
       }else if(("ZTE").equals(str)){
          this.a(p0, str);
       }else if(("FERRMEOS").equals(str) || this.a()){
          this.a(p0, str);
       }else if(("SSUI").equals(str) || this.b()){
          this.a(p0, str);
       }
       str1 = null;
       goto label_0118 ;
    }
    public final void a(Context p0,String p1){
       new Thread(new x$1(this, p1, p0)).start();
    }
    public boolean a(){
       String str = this.a("ro.build.freeme.label");
       if (!TextUtils.isEmpty(str) && str.equalsIgnoreCase("FREEMEOS")) {
          return true;
       }
       return false;
    }
    public boolean b(){
       String str = this.a("ro.ssui.product");
       if (!TextUtils.isEmpty(str) && !str.equalsIgnoreCase("unknown")) {
          return true;
       }
       return false;
    }
    public final String c(){
       return (Build.MANUFACTURER).toUpperCase();
    }
    public final void d(){
       x tb = this.b;
       if (tb != null) {
          tb.a(null, false);
       }
       return;
    }
}
