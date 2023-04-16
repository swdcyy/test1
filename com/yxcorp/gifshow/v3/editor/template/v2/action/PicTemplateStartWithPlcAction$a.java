package com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateStartWithPlcAction$a;
import erd.a;
import androidx.lifecycle.ViewModelProvider;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import auc.a;
import java.util.Objects;
import kotlin.jvm.internal.a;
import uwc.c;
import androidx.lifecycle.ViewModel;
import java.util.Map;
import uwc.a;
import qsc.e;
import t36.f;
import auc.c;
import t36.f$a;
import faa.a;
import q87.c;

public final class PicTemplateStartWithPlcAction$a implements a	// class@001379
{
    public final ViewModelProvider b;

    public void PicTemplateStartWithPlcAction$a(ViewModelProvider p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, PicTemplateStartWithPlcAction$a.class, "1")) {
          return;
       }
       a a = a.a;
       boolean b = false;
       a.d(this.b, b);
       PicTemplateStartWithPlcAction$a tb = this.b;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidOneRefs(tb, a, a.class, "7")) {
          a.p(tb, "vmp");
          ViewModel viewModel = tb.get(c.class);
          a.o(viewModel, "get\(T::class.java\)");
          f.p0(viewModel.t0(), e.class).s0(c.a);
       }
       Object[] objArray = new Object[b];
       a.D().w("PicTemplateAction", "applyPlcTemplates: success", objArray);
       return;
    }
}
