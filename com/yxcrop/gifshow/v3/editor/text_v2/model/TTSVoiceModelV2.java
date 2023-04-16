package com.yxcrop.gifshow.v3.editor.text_v2.model.TTSVoiceModelV2;
import java.io.Serializable;
import com.yxcrop.gifshow.v3.editor.text_v2.model.TTSVoiceModelV2$a;
import nsd.u;
import java.lang.Object;

public final class TTSVoiceModelV2 implements Serializable	// class@000b1f
{
    public int langType;
    public int resourceVersion;
    public int speakerId;
    public static final TTSVoiceModelV2$a Companion;
    public static final long serialVersionUID;

    static {
       TTSVoiceModelV2.Companion = new TTSVoiceModelV2$a(null);
    }
    public void TTSVoiceModelV2(){
       super();
    }
    public final int getLangType(){
       return this.langType;
    }
    public final int getResourceVersion(){
       return this.resourceVersion;
    }
    public final int getSpeakerId(){
       return this.speakerId;
    }
    public final void setLangType(int p0){
       this.langType = p0;
    }
    public final void setResourceVersion(int p0){
       this.resourceVersion = p0;
    }
    public final void setSpeakerId(int p0){
       this.speakerId = p0;
    }
}
