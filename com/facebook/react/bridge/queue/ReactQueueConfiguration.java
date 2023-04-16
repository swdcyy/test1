package com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.bridge.queue.MessageQueueThread;

public interface abstract ReactQueueConfiguration	// class@001252
{

    void destroy();
    void destroyJSThread();
    void destroyNativeModulesThread();
    MessageQueueThread getJSQueueThread();
    MessageQueueThread getNativeModulesQueueThread();
    MessageQueueThread getUIQueueThread();
}
