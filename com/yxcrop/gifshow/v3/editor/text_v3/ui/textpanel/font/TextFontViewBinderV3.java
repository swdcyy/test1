package com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.font.TextFontViewBinderV3;
import ynd.b;
import ei0.a;
import androidx.fragment.app.Fragment;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import xod.f;
import rod.m;
import android.widget.ProgressBar;
import ynd.g;
import jn9.b;
import jn9.d;
import mn9.b;
import java.util.List;
import nsd.u;
import androidx.lifecycle.LifecycleOwner;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.font.TextFontViewBinderV3$e;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.font.TextFontViewBinderV3$mFontRecyclerView$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.font.TextFontViewBinderV3$d;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.font.TextFontViewBinderV3$c;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.font.TextFontViewBinderV3$b;
import faa.a;
import q87.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import jn9.e;
import uod.a;
import pn9.c;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$b;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$a;
import pn9.b;
import com.yxcorp.gifshow.component.postlistcomponent.SelectScrollOption;
import uod.b;
import android.view.View$OnClickListener;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import jn9.b$b;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Number;
import mn9.a;
import bod.a;
import tod.a;
import android.content.Context;
import java.util.Objects;
import k2b.e0;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$VideoEditOperationPackage;
import d0c.a;
import d0c.b;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import lnc.a1;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.ViewTreeObserver;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.font.TextFontViewBinderV3$f;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

public final class TextFontViewBinderV3 extends a implements b	// class@000c5b
{
    public final m c;
    public final ProgressBar d;
    public final View e;
    public final g f;
    public final boolean g;
    public final b h;
    public final Observer i;
    public final PostListComponentView j;
    public final p k;
    public final TextFontViewBinderV3$d l;
    public final TextFontViewBinderV3$c m;
    public final TextFontViewBinderV3$b n;
    public final Fragment o;
    public final View p;

    public void TextFontViewBinderV3(Fragment p0,View p1){
       f a;
       Object obj = p0;
       Object obj1 = p1;
       a.p(obj, "fragment");
       a.p(obj1, "rootView");
       super(obj1);
       this.o = obj;
       this.p = obj1;
       a = f.a;
       m om = a.f(obj);
       this.c = om;
       View view = obj1.findViewById(R.id.progress_bar);
       a.o(view, "rootView.findViewById\(R.id.progress_bar\)");
       this.d = view;
       view = obj1.findViewById(R.id.refresh_layout);
       a.o(view, "rootView.findViewById\(R.id.refresh_layout\)");
       this.e = view;
       this.f = a.h(obj);
       this.g = a.i(obj);
       d uod = new d(om.l, 0, null, false, null, null, false, 126, null);
       b uob = new b(a, obj);
       this.h = uob;
       this.i = new TextFontViewBinderV3$e(this);
       View view1 = obj1.findViewById(R.id.font_rv_container);
       a.o(view1, "rootView.findViewById\(R.id.font_rv_container\)");
       this.j = view1;
       this.k = s.c(new TextFontViewBinderV3$mFontRecyclerView$2(this));
       this.l = new TextFontViewBinderV3$d(this);
       TextFontViewBinderV3$c uoc = new TextFontViewBinderV3$c(this);
       this.m = uoc;
       TextFontViewBinderV3$b uob1 = new TextFontViewBinderV3$b(this, obj1);
       this.n = uob1;
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "TextFontViewBinderV2";
       a.D().s(str, "init", objArray);
       if (PatchProxy.applyVoid(null, this, TextFontViewBinderV3.class, "4")) {
       }else {
          Object[] objArray1 = new Object[i];
          a.D().s(str, "initFontView", objArray1);
          e uoe = new e(new a(), uoc, null, uob1, null, null, 52, null);
          view1.a(obj1, obj, uob);
          b.w(uob, false, false, 0, 7, 0);
          view.setOnClickListener(new b(this));
       }
       return;
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, TextFontViewBinderV3.class, "2")) {
          return;
       }
       this.c.t0().observe(this.o, this.i);
       b.b(this.h, this.l, false, 2, null);
       this.j.c();
       return;
    }
    public void C(){
       a a;
       String str1;
       TextFontViewBinderV3 textFontView = TextFontViewBinderV3.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, textFontView, "3")) {
          return;
       }
       this.c.t0().removeObserver(this.i);
       b.b(this.h, this.l, false, 2, objArray);
       if (!PatchProxy.applyVoid(objArray, this, textFontView, "9")) {
          List list = this.h.m();
          Iterator iterator = this.j.getShowedItemPositionList().iterator();
          while (iterator.hasNext()) {
             int i = iterator.next().intValue();
             if (i < 0 || i >= list.size()) {
                continue ;
             }else {
                a uoa = list.get(i);
                if (!uoa instanceof a) {
                   continue ;
                }else {
                   a = a.a;
                   Context context = this.o.getContext();
                   Objects.requireNonNull(context, "null cannot be cast to non-null type com.yxcorp.gifshow.log.ILogPage");
                   TextFontViewBinderV3 tg = this.g;
                   Objects.requireNonNull(a);
                   if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(context, uoa, Boolean.valueOf(tg), a, a.class, "10")) {
                      continue ;
                   }else {
                      a.p(context, "logPage");
                      a.p(uoa, "fontItem");
                      String str = (tg != null)? "subtitle": "text";
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action2 = "FONT_BUTTON";
                      i3 oi3 = i3.f();
                      oi3.d("type", str);
                      uElementPack.params = oi3.toString();
                      ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                      ClientContent$VideoEditOperationPackage videoEditOpe = new ClientContent$VideoEditOperationPackage();
                      int i1 = (tg != null)? 6: 10;
                      videoEditOpe.type = i1;
                      videoEditOpe.subType = "font";
                      if (a.g(uoa.b().d(), b.a().d())) {
                         videoEditOpe.extraMessage = "-1";
                      }else {
                         videoEditOpe.name = uoa.b().e();
                         videoEditOpe.extraMessage = uoa.b().d();
                      }
                      uContentPack.videoEditOperationPackage = videoEditOpe;
                      i = context.getPage();
                      if (i != 29) {
                         if (i != 63) {
                            str1 = (i != 116)? "": "2107190";
                         }else {
                            str1 = "2107188";
                         }
                      }else {
                         str1 = "2107186";
                      }
                      u1.D0(str1, context, 3, uElementPack, uContentPack, null);
                   }
                }
             }
          }
          this.j.b();
       }
       return;
    }
    public final RecyclerView D(){
       Object obj = PatchProxy.apply(null, this, TextFontViewBinderV3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.k.getValue();
    }
    public final void E(int p0){
       TextFontViewBinderV3 textFontView = TextFontViewBinderV3.class;
       if (PatchProxy.isSupport(textFontView) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, textFontView, "8")) {
          return;
       }
       if (p0 < 0) {
          return;
       }
       if (this.D().getWidth() && (!this.D().getHeight() || !this.D().getChildCount())) {
          this.D().getViewTreeObserver().addOnGlobalLayoutListener(new TextFontViewBinderV3$f(this, p0));
          return;
       }else {
          int i = 2;
          if (p0 < i) {
             RecyclerView$LayoutManager layoutManage = this.D().getLayoutManager();
             if (layoutManage != null) {
                layoutManage.scrollToPosition(0);
             }
             return;
          }else {
             RecyclerView$LayoutManager layoutManage1 = this.D().getLayoutManager();
             Objects.requireNonNull(layoutManage1, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
             layoutManage1.scrollToPositionWithOffset(p0, ((this.D().getWidth() / i) - a1.e(43.50f)));
             return;
          }
       }
    }
    public void u(){
       TextFontViewBinderV3 textFontView = TextFontViewBinderV3.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, textFontView, "5")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, textFontView, "6")) {
          this.c.t0().setValue(this.c.t0().getValue());
       }
       return;
    }
}
