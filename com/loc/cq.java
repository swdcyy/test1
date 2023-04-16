package com.loc.cq;
import com.loc.cn;
import java.lang.String;
import java.util.List;
import com.loc.fs;
import com.loc.cx;
import java.lang.Object;
import com.loc.cu;
import com.loc.dc;
import java.lang.Throwable;
import com.loc.eb;
import com.loc.dz;
import java.lang.CharSequence;
import com.loc.cp;
import com.loc.dy;
import com.loc.ea;

public final class cq extends cn	// class@0013c6
{
    public static cq b;

    static {
       cq.b = new cq();
    }
    public void cq(){
       super(5120);
    }
    public static String a(String p0){
       if (p0 == null) {
          p0 = "";
       }
       return p0;
    }
    public static cq b(){
       return cq.b;
    }
    public final byte[] a(byte[] p0,byte[] p1,List p2){
       byte[] uobyteArray = null;
       if (p2 == null) {
          return uobyteArray;
       }
       int i = p2.size();
       if (i > 0 && p0 != null) {
          this.a();
          int i1 = cx.a(this.a, p0);
          int[] ointArray = new int[i];
          int i2 = 0;
          for (int i3 = 0; i3 < i; i3 = i3 + 1) {
             cu uocu = p2.get(i3);
             ointArray[i3] = dc.a(this.a, (byte)uocu.a(), dc.a(this.a, uocu.b()));
          }
          int i4 = cx.a(this.a, ointArray);
          if (p1 != null) {
             i2 = cx.b(this.a, p1);
          }
          this.a.c(cx.a(this.a, i1, i2, i4));
          uobyteArray = this.a.c();
       }
    label_005f :
       return uobyteArray;
    }
    public final byte[] c(){
       byte[] uobyteArray;
       cn uocn = this;
       try{
          super.a();
          uocn.a.c(ea.a(uocn.a, dz.a(), uocn.a.a(dz.f()), uocn.a.a(dz.c()), (byte)dz.m(), uocn.a.a(dz.i()), uocn.a.a(dz.h()), uocn.a.a(cq.a(dz.g())), uocn.a.a(cq.a(dz.j())), dy.a(dz.n()), uocn.a.a(dz.l()), uocn.a.a(dz.k()), uocn.a.a(dz.d()), uocn.a.a(dz.e())));
          uobyteArray = uocn.a.c();
       }catch(java.lang.Exception e0){
          eb.a(e0);
          uobyteArray = null;
       }
       return uobyteArray;
    }
}
