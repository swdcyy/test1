package com.kwai.page.component.ComponentStateGraph;
import com.google.common.collect.ImmutableTable$a;
import com.google.common.collect.ImmutableTable;
import com.kwai.page.component.ComponentStateGraph$ComponentState;
import java.lang.Object;
import com.google.common.collect.ImmutableList;
import com.kwai.page.component.ComponentStateGraph$a;
import java.util.List;
import java.util.Iterator;

public class ComponentStateGraph	// class@00103b
{
    public static final ImmutableTable a;

    static {
       ImmutableTable$a uoa = ImmutableTable.builder();
       ComponentStateGraph$ComponentState iNIT = ComponentStateGraph$ComponentState.INIT;
       ComponentStateGraph$ComponentState cREATE = ComponentStateGraph$ComponentState.CREATE;
       uoa.b(iNIT, cREATE, ImmutableList.of(cREATE));
       ComponentStateGraph$ComponentState bIND = ComponentStateGraph$ComponentState.BIND;
       uoa.b(cREATE, bIND, ImmutableList.of(bIND));
       ComponentStateGraph$ComponentState uNBIND = ComponentStateGraph$ComponentState.UNBIND;
       uoa.b(bIND, bIND, ImmutableList.of(uNBIND, bIND));
       uoa.b(uNBIND, bIND, ImmutableList.of(bIND));
       uoa.b(bIND, uNBIND, ImmutableList.of(uNBIND));
       ComponentStateGraph$ComponentState dESTROY = ComponentStateGraph$ComponentState.DESTROY;
       uoa.b(iNIT, dESTROY, ImmutableList.of());
       uoa.b(cREATE, dESTROY, ImmutableList.of(dESTROY));
       uoa.b(bIND, dESTROY, ImmutableList.of(uNBIND, dESTROY));
       uoa.b(uNBIND, dESTROY, ImmutableList.of(dESTROY));
       ComponentStateGraph.a = uoa.a();
    }
    public static boolean a(ComponentStateGraph$ComponentState p0,ComponentStateGraph$ComponentState p1,ComponentStateGraph$a p2){
       List list = ComponentStateGraph.a.get(p0, p1);
       if (list == null) {
          return false;
       }
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          p2.a(iterator.next());
       }
       return true;
    }
}
