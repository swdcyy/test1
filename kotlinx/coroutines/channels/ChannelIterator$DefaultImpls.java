package kotlinx.coroutines.channels.ChannelIterator$DefaultImpls;
import kotlinx.coroutines.channels.ChannelIterator;
import asd.c;
import java.lang.Object;
import kotlinx.coroutines.channels.ChannelIterator$next0$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.Boolean;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;

public final class ChannelIterator$DefaultImpls	// class@001939
{

    public static Object a(ChannelIterator p0,c p1){
       ChannelIterator$next0$1 onext0$1;
       ChannelIterator$next0$1 l$0;
       if (p1 instanceof ChannelIterator$next0$1) {
          onext0$1 = p1;
          ChannelIterator$next0$1 label = onext0$1.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             onext0$1.label = label - i;
          label_0018 :
             ChannelIterator$next0$1 result = onext0$1.result;
             Object obj = b.h();
             ChannelIterator$next0$1 label1 = onext0$1.label;
             if (label1 != null) {
                if (label1 == 1) {
                   l$0 = onext0$1.L$0;
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                onext0$1.L$0 = p0;
                onext0$1.label = 1;
                result = p0.a(onext0$1);
                if (result == obj) {
                   return obj;
                }
             }
             if (result.booleanValue()) {
                return l$0.next();
             }else {
                throw new ClosedReceiveChannelException("Channel was closed");
             }
          }
       }
       onext0$1 = new ChannelIterator$next0$1(p0, p1);
       goto label_0018 ;
    }
}
