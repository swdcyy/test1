package com.kwai.framework.exceptionhandler.constant.CrashProtectorConstants;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;

public final class CrashProtectorConstants	// class@00153e
{
    public static final SharedPreferences a;

    static {
       CrashProtectorConstants.a = b.c("crash_protector_stat", 4);
    }
}
