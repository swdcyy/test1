package com.yxcorp.gifshow.v3.editor.music_v2.ui_new.local.EditMusicLocalFragment$a;
import tvc.g;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.local.EditMusicLocalFragment;
import java.lang.Object;
import urc.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import java.util.Iterator;
import java.lang.Iterable;
import ei0.a;
import vrc.d;

public final class EditMusicLocalFragment$a extends g	// class@001108
{
    public final EditMusicLocalFragment c;

    public void EditMusicLocalFragment$a(EditMusicLocalFragment p0){
       this.c = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditMusicLocalFragment$a.class, "1")) {
       }else {
          a.p(p0, "newState");
          e uoe = this.a();
          if (uoe == null) {
             EditMusicLocalFragment k = this.c.k;
             if (k == null) {
                a.S("musicViewModel");
             }
             uoe = k.u0();
          }
          Iterator iterator = this.c.j.iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             if (uoa instanceof d) {
                uoa.Mb(p0, uoe);
             }
          }
       }
       return;
    }
}
