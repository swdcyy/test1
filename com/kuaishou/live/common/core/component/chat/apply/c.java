package com.kuaishou.live.common.core.component.chat.apply.c;
import android.content.DialogInterface$OnClickListener;
import com.kuaishou.live.common.core.component.chat.apply.LiveChatModeChoiceDialogHelper;
import java.lang.String;
import java.lang.Object;
import android.content.DialogInterface;
import java.util.Objects;
import com.kuaishou.live.common.core.component.chat.apply.LiveChatModeChoiceDialogHelper$ChatMode;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import d61.g;
import brd.t;
import com.yxcorp.gifshow.util.PermissionUtils;
import sd1.l;
import erd.g;
import crd.b;

public final class c implements DialogInterface$OnClickListener	// class@001036
{
    public final LiveChatModeChoiceDialogHelper b;
    public final String c;

    public void c(LiveChatModeChoiceDialogHelper p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(DialogInterface p0,int p1){
       c tb = this.b;
       c tc = this.c;
       Objects.requireNonNull(tb);
       LiveChatModeChoiceDialogHelper$ChatMode uChatMode = LiveChatModeChoiceDialogHelper$ChatMode.get(p1);
       if (uChatMode != null && (!PatchProxy.applyVoidTwoRefs(uChatMode, tc, tb, LiveChatModeChoiceDialogHelper.class, "3") && !g.h(tb.a))) {
          PermissionUtils.j(tb.a, uChatMode.mPermissions).subscribe(new l(tb, tc, uChatMode));
       }
    label_0031 :
       return;
    }
}
