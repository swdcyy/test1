package com.google.protobuf.NewInstanceSchemaLite;
import com.google.protobuf.NewInstanceSchema;
import java.lang.Object;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;

public final class NewInstanceSchemaLite implements NewInstanceSchema	// class@00048c
{

    public void NewInstanceSchemaLite(){
       super();
    }
    public Object newInstance(Object p0){
       return p0.dynamicMethod(GeneratedMessageLite$MethodToInvoke.NEW_MUTABLE_INSTANCE);
    }
}
