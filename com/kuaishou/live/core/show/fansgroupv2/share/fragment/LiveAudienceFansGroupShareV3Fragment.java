package com.kuaishou.live.core.show.fansgroupv2.share.fragment.LiveAudienceFansGroupShareV3Fragment;
import im8.g;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import p82.p;
import java.util.Map;
import java.util.HashMap;
import android.os.Bundle;
import android.app.Dialog;
import androidx.fragment.app.KwaiDialogFragment;
import android.view.Window;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.DialogFragment;
import com.kuaishou.live.core.show.fansgroupv2.share.fragment.a;
import androidx.fragment.app.Fragment;

public class LiveAudienceFansGroupShareV3Fragment extends LiveSafeDialogFragment implements g	// class@000b57
{
    public a0 s;
    public LiveFansGroupSharePanelInfoV3 t;
    public PresenterV2 u;
    public static final int v;

    public void LiveAudienceFansGroupShareV3Fragment(){
       super();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceFansGroupShareV3Fragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new p();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceFansGroupShareV3Fragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LiveAudienceFansGroupShareV3Fragment.class, new p());
       }else {
          obj.put(LiveAudienceFansGroupShareV3Fragment.class, null);
       }
       return obj;
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceFansGroupShareV3Fragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Dialog uDialog = super.onCreateDialog(p0);
       uDialog.getWindow().requestFeature(1);
       uDialog.getWindow().setDimAmount(0);
       uDialog.getWindow().setGravity(80);
       uDialog.getWindow().setBackgroundDrawableResource(0x106000d);
       uDialog.getWindow().setWindowAnimations(R.style.arg_RES_7f1103d9);
       return uDialog;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveAudienceFansGroupShareV3Fragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d0a54, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceFansGroupShareV3Fragment.class, "4")) {
          return;
       }
       super.onDestroyView();
       LiveAudienceFansGroupShareV3Fragment tu = this.u;
       if (tu != null) {
          tu.unbind();
          this.u.destroy();
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceFansGroupShareV3Fragment.class, "6")) {
          return;
       }
       super.onResume();
       if (this.getDialog() != null && this.getDialog().getWindow() != null) {
          this.getDialog().getWindow().setLayout(-1, -2);
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAudienceFansGroupShareV3Fragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (!PatchProxy.applyVoid(null, this, LiveAudienceFansGroupShareV3Fragment.class, "7")) {
          this.u = new a();
          p0 = this.getView();
          if (p0 != null) {
             this.u.f(p0);
             Object[] objArray = new Object[]{this};
             this.u.i(objArray);
          }
       }
       return;
    }
}
