package com.kuaishou.live.core.show.luckystar.openresult.c$b;
import k51.c;
import com.kuaishou.live.core.show.luckystar.openresult.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import g9c.a;
import java.util.List;
import lnc.a1;
import java.lang.CharSequence;
import android.widget.TextView;
import android.view.View;
import ekd.m1;

public class c$b extends c	// class@000ce5
{
    public TextView p;
    public final c q;
    public static String sLivePresenterClassName = "LiveLuckyStarOpenResultAdapter$LiveLuckyStarOpenResultHeaderPresenter";

    public void c$b(c p0){
       this.q = p0;
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c$b.class, "2")) {
          return;
       }
       c$b tp = this.p;
       int i = 0x7f102638;
       c$b tq = this.q;
       c y = tq.y;
       if (y <= null) {
          y = tq.e.size();
       }
       tp.setText(a1.q(i, y));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a2132);
       return;
    }
}
