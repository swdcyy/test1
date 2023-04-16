package com.kuaishou.live.lite.comment.LiveLiteCommentEditorService$EditorPanel;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveLiteCommentEditorService$EditorPanel extends Enum	// class@0007e3
{
    public static final LiveLiteCommentEditorService$EditorPanel[] $VALUES;
    public static final LiveLiteCommentEditorService$EditorPanel EMOJI_PANEL;
    public static final LiveLiteCommentEditorService$EditorPanel INPUT_PANEL;

    static {
       LiveLiteCommentEditorService$EditorPanel uEditorPanel1;
       LiveLiteCommentEditorService$EditorPanel[] uEditorPanel = new LiveLiteCommentEditorService$EditorPanel[]{uEditorPanel1,uEditorPanel1};
       uEditorPanel1 = new LiveLiteCommentEditorService$EditorPanel("INPUT_PANEL", 0);
       LiveLiteCommentEditorService$EditorPanel.INPUT_PANEL = uEditorPanel1;
       uEditorPanel1 = new LiveLiteCommentEditorService$EditorPanel("EMOJI_PANEL", 1);
       LiveLiteCommentEditorService$EditorPanel.EMOJI_PANEL = uEditorPanel1;
       LiveLiteCommentEditorService$EditorPanel.$VALUES = uEditorPanel;
    }
    public void LiveLiteCommentEditorService$EditorPanel(String p0,int p1){
       super(p0, p1);
    }
    public static LiveLiteCommentEditorService$EditorPanel valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveLiteCommentEditorService$EditorPanel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveLiteCommentEditorService$EditorPanel.class, p0);
    }
    public static LiveLiteCommentEditorService$EditorPanel[] values(){
       Object obj = PatchProxy.apply(null, null, LiveLiteCommentEditorService$EditorPanel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLiteCommentEditorService$EditorPanel.$VALUES.clone();
    }
}
