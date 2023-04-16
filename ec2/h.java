package ec2.h;
import y8c.g;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.UserInfo;
import g9c.a;
import java.util.List;
import android.view.ViewGroup;
import y8c.f;
import android.view.View;
import i2b.a;
import ec2.h$a;
import ml8.c;

public class h extends g	// class@0026e6
{

    public void h(){
       super();
    }
    public Object N0(int p0){
       a obj;
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oh, "2");
          if (obj != PatchProxyResult.class) {
          label_0027 :
             return obj;
          }
       }
       obj = this.e;
       obj = obj.get((p0 % obj.size()));
       goto label_0027 ;
    }
    public int getItemCount(){
       return Integer.MAX_VALUE;
    }
    public f h1(ViewGroup p0,int p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oh, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(a.i(p0, 0x7f0d0c82), new h$a());
    }
}
