package com.yxcorp.gifshow.v3.editor.music_v2.MusicFragmentCreator$lyricRepo$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.music_v2.MusicFragmentCreator;
import com.yxcorp.gifshow.v3.editor.music_v2.network.LyricRepo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.yxcorp.gifshow.v3.editor.music_v2.vm.LyricViewModel;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.a;

public final class MusicFragmentCreator$lyricRepo$2 extends Lambda implements a	// class@001056
{
    public final MusicFragmentCreator this$0;

    public void MusicFragmentCreator$lyricRepo$2(MusicFragmentCreator p0){
       this.this$0 = p0;
       super(0);
    }
    public final LyricRepo invoke(){
       ViewModel obj = PatchProxy.apply(null, this, MusicFragmentCreator$lyricRepo$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = ViewModelProviders.of(this.this$0.e).get(LyricViewModel.class);
       a.o(obj, "ViewModelProviders.of\(ac¡­ricViewModel::class.java\)");
       return obj.o0();
    }
    public Object invoke(){
       return this.invoke();
    }
}
