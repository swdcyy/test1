package com.kwai.component.misc.wallpaper.WallPaperDownloadUtil$WallpaperDownloadType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class WallPaperDownloadUtil$WallpaperDownloadType extends Enum	// class@0009da
{
    public static final WallPaperDownloadUtil$WallpaperDownloadType[] $VALUES;
    public static final WallPaperDownloadUtil$WallpaperDownloadType ATLAS;
    public static final WallPaperDownloadUtil$WallpaperDownloadType PLUGIN;
    public static final WallPaperDownloadUtil$WallpaperDownloadType VIDEO;

    static {
       WallPaperDownloadUtil$WallpaperDownloadType wallpaperDow = new WallPaperDownloadUtil$WallpaperDownloadType("VIDEO", 0);
       WallPaperDownloadUtil$WallpaperDownloadType.VIDEO = wallpaperDow;
       WallPaperDownloadUtil$WallpaperDownloadType wallpaperDow1 = new WallPaperDownloadUtil$WallpaperDownloadType("ATLAS", 1);
       WallPaperDownloadUtil$WallpaperDownloadType.ATLAS = wallpaperDow1;
       WallPaperDownloadUtil$WallpaperDownloadType wallpaperDow2 = new WallPaperDownloadUtil$WallpaperDownloadType("PLUGIN", 2);
       WallPaperDownloadUtil$WallpaperDownloadType.PLUGIN = wallpaperDow2;
       WallPaperDownloadUtil$WallpaperDownloadType[] wallpaperDow3 = new WallPaperDownloadUtil$WallpaperDownloadType[]{wallpaperDow,wallpaperDow1,wallpaperDow2};
       WallPaperDownloadUtil$WallpaperDownloadType.$VALUES = wallpaperDow3;
    }
    public void WallPaperDownloadUtil$WallpaperDownloadType(String p0,int p1){
       super(p0, p1);
    }
    public static WallPaperDownloadUtil$WallpaperDownloadType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, WallPaperDownloadUtil$WallpaperDownloadType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(WallPaperDownloadUtil$WallpaperDownloadType.class, p0);
    }
    public static WallPaperDownloadUtil$WallpaperDownloadType[] values(){
       Object obj = PatchProxy.apply(null, null, WallPaperDownloadUtil$WallpaperDownloadType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return WallPaperDownloadUtil$WallpaperDownloadType.$VALUES.clone();
    }
}
