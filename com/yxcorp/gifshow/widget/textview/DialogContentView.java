package com.yxcorp.gifshow.widget.textview.DialogContentView;
import com.yxcorp.gifshow.widget.EmojiTextView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.text.Layout;
import android.widget.TextView;

public class DialogContentView extends EmojiTextView	// class@0019ce
{

    public void DialogContentView(Context p0){
       super(p0);
    }
    public void DialogContentView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void DialogContentView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(DialogContentView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, DialogContentView.class, "1")) {
          return;
       }
       super.onMeasure(p0, p1);
       Layout layout = this.getLayout();
       if (layout != null && (layout.getLineCount() >= 2 && this.getGravity() != 3)) {
          this.setGravity(3);
       }
    label_0035 :
       return;
    }
}
