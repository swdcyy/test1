package com.kwai.slide.play.detail.information.caption.l$c;
import android.text.SpannableStringBuilder;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class l$c	// class@0017e2
{
    public final SpannableStringBuilder a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public void l$c(SpannableStringBuilder p0,boolean p1,boolean p2,boolean p3){
       a.p(p0, "contentText");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public void l$c(SpannableStringBuilder p0,boolean p1,boolean p2,boolean p3,int p4,u p5){
       if (p4 & 0x04) {
          p2 = false;
       }
       if (p4 & 0x08) {
          p3 = false;
       }
       super(p0, p1, p2, p3);
       return;
    }
    public final SpannableStringBuilder a(){
       return this.a;
    }
    public final boolean b(){
       return this.b;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l$c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof l$c && (a.g(this.a, p0.a) && (this.b == p0.b && (this.c == p0.c && this.d == p0.d))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       int i2;
       l$c obj = PatchProxy.apply(null, this, l$c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = (obj != null)? obj.hashCode(): 0;
       i = i * 31;
       l$c tb = this.b;
       int i1 = 1;
       if (tb != null) {
          tb = 1;
       }
       i = (i + tb) * 31;
       tb = this.c;
       if (tb != null) {
          i2 = 1;
       }
       i = (i + i2) * 31;
       tb = this.d;
       if (tb == null) {
          i1 = tb;
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, l$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CaptionTextModel\(contentText="+this.a+", isOpenContent="+this.b+", hasAdTag="+this.c+", hasTailContent="+this.d+"\)";
    }
}
