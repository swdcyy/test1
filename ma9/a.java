package ma9.a;
import z1.a;
import com.yxcorp.gifshow.billboard.KwaiRankActivity;
import java.lang.Object;
import com.kwai.feature.api.social.nearby.model.CityInfo;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkc.b;
import java.lang.StringBuilder;
import q87.c;
import js6.a;
import androidx.fragment.app.Fragment;

public final class a implements a	// class@002e3c
{
    public final KwaiRankActivity a;

    public void a(KwaiRankActivity p0){
       this.a = p0;
    }
    public final void accept(Object p0){
       a ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoidOneRefs(p0, ta, KwaiRankActivity.class, "9")) {
       }else if(p0 != null){
          Object[] objArray = new Object[0];
          b.C().w("KwaiRankActivity", "cityInfo"+p0, objArray);
          a.b.X8(ta.B, "selectTrendingRomaCity", p0);
       }
       return;
    }
}
