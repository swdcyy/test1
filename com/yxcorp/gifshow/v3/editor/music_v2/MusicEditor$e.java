package com.yxcorp.gifshow.v3.editor.music_v2.MusicEditor$e;
import qrc.k;
import com.yxcorp.gifshow.v3.editor.music_v2.MusicEditor;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.music.Music;
import kotlin.jvm.internal.a;
import qrc.k$a;
import com.yxcorp.gifshow.v3.editor.BaseEditor;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.v3.EditorActivity;

public final class MusicEditor$e implements k	// class@001046
{
    public final MusicEditor a;

    public void MusicEditor$e(MusicEditor p0){
       this.a = p0;
       super();
    }
    public void Z3(Intent p0){
       PatchProxy.applyVoidOneRefs(p0, this, MusicEditor$e.class, "4");
    }
    public void a(Intent p0){
       PatchProxy.applyVoidOneRefs(p0, this, MusicEditor$e.class, "5");
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, MusicEditor$e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return false;
    }
    public boolean c(Music p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MusicEditor$e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "music");
       return k$a.a(this, p0);
    }
    public boolean d(){
       Object[] objArray = null;
       BaseEditor obj = PatchProxy.apply(objArray, this, MusicEditor$e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.d;
       a.o(obj, "mDelegate");
       BaseFragment uBaseFragmen = obj.q();
       a.o(uBaseFragmen, "previewFragment");
       FragmentActivity activity = uBaseFragmen.getActivity();
       if (activity instanceof EditorActivity) {
          objArray = activity;
       }
       boolean b = true;
       if (objArray == null || objArray.V3(uBaseFragmen) != b) {
          b = false;
       }
       return b;
    }
}
