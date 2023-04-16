package com.kwai.roampanel.panel.RoamPanelFragment;
import im8.g;
import com.kwai.roampanel.panel.RoamPanelThemedDialogFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import mm7.h;
import java.util.Map;
import java.util.HashMap;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import i2b.a;
import androidx.fragment.app.Fragment;
import com.kwai.roampanel.panel.c;
import androidx.fragment.app.c;
import z1.a;
import mm7.r;
import uw5.c;
import java.lang.Integer;
import mrd.a;

public class RoamPanelFragment extends RoamPanelThemedDialogFragment implements g	// class@0013d4
{
    public ViewGroup c;
    public final PresenterV2 d;
    public a e;
    public b f;
    public r g;

    public void RoamPanelFragment(){
       super();
       this.d = new PresenterV2();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RoamPanelFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, RoamPanelFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(RoamPanelFragment.class, new h());
       }else {
          obj.put(RoamPanelFragment.class, null);
       }
       return obj;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, RoamPanelFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d1326, p1, false);
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, RoamPanelFragment.class, "5")) {
          return;
       }
       super.onDestroy();
       this.d.destroy();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RoamPanelFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (!PatchProxy.applyVoidOneRefs(p0, this, RoamPanelFragment.class, "4")) {
          this.d.U7(new c(this, this.getChildFragmentManager(), this.e));
          this.d.f(p0);
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, RoamPanelFragment.class, "3")) {
          this.c = p0;
          Object[] objArray = new Object[]{this,this.g};
          this.d.i(objArray);
       }
       RoamPanelFragment tg = this.g;
       tg.f.onNext(Integer.valueOf(tg.h.a()));
       return;
    }
}
