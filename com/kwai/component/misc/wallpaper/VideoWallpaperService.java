package com.kwai.component.misc.wallpaper.VideoWallpaperService;
import android.service.wallpaper.WallpaperService;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.io.File;
import android.content.Context;
import android.app.WallpaperInfo;
import android.app.WallpaperManager;
import pc5.b;
import java.lang.Throwable;
import q87.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.net.Uri;
import com.kwai.framework.player.core.b;
import wc6.d;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import com.kwai.framework.player.core.c;
import java.lang.StringBuilder;
import e17.i;
import ekd.w0;
import android.view.SurfaceHolder;
import android.service.wallpaper.WallpaperService$Engine;
import android.view.Surface;
import android.content.SharedPreferences;
import oe6.n;
import android.content.SharedPreferences$Editor;
import oe6.g;
import wc5.a;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.component.misc.wallpaper.VideoWallpaperService$a;
import android.content.Intent;
import java.lang.Integer;
import java.lang.Number;

public class VideoWallpaperService extends WallpaperService	// class@0009d9
{
    public WallpaperService$Engine b;
    public int c;
    public b d;
    public String e;
    public static long f;
    public static final int g;

    public void VideoWallpaperService(){
       super();
       this.c = 0;
    }
    public static boolean d(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, VideoWallpaperService.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return new File(p0).exists();
    }
    public static boolean e(Context p0,String p1){
       boolean b;
       WallpaperInfo obj = null;
       WallpaperInfo obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, VideoWallpaperService.class, "10");
       if (obj1 != PatchProxyResult.class) {
          return obj1.booleanValue();
       }
       obj1 = PatchProxy.applyOneRefs(p0, obj, VideoWallpaperService.class, "11");
       if (obj1 != PatchProxyResult.class) {
       }else {
          try{
             obj = WallpaperManager.getInstance(p0).getWallpaperInfo();
          }catch(java.lang.Exception e4){
             b.C().e("VideoWallpaperService", "getWallpaperInfo error", e4);
          }
          obj1 = obj;
       }
       b = (obj1 != null && TextUtils.n(obj1.getServiceName(), p1))? true: false;
       return b;
    }
    public b a(Uri p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b obj = PatchProxy.applyOneRefs(p0, this, VideoWallpaperService.class, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.applyTwoRefs(p0, this, this, VideoWallpaperService.class, "6");
       if (obj != patchProxyRe) {
       }else {
          d uod = new d("WallPaper");
          uod.setBizFt(":ks-components:misc");
          int i = 0x3253455f;
          try{
             uod.setOverlayFormat(i);
             uod.setNormalUrl(p0.toString(), 1);
             obj = c.a(uod);
          }catch(java.lang.Exception e4){
             Object[] objArray = new Object[0];
             b.C().t("VideoWallpaperService", "KpMidVodHlsBuilder createPlayer:"+e4, objArray);
             obj = null;
          }
       }
    }
    public final void b(String p0,boolean p1){
       String str = "wall_paper_path";
       if (PatchProxy.isSupport(VideoWallpaperService.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, VideoWallpaperService.class, "4")) {
          return;
       }
       if (TextUtils.n(p0, this.e)) {
          if (p1) {
             i.a(R.style.arg_RES_7f11066a, 0x7f105154);
          }
          return;
       }else if(TextUtils.x(p0) || !VideoWallpaperService.d(p0)){
          this.c();
          this.d = this.a(w0.f(p0));
          this.f(this.b.getSurfaceHolder().getSurface());
          String str1 = n.b().getString(str, "");
          if (!TextUtils.n(str1, p0)) {
             g.a(n.b().edit().putString("last_wall_paper_path", str1));
          }
          g.a(n.b().edit().putString(str, p0));
          this.e = p0;
          if (p1) {
             i.a(R.style.arg_RES_7f11066a, 0x7f105154);
          }
       }
    }
    public void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VideoWallpaperService.class, "8")) {
          return;
       }
       this.e = "";
       try{
          VideoWallpaperService td = this.d;
          if (td != null) {
             td.stop();
             this.d.release();
             this.d = objArray;
          }
       }catch(java.lang.Exception e0){
          b.C().e("VideoWallpaperService", "destroyMediaPlayer error", e0);
       }
       return;
    }
    public void f(Surface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoWallpaperService.class, "7")) {
          return;
       }
       VideoWallpaperService td = this.d;
       if (td == null) {
          return;
       }
       td.addOnPreparedListener(new a(this));
       this.d.setSurface(p0);
       this.d.getIKwaiMediaPlayer().setVideoScalingMode(2);
       this.d.setLooping(true);
       this.d.setVolume(0, 0);
       this.d.prepareAsync();
       return;
    }
    public WallpaperService$Engine onCreateEngine(){
       VideoWallpaperService$a obj = PatchProxy.apply(null, this, VideoWallpaperService.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new VideoWallpaperService$a(this);
       this.b = obj;
       return obj;
    }
    public int onStartCommand(Intent p0,int p1,int p2){
       String obj;
       boolean b;
       if (PatchProxy.isSupport(VideoWallpaperService.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, VideoWallpaperService.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = "wall_paper_path";
       CharSequence uCharSequenc = (p0 == null)? null: p0.getStringExtra(obj);
       if (TextUtils.x(uCharSequenc)) {
          uCharSequenc = n.b().getString(obj, "");
          b = false;
       }else {
          b = true;
       }
       this.b(uCharSequenc, b);
       return 1;
    }
}
