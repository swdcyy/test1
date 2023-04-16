package com.facebook.react.bridge.queue.MessageQueueThread;
import java.lang.String;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import com.facebook.react.bridge.queue.MessageQueueThreadPerfStats;
import java.lang.Runnable;

public interface abstract MessageQueueThread	// class@001245
{

    void assertIsOnThread();
    void assertIsOnThread(String p0);
    Future callOnQueue(Callable p0);
    MessageQueueThreadPerfStats getPerfStats();
    boolean isOnThread();
    void quitSynchronous();
    void resetPerfStats();
    void runOnQueue(Runnable p0);
}
