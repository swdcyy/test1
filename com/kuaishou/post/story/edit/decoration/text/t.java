package com.kuaishou.post.story.edit.decoration.text.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rp4.a;
import q87.c;
import android.widget.LinearLayout;
import dq4.g;
import android.view.View$OnClickListener;
import vp4.b;
import android.widget.ImageView;
import tp4.v;
import oa0.a;
import android.content.SharedPreferences;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import o56.c;
import o56.a;
import xf6.g;
import com.kwai.framework.abtest.f;
import java.lang.StringBuilder;
import rp4.b;
import java.lang.Boolean;
import lnc.i3;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import k2b.u1;
import com.yxcorp.gifshow.bubble.b;
import com.kuaishou.post.story.bubble.StoryBubbleItem;
import ra9.c;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import android.view.View;
import dq4.h;
import com.yxcorp.gifshow.bubble.b$b;
import com.yxcorp.gifshow.bubble.a;
import a2.i0;
import android.view.ViewTreeObserver;
import com.kuaishou.post.story.edit.decoration.text.t$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;

public class t extends PresenterV2	// class@000b19
{
    public KwaiImageView p;
    public LinearLayout q;
    public Fragment r;
    public b s;
    public int[] t;
    public int[] u;

    public void t(){
       super();
       int[] ointArray = new int[2];
       this.t = ointArray;
       int[] ointArray1 = new int[2];
       this.u = ointArray1;
    }
    public void E8(){
       boolean b1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, t.class, "3")) {
          return;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       String str = "StoryTextAIVideoSwitchPresenter";
       a.D().w(str, "bind", objArray1);
       this.q.setVisibility(i);
       this.q.setOnClickListener(new g(this));
       t ts = this.s;
       boolean b = true;
       a uoa = (ts.c == null || (ts.d != null || (ts.e != null && ts.f == null)))? 1: null;
       if (uoa) {
          objArray1 = new Object[i];
          a.D().w(str, "needCloseSwitchPassively", objArray1);
          this.s.e = b;
          this.p.setSelected(i);
          v.b.h(i);
          this.R8();
       }else if(a.a.getBoolean("mood_has_set_ai_video_switch_manually", i)){
          this.p.setSelected(a.d0());
          v.b.h(this.p.isSelected());
       }else {
          String str4 = "Checked_by_default";
          if (a.a().c()) {
             if (!g.s0()) {
                b1 = f.a(str4);
             }else if(g.s0() != b){
                b = null;
             }
             b1 = b;
          }else {
             b1 = f.a(str4);
          }
          Object[] objArray2 = new Object[i];
          a.D().w(str, "notHaveSetAiVideoSwitchManually¡¢ notHaveSelectTemplateManually, select by ab: "+b1, objArray2);
          a.q1(b1);
          v.b.h(b1);
          this.p.setSelected(b1);
          this.R8();
       }
       this.s.c = i;
       b1 = this.p.isSelected();
       b uob = b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b1), objArray, uob, "12")) {
          i3 oi3 = i3.f();
          String str1 = (b1)? "check": "uncheck";
          oi3.d("button_status", str1);
          str1 = oi3.toString();
          String str2 = "AI_VIDEO_BUTTON";
          String str3 = "";
          if (!PatchProxy.applyVoidFourRefs(str2, str3, "PRODUCE_MOOD_PHOTO", str1, null, b.class, "6")) {
             ClientEvent$UrlPackage urlPackage = b.b("PRODUCE_MOOD_PHOTO", "");
             ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
             showEvent.elementPackage = b.a(str2, str3, str1);
             showEvent.urlPackage = urlPackage;
             u1.z0(urlPackage, showEvent);
          }
       }
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, t.class, "6")) {
          return;
       }
       if (this.r != null) {
          b uob = (this.p.isSelected())? new b(StoryBubbleItem.MOOD_AI_VIDEO_BACKGROUND_SWITCH_OPEN): new b(StoryBubbleItem.MOOD_AI_VIDEO_BACKGROUND_SWITCH_CLOSE);
          uob = uob.b(this.q);
          uob.k(new h(this));
          PostBubbleManager.d(this.r).n(uob);
       }
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, t.class, "5")) {
          return;
       }
       if (i0.Y(this.q)) {
          this.q.getLocationOnScreen(this.t);
          this.q.getLocationInWindow(this.u);
          this.P8();
       }else {
          this.q.getViewTreeObserver().addOnGlobalLayoutListener(new t$a(this));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a2bec);
       this.q = m1.f(p0, 0x7f0a2bea);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, t.class, "1")) {
          return;
       }
       this.r = this.r8("FRAGMENT");
       this.s = this.r8("AI_VIDEO_PAGE_PRESENTER_MODEL");
       return;
    }
}
