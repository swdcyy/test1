package com.kuaishou.live.ad.fanstop.video.DetailVideoNeoLivePendantController$mAdNeoPendantView$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.ad.fanstop.video.DetailVideoNeoLivePendantController;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoPendantBaseView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import sl0.a;
import java.lang.Enum;
import yx.j0;
import tkd.b;
import tkd.d;
import os5.d;
import android.view.ViewGroup;
import android.content.Context;
import android.view.View;
import i2b.a;
import android.widget.FrameLayout;

public final class DetailVideoNeoLivePendantController$mAdNeoPendantView$2 extends Lambda implements a	// class@0009b5
{
    public final DetailVideoNeoLivePendantController this$0;

    public void DetailVideoNeoLivePendantController$mAdNeoPendantView$2(DetailVideoNeoLivePendantController p0){
       this.this$0 = p0;
       super(0);
    }
    public final LiveAdNeoPendantBaseView invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       DetailVideoNeoLivePendantController$mAdNeoPendantView$2 obj = PatchProxy.apply(objArray, this, DetailVideoNeoLivePendantController$mAdNeoPendantView$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.this$0;
       Objects.requireNonNull(obj);
       View view = PatchProxy.apply(objArray, obj, DetailVideoNeoLivePendantController.class, "7");
       if (view != patchProxyRe) {
       }else {
          int i = a.a[obj.r.ordinal()];
          int i1 = 0x7f0d09c2;
          if (i != 1) {
             if (i != 2) {
                Object[] objArray1 = new Object[0];
                j0.c("DetailVideoNeoLivePendantController", "Illegal pendant scene used", objArray1);
                i = d.a(-2004767397).Rg(3);
             }else {
                i = d.a(-2004767397).Rg(3);
             }
          }else {
             i1 = 0x7f0d09c6;
             i = 0x7f0824e0;
          }
          View view1 = a.d(obj.n, i1, obj.o, 0);
          Objects.requireNonNull(view1, "null cannot be cast to non-null type com.kuaishou.live.ad.fanstop.widget.LiveAdNeoPendantBaseView");
          view = view1;
          view.setBackgroundResource(i);
       }
       return view;
    }
    public Object invoke(){
       return this.invoke();
    }
}
