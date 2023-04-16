package com.kwai.framework.location.locationupload.d;
import com.kwai.framework.location.locationupload.d$a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Double;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.google.protobuf.nano.MessageNano;
import d60.f;
import u96.a;
import wkd.b;
import r96.c;
import brd.t;
import t45.d;
import brd.z;
import cjd.e;
import erd.o;
import r96.f;
import com.kwai.framework.location.locationupload.b;
import erd.g;
import crd.b;

public class d	// class@00163e
{
    public final d$a a;
    public static final String b = "d";

    public void d(d$a p0){
       super();
       this.a = p0;
    }
    public void a(double p0,double p1,int p2,String p3,String p4){
       Object[] objArray;
       f uof;
       d a;
       String str1;
       d uod = this;
       d uod1 = d.class;
       int i = 4;
       int i1 = 1;
       int i2 = 0;
       int i3 = 5;
       if (PatchProxy.isSupport(uod1)) {
          objArray = new Object[i3];
          objArray[i2] = Double.valueOf(p0);
          objArray[i1] = Double.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = p3;
          objArray[i] = p4;
          if (PatchProxy.applyVoid(objArray, this, uod1, "4")) {
             return;
          }
       }
       if (PatchProxy.isSupport(uod1)) {
          objArray = new Object[i3];
          objArray[i2] = Double.valueOf(p0);
          objArray[i1] = Double.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = p3;
          objArray[i] = p4;
          uof = PatchProxy.apply(objArray, this, uod1, "3");
          if (uof != PatchProxyResult.class) {
          label_0079 :
             String str = a.a(uof, 2);
             a = uod.a;
             str1 = (a != null)? a.b(): null;
             b.a(0x7e473ecc).b(str, str1).subscribeOn(d.c).map(new e()).subscribe(new f(this), b.b);
             return;
          }
       }
       uof = new f();
       uof.a = p0;
       uof.b = p1;
       uof.c = p2;
       str1 = "";
       String str2 = (p3 != null)? p3: str1;
       uof.d = str2;
       if (p4 != null) {
          str1 = p4;
       }
       uof.e = str1;
       goto label_0079 ;
    }
}
