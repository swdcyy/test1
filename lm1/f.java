package lm1.f;
import lm1.f$a;
import nsd.u;
import com.kwai.framework.model.user.UserInfo;
import com.yxcorp.gifshow.models.Gift;
import java.lang.String;
import lm1.e;
import java.lang.Object;
import ht5.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class f	// class@002fa2
{
    public UserInfo a;
    public Gift b;
    public String c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public final int h;
    public boolean i;
    public int j;
    public String k;
    public e l;
    public static final f$a m;

    static {
       f.m = new f$a(null);
    }
    public void f(UserInfo p0,Gift p1,String p2,boolean p3,boolean p4,boolean p5,int p6,int p7,boolean p8,int p9,String p10,e p11){
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
    public static final f a(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return f.m.a(p0);
    }
    public final int b(){
       return this.h;
    }
    public final Gift c(){
       return this.b;
    }
    public final int d(){
       return this.j;
    }
    public final String e(){
       return this.k;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof f && (a.g(this.a, p0.a) && (a.g(this.b, p0.b) && (a.g(this.c, p0.c) && (this.d == p0.d && (this.e == p0.e && (this.f == p0.f && (this.g == p0.g && (this.h == p0.h && (this.i == p0.i && (this.j == p0.j && (a.g(this.k, p0.k) && a.g(this.l, p0.l)))))))))))))) {
          return true;
       }
       return false;
    }
    public final String f(){
       return this.c;
    }
    public final e g(){
       return this.l;
    }
    public final UserInfo h(){
       return this.a;
    }
    public int hashCode(){
       f obj = PatchProxy.apply(null, this, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       f tb = this.b;
       int i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.c;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.d;
       int i3 = 1;
       if (tb != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tb = this.e;
       if (tb != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tb = this.f;
       if (tb != null) {
          i2 = 1;
       }
       i1 = (((((i1 + i2) * 31) + this.g) * 31) + this.h) * 31;
       tb = this.i;
       if (tb == null) {
          i3 = tb;
       }
       i1 = (((i1 + i3) * 31) + this.j) * 31;
       tb = this.k;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.l;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public final int i(){
       return this.g;
    }
    public final void j(boolean p0){
       this.f = p0;
    }
    public final void k(boolean p0){
       this.d = p0;
    }
    public final void l(Gift p0){
       this.b = p0;
    }
    public final void m(int p0){
       this.j = p0;
    }
    public final void n(String p0){
       this.k = p0;
    }
    public final void o(String p0){
       this.c = p0;
    }
    public final void p(boolean p0){
       this.e = p0;
    }
    public final void q(UserInfo p0){
       this.a = p0;
    }
    public final void r(int p0){
       this.g = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "GiftSendParams\(receiver="+this.a+", gift="+this.b+", giftToken="+this.c+", isComboSend="+this.d+", isPacketGift="+this.e+", isAnchor="+this.f+", sourceType="+this.g+", entryType="+this.h+", isSendDrawingGift="+this.i+", giftCount="+this.j+", giftLlsid="+this.k+", panelInfo="+this.l+"\)";
    }
}
