package lj1.b;
import com.yxcorp.gifshow.models.Gift;
import java.lang.String;
import lj1.c;
import lj1.a;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import java.util.Map;
import jj1.a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import mm1.c;
import java.lang.StringBuilder;

public final class b	// class@002f7d
{
    public final Gift a;
    public final int b;
    public final String c;
    public final boolean d;
    public final String e;
    public final c f;
    public final String g;
    public final boolean h;
    public final a i;
    public final String j;
    public LiveSendGiftBaseTraceInfo k;
    public final int l;
    public final int m;
    public Map n;
    public final int o;
    public final a p;

    public void b(Gift p0,int p1,String p2,boolean p3,String p4,c p5,String p6,boolean p7,a p8,String p9,LiveSendGiftBaseTraceInfo p10,int p11,int p12,Map p13,int p14,a p15){
       int i = this;
       Object obj = p9;
       a.p(p0, "gift");
       a.p(p2, "giftToken");
       a.p(p4, "llsid");
       a.p(p5, "liveGiftReceiver");
       a.p(obj, "rechargeSource");
       super();
       i.a = p0;
       i.b = p1;
       i.c = p2;
       i.d = p3;
       i.e = p4;
       i.f = p5;
       i.g = p6;
       i.h = p7;
       i.i = p8;
       i.j = obj;
       i.k = p10;
       i.l = p11;
       i.m = p12;
       i.n = p13;
       i.o = p14;
       i.p = p15;
    }
    public void b(Gift p0,int p1,String p2,boolean p3,String p4,c p5,String p6,boolean p7,a p8,String p9,LiveSendGiftBaseTraceInfo p10,int p11,int p12,Map p13,int p14,a p15,int p16,u p17){
       int i = p16;
       String str = (i & 0x40)? null: p6;
       boolean b = (i & 0x0080)? false: p7;
       a uoa = (i & 0x0100)? null: p8;
       LiveSendGiftBaseTraceInfo liveSendGift = (i & 0x0400)? null: p10;
       Map map = (i & 0x2000)? null: p13;
       a uoa1 = (i & 0x8000)? null: p15;
       super(p0, p1, p2, p3, p4, p5, str, b, uoa, p9, liveSendGift, p11, p12, map, p14, uoa1);
       return;
    }
    public final int a(){
       return this.b;
    }
    public final boolean b(){
       return this.h;
    }
    public final Map c(){
       return this.n;
    }
    public final Gift d(){
       return this.a;
    }
    public final int e(){
       return this.m;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof b && (a.g(this.a, p0.a) && (this.b == p0.b && (a.g(this.c, p0.c) && (this.d == p0.d && (a.g(this.e, p0.e) && (a.g(this.f, p0.f) && (a.g(this.g, p0.g) && (this.h == p0.h && (a.g(this.i, p0.i) && (a.g(this.j, p0.j) && (a.g(this.k, p0.k) && (this.l == p0.l && (this.m == p0.m && (a.g(this.n, p0.n) && (this.o == p0.o && a.g(this.p, p0.p)))))))))))))))))) {
          return true;
       }
       return false;
    }
    public final int f(){
       return this.l;
    }
    public final String g(){
       return this.g;
    }
    public final String h(){
       return this.c;
    }
    public int hashCode(){
       b obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = ((i1 * 31) + this.b) * 31;
       b tc = this.c;
       int i2 = (tc != null)? tc.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tc = this.d;
       int i3 = 1;
       if (tc != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tc = this.e;
       i2 = (tc != null)? tc.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tc = this.f;
       i2 = (tc != null)? tc.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tc = this.g;
       i2 = (tc != null)? tc.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tc = this.h;
       if (tc == null) {
          i3 = tc;
       }
       i1 = (i1 + i3) * 31;
       tc = this.i;
       i2 = (tc != null)? tc.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tc = this.j;
       i2 = (tc != null)? tc.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tc = this.k;
       i2 = (tc != null)? tc.hashCode(): 0;
       i1 = (((((i1 + i2) * 31) + this.l) * 31) + this.m) * 31;
       tc = this.n;
       i2 = (tc != null)? tc.hashCode(): 0;
       i1 = (((i1 + i2) * 31) + this.o) * 31;
       tc = this.p;
       if (tc != null) {
          i = tc.hashCode();
       }
       return (i1 + i);
    }
    public final c i(){
       return this.f;
    }
    public final int j(){
       return this.o;
    }
    public final String k(){
       return this.e;
    }
    public final LiveSendGiftBaseTraceInfo l(){
       return this.k;
    }
    public final boolean m(){
       return this.d;
    }
    public final void n(Map p0){
       this.n = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveGiftSendParams\(gift="+this.a+", batchCount="+this.b+", giftToken="+this.c+", isComboSend="+this.d+", llsid="+this.e+", liveGiftReceiver="+this.f+", giftTabId="+this.g+", canShowConfirmDialog="+this.h+", confirmDialogConfig="+this.i+", rechargeSource="+this.j+", traceInfo="+this.k+", giftEntryType="+this.l+", giftBoxSourceType="+this.m+", extraInfo="+this.n+", liveModel="+this.o+", sendGiftResultCallback="+this.p+"\)";
    }
}
