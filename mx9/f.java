package mx9.f;
import java.lang.Object;
import java.util.ArrayList;
import mx9.e;
import mx9.a;
import mx9.f$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import al9.a;
import qvb.i;
import wca.n;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import cda.b;
import dda.g;
import com.kwai.framework.model.feed.BaseFeed;
import m66.a;
import z8a.c;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;
import mhc.o2;
import ohc.k;

public class f	// class@003093
{
    public final List a;
    public boolean b;
    public QPhoto c;
    public a d;
    public a e;
    public SlidePlayViewModel f;
    public BaseFragment g;
    public QComment h;
    public boolean i;
    public final Runnable j;
    public final IMediaPlayer$OnInfoListener k;
    public final a l;

    public void f(){
       super();
       this.a = new ArrayList();
       this.j = new e(this);
       this.k = new a(this);
       this.l = new f$a(this);
    }
    public static boolean a(){
       Object obj = PatchProxy.apply(null, null, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableCancelPreloadCommentList", false);
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, f.class, "9")) {
          return;
       }
       f td = this.d;
       if (td == null || (td.T0() == 2 || (this.d.L0() == null && !this.d.g()))) {
          if (this.h == null) {
             this.d.a();
          }else {
             this.d.j0();
          }
       }
       return;
    }
    public void onFollowUpdateEvent(n p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "5")) {
          return;
       }
       f tc = this.c;
       if (tc != null && (TextUtils.n(tc.getUserId(), p0.b) && p0.c != null)) {
          this.b();
       }
    label_0022 :
       return;
    }
    public void onMainThread(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "8")) {
          return;
       }
       f tc = this.c;
       if (tc != null && (p0.a == 1 && tc.equals(p0.b))) {
          this.b();
       }
    label_001f :
       return;
    }
    public void onMainThread(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "7")) {
          return;
       }
       f tc = this.c;
       if (tc != null && (tc.getEntity() != null && (this.c.getEntity().equals(p0.a) && this.c.isLiked()))) {
          this.b();
       }
    label_002e :
       return;
    }
    public void onShareEvent(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "6")) {
          return;
       }
       if (this.c != null && (p0.a() == 1002 && (o2.k(p0.c().mActionUrl) && (!("MORE").equals(p0.c().mId) && this.c.equals(p0.b().K()))))) {
          this.b();
       }
    label_0044 :
       return;
    }
}
