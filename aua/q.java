package aua.q;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.CommonMeta;
import ga5.b;
import android.view.View;
import com.kwai.framework.model.user.User;
import java.lang.Boolean;
import im8.f;
import ekd.m1;

public class q extends PresenterV2	// class@00031c
{
    public User p;
    public f q;
    public View r;
    public CommonMeta s;

    public void q(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, q.class, "3")) {
          return;
       }
       int i = 4;
       if (b.d(this.s)) {
          this.r.setVisibility(i);
          return;
       }else {
          q tq = this.q;
          if (tq != null) {
             tq.set(Boolean.valueOf(this.p.mFavorited));
          }
          tq = this.r;
          if (this.p.mFavorited != null) {
             i = 0;
          }
          tq.setVisibility(i);
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a0def);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, q.class, "1")) {
          return;
       }
       this.p = this.q8(User.class);
       this.q = this.w8("FEED_HAS_SHOWN_FAVORITE_ICON");
       this.s = this.q8(CommonMeta.class);
       return;
    }
}
