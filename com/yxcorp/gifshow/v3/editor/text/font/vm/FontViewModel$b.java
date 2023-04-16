package com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel$b;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel;
import java.util.List;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.lang.Iterable;
import d0c.a;
import d0c.d;
import d0c.d$a;
import yuc.f;
import java.lang.Integer;
import com.yxcorp.gifshow.postfont.repo.FontLineSpaceManager;
import di0.b;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.a;

public final class FontViewModel$b implements Callable	// class@001448
{
    public final FontViewModel b;
    public final List c;

    public void FontViewModel$b(FontViewModel p0,List p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object call(){
       String str1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FontViewModel$b obj = PatchProxy.apply(null, this, FontViewModel$b.class, "1");
       if (obj != patchProxyRe) {
       }else {
          obj = this.b;
          FontViewModel$b tc = this.c;
          Objects.requireNonNull(obj);
          FontViewModel uFontViewMod = FontViewModel.class;
          HashMap obj1 = PatchProxy.applyOneRefs(tc, obj, uFontViewMod, "20");
          if (obj1 != patchProxyRe) {
             obj = obj1;
          }else {
             Object[] objArray = new Object[0];
             a.D().w("FontBIZ", "innerAddLocalAndCheckFontState: "+tc.size(), objArray);
             ArrayList uArrayList = new ArrayList();
             obj1 = new HashMap();
             Iterator iterator = tc.iterator();
             while (iterator.hasNext()) {
                a uoa = iterator.next();
                d uod = d.o.a(uoa);
                f.a.a(uod);
                uArrayList.add(uod);
                String str = uoa.c();
                if (str != null) {
                   obj1.put(str, Integer.valueOf(uoa.f()));
                }
             }
             FontLineSpaceManager.c.b(obj1);
             if (!PatchProxy.applyVoidOneRefs(uArrayList, obj, uFontViewMod, "21")) {
                if (obj.g >= null) {
                   d uod1 = obj.w0().u(obj.g);
                   if (uod1 != null) {
                      str1 = uod1.e();
                      if (str1 != null) {
                      label_00ad :
                         obj.g = -1;
                         Iterator iterator1 = (!str1.length())? 1: null;
                         if (iterator1) {
                            if ((uArrayList.isEmpty() ^ 1) && uArrayList.get(0).j()) {
                               uArrayList.get(0).q(1);
                               obj.g = 0;
                            }
                         }else {
                            iterator1 = uArrayList.iterator();
                            int i = 0;
                            while (iterator1.hasNext()) {
                               Object obj2 = iterator1.next();
                               int i1 = i + 1;
                               if (i < 0) {
                                  CollectionsKt__CollectionsKt.W();
                               }
                               if (a.g(str1, obj2.e()) && obj2.j()) {
                                  obj2.q(1);
                                  obj.g = i;
                               }
                               i = i1;
                            }
                            if (obj.g < null && ((uArrayList.isEmpty() ^ 1) && uArrayList.get(0).j())) {
                               uArrayList.get(0).q(1);
                               obj.g = 0;
                            }
                         }
                      }
                   }
                }
                str1 = "";
                goto label_00ad ;
             }
          label_012c :
             obj = uArrayList;
          }
       }
       return obj;
    }
}
