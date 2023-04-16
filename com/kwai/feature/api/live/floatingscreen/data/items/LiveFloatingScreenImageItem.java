package com.kwai.feature.api.live.floatingscreen.data.items.LiveFloatingScreenImageItem;
import com.kwai.feature.api.live.floatingscreen.data.items.LiveFloatingScreenBaseItemData;
import com.kwai.feature.api.live.floatingscreen.data.items.LiveFloatingScreenImageItem$a;
import nsd.u;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.String;
import fr5.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class LiveFloatingScreenImageItem extends LiveFloatingScreenBaseItemData	// class@000fc4
{
    public CDNUrl[] backupPicUrl;
    public int drawablePicId;
    public int picHeight;
    public int picPreLoadType;
    public String picPreloadKey;
    public int picType;
    public CDNUrl[] picUrls;
    public int picWidth;
    public static final LiveFloatingScreenImageItem$a Companion;
    public static final long serialVersionUID;

    static {
       LiveFloatingScreenImageItem.Companion = new LiveFloatingScreenImageItem$a(null);
    }
    public void LiveFloatingScreenImageItem(){
       super();
       this.picPreloadKey = "";
    }
    public static void getPicType$annotations(){
    }
    public final CDNUrl[] getBackupPicUrl(){
       return this.backupPicUrl;
    }
    public final int getDrawablePicId(){
       return this.drawablePicId;
    }
    public final int getPicHeight(){
       return this.picHeight;
    }
    public final int getPicPreLoadType(){
       return this.picPreLoadType;
    }
    public final String getPicPreloadKey(){
       return this.picPreloadKey;
    }
    public final int getPicType(){
       return this.picType;
    }
    public final CDNUrl[] getPicUrls(){
       return this.picUrls;
    }
    public final int getPicWidth(){
       return this.picWidth;
    }
    public void registerResourceToPreload(a p0){
       LiveFloatingScreenImageItem liveFloating;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFloatingScreenImageItem.class, "2")) {
          return;
       }
       a.p(p0, "preload");
       LiveFloatingScreenImageItem tpicUrls = this.picUrls;
       int i = 0;
       if (tpicUrls != null) {
          int i1 = (!tpicUrls.length)? 1: 0;
          if (!i1) {
             liveFloating = null;
          label_0022 :
             if (!liveFloating) {
                if (this.picType == 1) {
                   p0.c(tpicUrls);
                }else {
                   p0.b(tpicUrls);
                }
             }
             tpicUrls = this.backupPicUrl;
             if (tpicUrls != null) {
                liveFloating = (!tpicUrls.length)? 1: 0;
                if (!liveFloating) {
                label_003c :
                   if (!i) {
                      p0.b(tpicUrls);
                   }
                   return;
                }
             }
             i = 1;
             goto label_003c ;
          }
       }
       liveFloating = 1;
       goto label_0022 ;
    }
    public final void setBackupPicUrl(CDNUrl[] p0){
       this.backupPicUrl = p0;
    }
    public final void setDrawablePicId(int p0){
       this.drawablePicId = p0;
    }
    public final void setPicHeight(int p0){
       this.picHeight = p0;
    }
    public final void setPicPreLoadType(int p0){
       this.picPreLoadType = p0;
    }
    public final void setPicPreloadKey(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFloatingScreenImageItem.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.picPreloadKey = p0;
       return;
    }
    public final void setPicType(int p0){
       this.picType = p0;
    }
    public final void setPicUrls(CDNUrl[] p0){
       this.picUrls = p0;
    }
    public final void setPicWidth(int p0){
       this.picWidth = p0;
    }
}
