package com.kuaishou.live.lite.config.LiveLiteModelRegistry$registerModelItems$57;
import msd.l;
import kotlin.jvm.internal.Lambda;
import androidx.fragment.app.Fragment;
import mrd.a;
import com.kuaishou.live.lite.basic.model.LiveLiteModelManager;
import id3.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class LiveLiteModelRegistry$registerModelItems$57 extends Lambda implements l	// class@0008ab
{
    public final Fragment $fragment;
    public final a $slideStatus;

    public void LiveLiteModelRegistry$registerModelItems$57(Fragment p0,a p1){
       this.$fragment = p0;
       this.$slideStatus = p1;
       super(1);
    }
    public final i invoke(LiveLiteModelManager p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteModelRegistry$registerModelItems$57.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return new i(this.$fragment, this.$slideStatus);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
