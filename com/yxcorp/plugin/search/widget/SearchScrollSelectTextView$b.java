package com.yxcorp.plugin.search.widget.SearchScrollSelectTextView$b;
import android.view.View$OnScrollChangeListener;
import com.yxcorp.plugin.search.widget.SearchScrollSelectTextView;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.tkruntime.v8.V8Object;
import tx4.y;
import com.tkruntime.v8.V8Function;

public class SearchScrollSelectTextView$b implements View$OnScrollChangeListener	// class@0007e4
{
    public final SearchScrollSelectTextView a;

    public void SearchScrollSelectTextView$b(SearchScrollSelectTextView p0){
       this.a = p0;
       super();
    }
    public void onScrollChange(View p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(SearchScrollSelectTextView$b.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, SearchScrollSelectTextView$b.class, "1")) {
             return;
          }
       }
       SearchScrollSelectTextView$b ta = this.a;
       if (ta.e == null && (ta.d != null && y.a(ta.f))) {
          ta = this.a;
          ta.e = true;
          ta.f.call(null, null);
       }
    label_0051 :
       return;
    }
}
