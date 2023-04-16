package com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.presenter.a$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.homepage.kcube.actionbar.tabview.presenter.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import android.view.View;
import kotlin.jvm.internal.a;
import android.view.ViewTreeObserver;

public final class a$b implements ViewTreeObserver$OnGlobalLayoutListener	// class@001715
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "1")) {
          return;
       }
       View view = a.V8(this.b).b();
       a.o(view, "stripTab.customView");
       view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       this.b.Z8();
       return;
    }
}
