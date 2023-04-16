package com.kuaishou.live.lite.adapter.component.fansgroup.share.LiveLiteFansGroupShareV3Fragment;
import im8.g;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import com.kuaishou.live.lite.adapter.component.fansgroup.share.LiveLiteFansGroupShareV3Fragment$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import j73.e;
import java.util.Map;
import java.util.HashMap;
import android.os.Bundle;
import android.app.Dialog;
import androidx.fragment.app.KwaiDialogFragment;
import kotlin.jvm.internal.a;
import android.view.Window;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.DialogFragment;
import j73.f;
import androidx.fragment.app.Fragment;

public final class LiveLiteFansGroupShareV3Fragment extends LiveSafeDialogFragment implements g	// class@001d9e
{
    public ClientContent$LiveStreamPackage s;
    public LiveFansGroupSharePanelInfoV3 t;
    public j u;
    public PresenterV2 v;
    public HashMap w;
    public static final LiveLiteFansGroupShareV3Fragment$a x;

    static {
       LiveLiteFansGroupShareV3Fragment.x = new LiveLiteFansGroupShareV3Fragment$a(null);
    }
    public void LiveLiteFansGroupShareV3Fragment(){
       super();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteFansGroupShareV3Fragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LiveLiteFansGroupShareV3Fragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LiveLiteFansGroupShareV3Fragment.class, new e());
       }else {
          obj.put(LiveLiteFansGroupShareV3Fragment.class, null);
       }
       return obj;
    }
    public Dialog onCreateDialog(Bundle p0){
       Window obj = PatchProxy.applyOneRefs(p0, this, LiveLiteFansGroupShareV3Fragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Dialog uDialog = super.onCreateDialog(p0);
       a.o(uDialog, "super.onCreateDialog\(savedInstanceState\)");
       obj = uDialog.getWindow();
       if (obj != null) {
          obj.requestFeature(1);
       }
       obj = uDialog.getWindow();
       if (obj != null) {
          obj.setDimAmount(0);
       }
       obj = uDialog.getWindow();
       if (obj != null) {
          obj.setGravity(80);
       }
       obj = uDialog.getWindow();
       if (obj != null) {
          obj.setBackgroundDrawableResource(R.color.arg_RES_7f062057);
       }
       obj = uDialog.getWindow();
       if (obj != null) {
          obj.setWindowAnimations(R.style.arg_RES_7f1103d9);
       }
       return uDialog;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveLiteFansGroupShareV3Fragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       return a.g(p0, 0x7f0d0a54, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveLiteFansGroupShareV3Fragment.class, "3")) {
          return;
       }
       super.onDestroyView();
       LiveLiteFansGroupShareV3Fragment tv = this.v;
       if (tv != null) {
          tv.unbind();
       }
       tv = this.v;
       if (tv != null) {
          tv.destroy();
       }
       if (!PatchProxy.applyVoid(null, this, LiveLiteFansGroupShareV3Fragment.class, "8")) {
          tv = this.w;
          if (tv != null) {
             tv.clear();
          }
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, LiveLiteFansGroupShareV3Fragment.class, "5")) {
          return;
       }
       super.onResume();
       Dialog dialog = this.getDialog();
       if (dialog != null) {
          Window window = dialog.getWindow();
          if (window != null) {
             window.setLayout(-1, -2);
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteFansGroupShareV3Fragment.class, "2")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       if (!PatchProxy.applyVoid(null, this, LiveLiteFansGroupShareV3Fragment.class, "6")) {
          this.v = new f();
          p0 = this.getView();
          if (p0 != null) {
             LiveLiteFansGroupShareV3Fragment tv = this.v;
             if (tv != null) {
                tv.f(p0);
             }
             LiveLiteFansGroupShareV3Fragment tv1 = this.v;
             if (tv1 != null) {
                Object[] objArray = new Object[]{this};
                tv1.i(objArray);
             }
          }
       }
       return;
    }
}
