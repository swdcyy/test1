package com.yxcorp.gifshow.v3.editor.music_v2.ui.music.MusicMainFragment;
import com.kwai.feature.post.api.fragment.FlyWheelBaseFragment;
import java.util.ArrayList;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.music.MusicMainFragment$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import tvc.f;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import java.util.Iterator;
import java.lang.Iterable;
import ei0.a;
import android.os.Bundle;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.Fragment;
import msc.q;
import lsc.f0;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import qrc.v;
import com.yxcorp.gifshow.v3.editor.music_v2.MusicContainerType;
import java.util.List;
import java.util.Collection;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicRootFragment;
import yrc.a;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment$e;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import java.util.HashMap;

public final class MusicMainFragment extends FlyWheelBaseFragment	// class@0010e0
{
    public final List n;
    public q o;
    public final MusicMainFragment$a p;
    public HashMap q;

    public void MusicMainFragment(){
       super();
       this.n = new ArrayList();
       this.p = new MusicMainFragment$a(this);
    }
    public String E7(){
       return "MusicTab";
    }
    public final void ch(){
       if (PatchProxy.applyVoid(null, this, MusicMainFragment.class, "4")) {
          return;
       }
       MusicMainFragment to = this.o;
       if (to == null) {
          a.S("musicViewModel");
       }
       to.r0().observe(this, this.p);
       Iterator iterator = this.n.iterator();
       while (iterator.hasNext()) {
          iterator.next().B();
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicMainFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.o = f0.i(this);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MusicMainFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       View view = a.g(p0, R.layout.arg_RES_7f0d0367, p1, false);
       a.o(view, "rootView");
       this.n.addAll(v.a.a(MusicContainerType.MAIN, this, view));
       this.ch();
       if (!PatchProxy.applyVoid(null, this, MusicMainFragment.class, "3")) {
          f0.b(this).eh(new a(this));
       }
       return view;
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, MusicMainFragment.class, "7")) {
       }else {
          MusicMainFragment tq = this.q;
          if (tq != null) {
             tq.clear();
          }
       }
       return;
    }
}
