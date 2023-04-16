package com.yxcorp.gifshow.v3.editor.music_v2.ui_new.recommend.EditMusicRecommendFragment;
import esc.e;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import b9c.b0;
import b9c.w;
import b9c.a;
import b9c.c;
import nsd.u;
import java.util.ArrayList;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.recommend.EditMusicRecommendFragment$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.lang.Iterable;
import ei0.a;
import esc.k;
import kotlin.jvm.internal.a;
import tvc.f;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import msc.q;
import lsc.f0;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.recommend.RecommendMusicViewBinderV2;
import com.trello.rxlifecycle3.components.support.RxFragment;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicRootFragment;
import isc.a;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment$e;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import java.util.HashMap;
import esc.e$a;

public final class EditMusicRecommendFragment extends BaseFragment implements e	// class@00110b
{
    public final List j;
    public q k;
    public final EditMusicRecommendFragment$a l;
    public HashMap m;

    public void EditMusicRecommendFragment(){
       super(null, null, null, null, 15, null);
       this.j = super();
       this.l = new EditMusicRecommendFragment$a(this);
    }
    public boolean Hg(){
       return true;
    }
    public void La(){
       if (PatchProxy.applyVoid(null, this, EditMusicRecommendFragment.class, "6")) {
          return;
       }
       Iterator iterator = this.j.iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          if (uoa instanceof k) {
             uoa.e();
          }
       }
       return;
    }
    public final void ch(){
       if (PatchProxy.applyVoid(null, this, EditMusicRecommendFragment.class, "4")) {
          return;
       }
       EditMusicRecommendFragment tk = this.k;
       if (tk == null) {
          a.S("musicViewModel");
       }
       tk.r0().observe(this, this.l);
       Iterator iterator = this.j.iterator();
       while (iterator.hasNext()) {
          iterator.next().B();
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditMusicRecommendFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.k = f0.i(this);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, EditMusicRecommendFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       View view = a.g(p0, R.layout.arg_RES_7f0d036a, p1, false);
       a.o(view, "rootView");
       this.j.add(new RecommendMusicViewBinderV2(this, view));
       this.ch();
       if (!PatchProxy.applyVoid(null, this, EditMusicRecommendFragment.class, "3")) {
          f0.b(this).eh(new a(this));
       }
       return view;
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, EditMusicRecommendFragment.class, "9")) {
       }else {
          EditMusicRecommendFragment tm = this.m;
          if (tm != null) {
             tm.clear();
          }
       }
       return;
    }
    public void xf(){
       if (PatchProxy.applyVoid(null, this, EditMusicRecommendFragment.class, "7")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(this, null, e$a.class, "1")) {
          this.La();
       }
       return;
    }
}
