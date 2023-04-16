package com.yxcorp.gifshow.postentrance.bubblev2.widget.BubbleTitlesLayout$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.postentrance.bubblev2.widget.BubbleTitlesLayout;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import java.util.Objects;
import java.lang.Integer;
import android.text.Layout;
import a0c.g;
import q87.c;
import java.lang.CharSequence;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.internal.a;
import com.yxcorp.utility.n;
import java.lang.StringBuilder;

public final class BubbleTitlesLayout$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@00103e
{
    public final BubbleTitlesLayout b;

    public void BubbleTitlesLayout$a(BubbleTitlesLayout p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, BubbleTitlesLayout$a.class, "1")) {
          return;
       }
       this.b.D.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       BubbleTitlesLayout$a tb = this.b;
       int i = (int)tb.D.getTextSize();
       Objects.requireNonNull(tb);
       if (!PatchProxy.isSupport(BubbleTitlesLayout.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), tb, BubbleTitlesLayout.class, "16")) {
          Layout layout = tb.D.getLayout();
          if (layout != null) {
             Object[] objArray = new Object[0];
             g.C().w("home_entrance_bubble", "reSizeTitleViewSize", objArray);
             int lineCount = layout.getLineCount();
             String str = tb.D.getText().toString();
             int i1 = 0;
             int i2 = 0;
             while (i1 < lineCount) {
                layout.getLineLeft(i1);
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                String str1 = str.substring(layout.getLineStart(i1), layout.getLineEnd(i1));
                a.o(str1, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
                int i3 = (int)n.O(str1, (float)i);
                if (i3 > i2) {
                   i2 = i3;
                }
                i1 = i1 + 1;
             }
             if (i2 < tb.D.getMaxWidth() && i2 != tb.D.getWidth()) {
                Object[] objArray1 = new Object[0];
                g.C().w("home_entrance_bubble", "reSizeTitleViewSize size "+i2, objArray1);
                tb.D.setWidth(i2);
             }
          }
       }
       return;
    }
}
