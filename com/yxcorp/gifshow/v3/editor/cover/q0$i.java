package com.yxcorp.gifshow.v3.editor.cover.q0$i;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.editor.cover.q0;
import java.lang.Object;
import faa.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.collection.LruCache;
import android.graphics.Bitmap;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.util.Pair;
import java.util.List;
import ppc.x0;
import com.yxcorp.gifshow.v3.editor.cover.q0$e;
import com.yxcorp.gifshow.v3.editor.cover.q0$a;
import android.graphics.Bitmap$Config;
import android.os.Message;
import android.os.Handler;
import com.smile.gifmaker.mvps.utils.observable.ObservableSet;

public final class q0$i implements Runnable	// class@000ec3
{
    public final String b;
    public final int[] c;
    public final int d;
    public final int e;
    public final q0 f;

    public void q0$i(q0 p0,int p1,int p2){
       this.f = p0;
       super();
       Object[] objArray = new Object[0];
       a.D().w("PhotosCoverEditorPresenter", "FetchCoverBitmapTask startPos:"+p1+",size:"+p2, objArray);
       this.d = p1;
       this.e = p2;
       int[] ointArray = new int[p2];
       this.c = ointArray;
       this.b = p0.R8(ointArray, p1);
    }
    public void run(){
       Pair[] pairArray;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, q0$i.class, "1")) {
          return;
       }
       Bitmap uBitmap = this.f.r.get(this.b);
       int i = 0;
       if (uBitmap == null) {
          q0$i tf = this.f;
          q0$i td = this.d;
          q0$i te = this.e;
          q0 oq0 = q0.class;
          _monitor_enter(tf);
          if (PatchProxy.isSupport(oq0)) {
             pairArray = PatchProxy.applyTwoRefs(Integer.valueOf(td), Integer.valueOf(te), tf, oq0, "24");
             if (pairArray != PatchProxyResult.class) {
                _monitor_exit(tf);
             }else if((td + te) > tf.h1.size() || te <= null){
                _monitor_exit(tf);
                pairArray = objArray;
             }else {
                pairArray = new Pair[te];
                for (int i1 = 0; i1 < te; i1 = i1 + 1) {
                   int i2 = i1 + td;
                   pairArray[i1] = tf.h1.get(i2);
                }
                _monitor_exit(tf);
             }
          }else {
             goto label_0040 ;
          }
          if (pairArray != null) {
             uBitmap = this.f.e1.a(pairArray);
          }
       }
       if (uBitmap != null) {
          this.f.r.put(this.b, uBitmap);
          if (this.f.Z0 == null || (this.f.Z0).equals(this.b)) {
             q0$e uoe = new q0$e(objArray);
             uoe.a = uBitmap.copy(uBitmap.getConfig(), true);
             uoe.b = this.b;
             Message message = this.f.l1.obtainMessage();
             message.what = 17;
             message.obj = uoe;
             message.sendToTarget();
          }
       }
       this.f.p.remove(this.b);
       Object[] objArray1 = new Object[i];
       a.D().w("PhotosCoverEditorPresenter", "FetchCoverBitmapTask run", objArray1);
       return;
    }
}
