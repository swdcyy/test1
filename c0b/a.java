package c0b.a;
import com.hpplay.sdk.source.browse.api.IBrowseListener;
import com.yxcorp.gifshow.lelink.screencast.KwaiLelink;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;

public final class a implements IBrowseListener	// class@00048d
{
    public final KwaiLelink a;

    public void a(KwaiLelink p0){
       this.a = p0;
       super();
    }
    public final void onBrowse(int p0,List p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "1")) {
          return;
       }
       Iterator iterator = this.a.b().iterator();
       while (iterator.hasNext()) {
          iterator.next().onBrowse(p0, p1);
       }
       return;
    }
}
