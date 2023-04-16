package com.yxcorp.gifshow.v3.editor.magicfinger.MagicFingerFragment;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.v3.editor.magicfinger.MagicFingerFragment$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.magicfinger.o;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment$d;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import i2b.a;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;

public class MagicFingerFragment extends BaseEditorFragment	// class@001029
{
    public o G;
    public MagicFingerFragment$a H;

    public void MagicFingerFragment(){
       super();
       this.H = new MagicFingerFragment$a(this);
    }
    public String E7(){
       return "Scrawl";
    }
    public void fh(){
       if (PatchProxy.applyVoid(null, this, MagicFingerFragment.class, "2")) {
          return;
       }
       o oo = new o();
       this.G = oo;
       oo.f(this.q);
       Object[] objArray = new Object[]{this.H,this.hh()};
       this.G.i(objArray);
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MagicFingerFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(MagicFingerFragment.class, null);
       return objectsByTag;
    }
    public void gh(){
       if (PatchProxy.applyVoid(null, this, MagicFingerFragment.class, "3")) {
          return;
       }
       MagicFingerFragment tG = this.G;
       if (tG != null) {
          tG.destroy();
          this.G = null;
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MagicFingerFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       this.q = a.g(p0, 0x7f0d04ec, p1, false);
       MagicFingerFragment tH = this.H;
       tH.b = this;
       tH.e = this.getResources().getString(0x7f100aed);
       tH.f = this.s;
       this.fh();
       return this.q;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, MagicFingerFragment.class, "4")) {
          return;
       }
       super.onDestroyView();
       this.gh();
       return;
    }
    public boolean sh(){
       return true;
    }
}
