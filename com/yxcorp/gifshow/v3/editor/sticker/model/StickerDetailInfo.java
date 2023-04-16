package com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import com.kwai.feature.post.api.feature.sticker.IStickerDetailInfo;
import com.yxcorp.gifshow.util.PostBaseResourceDownloadHelper$InfoWithResource;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.middleware.resourcemanager.material.cache.model.MaterialDetailInfo;
import com.yxcorp.gifshow.v3.editor.sticker.resource.EditStickerExtParams;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.io.File;
import com.yxcorp.gifshow.v3.editor.sticker.f0;
import com.yxcorp.gifshow.v3.editor.sticker.jsonmodel.StickerJsonInfo$ShapesBean;
import com.yxcorp.gifshow.v3.editor.sticker.jsonmodel.StickerJsonInfo;
import java.util.Collection;
import ekd.q;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.editor.sticker.jsonmodel.StickerJsonInfo$FrameRate;
import java.util.ArrayList;
import com.yxcorp.gifshow.v3.editor.sticker.jsonmodel.StickerJsonInfo$ShapesBean$FramesBean;
import com.yxcorp.gifshow.v3.editor.sticker.jsonmodel.StickerJsonInfo$Frame;
import java.lang.StringBuilder;
import qkd.b;

public class StickerDetailInfo extends PostBaseResourceDownloadHelper$InfoWithResource implements IStickerDetailInfo	// class@001274
{
    public String mChecksum;
    public String mFeaturesJson;
    public String mGroupId;
    public List mIconUrls;
    public boolean mIsAnimatedOnPanel;
    public String mRelatedClientId;
    public int mResourceHeightFromDecode;
    public int mResourceHeightFromJson;
    public List mResourceUrls;
    public int mResourceWidthFromDecode;
    public int mResourceWidthFromJson;
    public String mStickerDefaultText;
    public String mStickerId;
    public StickerJsonInfo mStickerJsonInfo;
    public String mStickerName;
    public int mStickerResourceType;
    public Float mStickerScore;
    public String mStickerTag;
    public int mStickerType;
    public int mVersion;
    public List mWebpUrls;
    public static final StickerDetailInfo b;
    public static final long serialVersionUID;

    static {
       StickerDetailInfo.b = new StickerDetailInfo();
    }
    public void StickerDetailInfo(){
       super();
       this.mGroupId = "default";
       this.mStickerType = 0;
       this.mResourceWidthFromJson = 0;
       this.mResourceHeightFromJson = 0;
       this.mResourceWidthFromDecode = 0;
       this.mResourceHeightFromDecode = 0;
    }
    public static void addLocalStickers(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, StickerDetailInfo.class, "12")) {
          return;
       }
       p0.add(StickerDetailInfo.getRelayStickerDetailInfo());
       p0.add(StickerDetailInfo.getVoteThreeStickerDetailInfo());
       p0.add(StickerDetailInfo.getVoteStickerDetailInfo());
       return;
    }
    public static StickerDetailInfo getDefaultInstance(){
       return StickerDetailInfo.b;
    }
    public static StickerDetailInfo getRelayStickerDetailInfo(){
       StickerDetailInfo obj = PatchProxy.apply(null, null, StickerDetailInfo.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new StickerDetailInfo();
       obj.mStickerType = -3;
       obj.mStickerId = "relay_challenge_0";
       obj.mVersion = 0;
       return obj;
    }
    public static StickerDetailInfo getVoteStickerDetailInfo(){
       StickerDetailInfo obj = PatchProxy.apply(null, null, StickerDetailInfo.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new StickerDetailInfo();
       obj.mStickerType = -1;
       obj.mStickerId = "sticker_vote_0";
       obj.mStickerName = "sticker_vote_0";
       obj.mVersion = 0;
       return obj;
    }
    public static StickerDetailInfo getVoteThreeStickerDetailInfo(){
       StickerDetailInfo obj = PatchProxy.apply(null, null, StickerDetailInfo.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new StickerDetailInfo();
       obj.mStickerType = -4;
       obj.mStickerId = "sticker_vote_1";
       obj.mVersion = 0;
       return obj;
    }
    public static boolean isInteractiveSticker(StickerDetailInfo p0){
       p0 = p0.mStickerType;
       boolean b = (p0 != -1 && (p0 != -4 && (p0 == -3 || p0 == -2)))? true: false;
       return b;
    }
    public static StickerDetailInfo parseFromMaterialDetailInfo(MaterialDetailInfo p0,EditStickerExtParams p1,String p2){
       StickerDetailInfo obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, StickerDetailInfo.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new StickerDetailInfo();
       obj.mStickerId = p0.getId();
       obj.mRelatedClientId = p1.getRelatedClientId();
       obj.mStickerName = p0.getMaterialName();
       obj.mVersion = p0.getVersion();
       obj.mFeaturesJson = p1.getFeaturesJson();
       obj.mStickerTag = p1.getStickerTag();
       obj.mIconUrls = p0.getIconUrls();
       obj.mWebpUrls = p1.getStickerWebpUrls();
       obj.mResourceUrls = p0.getResourceUrls();
       obj.mStickerResourceType = p1.getStickerType();
       obj.mGroupId = p2;
       if (!TextUtils.x(obj.mRelatedClientId)) {
          obj.mStickerType = 1;
       }else {
          StickerDetailInfo mStickerReso = obj.mStickerResourceType;
          int i = 2;
          if (mStickerReso == i) {
             obj.mStickerType = i;
          }else if(mStickerReso == 3){
             obj.mStickerType = -1;
             obj.mStickerId = "sticker_vote_0";
          }else if(mStickerReso == 4){
             obj.mStickerType = -2;
          }else if(mStickerReso == 7){
             obj.mStickerType = -3;
          }else if(mStickerReso == 8){
             obj.mStickerType = -4;
          }
       }
       return obj;
    }
    public final File a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StickerDetailInfo.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new File(f0.m(this), p0);
    }
    public final StickerJsonInfo$ShapesBean b(){
       Object[] objArray = null;
       StickerDetailInfo obj = PatchProxy.apply(objArray, this, StickerDetailInfo.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mStickerJsonInfo;
       if (obj == null || q.f(obj.getShapes())) {
          return objArray;
       }
       return this.mStickerJsonInfo.getShapes().get(0);
    }
    public boolean disableLoopAnimation(){
       Object obj = PatchProxy.apply(null, this, StickerDetailInfo.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.b() == null || this.b().disableLoopAnimation())? true: false;
       return b;
    }
    public StickerJsonInfo$FrameRate getDynamicStickerFrameRate(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, StickerDetailInfo.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b() != null && this.b().getFrameRate() != null) {
          objArray = this.b().getFrameRate();
       }
       return objArray;
    }
    public String getDynamicStickerImageName(){
       String obj = PatchProxy.apply(null, this, StickerDetailInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.b() == null)? "": this.b().getImageName();
       return obj;
    }
    public String getDynamicStickerSequenceImageName(){
       String obj = PatchProxy.apply(null, this, StickerDetailInfo.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.b() == null)? "": this.b().getSequenceImageName();
       return obj;
    }
    public String getFirstFrameImageName(){
       String obj = PatchProxy.apply(null, this, StickerDetailInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.b() == null)? "": this.b().getFirstFrameImageName();
       return obj;
    }
    public List getFrameInfoList(){
       ArrayList obj = PatchProxy.apply(null, this, StickerDetailInfo.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b() == null) {
          return new ArrayList();
       }
       obj = new ArrayList();
       for (int i = 0; i < this.b().getFrames().size(); i = i + 1) {
          obj.add(this.b().getFrames().get(i).getFrame());
       }
       return obj;
    }
    public String getId(){
       return this.mStickerId;
    }
    public String getImageFilePath(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StickerDetailInfo.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a(p0).getAbsolutePath();
    }
    public int getRealStickerType(boolean p0){
       StickerDetailInfo tmStickerTyp = this.mStickerType;
       int i = 2;
       if (tmStickerTyp != i) {
          return tmStickerTyp;
       }
       if (!p0) {
          i = 0;
       }
       return i;
    }
    public int getResourceHeight(boolean p0){
       StickerDetailInfo tmResourceHe = (p0)? this.mResourceHeightFromJson: this.mResourceHeightFromDecode;
       return tmResourceHe;
    }
    public List getResourceUrls(){
       return this.mResourceUrls;
    }
    public int getResourceWidth(boolean p0){
       StickerDetailInfo tmResourceWi = (p0)? this.mResourceWidthFromJson: this.mResourceWidthFromDecode;
       return tmResourceWi;
    }
    public String getStaticImageName(){
       String obj = PatchProxy.apply(null, this, StickerDetailInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.b() == null)? "": this.b().getImageName();
       return obj;
    }
    public String getStickerDefaultText(){
       return this.mStickerDefaultText;
    }
    public String getUniqueIdentifier(){
       Object obj = PatchProxy.apply(null, this, StickerDetailInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mStickerId+"+"+this.mChecksum;
    }
    public boolean isAnimatedOnPanel(){
       return this.mIsAnimatedOnPanel;
    }
    public boolean isInteractiveSticker(){
       StickerDetailInfo tmStickerTyp = this.mStickerType;
       boolean b = (tmStickerTyp != -1 && (tmStickerTyp != -4 && (tmStickerTyp == -3 || tmStickerTyp == -2)))? true: false;
       return b;
    }
    public boolean isSequenceImage(){
       Object obj = PatchProxy.apply(null, this, StickerDetailInfo.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.b() != null && this.b().isOutputSequenceImage())? true: false;
       return b;
    }
    public boolean isStickerNeedDecodeDimension(){
       StickerDetailInfo tmStickerTyp = this.mStickerType;
       boolean b = (tmStickerTyp == null || (tmStickerTyp == 2 && (this.mResourceWidthFromDecode <= null || this.mResourceHeightFromDecode <= null)))? true: false;
       return b;
    }
    public boolean isStickerNeedLoadInfoJson(){
       StickerDetailInfo obj = PatchProxy.apply(null, this, StickerDetailInfo.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mStickerType;
       boolean b = false;
       if (obj == 2) {
          if (this.b() == null) {
             b = true;
          }
          return b;
       }else if(obj == null){
          return TextUtils.x(this.getStaticImageName());
       }else if(obj == 1 && !q.f(this.mResourceUrls)){
          return TextUtils.x(this.getStaticImageName());
       }else {
          return b;
       }
    }
    public boolean isTagSticker(){
       boolean b = (this.mStickerType == -2)? true: false;
       return b;
    }
    public boolean isValid(){
       StickerDetailInfo obj = PatchProxy.apply(null, this, StickerDetailInfo.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mStickerType;
       boolean b = false;
       if (obj != null) {
          if (obj != 2) {
             return true;
          }else if(!b.S(this.a(this.getDynamicStickerImageName())) || (!this.isStickerNeedLoadInfoJson() || (b.S(this.a(this.getFirstFrameImageName())) && (!this.isStickerNeedLoadInfoJson() && !this.isStickerNeedDecodeDimension())))){
             b = true;
          }
       label_004d :
          return b;
       }else if(b.S(this.a(this.getStaticImageName())) && (!this.isStickerNeedLoadInfoJson() && !this.isStickerNeedDecodeDimension())){
          b = true;
       }
       return b;
    }
    public boolean isVoteSticker(){
       boolean b = (this.mStickerType == -1)? true: false;
       return b;
    }
    public void setAnimatedOnPanel(boolean p0){
       this.mIsAnimatedOnPanel = p0;
    }
    public void setResourceHeightFromDecode(int p0){
       this.mResourceHeightFromDecode = p0;
    }
    public void setResourceWidthFromDecode(int p0){
       this.mResourceWidthFromDecode = p0;
    }
    public void setStickerDefaultText(String p0){
       this.mStickerDefaultText = p0;
    }
    public void setStickerJsonInfo(StickerJsonInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StickerDetailInfo.class, "9")) {
          return;
       }
       this.mStickerJsonInfo = p0;
       if (this.b() != null) {
          this.mResourceHeightFromJson = this.b().getResourceHeight();
          this.mResourceWidthFromJson = this.b().getResourceWidth();
       }
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, StickerDetailInfo.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "StickerDetailInfo{mStickerId=\'"+this.mStickerId+'''+", mRelatedClientId=\'"+this.mRelatedClientId+'''+", mStickerName=\'"+this.mStickerName+'''+", mVersion="+this.mVersion+", mIconUrls="+this.mIconUrls+", mWebpUrls="+this.mWebpUrls+", mResourceUrls="+this.mResourceUrls+", mChecksum=\'"+this.mChecksum+'''+", mStickerResourceType="+this.mStickerResourceType+", mGroupId=\'"+this.mGroupId+'''+", mStickerType="+this.mStickerType+", mResourceWidthFromJson="+this.mResourceWidthFromJson+", mResourceHeightFromJson="+this.mResourceHeightFromJson+'}';
    }
    public void updateAnimatedOnPanel(){
       boolean b = (this.mStickerType == -3)? true: false;
       this.mIsAnimatedOnPanel = b;
       return;
    }
}
