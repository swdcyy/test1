package com.kuaishou.live.core.show.profilecard.photo.j;
import a51.c;
import java.util.HashSet;
import com.kuaishou.live.core.show.profilecard.photo.j$a;
import lf2.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import androidx.recyclerview.widget.GridLayoutManager;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import lf2.i;
import androidx.recyclerview.widget.RecyclerView$n;
import com.kuaishou.live.core.show.profilecard.photo.h;
import wj2.r;
import lf2.f;
import com.kwai.framework.model.user.User;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.Fragment;
import lf2.m;
import com.kuaishou.live.core.show.profilecard.photo.k;
import y8c.g;
import androidx.recyclerview.widget.RecyclerView$i;
import e9c.b;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kuaishou.live.core.show.profilecard.photo.j$b;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kuaishou.live.core.show.profilecard.photo.l;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.core.show.profilecard.photo.LiveProfileFeedCacheManager;
import com.kuaishou.live.core.show.profilecard.photo.j$c;
import qvb.q;
import qvb.a;
import lf2.j;
import com.kuaishou.live.core.show.profilecard.photo.i;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import lf2.e;
import lf2.d;
import java.lang.Runnable;
import android.view.ViewGroup;
import java.util.Set;
import android.app.Activity;
import java.util.List;
import java.util.Collection;
import ekd.q;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.Math;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.CommonMeta;
import tl8.d;
import wkd.b;
import le2.b;
import java.util.Objects;
import ne2.k;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.util.HashMap;
import yp.x;
import com.google.gson.Gson;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.recycler.widget.CustomRecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import qf2.g;
import wj2.o0;
import com.kuaishou.live.core.show.profilecard.contentarea.LiveProfileContentAreaHeightService;
import p91.m;

public class j extends c	// class@000dee
{
    public LiveProfileContentAreaHeightService A;
    public o0 B;
    public ViewGroup C;
    public CustomRecyclerView D;
    public AppBarLayout E;
    public h F;
    public l G;
    public j$c H;
    public GridLayoutManager I;
    public boolean J;
    public final Set K;
    public boolean L;
    public final RecyclerView$i M;
    public final Runnable N;
    public r v;
    public LiveProfileParams w;
    public GifshowActivity x;
    public Fragment y;
    public g z;
    public static String sLivePresenterClassName = "LiveProfilePhotoListPresenter";

    public void j(){
       super();
       this.J = false;
       this.K = new HashSet();
       this.M = new j$a(this);
       this.N = new h(this);
    }
    public void E8(){
       boolean b;
       boolean b1;
       j oj = j.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oj, "4")) {
          return;
       }
       super.E8();
       if (!PatchProxy.applyVoid(objArray, this, oj, "9")) {
          b.c0(LiveLogTag.LIVE_PROFILE, "prepareProfilePhotoList", "userId", this.V8());
          GridLayoutManager gridLayoutMa = new GridLayoutManager(this.getContext(), 3);
          this.I = gridLayoutMa;
          this.D.setLayoutManager(gridLayoutMa);
          this.D.addItemDecoration(new i(this));
          h oh = new h(this.v.b, this.w, this.x, this.y, new f(this));
          this.F = gridLayoutMa;
          gridLayoutMa.E = new k(this);
          this.F.D = this.w.isCanOpenFullProfile();
          j tF = this.F;
          tF.F0(b.a(tF, this.x));
          this.F.F0(this.M);
          this.D.addOnScrollListener(new j$b(this));
          this.D.setAdapter(this.F);
          String str = this.V8();
          String str1 = this.S8();
          l obj = PatchProxy.apply(objArray, this, oj, "10");
          b = false;
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(!this.w.isShouldForceRemoveLiveFeedInPhotoList()){
             Object obj1 = PatchProxy.apply(objArray, this, oj, "11");
             if (obj1 != PatchProxyResult.class) {
                b1 = obj1.booleanValue();
             }else if(this.w.isCanOpenFullProfile() && (this.w.getUserProfile().mProfile.mId).equals(this.w.getAnchorUserId())){
                b1 = true;
             }else {
                b1 = false;
             }
             if (!b1) {
             label_00e6 :
                obj = new l(str, false, str1, b, this.w.getLiveProfileFeedCacheManager());
                this.G = tF;
                j$c uoc = new j$c(this);
                this.H = uoc;
                this.G.h(uoc);
                if (!this.w.shouldHideLoading()) {
                   this.F.s1(1);
                }
                this.D.addOnScrollListener(new j(this));
             }
          }
          b = true;
          goto label_00e6 ;
       }
       oj = this.v;
       oj.n.observe(oj.e, new i(this));
       oj = this.v;
       oj.q.observe(oj.e, new e(this));
       oj = this.v;
       oj.o.observe(oj.e, new d(this));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, j.class, "7")) {
          return;
       }
       super.J8();
       this.J = false;
       this.D.clearOnScrollListeners();
       this.D.removeCallbacks(this.N);
       j tG = this.G;
       if (tG != null) {
          tG.f(this.H);
       }
       this.K.clear();
       return;
    }
    public String S8(){
       Object obj = PatchProxy.apply(null, this, j.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getActivity() instanceof GifshowActivity) {
          return this.getActivity().getUrl();
       }
       return "";
    }
    public String V8(){
       Object obj = PatchProxy.apply(null, this, j.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.v.d();
    }
    public void W8(){
       boolean b;
       if (PatchProxy.applyVoid(null, this, j.class, "15")) {
          return;
       }
       b.c0(LiveLogTag.LIVE_PROFILE, "onListRefreshComplete", "userId", this.V8());
       if (this.J != null) {
          return;
       }
       b = true;
       this.J = b;
       if (!this.w.shouldHideLoading()) {
          this.F.z1(b);
       }
       if (q.f(this.G.getItems())) {
          this.F.s1(2);
          this.F.l0(0);
       }
       return;
    }
    public void X8(){
       if (PatchProxy.applyVoid(null, this, j.class, "14")) {
          return;
       }
       List list = this.F.v1();
       if (list != null && !list.isEmpty()) {
          int i = Math.max(0, this.I.i0());
          int i1 = Math.min((list.size() - 1), this.I.c());
          while (i <= i1) {
             BaseFeed uBaseFeed = list.get(i);
             CommonMeta uCommonMeta = uBaseFeed.a(CommonMeta.class);
             if (uCommonMeta != null && !this.K.contains(uBaseFeed.getId())) {
                this.K.add(uBaseFeed.getId());
                uCommonMeta.mPosition = i;
                uCommonMeta.mShowed = true;
                int i2 = i % 3;
                int i3 = 2;
                if (!i2) {
                   i3 = 1;
                }else if(i2 == i3){
                   i3 = 0;
                }
                uCommonMeta.mDirection = i3;
                b.a(-1787676707).a(uBaseFeed);
                j tv = this.v;
                r s = tv.s;
                String str = (tv.e())? "LIVE_SHOW_PHOTO": "SHOW_PHOTO";
                Objects.requireNonNull(s);
                if (!PatchProxy.applyVoidTwoRefs(str, uBaseFeed, s, k.class, "9")) {
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = str;
                   HashMap hashMap = new HashMap();
                   hashMap.put("lv_params", x.g(uBaseFeed));
                   uElementPack.params = new Gson().q(hashMap);
                   u1.u0(9, uElementPack, s.b(uBaseFeed));
                }
             }
          label_00c2 :
             i = i + 1;
          }
       }
       return;
    }
    public void Y8(){
       if (PatchProxy.applyVoid(null, this, j.class, "8")) {
          return;
       }
       this.D.removeCallbacks(this.N);
       this.D.post(this.N);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "3")) {
          return;
       }
       this.C = m1.f(p0, 0x7f0a2373);
       this.D = m1.f(p0, 0x7f0a23aa);
       this.E = m1.f(p0, 0x7f0a2361);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       this.v = this.q8(r.class);
       this.w = this.q8(LiveProfileParams.class);
       this.x = this.q8(GifshowActivity.class);
       this.y = this.q8(Fragment.class);
       this.z = this.q8(g.class);
       this.B = this.s8(o0.class);
       this.A = this.q8(LiveProfileContentAreaHeightService.class);
       this.v.b();
       return;
    }
}
