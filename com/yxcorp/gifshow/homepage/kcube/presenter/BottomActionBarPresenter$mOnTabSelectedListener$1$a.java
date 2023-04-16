package com.yxcorp.gifshow.homepage.kcube.presenter.BottomActionBarPresenter$mOnTabSelectedListener$1$a;
import z1.a;
import com.yxcorp.gifshow.homepage.kcube.presenter.BottomActionBarPresenter$mOnTabSelectedListener$1;
import com.yxcorp.gifshow.homepage.kcube.actionbar.bottom.widget.BottomTabView;
import java.lang.Object;
import vn5.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.homepage.kcube.presenter.BottomActionBarPresenter;
import wq6.f;

public final class BottomActionBarPresenter$mOnTabSelectedListener$1$a implements a	// class@001749
{
    public final BottomActionBarPresenter$mOnTabSelectedListener$1 a;
    public final BottomTabView b;
    public final int c;

    public void BottomActionBarPresenter$mOnTabSelectedListener$1$a(BottomActionBarPresenter$mOnTabSelectedListener$1 p0,BottomTabView p1,int p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BottomActionBarPresenter$mOnTabSelectedListener$1$a.class, "1")) {
       }else {
          a.p(p0, "func");
          boolean b = this.a.d.Z8(this.b);
          boolean b1 = a.g("userScroll", this.a.d.X8().D0());
          boolean b2 = (this.a.d.p == this.c)? true: false;
          p0.a(b, b1, b2);
       }
       return;
    }
}
