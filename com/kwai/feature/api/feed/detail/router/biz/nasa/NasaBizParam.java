package com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import java.lang.Object;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import android.os.Bundle;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Parcelable;
import org.parceler.b;
import android.content.Intent;
import android.app.Activity;
import ekd.j0;
import android.app.Application;
import com.yxcorp.utility.repo.a;
import com.kwai.sdk.switchconfig.a;
import o56.a;
import android.net.Uri;
import com.yxcorp.gifshow.model.response.HotChannelColumn;
import com.kuaishou.android.model.mix.ChannelContentListInfo;
import ekd.x0;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Exception;

public final class NasaBizParam	// class@000ea6
{
    public int mAtlasPhotoIndex;
    public int mAtlasPhotoOffset;
    public String mCouponAccountId;
    public String mFansGuidePhotoId;
    public HotChannelColumn mHotChannelColumn;
    public String mHotChannelId;
    public NasaSlideParam mNasaSlideParam;
    public boolean mNeedReplaceFeed;
    public int mPopSharePanelStyle;
    public boolean mShouldShowFloatWidget;
    public int mSourceType;
    public e mTrendingDetailParams;

    public void NasaBizParam(){
       super();
       this.mNasaSlideParam = NasaSlideParam.NULL;
       this.mNeedReplaceFeed = true;
       this.mShouldShowFloatWidget = true;
    }
    public static NasaBizParam getBizParamFromBundle(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, NasaBizParam.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(p0.getParcelable("nasaBizParam"));
    }
    public static NasaBizParam getBizParamFromIntent(Intent p0,Activity p1){
       String obj = PatchProxy.applyTwoRefs(p0, p1, null, NasaBizParam.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "nasaBizParamRepoId";
       if (j0.g(p0, obj)) {
          return a.b(p1.getApplication()).a(p0.getIntExtra(obj, 0), p1);
       }
       return b.a(p0.getParcelableExtra("nasaBizParam"));
    }
    public NasaSlideParam getNasaSlideParam(){
       return this.mNasaSlideParam;
    }
    public void putParamIntoBundle(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaBizParam.class, "3")) {
          return;
       }
       p0.putParcelable("nasaBizParam", b.c(this));
       return;
    }
    public void putParamIntoIntent(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaBizParam.class, "1")) {
          return;
       }
       if (a.t().d("enableNasaBizParamUnSerialize", false)) {
          p0.putExtra("nasaBizParamRepoId", a.b(a.b()).c(this));
       }else {
          p0.putExtra("nasaBizParam", b.c(this));
       }
       return;
    }
    public void setChannelParams(Intent p0){
       ChannelContentListInfo uChannelCont;
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaBizParam.class, "5")) {
          return;
       }
       Uri data = p0.getData();
       if (data != null && data.isHierarchical()) {
          HotChannelColumn hotChannelCo = new HotChannelColumn();
          try{
             uChannelCont = new ChannelContentListInfo();
             this.mHotChannelId = x0.a(data, "hotChannelId");
             this.mSourceType = Integer.parseInt(x0.a(data, "sourceType"));
             hotChannelCo.mFullColumnId = Long.parseLong(x0.b(data, "fullColumnId", "0"));
             hotChannelCo.mTotalNum = Integer.parseInt(x0.a(data, "totalNum"));
             hotChannelCo.mMainTitle = a.b().getString(0x7f100509);
             hotChannelCo.mRepositionPCursor = x0.a(data, "pcursor");
             uChannelCont.mContentListTitle = x0.a(data, "contentListTitle");
             uChannelCont.mShowContentList = data.getBooleanQueryParameter("showContentList", false);
          }catch(java.lang.Exception e5){
             e5.printStackTrace();
          }
          hotChannelCo.mContentListInfo = uChannelCont;
          this.mHotChannelColumn = hotChannelCo;
       }
       return;
    }
    public void setNasaSlideParam(NasaSlideParam p0){
       this.mNasaSlideParam = p0;
    }
}
