package com.yxcorp.gifshow.v3.editor.ktv.crop.KtvCropFragment;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.v3.editor.ktv.crop.KtvCropFragment$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.ktv.crop.h;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment$d;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.editor.i;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import i2b.a;
import lnc.a1;

public class KtvCropFragment extends BaseEditorFragment	// class@000fbd
{
    public h G;
    public KtvCropFragment$a H;

    public void KtvCropFragment(){
       super();
       this.H = new KtvCropFragment$a(this);
    }
    public void fh(){
       if (PatchProxy.applyVoid(null, this, KtvCropFragment.class, "2")) {
          return;
       }
       h oh = new h();
       this.G = oh;
       oh.f(this.q);
       Object[] objArray = new Object[]{this.H,this.hh(),this.H.f.f().D()};
       this.G.i(objArray);
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KtvCropFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(KtvCropFragment.class, null);
       return objectsByTag;
    }
    public void gh(){
       if (PatchProxy.applyVoid(null, this, KtvCropFragment.class, "3")) {
          return;
       }
       KtvCropFragment tG = this.G;
       if (tG != null) {
          tG.destroy();
          this.G = null;
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, KtvCropFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       this.q = a.g(p0, 0x7f0d04d1, p1, false);
       KtvCropFragment tH = this.H;
       tH.b = this;
       tH.e = a1.p(0x7f10092f);
       this.fh();
       return this.q;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, KtvCropFragment.class, "4")) {
          return;
       }
       super.onDestroyView();
       this.gh();
       return;
    }
}
