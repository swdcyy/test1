package com.kwai.performance.fluency.startup.scheduler.debug.render.ClassesUmlRenderer$getDependencies$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import of7.a;
import nf7.b;
import com.kwai.performance.fluency.startup.scheduler.task.base.DependencyTask;
import java.lang.CharSequence;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.List;
import java.lang.StringBuilder;
import java.util.NoSuchElementException;

public final class ClassesUmlRenderer$getDependencies$1 extends Lambda implements l	// class@0010e5
{
    public final b $this_getDependencies;
    public final a this$0;

    public void ClassesUmlRenderer$getDependencies$1(a p0,b p1){
       this.this$0 = p0;
       this.$this_getDependencies = p1;
       super(1);
    }
    public final CharSequence invoke(DependencyTask p0){
       a a;
       String str;
       a.q(p0, "dependencyTask");
       a = this.this$0.a;
       if (a == null) {
          a.S("mUmlTaskItems");
       }
       Iterator iterator = a.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             throw new NoSuchElementException("Collection contains no element matching the predicate.");
          }
          Object obj = iterator.next();
          if (a.g(obj.a(), p0)) {
             str = (obj.h != null && (this.$this_getDependencies.h != null && (a.e(this.this$0, obj.a(), this.$this_getDependencies.a(), null, 4, null) && a.e(this.this$0, this.$this_getDependencies.a(), obj.a(), null, 4, null))))? this.$this_getDependencies.a().name()+" --> "+p0.name()+"#line:red;line.dashed;text:red : circle dependency": this.$this_getDependencies.a().name()+" --> "+p0.name();
             break ;
          }
       }
       return str;
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
