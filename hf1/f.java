package hf1.f;
import java.lang.Object;
import com.kuaishou.live.basic.model.QLiveMessage;
import com.kuaishou.protobuf.livestream.nano.UserStateRichTextSegment;
import com.kuaishou.live.basic.textstyle.LiveSpannable;
import o81.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import ekd.j;
import ne1.k;
import java.lang.Math;
import com.kuaishou.live.basic.textstyle.LiveSpannable$a;
import lnc.u9;
import lnc.a1;
import android.text.style.ReplacementSpan;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.basic.textstyle.LiveSpannable$b;
import com.kwai.robust.PatchProxyResult;
import android.content.res.Resources;
import android.text.style.CharacterStyle;
import java.lang.Integer;
import q38.a;
import cw9.c;
import java.lang.StringBuilder;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;

public class f	// class@002686
{

    public void f(){
       super();
    }
    public static void a(QLiveMessage p0,UserStateRichTextSegment[] p1,LiveSpannable p2,g p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, f.class, "5")) {
          return;
       }
       if (p3.q()) {
          return;
       }
       boolean b = p3.n();
       f uof = f.class;
       int i = 0;
       if (PatchProxy.isSupport(uof)) {
          Object[] objArray = new Object[5];
          objArray[i] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = Boolean.valueOf(b);
          if (!PatchProxy.applyVoid(objArray, null, uof, "2")) {
          label_0043 :
             if (!j.h(p1)) {
                int len = p1.length;
                UserStateRichTextSegment[] userStateRic = f.f(p0, p3.m());
                if (!p3.m() && userStateRic != null) {
                   if (userStateRic.length < k.d()) {
                      len = Math.min((k.d() - userStateRic.length), len);
                   }
                }
                while (i < len) {
                   LiveSpannable$a uoa = p3.s(p1[i]);
                   if (uoa != null) {
                      if (b) {
                         uoa.b(-1);
                         int i1 = len - 1;
                         if (i == i1 && j.h(userStateRic)) {
                            p2.h(uoa).e();
                         }else {
                            p2.h(uoa).a(new u9(a1.e(2.00f)));
                         }
                      }else {
                         p2.h(uoa).e();
                      }
                   }
                   i = i + 1;
                }
             }
          }
       }else {
          goto label_0043 ;
       }
       return;
    }
    public static void b(QLiveMessage p0,LiveSpannable p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, f.class, "4")) {
          return;
       }
       if (p2.q()) {
          return;
       }
       if (p2.r()) {
          QLiveMessage mUser = p0.mUser;
          if (mUser != null && !TextUtils.n(mUser.mId, QCurrentUser.ME.getId())) {
             return;
          }
       }
       boolean b = p2.n();
       if (!PatchProxy.isSupport(f.class) || !PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(b), null, f.class, "1")) {
          UserStateRichTextSegment[] userStateRic = f.f(p0, p2.m());
          if (!j.h(userStateRic)) {
             int len = userStateRic.length;
             if (!p2.m()) {
                len = Math.min(k.d(), len);
             }
             int i = 0;
             while (i < len) {
                LiveSpannable$a uoa = p2.s(userStateRic[i]);
                if (uoa != null) {
                   if (b) {
                      uoa.b(-1);
                      int i1 = len - 1;
                      if (i == i1) {
                         p1.h(uoa).e();
                      }else {
                         p1.h(uoa).a(new u9(a1.e(2.00f)));
                      }
                   }else {
                      p1.h(uoa).e();
                   }
                }
                i = i + 1;
             }
          }
       }
       return;
    }
    public static LiveSpannable$b c(CharSequence p0,g p1){
       LiveSpannable$b obj = PatchProxy.applyTwoRefs(p0, p1, null, f.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveSpannable$b(p0);
       if (p1.n()) {
          obj.f(R.color.arg_RES_7f060197);
       }
       return obj;
    }
    public static CharacterStyle d(Resources p0,int p1,int p2){
       if (PatchProxy.isSupport(f.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, f.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new a(p0.getColor(p1), p0.getColor(p2), c.b(p0, 0x7f070836));
    }
    public static String e(String p0,int p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uof, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (TextUtils.x(p0)) {
          return p0;
       }else if(p0.length() <= p1){
          return p0;
       }else {
          return TextUtils.A(p0, p1)+"...";
       }
    }
    public static UserStateRichTextSegment[] f(QLiveMessage p0,boolean p1){
       QLiveMessage obj;
       f uof = f.class;
       LiveAudienceState liveAudience = null;
       if (PatchProxy.isSupport(uof)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), liveAudience, uof, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = p0.mLiveAudienceState;
       if (obj != null) {
          liveAudience = (p1 && !j.h(obj.userStateSegmentForAuthor))? p0.mLiveAudienceState.userStateSegmentForAuthor: p0.mLiveAudienceState.userStateSegment;
       }
    label_0031 :
       return liveAudience;
    }
}
