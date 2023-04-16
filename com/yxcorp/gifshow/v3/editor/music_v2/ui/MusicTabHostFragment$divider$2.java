package com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicTabHostFragment$divider$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicTabHostFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.Fragment;

public final class MusicTabHostFragment$divider$2 extends Lambda implements a	// class@0010d2
{
    public final MusicTabHostFragment this$0;

    public void MusicTabHostFragment$divider$2(MusicTabHostFragment p0){
       this.this$0 = p0;
       super(0);
    }
    public final View invoke(){
       Object[] objArray = null;
       View obj = PatchProxy.apply(objArray, this, MusicTabHostFragment$divider$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.getView();
       if (obj != null) {
          objArray = obj.findViewById(R.id.divider);
       }
       return objArray;
    }
    public Object invoke(){
       return this.invoke();
    }
}
