package com.kwai.video.wayne.player.main.AwesomeCacheProcessor$1;
import com.kwai.video.wayne.player.listeners.OnPlayerLoadingChangedListener;
import com.kwai.video.wayne.player.main.AwesomeCacheProcessor;
import java.lang.Object;
import com.kwai.video.wayne.player.main.LoadingType;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;

public class AwesomeCacheProcessor$1 implements OnPlayerLoadingChangedListener	// class@000d50
{
    public final AwesomeCacheProcessor this$0;

    public void AwesomeCacheProcessor$1(AwesomeCacheProcessor p0){
       this.this$0 = p0;
       super();
    }
    public void onChanged(boolean p0,LoadingType p1){
       AwesomeCacheProcessor$1 u1 = AwesomeCacheProcessor$1.class;
       if (PatchProxy.isSupport(u1) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, u1, "1")) {
          return;
       }
       if (!p0 && p1 == LoadingType.STATE_FIRSTFRAME) {
          this.this$0.notifyPreloadNextVideo(-1);
       }
       return;
    }
}
