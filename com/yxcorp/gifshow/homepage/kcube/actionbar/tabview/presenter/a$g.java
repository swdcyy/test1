package com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.presenter.a$g;
import zq6.u;
import com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.presenter.a;
import java.lang.Object;
import co5.o;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.graphics.Typeface;
import com.kwai.library.widget.textview.IconifyTextViewNew;

public final class a$g implements u	// class@00171a
{
    public final a a;

    public void a$g(a p0){
       this.a = p0;
       super();
    }
    public void onChange(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$g.class, "1")) {
       }else {
          a.p(p0, "textTypeface");
          this.a.B.setTypeface(p0.a);
       }
       return;
    }
}
