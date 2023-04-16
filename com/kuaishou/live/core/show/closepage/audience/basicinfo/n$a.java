package com.kuaishou.live.core.show.closepage.audience.basicinfo.n$a;
import f52.b;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.n;
import java.lang.Object;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;

public class n$a implements b	// class@000a43
{
    public final n a;

    public void n$a(n p0){
       this.a = p0;
       super();
    }
    public void a(LiveStreamFeedWrapper p0,boolean p1){
       n$a uoa = n$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       this.a.P8(p0, p1);
       return;
    }
}
