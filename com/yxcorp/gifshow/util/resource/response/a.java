package com.yxcorp.gifshow.util.resource.response.a;
import java.util.Comparator;
import java.lang.Object;
import com.yxcorp.gifshow.util.resource.response.YlabModelConfigResponse$ModelConfig;

public final class a implements Comparator	// class@000cfd
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return (p1.mPredownloadPriority - p0.mPredownloadPriority);
    }
}
