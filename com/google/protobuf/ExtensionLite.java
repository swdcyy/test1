package com.google.protobuf.ExtensionLite;
import java.lang.Object;
import com.google.protobuf.WireFormat$FieldType;
import com.google.protobuf.MessageLite;

public abstract class ExtensionLite	// class@000409
{

    public void ExtensionLite(){
       super();
    }
    public abstract Object getDefaultValue();
    public abstract WireFormat$FieldType getLiteType();
    public abstract MessageLite getMessageDefaultInstance();
    public abstract int getNumber();
    public boolean isLite(){
       return true;
    }
    public abstract boolean isRepeated();
}
