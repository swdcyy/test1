package com.yxcorp.gifshow.activity.share.presenter.s1;
import android.view.View$OnClickListener;
import java.lang.Object;
import android.view.View;
import com.kuaishou.android.post.PostArguments;
import lq.i;
import com.kuaishou.android.post.StrArg;
import com.kuaishou.android.post.PostPageArg;
import java.lang.String;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import f66.i;
import jq.a;
import q87.c;
import e17.i;

public final class s1 implements View$OnClickListener	// class@00142e
{
    public static final s1 b;

    static {
       s1.b = new s1();
    }
    public void s1(){
       super();
    }
    public final void onClick(View p0){
       String str = i.g().getDisableShareCaptionEditToast().get();
       if (TextUtils.x(str)) {
          Object[] objArray = new Object[0];
          a.b().t("SharePublishPresenter", "onClick: no toast msg", objArray);
       }else {
          i.d(R.style.arg_RES_7f110668, str);
       }
       return;
    }
}
