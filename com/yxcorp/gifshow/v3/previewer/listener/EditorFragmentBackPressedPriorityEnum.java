package com.yxcorp.gifshow.v3.previewer.listener.EditorFragmentBackPressedPriorityEnum;
import java.lang.Enum;
import com.yxcorp.gifshow.v3.previewer.listener.EditorFragmentBackPressedAction;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class EditorFragmentBackPressedPriorityEnum extends Enum	// class@0015de
{
    public final EditorFragmentBackPressedAction action;
    public final int priority;
    public static final EditorFragmentBackPressedPriorityEnum[] $VALUES;
    public static final EditorFragmentBackPressedPriorityEnum IMMERSE_MAGIC_BACK_SHOW_DIALOG;
    public static final EditorFragmentBackPressedPriorityEnum NO_PRIORITY;
    public static final EditorFragmentBackPressedPriorityEnum SNAPSHOT_BACK_SHOW_DIALOG;
    public static final EditorFragmentBackPressedPriorityEnum SOCIAL_SIMPLE_PHOTO;
    public static final EditorFragmentBackPressedPriorityEnum TEXT_PANEL_SHOW;

    static {
       EditorFragmentBackPressedPriorityEnum uEditorFragm1;
       EditorFragmentBackPressedPriorityEnum[] uEditorFragm = new EditorFragmentBackPressedPriorityEnum[]{uEditorFragm1,uEditorFragm1,uEditorFragm1,uEditorFragm1,uEditorFragm1};
       EditorFragmentBackPressedAction oTHER_ACTION = EditorFragmentBackPressedAction.OTHER_ACTION;
       uEditorFragm1 = new EditorFragmentBackPressedPriorityEnum("NO_PRIORITY", 0, -1, oTHER_ACTION);
       EditorFragmentBackPressedPriorityEnum.NO_PRIORITY = uEditorFragm1;
       EditorFragmentBackPressedAction sHOW_DIALOG = EditorFragmentBackPressedAction.SHOW_DIALOG;
       uEditorFragm1 = new EditorFragmentBackPressedPriorityEnum("SNAPSHOT_BACK_SHOW_DIALOG", 1, 2, sHOW_DIALOG);
       EditorFragmentBackPressedPriorityEnum.SNAPSHOT_BACK_SHOW_DIALOG = uEditorFragm1;
       uEditorFragm1 = new EditorFragmentBackPressedPriorityEnum("TEXT_PANEL_SHOW", 2, 3, oTHER_ACTION);
       EditorFragmentBackPressedPriorityEnum.TEXT_PANEL_SHOW = uEditorFragm1;
       uEditorFragm1 = new EditorFragmentBackPressedPriorityEnum("IMMERSE_MAGIC_BACK_SHOW_DIALOG", 3, 4, sHOW_DIALOG);
       EditorFragmentBackPressedPriorityEnum.IMMERSE_MAGIC_BACK_SHOW_DIALOG = uEditorFragm1;
       uEditorFragm1 = new EditorFragmentBackPressedPriorityEnum("SOCIAL_SIMPLE_PHOTO", 4, 5, oTHER_ACTION);
       EditorFragmentBackPressedPriorityEnum.SOCIAL_SIMPLE_PHOTO = uEditorFragm1;
       EditorFragmentBackPressedPriorityEnum.$VALUES = uEditorFragm;
    }
    public void EditorFragmentBackPressedPriorityEnum(String p0,int p1,int p2,EditorFragmentBackPressedAction p3){
       super(p0, p1);
       this.priority = p2;
       this.action = p3;
    }
    public static EditorFragmentBackPressedPriorityEnum valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorFragmentBackPressedPriorityEnum.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(EditorFragmentBackPressedPriorityEnum.class, p0);
    }
    public static EditorFragmentBackPressedPriorityEnum[] values(){
       Object obj = PatchProxy.apply(null, null, EditorFragmentBackPressedPriorityEnum.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EditorFragmentBackPressedPriorityEnum.$VALUES.clone();
    }
    public final EditorFragmentBackPressedAction getAction(){
       return this.action;
    }
    public final int getPriority(){
       return this.priority;
    }
}
