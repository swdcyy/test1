package com.yxcorp.gifshow.decoration.widget.DecorationContainerView$ActionMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class DecorationContainerView$ActionMode extends Enum	// class@0012b2
{
    public static final DecorationContainerView$ActionMode[] $VALUES;
    public static final DecorationContainerView$ActionMode DELETE;
    public static final DecorationContainerView$ActionMode DOUBLE_FINGER_SCALE_AND_ROTATE;
    public static final DecorationContainerView$ActionMode DOWN_TO_NEW_ITEM;
    public static final DecorationContainerView$ActionMode EDIT;
    public static final DecorationContainerView$ActionMode MOVE;
    public static final DecorationContainerView$ActionMode SELECT;
    public static final DecorationContainerView$ActionMode SELECTED_TAP_OR_MOVE;
    public static final DecorationContainerView$ActionMode SINGLE_FINGER_SCALE_AND_ROTATE;
    public static final DecorationContainerView$ActionMode SINGLE_TAP_BLANK_SCREEN;
    public static final DecorationContainerView$ActionMode SINGLE_TAP_CUSTOM_BUTTON;
    public static final DecorationContainerView$ActionMode UN_SELECT;

    static {
       DecorationContainerView$ActionMode uActionMode = new DecorationContainerView$ActionMode("MOVE", 0);
       DecorationContainerView$ActionMode.MOVE = uActionMode;
       DecorationContainerView$ActionMode uActionMode1 = new DecorationContainerView$ActionMode("SINGLE_FINGER_SCALE_AND_ROTATE", 1);
       DecorationContainerView$ActionMode.SINGLE_FINGER_SCALE_AND_ROTATE = uActionMode1;
       DecorationContainerView$ActionMode uActionMode2 = new DecorationContainerView$ActionMode("DOUBLE_FINGER_SCALE_AND_ROTATE", 2);
       DecorationContainerView$ActionMode.DOUBLE_FINGER_SCALE_AND_ROTATE = uActionMode2;
       DecorationContainerView$ActionMode uActionMode3 = new DecorationContainerView$ActionMode("SELECT", 3);
       DecorationContainerView$ActionMode.SELECT = uActionMode3;
       DecorationContainerView$ActionMode uActionMode4 = new DecorationContainerView$ActionMode("UN_SELECT", 4);
       DecorationContainerView$ActionMode.UN_SELECT = uActionMode4;
       DecorationContainerView$ActionMode uActionMode5 = new DecorationContainerView$ActionMode("DELETE", 5);
       DecorationContainerView$ActionMode.DELETE = uActionMode5;
       DecorationContainerView$ActionMode uActionMode6 = new DecorationContainerView$ActionMode("SELECTED_TAP_OR_MOVE", 6);
       DecorationContainerView$ActionMode.SELECTED_TAP_OR_MOVE = uActionMode6;
       DecorationContainerView$ActionMode uActionMode7 = new DecorationContainerView$ActionMode("EDIT", 7);
       DecorationContainerView$ActionMode.EDIT = uActionMode7;
       DecorationContainerView$ActionMode uActionMode8 = new DecorationContainerView$ActionMode("SINGLE_TAP_BLANK_SCREEN", 8);
       DecorationContainerView$ActionMode.SINGLE_TAP_BLANK_SCREEN = uActionMode8;
       DecorationContainerView$ActionMode uActionMode9 = new DecorationContainerView$ActionMode("SINGLE_TAP_CUSTOM_BUTTON", 9);
       DecorationContainerView$ActionMode.SINGLE_TAP_CUSTOM_BUTTON = uActionMode9;
       DecorationContainerView$ActionMode uActionMode10 = new DecorationContainerView$ActionMode("DOWN_TO_NEW_ITEM", 10);
       DecorationContainerView$ActionMode.DOWN_TO_NEW_ITEM = uActionMode10;
       DecorationContainerView$ActionMode[] uActionModeA = new DecorationContainerView$ActionMode[11];
       uActionModeA[0] = uActionMode;
       uActionModeA[1] = uActionMode1;
       uActionModeA[2] = uActionMode2;
       uActionModeA[3] = uActionMode3;
       uActionModeA[4] = uActionMode4;
       uActionModeA[5] = uActionMode5;
       uActionModeA[6] = uActionMode6;
       uActionModeA[7] = uActionMode7;
       uActionModeA[8] = uActionMode8;
       uActionModeA[9] = uActionMode9;
       uActionModeA[10] = uActionMode10;
       DecorationContainerView$ActionMode.$VALUES = uActionModeA;
    }
    public void DecorationContainerView$ActionMode(String p0,int p1){
       super(p0, p1);
    }
    public static DecorationContainerView$ActionMode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DecorationContainerView$ActionMode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(DecorationContainerView$ActionMode.class, p0);
    }
    public static DecorationContainerView$ActionMode[] values(){
       Object obj = PatchProxy.apply(null, null, DecorationContainerView$ActionMode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DecorationContainerView$ActionMode.$VALUES.clone();
    }
}
