package bed.w;
import erd.g;
import bed.y;
import qm6.b$a;
import java.lang.Object;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin;
import java.util.Objects;
import om6.m;
import java.lang.Class;
import lnc.x6;
import lnc.y6;
import com.yxcorp.plugin.search.result.hashtag.entity.TagInfo;
import java.lang.String;
import brd.t;
import bed.u;
import bed.x;
import crd.b;

public final class w implements g	// class@000425
{
    public final y b;
    public final b$a c;

    public void w(y p0,b$a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       w tb = this.b;
       w tc = this.c;
       Objects.requireNonNull(tb);
       y6.r(m.class).wx(tb.b.mTagId, tb.h).subscribe(new u(tb, tc), new x(tb, tc));
    }
}
