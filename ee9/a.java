package ee9.a;
import com.yxcorp.gifshow.camera.record.base.b$b;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;

public class a implements b$b	// class@002122
{
    public MagicEmoji$MagicFace b;
    public MagicEmoji$MagicFace c;
    public MagicEmoji$MagicFace d;
    public String e;
    public String f;
    public static final a g;

    static {
       a uoa = new a(null, null, null, null, null);
       a.g = v6;
    }
    public void a(MagicEmoji$MagicFace p0,MagicEmoji$MagicFace p1,MagicEmoji$MagicFace p2,String p3,String p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public boolean a(){
       boolean b = (this.b == null && (this.e == null && (this.f == null && (this.c != null || this.d != null))))? true: false;
       return b;
    }
    public Object d(List p0){
       a uoa = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          Iterator iterator = p0.iterator();
          while (true) {
             if (iterator.hasNext()) {
                a uoa1 = iterator.next();
                if (uoa1.a()) {
                   uoa = uoa1;
                   break ;
                }
             }else {
                uoa = p0.get(0);
                break ;
             }
          }
       }
       return uoa;
    }
}
