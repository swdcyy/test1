package cp1.u;
import pz2.a;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import bz2.a;
import java.util.List;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.yxcorp.utility.TextUtils;

public class u implements a	// class@001e22
{
    public long b;
    public String c;
    public int d;
    public int e;
    public long f;
    public long g;
    public boolean h;
    public boolean i;
    public List j;
    public List k;
    public boolean l;
    public boolean m;
    public boolean n;
    public w o;
    public Set p;
    public int q;
    public int r;
    public c s;
    public boolean t;
    public String u;
    public final long v;

    public void u(long p0){
       super();
       this.q = 0;
       this.r = -1;
       this.s = PublishSubject.g();
       this.v = a.a();
       this.b = p0;
    }
    public List J(){
       return this.k;
    }
    public long b(){
       return this.b;
    }
    public long getTrackId(){
       return this.v;
    }
    public boolean k(){
       return this.n;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, u.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveMagicEffectInfo{mMagicFaceId=\'"+this.b+'''+", mStartTime=\'"+this.f+'''+", mRank=\'"+this.d+'''+", mMergeKey=\'"+TextUtils.k(this.c)+'''+", mTrackId=\'"+this.v+'''+'}';
    }
}
