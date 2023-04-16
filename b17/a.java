package b17.a;
import w07.l;
import java.lang.Object;
import a17.c;
import java.lang.String;
import kotlin.jvm.internal.a;
import a17.c$a;
import a17.k;
import android.view.View;
import com.kwai.library.widget.popup.common.c;
import android.widget.TextView;
import android.content.Context;
import a17.m;
import j17.a;
import j17.b;
import ll8.c$b;
import android.content.res.TypedArray;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.Drawable;
import java.lang.Exception;
import androidx.recyclerview.widget.RecyclerView;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.Shape;
import android.graphics.Paint;
import android.view.ViewGroup;
import r07.b;
import androidx.recyclerview.widget.RecyclerView$n;
import a17.a;
import com.kwai.library.widget.popup.common.c$b;
import qrd.l1;

public final class a implements l	// class@0003b3
{

    public void a(){
       super();
    }
    public void apply(Object p0){
       Context context;
       float f1;
       TypedArray typedArray;
       Context obj = p0;
       a.p(obj, "target");
       if (!obj.c0().O instanceof k) {
       }else {
          c$a t = obj.c0().T;
          if (t != null) {
             View view = obj.z();
             TextView textView = (view != null)? view.findViewById(R.id.tv_title_bold): null;
             if (textView != null) {
                context = textView.getContext();
                a.o(context, "context");
                textView.setTextColor(a.a(context, t.n));
                b.a(t.m, textView);
             }
             view = obj.z();
             textView = (view != null)? view.findViewById(R.id.tv_title): null;
             if (textView != null) {
                context = textView.getContext();
                a.o(context, "context");
                textView.setTextColor(a.a(context, t.p));
                b.a(t.o, textView);
             }
             view = obj.z();
             view = (view != null)? view.findViewById(R.id.v_title_line): null;
             if (view != null) {
                context = view.getContext();
                a.o(context, "context");
                view.setBackgroundColor(a.a(context, t.a()));
             }
             view = obj.z();
             view = (view != null)? view.findViewById(R.id.tv_button): null;
             int i = 3;
             int i1 = 0;
             String str = -1;
             String str1 = 2;
             int i2 = 6;
             int i3 = 1;
             if (t.c() != str && view != null) {
                try{
                   typedArray = view.getContext().obtainStyledAttributes(t.c(), c$b.N1);
                   try{
                      f1 = 0x42800000;
                      int intx = typedArray.getInt(i1, 17);
                      ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
                      a.o(layoutParams, "button.layoutParams");
                      layoutParams.height = typedArray.getLayoutDimension(str1, a1.e(f1));
                      layoutParams.width = typedArray.getLayoutDimension(i3, str);
                      view.setLayoutParams(layoutParams);
                      int resourceId = typedArray.getResourceId(10, str);
                      i3 = 0x106000d;
                      int color = typedArray.getColor(9, a1.a(i3));
                      if (view instanceof TextView) {
                         view.setGravity(intx);
                         b.a(resourceId, view);
                         view.setTextColor(color);
                      }
                      resourceId = typedArray.getDimensionPixelSize(5, i1);
                      color = typedArray.getColor(4, a1.a(i3));
                      GradientDrawable gradientDraw1 = new GradientDrawable();
                      gradientDraw1.setStroke(resourceId, color);
                      gradientDraw1.setColor(typedArray.getColor(i, a1.a(i3)));
                      float f2 = (float)typedArray.getDimensionPixelSize(i2, i1);
                      gradientDraw1.setCornerRadius(f2);
                      GradientDrawable gradientDraw2 = new GradientDrawable();
                      gradientDraw2.setStroke(resourceId, color);
                      gradientDraw2.setColor(typedArray.getColor(8, a1.a(i3)));
                      gradientDraw2.setCornerRadius(f2);
                      StateListDrawable stateListDra = new StateListDrawable();
                      int[] ointArray = new int[]{0x10100a7};
                      stateListDra.addState(ointArray, gradientDraw2);
                      int[] ointArray1 = new int[i1];
                      stateListDra.addState(ointArray1, gradientDraw1);
                      view.setBackground(stateListDra);
                      a.o(typedArray, "a.apply {\n        val he¡­nd = listDrawable\n      }");
                   label_0177 :
                      typedArray.recycle();
                   }catch(java.lang.Exception e0){
                   }
                   e0.printStackTrace();
                   if (typedArray) {
                      goto label_0177 ;
                   }
                }catch(java.lang.Exception e0){
                   typedArray = null;
                   goto label_0172 ;
                }
             }
          label_0182 :
             view = obj.z();
             view = (view != null)? view.findViewById(R.id.button_space): null;
             if (view != null) {
                Context context1 = view.getContext();
                a.o(context1, "context");
                view.setBackgroundColor(a.a(context1, t.l));
                context = view.getContext();
                a.o(context, "context");
                view.getLayoutParams().height = a.d(context, 0x7f071105);
                view.setLayoutParams(view.getLayoutParams());
             }
             view = obj.z();
             RecyclerView recyclerView = (view != null)? view.findViewById(R.id.recycler_view): null;
             float f = 0;
             if (recyclerView != null) {
                if (obj.c0().P != null) {
                   ShapeDrawable shapeDrawabl = new ShapeDrawable(new RectShape());
                   Paint paint = shapeDrawabl.getPaint();
                   a.o(paint, "shape.paint");
                   Context context2 = recyclerView.getContext();
                   a.o(context2, "context");
                   paint.setColor(a.a(context2, t.a()));
                   shapeDrawabl.setIntrinsicHeight(a1.e(0x3f000000));
                   recyclerView.addItemDecoration(new b(shapeDrawabl));
                }
                if (obj.p == null) {
                   Context context3 = recyclerView.getContext();
                   a.o(context3, "context");
                   recyclerView.addItemDecoration(new a(recyclerView, a.c(context3, t.b()), f));
                }
             }
             view = obj.z();
             if (obj.c0().F != str) {
                view = (view != null)? view.findViewById(obj.c0().F): null;
             }
          label_0245 :
             if (view != null) {
                context = view.getContext();
                a.o(context, "animView.context");
                f1 = a.c(context, t.b());
                float[] uofloatArray = new float[]{f1,f1,f1,f1,f,f,f,f};
                GradientDrawable gradientDraw = new GradientDrawable();
                context = view.getContext();
                a.o(context, "animView.context");
                gradientDraw.setColor(a.a(context, t.b));
                gradientDraw.setCornerRadii(uofloatArray);
                view.setBackground(gradientDraw);
             }
             view = obj.z();
             if (view != null) {
                obj = view.getContext();
                a.o(obj, "context");
                view.setBackgroundColor(a.a(obj, t.c));
             }
          }
       }
       return;
    }
}
