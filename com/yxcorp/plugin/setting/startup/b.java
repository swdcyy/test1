package com.yxcorp.plugin.setting.startup.b;
import erd.g;
import java.lang.Object;
import com.yxcorp.plugin.setting.http.response.KnockedDialogInfo;
import yfd.c;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import java.lang.String;
import km8.b;
import oe6.g;

public final class b implements g	// class@0008ef
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void accept(Object p0){
       SharedPreferences$Editor uEditor = c.a.edit();
       uEditor.putString(b.d("user")+"knockedDialogInfo", b.e(p0));
       g.a(uEditor);
    }
}
