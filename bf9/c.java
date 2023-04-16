package bf9.c;
import com.yxcorp.gifshow.camera.record.base.b$a;
import bf9.h;
import java.lang.Object;
import java.util.Objects;
import w3b.p;
import java.lang.String;
import com.yxcorp.gifshow.camera.record.video.w;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.model.MagicFaceExtraParams;
import java.lang.Integer;
import j8c.a;
import java.lang.Throwable;
import w46.b;
import vf9.b;

public final class c implements b$a	// class@00048d
{
    public final h a;

    public void c(h p0){
       this.a = p0;
    }
    public final Object getData(){
       b uob;
       c ta = this.a;
       Objects.requireNonNull(ta);
       MagicEmoji$MagicFace magicFace = p.b().c(ta.r.k2());
       if (magicFace == null || !magicFace.equals(ta.q)) {
          uob = null;
       }else {
          h b = ta.B;
          h c = ta.C;
          if (TextUtils.x(b)) {
             magicFace = magicFace.mExtraParams;
             b = magicFace.mPlatformMusicId;
             if (b == null) {
                b = "";
             }else {
                try{
                   c = Integer.parseInt(magicFace.mPlatformMusicType);
                }catch(java.lang.NumberFormatException e1){
                   a.D().e("PlatformMagicController", "parse magic extra params music type error", e1);
                }
             }
          }
       }
       return uob;
    }
}
