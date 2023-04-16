package com.yxcorp.gifshow.detail.common.rightactionbar.more.MoreOtherSettingBottomSheet;
import im8.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.util.HashMap;
import lnc.a1;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qz9.p;
import java.util.Map;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Integer;
import whc.k0;
import qa9.s;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import qz9.t;
import im8.c;
import qz9.l;
import android.view.View$OnClickListener;

public class MoreOtherSettingBottomSheet extends BaseFragment implements g	// class@0014aa
{
    public QPhoto j;
    public k0 k;
    public PresenterV2 l;
    public static final HashMap m;
    public static final int n;

    static {
       MoreOtherSettingBottomSheet.m = new HashMap();
       MoreOtherSettingBottomSheet.n = a1.e(0x43f70000);
    }
    public void MoreOtherSettingBottomSheet(){
       super();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MoreOtherSettingBottomSheet.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new p();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, MoreOtherSettingBottomSheet.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(MoreOtherSettingBottomSheet.class, new p());
       }else {
          obj.put(MoreOtherSettingBottomSheet.class, null);
       }
       return obj;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MoreOtherSettingBottomSheet.class, "1")) {
          return;
       }
       super.onCreate(p0);
       p0 = this.getArguments();
       if (p0 != null) {
          this.j = SerializableHook.getSerializable(p0, "photo");
          int intx = p0.getInt("fragmentId");
          HashMap m = MoreOtherSettingBottomSheet.m;
          this.k = m.get(Integer.valueOf(intx));
          m.remove(Integer.valueOf(intx));
       }else {
          s.b(this);
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MoreOtherSettingBottomSheet.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d096c, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, MoreOtherSettingBottomSheet.class, "6")) {
          return;
       }
       super.onDestroyView();
       this.l.destroy();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MoreOtherSettingBottomSheet.class, "3")) {
          return;
       }
       String str = "4";
       PresenterV2 presenterV2 = PatchProxy.applyWithListener(null, this, MoreOtherSettingBottomSheet.class, str);
       if (presenterV2 != PatchProxyResult.class) {
       }else {
          presenterV2 = new PresenterV2();
          presenterV2.U7(new t());
          PatchProxy.onMethodExit(MoreOtherSettingBottomSheet.class, str);
       }
       this.l = presenterV2;
       presenterV2.f(p0);
       Object[] objArray = new Object[]{new c("FRAGMENT", this),this};
       this.l.i(objArray);
       p0.findViewById(R.id.more_setting_bottom_sheet_close).setOnClickListener(new l(this));
       return;
    }
}
