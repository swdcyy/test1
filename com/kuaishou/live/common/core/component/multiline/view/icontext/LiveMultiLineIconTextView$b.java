package com.kuaishou.live.common.core.component.multiline.view.icontext.LiveMultiLineIconTextView$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveMultiLineIconTextView$b	// class@0015c8
{
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public void LiveMultiLineIconTextView$b(int p0,int p1,int p2,int p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof LiveMultiLineIconTextView$b && (this.a == p0.a && (this.b == p0.b && (this.c == p0.c && this.d == p0.d))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, LiveMultiLineIconTextView$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveMultiLineIconTextView$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Padding\(leftPx="+this.a+", rightPx="+this.b+", topPx="+this.c+", bottomPx="+this.d+"\)";
    }
}
