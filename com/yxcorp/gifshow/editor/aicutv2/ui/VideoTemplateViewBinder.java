package com.yxcorp.gifshow.editor.aicutv2.ui.VideoTemplateViewBinder;
import pn9.b;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import dca.s;
import com.yxcorp.gifshow.v3.editor.i;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView;
import com.kwai.feature.post.api.widget.ScrollToCenterRecyclerView;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import java.util.ArrayList;
import lnc.a1;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import h69.j;
import k17.b;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.editor.aicutv2.ui.VideoTemplateViewBinder$layoutManager$1;
import android.app.Application;
import o56.a;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.kwai.feature.post.api.util.g;
import com.yxcorp.gifshow.editor.aicutv2.ui.VideoTemplateViewBinder$a;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import com.yxcorp.gifshow.editor.aicutv2.ui.VideoTemplateViewBinder$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import dca.n;
import dca.m;
import dca.o;
import jn9.e;
import pn9.c;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$b;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$a;
import com.yxcorp.gifshow.component.postlistcomponent.SelectScrollOption;
import nsd.u;
import jn9.b;
import androidx.lifecycle.LifecycleOwner;
import lnc.g7;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import androidx.fragment.app.FragmentActivity;
import android.content.Intent;
import android.app.Activity;
import tkd.b;
import tkd.d;
import h69.b;
import brd.t;
import gr8.b;
import com.trello.rxlifecycle3.components.support.RxFragment;
import brd.x;
import dca.k;
import dca.l;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.editor.aicutv2.ui.VideoTemplateViewBinder$c;
import androidx.recyclerview.widget.RecyclerView$o;
import tvc.f;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import com.yxcorp.gifshow.editor.aicutv2.ui.VideoTemplateViewBinder$d;
import androidx.lifecycle.Observer;
import dzc.a;
import java.util.Objects;
import com.yxcorp.gifshow.editor.aicutv2.ui.VideoTemplateFragment;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Integer;
import mn9.a;
import eca.g;
import java.lang.StringBuilder;
import java.lang.IndexOutOfBoundsException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import xoc.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonArray;
import com.yxcorp.gifshow.aicut.VideoTemplate;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import android.view.ViewGroup;
import androidx.fragment.app.KwaiDialogFragment;

public final class VideoTemplateViewBinder extends b	// class@001b97
{
    public a c;
    public final PostListComponentView d;
    public final ScrollToCenterRecyclerView e;
    public final View f;
    public final KwaiLoadingView g;
    public AttrAnimProgressFragment h;
    public final List i;
    public boolean j;
    public final BaseEditorFragment k;
    public final s l;
    public final i m;

    public void VideoTemplateViewBinder(BaseEditorFragment p0,s p1,i p2,View p3){
       String stringExtra;
       Object obj = p0;
       Object obj1 = p1;
       Object obj2 = p2;
       e obj3 = p3;
       a.p(obj, "fragment");
       a.p(obj1, "viewModel");
       a.p(obj2, "editorHelperContract");
       a.p(obj3, "rootView");
       super(obj3);
       this.k = obj;
       this.l = obj1;
       this.m = obj2;
       View view = obj3.findViewById(R.id.recycler_view_container);
       a.o(view, "rootView.findViewById\(R.бн.recycler_view_container\)");
       View view1 = view;
       this.d = view1;
       view = obj3.findViewById(R.id.recycler_view);
       a.o(view, "rootView.findViewById\(R.id.recycler_view\)");
       View view2 = view;
       this.e = view2;
       view = obj3.findViewById(R.id.retry_btn);
       a.o(view, "rootView.findViewById\(R.id.retry_btn\)");
       this.f = view;
       View view3 = obj3.findViewById(R.id.loading_view);
       a.o(view3, "rootView.findViewById\(R.id.loading_view\)");
       this.g = view3;
       this.i = new ArrayList();
       int i = a1.e(6.00f);
       EditorDelegate uEditorDeleg = p2.f();
       a.o(uEditorDeleg, "editorHelperContract.editorDelegate");
       boolean b = j.j(uEditorDeleg.N());
       int i1 = 0;
       if (!b) {
          view2.setLeftMargin(i);
          view2.setItemWidth(a1.e(64.00f));
          view2.addItemDecoration(new b(i1, a1.e(16.00f), i));
       }
       view2.setLayoutManager(new VideoTemplateViewBinder$layoutManager$1(b, a.b(), i1, i1));
       View[] viewArray = new View[]{view};
       g.t(viewArray);
       view.setOnClickListener(new VideoTemplateViewBinder$a(this));
       obj3.findViewById(R.id.origin_theme).setOnClickListener(new VideoTemplateViewBinder$b(this));
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, VideoTemplateViewBinder.class, "2")) {
          obj3 = v7;
          e uoe = v7;
          Object[] objArray1 = objArray;
          obj3 = new e(new n(this), new m(this), new o(this), this, null, null, 48, 0);
          view1.a(uoe, obj, p1.z0());
          EditorDelegate uEditorDeleg1 = p2.f();
          a.o(uEditorDeleg1, "editorHelperContract.editorDelegate");
          if (g7.a(uEditorDeleg1.N())) {
             double d = EditorSdk2UtilsV2.getDisplayDuration(p2.e()) * (double)1000.00f;
             FragmentActivity uFragmentAct = p0.jh();
             if (uFragmentAct != null) {
                Intent intent = uFragmentAct.getIntent();
                if (intent != null) {
                   stringExtra = intent.getStringExtra("editSessionId");
                label_013d :
                   d.a(-873393519).cP((long)d, stringExtra).compose(p0.ge()).subscribe(k.b, l.b);
                }
             }
             stringExtra = objArray1;
             goto label_013d ;
          }
       }
       view2.addOnChildAttachStateChangeListener(new VideoTemplateViewBinder$c(this));
       p1.r0().observe(obj, new VideoTemplateViewBinder$d(this));
       return;
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, VideoTemplateViewBinder.class, "6")) {
          return;
       }
       FragmentActivity uFragmentAct = this.k.jh();
       a.o(uFragmentAct, "fragment.currentActivity");
       this.c = new a(uFragmentAct);
       this.d.c();
       VideoTemplateViewBinder tk = this.k;
       Objects.requireNonNull(tk, "null cannot be cast to non-null type com.yxcorp.gifshow.editor.aicutv2.ui.VideoTemplateFragment");
       this.j = tk.K;
       return;
    }
    public void C(){
       b a;
       VideoTemplateViewBinder videoTemplat = VideoTemplateViewBinder.class;
       if (PatchProxy.applyVoid(null, this, videoTemplat, "7")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, videoTemplat, "8")) {
          ArrayList uArrayList = new ArrayList();
          List list = this.l.z0().m();
          Iterator iterator = new ArrayList(this.d.getShowedItemPositionList()).iterator();
          while (iterator.hasNext()) {
             Integer integer = iterator.next();
             if (integer.intValue() < 0 || integer.intValue() >= list.size()) {
                PostUtils.D("VideoTemplateViewBinder", "showedItemPosition exceeds list size, position="+integer+", size="+list.size(), new IndexOutOfBoundsException());
             }else {
                a.o(integer, "absolutePosition");
                a uoa = list.get(integer.intValue());
                if (!uoa instanceof g || uoa.d != null) {
                   continue ;
                }else {
                   String id = uoa.getId();
                   if (!this.i.contains(id)) {
                      uArrayList.add(uoa);
                      this.i.add(id);
                   }
                }
             }
          }
          if (uArrayList.isEmpty() ^ 0x01) {
             a = b.a;
             Objects.requireNonNull(a);
             if (!PatchProxy.applyVoidOneRefs(uArrayList, a, b.class, "5")) {
                a.p(uArrayList, "templateList");
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "SHOW_CUT_STYLE";
                JsonArray jsonArray = new JsonArray();
                Iterator iterator1 = uArrayList.iterator();
                while (iterator1.hasNext()) {
                   g og = iterator1.next();
                   VideoTemplate videoTemplat1 = og.b();
                   if (videoTemplat1 != null) {
                      JsonObject jsonObject = new JsonObject();
                      jsonObject.c0("style_id", videoTemplat1.getId());
                      jsonObject.c0("style_name", videoTemplat1.getName());
                      jsonObject.c0("style_groupid", og.c());
                      jsonObject.c0("style_groupname", og.e());
                      jsonArray.G(jsonObject);
                   }
                }
                if (jsonArray.size() > 0) {
                   uElementPack.params = jsonArray.toString();
                   u1.u0(6, uElementPack, null);
                }
             }
          }
          this.d.b();
          this.i.clear();
       }
       videoTemplat = this.c;
       if (videoTemplat != null) {
          videoTemplat.a();
       }
       this.e.clearOnChildAttachStateChangeListeners();
       return;
    }
    public RecyclerView D(){
       return this.e;
    }
    public void E(){
       if (PatchProxy.applyVoid(null, this, VideoTemplateViewBinder.class, "5")) {
          return;
       }
       this.e.setVisibility(0);
       this.f.setVisibility(8);
       this.g.setVisibility(8);
       this.g.i();
       return;
    }
    public void F(){
       if (PatchProxy.applyVoid(null, this, VideoTemplateViewBinder.class, "4")) {
          return;
       }
       this.e.setVisibility(8);
       this.f.setVisibility(0);
       this.g.setVisibility(8);
       this.g.i();
       return;
    }
    public void G(){
       if (PatchProxy.applyVoid(null, this, VideoTemplateViewBinder.class, "3")) {
          return;
       }
       this.e.setVisibility(8);
       this.f.setVisibility(8);
       this.g.setVisibility(0);
       this.g.h();
       return;
    }
    public final void H(){
       if (PatchProxy.applyVoid(null, this, VideoTemplateViewBinder.class, "12")) {
          return;
       }
       VideoTemplateViewBinder th = this.h;
       if (th != null) {
          th.dismissAllowingStateLoss();
       }
       this.h = null;
       return;
    }
}
