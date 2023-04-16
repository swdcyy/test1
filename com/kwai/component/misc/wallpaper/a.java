package com.kwai.component.misc.wallpaper.a;
import android.view.View$OnClickListener;
import java.lang.Object;
import android.view.View;
import com.kwai.component.misc.wallpaper.WallPaperDownloadUtil;
import java.lang.String;
import com.kwai.component.misc.wallpaper.WallPaperDownloadUtil$WallpaperDownloadType;
import com.kwai.component.misc.wallpaper.f;

public final class a implements View$OnClickListener	// class@0009de
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final void onClick(View p0){
       if (WallPaperDownloadUtil.e) {
          WallPaperDownloadUtil.b("https://static.yximgs.com/udata/pkg/KS-FT-wallpaper_plugin_outer/kwai_wallpaper_plugin_1.5.apk");
          f.a(WallPaperDownloadUtil$WallpaperDownloadType.PLUGIN);
       }
       return;
    }
}
