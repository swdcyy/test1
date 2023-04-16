package ef9.c;
import y4b.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
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
import java.util.Collection;
import trd.u;
import com.yxcorp.utility.n;
import kotlin.collections.CollectionsKt___CollectionsKt;

public final class c implements a	// class@002134
{
    public View a;
    public float b;
    public ViewGroup c;

    public void c(){
       super();
    }
    public float a(){
       Float uFloat;
       float f;
       c obj = PatchProxy.apply(null, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.a;
       String str = "fragmentView";
       if (obj == null) {
          a.S(str);
       }
       ViewGroup viewGroup = obj.findViewById(R.id.magic_fragment);
       if (viewGroup != null) {
          if (viewGroup.getVisibility() == 8) {
             uFloat = Float.valueOf(0);
          }else {
             Integer[] integerArray = new Integer[]{Integer.valueOf(0x7f0a2a07),Integer.valueOf(0x7f0a29ef),Integer.valueOf(0x7f0a3807),Integer.valueOf(0x7f0a3cb7)};
             ArrayList uArrayList = new ArrayList();
             Iterator iterator = CollectionsKt__CollectionsKt.L(integerArray).iterator();
             while (iterator.hasNext()) {
                Object obj1 = iterator.next();
                View view1 = viewGroup.findViewById(obj1.intValue());
                Object obj2 = (view1 != null && !view1.getVisibility())? 1: null;
                if (obj2) {
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
             f = uFloat.floatValue();
          label_00d3 :
             if (f > 0) {
                return f;
             }else {
                obj = this.a;
                if (obj == null) {
                   a.S(str);
                }
                View view = obj.findViewById(R.id.shoot_cover_tips_tv);
                f = (view != null && !view.getVisibility())? (float)n.p(view)[1]: 0;
                if (f > 0) {
                   return f;
                }else {
                   return this.b;
                }
             }
          }
       }
       f = 0;
       goto label_00d3 ;
    }
    public float b(){
       c obj = PatchProxy.apply(null, this, c.class, "5");
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
       c obj = PatchProxy.apply(objArray, this, c.class, "3");
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
       c obj = PatchProxy.apply(null, this, c.class, "6");
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
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       if (!this.b - null) {
          c ta = this.a;
          String str = "fragmentView";
          if (ta == null) {
             a.S(str);
          }
          View view = ta.findViewById(R.id.take_picture_btn_v2);
          if (view != null) {
             this.b = (float)n.p(view)[1];
          }else {
             ta = this.a;
             if (ta == null) {
                a.S(str);
             }
             view = ta.findViewById(R.id.take_picture_btn);
             if (view != null) {
                this.b = (float)n.p(view)[1];
             }
          }
       }
       return;
    }
    public float f(){
       c obj = PatchProxy.apply(null, this, c.class, "7");
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "1")) {
          return;
       }
       a.p(p0, "view");
       this.a = p0;
       this.c = p1;
       return;
    }
}
