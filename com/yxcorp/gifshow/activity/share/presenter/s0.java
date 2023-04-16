package com.yxcorp.gifshow.activity.share.presenter.s0;
import java.lang.Runnable;
import com.yxcorp.gifshow.activity.share.presenter.ShareHintTextPresenter$i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.share.presenter.ShareHintTextPresenter;
import com.yxcorp.gifshow.widget.EmojiEditText;
import android.widget.EditText;

public final class s0 implements Runnable	// class@00142d
{
    public final ShareHintTextPresenter$i b;

    public void s0(ShareHintTextPresenter$i p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, s0.class, "1")) {
          return;
       }
       ShareHintTextPresenter.R8(this.b.b).setVisibility(0);
       return;
    }
}
