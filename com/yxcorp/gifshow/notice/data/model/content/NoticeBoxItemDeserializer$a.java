package com.yxcorp.gifshow.notice.data.model.content.NoticeBoxItemDeserializer$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public class NoticeBoxItemDeserializer$a	// class@00218c
{
    public String a;
    public Class b;
    public String c;
    public boolean d;
    public Field e;

    public void NoticeBoxItemDeserializer$a(){
       super();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NoticeBoxItemDeserializer$a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 instanceof NoticeBoxItemDeserializer$a && ((this.a).equals(p0.a) && this.b == p0.b))? true: false;
       return b;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, NoticeBoxItemDeserializer$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (this.a).hashCode();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, NoticeBoxItemDeserializer$a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a+this.b.getSimpleName();
    }
}
