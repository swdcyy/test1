package og.e0;
import erd.o;
import com.yxcorp.gifshow.entity.QPhoto;
import android.os.Bundle;
import java.lang.Object;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.String;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;

public final class e0 implements o	// class@0027a1
{
    public final QPhoto b;
    public final Bundle c;

    public void e0(QPhoto p0,Bundle p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       e0 tb = this.b;
       e0 tc = this.c;
       if (TextUtils.x(p0.mId)) {
       }else {
          SerializableHook.putSerializable(tc, "magic_face", p0);
       }
       return tb;
    }
}
