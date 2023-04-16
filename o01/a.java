package o01.a;
import lf3.g;
import o01.d;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCLiveGiftPanelRefresh;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.gift.gift.p;
import java.util.List;
import com.kuaishou.android.live.log.b;
import com.kwai.framework.model.user.QCurrentUser;
import java.util.Random;
import crd.b;
import lnc.b9;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import o01.b;
import erd.g;
import o01.c;
import lf3.f;

public final class a implements g	// class@003444
{
    public final d b;

    public void a(d p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, d.class, "4")) {
       }else if(p.c()){
          b.P(tb.p, "[handleGiftPanelUpdateMessage], enableRefreshGiftPanelGiftOut");
       }else if(p0 == null){
          b.P(tb.p, "[handleGiftPanelUpdateMessage], msg == null");
       }else if(!QCurrentUser.me().isLogined()){
          b.P(tb.p, "[handleGiftPanelUpdateMessage], not login");
       }else {
          long l = 0;
          if (p0.giftPanelMaxDelayMills - l > 0) {
             l = (long)new Random().nextInt((int)p0.giftPanelMaxDelayMills);
          }
          SCLiveGiftPanelRefresh enableRefres = p0.enableRefreshPanelUi;
          SCLiveGiftPanelRefresh refreshTab = p0.refreshTab;
          if (refreshTab == 1) {
             b9.a(tb.r);
             tb.r = t.timer(l, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new b(tb, enableRefres, p0));
          }else if(refreshTab == 99){
             b9.a(tb.r);
             tb.r = t.timer(l, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new c(tb, enableRefres, p0));
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
