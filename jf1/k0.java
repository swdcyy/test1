package jf1.k0;
import o81.d;
import java.lang.Object;
import com.kuaishou.live.basic.model.QLiveMessage;
import o81.g;
import java.lang.CharSequence;
import com.kuaishou.live.common.core.component.comments.model.LiveShareMessage;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.basic.textstyle.LiveSpannable;
import hf1.f;
import com.kwai.framework.model.user.UserInfo;
import b61.b;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import java.util.Locale;
import lnc.a1;
import java.lang.Integer;
import com.kuaishou.live.basic.textstyle.LiveSpannable$b;
import android.text.SpannableStringBuilder;

public class k0 implements d	// class@002b72
{

    public void k0(){
       super();
    }
    public CharSequence a(QLiveMessage p0,g p1){
       String str1;
       LiveShareMessage mContinueSha;
       Object obj1;
       Object[] objArray;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       k0 ok0 = k0.class;
       SpannableStringBuilder spannableStr = PatchProxy.applyTwoRefs(p0, p1, this, ok0, "1");
       if (spannableStr != patchProxyRe) {
       }else {
          LiveSpannable liveSpannabl = new LiveSpannable();
          f.b(p0, liveSpannabl, p1);
          String str = b.c(p0.getUser());
          Object[] obj = PatchProxy.applyOneRefs(str, this, ok0, "4");
          LiveShareMessage liveShareMes = 2;
          if (obj != patchProxyRe) {
             str = obj;
          }else if(TextUtils.f(str) <= 3){
             str = TextUtils.A(str, liveShareMes)+"...";
          }
          if (p1.m()) {
             if (p0.mShareCount > liveShareMes) {
                obj = new Object[]{Integer.valueOf(p0.mShareCount)};
                str1 = String.format(Locale.US, a1.p(R.string.arg_RES_7f1047a9), obj);
             }else if(this.b(p0.mContinueShareCurrentDay)){
                mContinueSha = p0.mContinueShareCurrentDay;
                if (PatchProxy.isSupport(ok0)) {
                   obj1 = PatchProxy.applyOneRefs(Integer.valueOf(mContinueSha), this, ok0, "2");
                   if (obj1 != patchProxyRe) {
                   label_00ec :
                      str1 = obj1;
                   }
                }
                if (mContinueSha != 1) {
                   str1 = (mContinueSha != liveShareMes)? a1.p(R.string.arg_RES_7f10218e): a1.p(R.string.arg_RES_7f102c81);
                }else {
                   str1 = a1.p(R.string.arg_RES_7f102c80);
                }
                objArray = new Object[]{Integer.valueOf(mContinueSha)};
                str1 = String.format(Locale.US, str1, objArray);
             }else {
                str1 = a1.p(R.string.arg_RES_7f102c80);
             }
          }else {
             LiveShareMessage liveShareMes1 = 0x7f102c7f;
             if (p0.mFansGroupShareIntimacy > null) {
                if (this.b(p0.mContinueShareCurrentDay)) {
                   mContinueSha = p0.mContinueShareCurrentDay;
                   liveShareMes1 = p0.mFansGroupShareIntimacy;
                   if (PatchProxy.isSupport(ok0)) {
                      obj1 = PatchProxy.applyTwoRefs(Integer.valueOf(mContinueSha), Integer.valueOf(liveShareMes1), this, ok0, "3");
                      if (obj1 != patchProxyRe) {
                         goto label_00ec ;
                      }
                   }
                   if (mContinueSha == 1) {
                      obj = new Object[]{Integer.valueOf(liveShareMes1)};
                      str1 = String.format(Locale.US, a1.p(R.string.arg_RES_7f10218d), obj);
                   }else {
                      objArray = new Object[liveShareMes];
                      objArray[0] = Integer.valueOf(mContinueSha);
                      objArray[1] = Integer.valueOf(liveShareMes1);
                      str1 = String.format(Locale.US, a1.p(R.string.arg_RES_7f10218c), objArray);
                   }
                }else {
                   str1 = a1.p(liveShareMes1);
                }
             }else if(p0.mShareCount > 1){
                obj = new Object[]{Integer.valueOf(p0.mShareCount)};
                str1 = String.format(Locale.US, a1.p(R.string.arg_RES_7f102c7e), obj);
             }else {
                str1 = a1.p(liveShareMes1);
             }
          }
          int i = (p1.p())? p1.k(): 0x7f060871;
          String str2 = p1.i(p0);
          if (!TextUtils.x(str2)) {
             liveSpannabl.j(f.c(str2, p1).d(i));
          }
          LiveSpannable$b uob = f.c(str, p1).d(i);
          LiveSpannable$b uob1 = f.c(str1, p1).d(i);
          if (p1.p()) {
             liveSpannabl.j(uob).e().j(uob1);
          }else {
             liveSpannabl.j(uob).j(uob1);
          }
          spannableStr = liveSpannabl.k();
       }
       return spannableStr;
    }
    public final boolean b(int p0){
       int i = 1;
       if (p0 >= i) {
       }else {
          i = false;
       }
       return i;
    }
}
