package com.yxcorp.gifshow.v3.mixed.editor.frame.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.v3.mixed.editor.frame.MixFrameAdjustFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dwc.a;
import android.view.View$OnClickListener;
import ekd.m1;
import dwc.b;

public class c extends PresenterV2	// class@001551
{
    public final MixFrameAdjustFragment p;

    public void c(MixFrameAdjustFragment p0){
       super();
       this.p = p0;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       m1.a(p0, new a(this), R.id.left_btn);
       m1.a(p0, new b(this), R.id.right_btn);
       return;
    }
}
