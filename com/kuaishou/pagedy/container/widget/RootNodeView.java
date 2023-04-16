package com.kuaishou.pagedy.container.widget.RootNodeView;
import so4.a;
import android.widget.LinearLayout;
import android.content.Context;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import java.lang.Boolean;
import brd.y;
import mrd.c;

public class RootNodeView extends LinearLayout implements a	// class@000a7e
{
    public c b;

    public void RootNodeView(Context p0){
       super(p0);
       this.setOrientation(1);
    }
    public void RootNodeView(Context p0,int p1){
       super(p0);
       this.setOrientation(p1);
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RootNodeView.class, "1")) {
          return;
       }
       super.dispatchDraw(p0);
       RootNodeView tb = this.b;
       if (tb != null) {
          tb.onNext(Boolean.TRUE);
       }
       return;
    }
    public void setDispatchDrawSubject(c p0){
       this.b = p0;
    }
}
