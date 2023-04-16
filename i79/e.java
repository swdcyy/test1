package i79.e;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.util.Collection;
import ekd.q;
import fg6.a;
import com.google.gson.Gson;

public class e	// class@002648
{
    public List a;
    public final long b;
    public final long c;
    public final String d;
    public final String e;
    public boolean f;
    public final int g;
    public String h;
    public String i;
    public String j;
    public boolean k;

    public void e(long p0,String p1,long p2,String p3,List p4,boolean p5,int p6){
       super();
       this.f = false;
       this.b = p0;
       this.d = p1;
       this.c = p2;
       this.e = p3;
       this.a = p4;
       this.f = p5;
       this.g = p6;
    }
    public String toString(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       StringBuilder obj = PatchProxy.apply(null, this, uoe, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = "SmartAlbumSceneResult{, mId="+this.b+", mTakeTime="+this.c+", mPath=\'"+this.d+'''+", mDate=\'"+this.e+'''+", mSceneNotExist="+this.f+", mType="+this.g+", LabelsString=";
       String str = PatchProxy.apply(null, this, uoe, "1");
       if (str != patchProxyRe) {
       }else if(q.f(this.a)){
          str = "NONE";
       }else {
          str = a.a.q(this.a);
       }
       return obj+str+'}';
    }
}
