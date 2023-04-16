package com.kuaishou.live.common.core.component.comments.model.VoiceCommentMessage$Status;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class VoiceCommentMessage$Status extends Enum	// class@0010c8
{
    public static final VoiceCommentMessage$Status[] $VALUES;
    public static final VoiceCommentMessage$Status COMPLETE;
    public static final VoiceCommentMessage$Status DOWNLOADING;
    public static final VoiceCommentMessage$Status ERROR;
    public static final VoiceCommentMessage$Status PLAYING;
    public static final VoiceCommentMessage$Status REPLAY;
    public static final VoiceCommentMessage$Status STOP;
    public static final VoiceCommentMessage$Status UNREAD;
    public static final VoiceCommentMessage$Status UPLOADED;
    public static final VoiceCommentMessage$Status UPLOADING;
    public static final VoiceCommentMessage$Status WARNING;

    static {
       VoiceCommentMessage$Status status = new VoiceCommentMessage$Status("DOWNLOADING", 0);
       VoiceCommentMessage$Status.DOWNLOADING = status;
       VoiceCommentMessage$Status status1 = new VoiceCommentMessage$Status("UPLOADING", 1);
       VoiceCommentMessage$Status.UPLOADING = status1;
       VoiceCommentMessage$Status status2 = new VoiceCommentMessage$Status("UPLOADED", 2);
       VoiceCommentMessage$Status.UPLOADED = status2;
       VoiceCommentMessage$Status status3 = new VoiceCommentMessage$Status("ERROR", 3);
       VoiceCommentMessage$Status.ERROR = status3;
       VoiceCommentMessage$Status status4 = new VoiceCommentMessage$Status("UNREAD", 4);
       VoiceCommentMessage$Status.UNREAD = status4;
       VoiceCommentMessage$Status status5 = new VoiceCommentMessage$Status("PLAYING", 5);
       VoiceCommentMessage$Status.PLAYING = status5;
       VoiceCommentMessage$Status status6 = new VoiceCommentMessage$Status("COMPLETE", 6);
       VoiceCommentMessage$Status.COMPLETE = status6;
       VoiceCommentMessage$Status status7 = new VoiceCommentMessage$Status("WARNING", 7);
       VoiceCommentMessage$Status.WARNING = status7;
       VoiceCommentMessage$Status status8 = new VoiceCommentMessage$Status("REPLAY", 8);
       VoiceCommentMessage$Status.REPLAY = status8;
       VoiceCommentMessage$Status status9 = new VoiceCommentMessage$Status("STOP", 9);
       VoiceCommentMessage$Status.STOP = status9;
       VoiceCommentMessage$Status[] statusArray = new VoiceCommentMessage$Status[10];
       statusArray[0] = status;
       statusArray[1] = status1;
       statusArray[2] = status2;
       statusArray[3] = status3;
       statusArray[4] = status4;
       statusArray[5] = status5;
       statusArray[6] = status6;
       statusArray[7] = status7;
       statusArray[8] = status8;
       statusArray[9] = status9;
       VoiceCommentMessage$Status.$VALUES = statusArray;
    }
    public void VoiceCommentMessage$Status(String p0,int p1){
       super(p0, p1);
    }
    public static VoiceCommentMessage$Status valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, VoiceCommentMessage$Status.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(VoiceCommentMessage$Status.class, p0);
    }
    public static VoiceCommentMessage$Status[] values(){
       Object obj = PatchProxy.apply(null, null, VoiceCommentMessage$Status.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return VoiceCommentMessage$Status.$VALUES.clone();
    }
}
