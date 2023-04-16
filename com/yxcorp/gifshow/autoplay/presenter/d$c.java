package com.yxcorp.gifshow.autoplay.presenter.d$c;
import com.kwai.library.widget.refresh.RefreshLayout$h;
import com.yxcorp.gifshow.autoplay.presenter.d;
import java.lang.Object;
import o17.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.view.ViewGroup;
import android.view.View;
import s99.b;
import s99.f;
import u99.c;
import com.yxcorp.gifshow.autoplay.dispatch.a;

public class d$c implements RefreshLayout$h	// class@001c2b
{
    public final d a;

    public void d$c(d p0){
       this.a = p0;
       super();
    }
    public void a(float p0,float p1,boolean p2){
       i.a(this, p0, p1, p2);
    }
    public void b(){
       i.d(this);
    }
    public void pullToRefresh(){
       i.b(this);
    }
    public void refreshComplete(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d$c.class, "1")) {
          return;
       }
       d$c ta = this.a;
       if (ta.S != null) {
          boolean b = false;
          ta.S = b;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(objArray, ta, d.class, "4")) {
             int childCount = ta.p.getChildCount();
             while (b < childCount) {
                View childAt = ta.p.getChildAt(b);
                if (childAt instanceof b) {
                   childAt.a();
                }
                b = b + 1;
             }
          }
          this.a.x.b(13);
       }
       this.a.R.b("refreshComplete");
       return;
    }
    public void releaseToRefresh(){
       i.e(this);
    }
}
