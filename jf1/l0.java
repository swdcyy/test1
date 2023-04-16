package jf1.l0;
import o81.d;
import java.lang.Object;
import com.kuaishou.live.basic.model.QLiveMessage;
import o81.g;
import java.lang.CharSequence;
import com.kuaishou.live.common.core.component.comments.model.CommentMessage;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.text.SpannableStringBuilder;
import com.kuaishou.live.basic.textstyle.LiveSpannable;
import hf1.f;
import com.kuaishou.protobuf.livestream.nano.UserStateRichTextSegment;
import com.kwai.framework.model.user.UserInfo;
import java.lang.StringBuilder;
import b61.b;
import va1.a0;
import java.util.Objects;
import java.lang.Boolean;
import erd.e;
import java.lang.Exception;
import lnc.a1;
import com.kuaishou.live.basic.textstyle.LiveSpannable$b;
import java.lang.Number;
import com.yxcorp.utility.TextUtils;
import z47.d;
import ak5.j;
import jl5.f;

public class l0 implements d	// class@002b74
{
    public d a;

    public void l0(){
       super();
    }
    public CharSequence a(QLiveMessage p0,g p1){
       LiveSpannable$b obj;
       int b;
       g og = g.class;
       SpannableStringBuilder spannableStr = PatchProxy.applyTwoRefs(p0, p1, this, l0.class, "1");
       if (spannableStr != PatchProxyResult.class) {
       }else {
          SpannableStringBuilder spannableStr1 = new SpannableStringBuilder();
          LiveSpannable liveSpannabl = new LiveSpannable(spannableStr1);
          f.b(p0, liveSpannabl, p1);
          CommentMessage mUserStateSe = p0.mUserStateSegment;
          if (mUserStateSe != null) {
             f.a(p0, mUserStateSe, liveSpannabl, p1);
          }
          String str = (p0.getUser() != null)? b.c(p0.getUser())+"£º": "";
          String content = p0.getContent();
          Object[] objArray = null;
          if (a0.g(p0)) {
             Objects.requireNonNull(p1);
             obj = PatchProxy.apply(objArray, p1, og, "12");
             b = (obj != PatchProxyResult.class)? obj.booleanValue(): p1.l.a();
          }
       label_0095 :
          LiveSpannable$b uob = f.c(str, p1);
          obj = f.c(content, p1);
          int i = 0x7f061fda;
          if (p1.p()) {
             uob.d(p1.h());
             Object obj1 = PatchProxy.apply(objArray, p1, og, "13");
             if (obj1 != PatchProxyResult.class) {
                i = obj1.intValue();
             }
             obj.d(i);
          }else {
             uob.d(R.color.arg_RES_7f060871);
             obj.d(i);
          }
          liveSpannabl.j(uob).j(obj);
          if (TextUtils.x(content)) {
             spannableStr = liveSpannabl.k();
          }else if(p0.mEnableKwaiEmoji != null){
             if (this.a == null) {
                this.a = new d();
             }
             this.a.d(p0.mUnsupportedGzoneEmotions);
             int i1 = content.length();
             int i2 = liveSpannabl.m() - i1;
             b = i2 + i1;
             j.o().e(spannableStr1, i2, b, (float)p1.f, this.a);
          }
          spannableStr = liveSpannabl.k();
       }
       return spannableStr;
    }
}
