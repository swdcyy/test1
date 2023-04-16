package com.kuaishou.live.common.core.component.admin.sensitivewords.LiveSensitiveWordsFragment$c$a$a$a;
import android.content.DialogInterface$OnClickListener;
import com.kuaishou.live.common.core.component.admin.sensitivewords.LiveSensitiveWordsFragment$c$a$a;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.live.common.core.component.admin.sensitivewords.LiveSensitiveWordsFragment$c$a;
import com.kuaishou.live.common.core.component.admin.sensitivewords.LiveSensitiveWordsFragment$c;
import com.kuaishou.live.common.core.component.admin.sensitivewords.LiveSensitiveWordsFragment;
import g9c.a;
import cb1.c;
import cb1.b;
import brd.t;
import erd.g;
import io.reactivex.internal.functions.Functions;
import sfc.a;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import crd.b;

public class LiveSensitiveWordsFragment$c$a$a$a implements DialogInterface$OnClickListener	// class@000f48
{
    public final LiveSensitiveWordsFragment$c$a$a b;

    public void LiveSensitiveWordsFragment$c$a$a$a(LiveSensitiveWordsFragment$c$a$a p0){
       this.b = p0;
       super();
    }
    public void onClick(DialogInterface p0,int p1){
       if (PatchProxy.isSupport(LiveSensitiveWordsFragment$c$a$a$a.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LiveSensitiveWordsFragment$c$a$a$a.class, "1")) {
          return;
       }
       p0.dismiss();
       if (p1 == 0x7f104270) {
          LiveSensitiveWordsFragment$c$a$a$a tb = this.b;
          tb.c.i.w.s.T0(tb.b);
          b.b().k(this.b.c.i.w.ch(), this.b.b).subscribe(Functions.d(), new a(a.a().a()));
       }
       return;
    }
}
