package jl9.e;
import il9.a;
import android.view.animation.DecelerateInterpolator;
import il9.e;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.lang.Number;
import java.util.Random;
import il9.f;
import jl9.e$a;
import java.security.SecureRandom;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.util.cdnresource.CdnResource$a;
import android.util.SparseArray;
import jl9.b;
import jl9.d;
import jl9.d$a;

public class e extends a	// class@002b0d
{
    public final DecelerateInterpolator e;

    public void e(){
       super();
       this.e = new DecelerateInterpolator(0x3f000000);
    }
    public void b(int p0,e p1){
       d obj2;
       int i;
       e$a obj3;
       int i4;
       int i5;
       int i9;
       int i10;
       int i11;
       int i13;
       Object obj = this;
       Object obj1 = p1;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), obj1, obj, uoe, "1")) {
          return;
       }
       Objects.requireNonNull(p1);
       e uoe1 = 3;
       e uoe2 = 4;
       a uoa = 1;
       if (PatchProxy.isSupport(e.class)) {
          obj2 = PatchProxy.applyOneRefs(Integer.valueOf(p0), obj1, e.class, "5");
          if (obj2 != PatchProxyResult.class) {
             i = obj2.intValue();
             int i1 = p0;
          }else if(p0 == uoa){
             i = obj1.f.nextInt(uoe1) + uoe1;
          }else {
             i = obj1.f.nextInt(uoe2) + uoe2;
          }
       }else {
          goto label_003e ;
       }
       Object[] objArray = null;
       if (obj1.m != null) {
          obj2 = PatchProxy.apply(objArray, obj1, e.class, "6");
          if (obj2 != PatchProxyResult.class) {
             i = obj2.intValue();
          }else {
             uoe = obj1.n;
             i = uoe + obj1.f.nextInt(((obj1.o - uoe) + uoa));
          }
       }
       int i2 = i;
       i = p1.b();
       int i3 = (p1.a() - i) / i2;
       e$a uoa1 = null;
       while (uoa1 < i2) {
          e$a uoa2 = this.f();
          uoe2 = obj1.w;
          if (obj1.p != null) {
             obj3 = PatchProxy.apply(objArray, obj1, e.class, "7");
             if (obj3 != PatchProxyResult.class) {
                i4 = obj3.intValue();
             }else if(obj1.p == null){
                i4 = obj1.w;
             }else {
                uoe2 = obj1.q;
                i13 = obj1.r - uoe2;
                i5 = uoe2 + new SecureRandom().nextInt(i13);
             }
             i5 = i4;
          }
          uoe1 = PatchProxy.apply(objArray, obj1, e.class, "2");
          if (uoe1 != PatchProxyResult.class) {
          }else {
             uoe1 = obj1.l;
             if (uoe1 == null) {
                i4 = obj1.f.nextInt(obj1.y.size());
                Bitmap uBitmap = obj1.d.get(obj1.y.b(i4));
                if (uBitmap == null) {
                   uBitmap = obj1.y.a(i4);
                   obj1.d.put(obj1.y.b(i4), uBitmap);
                }
                Bitmap uBitmap1 = uBitmap;
             }
          }
          a c = obj.c;
          uoa = obj.d;
          int i6 = p1.c();
          Objects.requireNonNull(uoa2);
          int i7 = uoa1;
          uoa1 = e$a.class;
          int i8 = 2;
          if (PatchProxy.isSupport(uoa1)) {
             i9 = i2;
             Object[] objArray1 = new Object[5];
             objArray1[0] = uoe1;
             objArray1[1] = Integer.valueOf(i5);
             objArray1[i8] = Integer.valueOf(c);
             objArray1[3] = Integer.valueOf(uoa);
             objArray1[4] = Integer.valueOf(i6);
             if (PatchProxy.applyVoid(objArray1, uoa2, uoa1, "1")) {
                obj3 = 1;
             label_0187 :
                i10 = p1.e().nextInt(i3) + i;
                i5 = i + i3;
                Object[] objArray2 = null;
                obj2 = PatchProxy.apply(objArray2, obj1, e.class, "9");
                if (obj2 != PatchProxyResult.class) {
                }else {
                   obj2 = obj1.s.a();
                }
                Object obj4 = obj2;
                obj3 = uoa2;
                obj4.a(p0, i10, uoa2.j, uoa2.k, p1);
                obj3.q = obj4;
                obj.a(obj3);
                i10 = i7 + 1;
                i = i5;
                objArray = objArray2;
                i2 = i9;
                i3 = i3;
                uoa = 1;
             }
          }else {
             i9 = i2;
             int i14 = 3;
          }
          uoa2.e = uoe1;
          uoa2.n = i5;
          uoa2.o = 0;
          uoa2.i = 255;
          i4 = uoa2.c() / 2;
          uoa2.l = i4;
          Object obj5 = PatchProxy.apply(null, uoa2, uoa1, "3");
          if (obj5 != PatchProxyResult.class) {
             i11 = obj5.intValue();
          }else {
             uoa1 = uoa2.e;
             i11 = (uoa1 == null)? 0: uoa1.getHeight();
          }
          i10 = i11 / 2;
          uoa2.m = i10;
          int i12 = c - uoa2.l;
          float f = (float)i12;
          uoa2.j = f;
          i13 = uoa - i10;
          float f1 = (float)i13;
          uoa2.k = f1;
          uoa2.f = f;
          uoa2.g = f1;
          uoa2.c.d((long)i6);
          uoa2.p = true;
          goto label_0187 ;
       }
       return;
    }
    public f c(){
       e$a uoa = PatchProxy.apply(null, this, e.class, "2");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new e$a(this.e);
       }
       return uoa;
    }
}
