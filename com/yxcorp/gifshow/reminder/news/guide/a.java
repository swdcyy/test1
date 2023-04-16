package com.yxcorp.gifshow.reminder.news.guide.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import qa9.s;
import android.view.View;
import ekd.m1;
import afc.a;
import android.view.View$OnClickListener;
import afc.b;
import afc.c;
import com.yxcorp.gifshow.reminder.news.guide.NewsSlidePlayGuideFragment;

public class a extends PresenterV2	// class@001af7
{
    public TextView p;
    public NewsSlidePlayGuideFragment q;

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
          int newsPrivate = QCurrentUser.ME.getNewsPrivate();
          if (newsPrivate != 1) {
             if (newsPrivate != 2) {
                if (newsPrivate != 3) {
                   this.p.setText(R.string.arg_RES_7f103923);
                }else {
                   this.p.setText(R.string.arg_RES_7f103926);
                }
             }else {
                this.p.setText(R.string.arg_RES_7f103925);
             }
          }else {
             this.p.setText(R.string.arg_RES_7f103928);
          }
       }
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       s.b(this.q);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a322b);
       m1.a(p0, new a(this), R.id.guide_close);
       m1.a(p0, new b(this), R.id.guide_known_button);
       m1.a(p0, new c(this), R.id.privacy_sub_title);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.q = this.q8(NewsSlidePlayGuideFragment.class);
       return;
    }
}
