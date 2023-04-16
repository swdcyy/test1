package com.kwai.component.photo.detail.slide.rerank.SlideRefreshRerankProcessor$onObtainResidualData$1$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class SlideRefreshRerankProcessor$onObtainResidualData$1$2 extends Lambda implements l	// class@000aa5
{
    public static final SlideRefreshRerankProcessor$onObtainResidualData$1$2 INSTANCE;

    static {
       SlideRefreshRerankProcessor$onObtainResidualData$1$2.INSTANCE = new SlideRefreshRerankProcessor$onObtainResidualData$1$2();
    }
    public void SlideRefreshRerankProcessor$onObtainResidualData$1$2(){
       super(1);
    }
    public final CharSequence invoke(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SlideRefreshRerankProcessor$onObtainResidualData$1$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return p0.getPhotoId()+"-> "+p0.getCaption();
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
