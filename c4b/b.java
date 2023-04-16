package c4b.b;
import erd.g;
import c4b.f;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import com.yxcorp.gifshow.model.MagicEmoji;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.String;
import f4b.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import skd.a$a;
import skd.a;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class b implements g	// class@0004ac
{
    public final f b;
    public final MagicBusinessId c;

    public void b(f p0,MagicBusinessId p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       b tb = this.b;
       b tc = this.c;
       p0 = tb.e;
       if (p0 != null && !q.f(p0.mMagicFaces)) {
          p0 = new ArrayList();
          Iterator iterator = tb.e.mMagicFaces.iterator();
          while (iterator.hasNext()) {
             MagicEmoji$MagicFace magicFace = iterator.next();
             if (!TextUtils.isEmpty(magicFace.mChildId)) {
                continue ;
             }
             p0.add(magicFace.mId);
          }
          b.a(tc, tb.e.mId);
          b.f(tc, tb.e.mId, 0, p0);
       }
       p0 = tb.c();
       if (!PatchProxy.applyVoidOneRefs(p0, tb, f.class, "4")) {
          a$a uoa = tb.a.a();
          uoa.putString(p0, "");
          g.a(uoa);
       }
       if (tb.b != null) {
          tb.b.clear();
          tb.b = null;
       }
       return;
    }
}
