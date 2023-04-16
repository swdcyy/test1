package com.yxcorp.gifshow.share.widget.MerchantForwardFragment$Companion$recyclerViewInitFunc$1;
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
import com.yxcorp.utility.n;

public final class MerchantForwardFragment$Companion$recyclerViewInitFunc$1 extends Lambda implements l	// class@001d0d
{
    public static final MerchantForwardFragment$Companion$recyclerViewInitFunc$1 INSTANCE;

    static {
       MerchantForwardFragment$Companion$recyclerViewInitFunc$1.INSTANCE = new MerchantForwardFragment$Companion$recyclerViewInitFunc$1();
    }
    public void MerchantForwardFragment$Companion$recyclerViewInitFunc$1(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantForwardFragment$Companion$recyclerViewInitFunc$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.setLayoutManager(new LinearLayoutManager(p0.getContext(), 0, 0));
       a uoa = new a(new c(p0), 0x3fc00000, 0x3f000000, -3.00f);
       p0.setPadding(n.c(p0.getContext(), 5.00f), 0, n.c(p0.getContext(), 5.00f), 0);
       p0.setClipToPadding(0);
       return;
    }
}
