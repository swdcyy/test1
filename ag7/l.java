package ag7.l;
import java.lang.Object;
import android.util.Pair;
import android.net.TrafficStats;
import java.lang.Long;
import java.io.File;
import java.lang.String;
import zsd.d;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.io.BufferedReader;
import java.io.Reader;
import wsd.m;
import kotlin.io.TextStreamsKt;
import java.util.Iterator;
import kotlin.text.Regex;
import java.lang.CharSequence;
import java.util.List;
import java.util.Collection;
import zsd.u;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import yf7.h;
import java.io.Closeable;
import java.lang.Throwable;
import isd.b;
import kotlin.TypeCastException;
import qrd.l1;

public final class l	// class@0000cb
{
    public static final l a;

    static {
       l.a = new l();
    }
    public void l(){
       super();
    }
    public final Pair a(int p0){
       Pair pair;
       long uidRxBytes = TrafficStats.getUidRxBytes(p0);
       long uidTxBytes = TrafficStats.getUidTxBytes(p0);
       String str = null;
       if (uidRxBytes - str >= 0 && uidTxBytes - str >= 0) {
          pair = new Pair(Long.valueOf(uidRxBytes), Long.valueOf(uidTxBytes));
       }else {
          m om = 8192;
          InputStreamReader inputStreamR = new InputStreamReader(new FileInputStream(new File("/proc/net/xt_qtaguid/stats")), d.a);
          if (inputStreamR instanceof BufferedReader) {
          }else {
             inputStreamR = new BufferedReader(inputStreamR, om);
          }
          Throwable throwable = null;
          Iterator iterator = TextStreamsKt.h(inputStreamR).iterator();
          while (true) {
             if (iterator.hasNext()) {
                int i = 0;
                String[] stringArray = new String[i];
                Object[] objArray = new Regex("\\s+").split(iterator.next(), i).toArray(stringArray);
                if (objArray != null) {
                   int i1 = 1;
                   if (!objArray.length) {
                      i = 1;
                   }
                   i = i ^ i1;
                   if (i && (u.I1(objArray[4], "0", i1) && a.g(objArray[3], String.valueOf(p0)))) {
                      long l = Long.parseLong(objArray[5]);
                      uidTxBytes = Long.parseLong(objArray[7]);
                      h.d("TrafficInfoUtil", "get info form Proc File ## rxBytesFromFile:"+l+" ## txBytesFromFile:"+uidTxBytes);
                      pair = new Pair(Long.valueOf(l), Long.valueOf(uidTxBytes));
                      b.a(inputStreamR, throwable);
                      break ;
                   }
                }else {
                   throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                }
             }else {
                b.a(inputStreamR, throwable);
                pair = new Pair(Long.valueOf(-1), Long.valueOf(-1));
                break ;
             }
          }
       }
       return pair;
    }
}
