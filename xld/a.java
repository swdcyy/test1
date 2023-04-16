package xld.a;
import uvc.c;
import xld.a$a;
import nsd.u;
import java.util.List;
import java.util.Map;
import uvc.a;
import jod.a;
import android.graphics.RectF;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import com.yxcorp.gifshow.v3.framework.player.UpdateTo;
import trd.t0;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Double;
import com.kwai.robust.PatchProxyResult;
import mod.a;

public class a extends c	// class@0029a0
{
    public final boolean a;
    public final List b;
    public final List c;
    public final Map d;
    public final Map e;
    public final int f;
    public final a g;
    public final a h;
    public final double i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final Map n;
    public final double o;
    public final double p;
    public final int q;
    public final RectF r;
    public final List s;
    public final boolean t;
    public static final a$a u;

    static {
       a.u = new a$a(null);
    }
    public void a(){
       super(false, null, null, null, null, 0, null, null, 0, false, false, false, false, null, 0, 0, 0, null, null, false, 0xfffff, null);
    }
    public void a(a p0){
       Object obj = p0;
       a.p(obj, "decorationRootState");
       super(obj.a, obj.b, obj.c, obj.d, obj.e, obj.f, p0.a(), obj.h, obj.i, obj.j, obj.k, obj.l, obj.m, obj.n, obj.o, obj.p, obj.q, obj.r, null, obj.t, 0x40000, null);
    }
    public void a(boolean p0,List p1,List p2,Map p3,Map p4,int p5,a p6,a p7,double p8,boolean p9,boolean p10,boolean p11,boolean p12,Map p13,double p14,double p15,int p16,RectF p17,List p18,boolean p19,int p20,u p21){
       int i10;
       ArrayList uArrayList2;
       int i = this;
       int i1 = p20;
       boolean b = (i1 & 0x01)? false: p0;
       ArrayList uArrayList = (i1 & 0x02)? new ArrayList(): p1;
       ArrayList uArrayList1 = (i1 & 0x04)? new ArrayList(): p2;
       LinkedHashMap linkedHashMa = (i1 & 0x08)? new LinkedHashMap(): p3;
       LinkedHashMap linkedHashMa1 = (i1 & 0x10)? new LinkedHashMap(): p4;
       int i2 = (i1 & 0x20)? -1: p5;
       if (i1 & 0x40) {
          a uoa = new a(0, 0, 0, 7, 0);
       }else {
          a uoa2 = p6;
       }
       List list = null;
       a uoa1 = (i1 & 0x0080)? new a(list, 1, list): p7;
       double d = (i1 & 0x0100)? 0: p8;
       boolean b1 = (i1 & 0x0200)? true: p9;
       boolean b2 = (i1 & 0x0400)? true: p10;
       int i3 = (i1 & 0x0800)? 1: p11;
       int i4 = (i1 & 0x1000)? 0: p12;
       int i5 = i4;
       Map map = (i1 & 0x2000)? t0.z(): p13;
       int i6 = i3;
       int i7 = (i1 & 0x4000)? 0: p14;
       int i8 = (0x8000 & i1)? 0: p15;
       i3 = (0x10000 & i1)? -1: p16;
       int i9 = (i1 & 0x20000)? 0: p17;
       if (i1 & 0x40000) {
          i10 = i3;
          uArrayList2 = new ArrayList();
       }else {
          i10 = i3;
          uArrayList2 = null;
       }
       int i11 = (i1 & 0x80000)? 0: p19;
       a.p(uArrayList, "assetIdentifyList");
       a.p(uArrayList1, "longPictureAssetIdentifyList");
       a.p(linkedHashMa, "assetSegmentToAssetIdentifyMap");
       a.p(linkedHashMa1, "assetToFirstAssetSegmentIdentifyMap");
       a.p(v10, "playerState");
       a.p(uoa1, "timelineData");
       a.p(map, "photoMovieMusicVolumeMap");
       a.p(uArrayList2, "elementList");
       super();
       i.a = b;
       i.b = uArrayList;
       i.c = uArrayList1;
       i.d = linkedHashMa;
       i.e = linkedHashMa1;
       i.f = i2;
       i.g = v10;
       i.h = uoa1;
       i.i = d;
       i.j = b1;
       i.k = b2;
       i.l = i6;
       i.m = i5;
       i.n = map;
       i.o = i7;
       i.p = i8;
       i.q = i10;
       i.r = i9;
       i.s = uArrayList2;
       i.t = i11;
       return;
    }
    public static a b(a p0,boolean p1,List p2,List p3,Map p4,Map p5,int p6,a p7,a p8,double p9,boolean p10,boolean p11,boolean p12,boolean p13,Map p14,double p15,double p16,int p17,RectF p18,boolean p19,int p20,Object p21){
       a uoa14;
       a uoa15;
       a uoa = p0;
       int i = p20;
       a uoa1 = (i & 0x01)? uoa.a: p1;
       a uoa2 = (i & 0x02)? uoa.b: p2;
       a uoa3 = (i & 0x04)? uoa.c: p3;
       a uoa4 = (i & 0x08)? uoa.d: p4;
       a uoa5 = (i & 0x10)? uoa.e: p5;
       a uoa6 = (i & 0x20)? uoa.f: p6;
       a uoa7 = (i & 0x40)? p0.a(): p7;
       a uoa8 = (i & 0x0080)? uoa.h: p8;
       a uoa9 = (i & 0x0100)? uoa.i: p9;
       a uoa10 = (i & 0x0200)? uoa.j: p10;
       a uoa11 = (i & 0x0400)? uoa.k: p11;
       a uoa12 = (i & 0x0800)? uoa.l: p12;
       a uoa13 = (i & 0x1000)? uoa.m: p13;
       a n = (i & 0x2000)? uoa.n: p14;
       if (i & 0x4000) {
          uoa14 = n;
          uoa15 = uoa.o;
       }else {
          uoa14 = n;
          uoa15 = p15;
       }
       a uoa16 = (0x8000 & i)? uoa.p: p16;
       a uoa17 = (0x10000 & i)? uoa.q: p17;
       a uoa18 = (0x20000 & i)? uoa.r: p18;
       a uoa19 = (i & 0x40000)? uoa.t: p19;
       Objects.requireNonNull(p0);
       a uoa20 = a.class;
       if (PatchProxy.isSupport(uoa20)) {
          Object[] objArray = new Object[19];
          objArray[0] = Boolean.valueOf(uoa1);
          objArray[1] = uoa2;
          objArray[2] = uoa3;
          objArray[3] = uoa4;
          objArray[4] = uoa5;
          objArray[5] = Integer.valueOf(uoa6);
          objArray[6] = uoa7;
          objArray[7] = uoa8;
          objArray[8] = Double.valueOf(uoa9);
          objArray[9] = Boolean.valueOf(uoa10);
          objArray[10] = Boolean.valueOf(uoa11);
          objArray[11] = Boolean.valueOf(uoa12);
          objArray[12] = Boolean.valueOf(uoa13);
          objArray[13] = uoa14;
          objArray[14] = Double.valueOf(uoa15);
          objArray[15] = Double.valueOf(uoa16);
          objArray[16] = Integer.valueOf(uoa17);
          objArray[17] = uoa18;
          objArray[18] = Boolean.valueOf(uoa19);
          uoa = PatchProxy.apply(objArray, uoa, uoa20, "1");
          if (uoa != PatchProxyResult.class) {
          label_0192 :
             return uoa;
          }
       }
       a.p(uoa2, "assetIdentifyList");
       a.p(uoa3, "longPictureAssetIdentifyList");
       a.p(uoa4, "assetSegmentToAssetIdentifyMap");
       a.p(uoa5, "assetToFirstAssetSegmentIdentifyMap");
       a.p(uoa7, "playerState");
       a.p(uoa8, "timelineData");
       n = uoa14;
       a.p(n, "photoMovieMusicVolumeMap");
       a uoa21 = new a(uoa1, uoa2, uoa3, uoa4, uoa5, uoa6, uoa7, uoa8, uoa9, uoa10, uoa11, uoa12, uoa13, n, uoa15, uoa16, uoa17, uoa18, null, uoa19, 0x40000, null);
       goto label_0192 ;
    }
    public a a(){
       return this.g;
    }
    public final List c(){
       return this.b;
    }
    public final Map d(){
       return this.d;
    }
    public final Map e(){
       return this.e;
    }
    public final RectF f(){
       return this.r;
    }
    public final int g(){
       return this.q;
    }
    public a h(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a uoa = new a(false, false, false, 0, null, false, null, null, 255, null);
       return obj;
    }
    public List i(){
       return this.s;
    }
    public final List j(){
       return this.c;
    }
    public final double k(){
       return this.o;
    }
    public final Map l(){
       return this.n;
    }
    public final double m(){
       return this.p;
    }
    public final double n(){
       return this.i;
    }
    public final int o(){
       return this.f;
    }
    public final boolean p(){
       return this.k;
    }
    public final boolean q(){
       return this.l;
    }
    public final a r(){
       return this.h;
    }
    public final boolean s(){
       return this.a;
    }
    public final boolean t(){
       return this.m;
    }
    public final boolean u(){
       return this.t;
    }
    public final boolean v(){
       return this.j;
    }
    public boolean w(){
       return (this.a ^ 0x01);
    }
}
