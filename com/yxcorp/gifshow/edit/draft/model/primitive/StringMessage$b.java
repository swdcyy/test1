package com.yxcorp.gifshow.edit.draft.model.primitive.StringMessage$b;
import aba.a;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.yxcorp.gifshow.edit.draft.model.primitive.StringMessage;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.primitive.StringMessage$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.protobuf.ByteString;

public final class StringMessage$b extends GeneratedMessageLite$Builder implements a	// class@001b09
{

    public void StringMessage$b(){
       super(StringMessage.DEFAULT_INSTANCE);
    }
    public void StringMessage$b(StringMessage$a p0){
       super(StringMessage.DEFAULT_INSTANCE);
    }
    public StringMessage$b a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StringMessage$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.copyOnWrite();
       this.instance.setValue(p0);
       return this;
    }
    public String getValue(){
       Object obj = PatchProxy.apply(null, this, StringMessage$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getValue();
    }
    public ByteString getValueBytes(){
       Object obj = PatchProxy.apply(null, this, StringMessage$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.instance.getValueBytes();
    }
}
