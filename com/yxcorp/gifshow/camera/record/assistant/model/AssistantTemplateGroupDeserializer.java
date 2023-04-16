package com.yxcorp.gifshow.camera.record.assistant.model.AssistantTemplateGroupDeserializer;
import com.google.gson.b;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantTemplateGroupDeserializer$a;
import nsd.u;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantTemplateGroup;
import com.google.gson.JsonObject;
import zk.g;
import ac9.f;
import el.a;
import ac9.e;
import ac9.d;
import java.util.List;
import j8c.a;
import w46.b;

public final class AssistantTemplateGroupDeserializer implements b	// class@001d0f
{
    public static final AssistantTemplateGroupDeserializer$a a;

    static {
       AssistantTemplateGroupDeserializer.a = new AssistantTemplateGroupDeserializer$a(null);
    }
    public void AssistantTemplateGroupDeserializer(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       int groupType;
       AssistantTemplateGroup uAssistantTe = PatchProxy.applyThreeRefs(p0, p1, p2, this, AssistantTemplateGroupDeserializer.class, "1");
       if (uAssistantTe != PatchProxyResult.class) {
       }else {
          uAssistantTe = new AssistantTemplateGroup();
          if (p0 != null) {
             JsonObject jsonObject = p0.r();
             JsonElement jsonElement = jsonObject.e0("groupType");
             Type type = null;
             if (!jsonElement instanceof g) {
                jsonElement = type;
             }
             JsonElement jsonElement1 = jsonObject.e0("bubbleText");
             if (!jsonElement1 instanceof g) {
                jsonElement1 = type;
             }
             int JsonElement jsonElement2 = jsonObject.e0("recognitionType");
             if (!jsonElement2 instanceof g) {
                jsonElement2 = type;
             }
             jsonObject = jsonObject.e0("templates");
             if (jsonObject != null && (jsonElement == null || !jsonElement.N())) {
                Object[] objArray = new Object[0];
                a.D().t("CameraAssistant", "AssistantTemplateGroupDeserializer argument error", objArray);
             }else {
                uAssistantTe.setGroupType(jsonElement.p());
                d uod = 1;
                jsonElement2 = (jsonElement2 != null && jsonElement2.N() == uod)? jsonElement2.p(): -1;
                uAssistantTe.setRecognitionType(jsonElement2);
                String str = (jsonElement1 != null)? jsonElement1.w(): type;
                uAssistantTe.setBubbleText(str);
                groupType = uAssistantTe.getGroupType();
                if (groupType != uod) {
                   if (groupType != 2) {
                      if (groupType == 4) {
                         type = new f().getType();
                      }
                   }else {
                      type = new e().getType();
                   }
                }else {
                   type = new d().getType();
                }
                if (type != null && p2 != null) {
                   List list = p2.c(jsonObject, type);
                   if (list != null) {
                      uAssistantTe.setTemplates(list);
                   }
                }
             }
          }
       }
       return uAssistantTe;
    }
}
