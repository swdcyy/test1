package com.kuaishou.live.core.show.enterroom.mount.LiveEnterRoomMountView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import android.util.AttributeSet;
import ia1.b;
import hc.b;
import com.kuaishou.live.core.show.enterroom.mount.LiveEnterRoomMountView$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.enterroom.mount.a;
import java.lang.Integer;
import com.kuaishou.live.common.core.basic.resource.c;
import android.widget.ImageView;

public class LiveEnterRoomMountView extends KwaiImageView	// class@000b1b
{
    public a x;
    public b y;

    public void LiveEnterRoomMountView(Context p0){
       super(p0);
    }
    public void LiveEnterRoomMountView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void LiveEnterRoomMountView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public b getResource(){
       return this.x;
    }
    public void setAnimationListener(b p0){
       this.y = p0;
    }
    public void setEnterRoomMountListener(LiveEnterRoomMountView$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveEnterRoomMountView.class, "4")) {
          return;
       }
       LiveEnterRoomMountView tx = this.x;
       if (tx != null) {
          tx.c = p0;
       }
       return;
    }
    public void setResource(a p0){
       this.x = p0;
    }
    public void setVisibility(int p0){
       if (PatchProxy.isSupport(LiveEnterRoomMountView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveEnterRoomMountView.class, "1")) {
          return;
       }
       if (p0) {
          c.f(this);
       }
       super.setVisibility(p0);
       return;
    }
}
