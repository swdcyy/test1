package com.yxcorp.gifshow.camera.record.photo.d;
import yb9.b$a;
import com.yxcorp.gifshow.camera.record.photo.e;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.base.d;
import oc9.w;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.bubble.b;
import com.yxcorp.gifshow.camera.bubble.RecordBubbleItem;
import ra9.c;
import android.view.View;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import hg9.f;
import com.yxcorp.gifshow.bubble.b$c;
import com.yxcorp.gifshow.camera.record.photo.c;
import com.yxcorp.gifshow.camera.bubble.b$c;
import com.yxcorp.gifshow.bubble.a;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import com.yxcorp.gifshow.camera.bubble.c;

public final class d implements b$a	// class@000ea6
{
    public final e a;

    public void d(e p0){
       this.a = p0;
    }
    public final void onAnimationEnd(){
       d ta = this.a;
       if (ta.d.b().x2() && ta.o != null) {
          b uob = new b(RecordBubbleItem.HD_TAKE_PICTURE).n(ta.o).A(R.string.arg_RES_7f104bf5);
          uob.q(5000);
          uob.y(BubbleInterface$Position.LEFT);
          uob.s(R.layout.arg_RES_7f0d0144);
          uob = uob.z(new f(ta));
          uob.v(c.a);
          ta.y.n(uob);
       }
       ta.y.u(RecordBubbleItem.HD_TAKE_PICTURE);
       return;
    }
}
