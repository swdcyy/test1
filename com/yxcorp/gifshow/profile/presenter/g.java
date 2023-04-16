package com.yxcorp.gifshow.profile.presenter.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.HashMap;
import com.yxcorp.gifshow.profile.presenter.g$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.ImageView;
import android.view.ViewStub;
import android.view.View;
import wkd.b;
import com.kuaishou.android.model.feed.k;
import w3c.h;
import android.widget.TextView;
import android.content.Context;
import com.kuaishou.android.model.mix.PhotoMeta;
import hn5.f0;
import hn5.f0$a;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import java.util.List;
import v2c.e;
import java.lang.StringBuilder;
import v2c.g;
import xl8.d;
import y8c.a;
import brd.t;
import lnc.b9;
import i4c.h0;
import erd.g;
import crd.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.w;
import com.yxcorp.gifshow.profile.http.l;
import lnc.a1;
import z5c.k1;
import java.util.Map;
import java.lang.Integer;
import android.graphics.drawable.Drawable;
import zf6.j;
import java.lang.Math;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import qvb.i;

public class g extends PresenterV2	// class@00144b
{
    public QPhoto A;
    public PhotoMeta B;
    public Boolean C;
    public Boolean D;
    public BaseFragment E;
    public i F;
    public int G;
    public int H;
    public Map I;
    public final f0$a J;
    public ViewStub p;
    public ViewStub q;
    public ViewStub r;
    public ViewStub s;
    public ViewStub t;
    public ViewStub u;
    public ViewStub v;
    public ViewStub w;
    public ViewStub x;
    public ViewStub y;
    public ImageView z;

    public void g(){
       super();
       this.I = new HashMap();
       this.J = new g$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       int i = 0;
       if (TextUtils.x(this.A.getPhotoId())) {
          this.z.setVisibility(8);
          this.X8(this.r, 8);
          this.X8(this.q, 8);
          this.X8(this.s, 8);
          this.X8(this.t, 8);
          this.X8(this.u, i);
          this.X8(this.w, 8);
          this.X8(this.v, 8);
          return;
       }else {
          this.X8(this.u, 8);
          g tp = this.p;
          int i1 = (this.A.isLiveStream())? 0: 8;
          this.X8(tp, i1);
          this.P8();
          if (b.a(0x5f22eaa1).D(this.A)) {
             this.z.setVisibility(8);
             this.X8(this.r, i);
          }else if(this.A.isTopPhoto()){
             this.z.setVisibility(8);
             this.X8(this.r, i);
          }else if(this.A.isPublic()){
             this.z.setVisibility(8);
             this.X8(this.r, 8);
          }
          i1 = 1;
          if (!h.a(this.A)) {
             if (this.A.getShowCount() - null > 0) {
                View view = this.X8(this.s, i);
                if (view instanceof TextView) {
                   Object[] objArray = new Object[i1];
                   objArray[i] = String.valueOf(this.A.getShowCount());
                   view.setText(this.getContext().getString(R.string.arg_RES_7f103d27, objArray));
                }
             }else {
                this.X8(this.s, 8);
             }
          }
          if (this.R8()) {
             String str = TextUtils.N((long)this.B.mViewCount);
             b.a(0x238e5b38).a(this.A.getPhotoId(), this.J);
             int i2 = b.a(0x238e5b38).d(this.A.getPhotoId());
             int i3 = 0x7f0a32d7;
             if (this.B.mViewCount > i2) {
                this.W8(this.w, i3, str, i1);
             }else {
                this.W8(this.w, i3, TextUtils.N((long)i2), i1);
             }
             g.e(KsLogProfileTag.PHOTO_PLAY_COUNT.appendTag("PhotoMarkPresenter"), "photoId: "+this.A.getPhotoId()+", playCount: "+str+", cacheViewCount: "+TextUtils.N((long)i2));
          }else {
             this.X8(this.w, 8);
          }
          tp = this.t;
          i1 = (this.A.isInappropriate())? 0: 8;
          this.X8(tp, i1);
          tp = this.v;
          if (!this.S8(this.s) && !this.S8(this.w)) {
             i = 8;
          }
          this.X8(tp, i);
          tp = this.B;
          if (tp != null) {
             this.Y8(tp);
             this.X7(b9.d(this.B, this.E).subscribe(new h0(this)));
          }
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, g.class, "11")) {
          return;
       }
       b.a(0x238e5b38).b(this.A.getPhotoId(), this.J);
       return;
    }
    public final void P8(){
       boolean b;
       g og = g.class;
       if (PatchProxy.applyVoid(null, this, og, "12")) {
          return;
       }
       g tH = this.H;
       int i = 8;
       if (tH != 1) {
          if (tH == 3) {
             og = this.q;
             if (h.a(this.A)) {
                i = 0;
             }
             this.X8(og, i);
          }
       }else {
          tH = this.A;
          View obj = PatchProxy.applyOneRefs(tH, this, og, "13");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(!w.F0(this.A.mEntity)){
             b = false;
          }else if(!w.j0(this.A.mEntity)){
             og = this.F;
             if (og instanceof l) {
                b = og.k2(tH);
             }
          }
          b = true;
          if (b && this.A.isPublic()) {
             og = this.B;
             if (og == null || !w.l0(og)) {
                obj = this.X8(this.y, 0);
                if (obj instanceof TextView) {
                   obj.setTextSize(1, 12.00f);
                }
                k1.c(obj, a1.d(R.dimen.arg_RES_7f0702b8));
             }
          }
          this.X8(this.y, i);
       }
       return;
    }
    public boolean R8(){
       boolean b;
       g obj = PatchProxy.apply(null, this, g.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.w != null) {
          obj = this.C;
          if (obj != null && (obj.booleanValue() && this.B != null)) {
             b = true;
          label_0029 :
             return b;
          }
       }
       b = false;
       goto label_0029 ;
    }
    public final boolean S8(ViewStub p0){
       g obj = PatchProxy.applyOneRefs(p0, this, g.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.I;
       boolean b = false;
       if (obj == null) {
          return b;
       }
       View view = obj.get(p0);
       if (view != null && !view.getVisibility()) {
          b = true;
       }
       return b;
    }
    public final void V8(TextView p0,int p1){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, og, "7")) {
          return;
       }
       Drawable uDrawable = j.k(this.getContext(), p1);
       uDrawable.setBounds(0, 0, a1.d(R.dimen.arg_RES_7f070295), a1.d(R.dimen.arg_RES_7f070295));
       p0.setCompoundDrawablePadding(a1.e(2.00f));
       p0.setCompoundDrawables(uDrawable, null, null, null);
       return;
    }
    public void W8(ViewStub p0,int p1,String p2,int p3){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, Integer.valueOf(p3), this, g.class, "6")) {
          return;
       }
       g tI = this.I;
       if (tI == null) {
          return;
       }
       View view = tI.get(p0);
       if (view == null) {
          view = p0.inflate();
          this.I.put(p0, view);
       }
       view.setVisibility(0);
       TextView textView = view.findViewById(p1);
       textView.setText(p2);
       if (p3 != 1) {
          if (p3 == 2) {
             this.V8(textView, R.drawable.arg_RES_7f081dac);
          }
       }else {
          this.V8(textView, R.drawable.arg_RES_7f0822fd);
       }
       return;
    }
    public final View X8(ViewStub p0,int p1){
       View obj;
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, og, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 != null) {
          og = this.I;
          if (og != null) {
             obj = og.get(p0);
             if (p1) {
                if (p1 == 8 && obj != null) {
                   obj.setVisibility(p1);
                }
             }else if(obj == null){
                obj = p0.inflate();
                this.I.put(p0, obj);
             }
             obj.setVisibility(p1);
             return obj;
          }
       }
       return null;
    }
    public final void Y8(PhotoMeta p0){
       g og = g.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, og, "10")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       g tD = this.D;
       if (tD != null && tD.booleanValue()) {
          int i = Math.max(p0.getLikeCount(), 0);
          g.e(KsLogProfileTag.PHOTO_LIKE_COUNT.appendTag("PhotoMarkPresenter"), "likeCount: "+i);
          this.W8(this.x, R.id.profilegrid_like_count_tv, TextUtils.N((long)i), 2);
          tD = this.x;
          boolean b = p0.isLiked();
          if (!PatchProxy.isSupport(og) || !PatchProxy.applyVoidTwoRefs(tD, Boolean.valueOf(b), this, og, "8")) {
             og = this.I;
             if (og != null) {
                View view = og.get(tD);
                if (view == null) {
                   view = tD.inflate();
                   this.I.put(tD, view);
                }
                view.setSelected(b);
             }
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a2922);
       this.p = m1.f(p0, 0x7f0a215e);
       this.q = m1.f(p0, 0x7f0a3608);
       this.z = m1.f(p0, 0x7f0a3b70);
       this.w = m1.f(p0, 0x7f0a32d6);
       this.s = m1.f(p0, 0x7f0a3352);
       this.t = m1.f(p0, 0x7f0a13d9);
       this.r = m1.f(p0, 0x7f0a3484);
       this.v = m1.f(p0, 0x7f0a046e);
       this.x = m1.f(p0, 0x7f0a32d4);
       this.y = m1.f(p0, 0x7f0a32d9);
       return;
    }
    public void j8(){
       Boolean uBoolean = Boolean.class;
       if (PatchProxy.applyVoid(null, this, g.class, "2")) {
          return;
       }
       this.A = this.q8(QPhoto.class);
       this.B = this.s8(PhotoMeta.class);
       this.C = this.v8("PROFILE_ENABLE_PLAY_COUNT", uBoolean);
       this.D = this.v8("PROFILE_ENABLE_LIKE_COUNT", uBoolean);
       this.E = this.r8("FRAGMENT");
       this.G = this.r8("PROFILE_STYLE").intValue();
       this.H = this.r8("TAB_ID").intValue();
       this.F = this.r8("DETAIL_PAGE_LIST");
       return;
    }
}
