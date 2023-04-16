package com.yxcorp.gifshow.activity.share.presenter.l2;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.activity.share.presenter.m2;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.activity.share.presenter.c0;
import com.yxcorp.gifshow.activity.share.player.PreviewPlayer;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import android.graphics.Bitmap;
import android.os.SystemClock;
import zw8.b5;
import java.util.concurrent.Callable;

public class l2 extends m	// class@0013fd
{
    public final m2 c;

    public void l2(m2 p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l2.class, "1")) {
          return;
       }
       l2 tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, m2.class, "5")) {
          c0 q = tc.q;
          if (q != null && q.b() instanceof VideoSDKPlayerView) {
             VideoSDKPlayerView videoSDKPlay = tc.q.b();
             if (videoSDKPlay.isSharingPlayer()) {
                videoSDKPlay.restorePlayer();
             }
             tc.h9(true);
          }
          if (tc.G == null) {
             if (tc.Z.getDrawable() != null) {
                q = tc.q;
                if (q != null && q.i()) {
                }
             }
          }else if(DraftUtils.W(tc.G, tc.y)){
             tc.l9(tc.Z, null);
          }else {
             tc.r = SystemClock.elapsedRealtime();
             tc.e9(tc.Z, null, new b5(tc));
          }
       }
    label_0074 :
       return;
    }
}
