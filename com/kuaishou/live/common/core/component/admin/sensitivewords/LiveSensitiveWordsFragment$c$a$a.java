package com.kuaishou.live.common.core.component.admin.sensitivewords.LiveSensitiveWordsFragment$c$a$a;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.admin.sensitivewords.LiveSensitiveWordsFragment$c$a;
import java.lang.String;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.yxcorp.utility.n;
import mz6.b;
import android.app.Activity;
import nl8.p;
import android.content.res.Resources;
import java.lang.CharSequence;
import mz6.b$d;
import com.kuaishou.live.common.core.component.admin.sensitivewords.LiveSensitiveWordsFragment$c$a$a$a;
import android.content.DialogInterface$OnClickListener;
import android.app.Dialog;

public class LiveSensitiveWordsFragment$c$a$a implements View$OnClickListener	// class@000f49
{
    public final String b;
    public final LiveSensitiveWordsFragment$c$a c;

    public void LiveSensitiveWordsFragment$c$a$a(LiveSensitiveWordsFragment$c$a p0,String p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSensitiveWordsFragment$c$a$a.class, "1")) {
          return;
       }
       int[] ointArray = new int[]{n.c(a.a().a(), 15.00f),n.c(a.a().a(), 7.00f),n.c(a.a().a(), 15.00f),n.c(a.a().a(), 11.00f)};
       b uob = new b(this.c.getActivity());
       Object[] objArray = new Object[]{this.b};
       uob.o(this.c.u().getString(R.string.arg_RES_7f1009f4, objArray));
       uob.p(15.00f, this.c.u().getColor(R.color.arg_RES_7f061f81), ointArray);
       uob.a(new b$d(R.string.arg_RES_7f104270, -1, R.color.arg_RES_7f060751));
       uob.l(new LiveSensitiveWordsFragment$c$a$a$a(this));
       uob.q();
       return;
    }
}
