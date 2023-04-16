package com.kuaishou.live.common.core.component.comments.item.voicecomment.a;
import o81.d;
import o81.f;
import java.lang.Object;
import com.kuaishou.live.basic.model.QLiveMessage;
import o81.g;
import java.lang.CharSequence;
import com.kuaishou.live.common.core.component.comments.model.VoiceCommentMessage;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.basic.textstyle.LiveSpannable;
import hf1.f;
import com.kuaishou.protobuf.livestream.nano.UserStateRichTextSegment;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.UserInfo;
import b61.b;
import com.kuaishou.live.basic.textstyle.LiveSpannable$b;
import kf1.a;
import android.view.View$OnClickListener;
import java.lang.Math;
import com.kuaishou.live.common.core.component.comments.item.voicecomment.a$b;
import java.lang.Enum;
import java.lang.Integer;
import com.kuaishou.live.basic.textstyle.LiveSpannable$a;
import lnc.a1;
import w4.h;
import sy1.b;
import w4.e;
import java.util.Map;
import android.graphics.drawable.Drawable;
import kf1.e;
import android.text.style.ClickableSpan;
import kf1.c;
import kf1.d;
import com.yxcorp.utility.TextUtils;
import kf1.b;
import android.text.SpannableStringBuilder;
import com.kuaishou.live.common.core.component.comments.item.voicecomment.a$a;

public class a implements d	// class@0010a7
{
    public f a;
    public final f b;

    public void a(){
       super(null);
    }
    public void a(f p0){
       super();
       this.b = p0;
    }
    public CharSequence a(QLiveMessage p0,g p1){
       b obj3;
       LiveSpannable$a uoa;
       Object obj4;
       e uoe;
       h oh;
       int i1;
       Map map;
       Object obj = this;
       Object obj1 = p1;
       Object obj2 = p0;
       SpannableStringBuilder spannableStr = PatchProxy.applyTwoRefs(obj2, obj1, obj, a.class, "1");
       if (spannableStr != PatchProxyResult.class) {
       }else {
          a b = obj.b;
          if (b != null) {
             b.a(obj2);
          }
          LiveSpannable liveSpannabl = new LiveSpannable();
          f.b(obj2, liveSpannabl, obj1);
          VoiceCommentMessage mUserStateSe = obj2.mUserStateSegment;
          if (mUserStateSe != null) {
             f.a(obj2, mUserStateSe, liveSpannabl, obj1);
          }
          LiveSpannable$b uob = f.c(b.c(obj2.getUser())+"£º", obj1);
          if (p1.p()) {
             uob.d(p1.h());
          }else {
             uob.d(R.color.arg_RES_7f060871);
          }
          uob.b(new a(obj));
          liveSpannabl.j(uob);
          int i = Math.max(1, (int)(obj2.mDurationMs / 1000));
          switch (a$b.a[obj2.mStatus.ordinal()]){
              case 1:
              case 3:
              case 4:
              case 5:
              case 2:
                if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidFourRefs(obj2, liveSpannabl, p1, Integer.valueOf(i), this, a.class, "3")) {
                   obj.b(obj2, liveSpannabl, i);
                   uob = f.c(i+"\"", obj1).d(R.color.arg_RES_7f061fda);
                   uob.g(a1.e(14.00f));
                   uob.b(new d(obj, obj2));
                   liveSpannabl.e().j(uob);
                }
                break;
              case 6:
                if (PatchProxy.isSupport(a.class)) {
                   if (!PatchProxy.applyVoidFourRefs(obj2, liveSpannabl, p1, Integer.valueOf(i), this, a.class, "2")) {
                   }
                }else {
                   int i2 = 0x7f061fda;
                }
                break;
              case 7:
                if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(obj2, liveSpannabl, Integer.valueOf(i), this, a.class, "6")) {
                   obj.b(obj2, liveSpannabl, i);
                   liveSpannabl.e().h(new LiveSpannable$a(R.drawable.arg_RES_7f0814eb).c(a1.e(15.00f)));
                }
                break;
              case 8:
                if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(obj2, liveSpannabl, Integer.valueOf(i), this, a.class, "4")) {
                   obj.b(obj2, liveSpannabl, i);
                   liveSpannabl.e().f(R.drawable.arg_RES_7f080490);
                }
                break;
              case 9:
                if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(obj2, liveSpannabl, Integer.valueOf(i), this, a.class, "5")) {
                   obj.b(obj2, liveSpannabl, i);
                   liveSpannabl.e().f(R.drawable.arg_RES_7f0812e7);
                }
                break;
              default:
          }
       label_0221 :
          if (!TextUtils.x(obj2.mContent)) {
             liveSpannabl.b("\n");
             uob = new LiveSpannable$b(obj2.mContent);
             uob.b(new b(obj, obj2));
             liveSpannabl.j(uob);
          }
          spannableStr = liveSpannabl.k();
       }
       return spannableStr;
    }
    public final void b(VoiceCommentMessage p0,LiveSpannable p1,int p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, a.class, "7")) {
          return;
       }
       if (p2 > 7) {
          p2 = 0x7f0814cf;
       }else if(p2 > 3){
          p2 = 0x7f0814d2;
       }else {
          p2 = 0x7f0814da;
       }
       LiveSpannable$a uoa = new LiveSpannable$a(p2);
       uoa.a(new a$a(this, p0));
       uoa.f = a1.a(0x7f060197);
       p1.h(uoa);
       return;
    }
}
