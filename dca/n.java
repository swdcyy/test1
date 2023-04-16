package dca.n;
import pn9.c;
import com.yxcorp.gifshow.editor.aicutv2.ui.VideoTemplateViewBinder;
import java.lang.Object;
import android.view.ViewGroup;
import pn9.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import eca.a;
import android.content.Context;
import android.view.View;
import i2b.a;
import eca.b;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.editor.i;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.Fragment;
import eca.e;
import dzc.a;
import kotlin.Pair;
import nsd.u;

public final class n implements c	// class@001efc
{
    public final VideoTemplateViewBinder a;

    public void n(VideoTemplateViewBinder p0){
       this.a = p0;
       super();
    }
    public a a(ViewGroup p0,int p1){
       EditorDelegate obj;
       View view;
       a uoa;
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, on, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "parent");
       boolean b = false;
       if (p1) {
          if (p1 != 2) {
             view = a.d(p0.getContext(), R.layout.arg_RES_7f0d00a0, p0, b);
             a.o(view, "KwaiLayoutInflater.infla¡­m_divider, parent, false\)");
             uoa = new a(view);
          }else {
             view = a.d(p0.getContext(), R.layout.arg_RES_7f0d1668, p0, b);
             a.o(view, "KwaiLayoutInflater.infla¡­icut_item, parent, false\)");
             obj = this.a.m.f();
             a.o(obj, "editorHelperContract.editorDelegate");
             BaseFragment uBaseFragmen = obj.q();
             a.o(uBaseFragmen, "editorHelperContract.edi¡­rDelegate.previewFragment");
             uoa = new b(view, uBaseFragmen);
          }
       }else {
          View view1 = a.d(p0.getContext(), R.layout.arg_RES_7f0d1669, p0, b);
          a.o(view1, "KwaiLayoutInflater.infla¡­list_item, parent, false\)");
          e uoe = new e(view1, this.a.c, false, null, 8, null);
       }
       return uoa;
    }
}
