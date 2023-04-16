package com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.presenter.a$h;
import zq6.u;
import com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.presenter.a;
import java.lang.Object;
import co5.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import wq6.h;
import android.view.View;

public final class a$h implements u	// class@00171b
{
    public final a a;

    public void a$h(a p0){
       this.a = p0;
       super();
    }
    public void onChange(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$h.class, "1")) {
       }else {
          a.p(p0, "tabBubble");
          a$h ta = this.a;
          ta.Y8(a.V8(ta), a.S8(this.a), this.a.B, p0);
       }
       return;
    }
}
