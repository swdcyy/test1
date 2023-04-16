package com.kuaishou.live.redpacket.core.ui.view.pendant.RedPacketPendantCenterView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;

public class RedPacketPendantCenterView extends FrameLayout	// class@000f35
{
    public KwaiImageView b;
    public ImageView c;

    public void RedPacketPendantCenterView(Context p0){
       super(p0);
       this.a();
    }
    public void RedPacketPendantCenterView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a();
    }
    public void RedPacketPendantCenterView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.a();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, RedPacketPendantCenterView.class, "1")) {
          return;
       }
       a.k(this, R.layout.arg_RES_7f0d0d9c, true);
       this.b = this.findViewById(0x7f0a24e2);
       this.c = this.findViewById(0x7f0a24f3);
       return;
    }
    public KwaiImageView getAvatarView(){
       return this.b;
    }
    public ImageView getOpenIndicatorView(){
       return this.c;
    }
}
