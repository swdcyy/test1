package com.yxcorp.gifshow.ad.tachikoma.bridge.ad.MeasureTextWidthBridge$MeasureTextParams;
import java.io.Serializable;
import com.yxcorp.gifshow.ad.tachikoma.bridge.ad.MeasureTextWidthBridge$MeasureTextParams$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;

public final class MeasureTextWidthBridge$MeasureTextParams implements Serializable	// class@001814
{
    public boolean mAdjustFontSizeWithSystemChange;
    public String mFontFamily;
    public float mFontSize;
    public String mFontWeight;
    public boolean mIncludeFontPadding;
    public String mText;
    public static final MeasureTextWidthBridge$MeasureTextParams$a Companion;
    public static final long serialVersionUID;

    static {
       MeasureTextWidthBridge$MeasureTextParams.Companion = new MeasureTextWidthBridge$MeasureTextParams$a(null);
    }
    public void MeasureTextWidthBridge$MeasureTextParams(){
       super();
       this.mIncludeFontPadding = true;
    }
    public final boolean getMAdjustFontSizeWithSystemChange(){
       return this.mAdjustFontSizeWithSystemChange;
    }
    public final String getMFontFamily(){
       return this.mFontFamily;
    }
    public final float getMFontSize(){
       return this.mFontSize;
    }
    public final String getMFontWeight(){
       return this.mFontWeight;
    }
    public final boolean getMIncludeFontPadding(){
       return this.mIncludeFontPadding;
    }
    public final String getMText(){
       return this.mText;
    }
    public final void setMAdjustFontSizeWithSystemChange(boolean p0){
       this.mAdjustFontSizeWithSystemChange = p0;
    }
    public final void setMFontFamily(String p0){
       this.mFontFamily = p0;
    }
    public final void setMFontSize(float p0){
       this.mFontSize = p0;
    }
    public final void setMFontWeight(String p0){
       this.mFontWeight = p0;
    }
    public final void setMIncludeFontPadding(boolean p0){
       this.mIncludeFontPadding = p0;
    }
    public final void setMText(String p0){
       this.mText = p0;
    }
}
