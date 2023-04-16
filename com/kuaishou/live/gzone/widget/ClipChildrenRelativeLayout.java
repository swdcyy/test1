package com.kuaishou.live.gzone.widget.ClipChildrenRelativeLayout;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.view.ViewGroup;

public class ClipChildrenRelativeLayout extends RelativeLayout	// class@001cf5
{
    public boolean b;

    public void ClipChildrenRelativeLayout(Context p0){
       super(p0, null);
    }
    public void ClipChildrenRelativeLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void ClipChildrenRelativeLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = true;
    }
    public void setClipChildren(boolean p0){
       if (PatchProxy.isSupport(ClipChildrenRelativeLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ClipChildrenRelativeLayout.class, "1")) {
          return;
       }
       if (this.b == null) {
          super.setClipChildren(false);
       }
       return;
    }
}
