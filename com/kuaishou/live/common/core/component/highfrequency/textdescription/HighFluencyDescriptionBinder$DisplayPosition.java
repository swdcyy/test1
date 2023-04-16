package com.kuaishou.live.common.core.component.highfrequency.textdescription.HighFluencyDescriptionBinder$DisplayPosition;
import java.lang.Enum;
import android.graphics.Typeface;
import lnc.a1;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class HighFluencyDescriptionBinder$DisplayPosition extends Enum	// class@001340
{
    public final int mDefaultColorRes;
    public final int mDefaultShadowColor;
    public final int mNumberSizeDp;
    public final int mPostfixViewPaddingLeftPx;
    public final int mPostfixViewPaddingTopPx;
    public final int mTextSizeDp;
    public final Typeface mTypeface;
    public final int mTypefaceStyle;
    public static final HighFluencyDescriptionBinder$DisplayPosition[] $VALUES;
    public static final HighFluencyDescriptionBinder$DisplayPosition SubTitle;
    public static final HighFluencyDescriptionBinder$DisplayPosition Title;

    static {
       HighFluencyDescriptionBinder$DisplayPosition uDisplayPosi = new HighFluencyDescriptionBinder$DisplayPosition("Title", 0, 0x7f0620c7, 14, 18, Typeface.SANS_SERIF, 1, 0x7f0604bb, a1.e(4.00f), a1.e(0x3f800000));
       HighFluencyDescriptionBinder$DisplayPosition.Title = v11;
       HighFluencyDescriptionBinder$DisplayPosition uDisplayPosi1 = new HighFluencyDescriptionBinder$DisplayPosition("SubTitle", 1, 0x7f0620ea, 10, 10, Typeface.DEFAULT, 0, 0x7f0604bb, 0, 0);
       HighFluencyDescriptionBinder$DisplayPosition.SubTitle = uDisplayPosi;
       HighFluencyDescriptionBinder$DisplayPosition[] uDisplayPosi2 = new HighFluencyDescriptionBinder$DisplayPosition[]{v11,uDisplayPosi};
       HighFluencyDescriptionBinder$DisplayPosition.$VALUES = uDisplayPosi2;
    }
    public void HighFluencyDescriptionBinder$DisplayPosition(String p0,int p1,int p2,int p3,int p4,Typeface p5,int p6,int p7,int p8,int p9){
       super(p0, p1);
       this.mDefaultColorRes = p2;
       this.mTextSizeDp = p3;
       this.mNumberSizeDp = p4;
       this.mTypeface = p5;
       this.mTypefaceStyle = p6;
       this.mPostfixViewPaddingLeftPx = p8;
       this.mPostfixViewPaddingTopPx = p9;
       this.mDefaultShadowColor = p7;
    }
    public static HighFluencyDescriptionBinder$DisplayPosition valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, HighFluencyDescriptionBinder$DisplayPosition.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(HighFluencyDescriptionBinder$DisplayPosition.class, p0);
    }
    public static HighFluencyDescriptionBinder$DisplayPosition[] values(){
       Object obj = PatchProxy.apply(null, null, HighFluencyDescriptionBinder$DisplayPosition.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return HighFluencyDescriptionBinder$DisplayPosition.$VALUES.clone();
    }
}
