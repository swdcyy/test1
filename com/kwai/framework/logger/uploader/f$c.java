package com.kwai.framework.logger.uploader.f$c;
import com.kuaishou.android.vader.Channel;
import java.lang.Enum;

public class f$c	// class@00167a
{
    public static final int[] a;

    static {
       int[] ointArray = new int[Channel.values().length];
       try{
          f$c.a = ointArray;
          ointArray[Channel.REAL_SHOW.ordinal()] = 1;
          try{
             f$c.a[Channel.CLICK2.ordinal()] = 2;
             try{
                f$c.a[Channel.COVER_SHOW.ordinal()] = 3;
                try{
                   f$c.a[Channel.COMMENT_SHOW.ordinal()] = 4;
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
