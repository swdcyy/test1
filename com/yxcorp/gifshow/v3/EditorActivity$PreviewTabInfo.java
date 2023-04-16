package com.yxcorp.gifshow.v3.EditorActivity$PreviewTabInfo;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class EditorActivity$PreviewTabInfo extends Enum	// class@000d10
{
    public String mPageKey;
    public static final EditorActivity$PreviewTabInfo[] $VALUES;
    public static final EditorActivity$PreviewTabInfo ATLAS;
    public static final EditorActivity$PreviewTabInfo LONGPICTURE;
    public static final EditorActivity$PreviewTabInfo VIDEO;

    static {
       EditorActivity$PreviewTabInfo previewTabIn = new EditorActivity$PreviewTabInfo("ATLAS", 0, "atlas");
       EditorActivity$PreviewTabInfo.ATLAS = previewTabIn;
       EditorActivity$PreviewTabInfo previewTabIn1 = new EditorActivity$PreviewTabInfo("VIDEO", 1, "video");
       EditorActivity$PreviewTabInfo.VIDEO = previewTabIn1;
       EditorActivity$PreviewTabInfo previewTabIn2 = new EditorActivity$PreviewTabInfo("LONGPICTURE", 2, "longpicture");
       EditorActivity$PreviewTabInfo.LONGPICTURE = previewTabIn2;
       EditorActivity$PreviewTabInfo[] previewTabIn3 = new EditorActivity$PreviewTabInfo[]{previewTabIn,previewTabIn1,previewTabIn2};
       EditorActivity$PreviewTabInfo.$VALUES = previewTabIn3;
    }
    public void EditorActivity$PreviewTabInfo(String p0,int p1,String p2){
       super(p0, p1);
       this.mPageKey = p2;
    }
    public static EditorActivity$PreviewTabInfo valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorActivity$PreviewTabInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(EditorActivity$PreviewTabInfo.class, p0);
    }
    public static EditorActivity$PreviewTabInfo[] values(){
       Object obj = PatchProxy.apply(null, null, EditorActivity$PreviewTabInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EditorActivity$PreviewTabInfo.$VALUES.clone();
    }
}
