package com.yxcorp.gifshow.postentrance.bubblev2.presenter.c;
import erd.g;
import com.yxcorp.gifshow.postentrance.bubblev2.model.bubbleinfo.PublishGuideInfo;
import java.lang.Object;
import om6.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class c implements g	// class@001030
{
    public final PublishGuideInfo b;

    public void c(PublishGuideInfo p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          p0.at(this.b.mDraftIdentifier);
       }
       return;
    }
}
