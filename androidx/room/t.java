package androidx.room.t;
import android.content.Context;
import java.lang.String;
import a3.c$c;
import androidx.room.RoomDatabase$c;
import java.util.List;
import androidx.room.RoomDatabase$JournalMode;
import java.util.concurrent.Executor;
import java.util.Set;
import java.io.File;
import java.util.concurrent.Callable;
import androidx.room.RoomDatabase$d;
import java.lang.Object;
import java.util.Collections;
import java.lang.Integer;

public class t	// class@000274
{
    public final c$c a;
    public final Context b;
    public final String c;
    public final RoomDatabase$c d;
    public final List e;
    public final RoomDatabase$d f;
    public final List g;
    public final boolean h;
    public final RoomDatabase$JournalMode i;
    public final Executor j;
    public final Executor k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final Set o;
    public final String p;
    public final File q;
    public final Callable r;

    public void t(Context p0,String p1,c$c p2,RoomDatabase$c p3,List p4,boolean p5,RoomDatabase$JournalMode p6,Executor p7,Executor p8,boolean p9,boolean p10,boolean p11,Set p12,String p13,File p14,Callable p15,RoomDatabase$d p16,List p17){
       int i = this;
       super();
       i.a = p2;
       i.b = p0;
       i.c = p1;
       i.d = p3;
       i.e = p4;
       i.h = p5;
       i.i = p6;
       i.j = p7;
       i.k = p8;
       i.l = p9;
       i.m = p10;
       i.n = p11;
       i.o = p12;
       i.p = p13;
       i.q = p14;
       i.r = p15;
       List list = (p17 == null)? Collections.emptyList(): p17;
       i.g = list;
       return;
    }
    public boolean a(int p0,int p1){
       boolean b = true;
       t ot = (p0 > p1)? 1: null;
       if (ot && this.n != null) {
          return false;
       }else if(this.m != null){
          ot = this.o;
          if (ot == null || !ot.contains(Integer.valueOf(p0))) {
          label_0022 :
             return b;
          }
       }
       b = false;
       goto label_0022 ;
    }
}
