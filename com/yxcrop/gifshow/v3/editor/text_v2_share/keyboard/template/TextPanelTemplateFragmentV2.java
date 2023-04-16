package com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.template.TextPanelTemplateFragmentV2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import b9c.b0;
import b9c.w;
import b9c.a;
import b9c.c;
import nsd.u;
import java.util.ArrayList;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ag6.a;
import java.util.Iterator;
import java.lang.Iterable;
import ei0.a;
import java.util.HashMap;
import eod.e;
import androidx.fragment.app.Fragment;
import java.util.List;
import eod.h;

public final class TextPanelTemplateFragmentV2 extends BaseFragment	// class@000bb8
{
    public final List j;
    public HashMap k;

    public void TextPanelTemplateFragmentV2(){
       super(null, null, null, null, 15, null);
       this.j = super();
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, TextPanelTemplateFragmentV2.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       View view = a.c(p0, R.layout.arg_RES_7f0d0519, p1, false);
       a.o(view, "inflater.inflate\(R.layou¡­ate_v2, container, false\)");
       return view;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, TextPanelTemplateFragmentV2.class, "3")) {
          return;
       }
       super.onDestroyView();
       Iterator iterator = this.j.iterator();
       while (iterator.hasNext()) {
          iterator.next().C();
       }
       if (!PatchProxy.applyVoid(null, this, TextPanelTemplateFragmentV2.class, "5")) {
          TextPanelTemplateFragmentV2 tk = this.k;
          if (tk != null) {
             tk.clear();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextPanelTemplateFragmentV2.class, "2")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       this.j.add(new e(this, p0));
       this.j.add(new h(this, p0));
       Iterator iterator = this.j.iterator();
       while (iterator.hasNext()) {
          iterator.next().B();
       }
       return;
    }
}
