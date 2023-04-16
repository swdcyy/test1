package com.google.protobuf.LazyField;
import com.google.protobuf.LazyFieldLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import java.lang.Object;
import java.lang.String;

public class LazyField extends LazyFieldLite	// class@00045f
{
    public final MessageLite defaultInstance;

    public void LazyField(MessageLite p0,ExtensionRegistryLite p1,ByteString p2){
       super(p1, p2);
       this.defaultInstance = p0;
    }
    public boolean containsDefaultInstance(){
       boolean b = (super.containsDefaultInstance() || this.value == this.defaultInstance)? true: false;
       return b;
    }
    public boolean equals(Object p0){
       return this.getValue().equals(p0);
    }
    public MessageLite getValue(){
       return this.getValue(this.defaultInstance);
    }
    public int hashCode(){
       return this.getValue().hashCode();
    }
    public String toString(){
       return this.getValue().toString();
    }
}
