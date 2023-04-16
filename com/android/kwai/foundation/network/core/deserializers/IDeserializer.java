package com.android.kwai.foundation.network.core.deserializers.IDeserializer;
import okhttp3.Response;
import java.lang.Class;
import java.lang.Object;

public interface abstract IDeserializer	// class@0003f1
{

    Object deserialize(Response p0,Class p1);
}
