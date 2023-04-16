package f83.b$b;
import vb3.o;
import f83.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import vb3.o$a;
import java.lang.Integer;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Objects;
import msd.a;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import java.lang.Number;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import fe3.e;
import fe3.d;
import kotlin.jvm.internal.a;
import fe3.g;
import java.lang.Math;

public final class b$b implements o	// class@0028ec
{
    public final b a;

    public void b$b(b p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, b$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return false;
    }
    public final o$a b(int p0,int p1,int p2,int p3,int p4,boolean p5,boolean p6){
       LiveCommonLogTag obj1;
       Object obj2;
       o$a uoa;
       int i10;
       e uoe;
       d uod;
       String str2;
       Integer obj4;
       Object[] objArray2;
       Object obj5;
       o$a obj = this;
       int i = p0;
       int i1 = p1;
       int i2 = p2;
       int i3 = p3;
       int i4 = p4;
       boolean b = p5;
       int b1 = p6;
       b$b uob = b$b.class;
       int i5 = 7;
       int i6 = 3;
       int i7 = 4;
       int i8 = 5;
       int i9 = 0;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[i5];
          objArray[i9] = Integer.valueOf(p0);
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[i6] = Integer.valueOf(p3);
          objArray[i7] = Integer.valueOf(p4);
          objArray[i8] = Boolean.valueOf(p5);
          objArray[6] = Boolean.valueOf(p6);
          obj1 = PatchProxy.apply(objArray, obj, uob, "1");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       obj1 = LiveCommonLogTag.LITE_NEW_MULTI_CHAT;
       String str = ", ";
       b.Z(obj1, "start calculate offset "+"cWidth:"+i+", cHeight:"+i1+", vWidth:"+i2+str+"vHeight:"+i3+", bottomInvisible:"+i4+", isX:"+b+str+"centerInside:"+b1);
       b$b a = obj.a;
       Objects.requireNonNull(a);
       if (PatchProxy.isSupport(b.class)) {
          Object[] objArray1 = new Object[i5];
          objArray1[i9] = Integer.valueOf(p0);
          objArray1[1] = Integer.valueOf(p1);
          objArray1[2] = Integer.valueOf(p2);
          objArray1[i6] = Integer.valueOf(p3);
          objArray1[4] = Integer.valueOf(p4);
          objArray1[5] = Boolean.valueOf(p5);
          objArray1[6] = Boolean.valueOf(p6);
          obj2 = PatchProxy.apply(objArray1, a, b.class, "4");
          if (obj2 != PatchProxyResult.class) {
          }else {
          label_00fa :
             float f = (float)i1;
             float f1 = (float)i;
             float f2 = f / f1;
             float f3 = (float)i3;
             float f4 = (float)i2;
             float f5 = f3 / f4;
             String str1 = str;
             b.Z(obj1, "isFitX "+b+"£¬containerRatio:"+f2+", videoRatio:"+f5);
             if (b1) {
                if (PatchProxy.isSupport(b.class)) {
                   uoa = PatchProxy.applyFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), a, b.class, "5");
                   if (uoa != PatchProxyResult.class) {
                   label_014e :
                      obj2 = uoa;
                   }
                }
                f4 = f4 / f3;
                i10 = (f4 - (f1 / f) < 0)? (int)(f4 * f): i;
                LayoutConfig layoutConfig = a.n.invoke();
                b m = a.m;
                if (PatchProxy.isSupport(b.class)) {
                   e obj3 = PatchProxy.applyFourRefs(layoutConfig, Integer.valueOf(p2), m, Integer.valueOf(i10), a, b.class, "10");
                   if (obj3 != PatchProxyResult.class) {
                      i1 = obj3.intValue();
                   }else {
                   label_018c :
                      obj3 = null;
                      if (layoutConfig != null) {
                         List list = layoutConfig.e();
                         if (list != null) {
                            Iterator iterator = list.iterator();
                            while (true) {
                               if (iterator.hasNext()) {
                                  uoe = iterator.next();
                                  uod = uoe.h();
                                  str2 = (uod != null)? uod.b(): obj3;
                                  b1 = a.g(str2, m) ^ 0x01;
                                  if (!b1) {
                                     continue ;
                                  }
                               }else {
                                  uoe = obj3;
                               }
                            label_01c0 :
                               if (layoutConfig != null) {
                                  List list1 = layoutConfig.e();
                                  if (list1 != null) {
                                     Iterator iterator1 = list1.iterator();
                                     while (iterator1.hasNext()) {
                                        obj4 = iterator1.next();
                                        uod = obj4.h();
                                        str2 = (uod != null)? uod.b(): obj3;
                                        if (a.g(str2, m)) {
                                           obj3 = obj4;
                                        }else {
                                           continue ;
                                        }
                                     }
                                  }
                               }
                               if (uoe != null && obj3 != null) {
                                  i1 = (int)((float)uoe.e().c() * ((float)i10 / (float)obj3.e().b()));
                               }else {
                                  i1 = i10;
                               }
                            }
                         }
                      }
                      uoe = obj3;
                      goto label_01c0 ;
                   }
                }else {
                   goto label_018c ;
                }
                obj = new o$a(0, 0, (i1 + Math.max(((i - i10) / 2), 0)));
             }else {
                obj4 = null;
                if (b || f2 - f5 < 0) {
                   if (PatchProxy.isSupport(b.class)) {
                      objArray2 = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
                      obj5 = PatchProxy.apply(objArray2, a, b.class, "7");
                      if (obj5 != PatchProxyResult.class) {
                         obj = obj5;
                      }
                   }
                   i10 = (int)((f1 / f4) * f3);
                   i = a.W2(a.n.invoke(), i, a.m);
                   if (i10 < i1) {
                      b.Z(obj1, "no need adjust offset");
                      obj = new o$a(0, 0, i);
                   }else {
                      i2 = a.V2(a.n.invoke(), i10, a.m);
                      i10 = i2 - ((i10 - i1) / 2);
                      i3 = i1 - p4;
                      b.Z(obj1, "to adjust offset, bottomVisibleY:"+i1+", lastBottomWidgetY:"+i2+str1+"bottomVisibleY:"+i3+", adjustBottomWidgetY:"+i10);
                      i4 = (i10 > i3)? i3 - i10: 0;
                      obj = new o$a(0, i4, i);
                   }
                }else if(PatchProxy.isSupport(b.class)){
                   objArray2 = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
                   obj5 = PatchProxy.apply(objArray2, a, b.class, "6");
                   if (obj5 != PatchProxyResult.class) {
                      obj = obj5;
                   }
                }
                i10 = (int)((f / f3) * f4);
                i = (i - i10) / 2;
                i10 = a.W2(a.n.invoke(), i10, a.m);
                i2 = a.V2(a.n.invoke(), i1, a.m);
                i1 = i1 - p4;
                i9 = (i2 > i1)? i1 - i2: 0;
                b.Z(obj1, "calculateOffsetsByFitY "+i9+' '+i);
                uoa = new o$a(i, i9, (i10 + (i * 2)));
                goto label_014e ;
             }
             obj2 = obj;
          }
       }else {
          goto label_00fa ;
       }
       return obj2;
    }
}
