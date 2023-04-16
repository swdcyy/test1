package com.yxcorp.gifshow.profile.fragment.m;
import ok.x;
import java.lang.Object;
import com.yxcorp.gifshow.profile.fragment.UserProfileFragment;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Long;

public final class m implements x	// class@00132a
{
    public static final m b;

    static {
       m.b = new m();
    }
    public void m(){
       super();
    }
    public final Object get(){
       return Long.valueOf(a.t().b("StayProfileDuration", 0x7530));
    }
}
