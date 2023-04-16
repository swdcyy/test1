package com.yxcorp.gifshow.detail.common.rightactionbar.more.MoreBottomSheet;
import im8.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.util.HashMap;
import lnc.a1;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qz9.f;
import java.util.Map;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Integer;
import whc.k0;
import uf5.c0;
import android.content.Context;
import qa9.s;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.common.rightactionbar.more.b;
import im8.c;
import qz9.a;
import android.view.View$OnClickListener;

public class MoreBottomSheet extends BaseFragment implements g	// class@0014a9
{
    public QPhoto j;
    public k0 k;
    public c0 l;
    public PresenterV2 m;
    public static final HashMap n;
    public static final int o;

    static {
       MoreBottomSheet.n = new HashMap();
       MoreBottomSheet.o = a1.e(0x43f70000);
    }
    public void MoreBottomSheet(){
       super();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MoreBottomSheet.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new f();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, MoreBottomSheet.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(MoreBottomSheet.class, new f());
       }else {
          obj.put(MoreBottomSheet.class, null);
       }
       return obj;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MoreBottomSheet.class, "1")) {
          return;
       }
       super.onCreate(p0);
       p0 = this.getArguments();
       if (p0 != null) {
          this.j = SerializableHook.getSerializable(p0, "photo");
          int intx = p0.getInt("fragmentId");
          HashMap n = MoreBottomSheet.n;
          this.k = n.get(Integer.valueOf(intx));
          this.l = new c0(this.j, this.getContext());
          n.remove(Integer.valueOf(intx));
       }else {
          s.b(this);
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MoreBottomSheet.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d096b, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, MoreBottomSheet.class, "6")) {
          return;
       }
       super.onDestroyView();
       this.m.destroy();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MoreBottomSheet.class, "4")) {
          return;
       }
       String str = "2";
       PresenterV2 presenterV2 = PatchProxy.applyWithListener(null, this, MoreBottomSheet.class, str);
       if (presenterV2 != PatchProxyResult.class) {
       }else {
          presenterV2 = new PresenterV2();
          presenterV2.U7(new b());
          PatchProxy.onMethodExit(MoreBottomSheet.class, str);
       }
       this.m = presenterV2;
       presenterV2.f(p0);
       Object[] objArray = new Object[]{new c("FRAGMENT", this),this};
       this.m.i(objArray);
       p0.findViewById(R.id.more_bottom_sheet_close).setOnClickListener(new a(this));
       return;
    }
}
