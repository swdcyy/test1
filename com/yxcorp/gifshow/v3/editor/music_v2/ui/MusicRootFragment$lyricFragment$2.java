package com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicRootFragment$lyricFragment$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicRootFragment;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.lyric.MusicLyricFragment;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import kotlin.jvm.internal.a;
import msc.a;
import java.util.Objects;
import jn9.b;

public final class MusicRootFragment$lyricFragment$2 extends Lambda implements a	// class@0010ca
{
    public final MusicRootFragment this$0;

    public void MusicRootFragment$lyricFragment$2(MusicRootFragment p0){
       this.this$0 = p0;
       super(0);
    }
    public final MusicLyricFragment invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       MusicLyricFragment obj = PatchProxy.apply(objArray, this, MusicRootFragment$lyricFragment$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new MusicLyricFragment();
       BaseEditorFragment t = this.this$0.t;
       a.o(t, "mEditorDelegate");
       if (!PatchProxy.applyVoidOneRefs(t, obj, MusicLyricFragment.class, "2")) {
          a.p(t, "<set-?>");
          obj.p = t;
       }
       a uoa = this.this$0.Bh();
       Objects.requireNonNull(uoa);
       a uoa1 = PatchProxy.apply(objArray, uoa, a.class, "3");
       if (uoa1 != patchProxyRe) {
       }else {
          uoa1 = uoa.b;
          if (uoa1 == null) {
             a.S("lyricAdapter");
          }
       }
       if (!PatchProxy.applyVoidOneRefs(uoa1, obj, MusicLyricFragment.class, "4")) {
          a.p(uoa1, "<set-?>");
          obj.q = uoa1;
       }
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
