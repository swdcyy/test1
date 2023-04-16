package kqd.v;
import kqd.w;
import java.nio.ByteOrder;
import io.netty.buffer.d;
import kqd.e;

public final class v	// class@001b67
{
    public static final e a;
    public static final ByteOrder b;
    public static final ByteOrder c;
    public static final d d;
    public static final boolean e;

    static {
       w d = w.d;
       v.a = d;
       v.b = ByteOrder.BIG_ENDIAN;
       v.c = ByteOrder.LITTLE_ENDIAN;
       v.d = d.m(0, 0);
    }
}
