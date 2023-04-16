package com.yxcorp.plugin.search.entity.template.aggregate.TemplateFeedDeserializer;
import com.smile.gifmaker.mvps.utils.model.decouple.FastDeserializer;
import com.yxcorp.plugin.search.entity.template.aggregate.b;
import com.yxcorp.plugin.search.entity.template.aggregate.a;
import ok.h;
import com.yxcorp.plugin.search.entity.template.aggregate.c;
import com.smile.gifmaker.mvps.utils.model.decouple.BaseDecoupledDeserializer;
import java.lang.Object;
import java.lang.Iterable;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateBaseFeed;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.lang.reflect.Modifier;
import wl8.a;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;

public class TemplateFeedDeserializer extends FastDeserializer	// class@0013b0
{

    public void TemplateFeedDeserializer(){
       super(b.b, a.b);
       this.c = c.a;
    }
    public Iterable a(Object p0){
       ArrayList uArrayList = PatchProxy.applyOneRefs(p0, this, TemplateFeedDeserializer.class, "3");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          p0 = p0.getClass().getDeclaredFields();
          uArrayList = new ArrayList(p0.length);
          int len = p0.length;
          int i = 0;
          while (i < len) {
             object oobject = p0[i];
             int modifiers = oobject.getModifiers();
             if (Modifier.isStatic(modifiers) || (!Modifier.isTransient(modifiers) && !oobject.getType().isPrimitive())) {
                uArrayList.add(a.a(oobject));
             }
          label_0047 :
             i = i + 1;
          }
       }
       return uArrayList;
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, TemplateFeedDeserializer.class, "2");
       if (p1 != PatchProxyResult.class) {
       }else {
          p1 = this.b(p0, TemplateBaseFeed.class, p2);
       }
       return p1;
    }
}
