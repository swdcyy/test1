package jw8.b;
import jw8.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.yxcorp.gifshow.widget.MagicFaceDownloadProgressBar;
import android.widget.TextView;
import ypc.a;
import jw8.r$a;
import java.lang.Integer;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.StringBuilder;
import nuc.a;
import com.yxcorp.gifshow.v3.editor.text.model.TextConfigParam;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import java.lang.CharSequence;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import ag6.a;
import androidx.lifecycle.ViewModel;

public final class b extends a	// class@0029b9
{

    public void b(){
       super();
    }
    public void bindViews(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       a.p(p0, "rootView");
       this.b = p0.findViewById(0x7f0a1382);
       this.c = p0.findViewById(0x7f0a14cf);
       this.d = p0.findViewById(0x7f0a148d);
       this.e = p0.findViewById(0x7f0a1481);
       this.f = p0.findViewById(0x7f0a1497);
       return;
    }
    public void f(int p0,a p1,r$a p2){
       KwaiImageView kwaiImageVie;
       boolean b;
       TextView textView;
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, b.class, "3")) {
          return;
       }
       a.p(p1, "item");
       if (p1.s()) {
          try{
             kwaiImageVie = this.c();
             if (kwaiImageVie != null) {
                kwaiImageVie.P(p1.n());
             }
          }catch(java.lang.NullPointerException e8){
             StringBuilder str = "load icon failed: ";
             String str1 = p1.b();
             if (str1 == null) {
                str1 = "";
             }
             str = str+str1+", dynamicConfig is null: ";
             b = true;
             boolean b1 = (p1.l() == null)? true: false;
             str = str+b1+", "+"textConfigParam is null: ";
             if (p1.p() != null) {
                b = false;
             }
             PostUtils.D("DefaultTextBubbleViewBinder", str+b, e8);
          }
       }else {
          kwaiImageVie = this.c();
          if (kwaiImageVie != null) {
             kwaiImageVie.setImageResource(p1.o());
          }
       }
    }
    public View getBindedView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, b.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       View view = a.c(p0, R.layout.arg_RES_7f0d0961, p1, false);
       a.o(view, "inflater.inflate\(R.layou¡­bubble, container, false\)");
       return view;
    }
    public void onDestroy(){
    }
    public boolean onInterceptUserEvent(View p0,ViewModel p1,boolean p2){
       return false;
    }
}
