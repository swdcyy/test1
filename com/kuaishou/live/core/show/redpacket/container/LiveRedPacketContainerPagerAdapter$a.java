package com.kuaishou.live.core.show.redpacket.container.LiveRedPacketContainerPagerAdapter$a;
import com.kuaishou.live.core.show.conditionredpacket.logger.RedPacketType;
import java.lang.Enum;

public class LiveRedPacketContainerPagerAdapter$a	// class@000e68
{
    public static final int[] a;

    static {
       int[] ointArray = new int[RedPacketType.values().length];
       try{
          LiveRedPacketContainerPagerAdapter$a.a = ointArray;
          ointArray[RedPacketType.RED_PACKET_TYPE_ACTIVITY.ordinal()] = 1;
          try{
             LiveRedPacketContainerPagerAdapter$a.a[RedPacketType.RED_PACKET_TYPE_CONDITION.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
