package com.kuaishou.live.core.show.vote.presenter.i;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import lnc.a1;
import em2.d;
import java.lang.Integer;
import em2.b;
import android.view.View$OnClickListener;
import android.view.ViewTreeObserver;
import em2.c;
import java.lang.Runnable;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.View;
import ekd.m1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class i extends c	// class@001248
{
    public String p;
    public TextView q;
    public static String sLivePresenterClassName = "LiveVoteItemTitlePresenter";

    public void i(){
       super();
    }
    public void E8(){
       int i;
       b uob;
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, oi, "4")) {
          if (TextUtils.x(this.p)) {
             this.q.setText("");
             this.q.setVisibility(8);
          }else {
             i = 0;
             this.q.setVisibility(i);
             oi = this.q;
             i tp = this.p;
             int i1 = a1.a(R.color.arg_RES_7f061d77);
             d uod = d.class;
             if (PatchProxy.isSupport(uod)) {
                Object[] objArray1 = new Object[]{oi,tp,Integer.valueOf(2),Integer.valueOf(i1),"",objArray};
                if (!PatchProxy.applyVoid(objArray1, objArray, uod, "1")) {
                }
             }else {
             }
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a1a57);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_VOTE_QUESTION");
       return;
    }
}
