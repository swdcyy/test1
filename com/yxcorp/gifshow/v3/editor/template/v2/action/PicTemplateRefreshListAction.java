package com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateRefreshListAction;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateAction;
import androidx.lifecycle.ViewModelProvider;
import com.yxcorp.gifshow.v3.framework.KSStore;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState;
import crd.b;
import ztc.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$ResourceState;
import androidx.lifecycle.ViewModel;
import java.util.Objects;
import ftd.z1;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateDataRepo;
import androidx.lifecycle.LiveData;
import brd.t;
import fuc.b;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateRefreshListAction$a;
import erd.r;
import brd.a0;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateRefreshListAction$b;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateRefreshListAction$c;
import erd.g;
import tvc.e;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$a;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$c;

public final class PicTemplateRefreshListAction extends PicTemplateAction	// class@001372
{

    public void PicTemplateRefreshListAction(){
       super();
    }
    public b handle(ViewModelProvider p0,KSStore p1,PicTemplateState p2){
       n on = n.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, PicTemplateRefreshListAction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "vmp");
       a.p(p1, "store");
       a.p(p2, "state");
       if (p2.q() == PicTemplateState$ResourceState.LOADING) {
          return null;
       }
       ViewModel viewModel = p0.get(on);
       a.o(viewModel, "get\(T::class.java\)");
       Objects.requireNonNull(viewModel);
       if (!PatchProxy.applyVoid(null, viewModel, on, "3")) {
          viewModel.d.b();
       }
       return b.a(viewModel.b).observeOn(d.c).filter(PicTemplateRefreshListAction$a.b).firstOrError().R(new PicTemplateRefreshListAction$b(this, p1), new PicTemplateRefreshListAction$c(this, p1));
    }
    public b handle(ViewModelProvider p0,KSStore p1,e p2){
       return this.handle(p0, p1, p2);
    }
    public PicTemplateState reduce(PicTemplateState p0){
       Object obj = p0;
       Object obj1 = PatchProxy.applyOneRefs(obj, this, PicTemplateRefreshListAction.class, "2");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       a.p(obj, "state");
       PicTemplateState$ResourceState lOADING = PicTemplateState$ResourceState.LOADING;
       if (p0.q() == lOADING) {
          return obj;
       }
       return PicTemplateState.a(p0, null, lOADING, null, null, false, false, false, 0, 0, 0, 0, null, null, null, 0x3ffd, null);
    }
    public e reduce(e p0){
       return this.reduce(p0);
    }
}
