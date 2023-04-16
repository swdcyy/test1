package com.kuaishou.live.comments.bulletin.LiveBulletinViewType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveBulletinViewType extends Enum	// class@000e3f
{
    public final int shrinkPriority;
    public static final LiveBulletinViewType[] $VALUES;
    public static final LiveBulletinViewType BOTTOM_BUBBLE;
    public static final LiveBulletinViewType COMBO_COMMENT;
    public static final LiveBulletinViewType ENTER_ROOM;
    public static final LiveBulletinViewType ENTER_ROOM_OLD;
    public static final LiveBulletinViewType GIFT_SLOT;
    public static final LiveBulletinViewType SCROLL_COMMENT;

    static {
       LiveBulletinViewType liveBulletin1;
       LiveBulletinViewType[] liveBulletin = new LiveBulletinViewType[]{liveBulletin1,liveBulletin1,liveBulletin1,liveBulletin1,liveBulletin1,liveBulletin1};
       liveBulletin1 = new LiveBulletinViewType("ENTER_ROOM_OLD", 0, 0);
       LiveBulletinViewType.ENTER_ROOM_OLD = liveBulletin1;
       liveBulletin1 = new LiveBulletinViewType("ENTER_ROOM", 1, 1);
       LiveBulletinViewType.ENTER_ROOM = liveBulletin1;
       liveBulletin1 = new LiveBulletinViewType("COMBO_COMMENT", 2, 2);
       LiveBulletinViewType.COMBO_COMMENT = liveBulletin1;
       liveBulletin1 = new LiveBulletinViewType("GIFT_SLOT", 3, 3);
       LiveBulletinViewType.GIFT_SLOT = liveBulletin1;
       liveBulletin1 = new LiveBulletinViewType("BOTTOM_BUBBLE", 4, 4);
       LiveBulletinViewType.BOTTOM_BUBBLE = liveBulletin1;
       liveBulletin1 = new LiveBulletinViewType("SCROLL_COMMENT", 5, 5);
       LiveBulletinViewType.SCROLL_COMMENT = liveBulletin1;
       LiveBulletinViewType.$VALUES = liveBulletin;
    }
    public void LiveBulletinViewType(String p0,int p1,int p2){
       super(p0, p1);
       this.shrinkPriority = p2;
    }
    public static LiveBulletinViewType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveBulletinViewType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveBulletinViewType.class, p0);
    }
    public static LiveBulletinViewType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveBulletinViewType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveBulletinViewType.$VALUES.clone();
    }
    public final int getShrinkPriority(){
       return this.shrinkPriority;
    }
}
