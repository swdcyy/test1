package com.kuaishou.live.redpacket.core.ui.view.lottery.RedPacketPopupScrollStatusAreaView;
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
import android.widget.TextView;

public class RedPacketPopupScrollStatusAreaView extends FrameLayout	// class@000f0e
{
    public TextView b;

    public void RedPacketPopupScrollStatusAreaView(Context p0){
       super(p0);
       this.a();
    }
    public void RedPacketPopupScrollStatusAreaView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a();
    }
    public void RedPacketPopupScrollStatusAreaView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.a();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, RedPacketPopupScrollStatusAreaView.class, "1")) {
          return;
       }
       this.setClipChildren(false);
       a.k(this, R.layout.arg_RES_7f0d0dae, true);
       this.b = this.findViewById(0x7f0a3b54);
       return;
    }
    public TextView getStatusTextView(){
       return this.b;
    }
}
