package com.yxcorp.gifshow.relation.shake.a;
import ok.x;
import java.lang.Object;
import xbc.a;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.relation.shake.ShakeConfData;
import java.lang.String;
import java.lang.reflect.Type;

public final class a implements x	// class@0019d5
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final Object get(){
       return a.t().getValue("pymkShakeSensorConf", ShakeConfData.class, new ShakeConfData(100, 5, 100));
    }
}
