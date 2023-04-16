package com.yxcorp.gifshow.v3.editor.prettify.beauty.BeautyPicTemplateProcessor$b;
import erd.a;
import com.yxcorp.gifshow.v3.editor.prettify.beauty.BeautyPicTemplateProcessor;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import naa.a;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Beauty;
import com.kuaishou.edit.draft.FeatureId;
import kotlin.jvm.internal.a;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import com.yxcorp.gifshow.v3.editor.prettify.beauty.e;
import maa.a;
import haa.a;
import java.lang.Integer;
import oba.a;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.util.PostUtils;
import qsc.a;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Beauty$b;
import wba.k;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import wba.j;
import qk.f;
import java.util.ArrayList;
import java.util.Set;
import java.util.Map;
import java.util.Collection;
import com.yxcorp.gifshow.edit.previewer.utils.a;
import ekd.q$a;
import ekd.q;
import java.util.Iterator;
import com.kuaishou.edit.draft.Beauty$Item;
import com.kuaishou.edit.draft.Beauty$Item$ID;
import java.lang.Enum;
import java.lang.Iterable;
import com.kuaishou.edit.draft.EffectSource;

public final class BeautyPicTemplateProcessor$b implements a	// class@001147
{
    public final BeautyPicTemplateProcessor b;
    public final c c;
    public final c d;
    public final String e;

    public void BeautyPicTemplateProcessor$b(BeautyPicTemplateProcessor p0,c p1,c p2,String p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, BeautyPicTemplateProcessor$b.class, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       String str = "BeautyPicTemplateProcessor";
       a.D().w(str, "apply: ", objArray1);
       a uoa = this.c.u0();
       Beauty uBeauty = (uoa != null)? uoa.v(): objArray;
       if (uBeauty == null) {
          objArray = new Object[i];
          a.D().A(str, "apply: template beauty draft is null", objArray);
          return;
       }else {
          FeatureId featureId = uBeauty.getFeatureId();
          a.o(featureId, "templateBeauty.featureId");
          BeautifyConfig uBeautifyCon = this.b.b.r(featureId.getInternalValue());
          if (uBeautifyCon == null || uBeautifyCon.mId <= null) {
             Object[] objArray2 = new Object[i];
             a.D().A(str, "apply: config invalid: "+uBeauty, objArray2);
             return;
          }else {
             a uoa1 = a.c(this.d);
             if (!uoa1.D()) {
                return;
             }else {
                Integer integer = a.a(uoa1, this.e);
                if (integer == null) {
                   PostUtils.F(str, "apply: asset not found: "+this.e);
                   return;
                }else {
                   uoa1 = uoa1.f0(integer.intValue(), true);
                   if (uoa1 == null) {
                      PostUtils.F(str, "apply: asset sub beauty draft is null");
                      return;
                   }else {
                      this.b.i(uoa1);
                      Beauty$b uob = uoa1.k().clear().mergeFrom(uBeauty);
                      uob.copyOnWrite();
                      uob.instance.clearItem();
                      ArrayList uArrayList = PatchProxy.applyOneRefs(uBeauty, objArray, k.class, "5");
                      if (uArrayList != PatchProxyResult.class) {
                      }else {
                         List list = q.g(new ArrayList(j.a.inverse().keySet()), a.a);
                         ArrayList uArrayList1 = new ArrayList();
                         Iterator iterator = uBeauty.getItemList().iterator();
                         while (iterator.hasNext()) {
                            Beauty$Item item = iterator.next();
                            if (list.contains(item.getId().toString())) {
                               uArrayList1.add(item);
                            }
                         }
                         uArrayList = uArrayList1;
                      }
                      uob.a(uArrayList);
                      uob.copyOnWrite();
                      uob.instance.setEffectSource(EffectSource.PIC_TEMPLATE);
                      this.b.g(uoa1);
                      return;
                   }
                }
             }
          }
       }
    }
}
