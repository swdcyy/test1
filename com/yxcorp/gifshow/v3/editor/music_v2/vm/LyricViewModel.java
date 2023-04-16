package com.yxcorp.gifshow.v3.editor.music_v2.vm.LyricViewModel;
import androidx.lifecycle.ViewModel;
import com.yxcorp.gifshow.v3.editor.music_v2.vm.LyricViewModel$lyricRepo$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.v3.editor.music_v2.network.LyricRepo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LyricViewModel extends ViewModel	// class@00112e
{
    public final p a;

    public void LyricViewModel(){
       super();
       this.a = s.c(LyricViewModel$lyricRepo$2.INSTANCE);
    }
    public final LyricRepo o0(){
       Object obj = PatchProxy.apply(null, this, LyricViewModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, LyricViewModel.class, "2")) {
          return;
       }
       super.onCleared();
       this.o0().g();
       return;
    }
}
