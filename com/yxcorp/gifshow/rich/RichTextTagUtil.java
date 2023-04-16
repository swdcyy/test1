package com.yxcorp.gifshow.rich.RichTextTagUtil;
import com.yxcorp.gifshow.rich.RichTextTagUtil$a;
import java.lang.reflect.Type;
import el.a;
import com.yxcorp.gifshow.rich.RichTextTagUtil$RICH_TAG_LIST$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.model.config.ActivityInfo;
import gw8.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import tfc.a;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;

public final class RichTextTagUtil	// class@001b1b
{
    public static final Type a;
    public static final p b;
    public static final RichTextTagUtil c;

    static {
       RichTextTagUtil.c = new RichTextTagUtil();
       RichTextTagUtil.a = new RichTextTagUtil$a().getType();
       RichTextTagUtil.b = s.c(RichTextTagUtil$RICH_TAG_LIST$2.INSTANCE);
    }
    public void RichTextTagUtil(){
       super();
    }
    public static final String a(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       RichTextTagUtil richTextTagU = RichTextTagUtil.class;
       ActivityInfo uActivityInf = null;
       String obj = PatchProxy.applyOneRefs(p0, uActivityInf, richTextTagU, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = "tag";
       a.p(p0, obj);
       ActivityInfo uActivityInf1 = a.a(p0);
       ActivityInfo mKsOrderId = (uActivityInf1 != null)? uActivityInf1.mKsOrderId: uActivityInf;
       if (!TextUtils.isEmpty(mKsOrderId)) {
          if (uActivityInf1 != null) {
             uActivityInf = uActivityInf1.mKsOrderId;
          }
       }else {
          List obj1 = PatchProxy.applyOneRefs(p0, uActivityInf, richTextTagU, "2");
          if (obj1 != patchProxyRe) {
          }else {
             a.p(p0, obj);
             RichTextTagUtil c = RichTextTagUtil.c;
             obj1 = c.b();
             boolean b = (obj1 == null || obj1.isEmpty())? true: false;
             if (b || TextUtils.isEmpty(p0)) {
                obj1 = uActivityInf;
             }else {
                Iterator iterator = c.b().iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      obj1 = iterator.next();
                      if (!TextUtils.equals(p0, obj1.name)) {
                         continue ;
                      }
                   }else {
                      obj1 = uActivityInf;
                   }
                }
             }
          }
          if (obj1 != null) {
             uActivityInf = obj1.ksOrderId;
          }
       }
       return uActivityInf;
    }
    public final List b(){
       Object obj = PatchProxy.apply(null, this, RichTextTagUtil.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RichTextTagUtil.b.getValue();
    }
}
