package com.kuaishou.weapon.ks.x$3;
import v38.a;
import com.kuaishou.weapon.ks.x;
import java.lang.Object;
import java.lang.String;
import android.content.Context;
import com.kuaishou.weapon.ks.cc;
import com.kuaishou.weapon.ks.d;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.weapon.ks.r;
import com.kuaishou.weapon.ks.x$3$1;
import java.lang.Runnable;

public class x$3 implements a	// class@001233
{
    public final x a;

    public void x$3(x p0){
       this.a = p0;
       super();
    }
    public void cntData(int p0){
       x.j(this.a, p0);
    }
    public String getT(){
       return cc.a(x.c(this.a)).c();
    }
    public boolean isAd(){
       int i = 1;
       if (x.g(this.a) == -1) {
          x$3 ta = this.a;
          x.e(ta, d.a(x.c(ta)).b("plc001_w_wrp_a_d", i));
       }
       if (!x.g(this.a)) {
          i = false;
       }
       return i;
    }
    public boolean isAe(){
       int i = 1;
       if (x.f(this.a) == -1) {
          x$3 ta = this.a;
          x.d(ta, d.a(x.c(ta)).b("plc001_w_wrp_a_e", i));
       }
       if (!x.f(this.a)) {
          i = false;
       }
       return i;
    }
    public boolean isAs(){
       int i = 1;
       if (x.e(this.a) == -1) {
          x$3 ta = this.a;
          x.c(ta, d.a(x.c(ta)).b("plc001_w_wrp_a_s", i));
       }
       if (!x.e(this.a)) {
          i = false;
       }
       return i;
    }
    public boolean isCnt(){
       int i = 1;
       if (x.b(this.a) == -1) {
          x$3 ta = this.a;
          x.a(ta, d.a(x.c(ta)).b("plc001_w_wrp_c_n", i));
       }
       if (!x.b(this.a)) {
          i = false;
       }
       return i;
    }
    public boolean isEv(){
       int i = 1;
       if (x.j(this.a) == -1) {
          x$3 ta = this.a;
          x.h(ta, d.a(x.c(ta)).b("plc001_w_wrp_e_v", i));
       }
       if (!x.j(this.a)) {
          i = false;
       }
       return i;
    }
    public boolean isGsv(){
       int i = 1;
       if (x.k(this.a) == -1) {
          x$3 ta = this.a;
          x.i(ta, d.a(x.c(ta)).b("plc001_w_wrp_g_s", i));
       }
       if (!x.k(this.a)) {
          i = false;
       }
       return i;
    }
    public boolean isMnt(){
       int i = 1;
       if (x.d(this.a) == -1) {
          x$3 ta = this.a;
          x.b(ta, d.a(x.c(ta)).b("plc001_w_wrp_m_n", i));
       }
       if (!x.d(this.a)) {
          i = false;
       }
       return i;
    }
    public boolean isUd(){
       int i = 1;
       if (x.i(this.a) == -1) {
          x$3 ta = this.a;
          x.g(ta, d.a(x.c(ta)).b("plc001_w_wrp_u_d", i));
       }
       if (!x.i(this.a)) {
          i = false;
       }
       return i;
    }
    public boolean isUe(){
       int i = 1;
       if (x.h(this.a) == -1) {
          x$3 ta = this.a;
          x.f(ta, d.a(x.c(ta)).b("plc001_w_wrp_u_e", i));
       }
       if (!x.h(this.a)) {
          i = false;
       }
       return i;
    }
    public void mntData(int p0,int p1){
       x.a(this.a, p0, p1);
    }
    public void recordScene(String p0,String p1,String p2,String p3,String p4){
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       x$3$1 u3$1 = new x$3$1(this, p0, p2, p3, p4, p1);
       r.a().a(v8);
       return;
    }
}
