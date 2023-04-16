package com.kuaishou.live.gzone.treasurebox.presenter.c;
import f37.b0;
import p53.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.kshell.bean.LiveGzoneKShellRankResponse;
import com.kwai.live.gzone.kshell.bean.LiveGzoneKShellRankResponse$BottomInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.View;
import p53.d;
import android.view.View$OnClickListener;
import android.widget.TextView;
import r53.a;
import com.kuaishou.live.gzone.treasurebox.LiveGzoneKShellRankPopup;

public class c extends b0	// class@001c7c
{
    public TextView q;
    public TextView r;
    public View s;
    public a t;
    public LiveGzoneKShellRankResponse u;
    public LiveGzoneKShellRankPopup v;
    public static String sLivePresenterClassName = "LiveGzoneKShellRankPopupPresenter";

    public void c(){
       super();
       this.U7(new g());
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       LiveGzoneKShellRankResponse mBottomInfo = this.u.mBottomInfo;
       if (mBottomInfo != null) {
          if (!TextUtils.x(mBottomInfo.mRulesLink)) {
             this.s.setVisibility(0);
             this.s.setOnClickListener(new d(this));
          }
          this.q.setText(this.u.mBottomInfo.mAwards);
          this.r.setText(this.u.mBottomInfo.mScoresType);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       this.q = p0.findViewById(0x7f0a1f41);
       this.r = p0.findViewById(0x7f0a1f42);
       this.s = p0.findViewById(0x7f0a1f40);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       this.t = this.q8(a.class);
       this.u = this.q8(LiveGzoneKShellRankResponse.class);
       this.v = this.q8(LiveGzoneKShellRankPopup.class);
       return;
    }
}
