package com.kuaishou.live.redpacket.feature.common.popup.skin.prefetch.downloader.f$a;
import com.kuaishou.live.redpacket.feature.common.popup.skin.config.DynamicResourceType;
import java.lang.Enum;

public class f$a	// class@000f4b
{
    public static final int[] a;

    static {
       int[] ointArray = new int[DynamicResourceType.values().length];
       try{
          f$a.a = ointArray;
          ointArray[DynamicResourceType.IMAGE.ordinal()] = 1;
          try{
             f$a.a[DynamicResourceType.WEBP_ANIM.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
