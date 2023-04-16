package com.kuaishou.security.kste.export.IKSTECallback;
import com.kuaishou.security.kste.export.IKSTECallback$1;
import com.kuaishou.security.kste.logic.event.KSTEException;
import java.lang.String;

public interface abstract IKSTECallback	// class@000f0c
{
    public static final IKSTECallback DEFAULT;

    static {
       IKSTECallback.DEFAULT = new IKSTECallback$1();
    }
    void onError(KSTEException p0);
    void onSuccess();
    void report(String p0,String p1);
}
