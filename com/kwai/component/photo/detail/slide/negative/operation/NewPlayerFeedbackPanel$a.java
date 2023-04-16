package com.kwai.component.photo.detail.slide.negative.operation.NewPlayerFeedbackPanel$a;
import java.lang.Object;
import nsd.u;
import android.app.Activity;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.entity.QPhoto;
import mf5.s0;
import com.kwai.component.photo.detail.slide.negative.operation.NewPlayerFeedbackPanel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class NewPlayerFeedbackPanel$a	// class@000a75
{

    public void NewPlayerFeedbackPanel$a(){
       super();
    }
    public void NewPlayerFeedbackPanel$a(u p0){
       super();
    }
    public final NewPlayerFeedbackPanel a(Activity p0,BaseFragment p1,QPhoto p2,s0 p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, NewPlayerFeedbackPanel$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "activity");
       a.p(p1, "fragment");
       a.p(p2, "photo");
       a.p(p3, "operationListCreator");
       NewPlayerFeedbackPanel newPlayerFee = new NewPlayerFeedbackPanel(p0, p1, p2, p3, null);
       return obj;
    }
}
