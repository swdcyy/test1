package com.yxcorp.gifshow.follow.stagger.post.MockViewPresenter;
import androidx.lifecycle.LifecycleObserver;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.follow.stagger.post.MockViewPresenter$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import dja.a;
import com.yxcorp.gifshow.follow.stagger.post.MockViewPresenter$b;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import com.yxcorp.gifshow.follow.stagger.post.MockViewPresenter$c;
import com.yxcorp.gifshow.follow.stagger.post.MockViewPresenter$d;
import androidx.lifecycle.MutableLiveData;
import com.yxcorp.gifshow.follow.stagger.post.MockViewPresenter$e;
import android.view.View;
import com.kwai.library.widget.progressbar.DownloadProgressBar;
import android.graphics.Typeface;
import android.widget.ProgressBar;
import lnc.a1;
import android.graphics.Paint$Cap;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;

public final class MockViewPresenter extends PresenterV2 implements LifecycleObserver	// class@0011d6
{
    public BaseFragment p;
    public DownloadProgressBar q;
    public KwaiImageView r;
    public View s;
    public a t;
    public final Runnable u;

    public void MockViewPresenter(){
       super();
       this.u = new MockViewPresenter$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, MockViewPresenter.class, "7")) {
          return;
       }
       MockViewPresenter tp = this.p;
       String str = "mFragment";
       if (tp == null) {
          a.S(str);
       }
       tp.getLifecycle().addObserver(this);
       tp = this.t;
       if (tp == null) {
          a.S("mockFeedViewModel");
       }
       a h = tp.h;
       MockViewPresenter tp1 = this.p;
       if (tp1 == null) {
          a.S(str);
       }
       h.observe(tp1, new MockViewPresenter$b(this));
       h = tp.g;
       tp1 = this.p;
       if (tp1 == null) {
          a.S(str);
       }
       h.observe(tp1, new MockViewPresenter$c(this));
       LiveData liveData = tp.o0();
       tp1 = this.p;
       if (tp1 == null) {
          a.S(str);
       }
       liveData.observe(tp1, new MockViewPresenter$d(this));
       MutableLiveData mutableLiveD = tp.p0();
       MockViewPresenter tp2 = this.p;
       if (tp2 == null) {
          a.S(str);
       }
       mutableLiveD.observe(tp2, new MockViewPresenter$e(this));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, MockViewPresenter.class, "8")) {
          return;
       }
       MockViewPresenter tp = this.p;
       if (tp == null) {
          a.S("mFragment");
       }
       tp.getLifecycle().removeObserver(this);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MockViewPresenter.class, "6")) {
          return;
       }
       KwaiImageView kwaiImageVie = null;
       View view = (p0 != null)? p0.findViewById(R.id.mock_feed_progress_layout): kwaiImageVie;
       this.s = view;
       boolean b = true;
       if (view != null) {
          view.setClickable(b);
       }
       DownloadProgressBar uDownloadPro = (p0 != null)? p0.findViewById(R.id.mock_feed_progress): kwaiImageVie;
       this.q = uDownloadPro;
       if (uDownloadPro != null) {
          uDownloadPro.setFakeBoldText(b);
          uDownloadPro.setProgressTextTypeFace(Typeface.DEFAULT_BOLD);
          uDownloadPro.setMax(100);
          uDownloadPro.setIndeterminate(false);
          uDownloadPro.setProgressTextColor(a1.a(R.color.arg_RES_7f061ff3));
          uDownloadPro.setProgressArcBackgroundColor(a1.a(R.color.arg_RES_7f060610));
          uDownloadPro.setProgressArcColor(a1.a(R.color.arg_RES_7f0620c7));
          uDownloadPro.setProgressArcWidth(((float)a1.d(R.dimen.arg_RES_7f070329) / (float)2));
          uDownloadPro.setProgressTextSize((float)a1.d(R.dimen.arg_RES_7f070f89));
          uDownloadPro.setProgressArcPaintStrokeCap(Paint$Cap.ROUND);
       }
       if (p0 != null) {
          kwaiImageVie = p0.findViewById(0x7f0a2bd5);
       }
       this.r = kwaiImageVie;
       if (kwaiImageVie != null) {
          kwaiImageVie.setOverlayColor(R.color.arg_RES_7f0600a7);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, MockViewPresenter.class, "5")) {
          return;
       }
       ViewModel obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.p = obj;
       obj = ViewModelProviders.of(obj).get(a.class);
       a.o(obj, "ViewModelProviders.of\(mF¡­eedViewModel::class.java\)");
       this.t = obj;
       return;
    }
}
