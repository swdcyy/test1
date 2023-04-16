package com.yxcorp.gifshow.camera.record.assistant.model.KSAssistantTemplate;
import java.io.Serializable;
import ac9.g;
import com.yxcorp.gifshow.camera.record.assistant.model.KSAssistantTemplate$a;
import nsd.u;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import java.lang.String;

public final class KSAssistantTemplate extends g implements Serializable	// class@001d11
{
    public KSTemplateDetailInfo kuaishan;
    public static final KSAssistantTemplate$a Companion;
    public static final long serialVersionUID;

    static {
       KSAssistantTemplate.Companion = new KSAssistantTemplate$a(null);
    }
    public void KSAssistantTemplate(){
       super();
    }
    public final KSTemplateDetailInfo getKuaishan(){
       return this.kuaishan;
    }
    public String getTemplateId(){
       KSTemplateDetailInfo mTemplateId;
       KSAssistantTemplate tkuaishan = this.kuaishan;
       if (tkuaishan != null) {
          mTemplateId = tkuaishan.mTemplateId;
          if (mTemplateId != null) {
          label_000b :
             return mTemplateId;
          }
       }
       mTemplateId = "";
       goto label_000b ;
    }
    public String getTemplateName(){
       KSTemplateDetailInfo mName;
       KSAssistantTemplate tkuaishan = this.kuaishan;
       if (tkuaishan != null) {
          mName = tkuaishan.mName;
          if (mName != null) {
          label_000b :
             return mName;
          }
       }
       mName = "";
       goto label_000b ;
    }
    public int getType(){
       return 2;
    }
    public final void setKuaishan(KSTemplateDetailInfo p0){
       this.kuaishan = p0;
    }
}
