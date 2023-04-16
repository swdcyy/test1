package com.yxcorp.plugin.search.widget.SearchScrollSelectTextView$h;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.search.widget.SearchScrollSelectTextView;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.widget.TextView;
import android.text.Layout;
import com.yxcorp.plugin.search.widget.SearchScrollSelectTextView$CursorHandle;

public class SearchScrollSelectTextView$h implements View$OnClickListener	// class@0007ea
{
    public final SearchScrollSelectTextView b;

    public void SearchScrollSelectTextView$h(SearchScrollSelectTextView p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchScrollSelectTextView$h.class, "1")) {
          return;
       }
       this.b.b();
       SearchScrollSelectTextView$h tb = this.b;
       tb.h(0, tb.getText().length());
       Layout layout = this.b.getLayout();
       SearchScrollSelectTextView$h tb1 = this.b;
       tb1.C.c((int)layout.getPrimaryHorizontal(tb1.u), layout.getLineTop(layout.getLineForOffset(this.b.u)));
       tb1 = this.b;
       tb1.D.c((int)layout.getPrimaryHorizontal(tb1.v), layout.getLineTop(layout.getLineForOffset(this.b.v)));
       this.b.j();
       return;
    }
}
