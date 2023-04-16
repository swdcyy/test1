package com.kwai.slide.play.detail.performance.ElementViewAsyncFactory;
import com.kwai.slide.play.detail.performance.ElementViewAsyncFactory$a;
import nsd.u;
import java.lang.Object;
import com.kwai.slide.play.detail.performance.ElementViewAsyncFactory$enable$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.fragment.app.FragmentActivity;
import com.kwai.slide.play.detail.performance.ElementViewAsyncFactory$b;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.a;

public class ElementViewAsyncFactory	// class@001845
{
    public final p a;
    public static final ElementViewAsyncFactory$a b;

    static {
       ElementViewAsyncFactory.b = new ElementViewAsyncFactory$a(null);
    }
    public void ElementViewAsyncFactory(){
       super();
       this.a = s.c(ElementViewAsyncFactory$enable$2.INSTANCE);
    }
    public final boolean a(){
       Object obj = PatchProxy.apply(null, this, ElementViewAsyncFactory.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = this.a.getValue();
       }
       return obj.booleanValue();
    }
    public final ElementViewAsyncFactory$b b(FragmentActivity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ElementViewAsyncFactory.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ViewModel viewModel = ViewModelProviders.of(p0).get(ElementViewAsyncFactory$b.class);
       a.o(viewModel, "ViewModelProviders.of\(ac¡­yncViewModel::class.java\)");
       return viewModel;
    }
}
