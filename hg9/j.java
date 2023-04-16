package hg9.j;
import erd.g;
import com.yxcorp.gifshow.camera.record.photo.e;
import java.lang.Object;
import j4b.k;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.MagicFaceExtraParams;
import com.yxcorp.gifshow.model.MagicFaceAuthor;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ekd.j;

public final class j implements g	// class@002664
{
    public final e b;

    public void j(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       MagicFaceAuthor mImageUrls;
       j tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, e.class, "9")) {
       }else {
          p0 = p0.a;
          MagicFaceAuthor magicFaceAut = null;
          if (p0 != null) {
             p0 = p0.mExtraParams;
             if (p0 != null) {
                p0 = p0.mAuthor;
                if (p0 != null) {
                   magicFaceAut = p0.mName;
                   mImageUrls = p0.mImageUrls;
                   p0 = p0.mTitle;
                label_0028 :
                   boolean b = (!TextUtils.x(magicFaceAut) && (!j.h(mImageUrls) && !TextUtils.x(p0)))? true: false;
                   tb.A = b;
                   tb.n2();
                }
             }
          }
          p0 = magicFaceAut;
          mImageUrls = p0;
          goto label_0028 ;
       }
       return;
    }
}
