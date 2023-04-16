package bl5.a;
import android.view.View$OnClickListener;
import bl5.b;
import android.view.View;
import java.lang.Object;
import ql8.a;
import bk5.c;
import java.lang.String;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import el5.l;
import xk5.c;
import android.text.Editable;
import android.widget.EditText;
import com.kwai.emotionsdk.panel.EmotionPanelConfig;

public final class a implements View$OnClickListener	// class@0004cc
{
    public final b b;
    public final View c;

    public void a(b p0,View p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       b s;
       a tb = this.b;
       a tc = this.c;
       b p = tb.p;
       if (p != null) {
          a b = p.b;
          if (!b instanceof c || (!("[my_spacing]").equals(b.a) && (!TextUtils.x(tb.p.b.b) && (double)tc.getAlpha() - 0x3fe6666666666666 >= 0))) {
             tc = tb.p.b;
             l.b().d(tc);
             p = tb.s;
             if (p == null || !p.g(tc)) {
                p = tb.q;
                if (p == null) {
                   s = tb.s;
                   if (s != null) {
                      s.a(tc);
                   }
                }else if((p.getText().length() + (tc.a).length()) <= tb.r.getMaxEditorSize()){
                   int selectionSta = tb.q.getSelectionStart();
                   if (selectionSta < 0) {
                      selectionSta = 0;
                   }
                   tb.q.getText().insert(selectionSta, tc.a);
                   s = tb.s;
                   if (s != null) {
                      s.a(tc);
                   }
                }
             }
          }
       }
       return;
    }
}
