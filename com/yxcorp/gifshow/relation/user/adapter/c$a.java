package com.yxcorp.gifshow.relation.user.adapter.c$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.relation.user.adapter.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.scrollview.HorizontalSlideView$b;
import com.kwai.library.widget.scrollview.HorizontalSlideView;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.relation.user.adapter.a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.relation.user.adapter.b;
import com.kwai.framework.model.user.User;

public class c$a extends PresenterV2	// class@0019eb
{
    public HorizontalSlideView p;
    public User q;
    public final c r;
    public final c s;

    public void c$a(c p0,c p1){
       this.s = p0;
       super();
       this.r = p1;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "3")) {
          return;
       }
       this.p.setOnSlideListener(this.r);
       this.p.setOffsetDelta(0x3ea8f5c3);
       this.p.c(false);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3a5a);
       m1.a(p0, new a(this), R.id.blockuser_button);
       m1.a(p0, new b(this), R.id.remove_follower_button);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "1")) {
          return;
       }
       this.q = this.q8(User.class);
       return;
    }
}
