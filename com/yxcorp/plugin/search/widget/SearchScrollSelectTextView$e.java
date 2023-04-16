package com.yxcorp.plugin.search.widget.SearchScrollSelectTextView$e;
import android.view.View$OnLongClickListener;
import com.yxcorp.plugin.search.widget.SearchScrollSelectTextView;
import java.lang.Object;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Integer;
import com.yxcorp.plugin.search.widget.SearchScrollSelectTextView$CursorHandle;
import android.widget.TextView;
import ted.a;
import java.lang.Number;
import android.text.Layout;
import java.lang.CharSequence;
import android.text.Spannable;

public class SearchScrollSelectTextView$e implements View$OnLongClickListener	// class@0007e7
{
    public final SearchScrollSelectTextView b;

    public void SearchScrollSelectTextView$e(SearchScrollSelectTextView p0){
       this.b = p0;
       super();
    }
    public boolean onLongClick(View p0){
       int i3;
       Layout layout;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p0 = PatchProxy.applyOneRefs(p0, this, SearchScrollSelectTextView$e.class, "1");
       if (p0 != patchProxyRe) {
          return p0.booleanValue();
       }
       SearchScrollSelectTextView$e tb = this.b;
       int i = (int)tb.k;
       int i1 = (int)tb.l;
       Objects.requireNonNull(tb);
       if (!PatchProxy.isSupport(SearchScrollSelectTextView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), Integer.valueOf(i1), tb, SearchScrollSelectTextView.class, "11")) {
          tb.b();
          tb.f();
          if (tb.C == null) {
             tb.C = new SearchScrollSelectTextView$CursorHandle(tb, true, tb);
          }
          if (tb.D == null) {
             tb.D = new SearchScrollSelectTextView$CursorHandle(tb, false, tb);
          }
          int i2 = i1 + tb.m;
          if (PatchProxy.isSupport(a.class)) {
             Object obj = PatchProxy.applyThreeRefs(tb, Integer.valueOf(i), Integer.valueOf(i2), null, a.class, "1");
             if (obj != patchProxyRe) {
                i3 = obj.intValue();
             }else {
             label_007f :
                layout = tb.getLayout();
                if (layout != null) {
                   i1 = layout.getOffsetForHorizontal(layout.getLineForVertical(i2), (float)i);
                   i3 = (layout.getLineTop(layout.getLineForOffset((i1 + 1))) > layout.getLineTop(layout.getLineForOffset(i1)))? i1 - 1: i1;
                }else {
                   i3 = -1;
                }
             }
          }else {
             goto label_007f ;
          }
          i1 = tb.g + i3;
          if (tb.getText() instanceof Spannable) {
             tb.F = tb.getText();
          }
          if (tb.F != null && i3 < tb.getText().length()) {
             tb.h(i3, i1);
             layout = tb.getLayout();
             tb.C.c((int)layout.getPrimaryHorizontal(tb.u), layout.getLineTop(layout.getLineForOffset(tb.u)));
             tb.D.c((int)layout.getPrimaryHorizontal(tb.v), layout.getLineTop(layout.getLineForOffset(tb.v)));
             tb.j();
          }
       }
    label_0100 :
       return true;
    }
}
