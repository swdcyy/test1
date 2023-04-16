package com.kuaishou.live.common.core.component.highfrequency.textdescription.HighFluencyAnimHandler;
import com.kuaishou.livestream.message.nano.HighFrequencyActionGuide$TextDescription;
import z1.a;
import java.lang.Object;
import android.os.Handler;
import java.util.Deque;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import an1.a;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.highfrequency.textdescription.HighFluencyAnimHandler$AnimType;
import java.util.LinkedList;
import com.kwai.robust.PatchProxyResult;

public class HighFluencyAnimHandler	// class@00133f
{
    public final HighFrequencyActionGuide$TextDescription a;
    public final a b;
    public final Handler c;

    public void HighFluencyAnimHandler(HighFrequencyActionGuide$TextDescription p0,a p1){
       super();
       this.c = new Handler();
       this.a = p0;
       this.b = p1;
    }
    public final void a(Deque p0,Deque p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HighFluencyAnimHandler.class, "3")) {
          return;
       }
       if (!p1.isEmpty() && !p0.isEmpty()) {
          Integer integer = p1.removeFirst();
          a uoa = new a(this, p0.removeFirst(), integer, p0, p1);
          this.c.postDelayed(v8, (long)integer.intValue());
       }
       return;
    }
    public void b(){
       LinkedList linkedList1;
       HighFluencyAnimHandler highFluencyA = HighFluencyAnimHandler.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, highFluencyA, "1")) {
          return;
       }
       this.c.removeCallbacksAndMessages(objArray);
       HighFluencyAnimHandler ta = this.a;
       HighFluencyAnimHandler$AnimType random = (ta.animType == 2)? HighFluencyAnimHandler$AnimType.Random: HighFluencyAnimHandler$AnimType.Uniform;
       LinkedList linkedList = random.computeSteps(ta.startCount, ta.endCount, ta.steps);
       HighFluencyAnimHandler ta1 = this.a;
       HighFrequencyActionGuide$TextDescription animDuration = ta1.animDurationMs;
       HighFrequencyActionGuide$TextDescription steps = ta1.steps;
       if (PatchProxy.isSupport(highFluencyA)) {
          linkedList1 = PatchProxy.applyFourRefs(random, Integer.valueOf(0), Integer.valueOf(animDuration), Integer.valueOf(steps), this, HighFluencyAnimHandler.class, "2");
          if (linkedList1 != PatchProxyResult.class) {
          }else {
          label_0051 :
             linkedList1 = random.computeSteps(0, animDuration, steps);
             int i = 1;
             if (steps > i) {
                int i1 = linkedList1.size() - i;
                while (i1 > 0) {
                   int i2 = i1 - 1;
                   i = linkedList1.get(i1).intValue() - linkedList1.get(i2).intValue();
                   linkedList1.set(i1, Integer.valueOf(i));
                   i1 = i2;
                }
                linkedList1.set(0, Integer.valueOf((linkedList1.get(0).intValue() - 0)));
             }
          }
       }else {
          goto label_0051 ;
       }
       this.a(linkedList, linkedList1);
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, HighFluencyAnimHandler.class, "4")) {
          return;
       }
       this.c.removeCallbacksAndMessages(null);
       return;
    }
}
