package ax8.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ax8.f;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import f66.i;
import jq.a;
import q87.c;
import t45.d;
import brd.z;
import kotlin.jvm.internal.a;
import ax8.c;
import erd.o;
import ax8.b;
import erd.g;
import com.kwai.feature.post.api.feature.producer.help.ProducerHelpConfig;
import ax8.a;
import tkd.b;
import tkd.d;
import d36.e;
import ax8.e$a;
import d36.d;
import android.view.View;
import ekd.m1;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.widget.EmojiEditText;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import xw8.p0;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;

public class e extends PresenterV2	// class@00032f
{
    public View A;
    public ShareBusinessLinkInfo B;
    public String C;
    public final List D;
    public boolean p;
    public FrameLayout q;
    public EmojiEditText r;
    public QPhoto s;
    public VideoContext t;
    public p0 u;
    public c v;
    public boolean w;
    public TextView x;
    public TextView y;
    public KwaiImageView z;

    public void e(f p0,boolean p1){
       t ot1;
       super();
       this.D = new ArrayList();
       this.w = p1;
       if (p0 != null) {
          t ot = PatchProxy.apply(null, p0, f.class, "2");
          if (ot != PatchProxyResult.class) {
          }else {
             Object[] objArray = new Object[0];
             a.b().w("ShareProducerRepo", "getProducerHelpConfig", objArray);
             ot = p0.a.observeOn(d.a);
             a.o(ot, "mProducerInfo.observeOn\(KwaiSchedulers.MAIN\)");
          }
          ot1 = ot.map(new c(this)).doOnNext(b.b);
       }else {
          ot1 = t.just(new ProducerHelpConfig());
       }
       this.U7(d.a(-1457522644).Co(ot1.doOnNext(new a(this)), new e$a(this, p1), p1));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a3907);
       this.r = m1.f(p0, 0x7f0a0ca8);
       this.x = m1.f(this.q, 0x7f0a38d3);
       this.y = m1.f(this.q, 0x7f0a38d4);
       this.A = m1.f(this.q, 0x7f0a38d2);
       this.z = m1.f(this.q, 0x7f0a38d1);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.t = this.t8("SHARE_VIDEO_CONTEXT");
       this.u = this.r8("SHARE_PAGE_PRESENTER_MODEL");
       this.C = this.t8("EDIT_SESSION_ID");
       this.s = this.t8("SHARE_QPHOTO");
       c uoc = this.t8("WORKSPACE");
       this.v = uoc;
       if (this.t == null && uoc == null) {
          PostUtils.D("ShareProducerPresenter", "doInject\(\) ", new IllegalArgumentException("mVideoContext and mDraft both are null!!"));
       }
       return;
    }
}
