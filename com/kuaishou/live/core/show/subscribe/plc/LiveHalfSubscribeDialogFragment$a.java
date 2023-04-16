package com.kuaishou.live.core.show.subscribe.plc.LiveHalfSubscribeDialogFragment$a;
import com.kuaishou.live.core.show.subscribe.plc.LiveSubscribeHalfDialogEvent$EventType;
import java.lang.Enum;

public class LiveHalfSubscribeDialogFragment$a	// class@001155
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LiveSubscribeHalfDialogEvent$EventType.values().length];
       try{
          LiveHalfSubscribeDialogFragment$a.a = ointArray;
          ointArray[LiveSubscribeHalfDialogEvent$EventType.SUBSCRIBE_SUCCESS.ordinal()] = 1;
          try{
             LiveHalfSubscribeDialogFragment$a.a[LiveSubscribeHalfDialogEvent$EventType.UNSUBSCRIBE_SUCCESS.ordinal()] = 2;
             try{
                LiveHalfSubscribeDialogFragment$a.a[LiveSubscribeHalfDialogEvent$EventType.FOLLOW_SUCCESS.ordinal()] = 3;
                try{
                   LiveHalfSubscribeDialogFragment$a.a[LiveSubscribeHalfDialogEvent$EventType.UNFOLLOW_SUCCESS.ordinal()] = 4;
                }catch(java.lang.NoSuchFieldError e0){
                }
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
