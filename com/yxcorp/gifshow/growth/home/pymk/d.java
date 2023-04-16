package com.yxcorp.gifshow.growth.home.pymk.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import vna.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.entity.NasaRecommendUserFeed;
import tl8.d;
import java.util.Objects;
import vna.b;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.entity.RecommendUserMeta;
import java.util.List;
import java.util.Collection;
import com.yxcorp.gifshow.growth.home.pymk.a;
import vna.a;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.entity.RecommendUserWrapper;
import java.util.ArrayList;
import com.kwai.framework.model.user.User;
import qvb.a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.growth.home.pymk.f;
import lnc.a1;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import xtd.b;
import xtd.h;
import androidx.viewpager2.widget.b;
import vna.a0;
import androidx.viewpager2.widget.ViewPager2$j;
import wna.f;
import androidx.viewpager2.widget.ViewPager2$h;
import androidx.viewpager2.widget.ViewPager2;
import com.yxcorp.gifshow.growth.home.pymk.widget.a;
import com.yxcorp.gifshow.growth.home.pymk.b;
import androidx.recyclerview.widget.RecyclerView$l$a;
import androidx.recyclerview.widget.RecyclerView$l;
import qvb.i;
import y8c.g;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import g9c.a;
import com.yxcorp.gifshow.growth.home.pymk.c;
import erd.g;
import crd.b;
import brd.t;
import android.view.View;
import ekd.m1;
import io.reactivex.subjects.PublishSubject;
import java.lang.Boolean;
import java.lang.Integer;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class d extends PresenterV2	// class@00139f
{
    public final t p;
    public ViewPager2 q;
    public RecyclerView r;
    public b s;
    public PhotoDetailParam t;
    public PublishSubject u;
    public PublishSubject v;
    public BaseFragment w;
    public ValueAnimator x;
    public boolean y;
    public int z;

    public void d(){
       super();
       this.p = new t();
    }
    public void E8(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uod, "4")) {
          NasaRecommendUserFeed nasaRecommen = this.t.mPhoto.getEntity().a(NasaRecommendUserFeed.class);
          d ts = this.s;
          Objects.requireNonNull(ts);
          if (!PatchProxy.applyVoidOneRefsWithListener(nasaRecommen, ts, b.class, "1")) {
             ts.n = nasaRecommen;
             ts.o = nasaRecommen.mRecommendUserMeta.mPrsid;
             ts.m.clear();
             nasaRecommen = ts.n.mCacheUserWrapperList;
             if (nasaRecommen == null || nasaRecommen.isEmpty()) {
                RecommendUserMeta mUsersWrappe = ts.n.mRecommendUserMeta.mUsersWrapper;
                a a = a.a;
                a uoa = new a(ts);
                if (!PatchProxy.applyVoidThreeRefs(mUsersWrappe, a, uoa, ts, b.class, "3")) {
                   Iterator iterator = mUsersWrappe.iterator();
                   while (iterator.hasNext()) {
                      RecommendUserWrapper recommendUse = a.apply(iterator.next());
                      if (recommendUse == null || recommendUse.mFeed == null) {
                         continue ;
                      }
                      uoa.accept(recommendUse);
                      ts.m.add(recommendUse);
                   }
                }
             }else {
                ts.m.addAll(ts.n.mCacheUserWrapperList);
             }
             ArrayList uArrayList = new ArrayList(ts.m);
             for (int i1 = 0; i1 < uArrayList.size(); i1 = i1 + 1) {
                uArrayList.get(i1).mUser.mPosition = i1;
             }
             ts.l0(uArrayList);
             PatchProxy.onMethodExit(b.class, "1");
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uod, "5") && this.q != null) {
          int i = n.k(this.w.requireActivity());
          i = (this.y != null)? (i - this.z) / 2: (i - f.Q) / 2;
          this.r.setPadding(i, 0, (i - a1.d(R.dimen.arg_RES_7f0702d2)), 0);
          this.r.setClipToPadding(0);
          h.b(this.r, 1);
          b uob = new b();
          uob.b(new a0());
          f uof = new f(this.r);
          uof.c = uob;
          this.q.j(uof);
          this.r.setItemAnimator(new a(new b(this)));
          uod = this.p;
          uod.w = this.w;
          uod.q1(this.s);
          this.q.setAdapter(this.p);
          this.p.W0(this.s.getItems());
          this.p.k0();
       }
       this.X7(this.v.subscribe(new c(this)));
       return;
    }
    public void J8(){
       Object[] objArray = null;
       String str = "6";
       if (PatchProxy.applyVoid(objArray, this, d.class, str)) {
          return;
       }
       d ts = this.s;
       if (ts != null) {
          Objects.requireNonNull(ts);
          if (!PatchProxy.applyVoid(objArray, ts, b.class, str)) {
             b n = ts.n;
             if (n != null) {
                if (n.mCacheUserWrapperList == null) {
                   n.mCacheUserWrapperList = new ArrayList();
                }
                ts.n.mCacheUserWrapperList.clear();
                ts.n.mCacheUserWrapperList.addAll(ts.getItems());
             }
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       ViewPager2 viewPager2 = m1.f(p0, R.id.video_recycler_view);
       this.q = viewPager2;
       this.r = viewPager2.getChildAt(0);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.s = this.q8(b.class);
       this.t = this.q8(PhotoDetailParam.class);
       this.u = this.r8("PLAYER_STATUS_CHANGE");
       this.v = this.r8("CHANGE_TO_NEXT_USER");
       this.y = this.r8("SMALL_MODE").booleanValue();
       this.z = this.r8("PLAYER_WIDTH").intValue();
       this.w = this.q8(BaseFragment.class);
       return;
    }
}
