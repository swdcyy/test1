package com.yxcorp.gifshow.message.krn.KSIMBridge$createPublicGroup$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import java.lang.Object;
import com.kwai.imsdk.group.KwaiGroupCreateResponse;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.krn.c;
import com.yxcorp.gifshow.message.krn.KSIMBridge;
import java.util.Objects;
import android.app.Activity;
import tkd.b;
import tkd.d;
import pu5.a;
import kotlin.jvm.internal.a;
import qu5.r;

public final class KSIMBridge$createPublicGroup$1 extends Lambda implements l	// class@001d70
{
    public final RxFragmentActivity $activity;

    public void KSIMBridge$createPublicGroup$1(RxFragmentActivity p0){
       this.$activity = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(KwaiGroupCreateResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSIMBridge$createPublicGroup$1.class, "1")) {
          return;
       }
       Objects.requireNonNull(KSIMBridge.Companion);
       c.b().l(KSIMBridge.GROUP_CREATE_SUCCESS, null);
       this.$activity.finish();
       a.o(p0, "it");
       d.a(-1497343380).vD(this.$activity, 4, p0.getGroupId());
       return;
    }
}
