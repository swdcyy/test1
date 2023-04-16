package com.yxcorp.gifshow.v3.editor.text.dynamic.vm.DynamicTextViewModel$d;
import erd.g;
import com.yxcorp.gifshow.v3.editor.text.dynamic.vm.DynamicTextViewModel;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.text.dynamic.vm.DynamicTextViewModel$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import kotlin.jvm.internal.a;
import java.util.Collection;
import di0.b;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.edit.draft.FeatureId;
import orc.f;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.v3.editor.text.dynamic.repo.DynamicTextRepo;
import com.yxcorp.gifshow.v3.editor.text.dynamic.repo.DynamicTextRepo$a;

public final class DynamicTextViewModel$d implements g	// class@0013eb
{
    public final DynamicTextViewModel b;
    public final List c;
    public final boolean d;
    public final boolean e;
    public final DynamicTextViewModel$a f;

    public void DynamicTextViewModel$d(DynamicTextViewModel p0,List p1,boolean p2,boolean p3,DynamicTextViewModel$a p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public void accept(Object p0){
       DynamicTextViewModel$d tb;
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicTextViewModel$d.class, "1")) {
       }else {
          int i = 0;
          Object[] objArray = new Object[i];
          a.D().w("DynamicTextViewModel", "fetchConfigAndPreDownload convert success", objArray);
          a.o(p0, "it");
          int i1 = 1;
          if (p0.isEmpty() ^ i1) {
             b.t(this.b.t0(), p0, null, 2, null);
             tb = this.b;
             DynamicTextViewModel$d tc = this.c;
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoidOneRefs(tc, tb, DynamicTextViewModel.class, "5")) {
                ArrayList uArrayList = new ArrayList();
                Iterator iterator = tc.iterator();
                while (iterator.hasNext()) {
                   String str = f.a(iterator.next());
                   if (str != null) {
                      uArrayList.add(str);
                   }
                }
                Object[] objArray2 = new Object[i];
                a.D().w("DynamicTextViewModel", "preDownloadNeededDynamicTextParams preDownloadIdList:"+uArrayList, objArray2);
                if (uArrayList.size() <= 0) {
                   Object[] objArray3 = new Object[i];
                   a.D().w("DynamicTextViewModel", "preDownloadNeededDynamicTextParams size is 0", objArray3);
                }else {
                   tb.v0(i, uArrayList);
                }
             }
          }
          if (this.d != null) {
             DynamicTextRepo.c.a(i1);
          }
          if (this.b.f != null) {
             Object[] objArray1 = new Object[i];
             a.D().w("DynamicTextViewModel", "fetchConfigAndPreDownload needDownloadAllAfterFetch = true", objArray1);
             this.b.v0(this.e, new ArrayList());
          }
          tb = this.f;
          if (tb != null) {
             tb.a(p0);
          }
       }
       return;
    }
}
