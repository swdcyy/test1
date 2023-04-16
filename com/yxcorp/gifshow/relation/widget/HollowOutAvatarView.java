package com.yxcorp.gifshow.relation.widget.HollowOutAvatarView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Path;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Region$Op;
import java.lang.Integer;
import android.view.View;
import android.graphics.Path$Direction;

public class HollowOutAvatarView extends KwaiImageView	// class@001a60
{
    public int A;
    public final Path x;
    public final Path y;
    public boolean z;

    public void HollowOutAvatarView(Context p0){
       super(p0, null);
    }
    public void HollowOutAvatarView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void HollowOutAvatarView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.A = 50;
       this.x = new Path();
       this.y = new Path();
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HollowOutAvatarView.class, "2")) {
          return;
       }
       if (this.z == null) {
          super.onDraw(p0);
          return;
       }else {
          p0.clipPath(this.x);
          p0.clipPath(this.y, Region$Op.DIFFERENCE);
          super.onDraw(p0);
          p0.restoreToCount(p0.getSaveCount());
          return;
       }
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(HollowOutAvatarView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, HollowOutAvatarView.class, "3")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       this.x.reset();
       this.y.reset();
       float f = (float)p0 / 2.00f;
       float f1 = (float)p1 / 2.00f;
       this.x.addCircle(f, f1, f, Path$Direction.CW);
       this.y.addCircle((f - (float)this.A), f1, f, Path$Direction.CW);
       return;
    }
}
