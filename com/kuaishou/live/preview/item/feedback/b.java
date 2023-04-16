package com.kuaishou.live.preview.item.feedback.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.GestureDetector;
import android.content.Context;
import com.kuaishou.live.preview.item.feedback.b$a;
import android.view.GestureDetector$OnGestureListener;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import sk3.g;
import android.view.View$OnTouchListener;
import io.reactivex.subjects.PublishSubject;
import tyc.q0;

public class b extends PresenterV2	// class@000de3
{
    public PublishSubject p;
    public View q;
    public q0 r;
    public final GestureDetector s;

    public void b(){
       super();
       this.s = new GestureDetector(this.getContext(), new b$a(this));
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.q.setClickable(true);
       this.q.setOnTouchListener(new g(this));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       this.q.setClickable(false);
       this.q.setOnTouchListener(null);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.q = p0.findViewById(0x7f0a108b);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.p = this.r8("LIVE_SIMPLE_NEGATIVE_FEEDBACK_PUBLISHER");
       this.r = this.r8("LIVE_PREVIEW_ENTER_LIVE_CLICK_FILTER");
       return;
    }
}
