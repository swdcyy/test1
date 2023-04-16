package hf1.k;
import cp3.a;
import com.kuaishou.live.common.core.component.comments.item.LiveRichTextViewHolderFactory;
import java.lang.Object;
import java.lang.String;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import o81.c;
import o81.g;
import android.graphics.drawable.BitmapDrawable;

public final class k implements a	// class@00268a
{
    public final LiveRichTextViewHolderFactory a;

    public void k(LiveRichTextViewHolderFactory p0){
       this.a = p0;
       super();
    }
    public final Drawable a(String p0){
       c obj = PatchProxy.applyOneRefs(p0, this, k.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       obj = this.a.c.g();
       BitmapDrawable uBitmapDrawa = (obj != null)? obj.a(p0): null;
       return uBitmapDrawa;
    }
}
