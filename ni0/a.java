package ni0.a;
import ni0.a$a;
import nsd.u;
import java.util.HashSet;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Color;
import java.lang.StringBuilder;
import android.view.View;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import com.facebook.react.views.view.ReactViewBackgroundDrawable;
import android.content.Context;
import com.kuaishou.krn.c;
import pi0.b;
import java.lang.Float;
import ek0.d;
import android.view.ViewGroup;

public final class a	// class@003320
{
    public ArrayList a;
    public int b;
    public final HashSet c;
    public static final a$a d;

    static {
       a.d = new a$a(null);
    }
    public void a(int p0,HashSet p1){
       super();
       this.b = p0;
       this.c = p1;
       this.a = new ArrayList();
    }
    public final String a(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return Color.red(p0)+','+Color.green(p0)+','+Color.blue(p0)+','+Color.alpha(p0);
    }
    public final boolean b(View p0){
       int i = this;
       Object obj = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       View obj1 = PatchProxy.applyOneRefs(obj, i, uoa, "1");
       if (obj1 != patchProxyRe) {
          return obj1.booleanValue();
       }
       a.p(obj, "rootView");
       if (i.b <= null) {
          return false;
       }
       boolean b = (!p0.getVisibility())? true: false;
       float alpha = p0.getAlpha();
       String str = PatchProxy.applyOneRefs(obj, i, uoa, "2");
       if (str != patchProxyRe) {
       }else {
          Drawable background = p0.getBackground();
          if (background != null) {
             if (background instanceof ColorDrawable) {
                str = i.a(background.getColor());
             }else if(background instanceof ReactViewBackgroundDrawable){
                str = i.a(background.g());
             }
          }
          str = "null";
       }
       Object obj2 = str;
       String simpleName = p0.getContext().getClass().getSimpleName();
       Object obj3 = PatchProxy.applyOneRefs(obj, i, uoa, "4");
       String str1 = (obj3 != patchProxyRe)? obj3: (int)p0.getX()+','+(int)p0.getY()+','+p0.getWidth()+','+p0.getHeight();
       c uoc = c.b();
       a.o(uoc, "KrnManager.get\(\)");
       int b1 = uoc.j();
       Boolean uBoolean = Boolean.valueOf(b);
       Float uFloat = Float.valueOf(alpha);
       obj1 = null;
       String str2 = (!b1)? p0.toString(): obj1;
       Integer integer = (!b1)? Integer.valueOf(p0.getId()): obj1;
       b uob = new b(uBoolean, uFloat, obj2, simpleName, str1, str2, integer);
       i.a.add(obj3);
       String simpleName1 = p0.getClass().getSimpleName();
       uoa = i.c;
       if (uoa != null && !uoa.contains(simpleName1)) {
          d.e("ScanContentViewsTask hasContentViews: got content view: "+simpleName1);
          return true;
       }else {
          i.b = i.b - true;
          if (!obj instanceof ViewGroup) {
             return false;
          }else {
             b1 = obj.getChildCount();
             int i1 = 0;
             while (true) {
                if (i1 >= b1) {
                   return false;
                }
                obj1 = obj.getChildAt(i1);
                if (obj1 != null && i.b(obj1)) {
                   break ;
                }else {
                   i1 = i1 + 1;
                }
             }
             return true;
          }
       }
    }
}
