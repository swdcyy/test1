package com.yxcorp.gifshow.v3.bubble.a;
import com.yxcorp.gifshow.bubble.b$b;
import android.view.View;
import com.yxcorp.gifshow.bubble.b;
import java.lang.Object;
import com.yxcorp.gifshow.widget.popup.a;
import poc.f;
import com.kwai.library.widget.popup.common.PopupInterface$b;
import com.kwai.library.widget.popup.common.c$b;
import poc.g;
import com.kwai.library.widget.popup.common.PopupInterface$f;

public final class a implements b$b	// class@000d2c
{
    public final View a;
    public final int b;
    public final b c;

    public void a(View p0,int p1,b p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void a(a p0){
       p0.G(new f(this.a));
       p0.L(new g(this.b, this.c));
    }
}
