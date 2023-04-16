package com.kwai.component.photo.detail.slide.negative.operation.NewPlayerFeedbackPanel$c;
import java.util.Comparator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import mf5.w0;
import java.lang.Integer;
import java.lang.Comparable;
import xrd.b;

public final class NewPlayerFeedbackPanel$c implements Comparator	// class@000a77
{

    public void NewPlayerFeedbackPanel$c(){
       super();
    }
    public final int compare(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, NewPlayerFeedbackPanel$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return b.f(Integer.valueOf(p0.C()), Integer.valueOf(p1.C()));
    }
}
