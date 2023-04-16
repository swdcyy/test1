package com.kwai.performance.stability.policy.GCSemiSpaceTrimmer;
import java.lang.String;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import java.lang.Object;
import com.kwai.performance.stability.policy.GCSemiSpaceTrimmer$a;
import android.os.Build$VERSION;
import com.yxcorp.utility.AbiUtil$Abi;
import com.yxcorp.utility.AbiUtil;

public final class GCSemiSpaceTrimmer	// class@00127c
{
    public float a;
    public long b;
    public HandlerThread c;
    public Handler d;
    public boolean e;
    public b f;
    public final Runnable g;
    public static final GCSemiSpaceTrimmer h;
    public static final Pattern i;
    public static final long j;

    static {
       GCSemiSpaceTrimmer.h = new GCSemiSpaceTrimmer();
       GCSemiSpaceTrimmer.i = Pattern.compile("[^0-9]");
       GCSemiSpaceTrimmer.j = TimeUnit.MINUTES.toMillis(3);
    }
    public void GCSemiSpaceTrimmer(){
       super();
       this.a = 0;
       this.b = GCSemiSpaceTrimmer.j;
       this.c = null;
       this.d = null;
       this.e = false;
       this.f = null;
       this.g = new GCSemiSpaceTrimmer$a(this);
    }
    public static boolean a(){
       boolean b = (Build$VERSION.SDK_INT < 26 && AbiUtil.a() == AbiUtil$Abi.ARMEABI_V7A)? true: false;
       return b;
    }
    public native boolean nativeInstall();
}
