package com.kwai.video.player.KsMediaMeta$KSYStreamMeta;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Locale;
import java.lang.Long;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Number;
import java.lang.Integer;
import android.os.Bundle;

public class KsMediaMeta$KSYStreamMeta	// class@000ad3
{
    public long mBitrate;
    public long mChannelLayout;
    public String mCodecLongName;
    public String mCodecName;
    public String mCodecProfile;
    public int mFpsDen;
    public int mFpsNum;
    public int mHeight;
    public final int mIndex;
    public String mLanguage;
    public Bundle mMeta;
    public int mSampleRate;
    public int mSarDen;
    public int mSarNum;
    public int mTbrDen;
    public int mTbrNum;
    public String mType;
    public int mWidth;

    public void KsMediaMeta$KSYStreamMeta(int p0){
       super();
       this.mIndex = p0;
    }
    public String getBitrateInline(){
       Object[] objArray;
       KsMediaMeta$KSYStreamMeta obj = PatchProxy.apply(null, this, KsMediaMeta$KSYStreamMeta.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mBitrate;
       if (obj <= 0) {
          return "N/A";
       }
       int i = 1;
       Locale locale = 1000;
       if (obj - locale < 0) {
          objArray = new Object[i];
          objArray[0] = Long.valueOf(obj);
          return String.format(Locale.US, "%d bit/s", objArray);
       }else {
          objArray = new Object[i];
          objArray[0] = Long.valueOf((obj / locale));
          return String.format(Locale.US, "%d kb/s", objArray);
       }
    }
    public String getChannelLayoutInline(){
       KsMediaMeta$KSYStreamMeta obj = PatchProxy.apply(null, this, KsMediaMeta$KSYStreamMeta.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mChannelLayout;
       if (obj <= 0) {
          return "N/A";
       }
       if (!obj - 4) {
          return "mono";
       }
       if (!obj - 3) {
          return "stereo";
       }
       Object[] objArray = new Object[]{Long.valueOf(obj)};
       return String.format(Locale.US, "%x", objArray);
    }
    public String getCodecLongNameInline(){
       Object obj = PatchProxy.apply(null, this, KsMediaMeta$KSYStreamMeta.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(this.mCodecLongName)) {
          return this.mCodecLongName;
       }
       if (!TextUtils.isEmpty(this.mCodecName)) {
          return this.mCodecName;
       }
       return "N/A";
    }
    public String getCodecShortNameInline(){
       Object obj = PatchProxy.apply(null, this, KsMediaMeta$KSYStreamMeta.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(this.mCodecName)) {
          return this.mCodecName;
       }
       return "N/A";
    }
    public String getFpsInline(){
       KsMediaMeta$KSYStreamMeta obj = PatchProxy.apply(null, this, KsMediaMeta$KSYStreamMeta.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mFpsNum;
       if (obj > null) {
          KsMediaMeta$KSYStreamMeta tmFpsDen = this.mFpsDen;
          if (tmFpsDen > null) {
             return String.valueOf(((float)obj / (float)tmFpsDen));
          }
       }
       return "N/A";
    }
    public int getInt(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KsMediaMeta$KSYStreamMeta.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getInt(p0, 0);
    }
    public int getInt(String p0,int p1){
       KsMediaMeta$KSYStreamMeta kSYStreamMet = KsMediaMeta$KSYStreamMeta.class;
       if (PatchProxy.isSupport(kSYStreamMet)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, kSYStreamMet, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       p0 = this.getString(p0);
       if (TextUtils.isEmpty(p0)) {
          return p1;
       }else {
          try{
             return Integer.parseInt(p0);
          }catch(java.lang.NumberFormatException e0){
             return p1;
          }
       }
    }
    public long getLong(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KsMediaMeta$KSYStreamMeta.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.getLong(p0, 0);
    }
    public long getLong(String p0,long p1){
       KsMediaMeta$KSYStreamMeta kSYStreamMet = KsMediaMeta$KSYStreamMeta.class;
       if (PatchProxy.isSupport(kSYStreamMet)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), this, kSYStreamMet, "5");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       p0 = this.getString(p0);
       if (TextUtils.isEmpty(p0)) {
          return p1;
       }else {
          try{
             return Long.parseLong(p0);
          }catch(java.lang.NumberFormatException e0){
             return p1;
          }
       }
    }
    public String getResolutionInline(){
       KsMediaMeta$KSYStreamMeta obj = PatchProxy.apply(null, this, KsMediaMeta$KSYStreamMeta.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mWidth;
       if (obj <= null || this.mHeight <= null) {
          return "N/A";
       }
       int i = 1;
       int i1 = 2;
       if (this.mSarNum <= null || this.mSarDen <= null) {
          Object[] objArray = new Object[i1];
          objArray[0] = Integer.valueOf(obj);
          objArray[i] = Integer.valueOf(this.mHeight);
          return String.format(Locale.US, "%d x %d", objArray);
       }else {
          Object[] objArray1 = new Object[]{Integer.valueOf(obj),Integer.valueOf(this.mHeight),Integer.valueOf(this.mSarNum),Integer.valueOf(this.mSarDen)};
          return String.format(Locale.US, "%d x %d [SAR %d:%d]", objArray1);
       }
    }
    public String getSampleRateInline(){
       KsMediaMeta$KSYStreamMeta obj = PatchProxy.apply(null, this, KsMediaMeta$KSYStreamMeta.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mSampleRate;
       if (obj <= null) {
          return "N/A";
       }
       Object[] objArray = new Object[]{Integer.valueOf(obj)};
       return String.format(Locale.US, "%d Hz", objArray);
    }
    public String getString(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KsMediaMeta$KSYStreamMeta.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mMeta.getString(p0);
    }
}
