package com.kuaishou.edit.draft.Encode$b;
import z30.a0;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Encode;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Encode$a;
import java.lang.String;
import com.google.protobuf.ByteString;

public final class Encode$b extends GeneratedMessageLite$Builder implements a0	// class@001780
{

    public void Encode$b(){
       super(Encode.DEFAULT_INSTANCE);
    }
    public void Encode$b(Encode$a p0){
       super(Encode.DEFAULT_INSTANCE);
    }
    public Encode$b a(String p0){
       this.copyOnWrite();
       this.instance.setParamsKey(p0);
       return this;
    }
    public String getParamsKey(){
       return this.instance.getParamsKey();
    }
    public ByteString getParamsKeyBytes(){
       return this.instance.getParamsKeyBytes();
    }
}
