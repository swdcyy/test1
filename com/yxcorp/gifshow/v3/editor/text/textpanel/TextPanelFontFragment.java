package com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelFontFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import b9c.b0;
import b9c.w;
import b9c.a;
import b9c.c;
import nsd.u;
import com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelFontFragment$textElementViewModel$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelFontFragment$mVMDelegate$2;
import java.util.ArrayList;
import com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelFontFragment$rootView$2;
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
import com.yxcorp.gifshow.v3.editor.text.font.TextFontViewBinder;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import com.yxcorp.gifshow.v3.editor.text.font.FontVMDelegate;
import androidx.fragment.app.Fragment;
import java.util.List;
import java.util.Objects;

public final class TextPanelFontFragment extends BaseFragment	// class@0014c1
{
    public final p j;
    public final p k;
    public final List l;
    public final p m;
    public TextFontViewBinder n;
    public HashMap o;

    public void TextPanelFontFragment(){
       super(null, null, null, null, 15, null);
       this.j = s.c(super(this));
       this.k = s.c(new TextPanelFontFragment$mVMDelegate$2(this));
       this.l = new ArrayList();
       this.m = s.c(new TextPanelFontFragment$rootView$2(this));
    }
    public final View ch(){
       Object obj = PatchProxy.apply(null, this, TextPanelFontFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.m.getValue();
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, TextPanelFontFragment.class, "4");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       a.p(p0, "inflater");
       return this.ch();
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, TextPanelFontFragment.class, "7")) {
          return;
       }
       super.onDestroyView();
       Iterator iterator = this.l.iterator();
       while (iterator.hasNext()) {
          iterator.next().C();
       }
       if (!PatchProxy.applyVoid(null, this, TextPanelFontFragment.class, "9")) {
          TextPanelFontFragment to = this.o;
          if (to != null) {
             to.clear();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       View view;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextPanelFontFragment.class, "5")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       Object[] objArray = null;
       TextElementViewModel textElementV = PatchProxy.apply(objArray, this, TextPanelFontFragment.class, "1");
       if (textElementV == patchProxyRe) {
          textElementV = this.j.getValue();
       }
       view = this.ch();
       a.o(view, "rootView");
       Object obj = PatchProxy.apply(objArray, this, TextPanelFontFragment.class, "2");
       if (obj != patchProxyRe) {
       }else {
          obj = this.k.getValue();
       }
       TextFontViewBinder textFontView = new TextFontViewBinder(this, textElementV, view, obj);
       this.n = textFontView;
       this.l.add(textFontView);
       Iterator iterator = this.l.iterator();
       while (iterator.hasNext()) {
          iterator.next().B();
       }
       return;
    }
    public void u(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TextPanelFontFragment.class, "6")) {
          return;
       }
       TextPanelFontFragment tn = this.n;
       if (tn == null) {
          a.S("textFontViewBinder");
       }
       Objects.requireNonNull(tn);
       if (!PatchProxy.applyVoid(objArray, tn, TextFontViewBinder.class, "7")) {
          tn.F(tn.h.b());
       }
       return;
    }
}
