package com.yxcorp.gifshow.widget.banner.KwaiBannerView$b;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.util.Arrays;
import java.lang.StringBuilder;

public final class KwaiBannerView$b	// class@00193e
{
    public String a;
    public String b;
    public String c;
    public CDNUrl[] d;
    public String e;

    public void KwaiBannerView$b(){
       super(null, null, null, null, null, 31, null);
    }
    public void KwaiBannerView$b(String p0,String p1,String p2,CDNUrl[] p3){
       super(null, p1, p2, p3, null);
    }
    public void KwaiBannerView$b(String p0,String p1,String p2,CDNUrl[] p3,String p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public void KwaiBannerView$b(String p0,String p1,String p2,CDNUrl[] p3,String p4,int p5,u p6){
       String str = (p5 & 0x01)? null: p0;
       String str1 = (p5 & 0x02)? null: p1;
       String str2 = (p5 & 0x04)? null: p2;
       CDNUrl[] uCDNUrlArray = (p5 & 0x08)? null: p3;
       super(str, str1, str2, uCDNUrlArray, null);
       return;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiBannerView$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof KwaiBannerView$b && (a.g(this.a, p0.a) && (a.g(this.b, p0.b) && (a.g(this.c, p0.c) && (a.g(this.d, p0.d) && a.g(this.e, p0.e))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       KwaiBannerView$b obj = PatchProxy.apply(null, this, KwaiBannerView$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       KwaiBannerView$b tb = this.b;
       int i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.c;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.d;
       i2 = (tb != null)? Arrays.hashCode(tb): 0;
       i1 = (i1 + i2) * 31;
       tb = this.e;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KwaiBannerView$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "BannerModel\(imageUrl="+this.a+", actionLink="+this.b+", trackID="+this.c+", imageUrls="+Arrays.toString(this.d)+", itemName="+this.e+"\)";
    }
}
