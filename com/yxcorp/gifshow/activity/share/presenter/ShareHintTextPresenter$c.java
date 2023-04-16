package com.yxcorp.gifshow.activity.share.presenter.ShareHintTextPresenter$c;
import com.yxcorp.gifshow.widget.EmojiEditText$e;
import com.yxcorp.gifshow.activity.share.presenter.ShareHintTextPresenter;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.widget.EmojiEditText;
import android.widget.EditText;
import usd.q;
import kotlin.jvm.internal.a;
import xw8.p0;

public final class ShareHintTextPresenter$c implements EmojiEditText$e	// class@0013a9
{
    public final ShareHintTextPresenter a;

    public void ShareHintTextPresenter$c(ShareHintTextPresenter p0){
       this.a = p0;
       super();
    }
    public final void a(int p0,int p1){
       ShareHintTextPresenter$c uoc = ShareHintTextPresenter$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoc, "1")) {
          return;
       }
       uoc = this.a;
       if (uoc.v != null && p1 == ShareHintTextPresenter.P8(uoc).length()) {
          p1 = ShareHintTextPresenter.P8(this.a).length() - 1;
          ShareHintTextPresenter.P8(this.a).setSelection(q.u(p0, p1), p1);
          return;
       }else {
          ShareHintTextPresenter s = this.a.s;
          if (s == null) {
             a.S("sharePagePresenterModel");
          }
          if (s.H == null) {
             return;
          }else {
             ShareHintTextPresenter.a9(this.a, 0, 1, null);
             return;
          }
       }
    }
}
