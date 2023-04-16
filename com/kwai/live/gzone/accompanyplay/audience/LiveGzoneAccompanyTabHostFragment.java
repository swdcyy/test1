package com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAccompanyTabHostFragment;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import io.reactivex.subjects.PublishSubject;
import com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAccompanyTabHostFragment$a;
import com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAccompanyTabHostFragment$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import androidx.viewpager.widget.ViewPager$i;
import androidx.viewpager.widget.ViewPager;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import android.os.Bundle;
import com.yxcorp.gifshow.image.KwaiImageView;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import l0d.d;
import xb.t$b;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import com.yxcorp.gifshow.widget.GzonePagerSlidingTabStrip;
import brd.t;
import com.kwai.live.gzone.accompanyplay.audience.k0$g;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import com.trello.rxlifecycle3.components.support.RxFragment;
import brd.x;
import com.kwai.live.gzone.accompanyplay.audience.p;
import erd.g;
import crd.b;
import com.kwai.live.gzone.accompanyplay.audience.n0;
import com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAccompanyTabHostFragment$d;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAccompanyTabHostFragment$c;
import com.yxcorp.gifshow.widget.GzonePagerSlidingTabStrip$e;
import android.content.Context;
import androidx.fragment.app.Fragment;
import lnc.a1;
import android.widget.TextView;
import f37.o0;
import com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAccompanyJoinFragment;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import com.kwai.library.widget.viewpager.tabstrip.b;
import java.util.ArrayList;
import ekd.j;

public class LiveGzoneAccompanyTabHostFragment extends TabHostFragment	// class@000b61
{
    public k0$g B;
    public p0$e C;
    public PublishSubject D;
    public KwaiImageView E;
    public PresenterV2 F;
    public String G;
    public String H;
    public ViewPager$i I;
    public LiveGzoneAccompanyTabHostFragment$e J;
    public static final int K;

    public void LiveGzoneAccompanyTabHostFragment(){
       super();
       this.D = PublishSubject.g();
       this.I = new LiveGzoneAccompanyTabHostFragment$a(this);
       this.J = new LiveGzoneAccompanyTabHostFragment$b(this);
    }
    public int Bh(){
       return 0x7f0a11e9;
    }
    public int getLayoutResId(){
       return 0x7f0d0b71;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneAccompanyTabHostFragment.class, "5")) {
          return;
       }
       super.onDestroyView();
       this.u.removeOnPageChangeListener(this.I);
       this.F.destroy();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGzoneAccompanyTabHostFragment.class, "1")) {
          return;
       }
       super.onViewCreated(p0, p1);
       KwaiImageView kwaiImageVie = p0.findViewById(R.id.gzone_accompany_popup_background);
       this.E = kwaiImageVie;
       kwaiImageVie.getHierarchy().u(new d());
       this.t.v(false);
       this.u.addOnPageChangeListener(this.I);
       this.t.O(false, false);
       if (!PatchProxy.applyVoid(null, this, LiveGzoneAccompanyTabHostFragment.class, "4")) {
          this.B.n().compose(this.Ug(FragmentEvent.DESTROY_VIEW)).subscribe(new p(this));
       }
       this.t.A(false, 1);
       n0 on0 = new n0();
       this.F = on0;
       on0.f(p0);
       LiveGzoneAccompanyTabHostFragment$d uod = new LiveGzoneAccompanyTabHostFragment$d();
       uod.b = this.B;
       uod.d = this.C;
       uod.c = this.J;
       Object[] objArray = new Object[]{uod};
       this.F.i(objArray);
       return;
    }
    public List wh(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, LiveGzoneAccompanyTabHostFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b[] uobArray = new b[]{new LiveGzoneAccompanyTabHostFragment$c(this, new GzonePagerSlidingTabStrip$e("accompanyTab", o0.e(this.getContext(), a1.p(0x7f10230e))), LiveGzoneAccompanyJoinFragment.class, objArray)};
       return j.a(uobArray);
    }
}
