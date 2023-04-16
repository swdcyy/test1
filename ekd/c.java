package ekd.c;
import android.view.View;
import android.view.ViewGroup;
import java.lang.String;
import android.graphics.Rect;
import java.lang.Object;
import java.util.WeakHashMap;
import java.util.Set;
import java.util.Iterator;
import a2.i0;
import android.view.ViewParent;
import ekd.c$b;
import ekd.c$a;
import android.view.View$OnAttachStateChangeListener;
import java.lang.Integer;

public class c	// class@000d2f
{

    public static boolean a(View p0){
       if (p0.getAlpha() - 0x3c23d70a >= 0 && !p0.getVisibility()) {
          if (!p0 instanceof ViewGroup) {
             return true;
          }else {
             int childCount = p0.getChildCount();
             int i = 0;
             while (i < childCount) {
                if (c.a(p0.getChildAt(i))) {
                   return true;
                }
                i = i + 1;
             }
          }
       }
       return false;
    }
    public static String b(View p0){
       boolean b;
       Rect rect = new Rect();
       if (!p0.getGlobalVisibleRect(rect)) {
          return null;
       }
       p0 = p0.getRootView();
       String tag = (p0 != null)? p0.getTag(R.id.global_floating_view): null;
       if (!tag instanceof WeakHashMap) {
          return null;
       }else {
          Iterator iterator = tag.keySet().iterator();
          while (true) {
             if (!iterator.hasNext()) {
                return null;
             }
             View view = iterator.next();
             if (i0.X(view)) {
                View view1 = view;
                while (true) {
                   if (view1 != null) {
                      if (view1.getAlpha() - 0x3c23d70a < 0 || view1.getVisibility()) {
                         b = false;
                      label_0066 :
                         if (b && c.a(view)) {
                            Rect rect1 = new Rect();
                            if (view.getGlobalVisibleRect(rect1) && rect1.contains(rect)) {
                               iterator = view.getTag(R.id.global_floating_view);
                               if (iterator instanceof c$b) {
                                  break ;
                               }else {
                                  return view.toString();
                               }
                            }
                         }
                      }else if(view1.getParent() instanceof View){
                         view1 = view1.getParent();
                      }else {
                         view1 = null;
                         continue ;
                      }
                   }else {
                      b = true;
                      goto label_0066 ;
                   }
                }
                return iterator.a;
             }
          }
       }
    }
    public static void c(View p0,String p1){
       p0.setTag(R.id.global_floating_view, new c$b(p1));
       if (i0.X(p0)) {
          c.d(p0);
       }else {
          p0.addOnAttachStateChangeListener(new c$a(p0));
       }
       return;
    }
    public static void d(View p0){
       View rootView = p0.getRootView();
       WeakHashMap tag = rootView.getTag(R.id.global_floating_view);
       if (tag instanceof WeakHashMap) {
       }else {
          tag = new WeakHashMap();
          rootView.setTag(R.id.global_floating_view, tag);
       }
       tag.put(p0, Integer.valueOf(0));
       return;
    }
}
