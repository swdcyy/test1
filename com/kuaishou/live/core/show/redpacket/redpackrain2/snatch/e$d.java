package com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.e$d;
import ub.a;
import com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.e;
import com.kuaishou.live.core.show.redpacket.redpackrain2.model.LiveRedPackRainResource$RedPackRainButton;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.Animatable;
import bd.f;
import com.kuaishou.live.core.show.redpacket.redpackrain2.model.LiveRedPackRainResource$RedPackRainText;
import android.widget.TextView;

public class e$d extends a	// class@000f26
{
    public final LiveRedPackRainResource$RedPackRainButton b;
    public final int c;
    public final boolean d;
    public final e e;

    public void e$d(e p0,LiveRedPackRainResource$RedPackRainButton p1,int p2,boolean p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e$d.class, "2")) {
          return;
       }
       this.e.l(this.d, this.c);
       return;
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, e$d.class, "1")) {
       }else {
          LiveRedPackRainResource$RedPackRainButton mRedPackRain = this.b.mRedPackRainText;
          if (mRedPackRain != null) {
             LiveRedPackRainResource$RedPackRainText mTextColor = mRedPackRain.mTextColor;
             if (mTextColor != null) {
                this.e.n.setTextColor(mTextColor);
             }
          }else {
             this.e.n.setTextColor(this.c);
          }
       }
       return;
    }
}
