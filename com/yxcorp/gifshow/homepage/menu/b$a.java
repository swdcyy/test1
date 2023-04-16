package com.yxcorp.gifshow.homepage.menu.b$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.homepage.menu.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.CharSequence;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.yxcorp.gifshow.homepage.menu.g;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.yxcorp.gifshow.homepage.menu.a;
import tkd.b;
import tkd.d;
import vt5.c;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import tra.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;
import java.lang.Integer;
import dub.z;

public class b$a extends m	// class@001770
{
    public final b c;

    public void b$a(b p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       boolean b;
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       b$a tc = this.c;
       Objects.requireNonNull(tc);
       String str = this.c.r.getText().toString();
       b = (!this.c.q.getVisibility())? true: false;
       Objects.requireNonNull(tc);
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidThreeRefs("", str, Boolean.valueOf(b), tc, b.class, "13")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "MENU_BUTTON";
          uElementPack.params = tc.t.d("", str, b, 0, "home").e();
          u1.u(true, uElementPack, new ClientContent$ContentPackage());
       }
       tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, uob, "9") && tc.q != null) {
          tc.s.a();
          d.a(0x2e5315fc).mb(tc.getActivity());
          tc.q.setVisibility(8);
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putBoolean(b.d("user")+"click_close_floatView", true);
          g.a(uEditor);
          Integer[] integerArray = new Integer[true];
          integerArray[0] = Integer.valueOf(-6);
          z.a("HomeMenuClosePendantSettingPresenter", integerArray);
       }
       return;
    }
}
