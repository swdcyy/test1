package com.yxcorp.gifshow.aicut.api.AICutMusicInfo;
import java.io.Serializable;
import java.lang.Object;
import com.yxcorp.gifshow.aicut.api.MusicAnalysisResult;
import java.lang.String;
import java.lang.Long;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import kotlin.jvm.internal.a;

public final class AICutMusicInfo implements Serializable	// class@001948
{
    public MusicAnalysisResult mAnalysisResult;
    public String mAvatarUrl;
    public Long mBegin;
    public int mChorus;
    public int mDuration;
    public Long mEnd;
    public String mId;
    public String mLocalFilePath;
    public CDNUrl[] mMmuLrcUrls;
    public String mMusicBeatsString;
    public String mName;
    public Object mOriginData;
    public int mType;
    public CDNUrl[] mUrls;

    public void AICutMusicInfo(){
       super();
       this.mId = "";
    }
    public final MusicAnalysisResult getMAnalysisResult(){
       return this.mAnalysisResult;
    }
    public final String getMAvatarUrl(){
       return this.mAvatarUrl;
    }
    public final Long getMBegin(){
       return this.mBegin;
    }
    public final int getMChorus(){
       return this.mChorus;
    }
    public final int getMDuration(){
       return this.mDuration;
    }
    public final Long getMEnd(){
       return this.mEnd;
    }
    public final String getMId(){
       return this.mId;
    }
    public final String getMLocalFilePath(){
       return this.mLocalFilePath;
    }
    public final CDNUrl[] getMMmuLrcUrls(){
       return this.mMmuLrcUrls;
    }
    public final String getMMusicBeatsString(){
       return this.mMusicBeatsString;
    }
    public final String getMName(){
       return this.mName;
    }
    public final Object getMOriginData(){
       return this.mOriginData;
    }
    public final int getMType(){
       return this.mType;
    }
    public final CDNUrl[] getMUrls(){
       return this.mUrls;
    }
    public final boolean isEmpty(){
       AICutMusicInfo obj = PatchProxy.apply(null, this, AICutMusicInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       obj = (!this.mId.length())? 1: null;
       if (!obj) {
          obj = this.mUrls;
          if (obj != null) {
             obj = (!obj.length)? 1: 0;
             if (!obj) {
                obj = null;
             label_0033 :
                if (obj) {
                   obj = this.mLocalFilePath;
                   obj = (obj == null || !obj.length())? 1: null;
                   if (obj) {
                   label_004b :
                      return b;
                   }
                }
                if (this.mName == null) {
                   goto label_004b ;
                }else {
                   b = false;
                   goto label_004b ;
                }
             }
          }
          obj = 1;
          goto label_0033 ;
       }else {
          goto label_004b ;
       }
    }
    public final void replace(AICutMusicInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AICutMusicInfo.class, "2")) {
          return;
       }
       a.p(p0, "another");
       this.mId = p0.mId;
       this.mType = p0.mType;
       this.mUrls = p0.mUrls;
       this.mName = p0.mName;
       this.mAvatarUrl = p0.mAvatarUrl;
       this.mDuration = p0.mDuration;
       this.mChorus = p0.mChorus;
       this.mOriginData = p0.mOriginData;
       this.mMmuLrcUrls = p0.mMmuLrcUrls;
       return;
    }
    public final void setMAnalysisResult(MusicAnalysisResult p0){
       this.mAnalysisResult = p0;
    }
    public final void setMAvatarUrl(String p0){
       this.mAvatarUrl = p0;
    }
    public final void setMBegin(Long p0){
       this.mBegin = p0;
    }
    public final void setMChorus(int p0){
       this.mChorus = p0;
    }
    public final void setMDuration(int p0){
       this.mDuration = p0;
    }
    public final void setMEnd(Long p0){
       this.mEnd = p0;
    }
    public final void setMId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AICutMusicInfo.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mId = p0;
       return;
    }
    public final void setMLocalFilePath(String p0){
       this.mLocalFilePath = p0;
    }
    public final void setMMmuLrcUrls(CDNUrl[] p0){
       this.mMmuLrcUrls = p0;
    }
    public final void setMMusicBeatsString(String p0){
       this.mMusicBeatsString = p0;
    }
    public final void setMName(String p0){
       this.mName = p0;
    }
    public final void setMOriginData(Object p0){
       this.mOriginData = p0;
    }
    public final void setMType(int p0){
       this.mType = p0;
    }
    public final void setMUrls(CDNUrl[] p0){
       this.mUrls = p0;
    }
}
