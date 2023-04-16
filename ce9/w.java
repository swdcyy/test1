package ce9.w;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.magic.l;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import s5b.b;
import q87.c;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import e4b.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.yxcorp.gifshow.magic.data.db.MagicDBProvider;
import x3b.b;
import java.util.Collection;
import ekd.q;
import k4b.a;

public final class w implements Runnable	// class@0005d3
{
    public final l b;
    public final MagicEmoji$MagicFace c;
    public final String d;

    public void w(l p0,MagicEmoji$MagicFace p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       w tb = this.b;
       w tc = this.c;
       w td = this.d;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       b.D().w("MagicHandler", "get magicface checklist", objArray);
       SimpleMagicFace mId = tc.mId;
       List list = PatchProxy.applyOneRefs(mId, null, b.class, "3");
       if (list != PatchProxyResult.class) {
       }else {
          list = MagicDBProvider.b().a().m(mId);
       }
       if (tc == tb.l && !q.f(list)) {
          tc.mFileMd5CheckList = list;
          tb.p.j(tc, td);
       }
       return;
    }
}
