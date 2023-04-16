package com.xiaomi.push.e;
import ws8.p5;
import com.xiaomi.push.e$a;
import java.util.HashMap;
import android.os.Bundle;
import java.lang.String;
import java.lang.StringBuilder;
import ws8.x5;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.lang.Object;
import java.util.Map$Entry;
import com.xiaomi.push.f;

public class e extends p5	// class@001100
{
    public e$a o;
    public final Map p;

    public void e(){
       super();
       this.o = e$a.b;
       this.p = new HashMap();
    }
    public void e(Bundle p0){
       super(p0);
       this.o = e$a.b;
       this.p = new HashMap();
       if (p0.containsKey("ext_iq_type")) {
          this.o = e$a.a(p0.getString("ext_iq_type"));
       }
       return;
    }
    public String A(){
       return null;
    }
    public Bundle a(){
       Bundle uBundle = super.a();
       e to = this.o;
       if (to != null) {
          uBundle.putString("ext_iq_type", to.toString());
       }
       return uBundle;
    }
    public String d(){
       String str1;
       StringBuilder str = "<iq ";
       if (this.l() != null) {
          str = str+"id=\""+this.l()+"\" ";
       }
       if (this.o() != null) {
          str = str+"to=\""+x5.b(this.o())+"\" ";
       }
       if (this.q() != null) {
          str = str+"from=\""+x5.b(this.q())+"\" ";
       }
       if (this.m() != null) {
          str = str+"chid=\""+x5.b(this.m())+"\" ";
       }
       Iterator iterator = this.p.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          str = str+x5.b(uEntry.getKey())+"=\""+x5.b(uEntry.getValue())+"\" ";
       }
       if (this.o == null) {
          str1 = "type=\"get\">";
       }else {
          str = str+"type=\""+this.x();
          str1 = "\">";
       }
       str = str+str1;
       str1 = this.A();
       if (str1 != null) {
          str = str+str1;
       }
       str = str+this.u();
       f uof = this.b();
       if (uof != null) {
          str = str+uof.b();
       }
       return str+"</iq>";
    }
    public e$a x(){
       return this.o;
    }
    public void y(e$a p0){
       if (p0 == null) {
          p0 = e$a.b;
       }
       this.o = p0;
       return;
    }
    public synchronized void z(Map p0){
       this.p.putAll(p0);
    }
}
