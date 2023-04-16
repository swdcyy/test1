package com.yxcorp.gifshow.util.m0;
import ok.x;
import java.lang.Object;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Boolean;

public final class m0 implements x	// class@001f8d
{
    public static final m0 b;

    static {
       m0.b = new m0();
    }
    public void m0(){
       super();
    }
    public final Object get(){
       return Boolean.valueOf(a.t().d("postAlbumImageHideDuration", false));
    }
}
