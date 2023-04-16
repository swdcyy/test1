package com.yxcorp.gifshow.activity.share.presenter.ShareHintTextPresenter$a;
import tyc.u4;
import com.yxcorp.gifshow.activity.share.presenter.ShareHintTextPresenter;
import java.lang.CharSequence;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class ShareHintTextPresenter$a extends u4	// class@0013a7
{
    public final ShareHintTextPresenter b;

    public void ShareHintTextPresenter$a(ShareHintTextPresenter p0){
       this.b = p0;
       super();
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(ShareHintTextPresenter$a.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, ShareHintTextPresenter$a.class, "1")) {
          return;
       }
       a.p(p0, "s");
       this.b.X8();
       return;
    }
}
