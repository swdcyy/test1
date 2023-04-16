package com.google.protobuf.SourceContext$Builder;
import com.google.protobuf.SourceContextOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.SourceContext;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.SourceContext$1;
import java.lang.String;
import com.google.protobuf.ByteString;

public final class SourceContext$Builder extends GeneratedMessageLite$Builder implements SourceContextOrBuilder	// class@0004b4
{

    public void SourceContext$Builder(){
       super(SourceContext.DEFAULT_INSTANCE);
    }
    public void SourceContext$Builder(SourceContext$1 p0){
       super();
    }
    public SourceContext$Builder clearFileName(){
       this.copyOnWrite();
       this.instance.clearFileName();
       return this;
    }
    public String getFileName(){
       return this.instance.getFileName();
    }
    public ByteString getFileNameBytes(){
       return this.instance.getFileNameBytes();
    }
    public SourceContext$Builder setFileName(String p0){
       this.copyOnWrite();
       this.instance.setFileName(p0);
       return this;
    }
    public SourceContext$Builder setFileNameBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setFileNameBytes(p0);
       return this;
    }
}
