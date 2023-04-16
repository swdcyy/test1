package com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateApplyAction$a;
import erd.o;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateApplyAction;
import java.util.List;
import androidx.lifecycle.ViewModelProvider;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.v3.framework.KSStore;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.e;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import buc.j;
import buc.f;
import androidx.lifecycle.ViewModel;
import qsc.c;
import brd.a;

public final class PicTemplateApplyAction$a implements o	// class@00134d
{
    public final PicTemplateApplyAction b;
    public final List c;
    public final ViewModelProvider d;
    public final c e;
    public final KSStore f;

    public void PicTemplateApplyAction$a(PicTemplateApplyAction p0,List p1,ViewModelProvider p2,c p3,KSStore p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public Object apply(Object p0){
       a uoa = PatchProxy.applyOneRefs(p0, this, PicTemplateApplyAction$a.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          a.p(p0, "templateDraft");
          PicTemplateApplyAction$a tc = this.c;
          ArrayList uArrayList = new ArrayList(u.Y(tc, 10));
          Iterator iterator = tc.iterator();
          while (iterator.hasNext()) {
             j oj = iterator.next();
             ViewModel viewModel = this.d.get(f.class);
             a.o(viewModel, "get\(T::class.java\)");
             List list = viewModel.o0();
             ArrayList uArrayList1 = new ArrayList(u.Y(list, 10));
             Iterator iterator1 = list.iterator();
             while (iterator1.hasNext()) {
                uArrayList1.add(iterator1.next().c(this.e, oj.getId(), p0));
             }
             uArrayList.add(a.i(uArrayList1).b(this.b.saveTemplateInfoToDraft(this.f, this.e, oj.getId(), this.b.getTemplate().getId())));
          }
          uoa = a.i(uArrayList);
       }
       return uoa;
    }
}
