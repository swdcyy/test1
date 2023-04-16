package com.yxcorp.gifshow.camera.record.assistant.model.MagicAssistantTemplate;
import java.io.Serializable;
import ac9.g;
import com.yxcorp.gifshow.camera.record.assistant.model.MagicAssistantTemplate$a;
import nsd.u;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.String;
import com.yxcorp.gifshow.model.SimpleMagicFace;

public final class MagicAssistantTemplate extends g implements Serializable	// class@001d13
{
    public boolean isCollection;
    public MagicEmoji$MagicFace magicFace;
    public static final MagicAssistantTemplate$a Companion;
    public static final long serialVersionUID;

    static {
       MagicAssistantTemplate.Companion = new MagicAssistantTemplate$a(null);
    }
    public void MagicAssistantTemplate(){
       super();
    }
    public final MagicEmoji$MagicFace getMagicFace(){
       return this.magicFace;
    }
    public String getTemplateId(){
       SimpleMagicFace mId;
       MagicAssistantTemplate tmagicFace = this.magicFace;
       if (tmagicFace != null) {
          mId = tmagicFace.mId;
          if (mId != null) {
          label_000b :
             return mId;
          }
       }
       mId = "";
       goto label_000b ;
    }
    public String getTemplateName(){
       SimpleMagicFace mName;
       MagicAssistantTemplate tmagicFace = this.magicFace;
       if (tmagicFace != null) {
          mName = tmagicFace.mName;
          if (mName != null) {
          label_000b :
             return mName;
          }
       }
       mName = "";
       goto label_000b ;
    }
    public int getType(){
       return 1;
    }
    public final boolean isCollection(){
       return this.isCollection;
    }
    public final void setCollection(boolean p0){
       this.isCollection = p0;
    }
    public final void setMagicFace(MagicEmoji$MagicFace p0){
       this.magicFace = p0;
    }
}
