package com.yxcorp.gifshow.visible.a;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.visible.PhotoVisibilityController;
import java.lang.Object;
import com.yxcorp.gifshow.visible.ShareVisibleViewModel$b;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.gifshow.visible.PhotoVisibilityController$b;
import com.kwai.feature.post.api.feature.story.model.PhotoVisibility;
import java.lang.Enum;
import android.widget.TextView;
import android.widget.RadioButton;
import android.content.res.Resources;
import android.content.Context;
import android.graphics.drawable.Drawable;
import zf6.j;
import com.yxcorp.gifshow.visible.PhotoVisibilityController$c;
import com.yxcorp.gifshow.visible.c;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class a implements Observer	// class@0016c3
{
    public final PhotoVisibilityController b;

    public void a(PhotoVisibilityController p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       PhotoVisibilityController photoVisibil = PhotoVisibilityController.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, photoVisibil, "8")) {
       }else {
          int i = p0.equals(tb.g) ^ 1;
          tb.g = p0;
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          int i1 = PhotoVisibilityController$b.a[tb.g.b().ordinal()];
          int i2 = 418;
          int i3 = 0x7f080576;
          if (i1 != 1) {
             if (i1 != 2) {
                int i4 = 0x7f10477f;
                if (i1 != 3) {
                   if (i1 != 4) {
                      if (i1 == 5) {
                         if (p0.a()) {
                            tb.b.setText(R.string.arg_RES_7f101716);
                            i3 = 0x7f081b3a;
                         }else {
                            tb.b.setText(i4);
                            i3 = 0x7f081b59;
                         }
                         uElementPack.action2 = "CLICK_FRIEND_VISIBLE";
                         tb.d.setChecked(1);
                      }
                   }else {
                      tb.b.setText(i4);
                      i3 = 0x7f080568;
                      uElementPack.action2 = "CLICK_FRIEND_VISIBLE";
                      tb.d.setChecked(1);
                   }
                }else {
                   tb.b.setText(i4);
                   i3 = 0x7f080533;
                   uElementPack.action2 = "CLICK_FRIEND_VISIBLE";
                   tb.d.setChecked(1);
                }
             }else {
                tb.b.setText(R.string.arg_RES_7f10508e);
                i3 = 0x7f080520;
                uElementPack.action = i2;
                uElementPack.name = "privacy";
                tb.f.setChecked(1);
             }
          }else {
             tb.b.setText(R.string.arg_RES_7f10508b);
             uElementPack.action = i2;
             uElementPack.name = "public";
             tb.e.setChecked(1);
          }
          PhotoVisibilityController b = tb.b;
          b.setTextColor(b.getResources().getColor(R.color.arg_RES_7f061ea7));
          tb.b.setCompoundDrawablesWithIntrinsicBounds(j.n(tb.j, i3, R.color.arg_RES_7f061ea7), null, null, null);
          b = tb.h;
          if (b != null) {
             b.a();
          }
          if (!PatchProxy.applyVoid(null, tb, photoVisibil, "11")) {
             k1.r(new c(tb), 1000);
          }
          if ("CLICK_FRIEND_VISIBLE".equals(uElementPack.action2) && (!PostExperimentUtils.U0() && (i && p0.c != null))) {
             u1.u(1, uElementPack, null);
          }
       }
    label_010a :
       return;
    }
}
