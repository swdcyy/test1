package com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateDownloadResFailureAction;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateAction;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$ResourceState;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplate;
import java.util.Collection;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$b;
import buc.j;
import java.io.File;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$a;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$c;
import tvc.e;

public final class PicTemplateDownloadResFailureAction extends PicTemplateAction	// class@001365
{
    public final PicTemplateState$e template;

    public void PicTemplateDownloadResFailureAction(PicTemplateState$e p0){
       a.p(p0, "template");
       super();
       this.template = p0;
    }
    public final PicTemplateState$e getTemplate(){
       return this.template;
    }
    public PicTemplateState reduce(PicTemplateState p0){
       Object obj = this;
       Object obj1 = p0;
       List obj2 = PatchProxy.applyOneRefs(obj1, obj, PicTemplateDownloadResFailureAction.class, "1");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       a.p(obj1, "state");
       obj2 = p0.r();
       int i = 10;
       ArrayList uArrayList = new ArrayList(u.Y(obj2, i));
       Iterator iterator = obj2.iterator();
       while (iterator.hasNext()) {
          PicTemplateState$e uoe = iterator.next();
          if (a.g(uoe.getId(), obj.template.getId())) {
             uoe = PicTemplateState$e.a(uoe, null, null, 0, false, false, PicTemplateState$ResourceState.MISSING, false, null, false, 471, null);
          }
          uArrayList.add(uoe);
       }
       int i1 = 0;
       obj2 = p0.d();
       ArrayList uArrayList1 = new ArrayList(u.Y(obj2, i));
       iterator = obj2.iterator();
       while (iterator.hasNext()) {
          PicTemplateState$b uob = iterator.next();
          if (uob.d() != null) {
             uob = PicTemplateState$b.a(uob, null, null, false, null, null, null, 55, null);
          }
          uArrayList1.add(uob);
       }
       return PicTemplateState.a(p0, uArrayList1, i1, 0, uArrayList, false, false, false, 0, 0, 0, 0, null, null, 0, 0x3ff6, null);
    }
    public e reduce(e p0){
       return this.reduce(p0);
    }
}
