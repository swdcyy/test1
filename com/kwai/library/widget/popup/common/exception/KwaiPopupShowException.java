package com.kwai.library.widget.popup.common.exception.KwaiPopupShowException;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class KwaiPopupShowException extends RuntimeException	// class@000997
{

    public void KwaiPopupShowException(String p0,Throwable p1){
       a.p(p0, "message");
       a.p(p1, "cause");
       super(p0, p1);
    }
}
