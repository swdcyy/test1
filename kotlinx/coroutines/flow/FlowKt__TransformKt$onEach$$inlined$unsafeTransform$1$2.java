package kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2;
import jtd.e;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import java.lang.Object;
import asd.c;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import msd.p;
import qrd.l1;

public final class FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2 implements e	// class@001aa5
{
    public final e b;
    public final FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 c;

    public void FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2(e p0,FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object emit(Object p0,c p1){
       FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 oonEach$$inl;
       FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 l$3;
       FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 l$2;
       FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 l$1;
       FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 l$0;
       if (p1 instanceof FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1) {
          oonEach$$inl = p1;
          FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 label = oonEach$$inl.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             oonEach$$inl.label = label - i;
          label_0018 :
             FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 result = oonEach$$inl.result;
             Object obj = b.h();
             FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 label1 = oonEach$$inl.label;
             FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 oonEach$$inl1 = 1;
             if (label1 != null) {
                if (label1 != oonEach$$inl1) {
                   if (label1 == 2) {
                      j0.n(result);
                   label_009c :
                      return l1.a;
                   }else {
                      throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                   }
                }else {
                   p0 = oonEach$$inl.L$6;
                   label1 = oonEach$$inl.L$5;
                   oonEach$$inl1 = oonEach$$inl.L$4;
                   l$3 = oonEach$$inl.L$3;
                   l$2 = oonEach$$inl.L$2;
                   l$1 = oonEach$$inl.L$1;
                   l$0 = oonEach$$inl.L$0;
                   j0.n(result);
                }
             }else {
                j0.n(result);
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2 tb = this.b;
                oonEach$$inl.L$0 = this;
                oonEach$$inl.L$1 = p0;
                oonEach$$inl.L$2 = oonEach$$inl;
                oonEach$$inl.L$3 = p0;
                oonEach$$inl.L$4 = oonEach$$inl;
                oonEach$$inl.L$5 = p0;
                oonEach$$inl.L$6 = tb;
                oonEach$$inl.label = oonEach$$inl1;
                if (this.c.b.invoke(p0, oonEach$$inl) == obj) {
                   return obj;
                }else {
                   l$0 = this;
                   label1 = p0;
                   l$3 = label1;
                   l$1 = l$3;
                   p0 = tb;
                   oonEach$$inl1 = oonEach$$inl;
                   l$2 = oonEach$$inl1;
                }
             }
             oonEach$$inl.L$0 = l$0;
             oonEach$$inl.L$1 = l$1;
             oonEach$$inl.L$2 = l$2;
             oonEach$$inl.L$3 = l$3;
             oonEach$$inl.L$4 = oonEach$$inl1;
             oonEach$$inl.L$5 = label1;
             oonEach$$inl.L$6 = p0;
             oonEach$$inl.label = 2;
             if (p0.emit(label1, oonEach$$inl) == obj) {
                return obj;
             }else {
                goto label_009c ;
             }
          }
       }
       oonEach$$inl = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1(this, p1);
       goto label_0018 ;
    }
}
