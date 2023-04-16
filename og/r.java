package og.r;
import com.feature.post.bridge.util.d$b;
import com.feature.post.bridge.util.d$a;
import com.feature.post.bridge.jsmodel.PostVideoUploadResult;
import og.b1;
import java.lang.Object;
import java.lang.String;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import og.l;
import java.lang.StringBuilder;
import q87.c;
import com.feature.post.bridge.jsmodel.PostVideoUploadResult$ShopUploadData;

public final class r implements d$b	// class@0027bf
{
    public final d$a a;
    public final float b;
    public final PostVideoUploadResult c;
    public final b1 d;

    public void r(d$a p0,float p1,PostVideoUploadResult p2,b1 p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final void a(String p0){
       r ta = this.a;
       r tb = this.b;
       r tc = this.c;
       r td = this.d;
       if (ta.b != null || !TextUtils.x(p0)) {
          Object[] objArray = new Object[0];
          l.D().w("PostMediaHelper", "onProgressChanged progress="+tb, objArray);
          ta.b = true;
          tc.mData.mThumbnail = p0;
          td.a(tc);
       }
       return;
    }
}
