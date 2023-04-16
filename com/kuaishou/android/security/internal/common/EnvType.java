package com.kuaishou.android.security.internal.common.EnvType;
import java.lang.annotation.Annotation;

public interface abstract EnvType implements Annotation	// class@000f3c
{
    public static final int ANTIDEBUG = 4;
    public static final int EMULATOR = 3;
    public static final int HOOK = 2;
    public static final int MALWARE = 1;
    public static final int ROOT;

}
