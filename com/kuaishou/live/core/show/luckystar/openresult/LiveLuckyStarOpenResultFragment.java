package com.kuaishou.live.core.show.luckystar.openresult.LiveLuckyStarOpenResultFragment;
import ml8.d;
import com.kuaishou.live.core.show.luckystar.widget.LiveLuckyStarBaseDialogFragment;
import yb2.i;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import ekd.m1;
import android.widget.ImageView;
import java.lang.Number;
import p91.m;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.KwaiDialogFragment;
import android.os.Bundle;
import ec2.g;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.luckystar.openresult.f;
import tkd.b;
import tkd.d;
import h02.b;
import com.kuaishou.live.core.show.luckystar.openresult.b;
import androidx.fragment.app.Fragment;

public class LiveLuckyStarOpenResultFragment extends LiveLuckyStarBaseDialogFragment implements d	// class@000ce1
{
    public i s;
    public String t;
    public int u;
    public PresenterV2 v;
    public ImageView w;
    public static final int x;

    public void LiveLuckyStarOpenResultFragment(){
       super();
    }
    public static LiveLuckyStarOpenResultFragment vh(i p0,int p1){
       LiveLuckyStarOpenResultFragment obj;
       if (PatchProxy.isSupport(LiveLuckyStarOpenResultFragment.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, LiveLuckyStarOpenResultFragment.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new LiveLuckyStarOpenResultFragment();
       obj.s = p0;
       obj.u = p1;
       obj.t = p0.c;
       return obj;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLuckyStarOpenResultFragment.class, "2")) {
          return;
       }
       this.w = m1.f(p0, 0x7f0a212f);
       return;
    }
    public int getLayoutResId(){
       Object obj = PatchProxy.apply(null, this, LiveLuckyStarOpenResultFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.u == 1) {
          return 0x7f0d0c83;
       }
       if (this.s.a.e()) {
          return 0x7f0d0c79;
       }
       return 0x7f0d0c7a;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, LiveLuckyStarOpenResultFragment.class, "8")) {
          return;
       }
       super.onDestroy();
       LiveLuckyStarOpenResultFragment tv = this.v;
       if (tv != null) {
          tv.destroy();
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveLuckyStarOpenResultFragment.class, "7")) {
          return;
       }
       super.onDestroyView();
       this.v.unbind();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLuckyStarOpenResultFragment.class, "5")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.doBindView(p0);
       this.w.setOnClickListener(new g(this));
       if (!PatchProxy.applyVoid(null, this, LiveLuckyStarOpenResultFragment.class, "6")) {
          PresenterV2 presenterV2 = new PresenterV2();
          this.v = presenterV2;
          int i = 1;
          if (this.u == i) {
             presenterV2.U7(new f());
          }else if(this.s.a.e()){
             this.v.U7(d.a(-204054297).cK(this.t, this.s.p));
          }else {
             this.v.U7(new b(this.t, this.s.p));
          }
          this.v.f(this.getView());
          Object[] objArray = new Object[i];
          objArray[0] = this.s;
          this.v.i(objArray);
       }
       return;
    }
    public View th(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLuckyStarOpenResultFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.findViewById(0x7f0a2130);
    }
    public boolean uh(){
       boolean b = true;
       if (this.u == b) {
       }else {
          b = false;
       }
       return b;
    }
}
