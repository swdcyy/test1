package com.kwai.component.misc.wallpaper.VideoWallpaperService$a;
import android.service.wallpaper.WallpaperService$Engine;
import com.kwai.component.misc.wallpaper.VideoWallpaperService;
import android.service.wallpaper.WallpaperService;
import android.view.SurfaceHolder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.player.core.b;
import android.content.SharedPreferences;
import oe6.n;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.net.Uri;
import ekd.w0;
import nc6.d;
import android.view.Surface;
import java.lang.Boolean;
import java.util.Objects;
import android.content.Context;
import android.app.WallpaperManager;
import pc5.b;
import java.lang.Throwable;
import q87.c;

public class VideoWallpaperService$a extends WallpaperService$Engine	// class@0009d8
{
    public final VideoWallpaperService a;

    public void VideoWallpaperService$a(VideoWallpaperService p0){
       this.a = p0;
       super(p0);
    }
    public void onCreate(SurfaceHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoWallpaperService$a.class, "1")) {
          return;
       }
       super.onCreate(p0);
       return;
    }
    public void onSurfaceCreated(SurfaceHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoWallpaperService$a.class, "2")) {
          return;
       }
       try{
          VideoWallpaperService d = this.a.d;
          if (d != null && d.isPlaying()) {
             return;
          }
          String str = n.b().getString("wall_paper_path", "");
          if (TextUtils.x(str)) {
             return;
          }
          VideoWallpaperService$a ta = this.a;
          ta.d = ta.a(w0.f(str));
          d = this.a.d;
          if (d != null) {
             d.x().e(1);
          }
          this.a.f(p0.getSurface());
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void onSurfaceDestroyed(SurfaceHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoWallpaperService$a.class, "4")) {
          return;
       }
       super.onSurfaceDestroyed(p0);
       this.a.c();
       return;
    }
    public void onVisibilityChanged(boolean p0){
       VideoWallpaperService$a ta1;
       String str = "3";
       if (PatchProxy.isSupport(VideoWallpaperService$a.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, VideoWallpaperService$a.class, str)) {
          return;
       }
       if (p0) {
          if (this.a.d != null) {
             return;
          }else {
             String str1 = n.b().getString("wall_paper_path", "");
             if (TextUtils.x(str1) || !VideoWallpaperService.d(str1)) {
                try{
                   WallpaperManager.getInstance(this.a).clear();
                   this.a.c();
                }catch(java.lang.Exception e4){
                   b.C().e("VideoWallpaperService", "WallpaperManager clear error", e4);
                }
                return;
             }else {
                VideoWallpaperService$a ta = this.a;
                Objects.requireNonNull(ta);
                if (!PatchProxy.applyVoidOneRefs(str1, ta, VideoWallpaperService.class, str)) {
                   ta.b(str1, false);
                }
             }
          }
       }else {
          try{
             ta1 = this.a;
             VideoWallpaperService d = ta1.d;
             if (d != null) {
                ta1.c = (int)d.getCurrentPosition();
                this.a.c();
             }
          }catch(java.lang.Exception e0){
             ta1.d = null;
          }
       }
    }
}
