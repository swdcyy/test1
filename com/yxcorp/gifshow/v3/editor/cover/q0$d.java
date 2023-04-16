package com.yxcorp.gifshow.v3.editor.cover.q0$d;
import android.os.Handler;
import com.yxcorp.gifshow.v3.editor.cover.q0;
import android.os.Looper;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.cover.q0$e;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.v3.widget.PictureSelectView;
import java.lang.Boolean;
import java.util.List;
import java.lang.Math;
import java.lang.Integer;
import io.reactivex.subjects.PublishSubject;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class q0$d extends Handler	// class@000ebe
{
    public final q0 a;

    public void q0$d(q0 p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public void handleMessage(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q0$d.class, "1")) {
          return;
       }
       super.handleMessage(p0);
       if (p0.what == 17 && (p0.obj instanceof q0$e && this.a.y.isVisible())) {
          p0 = p0.obj;
          int progress = this.a.w.getProgress();
          q0$d ta = this.a;
          if (ta.Y0 != null && ta.S.booleanValue()) {
             progress = Math.min(progress, (this.a.h1.size() - this.a.X0));
          }
          this.a.R = Integer.valueOf(progress);
          if (this.a.S.booleanValue()) {
             this.a.P.onNext(Integer.valueOf(-10));
          }else {
             ta = this.a;
             ta.P.onNext(ta.R);
          }
          q0$e a = p0.a;
          if (a != null) {
             q0$d ta1 = this.a;
             boolean b = (a.getWidth() > p0.a.getHeight())? true: false;
             ta1.T = Boolean.valueOf(b);
          }
          ta = this.a;
          int[] ointArray = new int[ta.X0];
          String str = ta.R8(ointArray, progress);
          if ((p0.b).equals(str)) {
             q0$d ta2 = this.a;
             ta2.a1 = p0;
             ta2.t.setImageDrawable(new BitmapDrawable(this.a.a1.a));
          }
       }
    label_00b9 :
       return;
    }
}
