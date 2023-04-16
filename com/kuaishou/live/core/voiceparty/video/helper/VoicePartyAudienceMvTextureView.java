package com.kuaishou.live.core.voiceparty.video.helper.VoicePartyAudienceMvTextureView;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import vy1.a;
import lnc.a1;
import android.widget.FrameLayout;
import android.view.ViewOutlineProvider;
import java.lang.Integer;
import android.view.View;

public class VoicePartyAudienceMvTextureView extends LivePlayTextureView	// class@001adb
{

    public void VoicePartyAudienceMvTextureView(Context p0){
       super(p0);
    }
    public void VoicePartyAudienceMvTextureView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void VoicePartyAudienceMvTextureView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, VoicePartyAudienceMvTextureView.class, "2")) {
          return;
       }
       a uoa = new a((float)a1.e(6.00f), 0, 0, this.getWidth(), this.getHeight());
       this.setOutlineProvider(v0);
       this.setClipToOutline(true);
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(VoicePartyAudienceMvTextureView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, VoicePartyAudienceMvTextureView.class, "1")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       this.i();
       return;
    }
}
