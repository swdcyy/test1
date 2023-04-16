package ef9.d;
import y4b.a;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import kotlin.jvm.internal.a;
import android.view.View;
import android.view.ViewGroup;
import java.lang.Float;
import java.lang.Integer;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import trd.u;
import com.yxcorp.utility.n;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.yxcorp.gifshow.camera.record.tab.CameraScrollTabViewGroupV2;
import android.widget.FrameLayout;
import java.lang.Boolean;
import java.lang.Math;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import ef9.d$a;

public class d implements a	// class@002136
{
    public View a;
    public float b;
    public ViewGroup c;
    public ViewTreeObserver$OnGlobalLayoutListener d;

    public void d(){
       super();
    }
    public float a(){
       float f;
       float f1;
       d a;
       Float uFloat;
       Float uFloat1;
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       Object[] objArray = null;
       d obj1 = PatchProxy.apply(objArray, obj, uod, "9");
       if (obj1 != patchProxyRe) {
          return obj1.floatValue();
       }
       obj1 = PatchProxy.apply(objArray, obj, uod, "7");
       int i = 0x7f0a3cb7;
       int i1 = 0;
       if (obj1 != patchProxyRe) {
          f = obj1.floatValue();
       }else {
          obj1 = obj.a;
          if (obj1 == null) {
             a.S("fragmentView");
          }
          ViewGroup viewGroup1 = obj1.findViewById(R.id.magic_fragment);
          if (viewGroup1 != null) {
             if (viewGroup1.getVisibility() == 8) {
                uFloat1 = Float.valueOf(0);
             }else {
                Integer[] integerArray1 = new Integer[]{Integer.valueOf(0x7f0a2a07),Integer.valueOf(0x7f0a29ef),Integer.valueOf(0x7f0a3807),Integer.valueOf(i)};
                ArrayList uArrayList2 = new ArrayList();
                Iterator iterator2 = CollectionsKt__CollectionsKt.L(integerArray1).iterator();
                while (iterator2.hasNext()) {
                   Object obj4 = iterator2.next();
                   View view1 = viewGroup1.findViewById(obj4.intValue());
                   view1 = (view1 != null && view1.isShown() == true)? 1: 0;
                   if (view1) {
                      uArrayList2.add(obj4);
                   }
                   i1 = 0;
                }
                ArrayList uArrayList3 = new ArrayList(u.Y(uArrayList2, 10));
                iterator2 = uArrayList2.iterator();
                while (iterator2.hasNext()) {
                   uArrayList3.add(Float.valueOf((float)n.p(viewGroup1.findViewById(iterator2.next().intValue()))[1]));
                }
                uFloat1 = CollectionsKt___CollectionsKt.V3(uArrayList3);
             }
             if (uFloat1 != null) {
                f = uFloat1.floatValue();
             }
          }
          f = 0;
       }
       if (f > 0) {
          return f;
       }else {
          View obj2 = PatchProxy.apply(objArray, obj, uod, "8");
          if (obj2 != patchProxyRe) {
             f1 = obj2.floatValue();
          }else {
             a = obj.a;
             if (a == null) {
                a.S("fragmentView");
             }
             ViewGroup viewGroup = a.findViewById(R.id.prettify_fragment_v2);
             if (viewGroup != null) {
                if (viewGroup.getVisibility() == 8) {
                   uFloat = Float.valueOf(0);
                }else {
                   Integer[] integerArray = new Integer[]{Integer.valueOf(i),Integer.valueOf(0x7f0a0fe6)};
                   ArrayList uArrayList = new ArrayList();
                   Iterator iterator = CollectionsKt__CollectionsKt.L(integerArray).iterator();
                   while (iterator.hasNext()) {
                      obj1 = iterator.next();
                      View view = viewGroup.findViewById(obj1.intValue());
                      Object obj3 = (view != null && !view.getVisibility())? 1: null;
                      if (obj3) {
                         uArrayList.add(obj1);
                      }
                   }
                   ArrayList uArrayList1 = new ArrayList(u.Y(uArrayList, 10));
                   Iterator iterator1 = uArrayList.iterator();
                   while (iterator1.hasNext()) {
                      uArrayList1.add(Float.valueOf((float)n.p(viewGroup.findViewById(iterator1.next().intValue()))[1]));
                   }
                   uFloat = CollectionsKt___CollectionsKt.V3(uArrayList1);
                }
                if (uFloat != null) {
                   f1 = uFloat.floatValue();
                }
             }
             f1 = 0;
          }
          if (f1 > 0) {
             return f1;
          }else {
             a = obj.a;
             if (a == null) {
                a.S("fragmentView");
             }
             CameraScrollTabViewGroupV2 uCameraScrol = a.findViewById(R.id.camera_time_mode_group);
             f1 = (uCameraScrol != null && (!uCameraScrol.getVisibility() && uCameraScrol.getChildCount() > 0))? (float)n.p(uCameraScrol.s(0))[1]: 0;
             uod = obj.a;
             if (uod == null) {
                a.S("fragmentView");
             }
             obj2 = uod.findViewById(R.id.control_speed_layout);
             float f2 = (obj2 != null && a.g(obj2.getTag(0x7f0a3abc), Boolean.TRUE))? (float)n.p(obj2)[1]: 0;
             f1 = (f1 > 0)? Math.min(f1, obj.b): obj.b;
             if (f2 > 0) {
                f1 = Math.min(f2, f1);
             }
             return f1;
          }
       }
    }
    public float b(){
       d obj = PatchProxy.apply(null, this, d.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.a;
       if (obj == null) {
          a.S("fragmentView");
       }
       View view = obj.findViewById(R.id.camera_flash_bar_root);
       int[] ointArray = null;
       if (view != null && !view.getVisibility()) {
          ointArray = (float)n.p(view)[1] + (float)view.getHeight();
       }
       return ointArray;
    }
    public float c(){
       Float uFloat;
       float f1;
       Object[] objArray = null;
       d obj = PatchProxy.apply(objArray, this, d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.a;
       String str = "fragmentView";
       if (obj == null) {
          a.S(str);
       }
       ViewGroup viewGroup = obj.findViewById(R.id.magic_fragment);
       float f = 0;
       if (viewGroup != null) {
          if (viewGroup.getVisibility() != 8) {
             View view = viewGroup.findViewById(R.id.tabs_container);
             if (view != null && !view.getVisibility()) {
                uFloat = Float.valueOf((float)n.p(view)[1]);
             label_004e :
                if (uFloat != null) {
                   f1 = uFloat.floatValue();
                label_0056 :
                   float f2 = (float)0;
                   if (f1 - f2 > 0) {
                      return f1;
                   }else {
                      obj = this.a;
                      if (obj == null) {
                         a.S(str);
                      }
                      viewGroup = obj.findViewById(R.id.prettify_fragment_v2);
                      if (viewGroup != null) {
                         if (viewGroup.getVisibility() != 8) {
                            view = viewGroup.findViewById(R.id.tabs_container);
                            if (view != null && !view.getVisibility()) {
                               objArray = Float.valueOf((float)n.p(view)[1]);
                            }
                         }
                         if (objArray != null) {
                            f = objArray.floatValue();
                         }
                      }
                      if (f - f2 > 0) {
                         return f;
                      }else {
                         return this.b;
                      }
                   }
                }
             }
          }
          uFloat = objArray;
          goto label_004e ;
       }
       f1 = 0;
       goto label_0056 ;
    }
    public float d(){
       d obj = PatchProxy.apply(null, this, d.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.a;
       if (obj == null) {
          a.S("fragmentView");
       }
       View view = obj.findViewById(R.id.camera_sidebar_layout);
       if (view == null) {
          view = this.c;
       }
       float f = 0;
       if (view != null && !view.getVisibility()) {
          f = (float)n.p(view)[0];
       }
       return f;
    }
    public void dispose(){
       if (PatchProxy.applyVoid(null, this, d.class, "5")) {
          return;
       }
       d td = this.d;
       if (td != null) {
          d ta = this.a;
          if (ta == null) {
             a.S("fragmentView");
          }
          View view = ta.findViewById(R.id.record_btn);
          if (view != null) {
             ViewTreeObserver viewTreeObse = view.getViewTreeObserver();
             if (viewTreeObse != null) {
                viewTreeObse.removeOnGlobalLayoutListener(td);
             }
          }
       }
    label_002b :
       this.d = null;
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       if (!this.b - null) {
          d ta = this.a;
          String str = "fragmentView";
          if (ta == null) {
             a.S(str);
          }
          View view = ta.findViewById(R.id.record_progress_txt);
          if (view == null) {
             ta = this.a;
             if (ta == null) {
                a.S(str);
             }
             view = ta.findViewById(R.id.record_btn);
          }
          if (view != null) {
             if (view.getHeight() > 0) {
                this.b = (float)n.p(view)[1];
             }else if(this.d != null){
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this.d);
             }
             this.d = new d$a(this, view);
             view.getViewTreeObserver().addOnGlobalLayoutListener(this.d);
          }
       }
       return;
    }
    public float f(){
       d obj = PatchProxy.apply(null, this, d.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.a;
       if (obj == null) {
          a.S("fragmentView");
       }
       View view = obj.findViewById(R.id.camera_sidebar_layout);
       if (view == null) {
          view = this.c;
       }
       int[] ointArray = null;
       if (view != null && !view.getVisibility()) {
          ointArray = (float)n.p(view)[1] + (float)view.getHeight();
       }
       return ointArray;
    }
    public void g(View p0,ViewGroup p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "3")) {
          return;
       }
       a.p(p0, "view");
       this.a = p0;
       this.c = p1;
       return;
    }
    public final View h(){
       d obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj == null) {
          a.S("fragmentView");
       }
       return obj;
    }
}
