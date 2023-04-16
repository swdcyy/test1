package com.yxcorp.plugin.setting.helper.PushOptionSelectGroup$a;
import erd.g;
import com.yxcorp.plugin.setting.helper.PushOptionSelectGroup;
import xgc.e;
import com.yxcorp.gifshow.model.SelectOption;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import wgc.c;
import wgc.a;
import kotlin.jvm.internal.a;
import wgc.d;
import android.view.View;
import com.yxcorp.gifshow.model.SwitchItem;

public final class PushOptionSelectGroup$a implements g	// class@0008b1
{
    public final PushOptionSelectGroup b;
    public final e c;
    public final SelectOption d;

    public void PushOptionSelectGroup$a(PushOptionSelectGroup p0,e p1,SelectOption p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PushOptionSelectGroup$a.class, "1")) {
       }else {
          p0 = this.b.b().iterator();
          while (p0.hasNext()) {
             c uoc = p0.next();
             e model = (uoc != null)? uoc.getModel(): null;
             boolean b = a.g(model, this.c);
             e model1 = uoc.getModel();
             if (model1 != null) {
                model1.i = b;
             }
             d uod = uoc.h();
             if (uod != null) {
                uod = uod.f;
                if (uod != null) {
                   View view = uod.findViewById(R.id.entry_checkout);
                   if (view != null) {
                      view.setSelected(b);
                   }
                }
             }
          }
          p0.mSelectedOption = this.d;
       }
       return;
    }
}
