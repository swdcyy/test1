package ced.v1$b;
import erd.g;
import ced.v1;
import java.lang.Object;
import ixc.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.s;
import uy5.a;
import q87.c;
import kotlin.jvm.internal.a;
import io.reactivex.subjects.PublishSubject;
import java.lang.StringBuilder;
import com.yxcorp.plugin.search.result.hashtag.entity.TagInfo;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import s3b.a;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import brd.t;
import ced.x1;
import ced.y1;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class v1$b implements g	// class@000586
{
    public final v1 b;

    public void v1$b(v1 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v1$b.class, "1")) {
       }else {
          int i = 0;
          String str = "TagMagicFacePreDownloadPresenter";
          if (!p0.isAvailable()) {
             Object[] objArray = new Object[i];
             a.C().w(str, "MagicEmojiPlugin is unAvailable", objArray);
             p0 = this.b.q;
             a.m(p0);
             p0.onNext("fail");
          }else {
             v1 p = this.b.p;
             a.m(p);
             Object[] objArray1 = new Object[i];
             a.C().w(str, "getValidMagicFace : "+p.mMagicFace.mId, objArray1);
             a.o(p0, "magicEmojiPlugin");
             a uoa = p0.KA();
             if (uoa != null) {
                v1 p1 = this.b.p;
                a.m(p1);
                TagInfo mMagicFace = p1.mMagicFace;
                a.m(mMagicFace);
                t ot = uoa.s(mMagicFace, MagicBusinessId.VIDEO);
                if (ot != null) {
                   p0 = ot.subscribe(new x1(this, p0), new y1(this));
                   if (p0 != null) {
                      this.b.X7(p0);
                   }
                }
             }
          }
       }
       return;
    }
}
