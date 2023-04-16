package com.kuaishou.live.core.show.luckystar.v2.luckyuser.a$a;
import k51.c;
import com.kuaishou.live.core.show.luckystar.v2.luckyuser.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.widget.TextView;
import android.view.View;
import ekd.m1;

public class a$a extends c	// class@000d00
{
    public TextView p;
    public final a q;
    public static String sLivePresenterClassName = "LiveLuckyStarLuckyUserAdapter$FooterItemPresenter";

    public void a$a(a p0){
       this.q = p0;
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "2")) {
          return;
       }
       this.p.setText(this.q.y);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a2131);
       return;
    }
}
