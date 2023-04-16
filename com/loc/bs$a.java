package com.loc.bs$a;
import com.loc.ck;
import android.content.Context;
import com.loc.br;
import java.util.List;
import com.loc.bs;
import java.lang.Throwable;
import java.lang.String;
import com.loc.an;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.lang.Object;
import java.lang.ref.WeakReference;
import com.loc.bn;
import com.loc.bt;
import com.loc.al;
import com.loc.bu;
import com.loc.by;
import com.loc.bv;
import com.loc.bz;
import com.loc.cb;
import com.loc.ca;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.loc.cf;
import com.loc.cc;
import com.loc.cd;
import com.loc.cg;
import com.loc.bo;

public final class bs$a extends ck	// class@0013a8
{
    public Context d;
    public br f;
    public int g;
    public List h;
    public static int a = 1;
    public static int b = 2;
    public static int c = 3;

    public void bs$a(Context p0,int p1){
       super();
       this.d = p0;
       this.g = p1;
    }
    public void bs$a(Context p0,int p1,br p2){
       this.f = p2;
    }
    public void bs$a(Context p0,int p1,List p2){
       this.h = p2;
    }
    public final void a(){
       bs$a uoa = this;
       bs uobs = bs.class;
       bs$a g = uoa.g;
       if (g == 1) {
          if (uoa.d == null || uoa.f == null) {
             return;
          }else {
             _monitor_enter(uobs);
             g = uoa.d;
             if (g != null) {
                bs$a f = uoa.f;
                if (f != null) {
                   bs.a(g, f.a());
                   _monitor_exit(uobs);
                   return;
                }
             }
             _monitor_exit(uobs);
             return;
          }
       }else if(g == 2){
          _monitor_enter(uobs);
          if (uoa.h == null || uoa.d == null) {
             _monitor_exit(uobs);
             return;
          }else {
             byte[] uobyteArray = new byte[0];
             ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
             Iterator iterator = uoa.h.iterator();
             while (iterator.hasNext()) {
                br uobr = iterator.next();
                if (uobr != null) {
                   uByteArrayOu.write(uobr.a());
                }
             }
             uobyteArray = uByteArrayOu.toByteArray();
             uByteArrayOu.close();
             bs.a(uoa.d, uobyteArray);
             _monitor_exit(uobs);
             return;
          }
       }else if(g == 3){
          if (uoa.d == null) {
             return;
          }
          bn uobn = bt.a(bs.a());
          bt.a(uoa.d, uobn, al.h, 1000, 0x4b000, "2");
          if (uobn.g == null) {
             uobn.g = new bu(new by(uoa.d, new bv(new bz(new cb()))));
          }
          uobn.h = 0x36ee80;
          if (TextUtils.isEmpty(uobn.i)) {
             uobn.i = "cKey";
          }
          if (uobn.f == null) {
             bs$a d = uoa.d;
             cd uocd = new cd(d, bs.a, (bs.b() * 1024), (bs.b * 1024), "staticUpdate", (bs.c() * 1024));
             uobn.f = new cf(d, uobn.h, uobn.i, new cc(uobn.a, v15));
          }
          bo.a(uobn);
          return;
       }else {
          return;
       }
    }
}
