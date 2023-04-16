package com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.TextVideoPreviewViewBinder$f;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView$b;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.TextVideoPreviewViewBinder;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextElement;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.element.NewEditStickerBaseDrawer;
import wpc.k;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import a17.b$b;
import a17.b$a;
import vld.a;
import und.l;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import lnd.a;
import java.util.List;
import xld.a;
import com.yxcrop.gifshow.v3.editor.decoration_v2.data.NewDecorationElementData;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;
import a17.c$a;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import a17.g;
import lnc.a1;
import kotlin.jvm.internal.a;
import com.kwai.library.widget.popup.sheet.SheetItemStatus;
import java.lang.CharSequence;
import trd.t;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.TextVideoPreviewViewBinder$f$a;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.TextVideoPreviewViewBinder$f$b;
import a17.c;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import uvc.a;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextBaseElementData;
import wnd.h;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.DraftTTSInfo;
import wnd.g;

public final class TextVideoPreviewViewBinder$f implements EditDecorationContainerView$b	// class@000b30
{
    public final TextVideoPreviewViewBinder a;
    public final EditorDelegate b;
    public final Fragment c;

    public void TextVideoPreviewViewBinder$f(TextVideoPreviewViewBinder p0,EditorDelegate p1,Fragment p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public boolean a(EditDecorationBaseDrawer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TextVideoPreviewViewBinder$f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p0 instanceof NewEditTextElement && !p0 instanceof NewEditStickerBaseDrawer) {
          return k.a(this, p0);
       }
       boolean b = true;
       if (p0.isSubtitle()) {
          if (this.b.H() == null && (this.a.h0() && (this.b.H() != EditorItemFunc.SUBTITLE_V2 || (this.a.u0() && p0.mIsSelected == null)))) {
          label_0087 :
             b = false;
          }
       }else if(p0.isSticker()){
          if (this.b.H() != null || (this.a.h0() || (this.a.u0() && p0.mIsSelected == null))) {
          }
       }else if(this.b.H() == null && (!this.a.u0() || p0.mIsSelected != null)){
       }
       return b;
    }
    public boolean b(EditDecorationBaseDrawer p0){
       return true;
    }
    public void c(b$b p0,b$a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextVideoPreviewViewBinder$f.class, "4")) {
          return;
       }
       NewDecorationElementData newDecoratio = a.a.a(this.a.s0().o0().i(), this.a.s0().o0().o());
       if (newDecoratio != null && newDecoratio.i0() != null) {
          c$a uoa = new c$a(this.c.requireActivity());
          uoa.l0(R.string.arg_RES_7f100cb6);
          String str = a1.p(R.string.arg_RES_7f100b5b);
          a.o(str, "CommonUtil.string\(R.string.edit_clip_delete_new\)");
          uoa.j0(t.k(new g(str, SheetItemStatus.Primary)));
          uoa.g0(R.string.cancel);
          uoa.i0(new TextVideoPreviewViewBinder$f$a(p0));
          uoa.d0(new TextVideoPreviewViewBinder$f$b(p1));
          c.b0(R.style.arg_RES_7f110653, uoa).Y(PopupInterface.a);
       }
       return;
    }
    public boolean d(EditDecorationBaseDrawer p0){
       a obj = PatchProxy.applyOneRefs(p0, this, TextVideoPreviewViewBinder$f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.s0().o0();
       double d = (obj.t())? obj.a().c() % ((double)obj.c().size() * 2.00f): obj.a().c();
       return EditDecorationContainerView.s0(p0, d);
    }
    public boolean e(EditDecorationBaseDrawer p0){
       return k.b(this, p0);
    }
    public boolean f(EditDecorationBaseDrawer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TextVideoPreviewViewBinder$f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null && !p0.isSubtitle()) {
          NewTextBaseElementData newTextBaseE = h.l(this.a.s0().o0().i(), this.a.s0().o0().o());
          if (newTextBaseE != null && newTextBaseE.I0() != null) {
             g og = (!newTextBaseE.F0().length())? 1: null;
             if (!og) {
                DraftTTSInfo uDraftTTSInf = newTextBaseE.I0();
                a.m(uDraftTTSInf);
                DraftTTSInfo uDraftTTSInf1 = newTextBaseE.I0();
                a.m(uDraftTTSInf1);
                if (!g.a.g(uDraftTTSInf.d(), uDraftTTSInf1.c())) {
                   return true;
                }
             }
          }
       }
    label_0079 :
       return false;
    }
}
