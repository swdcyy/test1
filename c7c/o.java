package c7c.o;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import f7c.c;
import a7c.c;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import c7c.l;
import erd.o;
import t45.d;
import brd.z;
import c7c.i;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import a7c.h;
import c7c.m;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.q;
import c7c.k;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.user.User$FollowStatus;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import lnc.b9;
import x6c.p;
import wkd.b;
import qra.d;
import sra.a;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import c7c.j;
import android.widget.ImageView;
import android.widget.TextView;
import wca.a;
import k2b.e0;
import android.graphics.drawable.Drawable;
import zf6.j;
import android.content.res.ColorStateList;
import com.kwai.social.startup.follow.model.SayHiConfigParam;
import x6c.j;
import a7c.d;
import android.view.ViewStub;
import lnc.a1;
import java.lang.Integer;
import android.text.TextPaint;
import com.yxcorp.utility.n;
import android.content.Context;
import androidx.core.content.ContextCompat;
import ekd.m1;
import c7c.g;
import android.view.View$OnClickListener;
import com.kwai.framework.model.user.RecoUser;
import nu7.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class o extends PresenterV2	// class@00054c
{
    public c A;
    public int B;
    public boolean C;
    public b D;
    public boolean E;
    public p F;
    public View p;
    public TextView q;
    public ViewStub r;
    public RecoUser s;
    public User t;
    public boolean u;
    public int v;
    public h w;
    public BaseFragment x;
    public int y;
    public a z;

    public void o(){
       super();
       this.E = false;
    }
    public void o(boolean p0){
       super();
       this.E = false;
       this.C = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, o.class, "4")) {
          return;
       }
       int i = c.a(this.A.od(this.t));
       if (i != -1) {
          this.v = i;
       }
       z a = d.a;
       this.X7(this.t.observable().distinctUntilChanged(l.b).observeOn(a).subscribe(new i(this), Functions.d()));
       o tw = this.w;
       if (tw != null && tw.d()) {
          this.X7(this.t.observable().distinctUntilChanged(m.b).observeOn(a).subscribe(new i(this), Functions.d()));
       }
       this.X7(RxBus.f.f(q.class).subscribe(new k(this)));
       this.V8(this.t);
       return;
    }
    public boolean P8(User p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.mFollowStatus == User$FollowStatus.FOLLOWING && (this.w != null && (!p0.getFavorited() && this.w.d())))? true: false;
       return b;
    }
    public final boolean R8(){
       o obj = PatchProxy.apply(null, this, o.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.w;
       boolean b = (obj != null && obj.g())? true: false;
       return b;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, o.class, "7")) {
          return;
       }
       if (this.p.getLayoutParams().width != this.B) {
          ViewGroup$LayoutParams layoutParams = this.p.getLayoutParams();
          layoutParams.width = this.B;
          this.p.setLayoutParams(layoutParams);
       }
       return;
    }
    public void V8(User p0){
       int i5;
       String str = "5";
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, str)) {
          return;
       }
       boolean b = false;
       this.E = b;
       b9.a(this.D);
       o tF = this.F;
       if (tF != null) {
          tF.e();
       }
       tF = this.w;
       int i = 3;
       boolean b1 = true;
       ImageView imageView = null;
       if (tF != null && (tF.a() && p0.getFollowStatus() == User$FollowStatus.FOLLOWING)) {
          int i1 = 0x36dab11a;
          if (b.a(i1).d(p0)) {
             this.D = RxBus.f.g(a.class, RxBus$ThreadMode.MAIN).subscribe(new j(this));
             this.p.setVisibility(b);
             a.d(this.t, this.p, imageView, this.q);
             this.E = b1;
             this.q.setText(R.string.arg_RES_7f10423b);
             if (this.x != null) {
                b.a(i1).f(this.x, this.t.getId(), i);
             }
          }else {
          label_0082 :
             int i2 = 0x7f081dcd;
             int i3 = 0x7f100fa6;
             if (p0.mVisitorBeFollowed != null && p0.getFollowStatus() == User$FollowStatus.FOLLOWING) {
                tF = this.w;
                if (tF != null && (tF.w() && this.r != null)) {
                   a.c(this.t, this.p, imageView, this.q, i3);
                   o tp = this.p;
                   tp.setBackground(j.m(tp, i2));
                   tp = this.q;
                   tp.setTextColor(j.i(tp, R.color.arg_RES_7f061fbb));
                   if (this.F == null) {
                      p op = new p(p0, j.a(), this.p, this.q, this.r, this.w.o().a());
                      this.F = tp;
                      tp.b(this.x, this.y);
                   }
                   this.F.e();
                }
             }
          label_00ef :
             if (this.P8(p0)) {
                a.a(this.p, imageView, this.q, b);
                this.q.setText(R.string.arg_RES_7f100e52);
                ViewGroup$LayoutParams layoutParams = this.p.getLayoutParams();
                layoutParams.width = a1.e(89.00f);
                this.p.setLayoutParams(layoutParams);
             }else if(this.C != null && (p0.mVisitorBeFollowed != null && (p0.isPrivate() || (p0.isFollowingOrFollowRequesting() || (p0.isPrivate() && p0.mFollowStatus == User$FollowStatus.FOLLOWING))))){
                a.c(this.t, this.p, imageView, this.q, i3);
                this.S8();
                this.A.h4(this.t, true, this.p, null, this.q);
             }else if(!p0.isFollowingOrFollowRequesting()){
                a.b(this.t, this.p, imageView, this.q);
                this.S8();
                this.A.h4(this.t, false, this.p, null, this.q);
             }else if(this.R8() || (this.u != null && p0.isFollowingOrFollowRequesting())){
                tF = this.w;
                if (tF != null) {
                   o oo = -1;
                   if (tF.m() != oo && this.w.l() != oo) {
                      o tt = this.t;
                      tF = this.p;
                      o tq = this.q;
                      i3 = this.w.m();
                      int i4 = this.w.l();
                      if (PatchProxy.isSupport(a.class)) {
                         Object[] objArray = new Object[]{tt,tF,imageView,tq,Integer.valueOf(i3),Integer.valueOf(i4)};
                         if (!PatchProxy.applyVoid(objArray, imageView, a.class, str)) {
                         }
                      }else if(tt != null && tt.isPrivate()){
                         i5 = 0x7f100216;
                      }else {
                         i5 = 0x7f101034;
                      }
                      tq.getPaint().setFakeBoldText(b1);
                      View[] viewArray = new View[]{tF,tq};
                      n.Z(b, viewArray);
                      viewArray = new View[b1];
                      viewArray[b] = imageView;
                      n.Z(8, viewArray);
                      tq.setText(i5);
                      tF.setBackgroundResource(i4);
                      tq.setTextColor(ContextCompat.getColorStateList(a1.c(), i3));
                   }else {
                   label_020d :
                      a.d(this.t, this.p, imageView, this.q);
                      if (this.R8()) {
                         this.p.setBackgroundResource(i2);
                         if (p0.mVisitorBeFollowed != null) {
                            this.q.setText(i3);
                         }
                      }
                   }
                }else {
                   goto label_020d ;
                }
                this.S8();
                this.A.h4(this.t, true, this.p, null, this.q);
             }else {
                this.p.setVisibility(8);
             }
          }
       }else {
          goto label_0082 ;
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0f4e);
       this.q = m1.f(p0, 0x7f0a0fa1);
       this.r = m1.f(p0, 0x7f0a370b);
       this.B = this.p.getLayoutParams().width;
       m1.a(p0, new g(this), R.id.follow_button);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, o.class, "3")) {
          return;
       }
       this.s = this.q8(RecoUser.class);
       this.t = this.q8(User.class);
       this.w = this.t8("PYMK_ACCESS_IDSPYMK_PARAMS");
       this.u = this.r8("PYMK_ACCESS_IDSITEM_SHOW_UNFOLLOW").booleanValue();
       this.v = this.r8("PAGE_REFERER").intValue();
       this.z = this.t8("AUTO_ALIAS_CALLER_CONTEXT");
       this.A = this.r8("PYMK_ACCESS_IDSITEM_CLICK_LISTENER");
       this.x = this.t8("FRAGMENT");
       this.y = this.r8("ADAPTER_POSITION").intValue();
       return;
    }
}
