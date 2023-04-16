package kotlinx.coroutines.selects.WhileSelectKt;
import msd.l;
import asd.c;
import java.lang.Object;
import kotlinx.coroutines.selects.WhileSelectKt$whileSelect$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import otd.b;
import java.lang.Throwable;
import dsd.e;
import java.lang.Boolean;
import qrd.l1;
import nsd.c0;

public final class WhileSelectKt	// class@001b49
{

    public static final Object a(l p0,c p1){
       WhileSelectKt$whileSelect$1 owhileSelect;
       WhileSelectKt$whileSelect$1 l$0;
       if (p1 instanceof WhileSelectKt$whileSelect$1) {
          owhileSelect = p1;
          WhileSelectKt$whileSelect$1 label = owhileSelect.label;
          int i = Integer.MIN_VALUE;
          int i1 = label & i;
          if (i1) {
             int i2 = label - i;
             owhileSelect.label = i2;
          label_0018 :
             WhileSelectKt$whileSelect$1 result = owhileSelect.result;
             Object obj = b.h();
             WhileSelectKt$whileSelect$1 label1 = owhileSelect.label;
             if (label1 != null) {
                if (label1 == 1) {
                   l$0 = owhileSelect.L$0;
                   j0.n(result);
                label_0059 :
                   if (!result.booleanValue()) {
                      return l1.a;
                   }
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
             }
             owhileSelect.L$0 = l$0;
             owhileSelect.label = 1;
             b uob = new b(owhileSelect);
             l$0.invoke(uob);
             result = uob.h0();
             if (result == b.h()) {
                e.c(owhileSelect);
             }
             if (result == obj) {
                return obj;
             }else {
                goto label_0059 ;
             }
          }
       }
       owhileSelect = new WhileSelectKt$whileSelect$1(p1);
       goto label_0018 ;
    }
    public static final Object b(l p0,c p1){
       Object obj;
       do {
          c0.e(0);
          b uob = new b(p1);
          p0.invoke(uob);
          obj = uob.h0();
          if (obj == b.h()) {
             e.c(p1);
          }
          c0.e(1);
       } while (obj.booleanValue());
       return l1.a;
    }
}
