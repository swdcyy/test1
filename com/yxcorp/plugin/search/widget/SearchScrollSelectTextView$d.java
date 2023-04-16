package com.yxcorp.plugin.search.widget.SearchScrollSelectTextView$d;
import android.view.View$OnTouchListener;
import com.yxcorp.plugin.search.widget.SearchScrollSelectTextView;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class SearchScrollSelectTextView$d implements View$OnTouchListener	// class@0007e6
{
    public final SearchScrollSelectTextView b;

    public void SearchScrollSelectTextView$d(SearchScrollSelectTextView p0){
       this.b = p0;
       super();
    }
    public boolean onTouch(View p0,MotionEvent p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, SearchScrollSelectTextView$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.b.k = p1.getX();
       this.b.l = p1.getY();
       p1.m = p0.getScrollY();
       return false;
    }
}
