package com.yxcorp.gifshow.v3.editor.ktv.voice.KtvEditOperationFragment;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.v3.editor.ktv.voice.KtvEditOperationFragment$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment$d;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.editor.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.v3.editor.ktv.voice.i;

public class KtvEditOperationFragment extends BaseEditorFragment	// class@000ff4
{
    public i G;
    public KtvEditOperationFragment$a H;

    public void KtvEditOperationFragment(){
       super();
       this.H = new KtvEditOperationFragment$a(this);
    }
    public void fh(){
       if (PatchProxy.applyVoid(null, this, KtvEditOperationFragment.class, "2")) {
          return;
       }
       Object[] objArray = new Object[]{this.H,this.hh(),this.H.e.f().D()};
       this.G.i(objArray);
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KtvEditOperationFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(KtvEditOperationFragment.class, null);
       return objectsByTag;
    }
    public void gh(){
       if (PatchProxy.applyVoid(null, this, KtvEditOperationFragment.class, "3")) {
          return;
       }
       this.G.unbind();
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, KtvEditOperationFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       this.q = a.g(p0, 0x7f0d04d2, p1, false);
       p0.b = this;
       i oi = new i();
       this.G = oi;
       oi.f(this.q);
       this.fh();
       return this.q;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, KtvEditOperationFragment.class, "4")) {
          return;
       }
       super.onDestroyView();
       this.G.destroy();
       return;
    }
}
