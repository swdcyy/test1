package com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicRootFragment$collectListAdapter$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicRootFragment;
import java.lang.Object;
import jn9.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import msc.a;
import java.util.Objects;
import kotlin.jvm.internal.a;

public final class MusicRootFragment$collectListAdapter$2 extends Lambda implements a	// class@0010c5
{
    public final MusicRootFragment this$0;

    public void MusicRootFragment$collectListAdapter$2(MusicRootFragment p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final b invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, MusicRootFragment$collectListAdapter$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.this$0.Bh();
       Objects.requireNonNull(obj);
       a uoa = PatchProxy.apply(objArray, obj, a.class, "5");
       if (uoa != patchProxyRe) {
       }else {
          uoa = obj.c;
          if (uoa == null) {
             a.S("collectAdapter");
          }
       }
       return uoa;
    }
}
