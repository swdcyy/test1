package com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxItemDeserializer;
import com.google.gson.b;
import java.lang.Object;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxItemDeserializerStopWhenFailed;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ok.h;
import com.yxcorp.gifshow.notice.box.detail.data.model.a;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxBaseItem;

public class NoticeBoxItemDeserializer implements b	// class@001254
{
    public final NoticeBoxItemDeserializerStopWhenFailed a;

    public void NoticeBoxItemDeserializer(){
       super();
       a uoa = PatchProxy.apply(null, null, NoticeBoxItemDeserializer.class, "3");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = a.b;
       }
       this.a = new NoticeBoxItemDeserializerStopWhenFailed(uoa);
       return;
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       NoticeBoxBaseItem noticeBoxBas = PatchProxy.applyThreeRefs(p0, p1, p2, this, NoticeBoxItemDeserializer.class, "2");
       if (noticeBoxBas != PatchProxyResult.class) {
       }else {
          noticeBoxBas = this.a.b(p0, p1, p2);
       }
       return noticeBoxBas;
    }
}
