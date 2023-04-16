package com.yxcorp.gifshow.homepage.presenter.u;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.PhotoMeta;
import xl8.d;
import y8c.a;
import brd.t;
import lnc.b9;
import yta.y1;
import erd.g;
import crd.b;
import android.widget.ImageView;
import android.view.View;
import com.kuaishou.android.model.mix.CommonMeta;
import ga5.b;
import com.kwai.component.feedstaggercard.PhotoItemViewParam;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import k2b.u1;
import com.yxcorp.gifshow.homepage.presenter.u$a;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class u extends PresenterV2	// class@0017ea
{
    public PhotoMeta p;
    public CommonMeta q;
    public ImageView r;
    public View s;
    public ImageView t;
    public BaseFragment u;
    public PhotoItemViewParam v;
    public u$a w;
    public int x;

    public void u(){
       super();
       this.x = a1.d(0x7f07025d);
    }
    public void E8(){
       u tr;
       if (PatchProxy.applyVoid(null, this, u.class, "3")) {
          return;
       }
       this.S8(this.p);
       this.X7(b9.d(this.p, this.u).subscribe(new y1(this)));
       if (this.p.mTagTop != null) {
          this.r.setVisibility(0);
          tr = this.r;
          int i = (this.P8())? 0x7f080a23: 0x7f080c2c;
          tr.setImageResource(i);
          this.s.setVisibility(8);
       }else {
          this.r.setVisibility(8);
       }
       if (b.f(this.q)) {
          tr = this.s;
          if (tr != null) {
             tr.setVisibility(8);
          }
       }
       if (this.P8()) {
          this.R8(this.r);
          this.R8(this.s);
          this.R8(this.t);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, u.class, "4")) {
          return;
       }
       this.w = null;
       return;
    }
    public final boolean P8(){
       u tv = this.v;
       if (tv == null) {
          return false;
       }
       return tv.mIsShowNewTagIcon;
    }
    public final void R8(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "6")) {
          return;
       }
       ViewGroup$MarginLayoutParams layoutParams = p0.getLayoutParams();
       layoutParams.topMargin = a1.d(0x7f07025d);
       layoutParams.leftMargin = a1.d(0x7f07031b);
       layoutParams.rightMargin = a1.d(0x7f07025d);
       p0.setLayoutParams(layoutParams);
       return;
    }
    public final void S8(PhotoMeta p0){
       u tw;
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "5")) {
          return;
       }
       if (p0 == null || (this.p == null || (!TextUtils.x(p0.getBizId()) && (p0.getBizId()).equals(this.p.getBizId())))) {
          String str = "home_presenter";
          if (this.t == null) {
             u1.Q(str, "reBind");
             this.doBindView(this.m8());
          }
          if (this.t == null) {
             u1.Q(str, "reBind holder");
             u$a uoa = new u$a(this);
             this.w = uoa;
             uoa.doBindView(this.m8());
             tw = this.w;
             this.t = tw.d;
             this.s = tw.c;
             this.r = tw.b;
          }
          if (this.t == null) {
             u1.Q(str, "find");
             this.t = this.m8().findViewById(0x7f0a37fc);
             this.s = this.m8().findViewById(0x7f0a3b70);
             this.r = this.m8().findViewById(0x7f0a3d2c);
          }
          tw = this.p;
          if (tw != null && tw.mPostWorkInfoId < null) {
             this.t.setVisibility(8);
             return;
          }else if(!p0.isPublic()){
             this.t.setVisibility(0);
             u tt = this.t;
             int i = (this.P8())? 0x7f080dc2: 0x7f080c2b;
             tt.setImageResource(i);
          }else {
             this.t.setVisibility(8);
          }
       }
    label_00cc :
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a3d2c);
       this.t = m1.f(p0, 0x7f0a37fc);
       this.s = m1.f(p0, 0x7f0a3b70);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, u.class, "1")) {
          return;
       }
       this.p = this.q8(PhotoMeta.class);
       this.q = this.q8(CommonMeta.class);
       this.u = this.r8("FRAGMENT");
       this.v = this.t8("FEED_ITEM_VIEW_PARAM");
       return;
    }
}
