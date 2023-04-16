package com.kwai.library.kswolverine.utils.PreferenceUtil;
import com.kwai.library.kswolverine.utils.PreferenceUtil$preferences$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import android.content.SharedPreferences;

public final class PreferenceUtil	// class@00084a
{
    public static final p a;
    public static final PreferenceUtil b;

    static {
       PreferenceUtil.b = new PreferenceUtil();
       PreferenceUtil.a = s.c(PreferenceUtil$preferences$2.INSTANCE);
    }
    public void PreferenceUtil(){
       super();
    }
    public final SharedPreferences a(){
       return PreferenceUtil.a.getValue();
    }
}
