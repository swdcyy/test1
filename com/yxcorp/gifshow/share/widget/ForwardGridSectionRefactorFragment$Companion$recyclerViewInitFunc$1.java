package com.yxcorp.gifshow.share.widget.ForwardGridSectionRefactorFragment$Companion$recyclerViewInitFunc$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import xtd.a;
import ytd.c;
import ytd.b;
import lnc.a1;

public final class ForwardGridSectionRefactorFragment$Companion$recyclerViewInitFunc$1 extends Lambda implements l	// class@001cd3
{
    public static final ForwardGridSectionRefactorFragment$Companion$recyclerViewInitFunc$1 INSTANCE;

    static {
       ForwardGridSectionRefactorFragment$Companion$recyclerViewInitFunc$1.INSTANCE = new ForwardGridSectionRefactorFragment$Companion$recyclerViewInitFunc$1();
    }
    public void ForwardGridSectionRefactorFragment$Companion$recyclerViewInitFunc$1(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardGridSectionRefactorFragment$Companion$recyclerViewInitFunc$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.setLayoutManager(new LinearLayoutManager(p0.getContext(), 0, 0));
       a uoa = new a(new c(p0), 0x3fc00000, 0x3f000000, -3.00f);
       p0.setPadding(a1.d(R.dimen.pv), 0, a1.d(R.dimen.pv), 0);
       p0.setClipToPadding(0);
       return;
    }
}
