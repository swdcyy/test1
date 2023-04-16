package com.yxcorp.gifshow.push.dialog.spring_dialog.PushFragmentDialog$c;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.push.dialog.spring_dialog.PushFragmentDialog;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.a;
import com.kwai.android.common.bean.Channel;
import kotlin.Pair;
import qrd.r0;
import com.kwai.android.register.Processor;
import com.kwai.lib.BaseSpringDialogFragment;

public final class PushFragmentDialog$c implements View$OnClickListener	// class@001642
{
    public final PushFragmentDialog b;

    public void PushFragmentDialog$c(PushFragmentDialog p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PushFragmentDialog$c.class, "1")) {
          return;
       }
       PushFragmentDialog$c tb = this.b;
       tb.k = true;
       if (tb.getArguments() != null) {
          Bundle arguments = this.b.getArguments();
          a.m(arguments);
          a.o(arguments, "arguments!!");
          String str = arguments.getString("data_json");
          a.m(str);
          a.o(str, "bundle.getString\(\"data_json\"\)!!");
          String str1 = arguments.getString("push_channel");
          a.m(str1);
          a.o(str1, "bundle.getString\(\"push_channel\"\)!!");
          Pair[] pairArray = new Pair[true];
          pairArray[0] = r0.a("push_style", String.valueOf(7));
          Processor.clickNotification(str, Channel.valueOf(str1), true, pairArray);
       }
       this.b.dismissAllowingStateLoss();
       return;
    }
}
