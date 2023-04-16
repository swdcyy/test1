package gg2.d;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.quiz.question.e;
import com.kuaishou.live.core.show.quiz.question.c;
import eg2.b;
import java.util.List;
import g9c.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import z8c.e;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import d61.c0;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public class d extends c	// class@002b15
{
    public RecyclerView p;
    public KwaiImageView q;
    public c r;
    public static String sLivePresenterClassName = "LiveQuizQuestionOptionPresenter";

    public void d(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       e uoe = new e(this.r);
       uoe.W0(this.r.g.h);
       this.p.setLayoutManager(new LinearLayoutManager(this.getContext(), 1, false));
       this.p.addItemDecoration(new e(1, a1.e(12.00f), false));
       this.p.setAdapter(uoe);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       this.p.setAdapter(null);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a2449);
       KwaiImageView kwaiImageVie = m1.f(p0, R.id.live_quiz_answer_card_background_view);
       this.q = kwaiImageVie;
       kwaiImageVie.L(c0.a.b("/udata/pkg/kwai-client-image/live_live_answercardbg.webp"));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.r = this.q8(c.class);
       return;
    }
}
