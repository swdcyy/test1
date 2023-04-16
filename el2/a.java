package el2.a;
import lf3.g;
import el2.b;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveSpecialAccountConfigProto$SCLiveSpecialAccountConfigState;
import java.util.Objects;
import eg1.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.j;
import com.kuaishou.livestream.message.nano.LiveSpecialAccountConfigProto$ConfigSwitchItem;
import t02.a0;
import ik1.b0;
import lp3.c;
import lp3.i;
import nq5.a;
import t02.r1;
import b53.b;
import lf3.f;

public final class a implements g	// class@002783
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       b q;
       a0 c2;
       r1 a1;
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, b.class, "3")) {
       }else if(j.h(p0.configSwitchItem)){
          LiveSpecialAccountConfigProto$SCLiveSpecialAccountConfigState configSwitch = p0.configSwitchItem;
          int len = configSwitch.length;
          int i = 0;
          while (i < len) {
             object oobject = configSwitch[i];
             LiveSpecialAccountConfigProto$ConfigSwitchItem configSwitch1 = oobject.configSwitchType;
             if (configSwitch1 != 1) {
                if (configSwitch1 == 2) {
                   q = tb.q;
                   long l = 8;
                   if (q != null) {
                      if (oobject.value != null) {
                         c2 = q.c2;
                         if (c2 != null) {
                            c2.i(1);
                         }
                         tb.s.a(e.class).S0(l);
                      }else {
                         c2 = q.c2;
                         if (c2 != null) {
                            c2.t(1);
                         }
                         tb.s.a(e.class).j1(l);
                      }
                   }
                   q = tb.r;
                   if (q != null) {
                      if (oobject.value != null) {
                         a1 = q.a1;
                         if (a1 != null) {
                            a1.i(1);
                         }
                         tb.s.a(e.class).S0(l);
                      }else {
                         a1 = q.a1;
                         if (a1 != null) {
                            a1.t(1);
                         }
                         tb.s.a(e.class).j1(l);
                      }
                   }
                }
             }else {
                q = tb.q;
                if (q != null) {
                   c2 = q.m1;
                   if (c2 != null) {
                      c2.Hn(oobject.value);
                   }
                }
             }
             i = i + 1;
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
