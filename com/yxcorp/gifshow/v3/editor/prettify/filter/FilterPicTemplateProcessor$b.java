package com.yxcorp.gifshow.v3.editor.prettify.filter.FilterPicTemplateProcessor$b;
import erd.a;
import com.yxcorp.gifshow.v3.editor.prettify.filter.FilterPicTemplateProcessor;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import saa.a;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.ColorFilter;
import maa.a;
import haa.a;
import java.lang.Integer;
import oba.a;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.util.PostUtils;
import qsc.a;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.ColorFilter$b;
import com.kuaishou.edit.draft.EffectSource;
import java.util.List;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import java.io.File;
import oba.b;

public final class FilterPicTemplateProcessor$b implements a	// class@001162
{
    public final FilterPicTemplateProcessor b;
    public final c c;
    public final c d;
    public final String e;

    public void FilterPicTemplateProcessor$b(FilterPicTemplateProcessor p0,c p1,c p2,String p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void run(){
       Object[] objArray1;
       if (PatchProxy.applyVoid(null, this, FilterPicTemplateProcessor$b.class, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("FilterPicTemplateProcessor", "apply: ", objArray);
       a uoa = this.c.r0();
       if (uoa == null) {
          objArray1 = new Object[i];
          a.D().A("FilterPicTemplateProcessor", "apply: template color filter draft is null", objArray1);
          return;
       }else {
          ColorFilter uColorFilter = uoa.v();
          if (uColorFilter == null) {
             objArray1 = new Object[i];
             a.D().A("FilterPicTemplateProcessor", "apply: template color filter is null", objArray1);
             return;
          }else {
             a uoa1 = a.c(this.d);
             if (!uoa1.D()) {
                return;
             }
             Integer integer = a.a(uoa1, this.e);
             if (integer == null) {
                PostUtils.F("FilterPicTemplateProcessor", "apply: asset not found: "+this.e);
                return;
             }else {
                uoa1 = uoa1.g0(integer.intValue(), true);
                if (uoa1 == null) {
                   PostUtils.F("FilterPicTemplateProcessor", "apply: asset sub color filter draft is null");
                   return;
                }else {
                   this.b.i(uoa1);
                   ColorFilter$b uob = uoa1.k().clear().mergeFrom(uColorFilter);
                   uob.copyOnWrite();
                   uob.instance.setEffectSource(EffectSource.PIC_TEMPLATE);
                   uob.b();
                   List resourcesLis = uColorFilter.getResourcesList();
                   a.o(resourcesLis, "templateColorFilter.resourcesList");
                   Iterator iterator = resourcesLis.iterator();
                   while (iterator.hasNext()) {
                      String str = iterator.next();
                      a.o(str, "it");
                      File uFile = b.a(this.c, str);
                      if (uFile == null) {
                         Object[] objArray2 = new Object[i];
                         a.D().A("FilterPicTemplateProcessor", "apply: template resource invalid: "+str, objArray2);
                      }else {
                         uob.a(uoa1.Q(uFile.getAbsolutePath()));
                      }
                   }
                   this.b.g(uoa1);
                   return;
                }
             }
          }
       }
    }
}
