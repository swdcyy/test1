package com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostOperationBubblePresenter$b$c;
import erd.g;
import java.lang.Object;
import com.yxcorp.gifshow.postentrance.bubblev2.model.bubbleinfo.PublishGuideInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.postentrance.util.b;

public final class HomePostOperationBubblePresenter$b$c implements g	// class@001029
{
    public static final HomePostOperationBubblePresenter$b$c b;

    static {
       HomePostOperationBubblePresenter$b$c.b = new HomePostOperationBubblePresenter$b$c();
    }
    public void HomePostOperationBubblePresenter$b$c(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomePostOperationBubblePresenter$b$c.class, "1")) {
       }else {
          b.f("stage_processed_data", p0);
       }
       return;
    }
}
