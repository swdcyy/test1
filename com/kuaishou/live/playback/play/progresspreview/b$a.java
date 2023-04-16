package com.kuaishou.live.playback.play.progresspreview.b$a;
import og3.d$a;
import com.kuaishou.live.playback.play.progresspreview.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.RelativeLayout;
import java.lang.Long;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import bj3.e;
import brd.y;

public class b$a implements d$a	// class@000d35
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "2")) {
          return;
       }
       b$a ta = this.a;
       ta.x = false;
       ta.u.setVisibility(8);
       return;
    }
    public void b(long p0,boolean p1){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (p1 && !e.b(this.a.r)) {
          this.a.A.onNext(Long.valueOf(p0));
       }
       return;
    }
    public void c(){
       b$a ta = this.a;
       ta.x = true;
       ta.y = ta.y + true;
    }
}
