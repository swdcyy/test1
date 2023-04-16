package com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateDownloadResAction;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateAction;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.ViewModelProvider;
import com.yxcorp.gifshow.v3.framework.KSStore;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState;
import crd.b;
import ztc.n;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.ViewModel;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplate;
import java.util.Objects;
import androidx.lifecycle.LiveData;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplate$b;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplate$b$a;
import androidx.lifecycle.MutableLiveData;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplate$b$c;
import kotlinx.coroutines.CoroutineExceptionHandler;
import ztc.o;
import kotlin.coroutines.CoroutineContext$b;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateDataViewModel$downLoadPicTemplate$2;
import asd.c;
import ftd.k0;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import ftd.z1;
import kotlinx.coroutines.a;
import brd.t;
import fuc.b;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateDownloadResAction$a;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateDownloadResAction$b;
import erd.g;
import tvc.e;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$ResourceState;
import cuc.c;
import java.lang.Enum;
import java.util.List;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import java.util.Collection;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$a;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$c;

public final class PicTemplateDownloadResAction extends PicTemplateAction	// class@001364
{
    public final PicTemplateState$e template;

    public void PicTemplateDownloadResAction(PicTemplateState$e p0){
       a.p(p0, "template");
       super();
       this.template = p0;
    }
    public final PicTemplateState$e getTemplate(){
       return this.template;
    }
    public b handle(ViewModelProvider p0,KSStore p1,PicTemplateState p2){
       PicTemplate$b$a a;
       n on = n.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       MutableLiveData obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, PicTemplateDownloadResAction.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "vmp");
       a.p(p1, "store");
       a.p(p2, "state");
       ViewModel viewModel = p0.get(on);
       a.o(viewModel, "get\(T::class.java\)");
       PicTemplate picTemplate = this.template.b();
       Objects.requireNonNull(viewModel);
       obj = PatchProxy.applyOneRefs(picTemplate, viewModel, on, "1");
       if (obj != patchProxyRe) {
       }else {
          a.p(picTemplate, "picTemplate");
          Object[] objArray = new Object[0];
          a.D().w("PicTemplateDataViewModel", "downLoadPicTemplate\(\) called with: picTemplate = "+picTemplate, objArray);
          a = PicTemplate$b$a.a;
          if (a.g(picTemplate.getResourceState(), a)) {
             obj = viewModel.o0(picTemplate);
             obj.setValue(a);
          }else if(viewModel.o0(picTemplate).getValue() instanceof PicTemplate$b$c){
             obj = viewModel.o0(picTemplate);
          }else {
             viewModel.o0(picTemplate).setValue(new PicTemplate$b$c(0));
             n a1 = viewModel.a;
             o oo = PatchProxy.applyOneRefs(picTemplate, viewModel, on, "6");
             if (oo != patchProxyRe) {
             }else {
                oo = new o(CoroutineExceptionHandler.u0, viewModel, picTemplate);
             }
             a.f(a1, oo, null, new PicTemplateDataViewModel$downLoadPicTemplate$2(viewModel, picTemplate, null), 2, null);
             obj = viewModel.o0(picTemplate);
          }
       }
       return b.a(obj).subscribe(new PicTemplateDownloadResAction$a(this, p1), new PicTemplateDownloadResAction$b(this, p1));
    }
    public b handle(ViewModelProvider p0,KSStore p1,e p2){
       return this.handle(p0, p1, p2);
    }
    public PicTemplateState reduce(PicTemplateState p0){
       Object obj = this;
       PicTemplateState picTemplateS = p0;
       Object obj1 = PatchProxy.applyOneRefs(picTemplateS, obj, PicTemplateDownloadResAction.class, "2");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       a.p(picTemplateS, "state");
       int i = c.a[obj.template.f().ordinal()];
       if (i != 1 && i != 2) {
          List list = p0.r();
          ArrayList uArrayList = new ArrayList(u.Y(list, 10));
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             PicTemplateState$e uoe = iterator.next();
             if (a.g(uoe.getId(), obj.template.getId())) {
                uoe = PicTemplateState$e.a(uoe, null, null, 0, false, false, PicTemplateState$ResourceState.LOADING, false, null, false, 479, null);
             }
             uArrayList.add(uoe);
          }
          picTemplateS = PicTemplateState.a(p0, null, null, null, uArrayList, false, false, false, 0, 0, 0, 0, null, null, 0, 0x3ff7, null);
       }
       return picTemplateS;
    }
    public e reduce(e p0){
       return this.reduce(p0);
    }
}
