package com.yxcorp.gifshow.v3.mixed.editor.frame.MixFrameAdjustInfo;
import java.io.Serializable;
import lnc.a1;
import com.google.common.collect.ImmutableList$a;
import com.google.common.collect.ImmutableList;
import java.lang.Object;
import java.lang.String;

public class MixFrameAdjustInfo implements Serializable	// class@00154a
{
    public final int mIconHeight;
    public final int mIconWidth;
    public boolean mIsSelected;
    public final int mNameRes;
    public final int mVideoRatioPreset;
    public static final MixFrameAdjustInfo ORIGIN_PRESET_INFO;
    public static final ImmutableList PRESET_LIST;
    public static final long serialVersionUID;

    static {
       MixFrameAdjustInfo mixFrameAdju = new MixFrameAdjustInfo(1, 0x7f10106a, a1.d(0x7f070410), a1.d(0x7f070410));
       MixFrameAdjustInfo.ORIGIN_PRESET_INFO = mixFrameAdju;
       ImmutableList$a uoa = ImmutableList.builder();
       uoa.h(mixFrameAdju);
       uoa.h(new MixFrameAdjustInfo(2, R.string.arg_RES_7f101068, a1.d(R.dimen.arg_RES_7f070416), a1.d(R.dimen.arg_RES_7f070415)));
       uoa.h(new MixFrameAdjustInfo(4, R.string.arg_RES_7f101065, a1.d(R.dimen.arg_RES_7f070410), a1.d(R.dimen.arg_RES_7f070410)));
       uoa.h(new MixFrameAdjustInfo(3, R.string.arg_RES_7f101066, a1.d(R.dimen.arg_RES_7f070412), a1.d(R.dimen.arg_RES_7f070411)));
       uoa.h(new MixFrameAdjustInfo(5, R.string.arg_RES_7f101067, a1.d(R.dimen.arg_RES_7f070414), a1.d(R.dimen.arg_RES_7f070413)));
       MixFrameAdjustInfo.PRESET_LIST = uoa.i();
    }
    public void MixFrameAdjustInfo(int p0,int p1,int p2,int p3){
       super();
       this.mIsSelected = false;
       this.mVideoRatioPreset = p0;
       this.mNameRes = p1;
       this.mIconWidth = p2;
       this.mIconHeight = p3;
    }
    public boolean equals(Object p0){
       boolean b = false;
       if (!p0 instanceof MixFrameAdjustInfo) {
          return b;
       }
       if (p0.mVideoRatioPreset == this.mVideoRatioPreset) {
          b = true;
       }
       return b;
    }
    public String getLogInfo(){
       MixFrameAdjustInfo tmVideoRatio = this.mVideoRatioPreset;
       if (tmVideoRatio == 2) {
          return "9:16";
       }
       if (tmVideoRatio == 3) {
          return "3:4";
       }
       if (tmVideoRatio == 4) {
          return "1:1";
       }
       if (tmVideoRatio != 5) {
          return "original";
       }
       return "4:3";
    }
}
