package com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.template.TextPanelTemplateFragmentV3;
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
import wod.a;
import androidx.fragment.app.Fragment;
import java.util.List;

public final class TextPanelTemplateFragmentV3 extends BaseFragment	// class@000c5f
{
    public final List j;
    public HashMap k;

    public void TextPanelTemplateFragmentV3(){
       super(null, null, null, null, 15, null);
       this.j = super();
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, TextPanelTemplateFragmentV3.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       View view = a.c(p0, R.layout.arg_RES_7f0d04aa, p1, false);
       a.o(view, "inflater.inflate\(R.layou¡­ext_v3, container, false\)");
       return view;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, TextPanelTemplateFragmentV3.class, "3")) {
          return;
       }
       super.onDestroyView();
       Iterator iterator = this.j.iterator();
       while (iterator.hasNext()) {
          iterator.next().C();
       }
       if (!PatchProxy.applyVoid(null, this, TextPanelTemplateFragmentV3.class, "5")) {
          TextPanelTemplateFragmentV3 tk = this.k;
          if (tk != null) {
             tk.clear();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextPanelTemplateFragmentV3.class, "2")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       TextPanelTemplateFragmentV3 tj = this.j;
       Bundle arguments = this.getArguments();
       boolean b = false;
       if (arguments != null) {
          b = arguments.getBoolean("IS_DESIGN", b);
       }
       arguments = this.getArguments();
       String str = "";
       if (arguments != null) {
          String str1 = arguments.getString("GROUP_ID", str);
          if (str1 != null) {
             str = str1;
          }
       }
       tj.add(new a(this, p0, b, str));
       Iterator iterator = this.j.iterator();
       while (iterator.hasNext()) {
          iterator.next().B();
       }
       return;
    }
}
