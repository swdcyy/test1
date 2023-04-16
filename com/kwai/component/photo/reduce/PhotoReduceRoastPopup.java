package com.kwai.component.photo.reduce.PhotoReduceRoastPopup;
import im8.g;
import androidx.fragment.app.KwaiDialogFragment;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import yf5.a2;
import java.util.Map;
import java.util.HashMap;
import android.os.Bundle;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import androidx.fragment.app.Fragment;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.entity.QPhoto;
import android.os.Parcelable;
import org.parceler.b;
import com.yxcorp.gifshow.model.config.FeedNegativeFeedback$NegativeReason;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.kwai.component.photo.reduce.q;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import im8.c;

public class PhotoReduceRoastPopup extends KwaiDialogFragment implements g	// class@000ad8
{
    public QPhoto p;
    public int q;
    public FeedNegativeFeedback$NegativeReason r;
    public View$OnClickListener s;
    public PresenterV2 t;
    public static final int u;

    public void PhotoReduceRoastPopup(){
       super();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PhotoReduceRoastPopup.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new a2();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, PhotoReduceRoastPopup.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(PhotoReduceRoastPopup.class, new a2());
       }else {
          obj.put(PhotoReduceRoastPopup.class, null);
       }
       return obj;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoReduceRoastPopup.class, "5")) {
          return;
       }
       Dialog dialog = this.getDialog();
       super.onActivityCreated(p0);
       if (this.getShowsDialog() && (dialog != null && dialog.getWindow() != null)) {
          Window window = dialog.getWindow();
          window.setWindowAnimations(R.style.arg_RES_7f1103a5);
          window.setLayout(-1, -2);
          window.setGravity(81);
       }
    label_0034 :
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoReduceRoastPopup.class, "2")) {
          return;
       }
       super.onCreate(p0);
       if (this.getArguments() != null) {
          this.p = SerializableHook.getSerializable(this.getArguments(), "photo");
          this.r = b.a(this.getArguments().getParcelable("reason"));
          this.q = this.getArguments().getInt("source");
       }
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PhotoReduceRoastPopup.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.setCancelable(true);
       this.setStyle(true, R.style.arg_RES_7f11035b);
       Dialog uDialog = super.onCreateDialog(p0);
       uDialog.setCancelable(true);
       uDialog.setCanceledOnTouchOutside(true);
       return uDialog;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, PhotoReduceRoastPopup.class, "4");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.g(p0, R.layout.arg_RES_7f0d1137, p1, false);
       q oq = new q();
       this.t = oq;
       oq.f(view);
       Object[] objArray = new Object[]{this,new c("FRAGMENT", this)};
       this.t.i(objArray);
       return view;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, PhotoReduceRoastPopup.class, "6")) {
          return;
       }
       super.onDestroyView();
       this.t.destroy();
       return;
    }
}
