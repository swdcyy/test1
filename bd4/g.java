package bd4.g;
import bd4.a;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zd4.a;
import q87.c;
import com.kuaishou.merchant.transaction.base.detail.guesslike.model.MerchantRecommendInfoModel;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kuaishou.merchant.transaction.base.detail.guesslike.model.MerchantRecommendInfoModel$ProductConvergenceInfo;
import brd.t;
import com.kuaishou.merchant.basic.util.d;
import bd4.e;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;
import android.widget.TextView;
import lnc.a1;
import ot3.p0;
import androidx.fragment.app.FragmentActivity;
import rk0.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.Context;
import android.graphics.Typeface;
import ekd.d0;
import tkd.b;
import tkd.d;
import vs3.a;
import android.app.Activity;
import com.kuaishou.merchant.transaction.base.detail.guesslike.model.MerchantRecommendInfoModel$ItemRelatedVideo;
import com.kuaishou.merchant.transaction.base.detail.guesslike.model.GuessLikePhotoDetailInfoModel;
import com.kuaishou.merchant.transaction.base.detail.guesslike.GuessLikePhotoListHolder;
import java.util.Objects;
import zc4.b;
import qvb.a;
import xs3.g;
import qvb.i;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.IndexOutOfBoundsException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import bd4.d;
import android.view.View$OnClickListener;
import com.yxcorp.utility.n;
import xc4.a;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class g extends a	// class@00038c
{
    public TextView A;
    public TextView B;
    public GuessLikePhotoListHolder C;
    public BaseFragment D;
    public GifshowActivity w;
    public KwaiImageView x;
    public TextView y;
    public TextView z;
    public static int E;

    public void g(Fragment p0){
       super(p0);
    }
    public void E8(){
       g og = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, og, "4")) {
          return;
       }
       super.E8();
       int i = 0;
       Object[] objArray1 = new Object[i];
       a.C().w("MerchantGuessLikeCommonPresenter", "onBind", objArray1);
       if (!q.f(this.s.mPicUrl)) {
          this.x.P(this.s.mPicUrl);
       }
       if (!PatchProxy.applyVoid(objArray, this, og, "7")) {
          MerchantRecommendInfoModel mProductConv = this.s.mProductConvergenceInfo;
          if (mProductConv == null || q.f(mProductConv.mTitleTagListV2)) {
             this.y.setText(TextUtils.k(this.s.mTitle));
          }else {
             this.X7(d.e(this.s.mProductConvergenceInfo.mTitleTagListV2).subscribe(new e(this)));
          }
       }
       int i1 = 0x7f070f6e;
       a uoa = 8;
       if (!TextUtils.x(this.s.mPriceNum)) {
          this.z.setVisibility(i);
          this.z.setText(p0.e(this.s.mPriceNum, a1.d(i1), a1.d(R.dimen.arg_RES_7f070f76)));
       }else {
          this.z.setVisibility(uoa);
       }
       a tt = this.t;
       if (tt != null && !TextUtils.x(tt.mOriginPriceDesc)) {
          this.A.setVisibility(i);
          this.A.setText(p0.e(this.t.mOriginPriceDesc, a1.d(i1), a1.d(R.dimen.arg_RES_7f070f70)));
       }else {
          this.A.setVisibility(uoa);
       }
       og = this.A;
       og.setPaintFlags((og.getPaintFlags() | 0x10));
       og = this.B;
       MerchantRecommendInfoModel mSoldNewAmou = (TextUtils.x(this.s.mSource))? this.s.mSoldNewAmount: this.s.mSource;
       og.setText(mSoldNewAmou);
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().w("MerchantGuessLikeCommonPresenter", "onCreate", objArray);
       this.w = this.P8();
       this.z.setTypeface(d0.a("alte-din.ttf", this.getContext()));
       this.A.setTypeface(d0.a("alte-din.ttf", this.getContext()));
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, g.class, "6")) {
          return;
       }
       if (this.w != null) {
          this.w = null;
       }
       this.D = null;
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, g.class, "5")) {
          return;
       }
       super.J8();
       Object[] objArray = new Object[0];
       a.C().w("MerchantGuessLikeCommonPresenter", "onUnbind", objArray);
       return;
    }
    public final void W8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "9")) {
          return;
       }
       if (this.w != null && !TextUtils.x(p0)) {
          d.a(0x7074b578).XZ(this.w, p0);
       }
       return;
    }
    public final void X8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, g.class, "11")) {
          return;
       }
       GuessLikePhotoDetailInfoModel photoInfoMod = this.C.getPhotoInfoModel(this.t.mItemRelatedVideo.mPhotoId);
       if (photoInfoMod != null) {
          objArray = photoInfoMod.mQPhoto;
       }
       Object[] objArray1 = objArray;
       if (objArray1 != null) {
          g tC = this.C;
          GuessLikePhotoListHolder mMerchantGue = tC.mMerchantGuessLikePageList;
          List qPhotos = tC.getQPhotos();
          Objects.requireNonNull(mMerchantGue);
          if (!PatchProxy.applyVoidOneRefs(qPhotos, mMerchantGue, b.class, "1")) {
             mMerchantGue.b.clear();
             mMerchantGue.b.addAll(qPhotos);
          }
          d.a(0x5c964f0a).AU(this.w, this.D, this.C.mMerchantGuessLikePageList, objArray1, photoInfoMod.mIndex);
       }else {
          ExceptionHandler.handleException(this.w, new IndexOutOfBoundsException("´ò¿ªÊ§°Ü"));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       this.x = m1.f(p0, 0x7f0a1556);
       this.y = m1.f(p0, 0x7f0a41d0);
       this.z = m1.f(p0, 0x7f0a41d3);
       this.A = m1.f(p0, 0x7f0a41d2);
       this.B = m1.f(p0, 0x7f0a41d4);
       m1.a(p0, new d(this), R.id.cl_merchant_detail_guess_like_root);
       if (!g.E) {
          g.E = (n.z(this.P8()) - (a.a * 3)) / 2;
       }
       p0.height = g.E;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       super.j8();
       this.C = this.r8("MERCHANT_DETAIL_GUESS_PHOTO_MODEL");
       this.D = this.r8("FRAGMENT");
       return;
    }
}
