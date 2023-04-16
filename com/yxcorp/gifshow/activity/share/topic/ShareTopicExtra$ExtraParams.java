package com.yxcorp.gifshow.activity.share.topic.ShareTopicExtra$ExtraParams;
import java.io.Serializable;
import com.yxcorp.gifshow.activity.share.topic.ShareTopicExtra$ExtraParams$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import com.yxcorp.gifshow.activity.share.topic.ShareTopicExtra$LocationInfo;
import java.lang.Integer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fg6.a;
import com.google.gson.Gson;
import kotlin.jvm.internal.a;

public final class ShareTopicExtra$ExtraParams implements Serializable	// class@001466
{
    public String activityId;
    public List assetLocations;
    public String coverTitle;
    public List defaultTag;
    public String editSessionId;
    public ShareTopicExtra$LocationInfo location;
    public List magicFaceList;
    public String musicId;
    public String musicName;
    public String musicTab;
    public Integer musicType;
    public String templateId;
    public String templateName;
    public List texts;
    public static final ShareTopicExtra$ExtraParams$a Companion;
    public static final long serialVersionUID;

    static {
       ShareTopicExtra$ExtraParams.Companion = new ShareTopicExtra$ExtraParams$a(null);
    }
    public void ShareTopicExtra$ExtraParams(){
       super();
    }
    public final String getActivityId(){
       return this.activityId;
    }
    public final List getAssetLocations(){
       return this.assetLocations;
    }
    public final String getCoverTitle(){
       return this.coverTitle;
    }
    public final List getDefaultTag(){
       return this.defaultTag;
    }
    public final String getEditSessionId(){
       return this.editSessionId;
    }
    public final ShareTopicExtra$LocationInfo getLocation(){
       return this.location;
    }
    public final List getMagicFaceList(){
       return this.magicFaceList;
    }
    public final String getMusicId(){
       return this.musicId;
    }
    public final String getMusicName(){
       return this.musicName;
    }
    public final String getMusicTab(){
       return this.musicTab;
    }
    public final Integer getMusicType(){
       return this.musicType;
    }
    public final String getTemplateId(){
       return this.templateId;
    }
    public final String getTemplateName(){
       return this.templateName;
    }
    public final List getTexts(){
       return this.texts;
    }
    public final void setActivityId(String p0){
       this.activityId = p0;
    }
    public final void setAssetLocations(List p0){
       this.assetLocations = p0;
    }
    public final void setCoverTitle(String p0){
       this.coverTitle = p0;
    }
    public final void setDefaultTag(List p0){
       this.defaultTag = p0;
    }
    public final void setEditSessionId(String p0){
       this.editSessionId = p0;
    }
    public final void setLocation(ShareTopicExtra$LocationInfo p0){
       this.location = p0;
    }
    public final void setMagicFaceList(List p0){
       this.magicFaceList = p0;
    }
    public final void setMusicId(String p0){
       this.musicId = p0;
    }
    public final void setMusicName(String p0){
       this.musicName = p0;
    }
    public final void setMusicTab(String p0){
       this.musicTab = p0;
    }
    public final void setMusicType(Integer p0){
       this.musicType = p0;
    }
    public final void setTemplateId(String p0){
       this.templateId = p0;
    }
    public final void setTemplateName(String p0){
       this.templateName = p0;
    }
    public final void setTexts(List p0){
       this.texts = p0;
    }
    public String toString(){
       String obj = PatchProxy.apply(null, this, ShareTopicExtra$ExtraParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.a.q(this);
       a.o(obj, "Gsons.KWAI_GSON.toJson\(this\)");
       return obj;
    }
}
