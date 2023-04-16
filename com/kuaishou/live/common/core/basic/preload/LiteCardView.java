package com.kuaishou.live.common.core.basic.preload.LiteCardView;
import androidx.cardview.widget.CardView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.Float;

public class LiteCardView extends CardView	// class@000eb3
{

    public void LiteCardView(Context p0){
       super(p0, null);
    }
    public void LiteCardView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiteCardView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.setCardBackgroundColor(0);
       this.setCardElevation(0);
    }
    public void setCardBackgroundColor(int p0){
       if (PatchProxy.isSupport(LiteCardView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiteCardView.class, "1")) {
          return;
       }
       super.setCardBackgroundColor(p0);
       return;
    }
    public void setCardElevation(float p0){
       if (PatchProxy.isSupport(LiteCardView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, LiteCardView.class, "2")) {
          return;
       }
       super.setCardElevation(p0);
       return;
    }
}
