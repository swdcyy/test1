package com.kwai.component.misc.wallpaper.f;
import java.lang.Object;
import com.kwai.component.misc.wallpaper.WallPaperDownloadUtil$WallpaperDownloadType;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.kwai.component.misc.wallpaper.f$a;
import java.lang.Enum;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Boolean;

public final class f	// class@0009e4
{

    public void f(){
       super();
    }
    public static void a(WallPaperDownloadUtil$WallpaperDownloadType p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, f.class, "5")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "DOWNLOAD_PLUGIN_POPUP_CANCEL";
       JsonObject jsonObject = new JsonObject();
       int i = f$a.a[p0.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i == 3) {
                jsonObject.c0("content_type", "PHOTO");
             }
          }else {
             jsonObject.c0("content_type", "IMAGE");
          }
       }else {
          jsonObject.c0("content_type", "PLUGIN");
       }
       uElementPack.params = jsonObject.toString();
       u1.u(1, uElementPack, null);
       return;
    }
    public static void b(boolean p0,QPhoto p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, null, uof, "2")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "DOWNLOAD_PLUGIN_POPUP";
       JsonObject jsonObject = new JsonObject();
       if (p1.isVideoType()) {
          jsonObject.c0("content_type", "PHOTO");
       }else if(p1.isAtlasPhotos()){
          jsonObject.c0("content_type", "IMAGE");
       }
       if (p0) {
          jsonObject.c0("click_type", "download");
       }else {
          jsonObject.c0("click_type", "cancel");
       }
       uElementPack.params = jsonObject.toString();
       u1.u(1, uElementPack, null);
       return;
    }
    public static void c(boolean p0,QPhoto p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, null, uof, "3")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "DOWNLOAD_RESULT";
       JsonObject jsonObject = new JsonObject();
       if (p1.isVideoType()) {
          jsonObject.c0("content_type", "PHOTO");
       }else if(p1.isAtlasPhotos()){
          jsonObject.c0("content_type", "IMAGE");
       }
       if (p0) {
          jsonObject.c0("download_result", "success");
       }else {
          jsonObject.c0("download_result", "fail");
       }
       uElementPack.params = jsonObject.toString();
       u1.u0(10, uElementPack, null);
       return;
    }
}
