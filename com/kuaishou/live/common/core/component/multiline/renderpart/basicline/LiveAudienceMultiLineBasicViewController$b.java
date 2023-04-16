package com.kuaishou.live.common.core.component.multiline.renderpart.basicline.LiveAudienceMultiLineBasicViewController$b;
import androidx.lifecycle.ViewModelProvider$Factory;
import com.kuaishou.live.common.core.component.multiline.renderpart.basicline.LiveAudienceMultiLineBasicViewController;
import java.lang.Object;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ir1.c;
import nq1.a;

public final class LiveAudienceMultiLineBasicViewController$b implements ViewModelProvider$Factory	// class@001546
{
    public final LiveAudienceMultiLineBasicViewController a;

    public void LiveAudienceMultiLineBasicViewController$b(LiveAudienceMultiLineBasicViewController p0){
       this.a = p0;
       super();
    }
    public ViewModel create(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceMultiLineBasicViewController$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "p0");
       return new c(this.a.q);
    }
}
