package com.yxcorp.gifshow.v3.editor.ktv.lyric.KtvLyricEditorFragment;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.KtvLyricEditorFragment$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import voc.o;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.widget.adv.model.f;
import aw9.z;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment$d;
import com.yxcorp.gifshow.v3.editor.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import lnc.a1;
import com.yxcorp.gifshow.v3.editor.text.subtitle.b;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel;
import androidx.lifecycle.ViewModel;
import i2b.a;
import lwc.h;
import uld.i;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.yxcorp.gifshow.v3.f;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import kwc.u;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.z;

public class KtvLyricEditorFragment extends BaseEditorFragment	// class@000fcd
{
    public KtvLyricEditorFragment$a G;
    public PresenterV2 H;

    public void KtvLyricEditorFragment(){
       super();
       this.G = new KtvLyricEditorFragment$a(this);
    }
    public void fh(){
       if (PatchProxy.applyVoid(null, this, KtvLyricEditorFragment.class, "2")) {
          return;
       }
       this.G.q = this.t.x().d();
       this.G.m.l();
       Object[] objArray = new Object[]{this.G,this.hh(),this.G.f.f().D()};
       this.H.i(objArray);
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KtvLyricEditorFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(KtvLyricEditorFragment.class, null);
       return objectsByTag;
    }
    public void gh(){
       if (PatchProxy.applyVoid(null, this, KtvLyricEditorFragment.class, "3")) {
          return;
       }
       this.H.unbind();
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, KtvLyricEditorFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       KtvLyricEditorFragment tG = this.G;
       tG.b = this;
       tG.e = a1.p(0x7f101b3c);
       tG.g = new b(true);
       tG.t = ViewModelProviders.of(this.getActivity()).get(FontViewModel.class);
       this.q = a.g(p0, 0x7f0d04bc, p1, false);
       this.H = new PresenterV2();
       KtvLyricEditorFragment tG1 = this.G;
       tG1.m = new i(f.q(tG1.f), this.G.f.l().C0(false));
       this.H.U7(new u());
       this.H.U7(new z());
       this.H.f(this.q);
       this.fh();
       return this.q;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, KtvLyricEditorFragment.class, "4")) {
          return;
       }
       super.onDestroyView();
       KtvLyricEditorFragment tH = this.H;
       if (tH != null) {
          tH.destroy();
          this.H = null;
       }
       return;
    }
}
