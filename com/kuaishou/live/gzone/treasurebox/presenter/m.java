package com.kuaishou.live.gzone.treasurebox.presenter.m;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.gzone.treasurebox.bean.LiveGzoneTreasureTask;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.CharSequence;
import android.widget.TextView;
import android.text.TextUtils;
import lnc.a1;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import java.lang.StringBuilder;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import p53.r0;
import erd.g;
import crd.b;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import p53.p0;
import android.view.View$OnClickListener;
import p53.q0;
import r53.a;
import m53.d;

public class m extends PresenterV2	// class@001c8d
{
    public KwaiImageView p;
    public TextView q;
    public TextView r;
    public TextView s;
    public TextView t;
    public LiveGzoneTreasureTask u;
    public a v;
    public d w;
    public static String sLivePresenterClassName = "LiveGzoneTreasureBoxTaskCardPopupPresenter";

    public void m(){
       super();
    }
    public void E8(){
       String str1;
       if (PatchProxy.applyVoid(null, this, m.class, "3")) {
          return;
       }
       this.p.U(this.u.mTaskIcon);
       this.q.setText(this.u.mTaskCardNameDescription);
       this.r.setText(this.u.mTaskTitle);
       int i = 3;
       String str = " ";
       if (!TextUtils.isEmpty(this.u.mTaskPrizeTitle)) {
          m tu = this.u;
          int i1 = 0x7f0604b8;
          if (tu.mTaskStatus == i) {
             this.s.setText(tu.mTaskPrizeTitle);
             this.s.setTextColor(a1.a(i1));
             this.s.setTypeface(Typeface.DEFAULT_BOLD);
             this.r.setVisibility(8);
          }else {
             SpannableStringBuilder spannableStr = new SpannableStringBuilder();
             spannableStr.append(a1.p(R.string.arg_RES_7f102481));
             spannableStr.append(str);
             spannableStr.append(this.u.mTaskPrizeTitle);
             spannableStr.setSpan(new ForegroundColorSpan(a1.a(i1)), (spannableStr.length() - 1), spannableStr.length(), 33);
             this.s.setText(spannableStr);
          }
       }
       if (this.u.mTaskStatus == i) {
          str1 = a1.p(0x7f100535)+str;
          this.q.setText(R.string.arg_RES_7f100538);
       }else {
          str1 = a1.p(0x7f100536)+str;
          this.q.setText(this.u.mTaskCardNameDescription);
       }
       this.t.setText(str1+5+"s");
       this.X7(t.intervalRange(0, 5, 1, 1, TimeUnit.SECONDS).observeOn(d.a).subscribe(new r0(this, str1)));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "1")) {
          return;
       }
       this.q = p0.findViewById(0x7f0a1fb8);
       this.p = p0.findViewById(0x7f0a1fb5);
       this.r = p0.findViewById(0x7f0a1fb7);
       this.s = p0.findViewById(0x7f0a1fb6);
       TextView textView = p0.findViewById(R.id.live_gzone_treasure_box_task_tip_action_view);
       this.t = textView;
       textView.setOnClickListener(new p0(this));
       p0.findViewById(R.id.live_gzone_treasure_box_task_tip_close_view).setOnClickListener(new q0(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m.class, "2")) {
          return;
       }
       this.v = this.q8(a.class);
       this.u = this.q8(LiveGzoneTreasureTask.class);
       this.w = this.q8(d.class);
       return;
    }
}
