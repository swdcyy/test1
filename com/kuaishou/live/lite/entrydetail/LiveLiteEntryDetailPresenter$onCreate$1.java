package com.kuaishou.live.lite.entrydetail.LiveLiteEntryDetailPresenter$onCreate$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.entrydetail.LiveLiteEntryDetailPresenter;
import eq3.d;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import va3.g;
import kotlin.jvm.internal.a;
import xp5.i;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService;
import e93.b;
import or5.d;
import com.kuaishou.live.viewcontroller.ViewController;

public final class LiveLiteEntryDetailPresenter$onCreate$1 extends Lambda implements a	// class@0008e0
{
    public final d $viewControllerManager;
    public final LiveLiteEntryDetailPresenter this$0;

    public void LiveLiteEntryDetailPresenter$onCreate$1(LiveLiteEntryDetailPresenter p0,d p1){
       this.this$0 = p0;
       this.$viewControllerManager = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, LiveLiteEntryDetailPresenter$onCreate$1.class, "1")) {
          return;
       }
       LiveLiteEntryDetailPresenter$onCreate$1 t$viewContro = this.$viewControllerManager;
       LiveLiteEntryDetailPresenter v = this.this$0.v;
       if (v == null) {
          a.S("liteGestureService");
       }
       LiveLiteEntryDetailPresenter x = this.this$0.x;
       if (x == null) {
          a.S("liteEnterService");
       }
       i oi = LiveLiteEntryDetailPresenter.c9(this.this$0);
       LiveLiteEntryDetailPresenter z = this.this$0.z;
       if (z == null) {
          a.S("infoService");
       }
       t$viewContro.xg(new g(v, x, oi, z));
       return;
    }
}
