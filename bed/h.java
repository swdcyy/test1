package bed.h;
import erd.g;
import bed.y;
import java.lang.String;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import com.kuaishou.android.model.music.Music;
import java.lang.Object;
import qm6.b$a;
import java.util.Objects;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import lnc.s6;
import android.net.Uri;
import ekd.w0;
import android.net.Uri$Builder;
import com.kuaishou.android.model.music.MusicType;

public final class h implements g	// class@00040c
{
    public final y b;
    public final String c;
    public final SimpleMagicFace d;
    public final Music e;

    public void h(y p0,String p1,SimpleMagicFace p2,Music p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       h tb = this.b;
       h tc = this.c;
       h td = this.d;
       h te = this.e;
       Objects.requireNonNull(tb);
       if (p0 != null) {
          if (!TextUtils.x(tc)) {
             p0.h0(tc);
          }
          p0.G(Boolean.FALSE).t(true);
          if (s6.H()) {
             tb.c(p0, td, te);
          }else if(te != null){
             p0.B(w0.f("kwai://post").buildUpon().appendQueryParameter("musicId", te.mId).appendQueryParameter("musicType", String.valueOf(te.mType.mValue)).build());
          }
          tb.l(p0);
       }
       return;
    }
}
