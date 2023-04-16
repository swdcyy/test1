package com.kuaishou.live.audience.course.widget.CourseSelectorImageView;
import android.widget.Checkable;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.drawable.Drawable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public class CourseSelectorImageView extends KwaiImageView implements Checkable	// class@000c0e
{
    public boolean x;
    public String y;

    public void CourseSelectorImageView(Context p0){
       super(p0, null);
    }
    public void CourseSelectorImageView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void CourseSelectorImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.x = false;
    }
    public boolean isChecked(){
       return this.x;
    }
    public void setChecked(boolean p0){
       if (p0 != this.x) {
          this.x = p0;
       }
       return;
    }
    public void setImageDrawable(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CourseSelectorImageView.class, "1")) {
          return;
       }
       super.setImageDrawable(p0);
       return;
    }
    public void setSelectorUrl(String p0){
       this.y = p0;
    }
    public void toggle(){
       if (PatchProxy.applyVoid(null, this, CourseSelectorImageView.class, "2")) {
          return;
       }
       this.setChecked((this.x ^ 0x01));
       if (this.isChecked()) {
          this.L(this.y);
       }
       return;
    }
}
