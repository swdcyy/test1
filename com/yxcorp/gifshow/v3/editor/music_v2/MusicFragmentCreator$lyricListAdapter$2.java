package com.yxcorp.gifshow.v3.editor.music_v2.MusicFragmentCreator$lyricListAdapter$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.music_v2.MusicFragmentCreator;
import java.lang.Object;
import jn9.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jn9.d;
import trc.j;
import java.util.Objects;
import com.yxcorp.gifshow.v3.editor.music_v2.network.LyricRepo;
import qrd.p;
import src.c;
import java.util.List;
import trd.t;
import mn9.b;
import nsd.u;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import androidx.lifecycle.LifecycleOwner;

public final class MusicFragmentCreator$lyricListAdapter$2 extends Lambda implements a	// class@001055
{
    public final MusicFragmentCreator this$0;

    public void MusicFragmentCreator$lyricListAdapter$2(MusicFragmentCreator p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final b invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, MusicFragmentCreator$lyricListAdapter$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       MusicFragmentCreator$lyricListAdapter$2 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       Object obj1 = PatchProxy.apply(objArray, tthis$0, MusicFragmentCreator.class, "11");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = tthis$0.t.getValue();
       }
       d uod = new d(new j(obj1), 1, null, false, t.k(new c()), null, false, 108, null);
       return new b(v13, this.this$0.d.q());
    }
}
