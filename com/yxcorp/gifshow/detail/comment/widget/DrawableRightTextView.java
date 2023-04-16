package com.yxcorp.gifshow.detail.comment.widget.DrawableRightTextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import android.graphics.Rect;

public class DrawableRightTextView extends AppCompatTextView	// class@001395
{
    public boolean f;

    public void DrawableRightTextView(Context p0){
       super(p0);
    }
    public void DrawableRightTextView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void DrawableRightTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(DrawableRightTextView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, DrawableRightTextView.class, "1")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       if (this.f != null) {
          return;
       }
       object oobject = this.getCompoundDrawables()[2];
       if (oobject != null) {
          Rect bounds = oobject.getBounds();
          oobject.setBounds(bounds.left, bounds.top, bounds.right, bounds.bottom);
          this.f = true;
       }
       return;
    }
}
