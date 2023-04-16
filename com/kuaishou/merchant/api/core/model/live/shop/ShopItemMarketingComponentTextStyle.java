package com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentTextStyle;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class ShopItemMarketingComponentTextStyle implements Serializable	// class@001557
{
    public float mBackgroundAlpha;
    public String mBackgroundColor;
    public String mBorderColor;
    public float mBorderRadius;
    public int mFontName;
    public int mFontSize;
    public int mFontType;
    public int mHeight;
    public float mMinWidth;
    public float mStrokeWidth;
    public int mSweepLightCount;
    public String mTextColor;
    public int mWidth;
    public long sweepLightDurationMillis;
    public long sweepLightPeriodMillis;
    public int textRemainLength;

    public void ShopItemMarketingComponentTextStyle(){
       super();
       this.mTextColor = "";
       this.mBorderColor = "";
       this.mBackgroundColor = "";
    }
    public static void getMFontName$annotations(){
    }
    public static void getMFontType$annotations(){
    }
    public final float getMBackgroundAlpha(){
       return this.mBackgroundAlpha;
    }
    public final String getMBackgroundColor(){
       return this.mBackgroundColor;
    }
    public final String getMBorderColor(){
       return this.mBorderColor;
    }
    public final float getMBorderRadius(){
       return this.mBorderRadius;
    }
    public final int getMFontName(){
       return this.mFontName;
    }
    public final int getMFontSize(){
       return this.mFontSize;
    }
    public final int getMFontType(){
       return this.mFontType;
    }
    public final int getMHeight(){
       return this.mHeight;
    }
    public final float getMMinWidth(){
       return this.mMinWidth;
    }
    public final float getMStrokeWidth(){
       return this.mStrokeWidth;
    }
    public final int getMSweepLightCount(){
       return this.mSweepLightCount;
    }
    public final String getMTextColor(){
       return this.mTextColor;
    }
    public final int getMWidth(){
       return this.mWidth;
    }
    public final long getSweepLightDurationMillis(){
       return this.sweepLightDurationMillis;
    }
    public final long getSweepLightPeriodMillis(){
       return this.sweepLightPeriodMillis;
    }
    public final int getTextRemainLength(){
       return this.textRemainLength;
    }
    public final void setMBackgroundAlpha(float p0){
       this.mBackgroundAlpha = p0;
    }
    public final void setMBackgroundColor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShopItemMarketingComponentTextStyle.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mBackgroundColor = p0;
       return;
    }
    public final void setMBorderColor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShopItemMarketingComponentTextStyle.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mBorderColor = p0;
       return;
    }
    public final void setMBorderRadius(float p0){
       this.mBorderRadius = p0;
    }
    public final void setMFontName(int p0){
       this.mFontName = p0;
    }
    public final void setMFontSize(int p0){
       this.mFontSize = p0;
    }
    public final void setMFontType(int p0){
       this.mFontType = p0;
    }
    public final void setMHeight(int p0){
       this.mHeight = p0;
    }
    public final void setMMinWidth(float p0){
       this.mMinWidth = p0;
    }
    public final void setMStrokeWidth(float p0){
       this.mStrokeWidth = p0;
    }
    public final void setMSweepLightCount(int p0){
       this.mSweepLightCount = p0;
    }
    public final void setMTextColor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShopItemMarketingComponentTextStyle.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mTextColor = p0;
       return;
    }
    public final void setMWidth(int p0){
       this.mWidth = p0;
    }
    public final void setSweepLightDurationMillis(long p0){
       this.sweepLightDurationMillis = p0;
    }
    public final void setSweepLightPeriodMillis(long p0){
       this.sweepLightPeriodMillis = p0;
    }
    public final void setTextRemainLength(int p0){
       this.textRemainLength = p0;
    }
}
