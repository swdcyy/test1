package com.kuaishou.security.kste.logic.base.KSTEContext;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import a.a.a.a.b.a.b;
import com.kuaishou.security.kste.logic.base.InitCommonKSTEParams;
import android.content.Context;
import java.lang.Object;

public class KSTEContext	// class@000f14
{
    public static int BCBits = 32;
    public static int BCUpdateThreadThreshold = 1;
    public static String SDKID = "002a7b0a-7ae6-4000-93af-60c2d63176fe";
    public static String SDKNAME = "KSTE";
    public static boolean bInterpLoadStatus = false;
    public static boolean bNeedUpdateBitcode;
    public static ExecutorService ksteThreadPool;
    public static m$b mkv;

    static {
       KSTEContext.ksteThreadPool = Executors.newFixedThreadPool(5);
       KSTEContext.mkv = new m$b(b.b().l().context());
    }
    public void KSTEContext(){
       super();
    }
}
