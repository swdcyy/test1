package com.yxcorp.gifshow.push.PushBells$a;
import android.media.SoundPool$OnLoadCompleteListener;
import ftd.u;
import java.lang.Object;
import android.media.SoundPool;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public final class PushBells$a implements SoundPool$OnLoadCompleteListener	// class@001612
{
    public final u a;

    public void PushBells$a(u p0){
       this.a = p0;
       super();
    }
    public final void onLoadComplete(SoundPool p0,int p1,int p2){
       if (PatchProxy.isSupport(PushBells$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, PushBells$a.class, "1")) {
          return;
       }
       this.a.j(Integer.valueOf(p1));
       return;
    }
}
