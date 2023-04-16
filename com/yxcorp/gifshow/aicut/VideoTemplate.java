package com.yxcorp.gifshow.aicut.VideoTemplate;
import java.io.Serializable;
import com.yxcorp.gifshow.aicut.VideoTemplate$a;
import nsd.u;
import java.lang.String;
import com.yxcorp.gifshow.aicut.KwaiAICutStyle;
import com.yxcorp.gifshow.kuaishan.model.KSFeedTemplateDetailInfo;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.aicut.api.AICutStyle;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class VideoTemplate implements Serializable	// class@001940
{
    public KwaiAICutStyle aiCutStyle;
    public KSFeedTemplateDetailInfo ksTemplateInfo;
    public String recoReason;
    public String title;
    public int type;
    public static final VideoTemplate$a Companion;
    public static final long serialVersionUID;

    static {
       VideoTemplate.Companion = new VideoTemplate$a(null);
       VideoTemplate.serialVersionUID = 1;
    }
    public void VideoTemplate(){
       super(0, null, null, null, 15, null);
    }
    public void VideoTemplate(int p0,String p1,KwaiAICutStyle p2,KSFeedTemplateDetailInfo p3){
       a.p(p1, "recoReason");
       a.p(p2, "aiCutStyle");
       a.p(p3, "ksTemplateInfo");
       super();
       this.type = p0;
       this.recoReason = p1;
       this.aiCutStyle = p2;
       this.ksTemplateInfo = p3;
       this.title = "";
    }
    public void VideoTemplate(int p0,String p1,KwaiAICutStyle p2,KSFeedTemplateDetailInfo p3,int p4,u p5){
       if (p4 & 0x01) {
          p0 = 0;
       }
       if (p4 & 0x02) {
          p1 = "";
       }
       if (p4 & 0x04) {
          p2 = new KwaiAICutStyle();
       }
       if (p4 & 0x08) {
          p3 = new KSFeedTemplateDetailInfo();
       }
       super(p0, p1, p2, p3);
       return;
    }
    public final KwaiAICutStyle getAiCutStyle(){
       return this.aiCutStyle;
    }
    public final String getColor(){
       KSFeedTemplateDetailInfo mColor = (this.type == 1)? this.ksTemplateInfo.mColor: this.aiCutStyle.mColor;
       if (mColor == null) {
          mColor = "0";
       }
       return mColor;
    }
    public final List getCover(){
       KSFeedTemplateDetailInfo mCoverUrls = (this.type == 1)? this.ksTemplateInfo.mCoverUrls: this.aiCutStyle.mCoverUrls;
       return mCoverUrls;
    }
    public final String getId(){
       KSFeedTemplateDetailInfo obj = PatchProxy.apply(null, this, VideoTemplate.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.type == 1)? this.ksTemplateInfo.mId: this.aiCutStyle.getId();
       if (obj == null) {
          String str = "0";
       }
       return obj;
    }
    public final KSFeedTemplateDetailInfo getKsTemplateInfo(){
       return this.ksTemplateInfo;
    }
    public final String getName(){
       KSFeedTemplateDetailInfo mName = (this.type == 1)? this.ksTemplateInfo.mName: this.aiCutStyle.mName;
       if (mName == null) {
          mName = "0";
       }
       return mName;
    }
    public final String getRecoReason(){
       return this.recoReason;
    }
    public final String getTitle(){
       return this.title;
    }
    public final int getType(){
       return this.type;
    }
    public final boolean isNew(){
       boolean b = (this.type == 1)? false: this.aiCutStyle.mIsNew;
       return b;
    }
    public final void setAiCutStyle(KwaiAICutStyle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoTemplate.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.aiCutStyle = p0;
       return;
    }
    public final void setKsTemplateInfo(KSFeedTemplateDetailInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoTemplate.class, "4")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.ksTemplateInfo = p0;
       return;
    }
    public final void setRecoReason(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoTemplate.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.recoReason = p0;
       return;
    }
    public final void setTitle(String p0){
       this.title = p0;
    }
    public final void setType(int p0){
       this.type = p0;
    }
}
