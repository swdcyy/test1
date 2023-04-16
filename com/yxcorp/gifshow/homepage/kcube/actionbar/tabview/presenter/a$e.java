package com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.presenter.a$e;
import zq6.u;
import com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.presenter.a;
import java.lang.Object;
import wn5.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import com.kwai.library.widget.textview.IconifyTextViewNew;
import android.view.View;

public final class a$e implements u	// class@001718
{
    public final a a;

    public void a$e(a p0){
       this.a = p0;
       super();
    }
    public void onChange(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$e.class, "1")) {
       }else {
          a.p(p0, "tabText");
          p0 = p0.d(this.a.v);
          this.a.B.setText(p0);
          this.a.B.setContentDescription(p0);
       }
       return;
    }
}
