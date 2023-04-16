package com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.LiveSurpriseRedPackResultViewBinder$Mode$a;
import android.os.CountDownTimer;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.LiveSurpriseRedPackResultViewBinder$Mode;
import android.widget.TextView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uh2.f;
import java.lang.CharSequence;
import java.lang.Long;

public class LiveSurpriseRedPackResultViewBinder$Mode$a extends CountDownTimer	// class@000fad
{
    public final TextView a;
    public final boolean b;
    public final LiveSurpriseRedPackResultViewBinder$Mode c;

    public void LiveSurpriseRedPackResultViewBinder$Mode$a(LiveSurpriseRedPackResultViewBinder$Mode p0,long p1,long p2,TextView p3,boolean p4){
       this.c = p0;
       this.a = p3;
       this.b = p4;
       super(p1, p2);
    }
    public void onFinish(){
       if (PatchProxy.applyVoid(null, this, LiveSurpriseRedPackResultViewBinder$Mode$a.class, "2")) {
          return;
       }
       this.a.setText(f.a(0, this.b));
       return;
    }
    public void onTick(long p0){
       if (PatchProxy.isSupport(LiveSurpriseRedPackResultViewBinder$Mode$a.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, LiveSurpriseRedPackResultViewBinder$Mode$a.class, "1")) {
          return;
       }
       this.a.setText(f.a(p0, this.b));
       return;
    }
}
