package com.yxcorp.gifshow.v3.bubble.h;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.bubble.i;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import com.yxcorp.gifshow.v3.bubble.EditBubbleItem;
import android.view.View;
import java.lang.Object;
import java.util.Objects;
import faa.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import com.yxcorp.gifshow.bubble.b;
import ra9.c;
import com.yxcorp.gifshow.v3.bubble.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.v3.bubble.a;
import com.yxcorp.gifshow.bubble.b$b;
import com.yxcorp.gifshow.bubble.a;
import com.yxcorp.gifshow.bubble.PostBubbleManager;

public final class h implements Runnable	// class@000d37
{
    public final i b;
    public final EditorItemFunc c;
    public final EditBubbleItem d;
    public final int e;
    public final View f;

    public void h(i p0,EditorItemFunc p1,EditBubbleItem p2,int p3,View p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void run(){
       h tb = this.b;
       h te = this.e;
       h tf = this.f;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       a.D().s("BubbleTipPresenter", "initScrollListener model: "+this.c, objArray);
       b uob = new b(this.d);
       if (te != null) {
          i b = tb.b;
          Objects.requireNonNull(b);
          if (!PatchProxy.isSupport(d.class) || !PatchProxy.applyVoidThreeRefs(tf, uob, Integer.valueOf(te), b, d.class, "9")) {
             Object[] objArray1 = new Object[0];
             a.D().s("BubbleTipPresenter", "showRelayItemBubble bubbleInfo: "+uob, objArray1);
             if (b.getActivity() == null) {
                Object[] objArray2 = new Object[0];
                a.D().s("BubbleTipPresenter", "showRelayItemBubble getActivity\(\) is null, can\'t show bubble.", objArray2);
             }else {
                uob.b(tf);
                uob.k(new a(tf, te, uob));
             }
          }
       }
       tb.b.A.n(uob);
       return;
    }
}
