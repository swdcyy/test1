package com.kuaishou.live.basic.widget.LiveTransitionAvatarView;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.kuaishou.android.live.contants.LiveAvatarConstants$AvatarSize;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.kuaishou.live.basic.widget.LiveUserView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.k1;
import android.animation.ValueAnimator;
import android.widget.ImageView;

public class LiveTransitionAvatarView extends ConstraintLayout	// class@000d32
{
    public LiveUserView B;
    public LiveUserView C;
    public List D;
    public ValueAnimator E;
    public int F;
    public LiveAvatarConstants$AvatarSize G;
    public static final int H;

    public void LiveTransitionAvatarView(Context p0){
       super(p0, null);
    }
    public void LiveTransitionAvatarView(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void LiveTransitionAvatarView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.G = LiveAvatarConstants$AvatarSize.SMALL;
       LayoutInflater.from(p0).inflate(R.layout.arg_RES_7f0d0b02, this);
       this.B = this.findViewById(0x7f0a26eb);
       this.C = this.findViewById(0x7f0a26ec);
    }
    public void L(){
       if (PatchProxy.applyVoid(null, this, LiveTransitionAvatarView.class, "2")) {
          return;
       }
       k1.n(this);
       return;
    }
    public final void reset(){
       if (PatchProxy.applyVoid(null, this, LiveTransitionAvatarView.class, "5")) {
          return;
       }
       LiveTransitionAvatarView tE = this.E;
       if (tE != null) {
          tE.cancel();
       }
       this.B.setAlpha(0x3f800000);
       this.C.setAlpha(0);
       return;
    }
}
