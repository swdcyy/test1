package kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$dropWhile$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import htd.y;
import asd.c;
import java.lang.Object;
import htd.w;
import qrd.l1;
import csd.b;
import kotlinx.coroutines.channels.ChannelIterator;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.Boolean;
import htd.c0;

public final class ChannelsKt__Channels_commonKt$dropWhile$1 extends SuspendLambda implements p	// class@001951
{
    public final p $predicate;
    public final y $this_dropWhile;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public w p$;

    public void ChannelsKt__Channels_commonKt$dropWhile$1(y p0,p p1,c p2){
       this.$this_dropWhile = p0;
       this.$predicate = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       ChannelsKt__Channels_commonKt$dropWhile$1 uodropWhile$ = new ChannelsKt__Channels_commonKt$dropWhile$1(this.$this_dropWhile, this.$predicate, p1);
       uodropWhile$.p$ = p0;
       return uodropWhile$;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       ChannelsKt__Channels_commonKt$dropWhile$1 uodropWhile$1;
       ChannelIterator obj1;
       ChannelsKt__Channels_commonKt$dropWhile$1 uodropWhile$2;
       ChannelsKt__Channels_commonKt$dropWhile$1 uodropWhile$4;
       c obj = b.h();
       ChannelsKt__Channels_commonKt$dropWhile$1 tlabel = this.label;
       ChannelsKt__Channels_commonKt$dropWhile$1 uodropWhile$ = 3;
       if (tlabel != null) {
          if (tlabel != 1) {
             if (tlabel != 2) {
                if (tlabel != uodropWhile$) {
                   if (tlabel != 4) {
                      if (tlabel == 5) {
                         j0.n(p0);
                         p0 = this.L$2;
                         uodropWhile$1 = this.L$0;
                         obj1 = obj;
                         obj = this;
                      label_00cf :
                         obj.L$0 = uodropWhile$1;
                         obj.L$1 = p0;
                         obj.label = 4;
                         Object obj2 = p0.a(obj);
                         if (obj2 == obj1) {
                            return obj1;
                         }else {
                            uodropWhile$ = p0;
                            p0 = obj2;
                         label_00df :
                            if (p0.booleanValue()) {
                               p0 = uodropWhile$.next();
                               obj.L$0 = uodropWhile$1;
                               obj.L$1 = p0;
                               obj.L$2 = uodropWhile$;
                               obj.label = 5;
                               if (uodropWhile$1.l(p0, obj) == obj1) {
                                  return obj1;
                               }else {
                                  p0 = uodropWhile$;
                                  goto label_00cf ;
                               }
                            }else {
                               return l1.a;
                            }
                         }
                      }else {
                         throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                      }
                   }else {
                      j0.n(p0);
                      uodropWhile$1 = this.L$0;
                      uodropWhile$ = this.L$1;
                      obj1 = obj;
                      obj = this;
                      goto label_00df ;
                   }
                }else {
                   j0.n(p0);
                   uodropWhile$1 = this.L$0;
                   obj1 = obj;
                   uodropWhile$2 = this;
                }
             }else {
                uodropWhile$1 = this.L$0;
                j0.n(p0);
                ChannelsKt__Channels_commonKt$dropWhile$1 uodropWhile$3 = this.L$1;
                uodropWhile$4 = this.L$2;
                obj1 = obj;
                uodropWhile$2 = this;
             label_00af :
                if (!p0.booleanValue()) {
                   uodropWhile$2.L$0 = uodropWhile$1;
                   uodropWhile$2.L$1 = uodropWhile$3;
                   uodropWhile$2.label = uodropWhile$;
                   if (uodropWhile$1.l(uodropWhile$3, uodropWhile$2) == obj1) {
                      return obj1;
                   }
                }else {
                   p0 = uodropWhile$2;
                   obj = obj1;
                   tlabel = uodropWhile$4;
                   uodropWhile$4 = uodropWhile$1;
                label_007c :
                   p0.L$0 = uodropWhile$4;
                   p0.L$1 = tlabel;
                   p0.label = 1;
                   Object obj3 = tlabel.a(p0);
                   if (obj3 == obj) {
                      return obj;
                   }else {
                      uodropWhile$2 = p0;
                      p0 = obj3;
                      uodropWhile$1 = uodropWhile$4;
                      uodropWhile$4 = tlabel;
                      obj1 = obj;
                   label_008f :
                      if (p0.booleanValue()) {
                         p0 = uodropWhile$4.next();
                         uodropWhile$2.L$0 = uodropWhile$1;
                         uodropWhile$2.L$1 = p0;
                         uodropWhile$2.L$2 = uodropWhile$4;
                         uodropWhile$2.label = 2;
                         Object obj4 = uodropWhile$2.$predicate.invoke(p0, uodropWhile$2);
                         if (obj4 == obj1) {
                            return obj1;
                         }else {
                            uodropWhile$3 = p0;
                            p0 = obj4;
                            goto label_00af ;
                         }
                      }
                   }
                }
             }
          }else {
             j0.n(p0);
             uodropWhile$1 = this.L$0;
             uodropWhile$4 = this.L$1;
             obj1 = obj;
             uodropWhile$2 = this;
             goto label_008f ;
          }
       }else {
          j0.n(p0);
          obj1 = this.$this_dropWhile.iterator();
          uodropWhile$4 = this.p$;
          p0 = this;
          goto label_007c ;
       }
       p0 = uodropWhile$2.$this_dropWhile.iterator();
       goto label_00cf ;
    }
}
