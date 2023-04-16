package xy2.a;
import kz2.c;
import xy2.a$a;
import nsd.u;
import ekd.k1;
import java.util.Random;
import java.lang.String;
import com.kuaishou.livestream.message.nano.LiveMultiMagicEffectInfo;
import g03.a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import java.lang.System;
import mz2.a;
import java.util.Map;

public class a extends c	// class@004bf0
{
    public Map l;
    public final long m;
    public final String n;
    public final LiveMultiMagicEffectInfo o;
    public final a p;
    public static long q;
    public static final a$a r;

    static {
       a.r = new a$a(null);
       a.q = (long)k1.b.nextInt(0x989680);
    }
    public void a(String p0,LiveMultiMagicEffectInfo p1,a p2){
       a.p(p0, "taskId");
       a.p(p1, "effectInfo");
       a.p(p2, "liveEffectResourceProvider");
       super(p2);
       this.n = p0;
       this.o = p1;
       this.p = p2;
       this.l = new HashMap();
       this.m = System.currentTimeMillis();
    }
    public void a(String p0,LiveMultiMagicEffectInfo p1,a p2,int p3,u p4){
       p0 = (p3 & 0x01)? a.r.a(): null;
       super(p0, p1, p2);
       return;
    }
    public a J(){
       return null;
    }
    public final int K(){
       return this.o.bizType;
    }
    public final LiveMultiMagicEffectInfo L(){
       return this.o;
    }
    public final Map M(){
       return this.l;
    }
    public final String N(){
       return this.n;
    }
    public long b(){
       return this.o.magicFaceId;
    }
    public long e(){
       return 0;
    }
    public long getCreateTime(){
       return this.m;
    }
    public boolean h(){
       return true;
    }
    public boolean k(){
       return false;
    }
    public int n(){
       return 0xdb9ff;
    }
    public int p(){
       return 1;
    }
    public int z(){
       return 0x7ffffc12;
    }
}
