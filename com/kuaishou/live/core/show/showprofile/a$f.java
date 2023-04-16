package com.kuaishou.live.core.show.showprofile.a$f;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService$State;
import java.lang.Enum;

public class a$f	// class@00101e
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LiveAudienceApplyChatService$State.values().length];
       try{
          a$f.a = ointArray;
          ointArray[LiveAudienceApplyChatService$State.IDLE.ordinal()] = 1;
          try{
             a$f.a[LiveAudienceApplyChatService$State.APPLYING.ordinal()] = 2;
             try{
                a$f.a[LiveAudienceApplyChatService$State.CHATTING.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
