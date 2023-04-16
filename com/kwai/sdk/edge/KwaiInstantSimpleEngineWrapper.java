package com.kwai.sdk.edge.KwaiInstantSimpleEngineWrapper;
import java.lang.Object;
import com.kwai.sdk.edge.KwaiInstantSimpleEngineWrapper$1;
import com.kwai.sdk.edge.KwaiInstantSimpleEngineWrapper$KwaiInstantSimpleEngineHolder;
import java.util.List;
import java.lang.String;

public final class KwaiInstantSimpleEngineWrapper	// class@001428
{

    public void KwaiInstantSimpleEngineWrapper(){
       super();
    }
    public void KwaiInstantSimpleEngineWrapper(KwaiInstantSimpleEngineWrapper$1 p0){
       super();
    }
    public static KwaiInstantSimpleEngineWrapper getInstance(){
       return KwaiInstantSimpleEngineWrapper$KwaiInstantSimpleEngineHolder.sInstance;
    }
    public native String inference(List p0,String p1,String p2,String p3,int p4);
}
