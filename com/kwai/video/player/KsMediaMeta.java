package com.kwai.video.player.KsMediaMeta;
import java.lang.Object;
import java.util.ArrayList;
import android.os.Bundle;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Double;
import java.util.Iterator;
import com.kwai.video.player.KsMediaMeta$KSYStreamMeta;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Locale;
import java.lang.Long;
import java.lang.Number;
import java.lang.Integer;

public class KsMediaMeta	// class@000ad4
{
    public int mAnalyzeDnsTime;
    public KsMediaMeta$KSYStreamMeta mAudioStream;
    public long mBitrate;
    public long mDurationUS;
    public String mFormat;
    public int mHttpCode;
    public int mHttpConnectTime;
    public String mHttpContentLength;
    public String mHttpContentRange;
    public int mHttpFirstDataTime;
    public String mHttpRedirect;
    public String mHttpXCache;
    public Bundle mMediaMeta;
    public long mStartUS;
    public String mStreamId;
    public final ArrayList mStreams;
    public KsMediaMeta$KSYStreamMeta mVideoStream;

    public void KsMediaMeta(){
       super();
       this.mStreams = new ArrayList();
       this.mHttpConnectTime = 0;
       this.mHttpFirstDataTime = 0;
    }
    public static KsMediaMeta parse(Bundle p0){
       String str = "first_data_time";
       String str1 = "connect_time";
       Object obj = null;
       KsMediaMeta obj1 = PatchProxy.applyOneRefs(p0, obj, KsMediaMeta.class, "8");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       obj1 = new KsMediaMeta();
       obj1.mMediaMeta = p0;
       obj1.mFormat = obj1.getString("format");
       obj1.mDurationUS = obj1.getLong("duration_us");
       obj1.mStartUS = obj1.getLong("start_us");
       obj1.mBitrate = obj1.getLong("bitrate");
       int i = -1;
       int intx = obj1.getInt("video", i);
       int intx1 = obj1.getInt("audio", i);
       obj1.mFormat = obj1.getString("http_x_cache");
       obj1.mHttpRedirect = obj1.getString("http_redirect");
       obj1.mHttpContentRange = obj1.getString("http_content_range");
       obj1.mHttpContentLength = obj1.getString("http_content_length");
       int i1 = 0;
       obj1.mAnalyzeDnsTime = obj1.getInt("analyze_dns_time", i1);
       obj1.mHttpCode = obj1.getInt("http_code", i1);
       String str2 = obj1.getString("streamId");
       try{
          obj1.mStreamId = str2;
          if (obj1.getString(str1) != null) {
             obj1.mHttpConnectTime = new Double(obj1.getString(str1)).intValue();
          label_0099 :
             if (obj1.getString(str) != null) {
                obj1.mHttpFirstDataTime = new Double(obj1.getString(str)).intValue();
             }
          }else {
             goto label_0099 ;
          }
       }catch(java.lang.NumberFormatException e0){
          obj1.mHttpConnectTime = i1;
          obj1.mHttpFirstDataTime = i1;
       }
       ArrayList parcelableAr = obj1.getParcelableArrayList("streams");
       if (parcelableAr == null) {
          return obj1;
       }else {
          Iterator iterator = parcelableAr.iterator();
          while (iterator.hasNext()) {
             Bundle uBundle = iterator.next();
             i = i + 1;
             if (uBundle == null) {
                continue ;
             }else {
                KsMediaMeta$KSYStreamMeta kSYStreamMet = new KsMediaMeta$KSYStreamMeta(i);
                kSYStreamMet.mMeta = uBundle;
                kSYStreamMet.mType = kSYStreamMet.getString("type");
                kSYStreamMet.mLanguage = kSYStreamMet.getString("language");
                if (TextUtils.isEmpty(kSYStreamMet.mType)) {
                   continue ;
                }else {
                   kSYStreamMet.mCodecName = kSYStreamMet.getString("codec_name");
                   kSYStreamMet.mCodecProfile = kSYStreamMet.getString("codec_profile");
                   kSYStreamMet.mCodecLongName = kSYStreamMet.getString("codec_long_name");
                   kSYStreamMet.mBitrate = (long)kSYStreamMet.getInt("bitrate");
                   if ((kSYStreamMet.mType).equalsIgnoreCase("video")) {
                      kSYStreamMet.mWidth = kSYStreamMet.getInt("width");
                      kSYStreamMet.mHeight = kSYStreamMet.getInt("height");
                      kSYStreamMet.mFpsNum = kSYStreamMet.getInt("fps_num");
                      kSYStreamMet.mFpsDen = kSYStreamMet.getInt("fps_den");
                      kSYStreamMet.mTbrNum = kSYStreamMet.getInt("tbr_num");
                      kSYStreamMet.mTbrDen = kSYStreamMet.getInt("tbr_den");
                      kSYStreamMet.mSarNum = kSYStreamMet.getInt("sar_num");
                      kSYStreamMet.mSarDen = kSYStreamMet.getInt("sar_den");
                      if (intx == i) {
                         obj1.mVideoStream = kSYStreamMet;
                      }
                   }else if((kSYStreamMet.mType).equalsIgnoreCase("audio")){
                      kSYStreamMet.mSampleRate = kSYStreamMet.getInt("sample_rate");
                      kSYStreamMet.mChannelLayout = kSYStreamMet.getLong("channel_layout");
                      if (intx1 == i) {
                         obj1.mAudioStream = kSYStreamMet;
                      }
                   }
                   obj1.mStreams.add(kSYStreamMet);
                }
             }
          }
          return obj1;
       }
    }
    public String getDurationInline(){
       Object obj = PatchProxy.apply(null, this, KsMediaMeta.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       long l = (this.mDurationUS + 5000) / 0xf4240;
       long l1 = l / 60;
       long l2 = l1 / 60;
       Object[] objArray = new Object[]{Long.valueOf(l2),Long.valueOf((l1 % 60)),Long.valueOf((l % 60))};
       return String.format(Locale.US, "%02d:%02d:%02d", objArray);
    }
    public int getInt(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KsMediaMeta.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getInt(p0, 0);
    }
    public int getInt(String p0,int p1){
       KsMediaMeta ksMediaMeta = KsMediaMeta.class;
       if (PatchProxy.isSupport(ksMediaMeta)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, ksMediaMeta, "3");
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
       Object obj = PatchProxy.applyOneRefs(p0, this, KsMediaMeta.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.getLong(p0, 0);
    }
    public long getLong(String p0,long p1){
       KsMediaMeta ksMediaMeta = KsMediaMeta.class;
       if (PatchProxy.isSupport(ksMediaMeta)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), this, ksMediaMeta, "5");
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
    public ArrayList getParcelableArrayList(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KsMediaMeta.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mMediaMeta.getParcelableArrayList(p0);
    }
    public String getString(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KsMediaMeta.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mMediaMeta.getString(p0);
    }
}
