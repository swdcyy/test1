package com.kwai.slide.play.detail.information.caption.k$b;
import android.text.SpannableStringBuilder;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Number;
import java.lang.StringBuilder;

public final class k$b	// class@0017de
{
    public final SpannableStringBuilder a;
    public final boolean b;
    public final int c;
    public final int d;
    public float e;

    public void k$b(SpannableStringBuilder p0,boolean p1,int p2,int p3,float p4){
       a.p(p0, "openContent");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public final int a(){
       return this.d;
    }
    public final SpannableStringBuilder b(){
       return this.a;
    }
    public final int c(){
       return this.c;
    }
    public final float d(){
       return this.e;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof k$b && (a.g(this.a, p0.a) && (this.b == p0.b && (this.c == p0.c && (this.d == p0.d && !Float.compare(this.e, p0.e))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       k$b obj = PatchProxy.apply(null, this, k$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = (obj != null)? obj.hashCode(): 0;
       i = i * 31;
       k$b tb = this.b;
       if (tb != null) {
          tb = 1;
       }
       return (((((((i + tb) * 31) + this.c) * 31) + this.d) * 31) + Float.floatToIntBits(this.e));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, k$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CaptionModel\(openContent="+this.a+", isOpenContent="+this.b+", startIndex="+this.c+", endIndex="+this.d+", textSize="+this.e+"\)";
    }
}
