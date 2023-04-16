package com.yxcorp.gifshow.activity.share.player.b;
import com.yxcorp.gifshow.activity.share.player.PreviewPlayer;
import android.app.Activity;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import android.view.View;
import android.net.Uri;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.List;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.editorsdk2.PreviewPlayer;
import yw8.d;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import yw8.c;
import erd.o;
import gq.a;
import q87.c;

public class b extends PreviewPlayer	// class@00139c
{

    public void b(Activity p0,VideoSDKPlayerView p1){
       super(p0, p1);
    }
    public void a(Uri p0,int p1,int p2){
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.b.onPause();
       this.b.pause();
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       this.b.onResume();
       return;
    }
    public void e(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "5")) {
          return;
       }
       if (p0) {
          this.b.pause();
          this.b.seekToPlaybackStart();
       }else {
          this.b.release();
       }
       return;
    }
    public t f(List p0,List p1){
       PreviewPlayer obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && p0.size()) {
          obj = this.b;
          if (obj != null && obj.getPlayer() != null) {
             return t.fromCallable(new d(this, p0, p1)).subscribeOn(d.c).observeOn(d.a).map(new c(this));
          }
       }
       Object[] objArray = new Object[0];
       a.D().A("VideoPreviewPlayer", "", objArray);
       return t.just(Boolean.FALSE);
    }
    public boolean h(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.b.play();
       return true;
    }
    public boolean i(){
       boolean b;
       PreviewPlayer obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       b = (obj != null && (obj.getPlayer() != null && this.b.getPlayer().mProject != null))? true: false;
       return b;
    }
}
