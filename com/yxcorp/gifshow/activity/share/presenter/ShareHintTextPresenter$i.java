package com.yxcorp.gifshow.activity.share.presenter.ShareHintTextPresenter$i;
import erd.g;
import com.yxcorp.gifshow.activity.share.presenter.ShareHintTextPresenter;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.EmojiEditText;
import android.widget.EditText;
import com.yxcorp.gifshow.activity.share.presenter.s0;
import java.lang.Runnable;

public final class ShareHintTextPresenter$i implements g	// class@0013af
{
    public final ShareHintTextPresenter b;

    public void ShareHintTextPresenter$i(ShareHintTextPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShareHintTextPresenter$i.class, "1")) {
       }else if(ShareHintTextPresenter.R8(this.b).getScrollX() != ShareHintTextPresenter.P8(this.b).getScrollX() || ShareHintTextPresenter.R8(this.b).getScrollY() != ShareHintTextPresenter.P8(this.b).getScrollY()){
          ShareHintTextPresenter.R8(this.b).setVisibility(4);
          ShareHintTextPresenter.R8(this.b).scrollTo(ShareHintTextPresenter.P8(this.b).getScrollX(), ShareHintTextPresenter.P8(this.b).getScrollY());
       }else {
          p0 = this.b;
          if (p0.u != null) {
             ShareHintTextPresenter.R8(p0).postDelayed(new s0(this), 200);
          }else {
             ShareHintTextPresenter.R8(p0).setVisibility(0);
          }
       }
       return;
    }
}
