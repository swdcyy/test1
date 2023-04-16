package com.yxcorp.gifshow.v3.editor.text.font.adapter.FontPayload;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class FontPayload extends Enum	// class@001439
{
    public static final FontPayload[] $VALUES;
    public static final FontPayload BIND_WITHOUT_LOG_EVENT;
    public static final FontPayload DOWNLOAD_SUCCESS_WITH_SELECT;
    public static final FontPayload PROGRESS;

    static {
       FontPayload uFontPayload1;
       FontPayload[] uFontPayload = new FontPayload[]{uFontPayload1,uFontPayload1,uFontPayload1};
       uFontPayload1 = new FontPayload("PROGRESS", 0);
       FontPayload.PROGRESS = uFontPayload1;
       uFontPayload1 = new FontPayload("BIND_WITHOUT_LOG_EVENT", 1);
       FontPayload.BIND_WITHOUT_LOG_EVENT = uFontPayload1;
       uFontPayload1 = new FontPayload("DOWNLOAD_SUCCESS_WITH_SELECT", 2);
       FontPayload.DOWNLOAD_SUCCESS_WITH_SELECT = uFontPayload1;
       FontPayload.$VALUES = uFontPayload;
    }
    public void FontPayload(String p0,int p1){
       super(p0, p1);
    }
    public static FontPayload valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FontPayload.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(FontPayload.class, p0);
    }
    public static FontPayload[] values(){
       Object obj = PatchProxy.apply(null, null, FontPayload.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FontPayload.$VALUES.clone();
    }
}
