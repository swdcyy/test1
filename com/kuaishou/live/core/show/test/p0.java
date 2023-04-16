package com.kuaishou.live.core.show.test.p0;
import android.view.View$OnClickListener;
import java.lang.Object;
import android.view.View;
import il2.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import e17.i;
import od2.d;
import o02.e;
import brd.t;
import com.kuaishou.live.core.show.test.x;
import com.kuaishou.live.core.show.test.y;
import erd.g;
import crd.b;

public final class p0 implements View$OnClickListener	// class@0011ba
{
    public static final p0 b;

    static {
       p0.b = new p0();
    }
    public void p0(){
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoid(null, null, j.class, "1")) {
       }else if(j.a == null){
          i.d(R.style.arg_RES_7f110668, "请求接口失败，没有设置liveStreamId参数。需要进入直播间");
       }else {
          e.k().a(j.a, 5, 6).subscribe(x.b, y.b);
       }
       return;
    }
}
