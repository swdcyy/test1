package com.yxcorp.gifshow.follow.stagger.header.d;
import nl8.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.feed.BaseFeed;
import o0b.a;
import java.lang.Long;
import via.q;
import androidx.lifecycle.Observer;
import java.lang.Boolean;
import via.p;
import com.yxcorp.gifshow.pymk.widget.PymkHorListView;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.follow.common.model.PymkBarFeed;
import com.yxcorp.gifshow.follow.common.model.PymkBarFeed$PymkBarMeta;
import java.lang.Number;
import y0b.h;
import java.util.HashMap;
import com.yxcorp.gifshow.listcomponent.event.a;
import java.util.Map;
import com.kuaishou.android.model.feed.PhotoType;
import java.util.Collection;
import ekd.q;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.follow.stagger.widget.FollowPymkHorListView;
import z0b.b;
import com.kwai.library.widget.refresh.RefreshLayout;
import via.r;
import o7c.b;
import androidx.recyclerview.widget.RecyclerView;
import xtd.a;
import via.s;
import ytd.b;
import via.o;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.util.List;
import androidx.fragment.app.Fragment;
import tyc.q4;
import ekd.m1;

public class d extends a	// class@0011bc
{
    public ViewGroup u;
    public View v;
    public FollowPymkHorListView w;

    public void d(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       this.d9(this.Y8());
       this.V8().c(Long.valueOf(this.a9()), "FOLLOW_BAR_FEED", BaseFeed.class, new q(this));
       this.V8().c(Long.valueOf(this.X8()), "FOLLOW_SELECTOR_IS_DEFAULT_RANK", Boolean.class, new p(this));
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, d.class, "6")) {
          return;
       }
       d tw = this.w;
       if (tw != null) {
          tw.z();
       }
       return;
    }
    public final BaseFeed Y8(){
       Object obj = PatchProxy.apply(null, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.V8().a(Long.valueOf(this.a9()), "FOLLOW_BAR_FEED", BaseFeed.class);
    }
    public final String Z8(){
       PymkBarFeed$PymkBarMeta mPrsid;
       BaseFeed obj = PatchProxy.apply(null, this, d.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.Y8();
       if (obj instanceof PymkBarFeed) {
          PymkBarFeed mPymkBarMeta = obj.mPymkBarMeta;
          if (mPymkBarMeta != null) {
             mPrsid = mPymkBarMeta.mPrsid;
          label_0023 :
             return mPrsid;
          }
       }
       mPrsid = "";
       goto label_0023 ;
    }
    public final long a9(){
       Object obj = PatchProxy.apply(null, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.W8().l().longValue();
    }
    public void b9(){
       if (PatchProxy.applyVoid(null, this, d.class, "10")) {
          return;
       }
       Boolean fALSE = Boolean.FALSE;
       if (!this.V8().b(Long.valueOf(this.a9()), "FOLLOW_IS_PYMK_BAR_SHOWING", Boolean.class, fALSE).booleanValue()) {
          return;
       }
       this.V8().d(Long.valueOf(this.a9()), "FOLLOW_IS_PYMK_BAR_SHOWING", fALSE);
       HashMap hashMap = new HashMap();
       hashMap.put("EXTRAS", "pymk");
       this.S8().e("kscc.event.page.arch.uninstall.header", hashMap);
       return;
    }
    public final boolean c9(){
       Object obj = PatchProxy.apply(null, this, d.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.V8().b(Long.valueOf(this.X8()), "FOLLOW_SELECTOR_IS_DEFAULT_RANK", Boolean.class, Boolean.TRUE).booleanValue();
    }
    public final void d9(BaseFeed p0){
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uod, "5")) {
          return;
       }
       if (!this.c9()) {
          return;
       }
       if (p0 != null && (PhotoType.fromFeed(p0).toInt() == PhotoType.PYMK_BAR_FEED.toInt() && p0 instanceof PymkBarFeed)) {
          PymkBarFeed mPymkBarMeta = p0.mPymkBarMeta;
          if (mPymkBarMeta == null) {
          label_00d7 :
             this.b9();
          }else if(q.f(mPymkBarMeta.mUserList)){
             this.b9();
          }else if(PatchProxy.applyVoidOneRefs(mPymkBarMeta, this, uod, "9")){
             this.V8().d(Long.valueOf(this.a9()), "FOLLOW_IS_PYMK_BAR_SHOWING", Boolean.TRUE);
             if (!PatchProxy.applyVoid(null, this, uod, "8") && this.v == null) {
                View view = a.k(this.u, R.layout.arg_RES_7f0d0476, true);
                this.v = view;
                FollowPymkHorListView uFollowPymkH = view.findViewById(R.id.recommend_list);
                this.w = uFollowPymkH;
                uFollowPymkH.setRefreshLayout(this.P8().Ac());
                this.w.setPymkHorListener(new r(this));
                this.w.setNestedScrollingEnabled(false);
                a uoa = new a(new s(this), 2.00f, 0x3f800000, -2.50f);
                this.v.findViewById(R.id.close_all).setOnClickListener(new o(this));
             }
             this.w.A(this.P8(), 4, this.Z8(), mPymkBarMeta.mUserList);
             q4.e(this.P8());
          }
       }else {
          goto label_00d7 ;
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a0f6a);
       return;
    }
}
