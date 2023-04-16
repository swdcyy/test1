package fia.f$c;
import tw6.e;
import fia.f;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import kotlin.jvm.internal.a;
import cha.a;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import cia.w;
import android.animation.ObjectAnimator;
import bia.d;
import android.animation.ValueAnimator;
import bia.j;

public final class f$c implements e	// class@0028fe
{
    public final f a;

    public void f$c(f p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       f p;
       f$c uoc = f$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "2")) {
          return;
       }
       f$c ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, f.class, "27")) {
          f u = ta.u;
          String str = "mFollowViewPagerState";
          if (u == null) {
             a.S(str);
          }
          if (!u.b()) {
             p = ta.p;
             if (p == null) {
                a.S("mFollowSlideInjectAdapter");
             }
             SlidePlayViewModel slidePlayVie = p.O();
             if (slidePlayVie != null) {
                slidePlayVie.d(true, 2);
             }
          }else {
             u = ta.E;
             if (u == null) {
                a.S("mViewPagerExpandAnimator");
             }
             u.start();
             u = ta.v;
             if (u == null) {
                a.S("mLiveTipsEntranceState");
             }
             u.e(false);
             p = ta.u;
             if (p == null) {
                a.S(str);
             }
             p.d(false);
          }
       }
       return;
    }
    public void b(int p0){
       f p;
       f$c uoc = f$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "1")) {
          return;
       }
       f$c ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, f.class, "26")) {
          f u = ta.u;
          if (u == null) {
             a.S("mFollowViewPagerState");
          }
          if (u.b()) {
             p = ta.p;
             if (p == null) {
                a.S("mFollowSlideInjectAdapter");
             }
             SlidePlayViewModel slidePlayVie = p.O();
             if (slidePlayVie != null) {
                slidePlayVie.d(true, 2);
             }
          }else {
             u = ta.D;
             if (u == null) {
                a.S("mViewPagerCollapseAnimator");
             }
             u.start();
             if (!ta.X8()) {
                u = ta.w;
                if (u == null) {
                   a.S("mFollowScreenState");
                }
                if (u.b()) {
                   u = ta.v;
                   if (u == null) {
                      a.S("mLiveTipsEntranceState");
                   }
                   u.e(true);
                }
             }
             p = ta.u;
             if (p == null) {
                a.S("mFollowViewPagerState");
             }
             p.d(true);
          }
       }
       return;
    }
}
