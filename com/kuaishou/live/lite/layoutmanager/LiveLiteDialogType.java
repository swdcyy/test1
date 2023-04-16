package com.kuaishou.live.lite.layoutmanager.LiveLiteDialogType;
import vb3.b;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveLiteDialogType extends Enum implements b	// class@0009e5
{
    public static final LiveLiteDialogType[] $VALUES;
    public static final LiveLiteDialogType CommentInputPanel;
    public static final LiveLiteDialogType GiftPanel;
    public static final LiveLiteDialogType SendGiftButtonPanel;
    public static final LiveLiteDialogType UserProfilePanel;

    static {
       LiveLiteDialogType liveLiteDial1;
       LiveLiteDialogType[] liveLiteDial = new LiveLiteDialogType[]{liveLiteDial1,liveLiteDial1,liveLiteDial1,liveLiteDial1};
       liveLiteDial1 = new LiveLiteDialogType("GiftPanel", 0);
       LiveLiteDialogType.GiftPanel = liveLiteDial1;
       liveLiteDial1 = new LiveLiteDialogType("SendGiftButtonPanel", 1);
       LiveLiteDialogType.SendGiftButtonPanel = liveLiteDial1;
       liveLiteDial1 = new LiveLiteDialogType("CommentInputPanel", 2);
       LiveLiteDialogType.CommentInputPanel = liveLiteDial1;
       liveLiteDial1 = new LiveLiteDialogType("UserProfilePanel", 3);
       LiveLiteDialogType.UserProfilePanel = liveLiteDial1;
       LiveLiteDialogType.$VALUES = liveLiteDial;
    }
    public void LiveLiteDialogType(String p0,int p1){
       super(p0, p1);
    }
    public static LiveLiteDialogType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveLiteDialogType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveLiteDialogType.class, p0);
    }
    public static LiveLiteDialogType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveLiteDialogType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLiteDialogType.$VALUES.clone();
    }
}
