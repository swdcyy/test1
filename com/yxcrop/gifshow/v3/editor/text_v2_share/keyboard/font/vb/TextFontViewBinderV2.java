package com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.font.vb.TextFontViewBinderV2;
import ynd.b;
import ei0.a;
import androidx.fragment.app.Fragment;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import god.a;
import iod.a;
import ynd.g;
import jn9.b;
import jn9.d;
import mn9.b;
import java.util.List;
import nsd.u;
import androidx.lifecycle.LifecycleOwner;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.font.vb.TextFontViewBinderV2$d;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.font.vb.TextFontViewBinderV2$mFontRecyclerView$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.font.vb.TextFontViewBinderV2$c;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.font.vb.TextFontViewBinderV2$b;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.font.vb.TextFontViewBinderV2$a;
import faa.a;
import q87.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import jn9.e;
import znd.a;
import pn9.c;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$b;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$a;
import pn9.b;
import com.yxcorp.gifshow.component.postlistcomponent.SelectScrollOption;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import jn9.b$b;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Number;
import mn9.a;
import bod.a;
import god.b;
import android.content.Context;
import java.util.Objects;
import k2b.e0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$VideoEditOperationPackage;
import d0c.a;
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
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.font.vb.TextFontViewBinderV2$e;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

public final class TextFontViewBinderV2 extends a implements b	// class@000ba5
{
    public final a c;
    public final g d;
    public final b e;
    public final Observer f;
    public final PostListComponentView g;
    public final p h;
    public final TextFontViewBinderV2$c i;
    public final TextFontViewBinderV2$b j;
    public final TextFontViewBinderV2$a k;
    public final Fragment l;
    public final View m;

    public void TextFontViewBinderV2(Fragment p0,View p1){
       a a;
       a.p(p0, "fragment");
       a.p(p1, "rootView");
       super(p1);
       this.l = p0;
       this.m = p1;
       a = a.a;
       a uoa = a.b(p0);
       this.c = uoa;
       this.d = a.c(p0);
       d uod = new d(uoa.l, 0, null, false, null, null, false, 126, null);
       b uob = new b(a, p0);
       this.e = uob;
       this.f = new TextFontViewBinderV2$d(this);
       View view = p1.findViewById(R.id.font_rv_container);
       a.o(view, "rootView.findViewById\(R.id.font_rv_container\)");
       this.g = view;
       this.h = s.c(new TextFontViewBinderV2$mFontRecyclerView$2(this));
       this.i = new TextFontViewBinderV2$c(this);
       TextFontViewBinderV2$b uob1 = new TextFontViewBinderV2$b(this);
       this.j = uob1;
       TextFontViewBinderV2$a uoa1 = new TextFontViewBinderV2$a(this, p1);
       this.k = uoa1;
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "TextFontViewBinderV2";
       a.D().s(str, "init", objArray);
       if (PatchProxy.applyVoid(null, this, TextFontViewBinderV2.class, "4")) {
       }else {
          Object[] objArray1 = new Object[i];
          a.D().s(str, "initFontView", objArray1);
          e uoe = new e(new a(), uob1, null, uoa1, null, null, 52, null);
          view.a(a.D(), p0, uob);
          b.w(uob, false, false, 0, 7, 0);
       }
       return;
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, TextFontViewBinderV2.class, "2")) {
          return;
       }
       this.c.t0().observe(this.l, this.f);
       b.b(this.e, this.i, false, 2, null);
       this.g.c();
       return;
    }
    public void C(){
       b a;
       String str;
       TextFontViewBinderV2 textFontView = TextFontViewBinderV2.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, textFontView, "3")) {
          return;
       }
       this.c.t0().removeObserver(this.f);
       b.b(this.e, this.i, false, 2, objArray);
       if (!PatchProxy.applyVoid(objArray, this, textFontView, "9")) {
          List list = this.e.m();
          Iterator iterator = this.g.getShowedItemPositionList().iterator();
          while (iterator.hasNext()) {
             int i = iterator.next().intValue();
             if (i < 0 || i >= list.size()) {
                continue ;
             }else {
                a uoa = list.get(i);
                if (!uoa instanceof a) {
                   continue ;
                }else {
                   a = b.a;
                   Context context = this.l.getContext();
                   Objects.requireNonNull(context, "null cannot be cast to non-null type com.yxcorp.gifshow.log.ILogPage");
                   Context uContext = context;
                   Objects.requireNonNull(a);
                   if (PatchProxy.applyVoidTwoRefs(uContext, uoa, a, b.class, "9")) {
                      continue ;
                   }else {
                      a.p(uContext, "logPage");
                      a.p(uoa, "fontItem");
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action2 = "FONT_BUTTON";
                      uElementPack.name = "×ÖÌå";
                      ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                      ClientContent$VideoEditOperationPackage videoEditOpe = new ClientContent$VideoEditOperationPackage();
                      videoEditOpe.type = 10;
                      videoEditOpe.subType = "FONT";
                      videoEditOpe.name = uoa.b().e();
                      videoEditOpe.extraMessage = uoa.b().d();
                      uContentPack.videoEditOperationPackage = videoEditOpe;
                      i = uContext.getPage();
                      if (i != 29) {
                         if (i != 63) {
                            str = (i != 116)? "": "2107190";
                         }else {
                            str = "2107188";
                         }
                      }else {
                         str = "2107186";
                      }
                      u1.D0(str, uContext, 3, uElementPack, uContentPack, null);
                   }
                }
             }
          }
          this.g.b();
       }
       return;
    }
    public final RecyclerView D(){
       Object obj = PatchProxy.apply(null, this, TextFontViewBinderV2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h.getValue();
    }
    public final void E(int p0){
       TextFontViewBinderV2 textFontView = TextFontViewBinderV2.class;
       if (PatchProxy.isSupport(textFontView) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, textFontView, "8")) {
          return;
       }
       if (p0 < 0) {
          return;
       }
       if (this.D().getWidth() && (!this.D().getHeight() || !this.D().getChildCount())) {
          this.D().getViewTreeObserver().addOnGlobalLayoutListener(new TextFontViewBinderV2$e(this, p0));
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
       TextFontViewBinderV2 textFontView = TextFontViewBinderV2.class;
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
