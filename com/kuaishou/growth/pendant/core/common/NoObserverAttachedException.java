package com.kuaishou.growth.pendant.core.common.NoObserverAttachedException;
import java.lang.Exception;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class NoObserverAttachedException extends Exception	// class@000632
{

    public void NoObserverAttachedException(String p0){
       a.p(p0, "message");
       super(p0);
    }
}
