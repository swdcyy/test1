package c7c.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import a7c.h;
import android.widget.TextView;
import com.kwai.framework.model.user.UserExtraInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.text.SpannableStringBuilder;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import c7c.s;
import java.lang.Runnable;
import android.view.View;
import ekd.m1;
import com.yxcorp.utility.n;
import x6c.u;
import lnc.b3;
import android.content.Context;
import lu7.f;
import android.text.SpannableString;
import java.lang.Number;

public class t extends PresenterV2	// class@000554
{
    public View p;
    public TextView q;
    public TextView r;
    public TextView s;
    public TextView t;
    public TextView u;
    public User v;
    public h w;
    public boolean x;

    public void t(){
       super(false);
    }
    public void t(boolean p0){
       super();
       this.x = p0;
    }
    public void E8(){
       View[] viewArray1;
       String str;
       t ot = t.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ot, "3")) {
          return;
       }
       User mExtraInfo = this.v.mExtraInfo;
       int i = 1;
       if (mExtraInfo == null || !this.w.e()) {
          View[] viewArray = new View[]{this.q,this.r,this.s,this.t,this.p};
          n.Z(8, viewArray);
          return;
       }else if(this.w.x()){
          this.q.setBackgroundResource(this.w.x());
          this.r.setBackgroundResource(this.w.x());
          this.s.setBackgroundResource(this.w.x());
          this.t.setBackgroundResource(this.w.x());
          this.u.setBackgroundResource(this.w.x());
       }
       t ot1 = (TextUtils.n("M", mExtraInfo.mSex) || TextUtils.n("F", mExtraInfo.mSex))? 1: null;
       if (this.x != null && (ot1 && !TextUtils.x(mExtraInfo.mAge))) {
          this.u.setVisibility(0);
          this.q.setVisibility(8);
          this.r.setVisibility(8);
          this.u.setText(this.P8(this.v).append(mExtraInfo.mAge));
       }else if(ot1 != null){
          this.u.setVisibility(8);
          this.q.setVisibility(0);
          ot1 = this.q;
          t tv = this.v;
          SpannableStringBuilder spannableStr = PatchProxy.applyOneRefs(tv, this, ot, "4");
          if (spannableStr != PatchProxyResult.class) {
          }else {
             spannableStr = this.P8(tv);
             if (tv.isMale()) {
                str = a1.p(R.string.arg_RES_7f103196);
             }else if(tv.isFemale()){
                str = a1.p(R.string.arg_RES_7f100f40);
             }else {
                str = a1.p(R.string.arg_RES_7f10471f);
             }
             spannableStr.append(str);
          }
          ot1.setText(spannableStr);
       }else if(!TextUtils.x(mExtraInfo.mAge)){
          this.u.setVisibility(8);
          this.r.setVisibility(0);
          this.r.setText(mExtraInfo.mAge);
       }else {
          this.u.setVisibility(8);
          this.q.setVisibility(8);
          this.r.setVisibility(8);
          ot1 = null;
       label_011c :
          if (!TextUtils.x(mExtraInfo.mCityName)) {
             this.s.setVisibility(0);
             this.s.setText(mExtraInfo.mCityName);
             ot1 = 1;
          }else {
             this.s.setVisibility(8);
          }
          if (this.x != null && !TextUtils.x(mExtraInfo.mSchoolName)) {
             this.t.setText(mExtraInfo.mSchoolName);
             if (!PatchProxy.applyVoid(objArray, this, ot, "6")) {
                this.p.post(new s(this));
             }
             ot1 = 1;
          }else {
             this.t.setVisibility(8);
          }
          View view = m1.f(this.m8(), R.id.nameLayout);
          View view1 = m1.f(this.m8(), R.id.reco_text_layout);
          if (ot1 == null) {
             viewArray1 = new View[i];
             viewArray1[0] = this.p;
             n.Z(8, viewArray1);
             u.a(view, a1.d(R.dimen.arg_RES_7f07031b));
             u.a(view1, a1.d(R.dimen.arg_RES_7f0702e3));
          }else {
             viewArray1 = new View[i];
             viewArray1[0] = this.p;
             n.Z(0, viewArray1);
             u.a(view, 0);
             u.a(view1, a1.d(R.dimen.arg_RES_7f070334));
          }
          return;
       }
       ot1 = 1;
       goto label_011c ;
    }
    public final SpannableStringBuilder P8(User p0){
       SpannableStringBuilder obj = PatchProxy.applyOneRefs(p0, this, t.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new SpannableStringBuilder();
       b3 uob3 = new b3(this.getContext(), f.f(p0));
       uob3.b(false);
       uob3.g(a1.d(R.dimen.arg_RES_7f0702ac));
       obj.append(uob3.a());
       SpannableStringBuilder spannableStr = obj;
       return spannableStr.append(" ");
    }
    public final int R8(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, t.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = a1.d(R.dimen.arg_RES_7f07031b);
       int i1 = (!p0.getVisibility())? p0.getWidth() + i: 0;
       return i1;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a3cc8);
       this.r = m1.f(p0, 0x7f0a3cc9);
       this.q = m1.f(p0, 0x7f0a3d21);
       this.t = m1.f(p0, 0x7f0a3d1b);
       this.u = m1.f(p0, 0x7f0a3d22);
       this.p = m1.f(p0, 0x7f0a3cf6);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, t.class, "1")) {
          return;
       }
       this.v = this.q8(User.class);
       this.w = this.r8("PYMK_ACCESS_IDSPYMK_PARAMS");
       return;
    }
}
