package ce9.l;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.String;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import java.util.List;
import java.lang.Object;
import java.util.ArrayList;

public class l	// class@0005c8
{
    public final MagicEmoji$MagicFace a;
    public final String b;
    public final boolean c;
    public final List d;
    public final List e;
    public final byte[] f;
    public final String g;
    public final MagicBusinessId h;
    public static final l i;

    static {
       l ol = new l(null, null, false, null, null, null);
       l.i = v7;
    }
    public void l(MagicEmoji$MagicFace p0,String p1,boolean p2,List p3,byte[] p4,List p5,String p6,MagicBusinessId p7){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.f = p4;
       this.e = p5;
       this.g = p6;
       this.h = p7;
    }
    public void l(MagicEmoji$MagicFace p0,String p1,boolean p2,byte[] p3,String p4,MagicBusinessId p5){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = null;
       this.f = p3;
       ArrayList uArrayList = new ArrayList();
       this.e = uArrayList;
       if (p4 != null) {
          uArrayList.add(p4);
       }
       this.g = p4;
       this.h = p5;
       return;
    }
}
