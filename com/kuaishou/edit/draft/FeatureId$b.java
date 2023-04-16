package com.kuaishou.edit.draft.FeatureId$b;
import z30.g0;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.FeatureId;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.FeatureId$a;
import java.lang.String;
import com.kuaishou.edit.draft.InternalFeatureId;
import com.google.protobuf.ByteString;

public final class FeatureId$b extends GeneratedMessageLite$Builder implements g0	// class@0017a1
{

    public void FeatureId$b(){
       super(FeatureId.DEFAULT_INSTANCE);
    }
    public void FeatureId$b(FeatureId$a p0){
       super(FeatureId.DEFAULT_INSTANCE);
    }
    public FeatureId$b a(String p0){
       this.copyOnWrite();
       this.instance.setExternal(p0);
       return this;
    }
    public FeatureId$b b(InternalFeatureId p0){
       this.copyOnWrite();
       this.instance.setInternal(p0);
       return this;
    }
    public FeatureId$b c(int p0){
       this.copyOnWrite();
       this.instance.setInternalValue(p0);
       return this;
    }
    public String getExternal(){
       return this.instance.getExternal();
    }
    public ByteString getExternalBytes(){
       return this.instance.getExternalBytes();
    }
    public InternalFeatureId getInternal(){
       return this.instance.getInternal();
    }
    public int getInternalValue(){
       return this.instance.getInternalValue();
    }
}
