package com.kuaishou.live.common.core.component.pk.LivePkScoreProgressAnimHelper$a;
import com.kuaishou.live.common.core.component.pk.LivePkScoreProgressAnimHelper$LivePkProgressAnimType;
import java.lang.Enum;

public class LivePkScoreProgressAnimHelper$a	// class@00172e
{
    public static final int[] a;

    static {
       int[] ointArray = new int[LivePkScoreProgressAnimHelper$LivePkProgressAnimType.values().length];
       try{
          LivePkScoreProgressAnimHelper$a.a = ointArray;
          ointArray[LivePkScoreProgressAnimHelper$LivePkProgressAnimType.ANIM_TYPE_SMALL_LEFT.ordinal()] = 1;
          try{
             LivePkScoreProgressAnimHelper$a.a[LivePkScoreProgressAnimHelper$LivePkProgressAnimType.ANIM_TYPE_SMALL_RIGHT.ordinal()] = 2;
             try{
                LivePkScoreProgressAnimHelper$a.a[LivePkScoreProgressAnimHelper$LivePkProgressAnimType.ANIM_TYPE_BIG_LEFT.ordinal()] = 3;
                try{
                   LivePkScoreProgressAnimHelper$a.a[LivePkScoreProgressAnimHelper$LivePkProgressAnimType.ANIM_TYPE_BIG_RIGHT.ordinal()] = 4;
                   try{
                      LivePkScoreProgressAnimHelper$a.a[LivePkScoreProgressAnimHelper$LivePkProgressAnimType.ANIM_TYPE_EMOJI_WIN.ordinal()] = 5;
                      try{
                         LivePkScoreProgressAnimHelper$a.a[LivePkScoreProgressAnimHelper$LivePkProgressAnimType.ANIM_TYPE_EMOJI_DRAW.ordinal()] = 6;
                         try{
                            LivePkScoreProgressAnimHelper$a.a[LivePkScoreProgressAnimHelper$LivePkProgressAnimType.ANIM_TYPE_EMOJI_FAIL.ordinal()] = 7;
                            try{
                               LivePkScoreProgressAnimHelper$a.a[LivePkScoreProgressAnimHelper$LivePkProgressAnimType.ANIM_TYPE_LIGHT.ordinal()] = 8;
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
