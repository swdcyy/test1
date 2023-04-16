package cz8.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CollapsedTextData;
import java.lang.CharSequence;
import com.kwai.library.widget.textview.KwaiFoldingTextView;
import android.view.View;
import ekd.m1;
import bz8.n;

public final class a extends PresenterV2	// class@00201b
{
    public PhotoAdvertisement$CollapsedTextData p;
    public KwaiFoldingTextView q;

    public void a(){
       super();
    }
    public void E8(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "4")) {
          uoa = this.q;
          if (uoa == null) {
             a.S("mTvCollapsedText");
          }
          a tp = this.p;
          String str = "mCollapsedTextData";
          if (tp == null) {
             a.S(str);
          }
          PhotoAdvertisement$CollapsedTextData mContent = tp.mContent;
          a tp1 = this.p;
          if (tp1 == null) {
             a.S(str);
          }
          uoa.v(mContent, tp1.mMinLineCount);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       p0 = m1.f(p0, R.id.tv_text);
       a.o(p0, "ViewBindUtils.bindWidget\(rootView, R.id.tv_text\)");
       this.q = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       Object obj = this.q8(n.class);
       a.o(obj, "inject\(HalfLandingItem::class.java\)");
       this.p = obj.a();
       return;
    }
}
