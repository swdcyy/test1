package com.kuaishou.live.core.show.stayinfo.c$a;
import android.view.View$OnAttachStateChangeListener;
import com.kuaishou.live.core.show.stayinfo.c;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.live.widget.LiveBreathAvatarView;

public class c$a implements View$OnAttachStateChangeListener	// class@0010b3
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public void onViewAttachedToWindow(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       this.b.v.L();
       return;
    }
    public void onViewDetachedFromWindow(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "2")) {
          return;
       }
       this.b.v.M();
       return;
    }
}
