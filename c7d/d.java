package c7d.d;
import android.view.View$OnClickListener;
import c7d.e;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import com.yxcorp.plugin.search.entity.SearchItem;
import gbd.s;
import java.util.ArrayList;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.List;
import zbd.d;
import q7d.d0;
import androidx.fragment.app.Fragment;
import lyb.w;
import com.yxcorp.plugin.search.utils.p;

public final class d implements View$OnClickListener	// class@0004ef
{
    public final e b;

    public void d(e p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, uoe, "4")) {
       }else if(PatchProxy.applyVoid(null, tb, uoe, "5")){
          s.c(tb.r, 1, false, tb.q);
       }
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(tb.q);
       p.j(d0.f(uArrayList, tb.q, tb.p.getPhotoId()), tb.r, p0, false, null);
       return;
    }
}
