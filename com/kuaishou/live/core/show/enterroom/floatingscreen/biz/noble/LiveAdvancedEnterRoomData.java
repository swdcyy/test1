package com.kuaishou.live.core.show.enterroom.floatingscreen.biz.noble.LiveAdvancedEnterRoomData;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenDataWithMount;
import com.kwai.feature.api.live.floatingscreen.data.items.LiveFloatingScreenImageItem;
import com.kwai.feature.api.live.floatingscreen.data.items.LiveFloatingScreenTextItem;
import fr5.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenBaseData;

public class LiveAdvancedEnterRoomData extends LiveFloatingScreenDataWithMount	// class@000b06
{
    public LiveFloatingScreenImageItem avatarImageItem;
    public LiveFloatingScreenImageItem avatarRingImageItem;
    public LiveFloatingScreenImageItem welcomeImageItem;
    public LiveFloatingScreenTextItem welcomeTextItem;

    public void LiveAdvancedEnterRoomData(){
       super();
    }
    public final LiveFloatingScreenImageItem getAvatarImageItem(){
       return this.avatarImageItem;
    }
    public final LiveFloatingScreenImageItem getAvatarRingImageItem(){
       return this.avatarRingImageItem;
    }
    public final LiveFloatingScreenImageItem getWelcomeImageItem(){
       return this.welcomeImageItem;
    }
    public final LiveFloatingScreenTextItem getWelcomeTextItem(){
       return this.welcomeTextItem;
    }
    public void registerResourceToPreload(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAdvancedEnterRoomData.class, "1")) {
          return;
       }
       a.p(p0, "preload");
       LiveAdvancedEnterRoomData tavatarRingI = this.avatarRingImageItem;
       if (tavatarRingI != null) {
          tavatarRingI.registerResourceToPreload(p0);
       }
       tavatarRingI = this.avatarImageItem;
       if (tavatarRingI != null) {
          tavatarRingI.registerResourceToPreload(p0);
       }
       tavatarRingI = this.welcomeImageItem;
       if (tavatarRingI != null) {
          tavatarRingI.registerResourceToPreload(p0);
       }
       super.registerResourceToPreload(p0);
       return;
    }
    public final void setAvatarImageItem(LiveFloatingScreenImageItem p0){
       this.avatarImageItem = p0;
    }
    public final void setAvatarRingImageItem(LiveFloatingScreenImageItem p0){
       this.avatarRingImageItem = p0;
    }
    public final void setWelcomeImageItem(LiveFloatingScreenImageItem p0){
       this.welcomeImageItem = p0;
    }
    public final void setWelcomeTextItem(LiveFloatingScreenTextItem p0){
       this.welcomeTextItem = p0;
    }
}
