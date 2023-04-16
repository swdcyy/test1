package com.yxcorp.gifshow.webview.helper.b;
import erd.g;
import java.lang.Object;
import java.lang.String;
import uv8.g1;
import q87.c;
import o56.a;
import android.content.Context;
import com.kwai.framework.debuglog.h;

public final class b implements g	// class@001759
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void accept(Object p0){
       Object[] objArray = new Object[0];
       g1.C().s("AutoUploadUserLogOnFeedback", "uploadUserLog success, start upload", objArray);
       h.a(a.B, "feedback");
    }
}
