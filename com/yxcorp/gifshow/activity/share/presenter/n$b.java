package com.yxcorp.gifshow.activity.share.presenter.n$b;
import android.view.View$OnFocusChangeListener;
import com.yxcorp.gifshow.activity.share.presenter.n;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import android.widget.EditText;
import xw8.p0;

public class n$b implements View$OnFocusChangeListener	// class@001411
{
    public final n b;

    public void n$b(n p0){
       this.b = p0;
       super();
    }
    public void onFocusChange(View p0,boolean p1){
       if (PatchProxy.isSupport(n$b.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, n$b.class, "1")) {
          return;
       }
       n r = this.b.r;
       if (r != null) {
          r.setCursorVisible(p1);
       }
       if (p1 && this.b.w.h()) {
          n$b tb = this.b;
          tb.J = false;
          tb.w.p(1);
       }
       return;
    }
}
