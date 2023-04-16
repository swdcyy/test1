package com.kuaishou.live.common.core.component.multiline.view.icontext.LiveMultiLineIconTextView$a;
import com.kuaishou.live.common.core.component.multiline.view.icontext.LiveMultiLineIconTextView$b;
import android.util.Size;
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

public final class LiveMultiLineIconTextView$a	// class@0015c7
{
    public final int a;
    public final LiveMultiLineIconTextView$b b;
    public final int c;
    public final Size d;
    public final int e;
    public final int f;
    public final int g;

    public void LiveMultiLineIconTextView$a(int p0,LiveMultiLineIconTextView$b p1,int p2,Size p3,int p4,int p5,int p6){
       a.p(p1, "padding");
       a.p(p3, "iconSizePx");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
    }
    public void LiveMultiLineIconTextView$a(int p0,LiveMultiLineIconTextView$b p1,int p2,Size p3,int p4,int p5,int p6,int p7,u p8){
       int i = (p7 & 0x40)? 0: p6;
       super(p0, p1, p2, p3, p4, p5, i);
       return;
    }
    public final Size a(){
       return this.d;
    }
    public final int b(){
       return this.c;
    }
    public final LiveMultiLineIconTextView$b c(){
       return this.b;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMultiLineIconTextView$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveMultiLineIconTextView$a && (this.a == p0.a && (a.g(this.b, p0.b) && (this.c == p0.c && (a.g(this.d, p0.d) && (this.e == p0.e && (this.f == p0.f && this.g == p0.g)))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, LiveMultiLineIconTextView$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.a * 31;
       LiveMultiLineIconTextView$a tb = this.b;
       int i1 = 0;
       int i2 = (tb != null)? tb.hashCode(): 0;
       i = (((i + i2) * 31) + this.c) * 31;
       tb = this.d;
       if (tb != null) {
          i1 = tb.hashCode();
       }
       return (((((((i + i1) * 31) + this.e) * 31) + this.f) * 31) + this.g);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveMultiLineIconTextView$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LayoutConfig\(tagHeightPx="+this.a+", padding="+this.b+", iconTextMarginPx="+this.c+", iconSizePx="+this.d+", textInIconSizePx="+this.e+", textSizePx="+this.f+", minWidth="+this.g+"\)";
    }
}
