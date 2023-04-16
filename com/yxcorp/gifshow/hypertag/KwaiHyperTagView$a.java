package com.yxcorp.gifshow.hypertag.KwaiHyperTagView$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.hypertag.KwaiHyperTagView;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.hypertag.a;

public class KwaiHyperTagView$a implements View$OnClickListener	// class@001914
{
    public final View$OnClickListener b;
    public final KwaiHyperTagView c;

    public void KwaiHyperTagView$a(KwaiHyperTagView p0,View$OnClickListener p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiHyperTagView$a.class, "1")) {
          return;
       }
       KwaiHyperTagView n = this.c.n;
       if (n != null) {
          n.b();
       }
       KwaiHyperTagView$a tb = this.b;
       if (tb != null) {
          tb.onClick(p0);
       }
       return;
    }
}
