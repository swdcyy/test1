package com.yxcorp.gifshow.camera.record.assistant.model.a;
import erd.g;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantDataHelper$i;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantDataHelper;
import java.util.Collection;
import ac9.l;
import java.util.List;

public final class a implements g	// class@001d16
{
    public final AssistantDataHelper$i b;

    public void a(AssistantDataHelper$i p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          a.o(p0, "it");
          ArrayList uArrayList = this.b.b.a(p0, false);
          int i = 1;
          if (uArrayList.isEmpty() ^ i) {
             AssistantDataHelper$i e = this.b.e;
             if (e != null && !e.isEmpty()) {
                i = 0;
             }
             if (i) {
                uArrayList.add(new l());
             }
          }
          p0.setTemplateList(uArrayList);
          p0.setInitPosition(false);
       }
       return;
    }
}
