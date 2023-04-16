package com.kwai.component.photo.reduce.PhotoReduceReasonDetailFragment;
import ml8.d;
import im8.g;
import com.yxcorp.gifshow.fragment.BottomSheetFragment;
import yf5.c1;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import androidx.recyclerview.widget.RecyclerView;
import yf5.d1;
import android.view.View$OnClickListener;
import com.kwai.robust.PatchProxyResult;
import yf5.j1;
import java.util.Map;
import java.util.HashMap;
import android.os.Bundle;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.fragment.app.Fragment;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.entity.QPhoto;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.component.photo.reduce.m;

public class PhotoReduceReasonDetailFragment extends BottomSheetFragment implements d, g	// class@000ad3
{
    public QPhoto A;
    public int B;
    public RecyclerView C;
    public PresenterV2 D;
    public View$OnClickListener E;
    public View$OnClickListener F;
    public boolean z;
    public static final int G;

    public void PhotoReduceReasonDetailFragment(){
       super();
       this.F = new c1(this);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoReduceReasonDetailFragment.class, "2")) {
          return;
       }
       this.C = m1.f(p0, 0x7f0a34da);
       m1.a(p0, new d1(this), R.id.cancel_button);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PhotoReduceReasonDetailFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new j1();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, PhotoReduceReasonDetailFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(PhotoReduceReasonDetailFragment.class, new j1());
       }else {
          obj.put(PhotoReduceReasonDetailFragment.class, null);
       }
       return obj;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoReduceReasonDetailFragment.class, "3")) {
          return;
       }
       super.onCreate(p0);
       if (this.getArguments() != null) {
          this.A = SerializableHook.getSerializable(this.getArguments(), "photo");
          this.B = this.getArguments().getInt("source", 0);
          this.z = this.getArguments().getBoolean("channel");
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, PhotoReduceReasonDetailFragment.class, "4");
       if (p2 != patchProxyRe) {
          return p2;
       }
       View view = a.g(p0, R.layout.arg_RES_7f0d112f, p1, false);
       this.doBindView(view);
       PresenterV2 presenterV2 = PatchProxy.applyWithListener(null, this, PhotoReduceReasonDetailFragment.class, "6");
       int i = 1;
       if (presenterV2 != patchProxyRe) {
       }else {
          presenterV2 = new PresenterV2();
          presenterV2.U7(new m(i));
          PatchProxy.onMethodExit(PhotoReduceReasonDetailFragment.class, "6");
       }
       this.D = presenterV2;
       presenterV2.f(view);
       Object[] objArray = new Object[i];
       objArray[0] = this;
       this.D.i(objArray);
       return view;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, PhotoReduceReasonDetailFragment.class, "7")) {
          return;
       }
       super.onDestroyView();
       this.D.destroy();
       return;
    }
}
