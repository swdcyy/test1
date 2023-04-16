package com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelTemplateFragment;
import fvc.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import b9c.b0;
import b9c.w;
import b9c.a;
import b9c.c;
import nsd.u;
import com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelTemplateFragment$textElementViewModel$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.ArrayList;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import gvc.h;
import gvc.j;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.view.ViewGroup;
import java.lang.Number;
import gvc.b;
import xuc.f;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.widget.LinearLayout;
import java.lang.Integer;
import java.util.List;
import gvc.a;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import ag6.a;
import java.util.Iterator;
import java.lang.Iterable;
import ei0.a;
import java.util.HashMap;

public final class TextPanelTemplateFragment extends BaseFragment implements a	// class@0014cd
{
    public final p j;
    public final List k;
    public View l;
    public h m;
    public j n;
    public HashMap o;

    public void TextPanelTemplateFragment(){
       super(null, null, null, null, 15, null);
       this.j = s.c(super(this));
       this.k = new ArrayList();
    }
    public final TextElementViewModel ch(){
       Object obj = PatchProxy.apply(null, this, TextPanelTemplateFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
    public final void dh(boolean p0){
       TextPanelTemplateFragment tn;
       int i1;
       String str1;
       int i2;
       f uof;
       h oh = h.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       j oj = j.class;
       if (PatchProxy.isSupport(TextPanelTemplateFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, TextPanelTemplateFragment.class, "7")) {
          return;
       }
       String str = "textTemplateUnfoldViewBinder";
       int i = 1;
       if (p0) {
          tn = this.n;
          if (tn == null) {
             a.S(str);
          }
          Objects.requireNonNull(tn);
          if (!PatchProxy.applyVoid(null, tn, oj, "7")) {
             tn.d.setVisibility(8);
          }
          tn = this.m;
          if (tn == null) {
             a.S("textTemplateFoldViewBinder");
          }
          Objects.requireNonNull(tn);
          if (!PatchProxy.applyVoid(null, tn, oh, "6")) {
             f obj = PatchProxy.apply(null, tn, oh, "5");
             if (obj != patchProxyRe) {
                i1 = obj.intValue();
             }else if(tn.i != 256){
                obj = tn.D().S0();
             }else {
                obj = tn.D().Q0();
             }
             if (tn.j != null) {
                tn.j = false;
                Bundle arguments = tn.k.getArguments();
                if (arguments != null) {
                   str1 = arguments.getString("currentTextId");
                   if (str1 != null) {
                   label_0091 :
                      i1 = obj.a(str1);
                   }
                }
                str1 = "";
                goto label_0091 ;
             }else {
                i1 = f.b(obj, null, i, null);
             }
             tn.I(i1);
             oh = tn.h;
             if (oh == null) {
                a.S("mTemplateFoldAdapter");
             }
             oh.k0();
             tn.d.setVisibility(0);
          }
       }else {
          tn = this.n;
          if (tn == null) {
             a.S(str);
          }
          Objects.requireNonNull(tn);
          if (!PatchProxy.applyVoid(null, tn, oj, "5")) {
             Object obj1 = PatchProxy.apply(null, tn, oj, "4");
             if (obj1 != patchProxyRe) {
                i2 = obj1.intValue();
             }else if(tn.f != 256){
                uof = tn.D().S0();
             }else {
                uof = tn.D().Q0();
             }
             i2 = f.b(uof, null, i, null);
             if (PatchProxy.isSupport(oj) && (!PatchProxy.applyVoidOneRefs(Integer.valueOf(i2), tn, oj, "6") && i2 >= 0)) {
                oj = tn.e;
                if (oj == null) {
                   a.S("mTemplateUnfoldAdapter");
                }
                List list = oj.K0();
                Integer integer = (list != null)? Integer.valueOf(list.size()): null;
                a.m(integer);
                if (i2 < integer.intValue()) {
                   tn.F(i2, tn.d, 0);
                }
             }
          label_0125 :
             j e = tn.e;
             if (e == null) {
                a.S("mTemplateUnfoldAdapter");
             }
             e.k0();
             tn.d.setVisibility(0);
          }
          tn = this.m;
          if (tn == null) {
             a.S("textTemplateFoldViewBinder");
          }
          Objects.requireNonNull(tn);
          if (!PatchProxy.applyVoid(null, tn, oh, "7")) {
             tn.d.setVisibility(8);
          }
       }
       return;
    }
    public void n9(boolean p0){
       if (PatchProxy.isSupport(TextPanelTemplateFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, TextPanelTemplateFragment.class, "5")) {
          return;
       }
       this.dh(p0);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       View view;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, TextPanelTemplateFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       if (PostExperimentUtils.t1() && this.ch().M0()) {
          view = a.c(p0, R.layout.arg_RES_7f0d0518, p1, false);
          a.o(view, "inflater.inflate\(R.layou¡­te_new, container, false\)");
       }else {
          view = a.c(p0, R.layout.arg_RES_7f0d0517, p1, false);
          a.o(view, "inflater.inflate\(R.layou¡­mplate, container, false\)");
       }
       this.l = view;
       if (view == null) {
          a.S("rootView");
       }
       return view;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, TextPanelTemplateFragment.class, "4")) {
          return;
       }
       super.onDestroyView();
       Iterator iterator = this.k.iterator();
       while (iterator.hasNext()) {
          iterator.next().C();
       }
       if (!PatchProxy.applyVoid(null, this, TextPanelTemplateFragment.class, "9")) {
          TextPanelTemplateFragment to = this.o;
          if (to != null) {
             to.clear();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextPanelTemplateFragment.class, "3")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       TextElementViewModel textElementV = this.ch();
       TextPanelTemplateFragment tl = this.l;
       if (tl == null) {
          a.S("rootView");
       }
       h oh = new h(this, textElementV, tl);
       this.m = oh;
       this.k.add(oh);
       textElementV = this.ch();
       tl = this.l;
       if (tl == null) {
          a.S("rootView");
       }
       j oj = new j(this, textElementV, tl);
       this.n = oj;
       this.k.add(oj);
       Iterator iterator = this.k.iterator();
       while (iterator.hasNext()) {
          iterator.next().B();
       }
       this.dh(true);
       return;
    }
    public void u(){
       if (PatchProxy.applyVoid(null, this, TextPanelTemplateFragment.class, "6")) {
          return;
       }
       this.dh(true);
       return;
    }
}
