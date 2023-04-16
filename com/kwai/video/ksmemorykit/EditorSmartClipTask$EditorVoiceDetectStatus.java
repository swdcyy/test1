package com.kwai.video.ksmemorykit.EditorSmartClipTask$EditorVoiceDetectStatus;
import java.lang.Enum;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class EditorSmartClipTask$EditorVoiceDetectStatus extends Enum	// class@0008fb
{
    public AtomicInteger index;
    public static final EditorSmartClipTask$EditorVoiceDetectStatus[] $VALUES;
    public static final EditorSmartClipTask$EditorVoiceDetectStatus EditorVoiceDetectStatusError;
    public static final EditorSmartClipTask$EditorVoiceDetectStatus EditorVoiceDetectStatusExecuting;
    public static final EditorSmartClipTask$EditorVoiceDetectStatus EditorVoiceDetectStatusFinished;
    public static final EditorSmartClipTask$EditorVoiceDetectStatus EditorVoiceDetectStatusSuspended;

    static {
       EditorSmartClipTask$EditorVoiceDetectStatus uEditorVoice = new EditorSmartClipTask$EditorVoiceDetectStatus("EditorVoiceDetectStatusSuspended", 0, new AtomicInteger(0));
       EditorSmartClipTask$EditorVoiceDetectStatus.EditorVoiceDetectStatusSuspended = uEditorVoice;
       EditorSmartClipTask$EditorVoiceDetectStatus uEditorVoice1 = new EditorSmartClipTask$EditorVoiceDetectStatus("EditorVoiceDetectStatusExecuting", 1, new AtomicInteger(1));
       EditorSmartClipTask$EditorVoiceDetectStatus.EditorVoiceDetectStatusExecuting = uEditorVoice1;
       EditorSmartClipTask$EditorVoiceDetectStatus uEditorVoice2 = new EditorSmartClipTask$EditorVoiceDetectStatus("EditorVoiceDetectStatusFinished", 2, new AtomicInteger(2));
       EditorSmartClipTask$EditorVoiceDetectStatus.EditorVoiceDetectStatusFinished = uEditorVoice2;
       EditorSmartClipTask$EditorVoiceDetectStatus uEditorVoice3 = new EditorSmartClipTask$EditorVoiceDetectStatus("EditorVoiceDetectStatusError", 3, new AtomicInteger(3));
       EditorSmartClipTask$EditorVoiceDetectStatus.EditorVoiceDetectStatusError = uEditorVoice3;
       EditorSmartClipTask$EditorVoiceDetectStatus[] uEditorVoice4 = new EditorSmartClipTask$EditorVoiceDetectStatus[]{uEditorVoice,uEditorVoice1,uEditorVoice2,uEditorVoice3};
       EditorSmartClipTask$EditorVoiceDetectStatus.$VALUES = uEditorVoice4;
    }
    public void EditorSmartClipTask$EditorVoiceDetectStatus(String p0,int p1,AtomicInteger p2){
       super(p0, p1);
       this.index = p2;
    }
    public static EditorSmartClipTask$EditorVoiceDetectStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorSmartClipTask$EditorVoiceDetectStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(EditorSmartClipTask$EditorVoiceDetectStatus.class, p0);
    }
    public static EditorSmartClipTask$EditorVoiceDetectStatus[] values(){
       Object obj = PatchProxy.apply(null, null, EditorSmartClipTask$EditorVoiceDetectStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EditorSmartClipTask$EditorVoiceDetectStatus.$VALUES.clone();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, EditorSmartClipTask$EditorVoiceDetectStatus.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.index+"";
    }
    public AtomicInteger value(){
       return this.index;
    }
}
