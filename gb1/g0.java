package gb1.g0;
import com.yxcorp.gifshow.fragment.DialogContainerFragment$b;
import db1.b;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.common.core.component.admin.sensitivewords.LiveSensitiveWordsFragment;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.os.Bundle;

public final class g0 implements DialogContainerFragment$b	// class@00245e
{
    public final b a;

    public void g0(b p0){
       this.a = p0;
    }
    public final Fragment a(){
       LiveSensitiveWordsFragment liveSensitiv = new LiveSensitiveWordsFragment();
       String str = this.a.a();
       if (PatchProxy.applyVoidOneRefs(str, liveSensitiv, LiveSensitiveWordsFragment.class, "2")) {
       }else if(liveSensitiv.getArguments() == null){
          liveSensitiv.setArguments(new Bundle());
       }
       liveSensitiv.getArguments().putString("authorId", str);
       return liveSensitiv;
    }
}
