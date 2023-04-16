package com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs$p$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs$p;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs;
import nsd.r0;
import lnc.a1;
import kotlin.jvm.internal.a;
import java.util.Arrays;
import java.lang.CharSequence;
import android.widget.TextView;
import java.lang.Integer;

public final class SocialSimplePhotoFragmentViewBinderAbs$p$a implements Runnable	// class@000d86
{
    public final SocialSimplePhotoFragmentViewBinderAbs$p b;

    public void SocialSimplePhotoFragmentViewBinderAbs$p$a(SocialSimplePhotoFragmentViewBinderAbs$p p0){
       this.b = p0;
       super();
    }
    public final void run(){
       SocialSimplePhotoFragmentViewBinderAbs j;
       String str;
       Object[] objArray;
       if (PatchProxy.applyVoid(null, this, SocialSimplePhotoFragmentViewBinderAbs$p$a.class, "1")) {
          return;
       }
       SocialSimplePhotoFragmentViewBinderAbs$p b = this.b.b;
       SocialSimplePhotoFragmentViewBinderAbs v = b.V;
       if (v - (double)0 > 0) {
          if (v - (double)99 > 0) {
             j = b.J;
             if (j != null) {
                str = a1.p(R.string.arg_RES_7f104ce1);
                a.o(str, "CommonUtil.string\(R.stri¡­sh_partly_visiable_toast\)");
                objArray = new Object[]{"99+"};
                str = String.format(str, Arrays.copyOf(objArray, 1));
                a.o(str, "java.lang.String.format\(format, *args\)");
                j.setText(str);
             }
          }else {
             j = b.J;
             if (j != null) {
                str = a1.p(R.string.arg_RES_7f104ce1);
                a.o(str, "CommonUtil.string\(R.stri¡­sh_partly_visiable_toast\)");
                objArray = new Object[]{Integer.valueOf((int)this.b.b.V)};
                str = String.format(str, Arrays.copyOf(objArray, 1));
                a.o(str, "java.lang.String.format\(format, *args\)");
                j.setText(str);
             }
          }
       }else {
          j = b.J;
          if (j != null) {
             j.setText(R.string.arg_RES_7f104cdb);
          }
       }
       return;
    }
}
