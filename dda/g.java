package dda.g;
import m66.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.yxcorp.gifshow.entity.z1;
import tl8.d;
import java.lang.Class;
import ok.h;
import java.lang.Object;
import tl8.e;
import java.lang.Integer;
import java.lang.String;

public final class g extends a	// class@00248c
{
    public int d;
    public String e;

    public void g(BaseFeed p0){
       super(p0, e.h(p0, PhotoMeta.class, z1.b).intValue());
    }
    public void g(BaseFeed p0,int p1){
       super(p0);
       this.d = p1;
    }
    public void g(BaseFeed p0,String p1){
       super(p0);
       this.e = p1;
    }
    public int a(){
       return this.d;
    }
    public String b(){
       return this.e;
    }
}
