package com.kwai.component.photo.detail.slide.negative.operation.FeedbackSpeedPanelPresenter$c;
import y8c.g;
import com.kwai.component.photo.detail.slide.negative.operation.FeedbackSpeedPanelPresenter;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.view.View;
import i2b.a;
import android.widget.TextView;
import java.util.ArrayList;
import com.kwai.component.photo.detail.slide.negative.operation.FeedbackSpeedPanelPresenter$b;
import ml8.c;

public final class FeedbackSpeedPanelPresenter$c extends g	// class@000a72
{
    public final FeedbackSpeedPanelPresenter w;

    public void FeedbackSpeedPanelPresenter$c(FeedbackSpeedPanelPresenter p0){
       this.w = p0;
       super();
    }
    public f h1(ViewGroup p0,int p1){
       FeedbackSpeedPanelPresenter$c uoc = FeedbackSpeedPanelPresenter$c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoc, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "parent");
       TextView textView = a.i(p0, R.layout.arg_RES_7f0d083f);
       this.w.w.add(textView);
       return new f(textView, new FeedbackSpeedPanelPresenter$b(this.w));
    }
}
