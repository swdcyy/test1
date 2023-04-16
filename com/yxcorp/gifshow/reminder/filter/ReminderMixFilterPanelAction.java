package com.yxcorp.gifshow.reminder.filter.ReminderMixFilterPanelAction;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ReminderMixFilterPanelAction extends Enum	// class@001a79
{
    public static final ReminderMixFilterPanelAction[] $VALUES;
    public static final ReminderMixFilterPanelAction COLLAPSE_IMMEDIATELY;
    public static final ReminderMixFilterPanelAction COLLAPSE_SMOOTHLY;
    public static final ReminderMixFilterPanelAction EXPAND_SMOOTHLY;

    static {
       ReminderMixFilterPanelAction reminderMixF = new ReminderMixFilterPanelAction("EXPAND_SMOOTHLY", 0);
       ReminderMixFilterPanelAction.EXPAND_SMOOTHLY = reminderMixF;
       ReminderMixFilterPanelAction reminderMixF1 = new ReminderMixFilterPanelAction("COLLAPSE_SMOOTHLY", 1);
       ReminderMixFilterPanelAction.COLLAPSE_SMOOTHLY = reminderMixF1;
       ReminderMixFilterPanelAction reminderMixF2 = new ReminderMixFilterPanelAction("COLLAPSE_IMMEDIATELY", 2);
       ReminderMixFilterPanelAction.COLLAPSE_IMMEDIATELY = reminderMixF2;
       ReminderMixFilterPanelAction[] reminderMixF3 = new ReminderMixFilterPanelAction[]{reminderMixF,reminderMixF1,reminderMixF2};
       ReminderMixFilterPanelAction.$VALUES = reminderMixF3;
    }
    public void ReminderMixFilterPanelAction(String p0,int p1){
       super(p0, p1);
    }
    public static ReminderMixFilterPanelAction valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ReminderMixFilterPanelAction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ReminderMixFilterPanelAction.class, p0);
    }
    public static ReminderMixFilterPanelAction[] values(){
       Object obj = PatchProxy.apply(null, null, ReminderMixFilterPanelAction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ReminderMixFilterPanelAction.$VALUES.clone();
    }
}
