package com.kwai.video.krtc.AryaAudioEngineProxyImp$18;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.video.krtc.utils.Log;
import java.util.concurrent.locks.Lock;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.lang.Integer;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$a;
import com.kwai.video.stannis.Stannis;

public class AryaAudioEngineProxyImp$18 implements Runnable	// class@0006c5
{
    public final ArrayList a;
    public final AryaAudioEngineProxyImp b;

    public void AryaAudioEngineProxyImp$18(AryaAudioEngineProxyImp p0,ArrayList p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp$18.class, "1")) {
          return;
       }
       Log.i("AryaAudioEngineProxyImp", "setAudioFocusUser userIdList.size = "+this.a.size());
       ArrayList uArrayList = new ArrayList();
       AryaAudioEngineProxyImp.o(this.b).lock();
       Iterator iterator = AryaAudioEngineProxyImp.p(this.b).keySet().iterator();
       while (iterator.hasNext()) {
          int i = iterator.next().intValue();
          if (this.a.contains(AryaAudioEngineProxyImp.p(this.b).get(Integer.valueOf(i)).c)) {
             uArrayList.add(Integer.valueOf(i));
          }
       }
       AryaAudioEngineProxyImp.o(this.b).unlock();
       AryaAudioEngineProxyImp.f(this.b).SetAudioFocusUser(uArrayList);
       return;
    }
}
