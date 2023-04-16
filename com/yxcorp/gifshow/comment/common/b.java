package com.yxcorp.gifshow.comment.common.b;
import y8c.t;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.entity.QPhoto;
import ek9.f;
import com.yxcorp.gifshow.comment.CommentConfig;
import java.lang.Object;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import android.view.ViewGroup;
import i2b.a;
import android.widget.ImageView;
import android.widget.TextView;
import g9c.d;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import lnc.a1;
import java.lang.CharSequence;
import qvb.i;
import hk9.m;
import lnc.c3$a;
import lnc.c3;
import com.yxcorp.gifshow.comment.CommentPageListConfig;
import com.yxcorp.gifshow.view.ShowFoldedCommentLayout;
import hk9.k;
import android.view.View$OnClickListener;
import com.kwai.written.view.IWrittenLayout;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.comment.CommentTipsConfig;
import java.lang.Boolean;
import y8c.g;
import fk9.b;
import java.lang.Integer;
import android.widget.FrameLayout;
import com.yxcorp.utility.n;
import com.yxcorp.utility.TextUtils;
import hk9.l;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.u1;
import al9.a;
import java.lang.Throwable;
import hk9.j;
import o56.a;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import k2b.e0;
import yk9.d;

public class b implements t	// class@0010a0
{
    public final RecyclerFragment a;
    public final f b;
    public ImageView c;
    public TextView d;
    public KwaiEmptyStateView e;
    public ViewGroup f;
    public View g;
    public TextView h;
    public TextView i;
    public ViewGroup j;
    public View k;
    public View l;
    public View m;
    public TextView n;
    public View o;
    public QPhoto p;
    public CommentConfig q;

    public void b(RecyclerFragment p0,QPhoto p1,f p2,CommentConfig p3){
       b tn;
       b tg;
       super();
       this.a = p0;
       this.p = p1;
       this.q = p3;
       RecyclerView recyclerView = p0.h0();
       ViewGroup viewGroup = PatchProxy.applyTwoRefs(p0.getContext(), recyclerView, this, b.class, "14");
       if (viewGroup != PatchProxyResult.class) {
       }else {
          viewGroup = a.d(recyclerView.getContext(), R.layout.arg_RES_7f0d103b, recyclerView, 0);
       }
       this.j = viewGroup;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, b.class, "15")) {
          View view = this.j.findViewById(R.id.nasa_comment_empty_tips);
          this.m = view;
          this.c = view.findViewById(0x7f0a0d1a);
          this.d = this.m.findViewById(0x7f0a076c);
          this.o = this.m.findViewById(0x7f0a0891);
          this.k = this.j.findViewById(0x7f0a2921);
          this.l = this.j.findViewById(0x7f0a2de4);
          this.n = this.m.findViewById(0x7f0a088f);
          this.i = this.m.findViewById(0x7f0a0892);
       }
       p0.ia().L0(this.j);
       this.b = p2;
       if (this.a()) {
          this.e = this.m.findViewById(0x7f0a2d30);
          this.n.setText(a1.p(R.string.arg_RES_7f103d8b));
       }else {
          tg = this.n;
          if (tg != null) {
             tg.setText(a1.p(R.string.arg_RES_7f1007b0));
          }
       }
       c3.c(p0.q(), new m(this));
       if (this.q.mPageListConfig.mEnableFoldComment != null && !PatchProxy.applyVoid(objArray, this, b.class, "3")) {
          this.f = this.j.findViewById(0x7f0a2de3);
          ShowFoldedCommentLayout showFoldedCo = new ShowFoldedCommentLayout(this.f.getContext(), new k(this));
          this.g = showFoldedCo.l1();
          this.h = showFoldedCo.n1();
          tg = this.g;
          this.f.addView(tg, 0, tg.getLayoutParams());
       }
       if (!PatchProxy.applyVoid(objArray, this, b.class, "2")) {
          CommentTipsConfig mEmptyTextRe = this.q.mTipsConfig.mEmptyTextResId;
          if (mEmptyTextRe != null) {
             tn = this.n;
             if (tn != null) {
                tn.setText(mEmptyTextRe);
             }
          }
          mEmptyTextRe = this.q.mTipsConfig.mEmptySubTextResId;
          if (mEmptyTextRe != null) {
             tn = this.i;
             if (tn != null) {
                tn.setText(mEmptyTextRe);
             }
          }
          mEmptyTextRe = this.q.mTipsConfig.mEmptyRes;
          if (mEmptyTextRe != null) {
             tn = this.c;
             if (tn != null) {
                tn.setImageResource(mEmptyTextRe);
             }
          }
          mEmptyTextRe = this.q.mTipsConfig.mEmptyViewTranslationY;
          if (mEmptyTextRe) {
             tn = this.m;
             if (tn != null) {
                tn.setTranslationY(mEmptyTextRe);
             }
          }
       }
    label_016a :
       this.m.setVisibility(8);
       return;
    }
    public final boolean a(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, b.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = (this.p.isAllowComment() || this.q.mTipsConfig.mDisableEmptyCommentGuide != null)? true: false;
       return b;
    }
    public final boolean b(){
       Object obj = PatchProxy.apply(null, this, b.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.g7().s1();
    }
    public final void c(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "7")) {
          return;
       }
       uob = this.f;
       uob.setPadding(uob.getPaddingLeft(), p0, this.f.getPaddingRight(), this.f.getPaddingBottom());
       return;
    }
    public void d(boolean p0){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, b.class, "8")) {
          return;
       }
       if (this.q.mTipsConfig.mEnableFirstLoading == null && p0) {
          return;
       }
       if (p0) {
          this.k.setVisibility(4);
          this.l.setVisibility(8);
          this.m.setVisibility(0);
          if (!PatchProxy.applyVoid(null, this, b.class, "13")) {
             this.f();
             this.n.setVisibility(8);
             b ti = this.i;
             if (ti != null) {
                ti.setVisibility(8);
             }
             if (this.q.mTipsConfig.mEnableFirstLoading != null) {
                this.o.setVisibility(0);
             }
             ti = this.c;
             if (ti != null) {
                ti.setVisibility(8);
             }
             ti = this.d;
             if (ti != null) {
                ti.setVisibility(8);
             }
          }
       }else {
          this.k.setVisibility(0);
          this.l.setVisibility(8);
          this.m.setVisibility(8);
       }
       if (this.a()) {
          this.e.setVisibility(8);
       }
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       if (this.a()) {
          this.d.setVisibility(8);
       }
       this.c.setVisibility(8);
       this.n.setVisibility(8);
       b ti = this.i;
       if (ti != null) {
          ti.setVisibility(8);
       }
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, b.class, "10")) {
          return;
       }
       this.l.setVisibility(8);
       View[] viewArray = new View[]{this.g};
       n.Z(8, viewArray);
       return;
    }
    public void i(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "4")) {
          return;
       }
       this.o.setVisibility(8);
       this.m.setVisibility(0);
       this.n.setVisibility(0);
       i oi = this.a.q();
       b ti = this.i;
       if (ti != null) {
          ti.setVisibility(0);
          if (TextUtils.x(this.i.getText())) {
             this.i.setHeight(0);
          }
       }
       if (this.q.mTipsConfig.mDisableEmptyCommentGuide != null) {
          this.e.setVisibility(8);
          this.d.setVisibility(8);
          this.e.setVisibility(8);
       }else if(this.a()){
          this.d.setVisibility(0);
          this.d.setOnClickListener(new l(this));
          this.e.setVisibility(8);
          if (!PatchProxy.applyVoid(objArray, this, uob, "12")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "GUIDE_COMMENT_BUTTON";
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = w1.f(this.b.b.mEntity);
             u1.u0(1, uElementPack, uContentPack);
          }
       }
       if (oi instanceof a && oi.J0()) {
          this.n.setText(a1.p(R.string.arg_RES_7f104c1e));
          this.d.setVisibility(8);
       }
       this.c.setVisibility(0);
       this.g();
       return;
    }
    public void j(){
    }
    public void k(boolean p0,Throwable p1){
       b te;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uob, "16")) {
          return;
       }
       int i = 0;
       if (p0 && !this.b()) {
          te = this.e;
          if (te != null) {
             te.setVisibility(i);
             this.e.p(new j(this));
          }
          this.o.setVisibility(8);
       }else if(p0){
          this.o.setVisibility(i);
       }else {
          this.k.setVisibility(i);
       }
       this.n.setVisibility(8);
       te = this.i;
       if (te != null) {
          te.setVisibility(8);
       }
       if (this.a.isVisible()) {
          ExceptionHandler.handleException(a.B, p1);
       }
       return;
    }
    public void p(){
       View[] viewArray1;
       if (PatchProxy.applyVoid(null, this, b.class, "6")) {
          return;
       }
       if (!this.b()) {
          this.g();
          this.i();
       }else {
          int i = 1;
          if (this.q.mPageListConfig.mEnableFoldComment != null && this.a.q() instanceof a) {
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
          viewArray1 = new View[i];
          viewArray1[0] = this.m;
          n.Z(8, viewArray1);
          viewArray1 = new View[i];
          viewArray1[0] = this.k;
          n.Z(8, viewArray1);
          viewArray1 = new View[i];
          viewArray1[0] = this.l;
          n.Z(0, viewArray1);
          if (this.a()) {
             this.e.setVisibility(8);
          }
       }
       return;
    }
    public void x(){
       if (PatchProxy.applyVoid(null, this, b.class, "9")) {
          return;
       }
       if (this.k.getVisibility() != 8) {
          this.k.setVisibility(4);
       }
       this.o.setVisibility(8);
       return;
    }
}
