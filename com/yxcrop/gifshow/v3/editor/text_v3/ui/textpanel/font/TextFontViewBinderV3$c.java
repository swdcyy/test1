package com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.font.TextFontViewBinderV3$c;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$b;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.textpanel.font.TextFontViewBinderV3;
import java.lang.Object;
import nn9.b;
import android.view.View;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$b$a;
import com.yxcorp.gifshow.component.postlistcomponent.state.LoadingStatus;
import mn9.a;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import jn9.b;
import bod.a;
import androidx.lifecycle.MutableLiveData;
import rod.m;
import rod.b;
import tod.a;
import android.content.Context;
import androidx.fragment.app.Fragment;
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
import pn9.d;

public final class TextFontViewBinderV3$c implements PostListComponentView$b	// class@000c56
{
    public final TextFontViewBinderV3 a;

    public void TextFontViewBinderV3$c(TextFontViewBinderV3 p0){
       this.a = p0;
       super();
    }
    public void a(b p0,View p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, TextFontViewBinderV3$c.class, "3")) {
          return;
       }
       a.p(p0, "itemState");
       a.p(p1, "itemView");
       a.p(p2, "tag");
       PostListComponentView$b$a.b(this, p0, p1, p2);
       return;
    }
    public void b(LoadingStatus p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextFontViewBinderV3$c.class, "2")) {
          return;
       }
       a.p(p0, "newLoadingStatus");
       a.p(p1, "tag");
       PostListComponentView$b$a.a(this, p0, p1);
       return;
    }
    public void c(a p0,View p1,String p2){
       a this;
       String str1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, TextFontViewBinderV3$c.class, "1")) {
          return;
       }
       a.p(p0, "item");
       a.p(p2, "tag");
       Object[] objArray = new Object[0];
       a.D().s("TextFontViewBinderV2", "onItemSelected: "+p0.getId(), objArray);
       a uoa = this.a.h.q();
       this.a.c.t0().setValue(p0.getId());
       m e = this.a.c.e;
       if (e != null) {
          e.a(uoa, p0);
       }
       this = a.a;
       Context context = this.a.o.getContext();
       Objects.requireNonNull(context, "null cannot be cast to non-null type com.yxcorp.gifshow.log.ILogPage");
       TextFontViewBinderV3 g = this.a.g;
       Objects.requireNonNull(this);
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(context, p0, Boolean.valueOf(g), this, a.class, "9")) {
          a.p(context, "logPage");
          a.p(p0, "fontItem");
          String str = (g != null)? "subtitle": "text";
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "FONT_BUTTON";
          i3 oi3 = i3.f();
          oi3.d("type", str);
          uElementPack.params = oi3.toString();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          ClientContent$VideoEditOperationPackage videoEditOpe = new ClientContent$VideoEditOperationPackage();
          int i = (g != null)? 6: 10;
          videoEditOpe.type = i;
          videoEditOpe.subType = "font";
          if (a.g(p0.b().d(), b.a().d())) {
             videoEditOpe.extraMessage = "-1";
          }else {
             videoEditOpe.name = p0.b().e();
             videoEditOpe.extraMessage = p0.b().d();
          }
          uContentPack.videoEditOperationPackage = videoEditOpe;
          int page = context.getPage();
          if (page != 29) {
             if (page != 63) {
                str1 = (page != 116)? "": "2107191";
             }else {
                str1 = "2107189";
             }
          }else {
             str1 = "2107187";
          }
          u1.M(str1, context, 1, uElementPack, uContentPack, null);
       }
       return;
    }
    public void d(a p0,View p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, TextFontViewBinderV3$c.class, "4")) {
          return;
       }
       a.p(p0, "item");
       a.p(p1, "itemView");
       a.p(p2, "tag");
       PostListComponentView$b$a.c(this, p0, p1, p2);
       return;
    }
    public void e(b p0,b p1,String p2){
       d.a(this, p0, p1, p2);
    }
}
