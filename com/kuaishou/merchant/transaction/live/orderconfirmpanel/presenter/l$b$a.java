package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.l$b$a;
import ml8.d;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;

public class l$b$a implements d	// class@000831
{
    public KwaiImageView b;
    public TextView c;

    public void l$b$a(View p0){
       super();
       this.doBindView(p0);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l$b$a.class, "1")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a134d);
       this.c = m1.f(p0, 0x7f0a3deb);
       return;
    }
}
