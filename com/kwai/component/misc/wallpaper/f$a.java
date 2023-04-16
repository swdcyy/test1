package com.kwai.component.misc.wallpaper.f$a;
import com.kwai.component.misc.wallpaper.WallPaperDownloadUtil$WallpaperDownloadType;
import java.lang.Enum;

public class f$a	// class@0009e3
{
    public static final int[] a;

    static {
       int[] ointArray = new int[WallPaperDownloadUtil$WallpaperDownloadType.values().length];
       try{
          f$a.a = ointArray;
          ointArray[WallPaperDownloadUtil$WallpaperDownloadType.PLUGIN.ordinal()] = 1;
          try{
             f$a.a[WallPaperDownloadUtil$WallpaperDownloadType.ATLAS.ordinal()] = 2;
             try{
                f$a.a[WallPaperDownloadUtil$WallpaperDownloadType.VIDEO.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
