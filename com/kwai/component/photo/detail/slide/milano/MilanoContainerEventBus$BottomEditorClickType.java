package com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus$BottomEditorClickType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MilanoContainerEventBus$BottomEditorClickType extends Enum	// class@000a5b
{
    public static final MilanoContainerEventBus$BottomEditorClickType[] $VALUES;
    public static final MilanoContainerEventBus$BottomEditorClickType AT_USER_BTN;
    public static final MilanoContainerEventBus$BottomEditorClickType EMOJI_BTN;
    public static final MilanoContainerEventBus$BottomEditorClickType FINISH_BTN;
    public static final MilanoContainerEventBus$BottomEditorClickType NORMAL_CONTAINER;
    public static final MilanoContainerEventBus$BottomEditorClickType OVERALL_EMOTION;
    public static final MilanoContainerEventBus$BottomEditorClickType PICTURE_BTN;
    public static final MilanoContainerEventBus$BottomEditorClickType QUCIK_EMOJI;
    public static final MilanoContainerEventBus$BottomEditorClickType QUICK_CONTAINER;

    static {
       MilanoContainerEventBus$BottomEditorClickType uBottomEdito = new MilanoContainerEventBus$BottomEditorClickType("QUCIK_EMOJI", 0);
       MilanoContainerEventBus$BottomEditorClickType.QUCIK_EMOJI = uBottomEdito;
       MilanoContainerEventBus$BottomEditorClickType uBottomEdito1 = new MilanoContainerEventBus$BottomEditorClickType("EMOJI_BTN", 1);
       MilanoContainerEventBus$BottomEditorClickType.EMOJI_BTN = uBottomEdito1;
       MilanoContainerEventBus$BottomEditorClickType uBottomEdito2 = new MilanoContainerEventBus$BottomEditorClickType("AT_USER_BTN", 2);
       MilanoContainerEventBus$BottomEditorClickType.AT_USER_BTN = uBottomEdito2;
       MilanoContainerEventBus$BottomEditorClickType uBottomEdito3 = new MilanoContainerEventBus$BottomEditorClickType("QUICK_CONTAINER", 3);
       MilanoContainerEventBus$BottomEditorClickType.QUICK_CONTAINER = uBottomEdito3;
       MilanoContainerEventBus$BottomEditorClickType uBottomEdito4 = new MilanoContainerEventBus$BottomEditorClickType("NORMAL_CONTAINER", 4);
       MilanoContainerEventBus$BottomEditorClickType.NORMAL_CONTAINER = uBottomEdito4;
       MilanoContainerEventBus$BottomEditorClickType uBottomEdito5 = new MilanoContainerEventBus$BottomEditorClickType("FINISH_BTN", 5);
       MilanoContainerEventBus$BottomEditorClickType.FINISH_BTN = uBottomEdito5;
       MilanoContainerEventBus$BottomEditorClickType uBottomEdito6 = new MilanoContainerEventBus$BottomEditorClickType("OVERALL_EMOTION", 6);
       MilanoContainerEventBus$BottomEditorClickType.OVERALL_EMOTION = uBottomEdito6;
       MilanoContainerEventBus$BottomEditorClickType uBottomEdito7 = new MilanoContainerEventBus$BottomEditorClickType("PICTURE_BTN", 7);
       MilanoContainerEventBus$BottomEditorClickType.PICTURE_BTN = uBottomEdito7;
       MilanoContainerEventBus$BottomEditorClickType[] uBottomEdito8 = new MilanoContainerEventBus$BottomEditorClickType[]{uBottomEdito,uBottomEdito1,uBottomEdito2,uBottomEdito3,uBottomEdito4,uBottomEdito5,uBottomEdito6,uBottomEdito7};
       MilanoContainerEventBus$BottomEditorClickType.$VALUES = uBottomEdito8;
    }
    public void MilanoContainerEventBus$BottomEditorClickType(String p0,int p1){
       super(p0, p1);
    }
    public static MilanoContainerEventBus$BottomEditorClickType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MilanoContainerEventBus$BottomEditorClickType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MilanoContainerEventBus$BottomEditorClickType.class, p0);
    }
    public static MilanoContainerEventBus$BottomEditorClickType[] values(){
       Object obj = PatchProxy.apply(null, null, MilanoContainerEventBus$BottomEditorClickType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MilanoContainerEventBus$BottomEditorClickType.$VALUES.clone();
    }
}
