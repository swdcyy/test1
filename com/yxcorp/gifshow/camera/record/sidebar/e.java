package com.yxcorp.gifshow.camera.record.sidebar.e;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.sidebar.g;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.camera.record.base.d;
import com.yxcorp.gifshow.camera.record.base.b;
import nh9.a;
import com.yxcorp.gifshow.camera.record.sidebar.j;
import com.yxcorp.gifshow.camera.bubble.b;
import com.yxcorp.gifshow.camera.bubble.RecordBubbleItem;
import ra9.c;
import android.view.View;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import zg9.f;
import com.yxcorp.gifshow.bubble.b$c;
import com.yxcorp.gifshow.camera.record.sidebar.d;
import com.yxcorp.gifshow.camera.bubble.b$c;
import com.yxcorp.gifshow.bubble.a;
import com.yxcorp.gifshow.bubble.PostBubbleManager;

public final class e implements Runnable	// class@000f14
{
    public final g b;

    public void e(g p0){
       this.b = p0;
    }
    public final void run(){
       e tb = this.b;
       Objects.requireNonNull(tb);
       g og = g.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, tb, og, "8");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): a.a(tb.d) ^ 0x01;
       if (!b || (!PatchProxy.applyVoid(objArray, tb, og, "6") && (tb.w != null && tb.Q != null))) {
          b uob = new b(RecordBubbleItem.SIDEBAR_FOLD_BTN).n(tb.w);
          uob.y(BubbleInterface$Position.LEFT);
          uob.s(R.layout.arg_RES_7f0d0144);
          uob = uob.A(R.string.arg_RES_7f1041e2).z(new f(tb));
          uob.v(d.a);
          tb.Q.n(uob);
       }
    label_0066 :
       return;
    }
}
