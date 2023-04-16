package com.kwai.framework.network.n;
import ok.x;
import java.lang.Object;
import com.kwai.framework.network.RetrofitInitModule;
import com.kwai.sdk.switchconfig.a;
import ta6.m;
import java.lang.reflect.Type;
import el.a;
import java.lang.String;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.List;

public final class n implements x	// class@001807
{
    public static final n b;

    static {
       n.b = new n();
    }
    public void n(){
       super();
    }
    public final Object get(){
       String[] stringArray = new String[]{"*"};
       return a.t().getValue("enableCommonParamsDryRunPathList", new m().getType(), Lists.e(stringArray));
    }
}
