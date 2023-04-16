package com.yxcorp.gifshow.v3.editor.text.dynamic.util.TextDownloadPayload;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TextDownloadPayload extends Enum	// class@0013e5
{
    public static final TextDownloadPayload[] $VALUES;
    public static final TextDownloadPayload BIND_WITHOUT_LOG_EVENT;
    public static final TextDownloadPayload DOWNLOAD_SUCCESS_WITH_SELECT;
    public static final TextDownloadPayload PROGRESS;

    static {
       TextDownloadPayload textDownload1;
       TextDownloadPayload[] textDownload = new TextDownloadPayload[]{textDownload1,textDownload1,textDownload1};
       textDownload1 = new TextDownloadPayload("PROGRESS", 0);
       TextDownloadPayload.PROGRESS = textDownload1;
       textDownload1 = new TextDownloadPayload("BIND_WITHOUT_LOG_EVENT", 1);
       TextDownloadPayload.BIND_WITHOUT_LOG_EVENT = textDownload1;
       textDownload1 = new TextDownloadPayload("DOWNLOAD_SUCCESS_WITH_SELECT", 2);
       TextDownloadPayload.DOWNLOAD_SUCCESS_WITH_SELECT = textDownload1;
       TextDownloadPayload.$VALUES = textDownload;
    }
    public void TextDownloadPayload(String p0,int p1){
       super(p0, p1);
    }
    public static TextDownloadPayload valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TextDownloadPayload.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(TextDownloadPayload.class, p0);
    }
    public static TextDownloadPayload[] values(){
       Object obj = PatchProxy.apply(null, null, TextDownloadPayload.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TextDownloadPayload.$VALUES.clone();
    }
}
