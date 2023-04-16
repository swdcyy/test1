package com.yxcorp.gifshow.profile.util.n;
import ok.x;
import java.lang.Object;
import z5c.k0;
import com.kwai.social.startup.follow.model.ProfileBackgroundConfig;
import mw4.a;
import java.lang.String;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;

public final class n implements x	// class@0015df
{
    public static final n b;

    static {
       n.b = new n();
    }
    public void n(){
       super();
    }
    public final Object get(){
       ProfileBackgroundConfig profileBackg = ProfileBackgroundConfig.class;
       String str = a.a.getString("profileBackground", "");
       profileBackg = (str == null || str == "")? null: b.a(str, profileBackg);
       return profileBackg;
    }
}
