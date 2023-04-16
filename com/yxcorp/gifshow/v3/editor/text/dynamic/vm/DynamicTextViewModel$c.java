package com.yxcorp.gifshow.v3.editor.text.dynamic.vm.DynamicTextViewModel$c;
import erd.o;
import com.yxcorp.gifshow.v3.editor.text.dynamic.vm.DynamicTextViewModel;
import java.lang.Object;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import faa.a;
import q87.c;
import huc.d;
import huc.u;
import java.lang.Boolean;
import quc.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import nuc.a;
import ypc.a;

public final class DynamicTextViewModel$c implements o	// class@0013e8
{
    public final DynamicTextViewModel b;
    public final boolean c;

    public void DynamicTextViewModel$c(DynamicTextViewModel p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DynamicTextViewModel$c.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          Object[] objArray = new Object[0];
          a.D().w("DynamicTextViewModel", "fetchConfigAndPreDownload load success", objArray);
          d.a(p0);
          u ou = this.b.u0();
          Boolean uBoolean = Boolean.valueOf(this.c);
          obj = PatchProxy.applyThreeRefs(p0, ou, uBoolean, null, a.class, "2");
          if (obj != PatchProxyResult.class) {
          }else {
             a.p(p0, "dynamicTextConfigList");
             obj = new ArrayList();
             p0 = p0.iterator();
             while (p0.hasNext()) {
                a uoa = p0.next();
                boolean b = (uBoolean != null)? uBoolean.booleanValue(): false;
                uoa.z(b);
                obj.add(a.a(uoa, ou));
             }
          }
       }
       return obj;
    }
}
