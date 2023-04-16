package com.yxcorp.gifshow.detail.slidev2.presenter.feature.atlas.horizontal.SlideHorizontalAtlasDownloadPresenter;
import e8a.t;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.atlas.horizontal.SlideHorizontalAtlasDownloadPresenter$mDoubleClickContentListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import vd5.c;
import java.util.Set;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import ekd.m1;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class SlideHorizontalAtlasDownloadPresenter extends t	// class@00193a
{
    public Set r;
    public SlideHorizontalAtlasPlayer s;
    public final p t;

    public void SlideHorizontalAtlasDownloadPresenter(){
       super();
       this.t = s.c(new SlideHorizontalAtlasDownloadPresenter$mDoubleClickContentListener$2(this));
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, SlideHorizontalAtlasDownloadPresenter.class, "6")) {
          return;
       }
       SlideHorizontalAtlasDownloadPresenter tr = this.r;
       if (tr == null) {
          a.S("mDoubleClickContentListeners");
       }
       tr.add(this.R8());
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, SlideHorizontalAtlasDownloadPresenter.class, "7")) {
          return;
       }
       SlideHorizontalAtlasDownloadPresenter tr = this.r;
       if (tr == null) {
          a.S("mDoubleClickContentListeners");
       }
       tr.remove(this.R8());
       return;
    }
    public final c R8(){
       Object obj = PatchProxy.apply(null, this, SlideHorizontalAtlasDownloadPresenter.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.t.getValue();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideHorizontalAtlasDownloadPresenter.class, "5")) {
          return;
       }
       p0 = m1.f(p0, R.id.autoplay_cover_view_page_style);
       a.o(p0, "bindWidget\(rootView, R.i¡­ay_cover_view_page_style\)");
       this.s = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, SlideHorizontalAtlasDownloadPresenter.class, "1")) {
          return;
       }
       super.j8();
       Object obj = this.r8("DETAIL_DOUBLE_CLICK_LISTENERS");
       a.o(obj, "inject\(AccessIds.DETAIL_DOUBLE_CLICK_LISTENERS\)");
       this.r = obj;
       return;
    }
}
