package bd4.a;
import rk0.b;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.merchant.transaction.base.detail.guesslike.model.a;
import com.kuaishou.merchant.transaction.base.detail.guesslike.model.MerchantRecommendInfoModel;
import com.kuaishou.merchant.transaction.base.detail.guesslike.model.MerchantRecommendInfoModel$ProductConvergenceInfo;
import com.kuaishou.merchant.transaction.base.detail.guesslike.model.MerchantRecommendInfoModel$ItemRelatedVideo;
import java.util.List;
import zc4.a;
import java.lang.Integer;
import lnc.i3;
import java.util.HashMap;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import zd4.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import tkd.b;
import tkd.d;
import nl9.s;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Collection;
import com.kuaishou.merchant.api.core.model.Commodity$IconLabel;
import trd.y;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class a extends b	// class@000384
{
    public MerchantRecommendInfoModel s;
    public MerchantRecommendInfoModel$ProductConvergenceInfo t;
    public int u;
    public a v;

    public void a(Fragment p0){
       super(p0);
    }
    public void E8(){
       a tu;
       MerchantRecommendInfoModel$ItemRelatedVideo mShowType;
       i3 oi3;
       ClientEvent$ElementPackage uElementPack;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "2")) {
          return;
       }
       a tv = this.v;
       String str = "mUiModel";
       if (tv == null) {
          a.S(str);
       }
       tv = tv.c;
       if (tv instanceof MerchantRecommendInfoModel) {
          objArray = tv;
       }
       this.s = objArray;
       if (objArray != null) {
          this.u = objArray.mIndex;
          tv = this.v;
          if (tv == null) {
             a.S(str);
          }
          tv = tv.e;
          if (tv != null) {
             tu = this.u;
             MerchantRecommendInfoModel mItemId = objArray.mItemId;
             MerchantRecommendInfoModel mLogExtData = objArray.mLogExtData;
             a tt = this.t;
             int i = 0;
             if (tt != null) {
                MerchantRecommendInfoModel$ProductConvergenceInfo mItemRelated = tt.mItemRelatedVideo;
                if (mItemRelated != null) {
                   mShowType = mItemRelated.mShowType;
                label_0045 :
                   MerchantRecommendInfoModel mSoldNum = objArray.mSoldNum;
                   List list = this.S8();
                   MerchantRecommendInfoModel mCardType = objArray.mCardType;
                   a uoa = a.class;
                   if (PatchProxy.isSupport(uoa)) {
                      Object[] objArray1 = new Object[]{Integer.valueOf(tu),mItemId,mLogExtData,Integer.valueOf(mShowType),mSoldNum,list,Integer.valueOf(mCardType)};
                      if (!PatchProxy.applyVoid(objArray1, tv, uoa, "1")) {
                      }
                   }else {
                   }
                }
             }
             mShowType = 0;
             goto label_0045 ;
          }
       label_00c8 :
          MerchantRecommendInfoModel mAdFeedInfo = objArray.mAdFeedInfo;
          if (mAdFeedInfo != null) {
             tu = this.v;
             if (tu == null) {
                a.S(str);
             }
             a e = tu.e;
             if (e != null) {
                MerchantRecommendInfoModel mItemId1 = objArray.mItemId;
                MerchantRecommendInfoModel mAdLoggerInf = objArray.mAdLoggerInfo;
                if (!PatchProxy.applyVoidThreeRefs(mAdFeedInfo, mItemId1, mAdLoggerInf, e, a.class, "2") && (!TextUtils.x(mAdFeedInfo) && !e.b.contains(mItemId1))) {
                   e.b.add(mItemId1);
                   d.a(0x1a96cf04).G6(mAdFeedInfo, mAdLoggerInf);
                }
             }
          }
       }
    label_0109 :
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       super.J8();
       this.u = -1;
       this.t = null;
       return;
    }
    public List S8(){
       ArrayList obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       a ts = this.s;
       if (ts != null) {
          MerchantRecommendInfoModel mProductConv = ts.mProductConvergenceInfo;
          if (mProductConv != null) {
             MerchantRecommendInfoModel$ProductConvergenceInfo mTitleTagLis = mProductConv.mTitleTagListV2;
             if (mTitleTagLis != null) {
                obj.addAll(mTitleTagLis);
             }
          }
       }
       ts = this.s;
       if (ts != null) {
          Commodity$IconLabel[] bottomTagLis = ts.getBottomTagList();
          if (bottomTagLis != null) {
             y.s0(obj, bottomTagLis);
          }
       }
       return obj;
    }
    public void V8(){
       MerchantRecommendInfoModel$ItemRelatedVideo mShowType;
       i3 oi3;
       ClientEvent$ElementPackage uElementPack;
       Object obj = this;
       String str = "5";
       if (PatchProxy.applyVoid(null, obj, a.class, str)) {
          return;
       }
       a s = obj.s;
       if (s != null) {
          a v = obj.v;
          if (v == null) {
             a.S("mUiModel");
          }
          v = v.e;
          if (v != null) {
             a u = obj.u;
             MerchantRecommendInfoModel mItemId = s.mItemId;
             MerchantRecommendInfoModel mLogExtData = s.mLogExtData;
             a t = obj.t;
             int i = 0;
             if (t != null) {
                MerchantRecommendInfoModel$ProductConvergenceInfo mItemRelated = t.mItemRelatedVideo;
                if (mItemRelated != null) {
                   mShowType = mItemRelated.mShowType;
                label_0032 :
                   MerchantRecommendInfoModel mSoldNum = s.mSoldNum;
                   List list = this.S8();
                   MerchantRecommendInfoModel mCardType = s.mCardType;
                   if (PatchProxy.isSupport(a.class)) {
                      Object[] objArray = new Object[]{Integer.valueOf(u),mItemId,mLogExtData,Integer.valueOf(mShowType),mSoldNum,list,Integer.valueOf(mCardType)};
                      if (!PatchProxy.applyVoid(objArray, v, a.class, str)) {
                      }
                   }else {
                   }
                }
             }
             mShowType = 0;
             goto label_0032 ;
          }
       label_00b7 :
          MerchantRecommendInfoModel mAdFeedInfo = s.mAdFeedInfo;
          if (mAdFeedInfo != null) {
             a v1 = obj.v;
             if (v1 == null) {
                a.S("mUiModel");
             }
             v1 = v1.e;
             if (v1 != null) {
                v1.i(mAdFeedInfo, s.mAdLoggerInfo);
             }
          }
       }
    label_00cb :
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.v = this.q8(a.class);
       return;
    }
}
