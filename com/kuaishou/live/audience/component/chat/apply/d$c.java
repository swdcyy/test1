package com.kuaishou.live.audience.component.chat.apply.d$c;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService$State;
import java.lang.Enum;

public class d$c	// class@000a68
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LiveAudienceApplyChatService$State.values().length];
       try{
          d$c.a = ointArray;
          ointArray[LiveAudienceApplyChatService$State.IDLE.ordinal()] = 1;
          try{
             d$c.a[LiveAudienceApplyChatService$State.APPLYING.ordinal()] = 2;
             try{
                d$c.a[LiveAudienceApplyChatService$State.CHATTING.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
