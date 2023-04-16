package com.yxcorp.gifshow.widget.record.DeleteSegmentButton;
import android.widget.TextView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.utility.n;
import java.lang.Boolean;

public class DeleteSegmentButton extends TextView	// class@0019ba
{
    public boolean b;

    public void DeleteSegmentButton(Context p0){
       super(p0);
    }
    public void DeleteSegmentButton(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void DeleteSegmentButton(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, DeleteSegmentButton.class, "1")) {
          return;
       }
       this.setSelected(false);
       if (!this.getVisibility()) {
          n.Y(this, 4, false);
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, DeleteSegmentButton.class, "4")) {
          return;
       }
       this.setSelected(false);
       return;
    }
    public void setSelected(boolean p0){
       if (PatchProxy.isSupport(DeleteSegmentButton.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, DeleteSegmentButton.class, "6")) {
          return;
       }
       if (this.isSelected() != p0) {
          int i = (p0)? 0x7f104274: 0x7f104270;
          this.setText(i);
          this.requestLayout();
          super.setSelected(p0);
       }
       return;
    }
}
