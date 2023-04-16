package com.yxcorp.gifshow.v3.previewer.listener.EditorFragmentBackPressedAction;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class EditorFragmentBackPressedAction extends Enum	// class@0015dd
{
    public static final EditorFragmentBackPressedAction[] $VALUES;
    public static final EditorFragmentBackPressedAction OTHER_ACTION;
    public static final EditorFragmentBackPressedAction SHOW_DIALOG;

    static {
       EditorFragmentBackPressedAction uEditorFragm1;
       EditorFragmentBackPressedAction[] uEditorFragm = new EditorFragmentBackPressedAction[]{uEditorFragm1,uEditorFragm1};
       uEditorFragm1 = new EditorFragmentBackPressedAction("SHOW_DIALOG", 0);
       EditorFragmentBackPressedAction.SHOW_DIALOG = uEditorFragm1;
       uEditorFragm1 = new EditorFragmentBackPressedAction("OTHER_ACTION", 1);
       EditorFragmentBackPressedAction.OTHER_ACTION = uEditorFragm1;
       EditorFragmentBackPressedAction.$VALUES = uEditorFragm;
    }
    public void EditorFragmentBackPressedAction(String p0,int p1){
       super(p0, p1);
    }
    public static EditorFragmentBackPressedAction valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorFragmentBackPressedAction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(EditorFragmentBackPressedAction.class, p0);
    }
    public static EditorFragmentBackPressedAction[] values(){
       Object obj = PatchProxy.apply(null, null, EditorFragmentBackPressedAction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EditorFragmentBackPressedAction.$VALUES.clone();
    }
}
