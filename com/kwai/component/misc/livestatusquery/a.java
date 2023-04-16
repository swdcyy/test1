package com.kwai.component.misc.livestatusquery.a;
import ok.x;
import java.lang.Object;
import sc5.d;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import io7.c;
import java.lang.Boolean;

public final class a implements x	// class@0009cd
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final Object get(){
       return Boolean.valueOf(a.t().u("SOURCE_LIVE").d("enableReplacePreviewLiveWhenSameDetailLiveEnd", false));
    }
}
