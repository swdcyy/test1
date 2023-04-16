package com.kwai.slide.play.detail.widget.CommentEmojiSelectionBar$c;
import android.view.View$OnLayoutChangeListener;
import com.kwai.slide.play.detail.widget.CommentEmojiSelectionBar;
import java.lang.Runnable;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public class CommentEmojiSelectionBar$c implements View$OnLayoutChangeListener	// class@00188b
{
    public final Runnable b;
    public final CommentEmojiSelectionBar c;

    public void CommentEmojiSelectionBar$c(CommentEmojiSelectionBar p0,Runnable p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       if (PatchProxy.isSupport(CommentEmojiSelectionBar$c.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          if (PatchProxy.applyVoid(objArray, this, CommentEmojiSelectionBar$c.class, "1")) {
             return;
          }
       }
       p0.removeOnLayoutChangeListener(this);
       p0.post(this.b);
       return;
    }
}
