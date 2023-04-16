package com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAccompanyTabHostFragment$b;
import com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAccompanyTabHostFragment$e;
import com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAccompanyTabHostFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.accompanyplay.audience.k0$g;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import com.kwai.library.widget.viewpager.tabstrip.a;
import androidx.viewpager.widget.ViewPager;

public class LiveGzoneAccompanyTabHostFragment$b implements LiveGzoneAccompanyTabHostFragment$e	// class@000b5d
{
    public final LiveGzoneAccompanyTabHostFragment a;

    public void LiveGzoneAccompanyTabHostFragment$b(LiveGzoneAccompanyTabHostFragment p0){
       this.a = p0;
       super();
    }
    public void k1(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneAccompanyTabHostFragment$b.class, "2")) {
          return;
       }
       LiveGzoneAccompanyTabHostFragment b = this.a.B;
       if (b != null) {
          b.k1();
       }
       return;
    }
    public void l1(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneAccompanyTabHostFragment$b.class, "4")) {
          return;
       }
       this.p1(p0, null);
       return;
    }
    public void m1(CDNUrl[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneAccompanyTabHostFragment$b.class, "5")) {
          return;
       }
       this.a.E.U(p0);
       return;
    }
    public PublishSubject n1(){
       return this.a.D;
    }
    public void o1(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneAccompanyTabHostFragment$b.class, "1")) {
          return;
       }
       LiveGzoneAccompanyTabHostFragment b = this.a.B;
       if (b != null) {
          b.i();
       }
       return;
    }
    public void p1(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGzoneAccompanyTabHostFragment$b.class, "3")) {
          return;
       }
       int i = this.a.v.c(p0);
       if (this.a.ph() != i && i >= 0) {
          LiveGzoneAccompanyTabHostFragment$b ta = this.a;
          ta.H = p1;
          ta.u.setCurrentItem(i, true);
       }
       return;
    }
}
