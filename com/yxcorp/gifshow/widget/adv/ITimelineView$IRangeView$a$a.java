package com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$a$a;
import java.lang.Cloneable;
import java.lang.String;
import android.graphics.Color;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class ITimelineView$IRangeView$a$a implements Cloneable	// class@001903
{
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public String g;
    public static final int h;

    static {
       ITimelineView$IRangeView$a$a.h = Color.parseColor("#00000000");
    }
    public void ITimelineView$IRangeView$a$a(int p0,int p1,int p2,int p3,int p4){
       super();
       int h = ITimelineView$IRangeView$a$a.h;
       this.b = h;
       this.c = h;
       this.d = h;
       this.e = h;
       this.f = 0;
       this.g = "";
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public ITimelineView$IRangeView$a$a a(){
       Object obj = PatchProxy.apply(null, this, ITimelineView$IRangeView$a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ITimelineView$IRangeView$a$a iRangeView$a = new ITimelineView$IRangeView$a$a(this.b, this.c, this.d, this.e, this.f);
       return obj;
    }
    public boolean b(ITimelineView$IRangeView$a$a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ITimelineView$IRangeView$a$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (this.b == p0.b && (this.c == p0.c && (this.d == p0.d && (this.e == p0.e && (this.f == p0.f && (this.g).equals(p0.g)))))) {
          b = true;
       }
    label_0040 :
       return b;
    }
    public Object clone(){
       return this.a();
    }
    public String toString(){
       return this.g;
    }
}
