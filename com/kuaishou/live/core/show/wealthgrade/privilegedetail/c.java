package com.kuaishou.live.core.show.wealthgrade.privilegedetail.c;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import android.graphics.drawable.GradientDrawable$Orientation;
import com.kuaishou.live.core.show.wealthgrade.http.LiveWealthGradePrivilegeItemInfo;
import android.graphics.drawable.Drawable;
import d61.h;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.ImageView;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.widget.TextView;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.utility.TextUtils;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.core.show.wealthgrade.privilegedetail.c$a;
import android.view.View$OnClickListener;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.show.wealthgrade.privilegedetail.i$a;

public class c extends c	// class@00126c
{
    public View p;
    public TextView q;
    public TextView r;
    public KwaiImageView s;
    public KwaiImageView t;
    public TextView u;
    public KwaiImageView v;
    public LiveWealthGradePrivilegeItemInfo w;
    public i$a x;
    public static String sLivePresenterClassName = "LiveWealthGradeDetailItemPresenter";

    public void c(){
       super();
    }
    public void E8(){
       int i2;
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoc, "4")) {
          int i = a1.e(12.00f);
          GradientDrawable$Orientation lEFT_RIGHT = GradientDrawable$Orientation.LEFT_RIGHT;
          int[] ointArray = new int[2];
          LiveWealthGradePrivilegeItemInfo mUnlockGrade = this.w.mUnlockGrade;
          int i1 = 89;
          if (mUnlockGrade <= 9) {
             i2 = 0x7f060cdd;
          }else if(mUnlockGrade <= 24){
             i2 = 0x7f060ccf;
          }else if(mUnlockGrade <= 34){
             i2 = 0x7f060cee;
          }else if(mUnlockGrade <= 39){
             i2 = 0x7f060ccd;
          }else if(mUnlockGrade <= 59){
             i2 = 0x7f060cca;
          }else if(mUnlockGrade <= i1){
             i2 = 0x7f060cda;
          }else {
             i2 = 0x7f060d0d;
          }
          ointArray[0] = a1.a(i2);
          LiveWealthGradePrivilegeItemInfo mUnlockGrade1 = this.w.mUnlockGrade;
          if (mUnlockGrade1 <= 9) {
             i1 = 0x7f060cd7;
          }else if(mUnlockGrade1 <= 24){
             i1 = 0x7f060cd8;
          }else if(mUnlockGrade1 <= 34){
             i1 = 0x7f060ced;
          }else if(mUnlockGrade1 <= 39){
             i1 = 0x7f060cc8;
          }else if(mUnlockGrade1 <= 59){
             i1 = 0x7f060ccb;
          }else if(mUnlockGrade1 <= i1){
             i1 = 0x7f060cd9;
          }else {
             i1 = 0x7f060d0c;
          }
          ointArray[1] = a1.a(i1);
          Drawable uDrawable = h.b(i, lEFT_RIGHT, ointArray);
          if (this.w.mPrivilegeType == 6) {
             ViewGroup$LayoutParams layoutParams = this.p.getLayoutParams();
             layoutParams.height = a1.d(0x7f07086f);
             this.p.setLayoutParams(layoutParams);
             layoutParams = this.t.getLayoutParams();
             layoutParams.height = a1.d(0x7f070870);
             this.t.setLayoutParams(layoutParams);
          }
          this.p.setBackground(uDrawable);
          c tq = this.q;
          String str = PatchProxy.apply(objArray, this, uoc, "5");
          if (str != PatchProxyResult.class) {
          }else {
             str = "Lv."+this.w.mUnlockGrade+" ";
          }
          tq.setText(str);
          this.r.setText(this.w.mContent);
          this.t.U(this.w.mDisplayImageUrls);
          uoc = this.s;
          int i3 = (this.w.isLockedStatus())? 0: 8;
          uoc.setVisibility(i3);
          uoc = this.v;
          if (uoc != null) {
             if (this.w.mPrivilegeType == 3) {
                uoc.setVisibility(0);
                this.v.U(this.w.mDisplayImageUrls);
             }else {
                uoc.setVisibility(8);
             }
          }
          if (this.u != null) {
             if (TextUtils.x(this.w.mPrivilegeDescription)) {
                this.u.setVisibility(8);
             }else {
                this.u.setVisibility(0);
                this.u.setText(this.w.mPrivilegeDescription);
             }
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "3")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a2809);
       this.q = m1.f(p0, 0x7f0a280c);
       this.r = m1.f(p0, 0x7f0a280f);
       this.s = m1.f(p0, 0x7f0a280d);
       this.t = m1.f(p0, 0x7f0a280b);
       this.u = m1.f(p0, 0x7f0a280a);
       this.v = m1.f(p0, 0x7f0a280e);
       m1.a(p0, new c$a(this), R.id.live_wealth_grade_detail_item_lock_flag_image_view);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.w = this.q8(LiveWealthGradePrivilegeItemInfo.class);
       this.x = this.r8("WealthGradeUpgradeService");
       return;
    }
}
