package d6a.j$e;
import d6a.i;
import qvb.i;
import java.lang.String;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.detail.slideplay.SlideMediaType;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import d6a.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import androidx.fragment.app.Fragment;
import d6a.f;

public class j$e implements i	// class@001ea3
{
    public String a;
    public final i b;
    public final String c;
    public final BaseFragment d;
    public final SlideMediaType e;

    public void j$e(i p0,String p1,BaseFragment p2,SlideMediaType p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public SlideMediaType G1(){
       return this.e;
    }
    public boolean a(QPhoto p0,boolean p1){
       return h.a(this, p0, p1);
    }
    public String getId(){
       Object obj = PatchProxy.apply(null, this, j$e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(this.a)) {
          this.a = (!TextUtils.x(this.c))? f.b(this.d)+this.c: f.b(this.d);
       }
    label_0042 :
       return this.a;
    }
    public i q(){
       return this.b;
    }
}
