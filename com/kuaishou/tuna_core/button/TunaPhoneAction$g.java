package com.kuaishou.tuna_core.button.TunaPhoneAction$g;
import u07.u;
import com.kuaishou.tuna_core.button.TunaPhoneAction;
import com.kuaishou.tuna_core.network.response.TunaVirtualPhoneResponse$AuthItem;
import com.kuaishou.tuna_core.network.response.TunaVirtualPhoneResponse$AuthInfo;
import java.lang.String;
import kotlin.jvm.internal.Ref$ObjectRef;
import msd.a;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuffer;
import java.util.Objects;
import wkd.b;
import e05.a;
import brd.t;
import uz4.c;
import uz4.d;
import erd.g;
import crd.b;

public final class TunaPhoneAction$g implements u	// class@0010a7
{
    public final TunaPhoneAction b;
    public final TunaVirtualPhoneResponse$AuthItem c;
    public final TunaVirtualPhoneResponse$AuthInfo d;
    public final String e;
    public final Ref$ObjectRef f;
    public final a g;

    public void TunaPhoneAction$g(TunaPhoneAction p0,TunaVirtualPhoneResponse$AuthItem p1,TunaVirtualPhoneResponse$AuthInfo p2,String p3,Ref$ObjectRef p4,a p5){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       super();
    }
    public final void a(t p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TunaPhoneAction$g.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "<anonymous parameter 1>");
       TunaVirtualPhoneResponse$AuthItem mItemScene = this.c.mItemScene;
       a.o(mItemScene, "authItem.mItemScene");
       TunaVirtualPhoneResponse$AuthInfo mButtonText = this.d.mButtonText;
       a.o(mButtonText, "authInfo.mButtonText");
       this.b.g(mItemScene, mButtonText);
       TunaPhoneAction$g tb = this.b;
       TunaPhoneAction$g te = this.e;
       mItemScene = this.c.mItemScene;
       String str = this.f.element;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidThreeRefs(te, mItemScene, str, tb, TunaPhoneAction.class, "13")) {
          b.a(-93866330).a(te, "mobile", mItemScene, str).subscribe(c.b, d.b);
       }
       this.g.invoke();
       return;
    }
}
