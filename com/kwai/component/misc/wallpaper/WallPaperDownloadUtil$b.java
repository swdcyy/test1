package com.kwai.component.misc.wallpaper.WallPaperDownloadUtil$b;
import com.kwai.component.misc.wallpaper.WallPaperDownloadUtil$WallpaperDownloadType;
import java.lang.Enum;

public class WallPaperDownloadUtil$b	// class@0009dc
{
    public static final int[] a;

    static {
       int[] ointArray = new int[WallPaperDownloadUtil$WallpaperDownloadType.values().length];
       try{
          WallPaperDownloadUtil$b.a = ointArray;
          ointArray[WallPaperDownloadUtil$WallpaperDownloadType.VIDEO.ordinal()] = 1;
          try{
             WallPaperDownloadUtil$b.a[WallPaperDownloadUtil$WallpaperDownloadType.ATLAS.ordinal()] = 2;
             try{
                WallPaperDownloadUtil$b.a[WallPaperDownloadUtil$WallpaperDownloadType.PLUGIN.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
