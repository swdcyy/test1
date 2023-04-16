package com.xiaomi.push.go;
import ws8.p5;
import android.os.Bundle;
import com.xiaomi.push.go$b;
import java.lang.String;
import com.xiaomi.push.go$a;
import java.lang.Enum;
import java.lang.StringBuilder;
import ws8.x5;
import java.lang.Object;
import com.xiaomi.push.f;
import java.lang.IllegalArgumentException;
import java.util.Objects;

public class go extends p5	// class@00110e
{
    public go$b o;
    public String p;
    public int q;
    public go$a r;

    public void go(Bundle p0){
       super(p0);
       this.o = go$b.a;
       this.p = null;
       this.q = Integer.MIN_VALUE;
       this.r = null;
       String str = "ext_pres_type";
       if (p0.containsKey(str)) {
          this.o = go$b.valueOf(p0.getString(str));
       }
       str = "ext_pres_status";
       if (p0.containsKey(str)) {
          this.p = p0.getString(str);
       }
       str = "ext_pres_prio";
       if (p0.containsKey(str)) {
          this.q = p0.getInt(str);
       }
       if (p0.containsKey("ext_pres_mode")) {
          this.r = go$a.valueOf(p0.getString("ext_pres_mode"));
       }
       return;
    }
    public void go(go$b p0){
       super();
       this.o = go$b.a;
       this.p = null;
       this.q = Integer.MIN_VALUE;
       this.r = null;
       this.z(p0);
    }
    public void A(String p0){
       this.p = p0;
    }
    public Bundle a(){
       Bundle uBundle = super.a();
       go to = this.o;
       if (to != null) {
          uBundle.putString("ext_pres_type", to.toString());
       }
       to = this.p;
       if (to != null) {
          uBundle.putString("ext_pres_status", to);
       }
       to = this.q;
       if (to != Integer.MIN_VALUE) {
          uBundle.putInt("ext_pres_prio", to);
       }
       to = this.r;
       if (to != null && to != go$a.b) {
          uBundle.putString("ext_pres_mode", to.toString());
       }
       return uBundle;
    }
    public String d(){
       StringBuilder str = "<presence";
       String str1 = "\"";
       if (this.w() != null) {
          str = str+" xmlns=\""+this.w()+str1;
       }
       if (this.l() != null) {
          str = str+" id=\""+this.l()+str1;
       }
       if (this.o() != null) {
          str = str+" to=\""+x5.b(this.o())+str1;
       }
       if (this.q() != null) {
          str = str+" from=\""+x5.b(this.q())+str1;
       }
       if (this.m() != null) {
          str = str+" chid=\""+x5.b(this.m())+str1;
       }
       if (this.o != null) {
          str = str+" type=\""+this.o+str1;
       }
       str = str+">";
       if (this.p != null) {
          str = str+"<status>"+x5.b(this.p)+"</status>";
       }
       if (this.q != Integer.MIN_VALUE) {
          str = str+"<priority>"+this.q+"</priority>";
       }
       go tr = this.r;
       if (tr != null && tr != go$a.b) {
          str = str+"<show>"+this.r+"</show>";
       }
       str = str+this.u();
       f uof = this.b();
       if (uof != null) {
          str = str+uof.b();
       }
       return str+"</presence>";
    }
    public void x(int p0){
       if (p0 < -128 || p0 > 128) {
          throw new IllegalArgumentException("Priority value "+p0+" is not valid. Valid range is -128 through 128.");
       }
       this.q = p0;
       return;
    }
    public void y(go$a p0){
       this.r = p0;
    }
    public void z(go$b p0){
       Objects.requireNonNull(p0, "Type cannot be null");
       this.o = p0;
    }
}
