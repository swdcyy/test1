package lo8.b;
import androidx.viewpager2.widget.ViewPager2$j;
import java.util.Map;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Set;
import java.util.Collection;
import java.util.List;
import java.util.Collections;
import mo8.a;
import java.lang.Float;
import mo8.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lo8.c;
import android.view.View;

public class b implements ViewPager2$j	// class@002d81
{
    public List a;
    public b b;

    public void b(Map p0){
       super();
       if (p0 != null && !p0.isEmpty()) {
          ArrayList uArrayList = new ArrayList(p0.keySet());
          Collections.sort(uArrayList);
          if (uArrayList.size() >= 2) {
             this.a = new ArrayList();
             for (int i = 1; i < uArrayList.size(); i = i + 1) {
                a uoa = new a();
                int i1 = i - 1;
                uoa.a = uArrayList.get(i1).floatValue();
                uoa.b = uArrayList.get(i).floatValue();
                uoa.c = p0.get(Float.valueOf(uoa.a));
                b uob = p0.get(Float.valueOf(uoa.b));
                a c = uoa.c;
                b uob1 = PatchProxy.applyTwoRefs(uob, c, null, b.class, "1");
                if (uob1 != PatchProxyResult.class) {
                }else {
                   uob1 = new b();
                   uob1.a = c.a(uob.a, c.a, 0x3f800000);
                   uob1.b = c.a(uob.b, c.b, 0x3f800000);
                   uob1.c = c.a(uob.c, c.c, 0);
                   uob1.d = c.a(uob.d, c.d, 0);
                   uob1.e = c.a(uob.e, c.e, 0);
                   uob1.f = c.a(uob.f, c.f, 0);
                   uob1.g = c.a(uob.g, c.g, 0);
                   uob1.h = c.a(uob.h, c.h, 0);
                   uob1.i = c.a(uob.i, c.i, 0);
                   uob1.j = c.a(uob.j, c.j, 0);
                   uob1.k = c.a(uob.k, c.k, 0x3f800000);
                }
                uoa.d = uob1;
                this.a.add(uoa);
             }
          }
       }
       return;
    }
    public void a(View p0,float p1){
       a obj;
       b a;
       b a3;
       float f1;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, uob, "2")) {
          return;
       }
       uob = this.a;
       if (uob != null && !uob.isEmpty()) {
          int i = 0;
          while (true) {
             if (i < this.a.size()) {
                a uoa = this.a.get(i);
                a uoa1 = (p1 - uoa.a >= 0 && p1 - uoa.b <= 0)? 1: null;
                if (uoa1) {
                   if (this.b == null) {
                      this.b = new b();
                   }
                   uob = this.b;
                   PatchProxyResult patchProxyRe = PatchProxyResult.class;
                   uoa1 = a.class;
                   if (PatchProxy.isSupport(uoa1)) {
                      obj = PatchProxy.applyTwoRefs(uob, Float.valueOf(p1), uoa, uoa1, "1");
                      if (obj != patchProxyRe) {
                      }else {
                      label_006c :
                         obj = uoa.b;
                         a a1 = uoa.a;
                         if (!obj - a1) {
                            obj = null;
                         }else {
                            p1 = (p1 - a1) / (obj - a1);
                            a d = uoa.d;
                            uoa = uoa.c;
                            if (PatchProxy.isSupport(uoa1)) {
                               Object obj1 = PatchProxy.applyFourRefs(uob, d, uoa, Float.valueOf(p1), null, a.class, "2");
                               if (obj1 != patchProxyRe) {
                                  uob = obj1;
                               }else {
                               label_009b :
                                  uob.a = null;
                                  uob.b = null;
                                  uob.c = null;
                                  uob.d = null;
                                  uob.e = null;
                                  uob.f = null;
                                  uob.g = null;
                                  uob.h = null;
                                  uob.i = null;
                                  uob.j = null;
                                  uob.k = null;
                                  b a2 = d.a;
                                  float f = 0x3f800000;
                                  if (a2 != null) {
                                     a3 = uoa.a;
                                     f1 = (a3 != null)? a3.floatValue(): 0x3f800000;
                                     uob.a = Float.valueOf((f1 + (a2.floatValue() * p1)));
                                  }
                                  a2 = d.b;
                                  if (a2 != null) {
                                     a3 = uoa.b;
                                     if (a3 != null) {
                                        f = a3.floatValue();
                                     }
                                     uob.b = Float.valueOf((f + (a2.floatValue() * p1)));
                                  }
                                  a2 = d.c;
                                  f = 0;
                                  if (a2 != null) {
                                     a3 = uoa.c;
                                     f1 = (a3 != null)? a3.floatValue(): 0;
                                     uob.c = Float.valueOf((f1 + (a2.floatValue() * p1)));
                                  }
                                  a2 = d.d;
                                  if (a2 != null) {
                                     a3 = uoa.d;
                                     f1 = (a3 != null)? a3.floatValue(): 0;
                                     uob.d = Float.valueOf((f1 + (a2.floatValue() * p1)));
                                  }
                                  a2 = d.e;
                                  if (a2 != null) {
                                     a3 = uoa.e;
                                     f1 = (a3 != null)? a3.floatValue(): 0;
                                     uob.e = Float.valueOf((f1 + (a2.floatValue() * p1)));
                                  }
                                  a2 = d.f;
                                  if (a2 != null) {
                                     a3 = uoa.f;
                                     f1 = (a3 != null)? a3.floatValue(): 0;
                                     uob.f = Float.valueOf((f1 + (a2.floatValue() * p1)));
                                  }
                                  a2 = d.g;
                                  if (a2 != null) {
                                     a3 = uoa.g;
                                     f1 = (a3 != null)? a3.floatValue(): 0;
                                     uob.g = Float.valueOf((f1 + (a2.floatValue() * p1)));
                                  }
                                  a2 = d.h;
                                  if (a2 != null) {
                                     a3 = uoa.h;
                                     f1 = (a3 != null)? a3.floatValue(): 0;
                                     uob.h = Float.valueOf((f1 + (a2.floatValue() * p1)));
                                  }
                                  a2 = d.i;
                                  if (a2 != null) {
                                     a3 = uoa.i;
                                     f1 = (a3 != null)? a3.floatValue(): 0;
                                     uob.i = Float.valueOf((f1 + (a2.floatValue() * p1)));
                                  }
                                  a2 = d.j;
                                  if (a2 != null) {
                                     a3 = uoa.j;
                                     f1 = (a3 != null)? a3.floatValue(): 0;
                                     uob.j = Float.valueOf((f1 + (a2.floatValue() * p1)));
                                  }
                                  a2 = d.k;
                                  if (a2 != null) {
                                     b k = uoa.k;
                                     if (k != null) {
                                        f = k.floatValue();
                                     }
                                     uob.k = Float.valueOf((f + (a2.floatValue() * p1)));
                                  }
                               }
                            }else {
                               goto label_009b ;
                            }
                            obj = uob;
                         }
                      }
                   }else {
                      goto label_006c ;
                   }
                   if (obj == null) {
                      return;
                   }else if(PatchProxy.applyVoidTwoRefs(p0, obj, null, c.class, "6")){
                      a = obj.a;
                      if (a != null) {
                         p0.setScaleX(a.floatValue());
                      }
                      a = obj.b;
                      if (a != null) {
                         p0.setScaleY(a.floatValue());
                      }
                      a = obj.c;
                      if (a != null) {
                         p0.setTranslationX(a.floatValue());
                      }
                      a = obj.d;
                      if (a != null) {
                         p0.setTranslationY(a.floatValue());
                      }
                      a = obj.e;
                      if (a != null) {
                         p0.setTranslationZ(a.floatValue());
                      }
                      a = obj.f;
                      if (a != null) {
                         p0.setRotationX(a.floatValue());
                      }
                      a = obj.g;
                      if (a != null) {
                         p0.setRotationY(a.floatValue());
                      }
                      a = obj.h;
                      if (a != null) {
                         p0.setRotation(a.floatValue());
                      }
                      a = obj.i;
                      if (a != null) {
                         p0.setPivotX(a.floatValue());
                      }
                      a = obj.j;
                      if (a != null) {
                         p0.setPivotY(a.floatValue());
                      }
                      a = obj.k;
                      if (a != null) {
                         p0.setAlpha(a.floatValue());
                         break ;
                      }
                   }
                   break ;
                }else {
                   i = i + 1;
                }
             }
          }
          return;
       }
    label_0268 :
       return;
    }
}
