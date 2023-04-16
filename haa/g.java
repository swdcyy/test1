package haa.g;
import java.lang.String;
import java.io.File;
import java.util.List;
import com.kuaishou.android.model.music.MusicType;
import com.kuaishou.edit.draft.Workspace$Type;
import java.lang.Object;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.IllegalArgumentException;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Collection;
import ekd.q;

public class g	// class@0025f6
{
    public final String a;
    public final String b;
    public final File c;
    public final List d;
    public final List e;
    public final String f;
    public final MusicType g;
    public final Workspace$Type h;

    public void g(String p0,String p1,File p2,List p3,List p4,String p5,MusicType p6,Workspace$Type p7){
       super();
       if (TextUtils.x(p0)) {
          throw new IllegalArgumentException("identifier can not be empty string!!!");
       }
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       return;
    }
    public boolean a(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       Object obj = PatchProxy.apply(null, this, og, "4");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (q.f(this.d)) {
          Object obj1 = PatchProxy.apply(null, this, og, "5");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(!TextUtils.x(this.f) && this.g != null){
             b1 = true;
          }else {
             b1 = false;
          }
          if (!b1 && q.f(this.e)) {
          label_0051 :
             b = false;
          label_0052 :
             return b;
          }
       }
    label_0046 :
       g tc = this.c;
       if (tc != null && tc.exists()) {
          goto label_0052 ;
       }else {
          goto label_0051 ;
       }
    }
}
