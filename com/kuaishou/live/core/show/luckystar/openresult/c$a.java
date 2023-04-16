package com.kuaishou.live.core.show.luckystar.openresult.c$a;
import k51.c;
import com.kuaishou.live.core.show.luckystar.openresult.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.widget.TextView;
import android.view.View;
import ekd.m1;

public class c$a extends c	// class@000ce4
{
    public TextView p;
    public final c q;
    public static String sLivePresenterClassName = "LiveLuckyStarOpenResultAdapter$LiveLuckyStarOpenResultFooterPresenter";

    public void c$a(c p0){
       this.q = p0;
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "2")) {
          return;
       }
       this.p.setText(this.q.z);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a2131);
       return;
    }
}
