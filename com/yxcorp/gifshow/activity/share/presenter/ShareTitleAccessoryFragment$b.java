package com.yxcorp.gifshow.activity.share.presenter.ShareTitleAccessoryFragment$b;
import android.widget.CompoundButton$OnCheckedChangeListener;
import com.yxcorp.gifshow.activity.share.presenter.ShareTitleAccessoryFragment;
import java.lang.Object;
import android.widget.CompoundButton;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import kotlin.jvm.internal.a;
import android.widget.CheckBox;
import zw8.y2;
import android.content.Context;
import androidx.fragment.app.Fragment;
import android.content.res.Resources;
import android.content.res.ColorStateList;
import android.widget.TextView;
import android.graphics.Typeface;
import vw8.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import qrd.l1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class ShareTitleAccessoryFragment$b implements CompoundButton$OnCheckedChangeListener	// class@0013b3
{
    public final ShareTitleAccessoryFragment b;

    public void ShareTitleAccessoryFragment$b(ShareTitleAccessoryFragment p0){
       this.b = p0;
       super();
    }
    public final void onCheckedChanged(CompoundButton p0,boolean p1){
       Context context;
       Resources resources;
       ColorStateList colorStateLi;
       ShareTitleAccessoryFragment u;
       b a;
       if (PatchProxy.isSupport(ShareTitleAccessoryFragment$b.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, ShareTitleAccessoryFragment$b.class, "1")) {
          return;
       }
       ShareTitleAccessoryFragment$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, ShareTitleAccessoryFragment.class, "15")) {
          ShareTitleAccessoryFragment x = tb.x;
          String str = "mIfAddTitleCheckbtn";
          if (x != null) {
             ShareTitleAccessoryFragment t = tb.t;
             if (t == null) {
                a.S(str);
             }
             x.a(t.isChecked());
          }
          x = tb.t;
          if (x == null) {
             a.S(str);
          }
          str = "mAddTitleText";
          if (x.isChecked()) {
             x = tb.u;
             if (x == null) {
                a.S(str);
             }
             context = tb.getContext();
             if (context != null) {
                resources = context.getResources();
                if (resources != null) {
                   colorStateLi = resources.getColorStateList(R.color.arg_RES_7f061641);
                label_0068 :
                   x.setTextColor(colorStateLi);
                   u = tb.u;
                   if (u == null) {
                      a.S(str);
                   }
                   u.setTypeface(Typeface.DEFAULT_BOLD);
                }
             }
             colorStateLi = null;
             goto label_0068 ;
          }else {
             x = tb.u;
             if (x == null) {
                a.S(str);
             }
             context = tb.getContext();
             if (context != null) {
                resources = context.getResources();
                if (resources != null) {
                   colorStateLi = resources.getColorStateList(R.color.arg_RES_7f06168c);
                label_0094 :
                   x.setTextColor(colorStateLi);
                   u = tb.u;
                   if (u == null) {
                      a.S(str);
                   }
                   u.setTypeface(Typeface.DEFAULT);
                }
             }
             Object[] objArray = null;
             goto label_0094 ;
          }
          a = b.a;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoid(null, a, b.class, "3")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "ADD_CAPTION_TITLE_BUTTON";
             u1.u(1, uElementPack, null);
          }
       }
       return;
    }
}
