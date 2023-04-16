package com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.font.vb.TextFontViewBinderV2$b;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$b;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.font.vb.TextFontViewBinderV2;
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
import iod.a;
import ynd.c;
import god.b;
import android.content.Context;
import androidx.fragment.app.Fragment;
import java.util.Objects;
import k2b.e0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$VideoEditOperationPackage;
import d0c.a;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import pn9.d;

public final class TextFontViewBinderV2$b implements PostListComponentView$b	// class@000b9f
{
    public final TextFontViewBinderV2 a;

    public void TextFontViewBinderV2$b(TextFontViewBinderV2 p0){
       this.a = p0;
       super();
    }
    public void a(b p0,View p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, TextFontViewBinderV2$b.class, "3")) {
          return;
       }
       a.p(p0, "itemState");
       a.p(p1, "itemView");
       a.p(p2, "tag");
       PostListComponentView$b$a.b(this, p0, p1, p2);
       return;
    }
    public void b(LoadingStatus p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextFontViewBinderV2$b.class, "2")) {
          return;
       }
       a.p(p0, "newLoadingStatus");
       a.p(p1, "tag");
       PostListComponentView$b$a.a(this, p0, p1);
       return;
    }
    public void c(a p0,View p1,String p2){
       b a;
       String str;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, TextFontViewBinderV2$b.class, "1")) {
          return;
       }
       a.p(p0, "item");
       a.p(p2, "tag");
       Object[] objArray = new Object[0];
       a.D().s("TextFontViewBinderV2", "onItemSelected: "+p0.getId(), objArray);
       a uoa = this.a.e.q();
       this.a.c.t0().setValue(p0.getId());
       a g = this.a.c.g;
       if (g != null) {
          g.a(uoa, p0);
       }
       a = b.a;
       Context context = this.a.l.getContext();
       Objects.requireNonNull(context, "null cannot be cast to non-null type com.yxcorp.gifshow.log.ILogPage");
       Context uContext = context;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidTwoRefs(uContext, p0, a, b.class, "8")) {
          a.p(uContext, "logPage");
          a.p(p0, "fontItem");
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "FONT_BUTTON";
          uElementPack.name = "×ÖÌå";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          ClientContent$VideoEditOperationPackage videoEditOpe = new ClientContent$VideoEditOperationPackage();
          videoEditOpe.type = 10;
          videoEditOpe.subType = "FONT";
          videoEditOpe.name = p0.b().e();
          videoEditOpe.extraMessage = p0.b().d();
          uContentPack.videoEditOperationPackage = videoEditOpe;
          int page = uContext.getPage();
          if (page != 29) {
             if (page != 63) {
                str = (page != 116)? "": "2107191";
             }else {
                str = "2107189";
             }
          }else {
             str = "2107187";
          }
          u1.M(str, uContext, 1, uElementPack, uContentPack, null);
       }
       return;
    }
    public void d(a p0,View p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, TextFontViewBinderV2$b.class, "4")) {
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
