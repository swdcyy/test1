package jf1.t;
import o81.d;
import java.lang.Object;
import com.kuaishou.live.basic.model.QLiveMessage;
import o81.g;
import java.lang.CharSequence;
import com.kuaishou.live.common.core.component.redpacket.redpacket.GrabRedPacketMessage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.basic.textstyle.LiveSpannable;
import hf1.f;
import com.kwai.framework.model.user.UserInfo;
import b61.b;
import com.yxcorp.utility.TextUtils;
import lnc.a1;
import com.kwai.framework.model.user.QCurrentUser;
import android.content.res.Resources;
import com.kuaishou.live.basic.textstyle.LiveSpannable$b;
import com.kuaishou.live.basic.textstyle.LiveSpannable$a;
import android.text.SpannableStringBuilder;

public class t implements d	// class@002b7f
{

    public void t(){
       super();
    }
    public CharSequence a(QLiveMessage p0,g p1){
       int i1;
       LiveSpannable$b uob;
       LiveSpannable$b uob1;
       SpannableStringBuilder spannableStr = PatchProxy.applyTwoRefs(p0, p1, this, t.class, "1");
       if (spannableStr != PatchProxyResult.class) {
       }else {
          LiveSpannable liveSpannabl = new LiveSpannable();
          f.b(p0, liveSpannabl, p1);
          GrabRedPacketMessage mRedPackType = p0.mRedPackType;
          GrabRedPacketMessage grabRedPacke = 1;
          int i = 0x7f060871;
          if (mRedPackType == grabRedPacke || mRedPackType == null) {
             grabRedPacke = p0.mIsPusher;
             if (p0.mIsSnatchMyselfRedPacket != null) {
                i1 = 0x7f103b01;
             }else if(grabRedPacke != null){
                i1 = 0x7f103b00;
             }else {
                i1 = 0x7f102c7d;
             }
             uob = f.c(b.c(p0.getUser()), p1);
             uob1 = f.c(a1.p(i1), p1);
             if (p1.p()) {
                uob.d(p1.h());
                uob1.d(p1.l());
             }else {
                uob.d(i);
                uob1.d(i);
             }
             liveSpannabl.j(uob).e().j(uob1).e().h(new LiveSpannable$a(R.drawable.arg_RES_7f081170).c(p1.f));
          }else if(mRedPackType == 2){
             String str = b.c(p0.getUser());
             GrabRedPacketMessage mFromUser = p0.mFromUser;
             if (mFromUser == null || TextUtils.x(b.c(mFromUser))) {
                this.b(liveSpannabl, str, a1.p(R.string.arg_RES_7f10229c), p1);
             }else if(TextUtils.n(p0.mFromUser.mId, p0.getUser().mId)){
                this.b(liveSpannabl, str, a1.p(R.string.arg_RES_7f10229f), p1);
             }else if(TextUtils.n(p0.mFromUser.mId, QCurrentUser.me().getId()) && !TextUtils.n(p0.mFromUser.mId, p0.getUser().mId)){
                this.b(liveSpannabl, str, a1.p(R.string.arg_RES_7f10229e), p1);
             }else {
                Object[] objArray = new Object[grabRedPacke];
                objArray[0] = String.valueOf(p0.mGrabKsCoin);
                uob1 = f.c(str, p1);
                LiveSpannable$b uob2 = f.c(a1.m().getString(R.string.arg_RES_7f102d1f), p1);
                LiveSpannable$b uob3 = f.c(b.c(p0.mFromUser), p1);
                uob = f.c(a1.m().getString(R.string.arg_RES_7f102d20, objArray), p1);
                if (p1.p()) {
                   uob1.d(p1.h());
                   uob2.d(p1.l());
                   uob3.d(p1.h());
                   uob.d(p1.l());
                }else {
                   uob1.d(i);
                   uob2.d(i);
                   uob3.d(i);
                   uob.d(i);
                }
                liveSpannabl.j(uob1).e().j(uob2).e().j(uob3).e().j(uob);
             }
          }
          spannableStr = liveSpannabl.k();
       }
       return spannableStr;
    }
    public final void b(LiveSpannable p0,String p1,String p2,g p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, t.class, "2")) {
          return;
       }
       LiveSpannable$b uob = f.c(p1, p3);
       LiveSpannable$b uob1 = f.c(p2, p3);
       if (p3.p()) {
          uob.d(p3.h());
          uob1.d(p3.l());
       }else {
          uob.d(R.color.arg_RES_7f060871);
          uob.d(R.color.arg_RES_7f060871);
       }
       p0.j(uob).e().j(uob1);
       return;
    }
}
