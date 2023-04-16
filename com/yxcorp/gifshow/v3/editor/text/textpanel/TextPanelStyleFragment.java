package com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelStyleFragment;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelStyleFragment$textElementViewModel$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.ArrayList;
import com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelStyleFragment$rootView$2;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import ei0.a;
import java.util.HashMap;
import com.yxcorp.gifshow.v3.editor.text.textpanel.style.TextStyleViewBinder;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import java.util.List;

public final class TextPanelStyleFragment extends Fragment	// class@0014c4
{
    public final p b;
    public final List c;
    public final p d;
    public HashMap e;

    public void TextPanelStyleFragment(){
       super();
       this.b = s.c(new TextPanelStyleFragment$textElementViewModel$2(this));
       this.c = new ArrayList();
       this.d = s.c(new TextPanelStyleFragment$rootView$2(this));
    }
    public final View Ug(){
       Object obj = PatchProxy.apply(null, this, TextPanelStyleFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.getValue();
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, TextPanelStyleFragment.class, "3");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       a.p(p0, "inflater");
       return this.Ug();
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, TextPanelStyleFragment.class, "5")) {
          return;
       }
       super.onDestroyView();
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          iterator.next().C();
       }
       if (!PatchProxy.applyVoid(null, this, TextPanelStyleFragment.class, "7")) {
          TextPanelStyleFragment te = this.e;
          if (te != null) {
             te.clear();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       View view;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextPanelStyleFragment.class, "4")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       TextPanelStyleFragment tc = this.c;
       TextElementViewModel textElementV = PatchProxy.apply(null, this, TextPanelStyleFragment.class, "1");
       if (textElementV == PatchProxyResult.class) {
          textElementV = this.b.getValue();
       }
       view = this.Ug();
       a.o(view, "rootView");
       tc.add(new TextStyleViewBinder(this, textElementV, view));
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          iterator.next().B();
       }
       return;
    }
}
