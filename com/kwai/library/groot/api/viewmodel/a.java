package com.kwai.library.groot.api.viewmodel.a;
import ok.x;
import java.lang.Object;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Boolean;

public final class a implements x	// class@000828
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final Object get(){
       return Boolean.valueOf(a.t().d("disableGrootItemChangeOpt", false));
    }
}
