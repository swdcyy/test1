package com.yxcorp.gifshow.v3.editor.music_v2.ui_new.EditMusicMainViewBinder$tabHostFragment$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.EditMusicMainViewBinder;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.MainTabHostFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.Fragment;

public final class EditMusicMainViewBinder$tabHostFragment$2 extends Lambda implements a	// class@0010ff
{
    public final EditMusicMainViewBinder this$0;

    public void EditMusicMainViewBinder$tabHostFragment$2(EditMusicMainViewBinder p0){
       this.this$0 = p0;
       super(0);
    }
    public final MainTabHostFragment invoke(){
       Object obj = PatchProxy.apply(null, this, EditMusicMainViewBinder$tabHostFragment$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new MainTabHostFragment(this.this$0.D());
    }
    public Object invoke(){
       return this.invoke();
    }
}
