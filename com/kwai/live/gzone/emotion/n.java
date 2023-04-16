package com.kwai.live.gzone.emotion.n;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.KSTextDisplayHandler;
import com.yxcorp.gifshow.widget.EmojiEditText;
import tyc.a1;
import z47.d;
import jl5.f;
import android.text.Editable;
import com.kwai.library.widget.edittext.SafeEditText;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.EditText;
import com.kwai.live.gzone.emotion.j;
import java.util.List;
import xk5.a;
import java.util.Collection;
import ekd.q;
import yk5.f;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;
import f37.a;
import android.content.SharedPreferences;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import y47.j;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import lnc.a1;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;

public class n extends PresenterV2	// class@000cf2
{
    public boolean p;
    public EmojiEditText q;
    public KwaiImageView r;
    public View s;
    public View t;
    public View u;
    public BaseEditorFragment$Arguments v;
    public a w;

    public void n(){
       super();
    }
    public void E8(){
       n tq;
       n on = n.class;
       if (PatchProxy.applyVoid(null, this, on, "3")) {
          return;
       }
       if (this.q.getKSTextDisplayHandler() instanceof a1) {
          this.q.getKSTextDisplayHandler().t(new d());
          if (!TextUtils.x(this.q.getText())) {
             tq = this.q;
             tq.setText(tq.getText());
          }
       }
       tq = this.w;
       if (tq != null && tq instanceof j) {
          List list = tq.a();
          if (!q.f(list)) {
             list = list.get(0).c();
             if (!PatchProxy.applyVoidOneRefs(list, this, on, "4") && (this.v.mShowKeyBoardFirst != null && !a.a.getBoolean("hasShownGzoneEmotionRedDot", 0))) {
                this.r.P(list);
                this.t.getLayoutParams().width = 0;
                on = this.t;
                on.setLayoutParams(on.getLayoutParams());
                this.s.setVisibility(0);
                this.r.setOnClickListener(new j(this));
             }
          }
       }else {
          this.P8();
       }
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, n.class, "5")) {
          return;
       }
       this.t.getLayoutParams().width = a1.e(35.00f);
       this.s.setVisibility(8);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a0cf2);
       this.u = m1.f(p0, 0x7f0a0ceb);
       this.s = m1.f(p0, 0x7f0a0d03);
       this.t = m1.f(p0, 0x7f0a0cf0);
       this.q = m1.f(p0, 0x7f0a0ca8);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, n.class, "1")) {
          return;
       }
       this.v = this.r8("args");
       this.w = this.t8("EMOTION_INTERACT_CALLBACK");
       return;
    }
}
