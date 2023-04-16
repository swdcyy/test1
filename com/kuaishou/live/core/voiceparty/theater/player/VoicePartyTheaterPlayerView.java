package com.kuaishou.live.core.voiceparty.theater.player.VoicePartyTheaterPlayerView;
import yw2.k;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterDisplayMode;
import rw2.d;
import java.lang.Runnable;

public class VoicePartyTheaterPlayerView extends FrameLayout implements k	// class@0019a3
{
    public SurfaceView b;
    public LivePlayTextureView c;
    public FrameLayout d;
    public View e;
    public TheaterDisplayMode f;
    public static final int g;

    public void VoicePartyTheaterPlayerView(Context p0){
       super(p0, null);
    }
    public void VoicePartyTheaterPlayerView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void VoicePartyTheaterPlayerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.e = null;
    }
    public LivePlayTextureView a(){
       VoicePartyTheaterPlayerView obj = PatchProxy.apply(null, this, VoicePartyTheaterPlayerView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.hide();
       this.c.setVisibility(0);
       obj = this.c;
       this.e = obj;
       return obj;
    }
    public SurfaceHolder b(){
       VoicePartyTheaterPlayerView obj = PatchProxy.apply(null, this, VoicePartyTheaterPlayerView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.hide();
       obj = this.b;
       this.e = obj;
       return obj.getHolder();
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, VoicePartyTheaterPlayerView.class, "5")) {
          return;
       }
       VoicePartyTheaterPlayerView te = this.e;
       if (te != null) {
          te.setVisibility(0);
       }
       return;
    }
    public FrameLayout getPlayerViewContainer(){
       return this.d;
    }
    public void hide(){
       if (PatchProxy.applyVoid(null, this, VoicePartyTheaterPlayerView.class, "6")) {
          return;
       }
       this.c.setVisibility(8);
       this.b.setVisibility(8);
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, VoicePartyTheaterPlayerView.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.b = this.findViewById(0x7f0a27e2);
       this.c = this.findViewById(0x7f0a27e3);
       this.d = this.findViewById(0x7f0a27e1);
       return;
    }
    public void setDisplayMode(TheaterDisplayMode p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyTheaterPlayerView.class, "2")) {
          return;
       }
       this.f = p0;
       this.post(new d(this));
       return;
    }
}
