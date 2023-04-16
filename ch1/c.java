package ch1.c;
import com.yxcorp.gifshow.models.Gift;
import ch1.f;
import ch1.b;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class c	// class@0004b6
{
    public final int a;
    public final int b;
    public final Gift c;
    public final int d;
    public final f e;
    public final b f;
    public final GiftPanelItem g;
    public final String h;
    public final String i;

    public void c(int p0,int p1,Gift p2,int p3,f p4,b p5,GiftPanelItem p6,String p7,String p8){
       a.p(p4, "ui");
       a.p(p5, "action");
       a.p(p6, "origin");
       a.p(p7, "giftToken");
       a.p(p8, "recoGiftLlsid");
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
    }
    public final b a(){
       return this.f;
    }
    public final Gift b(){
       return this.c;
    }
    public final String c(){
       return this.h;
    }
    public final int d(){
       return this.a;
    }
    public final String e(){
       return this.i;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof c && (this.a == p0.a && (this.b == p0.b && (a.g(this.c, p0.c) && (this.d == p0.d && (a.g(this.e, p0.e) && (a.g(this.f, p0.f) && (a.g(this.g, p0.g) && (a.g(this.h, p0.h) && a.g(this.i, p0.i))))))))))) {
          return true;
       }
       return false;
    }
    public final int f(){
       return this.b;
    }
    public final f g(){
       return this.e;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = ((this.a * 31) + this.b) * 31;
       c tc = this.c;
       int i1 = 0;
       int i2 = (tc != null)? tc.hashCode(): 0;
       i = (((i + i2) * 31) + this.d) * 31;
       tc = this.e;
       i2 = (tc != null)? tc.hashCode(): 0;
       i = (i + i2) * 31;
       tc = this.f;
       i2 = (tc != null)? tc.hashCode(): 0;
       i = (i + i2) * 31;
       tc = this.g;
       i2 = (tc != null)? tc.hashCode(): 0;
       i = (i + i2) * 31;
       tc = this.h;
       i2 = (tc != null)? tc.hashCode(): 0;
       i = (i + i2) * 31;
       tc = this.i;
       if (tc != null) {
          i1 = tc.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object[] objArray = null;
       StringBuilder obj = PatchProxy.apply(objArray, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "GiftPanelItemInfo{";
       c tc = this.c;
       if (tc != null) {
          objArray = tc.mName;
       }
       return obj+objArray+','+this.d+'}';
    }
}
