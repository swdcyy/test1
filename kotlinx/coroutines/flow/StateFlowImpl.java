package kotlinx.coroutines.flow.StateFlowImpl;
import jtd.i;
import ktd.g;
import java.lang.Object;
import jtd.m;
import kotlin.coroutines.CoroutineContext;
import ktd.b;
import jtd.d;
import jtd.e;
import asd.c;
import kotlinx.coroutines.flow.StateFlowImpl$collect$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import kotlin.jvm.internal.a;
import ktd.j;
import java.util.Arrays;
import qrd.l1;

public final class StateFlowImpl implements i, g	// class@001b03
{
    public Object _state;
    public int a;
    public m[] b;
    public int c;
    public int d;

    public void StateFlowImpl(Object p0){
       super();
       this._state = p0;
       p0 = new m[2];
       this.b = p0;
    }
    public static void e(){
    }
    public g a(CoroutineContext p0,int p1){
       b uob = (p1 != -1 && p1)? new b(this, p0, p1): this;
       return uob;
    }
    public Object b(e p0,c p1){
       StateFlowImpl$collect$1 uocollect$1;
       StateFlowImpl$collect$1 l$0;
       StateFlowImpl$collect$1 uocollect$11;
       StateFlowImpl$collect$1 uocollect$12;
       StateFlowImpl stateFlowImp1;
       if (p1 instanceof StateFlowImpl$collect$1) {
          uocollect$1 = p1;
          StateFlowImpl$collect$1 label = uocollect$1.label;
          int i = Integer.MIN_VALUE;
          int i1 = label & i;
          if (i1) {
             int i2 = label - i;
             uocollect$1.label = i2;
          label_0018 :
             StateFlowImpl$collect$1 result = uocollect$1.result;
             Object obj = b.h();
             StateFlowImpl$collect$1 label1 = uocollect$1.label;
             if (label1 != null) {
                if (label1 != 1) {
                   if (label1 == 2) {
                      label1 = uocollect$1.L$2;
                      l$0 = uocollect$1.L$0;
                      j0.n(result);
                      result = uocollect$1.L$3;
                      uocollect$11 = uocollect$1.L$1;
                   }else {
                      throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                   }
                }else {
                   stateFlowImp1 = uocollect$1.L$4;
                   label1 = uocollect$1.L$2;
                   uocollect$12 = uocollect$1.L$1;
                   l$0 = uocollect$1.L$0;
                   j0.n(result);
                label_008b :
                   result = stateFlowImp1;
                   uocollect$11 = uocollect$12;
                   uocollect$12 = result;
                label_008e :
                   if (!label1.e()) {
                      uocollect$1.L$0 = l$0;
                      uocollect$1.L$1 = uocollect$11;
                      uocollect$1.L$2 = label1;
                      uocollect$1.L$3 = result;
                      uocollect$1.L$4 = uocollect$12;
                      uocollect$1.label = 2;
                      if (label1.b(uocollect$1) == obj) {
                         return obj;
                      }
                   }
                }
             }else {
                j0.n(result);
                l$0 = this;
                m om = this.c();
                result = null;
             }
             StateFlowImpl _state = l$0._state;
             if (result != null) {
                int i3 = a.g(_state, result) ^ 1;
                if (!i3) {
                }
             }
             StateFlowImpl stateFlowImp = (_state == j.a)? null: _state;
             uocollect$1.L$0 = l$0;
             uocollect$1.L$1 = uocollect$11;
             uocollect$1.L$2 = label1;
             uocollect$1.L$3 = result;
             uocollect$1.L$4 = _state;
             uocollect$1.label = 1;
             if (uocollect$11.emit(stateFlowImp, uocollect$1) == obj) {
                return obj;
             }else {
                uocollect$12 = uocollect$11;
                stateFlowImp1 = _state;
                goto label_008b ;
             }
          }
       }
       uocollect$1 = new StateFlowImpl$collect$1(this, p1);
       goto label_0018 ;
    }
    public final m c(){
       object oobject;
       int i;
       _monitor_enter(this);
       StateFlowImpl tb = this.b;
       int len = tb.length;
       if (this.c >= len) {
          Object[] objArray = Arrays.copyOf(tb, (len * 2));
          a.h(objArray, "java.util.Arrays.copyOf\(this, newSize\)");
          this.b = objArray;
       }
       tb = this.d;
       do {
          oobject = this.b[tb];
          if (oobject == null) {
             oobject = new m();
             this.b[tb] = oobject;
          }
          i = tb + 1;
          if (i >= this.b.length) {
             i = 0;
          }
       } while (oobject.a());
       this.d = i;
       this.c = this.c + 1;
       _monitor_exit(this);
       return oobject;
    }
    public final void d(m p0){
       _monitor_enter(this);
       p0.c();
       this.c = this.c - 1;
       _monitor_exit(this);
    }
    public Object getValue(){
       StateFlowImpl t_state = this._state;
       if (t_state == j.a) {
          t_state = null;
       }
       return t_state;
    }
    public void setValue(Object p0){
       int len;
       int i;
       if (p0 != null) {
       }else {
          p0 = j.a;
       }
       _monitor_enter(this);
       if (a.g(this._state, p0)) {
          _monitor_exit(this);
          return;
       }else {
          this._state = p0;
          p0 = this.a;
          if (!(p0 & 0x01)) {
             p0++;
             this.a = p0;
             StateFlowImpl tb = this.b;
             _monitor_exit(this);
             while (true) {
                len = tb.length;
                i = 0;
                break ;
             }
             while (i < len) {
                object oobject = tb[i];
                if (oobject != null) {
                   oobject.d();
                }
                i = i + 1;
             }
             _monitor_enter(this);
             tb = this.a;
             if (tb == p0) {
                p0++;
                this.a = p0;
                _monitor_exit(this);
                return;
             }else {
                _monitor_exit(this);
                tb = this.b;
                p0 = tb;
             }
          }else {
             this.a = p0 + 2;
             _monitor_exit(this);
             return;
          }
       }
    }
}
