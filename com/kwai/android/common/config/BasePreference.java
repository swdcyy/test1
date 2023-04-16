package com.kwai.android.common.config.BasePreference;
import java.lang.Object;
import com.kwai.android.common.bean.Channel;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import java.lang.Enum;
import java.util.Objects;

public abstract class BasePreference	// class@000980
{

    public void BasePreference(){
       super();
    }
    public final String keyRegisterTime(Channel p0){
       a.p(p0, "channel");
       String str = p0.name();
       Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
       str = str.toLowerCase();
       a.o(str, "\(this as java.lang.String\).toLowerCase\(\)");
       StringBuilder str1 = str;
       return str1+"_register_time";
    }
    public final String keyRegisterToken(Channel p0){
       a.p(p0, "channel");
       String str = p0.name();
       Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
       str = str.toLowerCase();
       a.o(str, "\(this as java.lang.String\).toLowerCase\(\)");
       StringBuilder str1 = str;
       return str1+"_token";
    }
}
