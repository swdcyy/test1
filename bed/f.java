package bed.f;
import erd.g;
import bed.y;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import qm6.b$a;
import java.lang.Object;
import ixc.c;
import java.util.Objects;
import s3b.a;
import com.yxcorp.plugin.search.result.hashtag.entity.TagInfo;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import brd.t;
import com.yxcorp.gifshow.fragment.ObservableBox;
import t45.d;
import brd.z;
import bed.d;
import bed.c;
import crd.b;

public final class f implements g	// class@000408
{
    public final y b;
    public final SimpleMagicFace c;
    public final b$a d;
    public final int e;

    public void f(y p0,SimpleMagicFace p1,b$a p2,int p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       String photoId;
       f tb = this.b;
       f tc = this.c;
       f td = this.d;
       f te = this.e;
       c uoc = p0;
       Objects.requireNonNull(tb);
       p0 = uoc.KA();
       y b = tb.b;
       if (b != null) {
          TagInfo mInitiatorPh = b.mInitiatorPhoto;
          if (mInitiatorPh != null) {
             photoId = mInitiatorPh.getPhotoId();
          label_0021 :
             d uod = new d(tb, p0, td, te, uoc);
             ObservableBox.a(p0.c(tc, MagicBusinessId.VIDEO, photoId)).observeOn(d.a).subscribe(v10, new c(tb, p0, td, te));
             return;
          }
       }
       photoId = "";
       goto label_0021 ;
    }
}
