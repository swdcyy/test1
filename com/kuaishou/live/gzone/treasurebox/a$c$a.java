package com.kuaishou.live.gzone.treasurebox.a$c$a;
import erd.g;
import com.kuaishou.live.gzone.treasurebox.a$c;
import java.lang.Object;
import com.kuaishou.live.gzone.treasurebox.bean.LiveTreasureBoxModel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.gzone.treasurebox.bean.LiveTreasureBoxModel$BoxStatus;
import com.kuaishou.live.gzone.treasurebox.a$a;
import java.lang.Enum;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import pm8.a;
import android.content.SharedPreferences;
import r53.a;
import com.kuaishou.live.gzone.treasurebox.b;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import j77.e;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Long;
import e17.i;
import e17.s;

public class a$c$a implements g	// class@001c55
{
    public final a$c b;

    public void a$c$a(a$c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       a$c$a tb;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c$a.class, "1")) {
       }else {
          LiveTreasureBoxModel$BoxStatus boxStatus = p0.getBoxStatus();
          a$c w = this.b.w;
          if (w == null || boxStatus != w) {
             w = 8;
             b uob = 1;
             if (a$a.a[boxStatus.ordinal()] != uob) {
                if (!TextUtils.x(this.b.q.mBeforeOpenTip)) {
                   this.b.s.setVisibility(0);
                   tb = this.b;
                   tb.s.setText(tb.q.mBeforeOpenTip);
                }else {
                   this.b.s.setVisibility(w);
                }
             }else if(p0.isSignInBox()){
                tb = this.b;
                Objects.requireNonNull(tb);
                a obj = PatchProxy.apply(null, tb, a$c.class, "6");
                String str = "isFirstOpenSignInBox";
                boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): a.a.getBoolean(str, uob);
                if (b) {
                   obj = this.b.v.v;
                   if (obj != null) {
                      obj.a(new b(this));
                      SharedPreferences$Editor uEditor = a.a.edit();
                      uEditor.putBoolean(str, 0);
                      g.a(uEditor);
                   }
                }
                tb = this.b;
                if (tb.w == LiveTreasureBoxModel$BoxStatus.OPENING) {
                   Object[] objArray = new Object[uob];
                   objArray[0] = Long.valueOf(this.b.q.mKShell);
                   s.n(String.format(tb.n8(R.string.arg_RES_7f102474), objArray), 0);
                }
             }
             if (!TextUtils.x(this.b.q.mAfterOpenTip)) {
                this.b.s.setVisibility(0);
                tb = this.b;
                tb.s.setText(tb.q.mAfterOpenTip);
             }else {
                this.b.s.setVisibility(w);
             }
             this.b.w = p0.getBoxStatus();
          }
       }
       return;
    }
}
