package com.loc.j;
import android.content.Context;
import java.lang.Object;
import com.amap.api.location.AMapLocation;
import java.lang.String;
import com.loc.fa;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.loc.fq;
import java.lang.Throwable;
import com.loc.fj;
import com.loc.o;
import com.loc.ey;
import com.loc.fb;
import java.lang.Class;
import com.loc.aq;
import com.loc.ar;
import com.loc.p;
import java.util.List;
import org.json.JSONObject;

public final class j	// class@001447
{
    public String a;
    public fa c;
    public fa d;
    public long f;
    public boolean h;
    public Context i;
    public static fa b;
    public static ar e;
    public static long g;

    public void j(Context p0){
       super();
       this.a = null;
       this.c = null;
       this.d = null;
       this.f = 0;
       this.h = false;
       this.i = p0.getApplicationContext();
    }
    public final AMapLocation a(AMapLocation p0,String p1,long p2){
       if (p0 == null) {
          return p0;
       }
       if (!p0.getErrorCode() || (p0.getLocationType() != 1 && p0.getErrorCode() != 7)) {
          this.e();
          fa b = j.b;
          if (b == null || b.a() == null) {
             return p0;
          }else {
             boolean b1 = false;
             if (TextUtils.isEmpty(p1)) {
                long l = fq.b() - j.b.d();
                if (l >= 0 && l - p2 <= 0) {
                   b1 = 1;
                }
                p0.setTrustedLevel(3);
             }else {
                b1 = fq.a(j.b.b(), p1);
                p0.setTrustedLevel(2);
             }
             if (b1) {
                AMapLocation uAMapLocatio = j.b.a();
                uAMapLocatio.setLocationType(9);
                uAMapLocatio.setFixLastLocation(true);
                uAMapLocatio.setLocationDetail(p0.getLocationDetail());
                p0 = uAMapLocatio;
             }
          }
       }
    label_007d :
       return p0;
    }
    public final void a(){
       if (this.h != null) {
          return;
       }
       if (this.a == null) {
          this.a = ey.a("MD5", o.v(this.i));
       }
       if (j.e == null) {
          j.e = new ar(this.i, ar.a(fb.class));
       }
       this.h = true;
       return;
    }
    public final boolean a(AMapLocation p0,String p1){
       if (this.i != null && (p0 == null || (!fq.a(p0) || (p0.getLocationType() == 2 || (!p0.isMock() && !p0.isFixLastLocation()))))) {
          fa uofa = new fa();
          uofa.a(p0);
          if (p0.getLocationType() == 1) {
             uofa.a(null);
          }else {
             uofa.a(p1);
          }
          j.b = uofa;
          j.g = fq.b();
          this.c = uofa;
          j td = this.d;
          if (td != null && fq.a(td.a(), uofa.a()) - 0x43fa0000 <= 0) {
             return false;
          }else if((fq.b() - this.f) - 0x7530 > 0){
             return true;
          }
       }
    label_0070 :
       return false;
    }
    public final AMapLocation b(){
       this.e();
       fa b = j.b;
       if (b == null) {
          return null;
       }
       if (!fq.a(b.a())) {
          return null;
       }
       return j.b.a();
    }
    public final void c(){
       this.d();
       this.f = 0;
       this.h = false;
       this.c = null;
       this.d = null;
    }
    public final void d(){
       String str = "UTF-8";
       this.a();
       j tc = this.c;
       if (tc != null && (fq.a(tc.a()) && j.e != null)) {
          tc = this.c;
          if (tc != this.d && !tc.d() - null) {
             String str1 = this.c.a().toStr();
             String str2 = this.c.b();
             this.d = this.c;
             String str3 = null;
             if (!TextUtils.isEmpty(str1)) {
                str1 = p.b(ey.a(str1.getBytes(str), this.a));
                if (!TextUtils.isEmpty(str2)) {
                   str3 = p.b(ey.a(str2.getBytes(str), this.a));
                }
                str = str3;
                str3 = str1;
             }else {
                str = str3;
             }
             if (!TextUtils.isEmpty(str3)) {
                fa uofa = new fa();
                uofa.b(str3);
                uofa.a(fq.b());
                uofa.a(str);
                j.e.a(uofa, "_id=1");
                this.f = fq.b();
                fa b = j.b;
                if (b != null) {
                   b.a(fq.b());
                }
             }
          }
       }
    label_009a :
       return;
    }
    public final void e(){
       if (j.b == null || (fq.b() - j.g) - 0x2bf20 > 0) {
          fa uofa = this.f();
          j.g = fq.b();
          if (uofa != null && fq.a(uofa.a())) {
             j.b = uofa;
          }
       }
       return;
    }
    public final fa f(){
       fa uofa1;
       String str1;
       fa uofa = null;
       if (this.i == null) {
          return uofa;
       }
       this.a();
       ar e = j.e;
       if (e == null) {
          return uofa;
       }
       List list = e.a("_id=1", fa.class);
       if (list != null && list.size() > 0) {
          uofa1 = list.get(0);
          byte[] uobyteArray = p.b(uofa1.c());
          String str = "UTF-8";
          if (uobyteArray != null && uobyteArray.length > 0) {
             uobyteArray = ey.b(uobyteArray, this.a);
             if (uobyteArray != null && uobyteArray.length > 0) {
                str1 = new String(uobyteArray, str);
             label_0046 :
                uobyteArray = p.b(uofa1.b());
                if (uobyteArray != null && uobyteArray.length > 0) {
                   uobyteArray = ey.b(uobyteArray, this.a);
                   if (uobyteArray != null && uobyteArray.length > 0) {
                      uofa = new String(uobyteArray, str);
                   }
                }
                uofa1.a(uofa);
                uofa = str1;
             }
          }
          str1 = uofa;
          goto label_0046 ;
       }else {
          uofa1 = uofa;
       }
       if (!TextUtils.isEmpty(uofa)) {
          AMapLocation uAMapLocatio = new AMapLocation("");
          fj.a(uAMapLocatio, new JSONObject(uofa));
          if (fq.b(uAMapLocatio)) {
             uofa1.a(uAMapLocatio);
          }
       }
       return uofa1;
    }
}
