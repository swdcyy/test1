package com.yxcorp.gifshow.notice.data.model.content.ReminderContentElementType$2;
import com.yxcorp.gifshow.notice.data.model.content.ReminderContentElementType;
import java.lang.String;
import com.yxcorp.gifshow.notice.data.model.content.ReminderContentElementType$1;
import ptb.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ptb.b;

public final class ReminderContentElementType$2 extends ReminderContentElementType	// class@002190
{

    public void ReminderContentElementType$2(String p0,int p1,String p2){
       super(p0, p1, p2, null);
    }
    public a createItem(){
       Object obj = PatchProxy.apply(null, this, ReminderContentElementType$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b();
    }
}
