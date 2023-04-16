package com.kuaishou.live.common.core.component.comments.item.voicecomment.a$b;
import com.kuaishou.live.common.core.component.comments.model.VoiceCommentMessage$Status;
import java.lang.Enum;

public class a$b	// class@0010a6
{
    public static final int[] a;

    static {
       int[] ointArray = new int[VoiceCommentMessage$Status.values().length];
       try{
          a$b.a = ointArray;
          ointArray[VoiceCommentMessage$Status.UNREAD.ordinal()] = 1;
          try{
             a$b.a[VoiceCommentMessage$Status.UPLOADED.ordinal()] = 2;
             try{
                a$b.a[VoiceCommentMessage$Status.REPLAY.ordinal()] = 3;
                try{
                   a$b.a[VoiceCommentMessage$Status.WARNING.ordinal()] = 4;
                   try{
                      a$b.a[VoiceCommentMessage$Status.COMPLETE.ordinal()] = 5;
                      try{
                         a$b.a[VoiceCommentMessage$Status.PLAYING.ordinal()] = 6;
                         try{
                            a$b.a[VoiceCommentMessage$Status.DOWNLOADING.ordinal()] = 7;
                            try{
                               a$b.a[VoiceCommentMessage$Status.UPLOADING.ordinal()] = 8;
                               try{
                                  a$b.a[VoiceCommentMessage$Status.ERROR.ordinal()] = 9;
                               }catch(java.lang.NoSuchFieldError e0){
                               }
                            }catch(java.lang.NoSuchFieldError e0){
                            }
                         }catch(java.lang.NoSuchFieldError e0){
                         }
                      }catch(java.lang.NoSuchFieldError e0){
                      }
                   }catch(java.lang.NoSuchFieldError e0){
                   }
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
