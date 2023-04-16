package com.yxcorp.gifshow.comment.common.c;
import y8c.t;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.entity.QPhoto;
import ek9.f;
import com.yxcorp.gifshow.comment.CommentConfig;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import android.content.Context;
import android.view.ViewGroup;
import i2b.a;
import com.yxcorp.gifshow.comment.common.c$b;
import android.view.ViewStub;
import com.yxcorp.gifshow.comment.common.c$c;
import g9c.d;
import hk9.s;
import java.lang.Runnable;
import com.yxcorp.gifshow.comment.common.c$a;
import hk9.t;
import qvb.i;
import hk9.r;
import lnc.c3$a;
import lnc.c3;
import com.yxcorp.gifshow.comment.CommentPageListConfig;
import com.yxcorp.gifshow.view.ShowFoldedCommentLayout;
import hk9.p;
import android.view.View$OnClickListener;
import com.kwai.written.view.IWrittenLayout;
import android.widget.TextView;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.comment.CommentTipsConfig;
import hk9.u;
import hk9.v;
import hk9.w;
import hk9.x;
import java.lang.Boolean;
import y8c.g;
import fk9.b;
import java.lang.Integer;
import com.yxcorp.gifshow.comment.common.c$a$a;
import com.yxcorp.utility.n;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import hk9.q;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.u1;
import al9.a;
import lnc.a1;
import java.lang.Throwable;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import hk9.o;
import androidx.fragment.app.Fragment;
import o56.a;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import k2b.e0;
import yk9.d;

public class c implements t	// class@0010a5
{
    public final RecyclerFragment a;
    public final f b;
    public CommentConfig c;
    public final QPhoto d;
    public final ViewGroup e;
    public ViewGroup f;
    public View g;
    public TextView h;
    public View i;
    public View j;
    public View k;
    public c$b l;
    public c$c m;
    public int n;

    public void c(RecyclerFragment p0,QPhoto p1,f p2,CommentConfig p3){
       super();
       this.a = p0;
       this.d = p1;
       this.c = p3;
       RecyclerView recyclerView = p0.h0();
       ViewGroup viewGroup = PatchProxy.applyOneRefs(recyclerView, this, c.class, "14");
       if (viewGroup != PatchProxyResult.class) {
       }else {
          viewGroup = a.d(recyclerView.getContext(), R.layout.arg_RES_7f0d103c, recyclerView, 0);
       }
       this.e = viewGroup;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, c.class, "15")) {
          this.i = viewGroup.findViewById(0x7f0a2921);
          this.j = viewGroup.findViewById(0x7f0a2de4);
          this.k = viewGroup.findViewById(0x7f0a0891);
          this.l = new c$b(viewGroup.findViewById(0x7f0a2d27));
          this.m = new c$c(viewGroup.findViewById(0x7f0a2d31));
       }
       p0.ia().L0(viewGroup);
       this.b = p2;
       if (this.a()) {
          this.l.c(new s(this));
       }else {
          this.l.c(new t(this));
       }
       c3.c(p0.q(), new r(this));
       if (this.c.mPageListConfig.mEnableFoldComment != null && !PatchProxy.applyVoid(objArray, this, c.class, "3")) {
          this.f = viewGroup.findViewById(0x7f0a2de3);
          ShowFoldedCommentLayout showFoldedCo = new ShowFoldedCommentLayout(this.f.getContext(), new p(this));
          this.g = showFoldedCo.l1();
          this.h = showFoldedCo.n1();
          c tg = this.g;
          this.f.addView(tg, 0, tg.getLayoutParams());
       }
       if (!PatchProxy.applyVoid(objArray, this, c.class, "2")) {
          if (this.c.mTipsConfig.mEmptyTextResId != null) {
             this.l.c(new u(this));
          }
          if (this.c.mTipsConfig.mEmptySubTextResId != null) {
             this.l.c(new v(this));
          }
          if (this.c.mTipsConfig.mEmptyRes != null) {
             this.l.c(new w(this));
          }
          if (this.c.mTipsConfig.mEmptyViewTranslationY - null) {
             this.l.c(new x(this));
          }
       }
       return;
    }
    public final boolean a(){
       Object obj = PatchProxy.apply(null, this, c.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.d.isAllowComment() || this.c.mTipsConfig.mDisableEmptyCommentGuide != null)? true: false;
       return b;
    }
    public final boolean b(){
       Object obj = PatchProxy.apply(null, this, c.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.g7().s1();
    }
    public final void c(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "7")) {
          return;
       }
       uoc = this.f;
       uoc.setPadding(uoc.getPaddingLeft(), p0, this.f.getPaddingRight(), this.f.getPaddingBottom());
       return;
    }
    public void d(boolean p0){
       c tl;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "8")) {
          return;
       }
       if (this.c.mTipsConfig.mEnableFirstLoading == null && p0) {
          return;
       }
       if (p0) {
          this.i.setVisibility(4);
          this.j.setVisibility(8);
          tl = this.l;
          tl.a(tl.b, 8);
          if (!PatchProxy.applyVoid(null, this, uoc, "13")) {
             this.f();
             if (this.c.mTipsConfig.mEnableFirstLoading != null) {
                this.k.setVisibility(0);
             }
          }
       }else {
          this.i.setVisibility(0);
          this.j.setVisibility(8);
          tl = this.l;
          tl.a(tl.b, 8);
       }
       tl = this.m;
       tl.a(tl.b, 8);
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       c tl = this.l;
       tl.a(tl.b, 8);
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, c.class, "10")) {
          return;
       }
       this.j.setVisibility(8);
       View[] viewArray = new View[]{this.g};
       n.Z(8, viewArray);
       return;
    }
    public void i(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "4")) {
          return;
       }
       i oi = this.a.q();
       this.k.setVisibility(8);
       c tl = this.l;
       tl.a(tl.b, 0);
       if (this.l.h.a() != null) {
          this.l.h.a().setVisibility(0);
          if (TextUtils.x(this.l.h.a().getText())) {
             this.l.h.a().setHeight(0);
          }
       }
       if (this.c.mTipsConfig.mDisableEmptyCommentGuide != null) {
          uoc = this.l;
          uoc.a(uoc.f, 8);
          uoc = this.m;
          uoc.a(uoc.b, 8);
       }else if(this.a()){
          tl = this.l;
          tl.a(tl.f, 0);
          this.l.f.a().setOnClickListener(new q(this));
          tl = this.m;
          tl.a(tl.b, 8);
          if (!PatchProxy.applyVoid(objArray, this, uoc, "12")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "GUIDE_COMMENT_BUTTON";
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = w1.f(this.b.b.mEntity);
             ShowMetaData showMetaData = new ShowMetaData();
             showMetaData.setElementPackage(uElementPack);
             showMetaData.setContentPackage(uContentPack);
             showMetaData.setType(6);
             u1.B0(showMetaData);
          }
       }
       if (oi instanceof a && oi.J0()) {
          this.l.e.a().setText(a1.p(R.string.arg_RES_7f104c1e));
          uoc = this.l;
          uoc.a(uoc.f, 8);
       }
       this.g();
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, c.class, "17")) {
          return;
       }
       c tm = this.m;
       tm.a(tm.b, 8);
       return;
    }
    public void k(boolean p0,Throwable p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoc, "16")) {
          return;
       }
       this.f();
       int i = 0;
       if (p0 && !this.b()) {
          c tm = this.m;
          tm.a(tm.e, i);
          if (this.m.e.a() != null) {
             this.m.e.a().p(new o(this));
          }
          this.k.setVisibility(8);
       }else if(p0){
          this.k.setVisibility(i);
       }else {
          this.i.setVisibility(i);
       }
       if (this.a.isVisible()) {
          ExceptionHandler.handleException(a.B, p1);
       }
       return;
    }
    public void p(){
       View[] viewArray1;
       if (PatchProxy.applyVoid(null, this, c.class, "6")) {
          return;
       }
       if (!this.b()) {
          this.g();
          this.i();
       }else {
          int i = 1;
          if (this.c.mPageListConfig.mEnableFoldComment != null && this.a.q() instanceof a) {
             a uoa = this.a.q();
             if (uoa.o0()) {
                this.c(0);
                View[] viewArray = new View[i];
                viewArray[0] = this.g;
                n.Z(0, viewArray);
                this.b.f.u(uoa.j1(), this.a);
                this.h.setText(a1.q(R.string.arg_RES_7f100f8d, uoa.R0()));
             }else {
                this.c(n.c(this.f.getContext(), 13.00f));
                viewArray1 = new View[i];
                viewArray1[0] = this.g;
                n.Z(8, viewArray1);
             }
          }
          c tl = this.l;
          tl.a(tl.b, 8);
          viewArray1 = new View[i];
          viewArray1[0] = this.i;
          n.Z(8, viewArray1);
          viewArray1 = new View[i];
          viewArray1[0] = this.j;
          n.Z(0, viewArray1);
          tl = this.m;
          tl.a(tl.b, 8);
       }
       return;
    }
    public void x(){
       if (PatchProxy.applyVoid(null, this, c.class, "9")) {
          return;
       }
       if (this.i.getVisibility() != 8) {
          this.i.setVisibility(4);
       }
       this.k.setVisibility(8);
       return;
    }
}
