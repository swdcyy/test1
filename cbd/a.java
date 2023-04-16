package cbd.a;
import android.view.View$OnTouchListener;
import com.yxcorp.plugin.search.kbox.weak.SearchWeakMusicView;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.util.Objects;
import android.widget.ImageView;
import android.content.Context;
import ekd.p0;
import e17.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.search.SearchPage;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import nfd.n2;
import kob.r;
import com.yxcorp.gifshow.util.rx.RxBus;
import sbd.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.plugin.search.entity.SearchItem;
import im8.f;
import java.lang.Integer;
import rcd.c;
import v99.a;

public final class a implements View$OnTouchListener	// class@000516
{
    public final SearchWeakMusicView b;

    public void a(SearchWeakMusicView p0){
       this.b = p0;
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       SearchWeakMusicView m;
       a tb = this.b;
       Objects.requireNonNull(tb);
       int action = p1.getAction();
       if (action) {
          boolean b = false;
          if (action != 1) {
             tb.C.setPressed(b);
          }else {
             tb.C.setPressed(b);
             if (!p0.C(tb.S)) {
                i.a(R.style.arg_RES_7f110668, 0x7f1038e5);
             }else {
                Object[] objArray = null;
                if (!PatchProxy.applyVoid(objArray, tb, SearchWeakMusicView.class, "4")) {
                   if (n2.g(tb.R.kc())) {
                      if (!PatchProxy.applyVoid(objArray, tb, SearchWeakMusicView.class, "5")) {
                         m = tb.M;
                         if (m == null || !m.isPlaying()) {
                            b = true;
                         }
                         tb.M(b);
                         d uod = new d();
                         uod.a(tb.R);
                         uod.b(tb.I);
                         uod.d(tb.J.mIsRecoItem);
                         RxBus.f.b(uod);
                      }
                   }else if(PatchProxy.applyVoid(objArray, tb, SearchWeakMusicView.class, "6")){
                      m = tb.L;
                      if (m != null) {
                         if (m.d(tb.N.get().intValue(), tb.I)) {
                            tb.Q = true;
                            tb.L.l(tb.N.get().intValue(), tb.I);
                            tb.O.r("page_resume");
                            tb.M(b);
                         }else {
                            tb.L.k(tb.N.get().intValue(), tb.I);
                            tb.O.j("page_resume");
                            tb.M(true);
                         }
                      }
                   }
                }
             }
          }
       }else {
          tb.C.setPressed(true);
       }
       return true;
    }
}
