package com.yxcorp.gifshow.camera.record.assistant.utils.d;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantResponse;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.lang.IllegalArgumentException;
import java.lang.String;

public final class d implements o	// class@001d23
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final Object apply(Object p0){
       if (!q.f(p0.getTemplateGroup())) {
          return p0;
       }
       throw new IllegalArgumentException("getTextLabelResource response is empty");
    }
}
