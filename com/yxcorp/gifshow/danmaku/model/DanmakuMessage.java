package com.yxcorp.gifshow.danmaku.model.DanmakuMessage;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.corona.startup.model.DanmakuColor;
import com.kwai.corona.startup.model.DanmakuColor$ColorInfoBean;
import android.graphics.Color;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.danmaku.model.DanmakuData;
import java.lang.CharSequence;
import com.kwai.framework.model.user.QCurrentUser;
import java.util.ArrayList;
import com.yxcorp.gifshow.danmaku.model.DanmakuMessage$DanmakuListViewBindEntity;
import com.kwai.feature.api.danmaku.model.ExtraDanmakuDisplayInfo;

public final class DanmakuMessage implements Serializable	// class@0012a1
{
    public DanmakuMessage$DanmakuListViewBindEntity b;
    public ArrayList bodySections;
    public int isMockType;
    public String mBody;
    public DanmakuColor mColor;
    public int mDanmakuTailType;
    public int mDanmakuType;
    public boolean mDisplayLikeInfo;
    public int mDriftType;
    public ExtraDanmakuDisplayInfo mExtraDanmakuDisplayInfo;
    public int mGrade;
    public String mId;
    public boolean mIsHighCopyDanmaku;
    public boolean mIsLiked;
    public long mLikeCount;
    public String mPlatformDanmakuId;
    public long mPosition;
    public int mQuality;
    public String mSource;
    public String mUserId;

    public void DanmakuMessage(){
       super();
       this.mId = "0";
       this.mBody = "";
       this.mSource = "UNKNOWN";
    }
    public final int a(){
       DanmakuMessage obj = PatchProxy.apply(null, this, DanmakuMessage.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mColor;
       if (obj != null) {
          DanmakuColor mColorInfo = obj.mColorInfo;
          if (mColorInfo != null) {
             try{
                return Color.parseColor(mColorInfo.mColorValue);
             }catch(java.lang.Exception e0){
             }
          }
       }
       return v1;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DanmakuMessage.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0 != this) {
          if (!p0 instanceof DanmakuMessage) {
             p0 = null;
          }
          int i = (p0 != null && (a.g(p0.mId, this.mId) && a.g(this.mBody, p0.mBody)))? 1: 0;
          if (!i) {
             b = false;
          }
       }
       return b;
    }
    public final DanmakuData formatToDanmakuData(QPhoto p0){
       DanmakuData obj = PatchProxy.applyOneRefs(p0, this, DanmakuMessage.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "photo");
       obj = new DanmakuData(this.mBody, this.mPosition);
       obj.mId = this.mId;
       obj.mUserId = this.mUserId;
       obj.mLikeCount = this.mLikeCount;
       obj.mIsliked = this.mIsLiked;
       obj.mQuality = this.mQuality;
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       obj.mSelfSend = a.g(mE.getId(), this.mUserId);
       obj.mSource = this.mSource;
       obj.mPlatformDanmakuId = this.mPlatformDanmakuId;
       obj.mColor = this.a();
       obj.mUnchangedColor = this.a();
       obj.videoUserId = p0.getUserId();
       obj.mDanmakuType = this.mDanmakuType;
       obj.mIsHighCopyDanmaku = this.mIsHighCopyDanmaku;
       obj.mDanmakuTailType = this.mDanmakuTailType;
       obj.mExtraDisplayInfo = this.mExtraDanmakuDisplayInfo;
       obj.mDriftType = this.mDriftType;
       obj.mGrade = this.mGrade;
       obj.mBodySections = this.bodySections;
       obj.mIsMockType = this.isMockType;
       return obj;
    }
    public final ArrayList getBodySections(){
       return this.bodySections;
    }
    public final DanmakuMessage$DanmakuListViewBindEntity getEntity(){
       DanmakuMessage obj = PatchProxy.apply(null, this, DanmakuMessage.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj == null) {
          DanmakuMessage$DanmakuListViewBindEntity uDanmakuList = new DanmakuMessage$DanmakuListViewBindEntity();
          this.b = uDanmakuList;
       }
       return obj;
    }
    public final String getMBody(){
       return this.mBody;
    }
    public final DanmakuColor getMColor(){
       return this.mColor;
    }
    public final int getMDanmakuTailType(){
       return this.mDanmakuTailType;
    }
    public final int getMDanmakuType(){
       return this.mDanmakuType;
    }
    public final boolean getMDisplayLikeInfo(){
       return this.mDisplayLikeInfo;
    }
    public final int getMDriftType(){
       return this.mDriftType;
    }
    public final ExtraDanmakuDisplayInfo getMExtraDanmakuDisplayInfo(){
       return this.mExtraDanmakuDisplayInfo;
    }
    public final int getMGrade(){
       return this.mGrade;
    }
    public final String getMId(){
       return this.mId;
    }
    public final boolean getMIsHighCopyDanmaku(){
       return this.mIsHighCopyDanmaku;
    }
    public final boolean getMIsLiked(){
       return this.mIsLiked;
    }
    public final long getMLikeCount(){
       return this.mLikeCount;
    }
    public final String getMPlatformDanmakuId(){
       return this.mPlatformDanmakuId;
    }
    public final long getMPosition(){
       return this.mPosition;
    }
    public final int getMQuality(){
       return this.mQuality;
    }
    public final String getMSource(){
       return this.mSource;
    }
    public final String getMUserId(){
       return this.mUserId;
    }
    public final int isMockType(){
       return this.isMockType;
    }
    public final void setBodySections(ArrayList p0){
       this.bodySections = p0;
    }
    public final void setMBody(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DanmakuMessage.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mBody = p0;
       return;
    }
    public final void setMColor(DanmakuColor p0){
       this.mColor = p0;
    }
    public final void setMDanmakuTailType(int p0){
       this.mDanmakuTailType = p0;
    }
    public final void setMDanmakuType(int p0){
       this.mDanmakuType = p0;
    }
    public final void setMDisplayLikeInfo(boolean p0){
       this.mDisplayLikeInfo = p0;
    }
    public final void setMDriftType(int p0){
       this.mDriftType = p0;
    }
    public final void setMExtraDanmakuDisplayInfo(ExtraDanmakuDisplayInfo p0){
       this.mExtraDanmakuDisplayInfo = p0;
    }
    public final void setMGrade(int p0){
       this.mGrade = p0;
    }
    public final void setMId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DanmakuMessage.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mId = p0;
       return;
    }
    public final void setMIsHighCopyDanmaku(boolean p0){
       this.mIsHighCopyDanmaku = p0;
    }
    public final void setMIsLiked(boolean p0){
       this.mIsLiked = p0;
    }
    public final void setMLikeCount(long p0){
       this.mLikeCount = p0;
    }
    public final void setMPlatformDanmakuId(String p0){
       this.mPlatformDanmakuId = p0;
    }
    public final void setMPosition(long p0){
       this.mPosition = p0;
    }
    public final void setMQuality(int p0){
       this.mQuality = p0;
    }
    public final void setMSource(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DanmakuMessage.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mSource = p0;
       return;
    }
    public final void setMUserId(String p0){
       this.mUserId = p0;
    }
    public final void setMockType(int p0){
       this.isMockType = p0;
    }
}
