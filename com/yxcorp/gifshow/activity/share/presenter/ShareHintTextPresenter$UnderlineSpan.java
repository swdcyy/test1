package com.yxcorp.gifshow.activity.share.presenter.ShareHintTextPresenter$UnderlineSpan;
import android.text.style.UnderlineSpan;
import com.yxcorp.gifshow.activity.share.presenter.ShareHintTextPresenter;
import android.text.TextPaint;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ow8.c;
import lnc.a1;

public final class ShareHintTextPresenter$UnderlineSpan extends UnderlineSpan	// class@0013a6
{
    public final int b;
    public final ShareHintTextPresenter c;

    public void ShareHintTextPresenter$UnderlineSpan(ShareHintTextPresenter p0,int p1){
       this.c = p0;
       super();
       this.b = p1;
    }
    public void updateDrawState(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShareHintTextPresenter$UnderlineSpan.class, "1")) {
          return;
       }
       a.p(p0, "ds");
       super.updateDrawState(p0);
       if (c.b()) {
          p0.underlineColor = this.b;
          p0.underlineThickness = (float)a1.d(0x7f0702ac);
       }
       return;
    }
}
