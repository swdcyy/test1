package gqb.g$a;
import android.view.View$OnClickListener;
import gqb.g;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.NetworkUtilsCached;
import e17.i;
import com.kuaishou.android.model.feed.MusicRadioFeed;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.music.radio.MusicRadioLogger;
import java.util.Objects;
import crd.b;
import brd.t;
import com.yxcorp.gifshow.music.utils.f;
import gqb.e;
import gqb.f;
import erd.g;
import gqb.c;
import gqb.d;

public final class g$a implements View$OnClickListener	// class@002b77
{
    public final g b;

    public void g$a(g p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       g og = g.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "1")) {
          return;
       }
       if (!NetworkUtilsCached.k()) {
          i.a(R.style.arg_RES_7f110668, 0x7f1038e5);
          return;
       }else {
          g q = this.b.q;
          if (q != null) {
             MusicRadioFeed mRaveView = q.mRaveView;
             if (mRaveView != null) {
                boolean b = true;
                if (mRaveView.isFavorited()) {
                   boolean b1 = false;
                   MusicRadioLogger.c(b1, mRaveView);
                   g$a tb = this.b;
                   Objects.requireNonNull(tb);
                   if (!PatchProxy.applyVoidOneRefs(mRaveView, tb, og, "7")) {
                      og = tb.r;
                      if (og != null) {
                         og.dispose();
                      }
                      tb.r = f.c(mRaveView, b1, b).subscribe(new e(tb, mRaveView), f.b);
                   }
                }else {
                   MusicRadioLogger.c(b, mRaveView);
                   g$a tb1 = this.b;
                   Objects.requireNonNull(tb1);
                   if (!PatchProxy.applyVoidOneRefs(mRaveView, tb1, og, "6")) {
                      og = tb1.r;
                      if (og != null) {
                         og.dispose();
                      }
                      tb1.r = f.c(mRaveView, b, b).subscribe(new c(tb1, mRaveView), new d(tb1));
                   }
                }
             }
          }
          return;
       }
    }
}
