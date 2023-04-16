package com.kuaishou.recruit.live.explain.anchor.b;
import mt4.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.Context;
import com.yxcorp.utility.n;
import d61.b0;
import gs4.a;
import android.view.ViewGroup;
import com.kuaishou.livestream.message.nano.LivePlusRecruitMessages$LiveRecruitPanelDisplay;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import mt4.c;
import ekd.j;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.kuaishou.recruit.live.explain.anchor.LiveAnchorRecruitExplainPendantView;
import it4.d;
import android.view.View$OnClickListener;
import it4.e;
import com.kuaishou.livestream.message.nano.LivePlusRecruitMessages$LiveRecruitPanelButton;
import java.lang.Integer;
import it4.c;

public class b implements b	// class@000eb6
{
    public d a;
    public a b;
    public PublishSubject c;
    public ClientContent$LiveStreamPackage d;
    public String e;
    public String f;
    public LiveAnchorRecruitExplainPendantView g;
    public ViewGroup h;

    public void b(){
       super();
    }
    public void a(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "3")) {
          return;
       }
       if (p0) {
          if (!PatchProxy.applyVoid(null, this, uob, "6") && this.h != null) {
             b tg = this.g;
             if (tg != null) {
                ViewGroup$MarginLayoutParams layoutParams = tg.getLayoutParams();
                int i = n.z(this.g.getContext()) / 2;
                layoutParams.width = i;
                layoutParams.height = b0.a(i);
                layoutParams.topMargin = b0.b(this.b.j4());
                layoutParams.leftMargin = 0;
                this.h.setTranslationX((float)layoutParams.width);
                this.h.setTranslationY(0);
                this.g.setLayoutParams(layoutParams);
                this.h.requestLayout();
                this.g.setVisibility(0);
             }
          }
       }else {
          this.c();
       }
       return;
    }
    public void b(LivePlusRecruitMessages$LiveRecruitPanelDisplay p0,boolean p1){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, b.class, "4")) {
          return;
       }
       if (!TextUtils.n(this.e, p0.templateId) || !TextUtils.n(this.f, p0.jobId)) {
          c.c(this.d, p0.templateId, p0.jobId, "UNKNOWN");
       }
       this.e = p0.templateId;
       this.f = p0.jobId;
       if (!PatchProxy.applyVoidOneRefs(p0, this, b.class, "8")) {
          if (!j.h(p0.jobInfoImageUrl)) {
             this.g.setPendantImageViewUrls(p0.jobInfoImageUrl);
          }
          if (!TextUtils.x(p0.jobImageJumpUrl)) {
             this.g.setPendantViewClickListener(new d(this, p0));
          }
          this.g.setExitViewClickListener(new e(this, p0));
          int i = 0;
          if (!PatchProxy.applyVoid(null, this, b.class, "9")) {
             this.g.setEditViewVisible(i);
             this.g.setExchangeViewVisible(i);
          }
          if (!j.h(p0.authorButtonList)) {
             LivePlusRecruitMessages$LiveRecruitPanelDisplay authorButton = p0.authorButtonList;
             int len = authorButton.length;
             while (i < len) {
                object oobject = authorButton[i];
                LivePlusRecruitMessages$LiveRecruitPanelButton type = oobject.type;
                if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(type), Boolean.TRUE, this, b.class, "10")) {
                   if (type == true) {
                      this.g.setEditViewVisible(true);
                   }else if(type == 2){
                      this.g.setExchangeViewVisible(true);
                   }
                }
                type = oobject.type;
                LivePlusRecruitMessages$LiveRecruitPanelButton text = oobject.text;
                if (!PatchProxy.isSupport(b.class) || (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(type), text, this, b.class, "11") && !TextUtils.x(text))) {
                   if (type == true) {
                      this.g.setEditViewContentText(text);
                   }else if(type == 2){
                      this.g.setExchangeViewContentText(text);
                   }
                }
                type = oobject.type;
                text = oobject.textColor;
                if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(type), text, this, b.class, "13")) {
                   if (type == true) {
                      this.g.setEditViewTextColor(text);
                   }else if(type == 2){
                      this.g.setExchangeViewTextColor(text);
                   }
                }
                type = oobject.type;
                text = oobject.borderColor;
                if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(type), text, this, b.class, "14")) {
                   if (type == true) {
                      this.g.setEditViewBackgroundStrokeColor(text);
                   }else if(type == 2){
                      this.g.setExchangeViewBackgroundStrokeColor(text);
                   }
                }
                type = oobject.type;
                c uoc = new c(this, oobject, p0);
                if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(type), uoc, this, b.class, "12")) {
                   if (type == true) {
                      this.g.setEditViewClickListener(uoc);
                   }else if(type == 2){
                      this.g.setExchangeViewClickListener(uoc);
                   }
                }
                i = i + 1;
             }
          }
       }
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, b.class, "7")) {
          return;
       }
       b th = this.h;
       if (th != null && this.g != null) {
          th.setTranslationX(0);
          this.h.setTranslationY(0);
          this.g.setVisibility(8);
       }
       return;
    }
}
