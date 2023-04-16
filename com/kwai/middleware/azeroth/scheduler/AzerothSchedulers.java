package com.kwai.middleware.azeroth.scheduler.AzerothSchedulers;
import com.kwai.middleware.azeroth.scheduler.AzerothSchedulers$a;
import nsd.u;
import com.kwai.middleware.azeroth.scheduler.AzerothSchedulers$Companion$mAzerothApiThread$2;
import msd.a;
import qrd.p;
import qrd.s;
import brd.z;

public final class AzerothSchedulers	// class@000d66
{
    public static final p a;
    public static final AzerothSchedulers$a b;

    static {
       AzerothSchedulers.b = new AzerothSchedulers$a(null);
       AzerothSchedulers.a = s.c(AzerothSchedulers$Companion$mAzerothApiThread$2.INSTANCE);
    }
    public static final z a(){
       return AzerothSchedulers.b.b();
    }
    public static final z b(){
       return AzerothSchedulers.b.c();
    }
    public static final z c(){
       return AzerothSchedulers.b.d();
    }
}
