package com.google.protobuf.MessageInfoFactory;
import java.lang.Class;
import com.google.protobuf.MessageInfo;

public interface abstract MessageInfoFactory	// class@000479
{

    boolean isSupported(Class p0);
    MessageInfo messageInfoFor(Class p0);
}
