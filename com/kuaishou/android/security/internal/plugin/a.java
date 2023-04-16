package com.kuaishou.android.security.internal.plugin.a;
import com.kuaishou.android.security.internal.plugin.n;
import java.util.Map;
import java.lang.String;
import com.kuaishou.android.security.internal.plugin.n$b;
import com.kuaishou.android.security.internal.plugin.a$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Arrays;
import java.lang.Number;
import java.lang.StringBuilder;

public final class a extends n	// class@0006ee
{
    public final Map a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final byte[] f;
    public final n$b g;
    public final int h;
    public final byte[] i;
    public final String j;
    public final boolean k;
    public final String l;

    public void a(Map p0,String p1,int p2,String p3,String p4,byte[] p5,n$b p6,int p7,byte[] p8,String p9,boolean p10,String p11){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       this.i = p8;
       this.j = p9;
       this.k = p10;
       this.l = p11;
    }
    public void a(Map p0,String p1,int p2,String p3,String p4,byte[] p5,n$b p6,int p7,byte[] p8,String p9,boolean p10,String p11,a$a p12){
       super(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11);
    }
    public String a(){
       return this.b;
    }
    public String c(){
       return this.l;
    }
    public int d(){
       return this.h;
    }
    public byte[] e(){
       return this.f;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof n) {
          return false;
       }
       a ta = this.a;
       if (ta == null) {
          if (p0.h() == null) {
          label_0033 :
             if ((this.b).equals(p0.a()) && this.c == p0.j()) {
                ta = this.d;
                if (ta == null) {
                   if (p0.k() != null) {
                   label_00e2 :
                      b = false;
                   label_00e3 :
                      return b;
                   }
                }else if(ta.equals(p0.k())){
                }
                ta = this.e;
                if (ta == null) {
                   if (p0.l() != null) {
                   }
                }else if(ta.equals(p0.l())){
                }
                ta = this.f;
                a f = (v3 = p0 instanceof a)? p0.f: p0.e();
                if (Arrays.equals(ta, f)) {
                   ta = this.g;
                   if (ta == null) {
                      if (p0.g() != null) {
                      }
                   }else if(ta.equals(p0.g())){
                   }
                   if (this.h == p0.d()) {
                      ta = this.i;
                      a i = (v3)? p0.i: p0.i();
                      if (Arrays.equals(ta, i)) {
                         ta = this.j;
                         if (ta == null) {
                            if (p0.m() != null) {
                            }
                         }else if(ta.equals(p0.m())){
                         }
                         if (this.k == p0.f() && (this.l).equals(p0.c())) {
                            goto label_00e3 ;
                         }else {
                            goto label_00e2 ;
                         }
                      }else {
                         goto label_00e2 ;
                      }
                   }else {
                      goto label_00e2 ;
                   }
                }else {
                   goto label_00e2 ;
                }
             }else {
                goto label_00e2 ;
             }
          }else {
             goto label_00e2 ;
          }
       }else if(ta.equals(p0.h())){
          goto label_0033 ;
       }else {
          goto label_00e2 ;
       }
    }
    public boolean f(){
       return this.k;
    }
    public n$b g(){
       return this.g;
    }
    public Map h(){
       return this.a;
    }
    public int hashCode(){
       a obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj == null)? 0: obj.hashCode();
       i1 = (((((i1 ^ 0xf4243) * 0xf4243) ^ (this.b).hashCode()) * 0xf4243) ^ this.c) * 0xf4243;
       a td = this.d;
       int i2 = (td == null)? 0: td.hashCode();
       i1 = (i1 ^ i2) * 0xf4243;
       td = this.e;
       i2 = (td == null)? 0: td.hashCode();
       i1 = (((i1 ^ i2) * 0xf4243) ^ Arrays.hashCode(this.f)) * 0xf4243;
       td = this.g;
       i2 = (td == null)? 0: td.hashCode();
       i1 = (((((i1 ^ i2) * 0xf4243) ^ this.h) * 0xf4243) ^ Arrays.hashCode(this.i)) * 0xf4243;
       td = this.j;
       if (td != null) {
          i = td.hashCode();
       }
       i1 = (i1 ^ i) * 0xf4243;
       i = (this.k != null)? 1231: 1237;
       return (((i1 ^ i) * 0xf4243) ^ (this.l).hashCode());
    }
    public byte[] i(){
       return this.i;
    }
    public int j(){
       return this.c;
    }
    public String k(){
       return this.d;
    }
    public String l(){
       return this.e;
    }
    public String m(){
       return this.j;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SecurityGuardParamContext{paramMap="+this.a+", appKey="+this.b+", requestType="+this.c+", reserved1="+this.d+", reserved2="+this.e+", input="+Arrays.toString(this.f)+", output="+this.g+", errorCode="+this.h+", privateKey="+Arrays.toString(this.i)+", sdkId="+this.j+", isInnerInvoke="+this.k+", did="+this.l+"}";
    }
}
