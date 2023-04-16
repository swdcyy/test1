package com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateDownloadResUpdateAction;
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
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$a;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$c;
import tvc.e;

public final class PicTemplateDownloadResUpdateAction extends PicTemplateAction	// class@001368
{
    public final float progress;
    public final PicTemplateState$e template;

    public void PicTemplateDownloadResUpdateAction(PicTemplateState$e p0,float p1){
       a.p(p0, "template");
       super();
       this.template = p0;
       this.progress = p1;
    }
    public final float getProgress(){
       return this.progress;
    }
    public final PicTemplateState$e getTemplate(){
       return this.template;
    }
    public PicTemplateState reduce(PicTemplateState p0){
       Object obj = this;
       Object obj1 = p0;
       Object obj2 = PatchProxy.applyOneRefs(obj1, obj, PicTemplateDownloadResUpdateAction.class, "1");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       a.p(obj1, "state");
       List list = p0.r();
       ArrayList uArrayList = new ArrayList(u.Y(list, 10));
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          PicTemplateState$e uoe = iterator.next();
          if (a.g(uoe.getId(), obj.template.getId())) {
             uoe = PicTemplateState$e.a(uoe, null, null, obj.progress, true, false, PicTemplateState$ResourceState.LOADING, false, null, false, 467, null);
          }
          uArrayList.add(uoe);
       }
       return PicTemplateState.a(p0, null, null, null, uArrayList, false, false, false, 0, 0, 0, 0, null, null, 0, 0x3ff7, null);
    }
    public e reduce(e p0){
       return this.reduce(p0);
    }
}
