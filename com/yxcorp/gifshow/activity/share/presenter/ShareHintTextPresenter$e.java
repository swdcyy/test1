package com.yxcorp.gifshow.activity.share.presenter.ShareHintTextPresenter$e;
import erd.g;
import com.yxcorp.gifshow.activity.share.presenter.ShareHintTextPresenter;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;
import kotlin.jvm.internal.a;

public final class ShareHintTextPresenter$e implements g	// class@0013ab
{
    public final ShareHintTextPresenter b;

    public void ShareHintTextPresenter$e(ShareHintTextPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShareHintTextPresenter$e.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          a.b().w("ShareHintTextPresenter", "subscribeEditStatus: "+p0, objArray);
          this.b.V8();
          if (p0 != null && !p0.intValue()) {
             this.b.X8();
             this.b.W8();
          }else {
             a.o(p0, "it");
             this.b.Z8(p0.intValue());
          }
       }
       return;
    }
}
