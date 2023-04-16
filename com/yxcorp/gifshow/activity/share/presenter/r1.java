package com.yxcorp.gifshow.activity.share.presenter.r1;
import com.yxcorp.gifshow.activity.share.presenter.c0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.share.presenter.r1$a;
import com.kwai.library.widget.layout.DraggedFrameLayout$b;
import com.yxcorp.gifshow.activity.share.widget.DragPreviewContainer;

public abstract class r1 extends c0	// class@00142a
{

    public void r1(){
       super();
    }
    public void a9(){
       if (PatchProxy.applyVoid(null, this, r1.class, "1")) {
          return;
       }
       super.a9();
       this.s.setDragListener(new r1$a(this));
       this.s.setCanIntercept(true);
       return;
    }
    public void d9(float p0){
    }
    public void m9(){
    }
}
