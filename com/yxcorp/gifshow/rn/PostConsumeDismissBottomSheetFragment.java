package com.yxcorp.gifshow.rn.PostConsumeDismissBottomSheetFragment;
import com.yxcorp.gifshow.fragment.BottomSheetFragment;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import java.lang.ref.SoftReference;
import vfc.a;
import androidx.fragment.app.KwaiDialogFragment;
import android.os.Bundle;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import com.yxcorp.gifshow.fragment.ContainerFragment;
import com.yxcorp.gifshow.rn.a;
import android.content.Context;
import androidx.fragment.app.Fragment;
import vfc.d;
import vfc.c;
import android.content.DialogInterface$OnKeyListener;
import android.view.View;

public abstract class PostConsumeDismissBottomSheetFragment extends BottomSheetFragment	// class@001b1c
{
    public List z;
    public static final int A;

    public void PostConsumeDismissBottomSheetFragment(){
       super();
       this.z = new ArrayList();
    }
    public boolean Ih(int p0){
       Iterator obj;
       if (PatchProxy.isSupport(PostConsumeDismissBottomSheetFragment.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, PostConsumeDismissBottomSheetFragment.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (q.f(this.z)) {
          return false;
       }else {
          obj = this.z.iterator();
          while (true) {
             if (!obj.hasNext()) {
                return false;
             }
             SoftReference softReferenc = obj.next();
             if (softReferenc.get() != null && softReferenc.get().a(p0)) {
                break ;
             }
          }
          return true;
       }
    }
    public void dismiss(){
       if (PatchProxy.applyVoid(null, this, PostConsumeDismissBottomSheetFragment.class, "4")) {
          return;
       }
       if (this.Ih(1)) {
          return;
       }
       super.dismiss();
       return;
    }
    public void dismissAllowingStateLoss(){
       if (PatchProxy.applyVoid(null, this, PostConsumeDismissBottomSheetFragment.class, "5")) {
          return;
       }
       if (this.Ih(1)) {
          return;
       }
       super.dismissAllowingStateLoss();
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       p0 = PatchProxy.applyOneRefs(p0, this, PostConsumeDismissBottomSheetFragment.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       boolean b = true;
       this.setCancelable(b);
       int i = (this.sh())? 1: 2;
       this.setStyle(i, this.u);
       a uoa = new a(this.getContext(), this.getTheme());
       uoa.setCanceledOnTouchOutside(b);
       uoa.b = new d(this);
       uoa.setOnKeyListener(new c(this));
       return uoa;
    }
    public final void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PostConsumeDismissBottomSheetFragment.class, "1")) {
          return;
       }
       super.onViewCreated(p0, p1);
       return;
    }
}
