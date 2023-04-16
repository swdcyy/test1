package com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxItemDeserializerStopWhenFailed;
import com.google.gson.b;
import ok.h;
import java.lang.Object;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxBaseItem;
import java.lang.Iterable;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.lang.reflect.Modifier;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxItemDeserializerStopWhenFailed$a;
import al.c;
import java.lang.annotation.Annotation;
import ekd.j;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import com.google.gson.JsonObject;
import java.util.Iterator;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ekd.k0;
import java.lang.IllegalAccessException;
import mkd.a;

public class NoticeBoxItemDeserializerStopWhenFailed implements b	// class@001256
{
    public final h a;

    public void NoticeBoxItemDeserializerStopWhenFailed(h p0){
       super();
       this.a = p0;
    }
    public Iterable a(NoticeBoxBaseItem p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, NoticeBoxItemDeserializerStopWhenFailed.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Field[] fields = p0.getClass().getFields();
       obj = new ArrayList(fields.length);
       int len = fields.length;
       int i = 0;
       while (i < len) {
          object oobject = fields[i];
          int modifiers = oobject.getModifiers();
          if (!Modifier.isStatic(modifiers) && !Modifier.isTransient(modifiers)) {
             NoticeBoxItemDeserializerStopWhenFailed$a uoa = PatchProxy.applyOneRefs(oobject, null, NoticeBoxItemDeserializerStopWhenFailed$a.class, "1");
             if (uoa != PatchProxyResult.class) {
             }else {
                uoa = new NoticeBoxItemDeserializerStopWhenFailed$a();
                oobject.setAccessible(true);
                uoa.a = oobject.getName();
                uoa.b = oobject.getType();
                c annotation = oobject.getAnnotation(c.class);
                if (annotation != null) {
                   uoa.c = annotation.value();
                   uoa.d = j.d(annotation.alternate(), "");
                }
                uoa.e = oobject;
             }
             obj.add(uoa);
          }
          i = i + 1;
       }
       return obj;
    }
    public NoticeBoxBaseItem b(JsonElement p0,Type p1,a p2){
       Object obj1;
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, NoticeBoxItemDeserializerStopWhenFailed.class, "2");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       Object obj = p0;
       NoticeBoxBaseItem noticeBoxBas = this.a.apply(obj);
       if (noticeBoxBas == null) {
          return null;
       }
       Iterator iterator = this.a(noticeBoxBas).iterator();
       while (iterator.hasNext()) {
          NoticeBoxItemDeserializerStopWhenFailed$a uoa = iterator.next();
          NoticeBoxItemDeserializerStopWhenFailed$a c = uoa.c;
          if (TextUtils.x(c)) {
             obj1 = p2.c(p0, uoa.b);
          }else if(k0.a(obj, c)){
             obj1 = p2.c(obj.e0(c), uoa.b);
          }else if(uoa.d != null){
             obj1 = p2.c(p0, uoa.b);
          }else {
             obj1 = null;
          }
          if (obj1 == null || PatchProxy.applyVoidTwoRefs(noticeBoxBas, obj1, uoa, NoticeBoxItemDeserializerStopWhenFailed$a.class, "8")) {
             continue ;
          }else {
             NoticeBoxItemDeserializerStopWhenFailed$a e = uoa.e;
             boolean b = true;
             try{
                e.setAccessible(b);
                uoa.e.set(noticeBoxBas, obj1);
             }catch(java.lang.IllegalAccessException e3){
                e3.printStackTrace();
                goto label_002a ;
             }
          }
       }
       if (noticeBoxBas instanceof a) {
          noticeBoxBas.afterDeserialize();
       }
       return noticeBoxBas;
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       return this.b(p0, p1, p2);
    }
}
