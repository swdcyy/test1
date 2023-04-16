package com.yxcorp.gifshow.v3.editor.music_v2.network.RapRepo$Task$downloadMusic$2$defferMusic$1$1$downloadMusicAsync$$inlined$suspendCancellableCoroutine$lambda$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.music_v2.network.a;
import com.yxcorp.gifshow.v3.editor.music_v2.network.RapRepo$Task;
import com.yxcorp.gifshow.music.utils.a;
import com.kuaishou.android.model.music.Music;
import java.util.List;
import java.lang.Object;
import java.lang.Throwable;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.music.utils.a$a;

public final class RapRepo$Task$downloadMusic$2$defferMusic$1$1$downloadMusicAsync$$inlined$suspendCancellableCoroutine$lambda$2 extends Lambda implements l	// class@0010b1
{
    public final List $cdnUrls$inlined;
    public final a $listener;
    public final Music $music$inlined;
    public final a $this_downloadMusicAsync$inlined;
    public final RapRepo$Task this$0;

    public void RapRepo$Task$downloadMusic$2$defferMusic$1$1$downloadMusicAsync$$inlined$suspendCancellableCoroutine$lambda$2(a p0,RapRepo$Task p1,a p2,Music p3,List p4){
       this.$listener = p0;
       this.this$0 = p1;
       this.$this_downloadMusicAsync$inlined = p2;
       this.$music$inlined = p3;
       this.$cdnUrls$inlined = p4;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(Throwable p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, RapRepo$Task$downloadMusic$2$defferMusic$1$1$downloadMusicAsync$$inlined$suspendCancellableCoroutine$lambda$2.class, "1")) {
          return;
       }
       this.$this_downloadMusicAsync$inlined.b(this.$music$inlined, this.$listener);
       PatchProxy.onMethodExit(RapRepo$Task$downloadMusic$2$defferMusic$1$1$downloadMusicAsync$$inlined$suspendCancellableCoroutine$lambda$2.class, "1");
       return;
    }
}
