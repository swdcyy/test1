package com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.comment.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import n49.s;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import android.view.View;
import android.widget.TextView;
import com.yxcorp.gifshow.ad.widget.AdDownloadProgressBar;
import com.facebook.drawee.view.SimpleDraweeView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.ImageView;
import mxb.c;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CommentActionBarInfo;
import tw.j;
import mz8.l;
import java.lang.Runnable;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import ekd.m1;

public class b extends PresenterV2	// class@00156a
{
    public QPhoto p;
    public View q;
    public View r;
    public TextView s;
    public TextView t;
    public AdDownloadProgressBar u;
    public PhotoAdvertisement v;

    public void b(){
       super();
    }
    public void E8(){
       String str;
       PhotoAdvertisement$AdData mCommentActi;
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "3")) {
          return;
       }
       if (!s.r(this.p)) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "4")) {
          this.v = k.B(this.p);
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "6")) {
          if (!PatchProxy.applyVoid(objArray, this, uob, "5")) {
             this.r = this.q.findViewById(0x7f0a00de);
             this.s = this.q.findViewById(0x7f0a00e0);
             this.t = this.q.findViewById(0x7f0a00df);
             this.u = this.q.findViewById(0x7f0a00e1);
          }
          SimpleDraweeView simpleDrawee = this.q.findViewById(R.id.ad_action_bar_floating_apk_icon);
          if (!TextUtils.x(this.v.mAppIconUrl)) {
             simpleDrawee.setImageURI(this.v.mAppIconUrl);
             simpleDrawee.setVisibility(0);
          }else {
             b tr = this.r;
             if (tr != null) {
                this.P8(tr);
             }else {
                this.P8(this.s);
             }
             simpleDrawee.setVisibility(8);
          }
          if (!PatchProxy.applyVoid(objArray, this, uob, "7") && this.s != null) {
             b tp = this.p;
             PhotoAdvertisement$CommentActionBarInfo uCommentActi = PatchProxy.applyOneRefs(tp, objArray, c.class, "27");
             if (uCommentActi != PatchProxyResult.class) {
             }else {
                PhotoAdvertisement photoAdverti = k.B(tp);
                if (photoAdverti != null) {
                   photoAdverti = photoAdverti.mAdData;
                   if (photoAdverti != null) {
                      mCommentActi = photoAdverti.mCommentActionBarInfo;
                   label_00cd :
                      uCommentActi = (mCommentActi != null)? mCommentActi.mUserName: objArray;
                      if (TextUtils.x(uCommentActi)) {
                         str = c.A(tp);
                      }
                   }
                }
                mCommentActi = objArray;
                goto label_00cd ;
             }
             if (!TextUtils.x(this.v.mAppName) && j.C(this.v)) {
                PhotoAdvertisement mAppName = this.v.mAppName;
                str = ".apk";
                if (mAppName.endsWith(str)) {
                   mAppName = mAppName.substring(0, mAppName.lastIndexOf(str));
                }
                this.s.setText(mAppName);
             }else if(!TextUtils.x(uCommentActi)){
                this.s.setText(uCommentActi);
             }else if(!TextUtils.x(this.p.getUserName())){
                this.s.setText(this.p.getUserName());
             }
          }
       label_012d :
          if (!PatchProxy.applyVoid(objArray, this, uob, "8") && this.t != null) {
             if (!TextUtils.x(this.p.getCaption())) {
                this.t.setVisibility(0);
                this.t.setText(this.p.getCaption());
             }else {
                this.t.setVisibility(8);
             }
          }
          this.q.post(new l(this));
       }
       return;
    }
    public final void P8(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "9")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
          layoutParams.leftMargin = 0;
       }
       p0.setLayoutParams(layoutParams);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a0115);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       return;
    }
}
