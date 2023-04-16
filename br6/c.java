package br6.c;
import br6.b;
import com.kwai.kcube.TabIdentifier;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import wq6.i;
import java.util.Objects;
import java.util.HashMap;
import android.content.res.Resources;
import java.lang.IllegalAccessException;
import java.lang.StringBuilder;

public class c implements b	// class@0005dd
{
    public final List b;
    public final TabIdentifier c;

    public void c(TabIdentifier p0){
       a.p(p0, "containerId");
       super();
       this.c = p0;
       this.b = new ArrayList();
    }
    public View d(ViewGroup p0,int p1){
       List obj;
       View view;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoc, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "viewGroup");
       int childCount = p0.getChildCount();
       int i = 0;
       int i1 = 0;
       while (true) {
          if (i1 >= childCount) {
             return null;
          }
          View childAt = p0.getChildAt(i1);
          if (childAt != null) {
             view = childAt.findViewById(p1);
             if (view != null) {
                if (!this.b.contains(childAt)) {
                   break ;
                }else {
                   Objects.requireNonNull(i.b);
                   obj = i.a.get(this.c);
                   if (obj != null) {
                      i = obj.contains(Integer.valueOf(view.getId()));
                   }
                   if (i) {
                      return view;
                   }else {
                      throw new IllegalAccessException("禁止跨层级直接访问容器[id = "+this.c+"]的View[id = "+p0.getResources().getResourceName(p1)+"]！！！请确保findViewById的调用在容器内部，如需要跨层级访问，请使用StateId的方式。");
                   }
                }
             }
          }
          i1 = i1 + 1;
       }
       return view;
    }
    public void e(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       a.p(p0, "view");
       this.b.add(p0);
       return;
    }
}
