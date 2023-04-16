package buc.g;
import uxb.k;
import buc.g$a;
import nsd.u;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import qsc.c;
import buc.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.Objects;
import buc.f$b;
import com.kwai.robust.PatchProxyResult;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import java.util.Set;
import com.yxcorp.gifshow.v3.editor.j;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateEditorV2;

public class g implements k	// class@000497
{
    public static final g$a b;

    static {
       g.b = new g$a(null);
    }
    public void g(){
       super();
    }
    public void eQ(Fragment p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "2")) {
          return;
       }
       String str = "fragment";
       a.p(p0, str);
       a.p(p1, "processor");
       Object[] objArray = new Object[0];
       a.D().w("PicTemplatePinsPluginIm", "registerPicTemplateProcessor: processor = ["+p1+']', objArray);
       f$b c = f.c;
       Objects.requireNonNull(c);
       ViewModel viewModel = PatchProxy.applyOneRefs(p0, c, f$b.class, "1");
       if (viewModel != PatchProxyResult.class) {
       }else {
          a.p(p0, str);
          ViewModel viewModel1 = ViewModelProviders.of(p0, f.b).get(f.class);
          a.o(viewModel1, "ViewModelProviders.of\(fr¡­ageViewModel::class.java\)");
          viewModel = viewModel1;
       }
       Objects.requireNonNull(viewModel);
       if (!PatchProxy.applyVoidOneRefs(p1, viewModel, f.class, "1")) {
          a.p(p1, "processor");
          viewModel.a.add(p1);
       }
       return;
    }
    public boolean fA(j p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "revertableEditor");
       return p0 instanceof PicTemplateEditorV2;
    }
    public boolean isAvailable(){
       return true;
    }
}
