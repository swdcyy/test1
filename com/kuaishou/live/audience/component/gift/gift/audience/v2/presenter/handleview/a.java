package com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.handleview.a;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.handleview.LiveAudienceGiftBoxHandleView;
import java.lang.Object;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import uz0.p;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.handleview.a$a;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.handleview.a$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import vz0.d;
import cl1.b;
import android.database.Observable;
import java.lang.Boolean;
import com.kuaishou.android.live.log.b;

public class a	// class@000b47
{
    public final List a;
    public int b;
    public LiveAudienceGiftBoxHandleView c;
    public d d;
    public final p e;
    public final d$a f;
    public final View$OnClickListener g;

    public void a(LiveAudienceGiftBoxHandleView p0){
       super();
       this.a = LiveLogTag.GIFT.appendTag("LiveGiftBoxHandleButton");
       this.b = 0;
       this.e = new p();
       this.f = new a$a(this);
       this.g = new a$b(this);
       this.c = p0;
    }
    public int a(){
       Object obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.d.b();
    }
    public void b(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "13")) {
          return;
       }
       this.e.registerObserver(p0);
       return;
    }
    public void c(boolean p0,String p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "6")) {
          return;
       }
       b.T(this.a, "[LiveAudienceGiftBoxHandleViewController][show]", "from", p1, "enable", Boolean.valueOf(p0));
       this.c.setEnabled(p0);
       this.d.f(p0);
       return;
    }
}
