package com.kuaishou.live.playback.play.quit.LivePlaybackQuitPresenter;
import im8.g;
import qw1.c;
import com.kuaishou.live.playback.play.quit.LivePlaybackQuitPresenter$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import ti3.c;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import ti3.b;
import com.kuaishou.live.playback.play.quit.LivePlaybackQuitPresenter$Order;
import tq5.a;
import tq5.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Enum;
import android.view.View;
import android.widget.ImageView;
import ti3.a;
import android.view.View$OnClickListener;
import ti3.f;
import java.util.Map;
import java.util.HashMap;
import mrd.c;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Boolean;

public class LivePlaybackQuitPresenter extends c implements g	// class@000d39
{
    public c s;
    public BaseFeed t;
    public ImageView u;
    public c v;

    public void LivePlaybackQuitPresenter(){
       super();
       this.v = new LivePlaybackQuitPresenter$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, LivePlaybackQuitPresenter.class, "3")) {
          return;
       }
       if (this.getActivity() instanceof GifshowActivity) {
          this.getActivity().F2(this.r);
       }
       this.X7(this.s.subscribe(new c(this), Functions.e));
       this.v.Ci(new b(this), LivePlaybackQuitPresenter$Order.FINISH);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, LivePlaybackQuitPresenter.class, "4")) {
          return;
       }
       super.J8();
       if (this.getActivity() instanceof GifshowActivity) {
          this.getActivity().l3(this.r);
       }
       return;
    }
    public int P8(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LivePlaybackQuitPresenter.class, "7");
       int i = (obj != PatchProxyResult.class)? obj.intValue(): p0.compareTo(p1);
       return i;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlaybackQuitPresenter.class, "1")) {
          return;
       }
       ImageView imageView = this.getActivity().findViewById(R.id.live_playback_close);
       this.u = imageView;
       imageView.setOnClickListener(new a(this));
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LivePlaybackQuitPresenter.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new f();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LivePlaybackQuitPresenter.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LivePlaybackQuitPresenter.class, new f());
       }else {
          obj.put(LivePlaybackQuitPresenter.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LivePlaybackQuitPresenter.class, "2")) {
          return;
       }
       this.s = this.r8("PLAYBACK_ORIENTATION_CHANGED_SUBJECT");
       this.t = this.r8("feed");
       return;
    }
    public boolean onBackPressed(){
       Object obj = PatchProxy.apply(null, this, LivePlaybackQuitPresenter.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.v.onBackPressed();
    }
}
