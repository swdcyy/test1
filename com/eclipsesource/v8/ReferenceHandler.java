package com.eclipsesource.v8.ReferenceHandler;
import com.eclipsesource.v8.V8Value;

public interface abstract ReferenceHandler	// class@000fd5
{

    void v8HandleCreated(V8Value p0);
    void v8HandleDisposed(V8Value p0);
}
