package com.yxcorp.gifshow.activity.share.presenter.ShareHintTextPresenter$d;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.activity.share.presenter.ShareHintTextPresenter;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f66.i;
import jq.a;
import q87.c;

public final class ShareHintTextPresenter$d implements View$OnClickListener	// class@0013aa
{
    public final ShareHintTextPresenter b;

    public void ShareHintTextPresenter$d(ShareHintTextPresenter p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShareHintTextPresenter$d.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.b().w("ShareHintTextPresenter", "onBind: onclick editor", objArray);
       ShareHintTextPresenter.a9(this.b, 0, 1, null);
       return;
    }
}
