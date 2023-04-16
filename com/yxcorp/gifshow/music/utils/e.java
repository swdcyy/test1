package com.yxcorp.gifshow.music.utils.e;
import java.lang.Object;
import com.kuaishou.android.model.music.Music;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.webkit.URLUtil;
import java.io.File;
import android.net.Uri;
import ekd.w0;
import kqb.b0;
import qkd.b;
import ojd.f;
import com.kwai.framework.network.util.HttpDownloadUtil;
import j80.g;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import k2b.u1;
import java.lang.Integer;
import java.io.IOException;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class e	// class@002091
{

    public void e(){
       super();
    }
    public static void a(Music p0,String p1){
       Object obj = null;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, obj, e.class, "4")) {
          return;
       }
       if (!TextUtils.x(p0.mLyrics)) {
          return;
       }
       if (TextUtils.x(p1)) {
          return;
       }
       File uFile = (URLUtil.isFileUrl(p1))? new File(w0.f(p1).getPath()): b0.e(p0);
       if (!b.S(uFile) || (!uFile.length() && URLUtil.isNetworkUrl(p1))) {
          HttpDownloadUtil.a(p1, uFile, obj, 0x2710);
       }
       p0.mLyrics = g.d(uFile);
       Log.g("MusicDownloadUtils", "lyricsUrl:"+p1+",lrcFile:"+uFile+"<----------end!");
       Object[] objArray = new Object[]{"id",p0.mId};
       u1.onEvent("ks://download_music_resource", "lyrics_success", objArray);
       return;
    }
    public static void b(int p0,String[] p1,Music p2){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, null, e.class, "2")) {
          return;
       }
       if (p0 >= p1.length) {
          return;
       }
       try{
          e.a(p2, p1[p0]);
       }catch(java.io.IOException e0){
          Object[] objArray = new Object[]{"id",p2.mId,"reason",e0.getMessage()};
          u1.onEvent("ks://download_music_resource", "lyrics_fail", objArray);
          e.b((p0 + 1), p1, p2);
       }
       return;
    }
    public static void c(Music p0,String p1){
       Object obj = null;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, obj, e.class, "5")) {
          return;
       }
       if (!TextUtils.x(p0.mMmuLyrics)) {
          return;
       }
       if (TextUtils.x(p1)) {
          return;
       }
       File uFile = (URLUtil.isFileUrl(p1))? new File(w0.f(p1).getPath()): b0.g(p0);
       if (!b.S(uFile) || (!uFile.length() && URLUtil.isNetworkUrl(p1))) {
          HttpDownloadUtil.a(p1, uFile, obj, 0x2710);
       }
       p0.mMmuLyrics = g.d(uFile);
       Log.g("MusicDownloadUtils", "mmULyricsUrl:"+p1+",lrcFile:"+uFile+"<----------end!");
       Object[] objArray = new Object[]{"id",p0.mId};
       u1.onEvent("ks://download_music_resource", "mmULyricsUrl_success", objArray);
       return;
    }
    public static void d(int p0,String[] p1,Music p2){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, null, e.class, "3")) {
          return;
       }
       if (p0 >= p1.length) {
          return;
       }
       try{
          e.c(p2, p1[p0]);
       }catch(java.io.IOException e0){
          Object[] objArray = new Object[]{"id",p2.mId,"reason",e0.getMessage()};
          u1.onEvent("ks://download_music_resource", "lyrics_fail", objArray);
          e.d((p0 + 1), p1, p2);
       }
       return;
    }
    public static boolean e(String p0,CDNUrl[] p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       p0 = b0.d(p0, p1);
       if (TextUtils.x(p0)) {
          return false;
       }
       return b.S(b0.b(p0));
    }
}
