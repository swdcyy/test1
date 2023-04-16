package mmd.b;
import xld.a;
import mmd.b$a;
import nsd.u;
import java.util.List;
import mod.a;
import mmd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Objects;
import xld.a$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import uvc.a;
import jod.a;
import android.graphics.RectF;
import java.util.ArrayList;
import java.lang.Boolean;

public final class b extends a	// class@001d32
{
    public final boolean A;
    public final a B;
    public final boolean C;
    public final List v;
    public final boolean w;
    public final boolean x;
    public final a y;
    public final boolean z;
    public static final b$a D;

    static {
       b.D = new b$a(null);
    }
    public void b(){
       super(null, null, false, false, null, false, false, null, false, 511, null);
    }
    public void b(a p0,List p1,boolean p2,boolean p3,a p4,boolean p5,boolean p6,a p7,boolean p8){
       a.p(p0, "decorationRootState");
       a.p(p1, "elementList");
       a.p(p4, "editingTextState");
       super(p0);
       this.v = p1;
       this.w = p2;
       this.x = p3;
       this.y = p4;
       this.z = p5;
       this.A = p6;
       this.B = p7;
       this.C = p8;
    }
    public void b(a p0,List p1,boolean p2,boolean p3,a p4,boolean p5,boolean p6,a p7,boolean p8,int p9,u p10){
       a uoa;
       a uoa1;
       int i5;
       int i = p9;
       Object[] objArray = null;
       if (i & 0x01) {
          a$a u = a.u;
          Objects.requireNonNull(u);
          uoa = PatchProxy.apply(objArray, u, a$a.class, "1");
          if (uoa != PatchProxyResult.class) {
          }else {
             a uoa2 = new a(false, null, null, null, null, 0, null, null, 0, false, false, false, false, null, 0, 0, 0, null, null, false, 0xfffff, null);
          }
       }else {
          uoa = objArray;
       }
       if (i & 0x02) {
          objArray = new ArrayList();
       }
       int i1 = 0;
       int i2 = (i & 0x04)? 0: p2;
       int i3 = (i & 0x08)? 0: p3;
       if (i & 0x10) {
          uoa1 = new a(false, false, false, 0, null, false, null, null, 255, null);
       }else {
          int i6 = p4;
       }
       uoa1 = (i & 0x20)? 1: p5;
       int i4 = (i & 0x40)? 0: p6;
       if (!(i & 0x0100)) {
          i1 = p8;
       }
       super(uoa, objArray, i2, i3, v6, uoa1, i4, 0, i1);
       return;
    }
    public static b x(b p0,a p1,List p2,boolean p3,boolean p4,a p5,boolean p6,boolean p7,a p8,boolean p9,int p10,Object p11){
       b w;
       b x;
       b y;
       b z;
       b a;
       b b;
       b c;
       if (p10 & 0x01) {
          p1 = p0;
       }
       if (p10 & 0x02) {
          p2 = p0.i();
       }
       if (p10 & 0x04) {
          w = p0.w;
       }
       if (p10 & 0x08) {
          x = p0.x;
       }
       if (p10 & 0x10) {
          y = p0.y;
       }
       if (p10 & 0x20) {
          z = p0.z;
       }
       if (p10 & 0x40) {
          a = p0.A;
       }
       if (p10 & 0x0080) {
          b = p0.B;
       }
       if (p10 & 0x0100) {
          c = p0.C;
       }
       Objects.requireNonNull(p0);
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          p11 = new Object[9];
          p11[0] = p1;
          p11[1] = p2;
          p11[2] = Boolean.valueOf(w);
          p11[3] = Boolean.valueOf(x);
          p11[4] = y;
          p11[5] = Boolean.valueOf(z);
          p11[6] = Boolean.valueOf(a);
          p11[7] = b;
          p11[8] = Boolean.valueOf(c);
          p0 = PatchProxy.apply(p11, p0, uob, "1");
          if (p0 != PatchProxyResult.class) {
          label_0098 :
             return p0;
          }
       }
       a.p(p1, "decorationRootState");
       a.p(p2, "elementList");
       a.p(y, "editingTextState");
       p0 = new b(p1, p2, w, x, y, z, a, b, c);
       goto label_0098 ;
    }
    public final a A(){
       return this.B;
    }
    public final boolean B(){
       return this.w;
    }
    public a h(){
       return this.y;
    }
    public List i(){
       return this.v;
    }
    public boolean w(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = (!this.s() && this.C == null)? true: false;
       return b;
    }
    public final a y(){
       return this.y;
    }
    public final boolean z(){
       return this.A;
    }
}
