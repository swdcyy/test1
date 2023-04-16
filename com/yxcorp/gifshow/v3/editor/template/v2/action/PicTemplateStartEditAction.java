package com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateStartEditAction;
import duc.c;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateDraftAction;
import androidx.lifecycle.ViewModelProvider;
import com.yxcorp.gifshow.v3.framework.KSStore;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import crd.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.util.PostUtils;
import uwc.b;
import androidx.lifecycle.ViewModel;
import com.yxcorp.gifshow.v3.previewer.player.viewmodel.PicturesViewModel;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateSwitchAssetAction;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$b;
import buc.j;
import tvc.a;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$ResourceState;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateRefreshListAction;
import java.util.Objects;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import com.kuaishou.edit.draft.Workspace$Type;
import swc.f;
import swc.c;
import java.util.concurrent.atomic.AtomicInteger;
import buc.f;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import qsc.c;
import brd.a;
import java.util.Collection;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateStartEditAction$a;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateStartEditAction$b;
import erd.a;
import erd.g;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$a;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$c;
import tvc.e;

public final class PicTemplateStartEditAction extends PicTemplateDraftAction implements c	// class@001378
{

    public void PicTemplateStartEditAction(){
       super();
    }
    public b handle(ViewModelProvider p0,KSStore p1,PicTemplateState p2,c p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, PicTemplateStartEditAction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "vmp");
       a.p(p1, "store");
       a.p(p2, "state");
       a.p(p3, "draft");
       if (p2.k()) {
          PostUtils.F("PicTemplateAction", "start when illegal state");
          return null;
       }else {
          this.handleInitCurrentAsset(p0, p1, p2);
          this.handleInitTemplateList(p1, p2);
          return this.handleProcessorStart(p0, p1, p3);
       }
    }
    public final void handleInitCurrentAsset(ViewModelProvider p0,KSStore p1,PicTemplateState p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, PicTemplateStartEditAction.class, "3")) {
          return;
       }
       ViewModel viewModel = p0.get(b.class);
       a.o(viewModel, "get\(T::class.java\)");
       int i = viewModel.q0();
       if (p2.m() != i) {
          PicTemplateState$b uob = CollectionsKt___CollectionsKt.F2(p2.d(), i);
          if (uob == null) {
             uob = CollectionsKt___CollectionsKt.m2(p2.d());
          }
          this.post(p1, new PicTemplateSwitchAssetAction(uob, false));
       }
       return;
    }
    public final void handleInitTemplateList(KSStore p0,PicTemplateState p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PicTemplateStartEditAction.class, "4")) {
          return;
       }
       if (p1.q() == PicTemplateState$ResourceState.UNKNOWN) {
          this.post(p0, new PicTemplateRefreshListAction());
       }
       return;
    }
    public final b handleProcessorStart(ViewModelProvider p0,KSStore p1,c p2){
       b uob = b.class;
       ViewModel obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, PicTemplateStartEditAction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.get(uob);
       String str = "get\(T::class.java\)";
       a.o(obj, str);
       Objects.requireNonNull(obj);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, obj, uob, "33")) {
          Workspace$Type lONG_PICTURE = Workspace$Type.LONG_PICTURE;
          if (obj.t0().getValue() == lONG_PICTURE) {
             c uoc = obj.x0();
             AtomicInteger value = obj.s0().getValue();
             int i = (value != null)? value.get(): 0;
             int i1 = uoc.A(i);
             c uoc1 = obj.x0();
             Objects.requireNonNull(uoc1);
             if (!PatchProxy.applyVoid(objArray, uoc1, c.class, "23") && uoc1.i().getValue() == lONG_PICTURE) {
                uoc1.k = lONG_PICTURE;
                uoc1.w(Workspace$Type.ATLAS, true);
             }
             AtomicInteger value1 = obj.s0().getValue();
             if (value1 == null || value1.get() != i1) {
                obj.s0().setValue(new AtomicInteger(i1));
             }
          }
       }
       ViewModel viewModel = p0.get(f.class);
       a.o(viewModel, str);
       List list = viewModel.o0();
       ArrayList uArrayList = new ArrayList(u.Y(list, 10));
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(iterator.next().d(p2));
       }
       return a.i(uArrayList).u(new PicTemplateStartEditAction$a(this, p0, p1), new PicTemplateStartEditAction$b(this, p1));
    }
    public PicTemplateState reduce(PicTemplateState p0){
       Object obj = p0;
       Object obj1 = PatchProxy.applyOneRefs(obj, this, PicTemplateStartEditAction.class, "5");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       a.p(obj, "state");
       return PicTemplateState.a(p0, null, null, null, null, true, true, false, (p0.h() + 1), 0, (p0.i() + 1), 0, null, null, null, 0x3d4f, null);
    }
    public e reduce(e p0){
       return this.reduce(p0);
    }
}
