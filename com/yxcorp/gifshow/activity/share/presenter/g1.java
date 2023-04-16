package com.yxcorp.gifshow.activity.share.presenter.g1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.edit.draft.Workspace$From;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import android.view.View;
import com.yxcorp.gifshow.visible.ShareVisibleRepo;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import com.yxcorp.gifshow.activity.share.presenter.g1$a;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.yxcorp.gifshow.visible.ShareVisibleViewModel;
import androidx.lifecycle.ViewModel;
import com.yxcorp.gifshow.visible.PhotoVisibilityController;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleObserver;
import zw8.m2;
import java.util.Objects;
import java.util.ArrayList;
import com.kwai.feature.post.api.feature.story.model.PhotoVisibility;
import java.util.List;
import android.graphics.drawable.Drawable;
import android.widget.RadioButton;
import java.util.Iterator;
import com.yxcorp.gifshow.activity.share.ShareActivity;
import com.yxcorp.gifshow.activity.share.viewbinder.AbsShareActivityViewBinder;
import rxc.c;
import com.kuaishou.viewbinder.IViewBinder;
import android.widget.RadioGroup;
import android.widget.RadioGroup$OnCheckedChangeListener;
import c35.p;
import com.yxcorp.gifshow.visible.d;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.activity.share.widget.InterceptRadioButton;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import lnc.a1;
import java.lang.CharSequence;
import bba.b;
import wba.f0;
import xw8.p0;
import crd.a;
import ekd.m1;

public class g1 extends PresenterV2	// class@0013e5
{
    public GifshowActivity p;
    public p0 q;
    public b r;
    public c s;
    public KtvInfo t;
    public View u;
    public VideoContext v;
    public PhotoVisibilityController w;
    public ShareVisibleRepo x;

    public void g1(){
       super();
    }
    public void E8(){
       g1 og1 = g1.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, og1, "3")) {
          return;
       }
       g1 ts = this.s;
       if (ts != null && ts.B0() == Workspace$From.NEW_USER_WIDGET) {
          this.u.setVisibility(8);
          return;
       }else {
          int i = 0;
          this.u.setVisibility(i);
          this.x = new ShareVisibleRepo(this.s, this.v, this.t);
          ViewModelProviders.of(this.p, new g1$a(this)).get(ShareVisibleViewModel.class);
          this.w = new PhotoVisibilityController(this.p, this.s);
          this.p.getLifecycle().addObserver(this.w);
          ts = this.w;
          ts.h = new m2(this);
          g1 tu = this.u;
          Objects.requireNonNull(ts);
          PhotoVisibilityController photoVisibil = PhotoVisibilityController.class;
          if (!PatchProxy.applyVoidOneRefs(tu, ts, photoVisibil, "2")) {
             ts.doBindView(tu);
             if (!PatchProxy.applyVoid(objArray, ts, photoVisibil, "4")) {
                ArrayList uArrayList = new ArrayList();
                ts.i = uArrayList;
                uArrayList.add(PhotoVisibility.PUBLIC);
                ts.i.add(PhotoVisibility.FRIENDS);
                ts.i.add(PhotoVisibility.PRIVATE);
                if (!PatchProxy.applyVoid(objArray, ts, photoVisibil, "7")) {
                   ts.f.setBackground(objArray);
                   Iterator iterator = ts.i.iterator();
                   while (iterator.hasNext()) {
                      PhotoVisibility photoVisibil1 = iterator.next();
                      if (!i) {
                         ts.b(ts.e, photoVisibil1);
                      }else if(i == 1){
                         ts.b(ts.d, photoVisibil1);
                      }else {
                         ts.b(ts.f, photoVisibil1);
                      }
                      i = i + 1;
                   }
                }
             }
             p.b(ts.j.G3(), ts.c, new c(ts));
             ts.d.setInterceptClickListener(new d(ts));
             if (PostExperimentUtils.U0()) {
                ts.d.setText(a1.p(R.string.arg_RES_7f10477f));
             }
          }
          if (!PatchProxy.applyVoid(objArray, this, og1, "4")) {
             this.q.m(f0.a(this.r));
          }
          return;
       }
    }
    public void H8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, g1.class, "6")) {
          return;
       }
       g1 tx = this.x;
       if (tx != null) {
          Objects.requireNonNull(tx);
          if (!PatchProxy.applyVoid(objArray, tx, ShareVisibleRepo.class, "16")) {
             tx.h.dispose();
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, g1.class, "5")) {
          return;
       }
       this.p.getLifecycle().removeObserver(this.w);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g1.class, "2")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a3075);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g1.class, "1")) {
          return;
       }
       this.p = this.r8("SHARE_ACTIVITY");
       this.q = this.r8("SHARE_PAGE_PRESENTER_MODEL");
       this.r = this.t8("PUBLISH");
       this.t = this.t8("SHARE_KTV_INFO");
       this.s = this.t8("WORKSPACE");
       this.v = this.t8("SHARE_VIDEO_CONTEXT");
       return;
    }
}
