package com.kwai.library.widget.popup.common.exception.KwaiPopupBuildException;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class KwaiPopupBuildException extends IllegalArgumentException	// class@000996
{

    public void KwaiPopupBuildException(String p0){
       a.p(p0, "message");
       super(p0);
    }
}
