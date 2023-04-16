package com.yxcorp.gifshow.activity.share.presenter.ShareHintTextPresenter$b;
import android.view.View$OnScrollChangeListener;
import com.yxcorp.gifshow.activity.share.presenter.ShareHintTextPresenter;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.widget.EmojiEditText;
import android.widget.EditText;

public final class ShareHintTextPresenter$b implements View$OnScrollChangeListener	// class@0013a8
{
    public final ShareHintTextPresenter a;

    public void ShareHintTextPresenter$b(ShareHintTextPresenter p0){
       this.a = p0;
       super();
    }
    public final void onScrollChange(View p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(ShareHintTextPresenter$b.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, ShareHintTextPresenter$b.class, "1")) {
             return;
          }
       }
       ShareHintTextPresenter.R8(this.a).scrollTo(p1, p2);
       return;
    }
}
