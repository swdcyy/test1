package com.kuaishou.edit.draft.Attributes$b;
import z30.j;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Attributes;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Attributes$a;
import com.google.protobuf.Timestamp;
import java.lang.String;
import com.google.protobuf.ByteString;

public final class Attributes$b extends GeneratedMessageLite$Builder implements j	// class@00172b
{

    public void Attributes$b(){
       super(Attributes.DEFAULT_INSTANCE);
    }
    public void Attributes$b(Attributes$a p0){
       super(Attributes.DEFAULT_INSTANCE);
    }
    public Attributes$b a(Timestamp p0){
       this.copyOnWrite();
       this.instance.setModifiedAt(p0);
       return this;
    }
    public String getAppVersion(){
       return this.instance.getAppVersion();
    }
    public ByteString getAppVersionBytes(){
       return this.instance.getAppVersionBytes();
    }
    public Timestamp getCreatedAt(){
       return this.instance.getCreatedAt();
    }
    public String getDraftVersion(){
       return this.instance.getDraftVersion();
    }
    public ByteString getDraftVersionBytes(){
       return this.instance.getDraftVersionBytes();
    }
    public Timestamp getModifiedAt(){
       return this.instance.getModifiedAt();
    }
    public boolean hasCreatedAt(){
       return this.instance.hasCreatedAt();
    }
    public boolean hasModifiedAt(){
       return this.instance.hasModifiedAt();
    }
}
