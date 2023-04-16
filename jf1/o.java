package jf1.o;
import o81.d;
import java.lang.Object;
import com.kuaishou.live.basic.model.QLiveMessage;
import o81.g;
import java.lang.CharSequence;
import com.kuaishou.live.common.core.component.comments.model.LiveFellowRedPacketGrabPacketMessage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.res.Resources;
import lnc.a1;
import com.kuaishou.live.basic.textstyle.LiveSpannable;
import hf1.f;
import com.kwai.framework.model.user.UserInfo;
import b61.b;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.basic.textstyle.LiveSpannable$b;
import com.kuaishou.live.basic.textstyle.LiveSpannable$a;
import android.text.SpannableStringBuilder;

public class o implements d	// class@002b78
{

    public void o(){
       super();
    }
    public CharSequence a(QLiveMessage p0,g p1){
       String str1;
       int i;
       LiveSpannable liveSpannabl1;
       SpannableStringBuilder spannableStr = PatchProxy.applyTwoRefs(p0, p1, this, o.class, "1");
       if (spannableStr != PatchProxyResult.class) {
       }else {
          Resources resources = a1.m();
          LiveSpannable liveSpannabl = new LiveSpannable();
          f.b(p0, liveSpannabl, p1);
          b.c(p0.getUser());
          String str = "";
          if (TextUtils.n(p0.mSendUserInfo.mId, QCurrentUser.me().getId()) && TextUtils.n(p0.mGrabUserInfo.mId, p0.mSendUserInfo.mId)) {
             str1 = resources.getString(R.string.arg_RES_7f103b01);
             i = 1;
          }else if(TextUtils.n(p0.mSendUserInfo.mId, QCurrentUser.me().getId()) && !TextUtils.n(p0.mSendUserInfo.mId, p0.mGrabUserInfo.mId)){
             str1 = resources.getString(R.string.arg_RES_7f103b00);
             i = 2;
          }else {
             str = resources.getString(R.string.arg_RES_7f102219);
             str1 = resources.getString(0x7f102222);
             i = 3;
          }
          LiveSpannable$b uob = f.c(b.c(p0.mSendUserInfo), p1);
          LiveSpannable$b uob1 = f.c(b.c(p0.mGrabUserInfo), p1);
          LiveSpannable$b uob2 = f.c(str1, p1);
          LiveSpannable$b uob3 = f.c(str, p1);
          if (p1.p()) {
             uob.d(p1.h());
             uob1.d(p1.h());
             uob2.d(p1.l());
             uob3.d(p1.l());
          }else {
             int i1 = 0x7f060871;
             uob.d(i1);
             uob1.d(i1);
             uob2.d(i1);
             uob3.d(i1);
          }
          if (p1.p()) {
             liveSpannabl1 = (i != 3)? liveSpannabl.j(uob1).e().j(uob2).e().j(uob3).e().h(new LiveSpannable$a(R.drawable.arg_RES_7f081170).c(p1.f)): liveSpannabl.j(uob1).e().j(uob2).e().j(uob).e().h(new LiveSpannable$a(R.drawable.arg_RES_7f081170).c(p1.f));
          }else {
             liveSpannabl1 = liveSpannabl.j(uob1).j(uob2).j(uob).e().h(new LiveSpannable$a(R.drawable.arg_RES_7f081170).c(p1.f));
          }
          spannableStr = liveSpannabl1.k();
       }
       return spannableStr;
    }
}
