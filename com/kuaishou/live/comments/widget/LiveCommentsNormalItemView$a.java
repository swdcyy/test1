package com.kuaishou.live.comments.widget.LiveCommentsNormalItemView$a;
import java.lang.Runnable;
import com.kuaishou.live.comments.widget.LiveCommentsNormalItemView;
import android.graphics.drawable.Drawable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class LiveCommentsNormalItemView$a implements Runnable	// class@000e50
{
    public final Drawable b;
    public final LiveCommentsNormalItemView c;

    public void LiveCommentsNormalItemView$a(LiveCommentsNormalItemView p0,Drawable p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, LiveCommentsNormalItemView$a.class, "1")) {
          return;
       }
       this.c.setBackground(this.b);
       return;
    }
}
