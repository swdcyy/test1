package bp6.t0;
import erd.r;
import java.lang.String;
import java.lang.Object;
import com.kwai.imsdk.msg.KwaiMsg;
import java.lang.System;
import java.lang.Math;

public final class t0 implements r	// class@00054e
{
    public final String b;

    public void t0(String p0){
       this.b = p0;
    }
    public final boolean test(Object p0){
       t0 tb = this.b;
       boolean b = (!p0.isInvisibleMsg() && (tb.equals(p0.getSender()) && Math.abs((System.currentTimeMillis() - p0.getSentTime())) - 0xea60 < 0))? true: false;
       return b;
    }
}
