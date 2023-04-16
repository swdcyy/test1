package com.yxcrop.gifshow.v3.editor.text_v2.action.TTSVoiceListResultAction;
import xvc.b;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class TTSVoiceListResultAction extends b	// class@000b18
{
    public final List voiceItemList;

    public void TTSVoiceListResultAction(List p0){
       a.p(p0, "voiceItemList");
       super();
       this.voiceItemList = p0;
    }
    public final List getVoiceItemList(){
       return this.voiceItemList;
    }
}
