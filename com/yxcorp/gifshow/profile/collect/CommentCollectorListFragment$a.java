package com.yxcorp.gifshow.profile.collect.CommentCollectorListFragment$a;
import com.yxcorp.gifshow.fragment.f;
import com.yxcorp.gifshow.profile.collect.CommentCollectorListFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup;
import i2b.a;
import p5c.c;
import com.yxcorp.gifshow.profile.status.panel.StatusPanelListFragment;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.PhotoMeta;
import kp.r1;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import g9c.d;
import java.lang.Throwable;
import java.lang.Boolean;
import com.yxcorp.retrofit.model.KwaiException;
import com.kwai.library.widget.refresh.RefreshLayout;
import androidx.recyclerview.widget.RecyclerView;
import qvb.i;
import mkc.b;
import com.yxcorp.utility.n;

public class CommentCollectorListFragment$a extends f	// class@001296
{
    public View l;
    public KwaiException m;
    public View n;
    public KwaiEmptyStateView o;
    public KwaiEmptyStateView p;
    public final CommentCollectorListFragment q;

    public void CommentCollectorListFragment$a(CommentCollectorListFragment p0,RecyclerFragment p1){
       this.q = p0;
       super(p1);
    }
    public View J0(){
       KwaiEmptyStateView obj = PatchProxy.apply(null, this, CommentCollectorListFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.i = a.i(this.a, 0x7f0d01bf);
       this.o = this.i.findViewById(0x7f0a0834);
       if (r1.u1(this.q.Gh().b.mEntity).mCollectCount <= 0) {
          obj = this.a().a(this.o);
          obj.g(R.string.arg_RES_7f1007ab);
          obj.setRetryBtnVisibility(8);
       }else {
          obj = this.a().a(this.o);
          obj.g(R.string.arg_RES_7f103e27);
          obj.setRetryBtnVisibility(8);
       }
       return this.i;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, CommentCollectorListFragment$a.class, "3")) {
          return;
       }
       if (this.l != null) {
          this.g.ia().l1(this.l);
       }
       return;
    }
    public void k(boolean p0,Throwable p1){
       KwaiException kwaiExceptio;
       CommentCollectorListFragment$a uoa = CommentCollectorListFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "6")) {
          return;
       }
       String str = null;
       if (p1 instanceof KwaiException) {
          kwaiExceptio = p1;
          this.m = kwaiExceptio;
          kwaiExceptio = kwaiExceptio.mErrorMessage;
       }
       this.f();
       this.x();
       this.g();
       View view = this.n();
       this.n = view;
       CommentCollectorListFragment$a tm = this.m;
       if (tm != null && 0xc380 == tm.mErrorCode) {
          this.p = view.findViewById(0x7f0a0834);
          KwaiEmptyStateView$a uoa1 = this.e(p1, kwaiExceptio);
          uoa1.k(R.drawable.arg_RES_7f0805b4);
          uoa1.a(this.p).setRetryBtnVisibility(8);
          this.a.K(this.n);
       }else {
          super.k(p0, p1);
       }
       return;
    }
    public View n(){
       CommentCollectorListFragment$a obj = PatchProxy.apply(null, this, CommentCollectorListFragment$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.m;
       if (obj == null || 0xc380 != obj.mErrorCode) {
          return super.n();
       }
       View view = a.i(this.a, R.layout.arg_RES_7f0d01bf);
       this.n = view;
       return view;
    }
    public void p(){
       if (PatchProxy.applyVoid(null, this, CommentCollectorListFragment$a.class, "2")) {
          return;
       }
       if (this.l == null) {
          this.l = a.i(this.g.h0(), 0x7f0d01c6);
       }
       if (r1.u1(this.q.Gh().b.mEntity).mCollectCount - (long)this.q.q().getCount() > 0) {
          this.g.ia().L0(this.l);
       }
       return;
    }
    public b r(){
       return b.f;
    }
    public void x(){
       if (PatchProxy.applyVoid(null, this, CommentCollectorListFragment$a.class, "4")) {
          return;
       }
       super.x();
       View[] viewArray = new View[]{this.f};
       n.Z(8, viewArray);
       return;
    }
}
