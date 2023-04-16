package com.kuaishou.live.redpacket.core.ui.view.lottery.RedPacketPopRollUserView;
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
import android.widget.TextView;

public class RedPacketPopRollUserView extends FrameLayout	// class@000f01
{
    public KwaiImageView b;
    public TextView c;
    public TextView d;

    public void RedPacketPopRollUserView(Context p0){
       super(p0);
       this.b();
    }
    public void RedPacketPopRollUserView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b();
    }
    public void RedPacketPopRollUserView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b();
    }
    private void b(){
       if (PatchProxy.applyVoid(null, this, RedPacketPopRollUserView.class, "1")) {
          return;
       }
       a.c(this.getContext(), R.layout.arg_RES_7f0d0dad, this);
       this.b = this.findViewById(0x7f0a037c);
       this.c = this.findViewById(0x7f0a4386);
       this.d = this.findViewById(0x7f0a3627);
       return;
    }
}
