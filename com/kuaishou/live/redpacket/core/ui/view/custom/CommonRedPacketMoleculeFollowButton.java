package com.kuaishou.live.redpacket.core.ui.view.custom.CommonRedPacketMoleculeFollowButton;
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
import android.widget.ImageView;
import android.widget.TextView;
import ekd.k1;

public class CommonRedPacketMoleculeFollowButton extends FrameLayout	// class@000ef6
{
    public ImageView b;
    public ImageView c;
    public ViewGroup d;
    public ImageView e;
    public TextView f;
    public TextView g;
    public f h;
    public final Object i;
    public int j;

    public void CommonRedPacketMoleculeFollowButton(Context p0){
       super(p0, null);
    }
    public void CommonRedPacketMoleculeFollowButton(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void CommonRedPacketMoleculeFollowButton(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.i = new Object();
       this.j = 0;
       if (PatchProxy.applyVoidOneRefs(p0, this, CommonRedPacketMoleculeFollowButton.class, "2")) {
       }else {
          a.c(p0, R.layout.arg_RES_7f0d020b, this);
          this.b = this.findViewById(0x7f0a350b);
          this.c = this.findViewById(0x7f0a350d);
          this.d = this.findViewById(0x7f0a3508);
          this.e = this.findViewById(0x7f0a3509);
          this.f = this.findViewById(0x7f0a350a);
          this.g = this.findViewById(0x7f0a350c);
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, CommonRedPacketMoleculeFollowButton.class, "1")) {
          return;
       }
       super.onDetachedFromWindow();
       k1.n(this.i);
       return;
    }
}
