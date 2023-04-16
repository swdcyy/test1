package com.kuaishou.live.audience.component.gift.gift.LiveGiftReceiverListDialog$a;
import gka.h;
import com.kuaishou.live.audience.component.gift.gift.LiveGiftReceiverListDialog;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import mkc.b;
import android.view.View;
import mkc.c;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import java.lang.Throwable;
import az0.m;
import android.view.View$OnClickListener;

public class LiveGiftReceiverListDialog$a extends h	// class@000ae3
{
    public final LiveGiftReceiverListDialog a;

    public void LiveGiftReceiverListDialog$a(LiveGiftReceiverListDialog p0){
       this.a = p0;
       super();
    }
    public void d(boolean p0){
       LiveGiftReceiverListDialog$a uoa = LiveGiftReceiverListDialog$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "3")) {
          return;
       }
       this.f();
       this.j();
       this.a.C.setVisibility(0);
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, LiveGiftReceiverListDialog$a.class, "2")) {
          return;
       }
       b[] uobArray = new b[]{b.i};
       c.d(this.a.D, uobArray);
       return;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, LiveGiftReceiverListDialog$a.class, "1")) {
          return;
       }
       KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
       uoa.h(R.string.arg_RES_7f103973);
       c.e(this.a.D, b.i, uoa);
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, LiveGiftReceiverListDialog$a.class, "6")) {
          return;
       }
       b[] uobArray = new b[]{b.g};
       c.d(this.a.D, uobArray);
       return;
    }
    public void k(boolean p0,Throwable p1){
       LiveGiftReceiverListDialog$a uoa = LiveGiftReceiverListDialog$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "5")) {
          return;
       }
       KwaiEmptyStateView$a uoa1 = KwaiEmptyStateView.e();
       uoa1.h(R.string.arg_RES_7f103988);
       uoa1.p(new m(this));
       c.e(this.a.D, b.g, uoa1);
       return;
    }
    public void x(){
       if (PatchProxy.applyVoid(null, this, LiveGiftReceiverListDialog$a.class, "4")) {
          return;
       }
       this.a.C.setVisibility(8);
       return;
    }
}
