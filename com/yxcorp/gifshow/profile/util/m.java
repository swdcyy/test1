package com.yxcorp.gifshow.profile.util.m;
import ok.x;
import java.lang.Object;
import z5c.k0;
import com.kwai.framework.model.user.PhotoGuestConfig;
import mw4.a;
import java.lang.String;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;

public final class m implements x	// class@0015de
{
    public static final m b;

    static {
       m.b = new m();
    }
    public void m(){
       super();
    }
    public final Object get(){
       PhotoGuestConfig photoGuestCo = PhotoGuestConfig.class;
       String str = a.a.getString("photoViewer", "null");
       photoGuestCo = (str == null || str == "")? null: b.a(str, photoGuestCo);
       return photoGuestCo;
    }
}
