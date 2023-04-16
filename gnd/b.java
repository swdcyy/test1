package gnd.b;
import androidx.fragment.app.Fragment;
import hnd.f;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.previewer.EditorBasePreviewFragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import java.lang.RuntimeException;
import android.app.Activity;
import msd.q;
import gnd.a;
import a17.g;
import lnc.a1;
import com.kwai.library.widget.popup.sheet.SheetItemStatus;
import java.lang.CharSequence;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.util.ClearSheetOperation;
import java.util.List;
import trd.t;
import a17.c$a;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import gnd.b$a;
import a17.b$b;
import a17.f;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;

public final class b	// class@000f52
{

    public static final f a(Fragment p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, uob, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "fragment");
       Fragment uFragment = PatchProxy.applyOneRefs(p0, null, uob, "2");
       if (uFragment != patchProxyRe) {
       }else {
          a.p(p0, "childFragment");
          while (true) {
             if (p0 == null) {
                throw new RuntimeException("findPreviewFragment failed");
             }
             if (p0 instanceof EditorBasePreviewFragment) {
                uFragment = p0;
                break ;
             }else {
                p0 = p0.getParentFragment();
             }
          }
       }
       ViewModel viewModel = ViewModelProviders.of(uFragment).get(f.class);
       a.o(viewModel, "ViewModelProviders.of\(fi¡­eViewModelV2::class.java\)");
       return viewModel;
    }
    public static final void b(Activity p0,q p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "5")) {
          return;
       }
       a.p(p0, "it");
       a.p(p1, "callback");
       String str = a1.p(R.string.arg_RES_7f104b19);
       a.o(str, "CommonUtil.string\(R.string.subtitle_clear_new\)");
       g og = new g(str, SheetItemStatus.Primary);
       List list = t.k(new a(og, ClearSheetOperation.CLEAR_ALL));
       c$a uoa = new c$a(p0);
       uoa.l0(R.string.arg_RES_7f104b18);
       ArrayList uArrayList = new ArrayList(u.Y(list, 10));
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(iterator.next().a);
       }
       uoa.j0(uArrayList);
       uoa.g0(R.string.cancel);
       uoa.i0(new b$a(p1, list));
       f.a(uoa).Y(PopupInterface.a);
       return;
    }
}
