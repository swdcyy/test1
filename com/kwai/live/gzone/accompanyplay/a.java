package com.kwai.live.gzone.accompanyplay.a;
import y8c.g;
import io.reactivex.subjects.PublishSubject;
import j47.c;
import java.lang.String;
import java.lang.Object;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import i2b.a;
import com.kwai.live.gzone.accompanyplay.a$b;
import ml8.c;

public class a extends g	// class@000aef
{
    public static final int w;

    public void a(PublishSubject p0,c p1){
       super();
       this.n1("KEY_ITEM_CLICK_EVENT", p0);
       this.n1("KEY_BRIDGE_SERVICE", p1);
    }
    public f h1(ViewGroup p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(a.k(p0, 0x7f0d0b6a, false), new a$b());
    }
}
