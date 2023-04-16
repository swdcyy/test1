package com.eclipsesource.v8.inspector.V8InspectorDelegate;
import java.lang.String;

public interface abstract V8InspectorDelegate	// class@001010
{

    void onResponse(String p0);
    void waitFrontendMessageOnPause();
}
