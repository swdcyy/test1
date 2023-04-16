package jn9.d;
import mn9.b;
import java.lang.String;
import java.util.List;
import nsd.u;
import java.util.ArrayList;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class d	// class@002b1a
{
    public final b a;
    public final int b;
    public final String c;
    public final boolean d;
    public final List e;
    public final List f;
    public final boolean g;

    public void d(b p0){
       super(p0, 0, null, false, null, null, false, 126, null);
    }
    public void d(b p0,int p1,String p2,boolean p3,List p4,List p5,boolean p6,int p7,u p8){
       ArrayList uArrayList;
       if (p7 & 0x02) {
          p1 = -1;
       }
       if (p7 & 0x04) {
          p2 = "";
       }
       if (p7 & 0x08) {
          p3 = false;
       }
       if (p7 & 0x10) {
          uArrayList = new ArrayList();
       }
       ArrayList uArrayList1 = (p7 & 0x20)? new ArrayList(): null;
       if (p7 & 0x40) {
          p6 = true;
       }
       a.p(p0, "mDataProvider");
       a.p(p2, "mDefaultSelectionId");
       a.p(uArrayList, "mHeaderInsertItems");
       a.p(uArrayList1, "mTailInsertItems");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = uArrayList;
       this.f = uArrayList1;
       this.g = p6;
       return;
    }
    public final boolean a(){
       return this.g;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof d && (a.g(this.a, p0.a) && (this.b == p0.b && (a.g(this.c, p0.c) && (this.d == p0.d && (a.g(this.e, p0.e) && (a.g(this.f, p0.f) && this.g == p0.g)))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       d obj = PatchProxy.apply(null, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = ((i1 * 31) + this.b) * 31;
       d tc = this.c;
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
       if (tc != null) {
          i = tc.hashCode();
       }
       i1 = (i1 + i) * 31;
       d tg = this.g;
       if (tg == null) {
          i3 = tg;
       }
       return (i1 + i3);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PostListDataConfig\(mDataProvider="+this.a+", mDefaultSelection="+this.b+", mDefaultSelectionId="+this.c+", mDefaultJustSelect="+this.d+", mHeaderInsertItems="+this.e+", mTailInsertItems="+this.f+", mShouldAutoFilterDuplicatedItem="+this.g+"\)";
    }
}
