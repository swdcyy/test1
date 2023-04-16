package com.yxcorp.gifshow.v3.editor.music_v2.vm.MusicMiddleware$fetchRapStyleInfo$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import msc.e;
import java.lang.Object;
import java.lang.Boolean;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.yxcorp.gifshow.v3.framework.KSStore;
import tvc.c;
import com.yxcorp.gifshow.v3.editor.music_v2.action.RapListResultAction;
import trc.t0;
import com.yxcorp.gifshow.v3.editor.music_v2.network.RapRepo;
import tvc.a;

public final class MusicMiddleware$fetchRapStyleInfo$1 extends Lambda implements l	// class@00112f
{
    public final e this$0;

    public void MusicMiddleware$fetchRapStyleInfo$1(e p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.booleanValue());
       return l1.a;
    }
    public final void invoke(boolean p0){
       if (PatchProxy.isSupport(MusicMiddleware$fetchRapStyleInfo$1.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, MusicMiddleware$fetchRapStyleInfo$1.class, "1")) {
          return;
       }
       MusicMiddleware$fetchRapStyleInfo$1 tthis$0 = this.this$0;
       if (tthis$0.g != null) {
          KSStore kSStore = tthis$0.a();
          if (kSStore != null) {
             kSStore.a(new RapListResultAction(p0, this.this$0.i.d()));
          }
       }
       return;
    }
}
