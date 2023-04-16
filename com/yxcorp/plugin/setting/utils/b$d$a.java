package com.yxcorp.plugin.setting.utils.b$d$a;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.yxcorp.plugin.setting.utils.b$d;
import android.widget.TextView;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.text.Layout;
import java.lang.CharSequence;
import android.view.ViewTreeObserver;

public class b$d$a implements ViewTreeObserver$OnPreDrawListener	// class@000933
{
    public final TextView b;
    public final String c;
    public final TextView d;
    public final b$d e;

    public void b$d$a(b$d p0,TextView p1,String p2,TextView p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public boolean onPreDraw(){
       Layout obj = PatchProxy.apply(null, this, b$d$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.getLayout();
       if (obj == null || obj.getLineCount() <= 1) {
          this.b.getViewTreeObserver().removeOnPreDrawListener(this);
          return false;
       }else {
          int lineEnd = obj.getLineEnd(false);
          String str = (this.c).substring(false, lineEnd);
          this.b.setText(str);
          this.d.setText((this.c).substring(lineEnd));
          this.d.setVisibility(false);
          this.b.getViewTreeObserver().removeOnPreDrawListener(this);
          return false;
       }
    }
}
