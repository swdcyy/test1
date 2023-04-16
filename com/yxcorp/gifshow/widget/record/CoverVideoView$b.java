package com.yxcorp.gifshow.widget.record.CoverVideoView$b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.widget.record.CoverVideoView;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kotlin.jvm.internal.a;
import android.widget.ImageView;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import uzc.b;

public final class CoverVideoView$b implements View$OnClickListener	// class@0019b5
{
    public final CoverVideoView b;

    public void CoverVideoView$b(CoverVideoView p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, CoverVideoView$b.class, "1")) {
          return;
       }
       CoverVideoView$b tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tb, CoverVideoView.class, "10")) {
          boolean b = false;
          tb.g = b;
          CoverVideoView c = tb.c;
          if (c == null) {
             a.S("coverImage");
          }
          c.setVisibility(b);
          c = tb.d;
          if (c == null) {
             a.S("loadingView");
          }
          c.setVisibility(b);
          if (!PatchProxy.applyVoid(objArray, tb, CoverVideoView.class, "11")) {
             CoverVideoView k = tb.k;
             if (k != null && k.b()) {
                View view = k.a(R.id.record_guide_error_container);
                if (view != null) {
                   view.setVisibility(8);
                }
             }
          }
          tb.j();
          tb.g();
       }
       PatchProxy.onMethodExit(CoverVideoView$b.class, "1");
       return;
    }
}
