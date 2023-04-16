package com.kwai.video.waynelive.wayneplayer.RepresentationProcessor$onAttach$1;
import com.kwai.video.waynelive.quality.LiveQualityChangeListener;
import com.kwai.video.waynelive.wayneplayer.RepresentationProcessor;
import java.lang.Object;
import com.kwai.video.waynelive.quality.LiveQualityItem;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.util.Set;

public final class RepresentationProcessor$onAttach$1 implements LiveQualityChangeListener	// class@000e36
{
    public final RepresentationProcessor this$0;

    public void RepresentationProcessor$onAttach$1(RepresentationProcessor p0){
       this.this$0 = p0;
       super();
    }
    public final void onQualityChange(LiveQualityItem p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RepresentationProcessor$onAttach$1.class, "1")) {
          return;
       }
       a.p(p0, "qualityItemModel");
       Iterator iterator = this.this$0.mOnQualityChangeListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().onQualityChange(p0);
       }
       return;
    }
}
