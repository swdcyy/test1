package com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateEditorV2$picTemplateViewModelProvider$2$a;
import androidx.lifecycle.ViewModelProvider$Factory;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateEditorV2$picTemplateViewModelProvider$2;
import java.lang.Object;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateEditorV2;
import com.kwai.robust.PatchProxyResult;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import buc.i;
import java.util.Objects;
import lq.i;
import lq.e;
import lq.e$b;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.editor.BaseEditor;
import xvc.f;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$a;
import nsd.u;
import com.kuaishou.edit.draft.Workspace$Type;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$ResourceState;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$c;
import java.util.Set;
import tvc.c;
import buc.e;
import androidx.lifecycle.ViewModelProvider;
import duc.b;
import ztc.n;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateDataRepo;
import com.yxcorp.gifshow.v3.editor.template.data.DefaultPicTemplateProvider;
import ztc.i;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplate;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;

public final class PicTemplateEditorV2$picTemplateViewModelProvider$2$a implements ViewModelProvider$Factory	// class@001340
{
    public final PicTemplateEditorV2$picTemplateViewModelProvider$2 a;

    public void PicTemplateEditorV2$picTemplateViewModelProvider$2$a(PicTemplateEditorV2$picTemplateViewModelProvider$2 p0){
       this.a = p0;
       super();
    }
    public ViewModel create(Class p0){
       i oi;
       boolean b;
       Workspace$Type type;
       ViewModelProvider viewModelPro;
       Object obj = this;
       PicTemplateEditorV2$picTemplateViewModelProvider$2 obj1 = p0;
       PicTemplateEditorV2 picTemplateE = PicTemplateEditorV2.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj2 = PatchProxy.applyOneRefs(obj1, obj, PicTemplateEditorV2$picTemplateViewModelProvider$2$a.class, "1");
       if (obj2 != patchProxyRe) {
          return obj2;
       }
       a.p(obj1, "modelClass");
       Object[] objArray = null;
       if (a.g(obj1, i.class)) {
          obj1 = obj.a.this$0;
          Objects.requireNonNull(obj1);
          oi = PatchProxy.apply(objArray, obj1, picTemplateE, "5");
          if (oi != patchProxyRe) {
          }else if(i.h()){
             e$b uob = i.m().k().k();
             if (uob != null) {
                b = uob.a();
             label_0052 :
                EditorDelegate uEditorDeleg = obj1.i();
                a.o(uEditorDeleg, "delegate");
                f uof = uEditorDeleg.f();
                a.o(uof, "delegate.editRepo");
                EditorDelegate uEditorDeleg1 = obj1.i();
                a.o(uEditorDeleg1, "delegate");
                type = uEditorDeleg1.getType();
                a.o(type, "delegate.type");
                PicTemplateState picTemplateS = new PicTemplateState(CollectionsKt__CollectionsKt.E(), PicTemplateState$ResourceState.UNKNOWN, CollectionsKt__CollectionsKt.E(), CollectionsKt__CollectionsKt.E(), null, false, false, 0, 0, 0, 0, new PicTemplateState$a(false, b, 1, objArray), type, new PicTemplateState$c(objArray, 1, objArray));
                c[] uocArray = new c[]{new e(viewModelPro),new b()};
                viewModelPro = obj1.X();
                a.o(viewModelPro, "picTemplateViewModelProvider");
                oi = new i(uof, v9, uocArray);
             }
          }
          b = false;
          goto label_0052 ;
       }else if(a.g(obj1, n.class)){
          obj1 = obj.a.this$0;
          Objects.requireNonNull(obj1);
          n on = PatchProxy.apply(objArray, obj1, picTemplateE, "4");
          if (on != patchProxyRe) {
          }else {
             on = new n(new PicTemplateDataRepo(new DefaultPicTemplateProvider(1), objArray));
          }
          oi = on;
       }else {
          PostUtils.D("Pic_Template", "无法创建ViewModel:"+obj1, new Throwable());
          oi = p0.newInstance();
       }
       Objects.requireNonNull(oi, "null cannot be cast to non-null type T");
       return oi;
    }
}
