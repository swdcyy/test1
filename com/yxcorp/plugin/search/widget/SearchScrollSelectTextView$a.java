package com.yxcorp.plugin.search.widget.SearchScrollSelectTextView$a;
import android.view.ViewTreeObserver$OnScrollChangedListener;
import com.yxcorp.plugin.search.widget.SearchScrollSelectTextView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import android.widget.PopupWindow;
import com.yxcorp.plugin.search.widget.SearchScrollSelectTextView$CursorHandle;

public class SearchScrollSelectTextView$a implements ViewTreeObserver$OnScrollChangedListener	// class@0007e3
{
    public final SearchScrollSelectTextView a;

    public void SearchScrollSelectTextView$a(SearchScrollSelectTextView p0){
       this.a = p0;
       super();
    }
    public void onScrollChanged(){
       if (PatchProxy.applyVoid(null, this, SearchScrollSelectTextView$a.class, "1")) {
          return;
       }
       SearchScrollSelectTextView$a ta = this.a;
       ta.o = (float)ta.getScrollY();
       SearchScrollSelectTextView g = this.a.G;
       if (g != null) {
          g.dismiss();
       }
       g = this.a.C;
       if (g != null) {
          g.b();
       }
       g = this.a.D;
       if (g != null) {
          g.b();
       }
       this.a.f();
       return;
    }
}
