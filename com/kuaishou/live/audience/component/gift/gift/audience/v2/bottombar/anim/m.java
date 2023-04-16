package com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.m;
import lf3.g;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.o;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveCapsuleGiftRedDotNotice;
import java.util.Objects;
import java.lang.StringBuilder;
import java.lang.String;
import va1.l0;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Integer;
import pp.c;
import com.kuaishou.android.live.log.b;
import gz0.a0;
import lnc.c3$a;
import lnc.c3;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.lifecycle.LiveData;
import android.view.View;
import com.yxcorp.utility.n;
import lf3.f;

public final class m implements g	// class@000b13
{
    public final o b;

    public void m(o p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       LiveCapsuleGiftRedDotNotice noticeType;
       boolean b;
       boolean b1;
       m tb = this.b;
       Objects.requireNonNull(tb);
       l0.n("收到免费人气票信令，type="+p0.noticeType);
       b.c0(LiveLogTag.FANS_GROUP, "receive free ticket red dot msg", "noticeType", Integer.valueOf(p0.noticeType));
       c3.c(tb.h, new a0(p0));
       noticeType = p0.noticeType;
       if (noticeType == null) {
       }else if(noticeType == 2){
          tb.a();
          tb.b(false);
       }else {
          b = true;
          tb.b(b);
          o oo = o.class;
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, tb, oo, "5")) {
             Object obj = PatchProxy.apply(objArray, tb, oo, "7");
             if (obj != PatchProxyResult.class) {
                b1 = obj.booleanValue();
             }else {
                oo = tb.f;
                b1 = (oo != null && oo.getValue() != null)? tb.f.getValue().booleanValue(): false;
             }
             if (!b1) {
                View[] viewArray = new View[b];
                viewArray[0] = tb.d;
                n.Z(false, viewArray);
             }
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
