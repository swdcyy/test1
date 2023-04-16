package com.tkruntime.v8.DomExecutor;
import com.tkruntime.v8.V8$CommandRunner;

public interface abstract DomExecutor	// class@000f9b
{

    void addCmdRunner(V8$CommandRunner p0);
    void attachToRoot();
    void detachToRoot();
    boolean hasRemainRunner();
    boolean isAttachedToRoot();
}
