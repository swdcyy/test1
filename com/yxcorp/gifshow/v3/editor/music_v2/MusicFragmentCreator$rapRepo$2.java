package com.yxcorp.gifshow.v3.editor.music_v2.MusicFragmentCreator$rapRepo$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.music_v2.MusicFragmentCreator;
import com.yxcorp.gifshow.v3.editor.music_v2.network.RapRepo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;

public final class MusicFragmentCreator$rapRepo$2 extends Lambda implements a	// class@001059
{
    public final MusicFragmentCreator this$0;

    public void MusicFragmentCreator$rapRepo$2(MusicFragmentCreator p0){
       this.this$0 = p0;
       super(0);
    }
    public final RapRepo invoke(){
       Object obj = PatchProxy.apply(null, this, MusicFragmentCreator$rapRepo$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RapRepo(this.this$0.d);
    }
    public Object invoke(){
       return this.invoke();
    }
}
