package com.kuaishou.live.preview.item.presenter.n$c$a;
import java.lang.Runnable;
import com.kuaishou.live.preview.item.presenter.n$c;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveCameraFaceDataMessage;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.preview.item.presenter.n;

public class n$c$a implements Runnable	// class@000e32
{
    public final LiveFlvStream$LiveCameraFaceDataMessage b;
    public final n$c c;

    public void n$c$a(n$c p0,LiveFlvStream$LiveCameraFaceDataMessage p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, n$c$a.class, "1")) {
          return;
       }
       n$c b = this.c.b;
       n$c$a tb = this.b;
       b.H = tb;
       b.a9(tb);
       return;
    }
}
