package com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import java.lang.Cloneable;
import java.io.Serializable;
import um6.a;
import java.lang.Object;
import com.yxcorp.gifshow.model.KtvSelectionInfo;
import android.content.Intent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ekd.j0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fg6.a;
import com.google.gson.Gson;
import org.json.JSONObject;
import java.lang.Integer;
import com.kuaishou.android.model.music.Music;
import com.kuaishou.android.model.music.MusicType;
import org.json.JSONArray;
import com.yxcorp.gifshow.model.CDNUrl;
import gq.a;
import java.lang.Throwable;
import q87.c;
import com.kwai.components.feedmodel.feed.KaraokeScoreInfo;
import java.util.ArrayList;
import v8c.c;
import v8c.b;
import java.io.File;
import qkd.b;
import com.yxcorp.gifshow.model.Lyrics;
import java.lang.Boolean;
import java.util.Iterator;
import java.util.Collection;
import ekd.q;

public class KtvInfo implements Cloneable, Serializable, a	// class@000fc7
{
    public String mAccompanyPath;
    public int mAccompanyVolume;
    public int mAdjustOffset;
    public float mBgVolumeRatio;
    public int mChangeId;
    public int mChorusMode;
    public String mChorusSourceId;
    public ArrayList mChorusSungParts;
    public Lyrics mClipLyric;
    public int mCoverCount;
    public int mCropBegin;
    public int mCropEnd;
    public int mDefaultOffset;
    public boolean mDenoise;
    public int mEffectId;
    public boolean mFromAddMv;
    public boolean mHeadSetAlwaysOn;
    public boolean mIsSongMode;
    public KaraokeScoreInfo mKtvScoreInfo;
    public long mKtvSessionId;
    public PhotoVisibility mKtvVisibility;
    public int mMaxVolume;
    public long mMinEditCropDuration;
    public boolean mMultiPiece;
    public Music mMusic;
    public String mMusicId;
    public int mMusicType;
    public ArrayList mOriginToggleInfos;
    public String mOutputAudioPath;
    public String mOutputCoverPath;
    public String mOutputVideoPath;
    public List mPhotosPath;
    public KtvSelectionInfo mRangeMode;
    public int mRealOffset;
    public int mRecordDelay;
    public ArrayList mRecordPartInfos;
    public String mRecordPath;
    public KtvRecordProfile mRecordProfile;
    public int mRecordVolume;
    public boolean mSameFrameAvailableLayoutInMode;
    public boolean mScoreViewClosed;
    public int mSingDuration;
    public int mSingEnd;
    public int mSingStart;
    public int mTimbreOffset;
    public int mTone;
    public static final long serialVersionUID = 0x13b8cecd065ef91d;

    public void KtvInfo(){
       super();
       this.mRangeMode = KtvSelectionInfo.HOT;
       this.mCoverCount = 1;
       this.mRecordVolume = 50;
       this.mAccompanyVolume = 50;
       this.mEffectId = 0;
       this.mChangeId = 0;
       this.mTone = 0;
       this.mTimbreOffset = 0;
       this.mDenoise = true;
       this.mDefaultOffset = 0;
       this.mRealOffset = 0;
    }
    public static KtvInfo fromIntent(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KtvInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          String str = j0.f(p0, "ktv_info");
          if (TextUtils.x(str)) {
             return null;
          }
          return KtvInfo.fromJson(str);
       }catch(java.lang.Exception e0){
          return null;
       }
    }
    public static KtvInfo fromJson(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KtvInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a.h(p0, KtvInfo.class);
    }
    public void appendToIntent(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KtvInfo.class, "5")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       p0.putExtra("ktv_info", this.toFullJson());
       return;
    }
    public KtvInfo clone(){
       Object obj = PatchProxy.apply(null, this, KtvInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KtvInfo.fromJson(this.toFullJson());
    }
    public Object clone(){
       return this.clone();
    }
    public void fromSimpleJson(JSONObject p0){
       String str;
       String str2;
       KaraokeScoreInfo karaokeScore;
       JSONArray jSONArray;
       String str3;
       if (PatchProxy.applyVoidOneRefs(p0, this, KtvInfo.class, "9")) {
          return;
       }
       this.mRangeMode = KtvSelectionInfo.fromMvParam(p0.optString("recordRange"));
       this.mSingStart = p0.optInt("recordStart");
       int i = p0.optInt("recordEnd");
       this.mSingEnd = i;
       this.mSingDuration = i - this.mSingStart;
       JSONObject jSONObject = p0.optJSONObject("humanvoiceAdjust");
       if (jSONObject != null) {
          str = "0";
          this.mDefaultOffset = Integer.parseInt(jSONObject.optString("default", str));
          this.mAdjustOffset = Integer.parseInt(jSONObject.optString("offset", str));
       }
       String str1 = "musicId";
       str = "musicType";
       if (p0.has(str1) || p0.has(str)) {
          Music music = new Music();
          this.mMusic = music;
          music.mId = p0.optString(str1);
          this.mMusicId = this.mMusic.mId;
          this.mMusicType = p0.optInt(str, 0);
          MusicType[] musicTypeArr = MusicType.values();
          int len = musicTypeArr.length;
          int i1 = 0;
          while (i1 < len) {
             object oobject = musicTypeArr[i1];
             if (oobject.mValue == this.mMusicType) {
                this.mMusic.mType = oobject;
             }
             i1 = i1 + 1;
          }
          this.mMusic.mUrl = p0.optString("url");
          this.mMusic.mLrcUrl = p0.optString("lrcUrl");
          this.mMusic.mKtvBeginTime = p0.optInt("ktvBeginTime");
          KtvInfo tmMusic = this.mMusic;
          len = p0.optInt("ktvEndTime");
          try{
             tmMusic.mKtvEndTime = len;
             this.mMusic.mAccompanimentUrls = CDNUrl.fromJsonArray(p0.optJSONArray("accompanimentUrls"));
             this.mMusic.mMelodyUrls = CDNUrl.fromJsonArray(p0.optJSONArray("melodyUrls"));
             this.mMusic.mMmuLrcUrls = CDNUrl.fromJsonArray(p0.optJSONArray("mmuLrcUrls"));
          }catch(org.json.JSONException e0){
             a.D().z("KtvInfo", "fromSimpleJson: fail to restore ktvInfo-music-Urls", e0);
          }
       }
    }
    public int getChorusMode(){
       return this.mChorusMode;
    }
    public Lyrics getClipLyric(){
       return this.mClipLyric;
    }
    public int getKaraokeType(){
       if (this.mIsSongMode == null) {
          return 1;
       }
       int i = (this.mCoverCount > 1)? 3: 2;
       return i;
    }
    public KaraokeScoreInfo getKtvScoreInfo(){
       return this.mKtvScoreInfo;
    }
    public Music getMusicInfo(){
       return this.mMusic;
    }
    public String getOutputAudioPath(){
       return this.mOutputAudioPath;
    }
    public String getOutputCoverPath(){
       return this.mOutputCoverPath;
    }
    public int getRealBegin(){
       return (this.mSingStart + this.mCropBegin);
    }
    public int getRealDuration(){
       KtvInfo tmCropEnd = this.mCropEnd;
       KtvInfo tmCropBegin = this.mCropBegin;
       int i = ((tmCropEnd - tmCropBegin) > 0)? tmCropEnd - tmCropBegin: this.mSingDuration;
       return i;
    }
    public boolean hasRecordPath(){
       KtvInfo obj = PatchProxy.apply(null, this, KtvInfo.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mRecordPath;
       boolean b = (obj != null && !obj.isEmpty())? true: false;
       return b;
    }
    public boolean isSinglePicSongMode(){
       Object obj = PatchProxy.apply(null, this, KtvInfo.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.getKaraokeType() == 2)? true: false;
       return b;
    }
    public boolean isSongMode(){
       Object obj = PatchProxy.apply(null, this, KtvInfo.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.getKaraokeType() == b) {
          b = false;
       }
       return b;
    }
    public void setSongMode(boolean p0){
       this.mIsSongMode = p0;
    }
    public String toFullJson(){
       Object obj = PatchProxy.apply(null, this, KtvInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a.q(this);
    }
    public String toSimpleJson(){
       Iterator iterator;
       JSONObject obj = PatchProxy.apply(null, this, KtvInfo.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new JSONObject();
          String str = "recordMode";
          String str1 = (this.mIsSongMode != null)? "cover": "mv";
          obj.put(str, str1);
          obj.put("recordRange", this.mRangeMode.mMvParamTextId);
          JSONObject jSONObject = new JSONObject();
          jSONObject.put("record", String.valueOf(this.mRecordVolume));
          jSONObject.put("accompany", String.valueOf(this.mAccompanyVolume));
          obj.put("volume", jSONObject);
          obj.put("voiceEffects", String.valueOf(this.mEffectId));
          obj.put("voiceChange", String.valueOf(this.mChangeId));
          str = "noiseReductionSwitch";
          str1 = (this.mDenoise != null)? "1": "0";
          obj.put(str, str1);
          jSONObject = new JSONObject();
          jSONObject.put("default", String.valueOf(this.mDefaultOffset));
          jSONObject.put("offset", String.valueOf(this.mAdjustOffset));
          obj.put("humanvoiceAdjust", jSONObject);
          KtvInfo tmMusic = this.mMusic;
          if (tmMusic != null) {
             obj.put("musicId", tmMusic.mId);
             obj.put("musicType", this.mMusic.mType.mValue);
             obj.put("url", this.mMusic.mUrl);
             obj.put("lrcUrl", this.mMusic.mLrcUrl);
             obj.put("ktvBeginTime", this.mMusic.mKtvBeginTime);
             obj.put("ktvEndTime", this.mMusic.mKtvEndTime);
             obj.put("accompanimentUrls", CDNUrl.toJsonArray(this.mMusic.mAccompanimentUrls));
             obj.put("melodyUrls", CDNUrl.toJsonArray(this.mMusic.mMelodyUrls));
             obj.put("mmuLrcUrls", CDNUrl.toJsonArray(this.mMusic.mMmuLrcUrls));
             obj.put("ktvRecordPath", this.mRecordPath);
             obj.put("ktvCompanyPath", this.mAccompanyPath);
          }
          obj.put("start", this.getRealBegin());
          obj.put("end", (this.getRealBegin() + this.getRealDuration()));
          obj.put("recordStart", this.mSingStart);
          obj.put("recordEnd", (this.mSingStart + this.mSingDuration));
          JSONArray jSONArray = new JSONArray();
          KtvInfo tmOriginTogg = this.mOriginToggleInfos;
          if (tmOriginTogg != null) {
             iterator = tmOriginTogg.iterator();
             while (iterator.hasNext()) {
                jSONArray.put(iterator.next().b());
             }
          }
          obj.put("originalParts", jSONArray);
          tmMusic = this.mKtvScoreInfo;
          if (tmMusic != null) {
             obj.put("karaTotalScore", tmMusic.mTotalScore);
             obj.put("karaTotalSegments", this.mKtvScoreInfo.mTotalSegment);
             obj.put("karaValidSegments", this.mKtvScoreInfo.mValidSegment);
             obj.put("karaLevel", this.mKtvScoreInfo.mLevel);
             obj.put("displayScore", this.mKtvScoreInfo.mShouldDisPlay);
          }
          jSONArray = new JSONArray();
          tmOriginTogg = this.mRecordPartInfos;
          if (tmOriginTogg != null) {
             obj.put("Separate", tmOriginTogg.size());
             iterator = this.mRecordPartInfos.iterator();
             while (iterator.hasNext()) {
                jSONArray.put(iterator.next().b());
             }
          }
          obj.put("recordParts", jSONArray);
          tmMusic = this.mChorusMode;
          if (tmMusic != null) {
             obj.put("duet", tmMusic);
             obj.put("same_frame_layout_in_mode", this.mSameFrameAvailableLayoutInMode);
             if (!TextUtils.x(this.mChorusSourceId)) {
                obj.put("duetOriginPhotoId", this.mChorusSourceId);
             }
             if (!q.f(this.mChorusSungParts)) {
                jSONArray = new JSONArray();
                iterator = this.mChorusSungParts.iterator();
                while (iterator.hasNext()) {
                   jSONArray.put(iterator.next().b());
                }
                obj.put("duetSungParts", jSONArray);
             }
          }
          obj.put("headset_always_on", this.mHeadSetAlwaysOn);
          return obj.toString();
       }catch(org.json.JSONException e0){
          return "";
       }
    }
}
