package com.facebook.react.views.scroll.ReactHorizontalScrollContainerView;
import com.facebook.react.views.view.ReactViewGroup;
import android.content.Context;
import pe.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.HorizontalScrollView;

public class ReactHorizontalScrollContainerView extends ReactViewGroup	// class@0013e0
{
    public int b;
    public int c;

    public void ReactHorizontalScrollContainerView(Context p0){
       super(p0);
       this.b = a.b().d(p0);
       this.c = 0;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(ReactHorizontalScrollContainerView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, ReactHorizontalScrollContainerView.class, "1")) {
             return;
          }
       }
       if (this.b == 1) {
          this.setLeft(0);
          this.setRight(((p3 - p1) + 0));
          HorizontalScrollView parent = this.getParent();
          parent.scrollTo(((parent.getScrollX() + this.getWidth()) - this.c), parent.getScrollY());
       }
       this.c = this.getWidth();
       return;
    }
}
