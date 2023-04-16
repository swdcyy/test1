package com.yxcorp.gifshow.activity.share.presenter.u0;
import w07.l;
import android.app.Activity;
import java.lang.Object;
import u07.t;
import android.view.View;
import com.kwai.library.widget.popup.common.c;
import android.widget.TextView;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import f66.i;
import jq.a;
import q87.c;
import zw8.w1;
import android.view.View$OnClickListener;

public final class u0 implements l	// class@001435
{
    public final Activity a;

    public void u0(Activity p0){
       this.a = p0;
    }
    public final void apply(Object p0){
       u0 ta = this.a;
       p0 = p0.z();
       if (p0 == null) {
       }else {
          TextView textView = p0.findViewById(R.id.content);
          if (textView != null) {
             textView.setTextAlignment(2);
          }
          String str = a.t().c("shareJudgeAssistUrl", "");
          View view = p0.findViewById(R.id.share_adjust_assist_link_layout);
          p0 = p0.findViewById(R.id.share_adjust_assist_read_more_link);
          if (view != null && p0 != null) {
             if (TextUtils.x(str)) {
                Object[] objArray = new Object[0];
                a.b().w("ShareJudgeAssistPresenter", "createView: empty url, hide link layout", objArray);
                view.setVisibility(8);
             }else {
                p0.setOnClickListener(new w1(ta, str));
             }
          }
       }
       return;
    }
}
