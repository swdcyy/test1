package dca.m;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$b;
import com.yxcorp.gifshow.editor.aicutv2.ui.VideoTemplateViewBinder;
import java.lang.Object;
import nn9.b;
import android.view.View;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$b$a;
import mn9.a;
import java.util.Objects;
import eca.g;
import com.yxcorp.gifshow.aicut.VideoTemplate;
import xoc.b;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.editor.i;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.yxcorp.gifshow.component.postlistcomponent.state.LoadingStatus;
import h69.j;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateDataFinishAction;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import com.kuaishou.edit.draft.Workspace$Source;
import android.content.Intent;
import ekd.j0;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateLoadItemAction;
import lnc.g7;
import com.yxcorp.utility.TextUtils;
import tvc.e;
import cca.b;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateDisableAutoLoadAction;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateChangedAction;
import com.yxcorp.gifshow.editor.aicutv2.actions.UpdateLyricAction;
import com.yxcorp.gifshow.aicut.KwaiAICutStyle;
import com.yxcorp.gifshow.aicut.api.AICutStyle;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplatePreloadItemAction;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import java.util.Set;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import java.util.Iterator;
import voc.y;
import gka.g;
import pn9.d;

public final class m implements PostListComponentView$b	// class@001efb
{
    public final VideoTemplateViewBinder a;

    public void m(VideoTemplateViewBinder p0){
       this.a = p0;
       super();
    }
    public void a(b p0,View p1,String p2){
       b a;
       boolean b;
       ClientEvent$ElementPackage uElementPack;
       JsonObject uob1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, m.class, "1")) {
          return;
       }
       a.p(p0, "itemState");
       a.p(p1, "itemView");
       a.p(p2, "tag");
       PostListComponentView$b$a.b(this, p0, p1, p2);
       a uoa = p0.g();
       Objects.requireNonNull(uoa, "null cannot be cast to non-null type com.yxcorp.gifshow.editor.aicutv2.ui.item.VideoTemplateUIItem");
       VideoTemplate videoTemplat = uoa.b();
       if (videoTemplat != null) {
          a = b.a;
          String id = videoTemplat.getId();
          String name = videoTemplat.getName();
          String str = uoa.c();
          String str1 = uoa.e();
          EditorDelegate uEditorDeleg = this.a.m.f();
          a.o(uEditorDeleg, "editorHelperContract.editorDelegate");
          b = DraftUtils.S(uEditorDeleg.N());
          Objects.requireNonNull(a);
          b uob = b.class;
          if (PatchProxy.isSupport(uob)) {
             Object[] objArray = new Object[]{id,name,str,str1,Boolean.valueOf(b)};
             if (!PatchProxy.applyVoid(objArray, a, uob, "4")) {
             }
          }else {
          }
       }
    label_00d4 :
       return;
    }
    public void b(LoadingStatus p0,String p1){
       EditorDelegate uEditorDeleg2;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, m.class, "2")) {
          return;
       }
       a.p(p0, "newLoadingStatus");
       a.p(p1, "tag");
       PostListComponentView$b$a.a(this, p0, p1);
       if (p0 == LoadingStatus.DATA_LOADING_FINISH) {
          EditorDelegate uEditorDeleg = this.a.m.f();
          p1 = "editorHelperContract.editorDelegate";
          a.o(uEditorDeleg, p1);
          c uoc = uEditorDeleg.N();
          a.o(uoc, "editorHelperContract.editorDelegate.workspaceDraft");
          String str = j.d(uoc, false);
          this.a.l.t0(new VideoTemplateDataFinishAction(str));
          EditorDelegate uEditorDeleg1 = this.a.m.f();
          a.o(uEditorDeleg1, p1);
          c uoc1 = uEditorDeleg1.N();
          a.o(uoc1, "editorHelperContract.editorDelegate.workspaceDraft");
          if (j.h(uoc1.T0())) {
             uEditorDeleg2 = this.a.m.f();
             a.o(uEditorDeleg2, p1);
             Intent intent = uEditorDeleg2.getIntent();
             intent = j0.f(intent, "EDIT_STATR_PARAMETER");
             String str1 = (intent == null || !intent.length())? 1: null;
             if (!str1) {
                str1 = "EDIT_STATR_STYLE";
                int i = 2;
                Object[] obj = null;
                if (StringsKt__StringsKt.O2(intent, str1, false, i, obj)) {
                   intent = StringsKt__StringsKt.b5(intent, str1, obj, i, obj);
                   obj = new Object[false];
                   a.D().w("VideoTemplateViewBinder", "onDataListStatusChanged: default load item="+intent, obj);
                   if (a.g(intent, str) ^ 1) {
                      this.a.l.t0(new VideoTemplateLoadItemAction(intent, false));
                   }
                }
             }
          }else {
             uEditorDeleg2 = this.a.m.f();
             a.o(uEditorDeleg2, p1);
             if (g7.a(uEditorDeleg2.N())) {
                if (!TextUtils.x(str)) {
                   if (this.a.l.o0().f()) {
                      this.a.l.t0(new VideoTemplateDisableAutoLoadAction());
                   }
                   return;
                }else if(this.a.l.o0().f()){
                   this.a.l.t0(new VideoTemplateLoadItemAction("", 1));
                }
             }
          }
       }
       return;
    }
    public void c(a p0,View p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, m.class, "3")) {
          return;
       }
       a.p(p0, "item");
       a.p(p2, "tag");
       this.a.l.t0(new VideoTemplateChangedAction(p0));
       this.a.H();
       VideoTemplateViewBinder l = this.a.l;
       VideoTemplate videoTemplat = p0.b();
       KwaiAICutStyle aiCutStyle = (videoTemplat != null)? videoTemplat.getAiCutStyle(): null;
       l.t0(new UpdateLyricAction(aiCutStyle));
       if (p0.g()) {
          this.a.l.t0(new VideoTemplatePreloadItemAction(p0));
          VideoSDKPlayerView videoSDKPlay = this.a.m.j();
          if (videoSDKPlay != null) {
             videoSDKPlay.seekToStart();
          }
       }
       m ta = this.a;
       if (ta.j != null) {
          Iterator iterator = ta.k.qh().iterator();
          while (iterator.hasNext()) {
             iterator.next().yd();
          }
          iterator = this.a.k.ih().iterator();
          while (iterator.hasNext()) {
             iterator.next().d();
          }
       }
       return;
    }
    public void d(a p0,View p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, m.class, "4")) {
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
