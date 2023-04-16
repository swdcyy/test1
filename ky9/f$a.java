package ky9.f$a;
import qvb.q;
import ky9.f;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;
import ly9.m;
import qvb.p;
import ly9.f;
import java.util.Objects;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.user.QCurrentUser;
import ly9.g;
import com.yxcorp.gifshow.detail.common.information.marquee.model.MarqueeConfig;
import com.yxcorp.gifshow.detail.common.information.marquee.model.MarqueeResponse$a;
import com.yxcorp.gifshow.detail.common.information.marquee.model.e;
import java.util.List;
import qvb.a;
import java.util.Collection;
import ekd.q;
import qvb.n0;
import com.yxcorp.gifshow.detail.common.information.marquee.model.MarqueeResponse;
import ly9.k;
import gr7.j;
import pp7.b;
import java.lang.Integer;
import xq7.e;
import io.reactivex.subjects.PublishSubject;

public final class f$a implements q	// class@002d26
{
    public final f b;

    public void f$a(f p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       if (PatchProxy.isSupport(f$a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, f$a.class, "2")) {
          return;
       }
       a.p(p1, "error");
       this.b.e.c(false);
       return;
    }
    public void Z1(boolean p0,boolean p1){
       if (PatchProxy.isSupport(f$a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, f$a.class, "1")) {
          return;
       }
       this.b.e.c(true);
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       if (PatchProxy.isSupport(f$a.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, f$a.class, "4")) {
          return;
       }
       this.b.d();
       return;
    }
    public void v2(boolean p0,boolean p1){
       f f;
       k e;
       f uof = f.class;
       f$a uoa = f$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "3")) {
          return;
       }
       f g = this.b.g;
       Objects.requireNonNull(g);
       if (!PatchProxy.isSupport(uof) || (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), g, uof, "10") && g.a.getPhotoMeta() != null)) {
          MarqueeResponse$a uoa1 = e.b(QCurrentUser.me(), g.b.a.simpleEnabled);
          if (g.a.isLiked()) {
             if (!g.c.getItems().contains(uoa1)) {
                g.c.add(g.h, uoa1);
             }else {
                int i = g.c.getItems().indexOf(uoa1);
                if (i != g.c.getItems().lastIndexOf(uoa1)) {
                   g.a(uoa1);
                   g.c.add(i, uoa1);
                }
             }
             if (!q.f(g.j)) {
                g.j.remove(uoa1);
             }
          }else if(p0){
             g.a(uoa1);
          }else if(!g.j.contains(uoa1)){
             g.j.add(uoa1);
          }
       }
       if (p0) {
          f$a tb = this.b;
          g = tb.f;
          MarqueeResponse mDisableLoop = tb.d.L0().mDisableLoop;
          Objects.requireNonNull(g);
          k ok = k.class;
          if (!PatchProxy.isSupport(ok) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(mDisableLoop), g, ok, "6")) {
             e = g.e;
             Objects.requireNonNull(e);
             j oj = j.class;
             if (!PatchProxy.isSupport(oj) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(mDisableLoop), e, oj, "7")) {
                e.h.f(Boolean.valueOf(mDisableLoop));
             }
          }
          tb = this.b;
          g = tb.g;
          mDisableLoop = tb.d.L0().mLikeCount;
          MarqueeResponse mCommentCoun = this.b.d.L0().mCommentCount;
          Objects.requireNonNull(g);
          if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(mDisableLoop), Integer.valueOf(mCommentCoun), g, uof, "12")) {
             if (mDisableLoop >= null && mDisableLoop > g.a.numberOfLike()) {
                g.a.setNumberOfLike(mDisableLoop);
             }
             if (mCommentCoun >= null) {
                f = g.f;
                Objects.requireNonNull(f);
                e uoe = e.class;
                if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(mCommentCoun), f, uoe, "23")) {
                   f.k.onNext(Integer.valueOf(mCommentCoun));
                }
             }
          }
       }
    label_015b :
       this.b.d();
       return;
    }
}
