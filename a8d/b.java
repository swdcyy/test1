package a8d.b;
import ucd.n;
import lnc.a1;
import a8d.b$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import qvb.q;
import qvb.j;
import com.yxcorp.plugin.search.entity.SearchItem;
import com.yxcorp.plugin.search.response.SearchResultExtParams;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import com.yxcorp.plugin.search.http.a;
import java.lang.Boolean;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.core.content.ContextCompat;
import com.yxcorp.plugin.search.SearchPage;
import androidx.fragment.app.Fragment;
import com.yxcorp.plugin.search.result.fragment.SearchResultTabFragment;
import com.yxcorp.plugin.search.kbox.atmosphere.SearchAtmosphereResource;
import y9d.a;
import zf6.j;
import android.text.SpannableStringBuilder;
import nfd.r3;
import com.kwai.robust.PatchProxyResult;
import ync.a;
import com.yxcorp.plugin.search.SearchSource;
import java.lang.CharSequence;
import a8d.c;
import android.text.method.MovementMethod;
import android.text.method.LinkMovementMethod;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import gbd.t;
import sy5.a;
import com.google.gson.JsonObject;
import android.view.View;
import com.yxcorp.gifshow.widget.EmojiTextView;

public class b extends n	// class@00009f
{
    public q A;
    public EmojiTextView p;
    public SearchResultFragment q;
    public SearchItem r;
    public String s;
    public String t;
    public String u;
    public int v;
    public int w;
    public boolean x;
    public a y;
    public SearchResultResponse z;

    public void b(){
       super();
       this.v = a1.d(0x7f07054b);
       this.w = a1.d(0x7f070295);
       this.x = false;
       this.A = new b$a(this);
    }
    public void E8(){
       int b;
       SpannableStringBuilder spannableStr1;
       String str1;
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "3")) {
          return;
       }
       this.q.q().h(this.A);
       SearchResultExtParams mIsCorrected = this.r.mResultExtParams.mIsCorrectedResult;
       this.u = this.q.Uh();
       SearchItem mResultExtPa = this.r.mResultExtParams;
       this.s = mResultExtPa.mKeyword;
       this.t = mResultExtPa.mCorrectKeyword;
       b = this.q.Vh().B2();
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, uob, "9")) {
          b = (b)? a1.d(R.dimen.arg_RES_7f07031b): this.w;
          this.p.setPadding(this.v, b, this.v, this.w);
          this.p.setLineHeight(a1.d(R.dimen.arg_RES_7f0702cc));
       }
       this.p.setBackgroundColor(ContextCompat.getColor(this.getContext(), R.color.arg_RES_7f060774));
       if (PatchProxy.applyVoid(objArray, this, uob, "4") || (this.q.kc() == SearchPage.AGGREGATE && this.q.getParentFragment() instanceof SearchResultTabFragment)) {
          SearchResultTabFragment parentFragme = this.q.getParentFragment();
          if (this.z == null) {
             SearchResultTabFragment d1 = parentFragme.D1;
             if (d1 != null && d1.contains(true)) {
                this.y = a.c(parentFragme.D1.getColorLight());
             }
             parentFragme = parentFragme.D1;
             if (parentFragme != null) {
                this.W8(this.y, parentFragme.isTopAtmosphere());
             }
          }else {
             this.W8(this.y, this.x);
          }
       }
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(mIsCorrected), this, uob, "7")) {
          b = j.b(this.getContext(), R.color.arg_RES_7f06168c);
          int i = j.b(this.getContext(), R.color.arg_RES_7f06164e);
          b ty = this.y;
          int i1 = 0x7f061e52;
          int i2 = 3;
          if (ty != null && ty.a == i2) {
             b = j.b(this.getContext(), i1);
             i = j.b(this.getContext(), R.color.arg_RES_7f061e5a);
          }
          this.p.setTextColor(b);
          String str = (mIsCorrected != null)? a1.r(R.string.arg_RES_7f1044a4, this.t): a1.p(R.string.arg_RES_7f1045e5);
          ty = (mIsCorrected != null)? this.t: "";
          SpannableStringBuilder spannableStr = r3.u(i, str, ty);
          b ts = (mIsCorrected != null)? this.s: this.t;
          b uob1 = ts;
          if (PatchProxy.isSupport(uob)) {
             spannableStr1 = PatchProxy.applyTwoRefs(Boolean.valueOf(mIsCorrected), uob1, this, uob, "8");
             if (spannableStr1 != PatchProxyResult.class) {
             label_019b :
                spannableStr.append(spannableStr1);
                this.p.setText(spannableStr);
                this.p.setMovementMethod(LinkMovementMethod.getInstance());
             }
          }
          uob = this.y;
          int i3 = (uob != null && uob.a == i2)? j.b(this.getContext(), i1): a.c(this.getContext());
          SearchSource sEARCH_REVOK = (mIsCorrected != null)? SearchSource.SEARCH_REVOKE_CORRECTION: SearchSource.TYPO;
          SpannableStringBuilder spannableStr2 = new SpannableStringBuilder(uob1);
          c uoc = new c(this, mIsCorrected, uob1, sEARCH_REVOK, i3);
          spannableStr2.setSpan(v13, 0, spannableStr2.length(), 33);
          spannableStr1 = spannableStr2;
          goto label_019b ;
       }
       if (!this.r.isShowed()) {
          t.l(0, this.q, this.V8(true, mIsCorrected), t.a(this.q, "SEARCH_RESULT", objArray));
          this.r.setShowed(true);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "6")) {
          return;
       }
       this.q.q().f(this.A);
       return;
    }
    public ClientEvent$ElementPackage V8(boolean p0,boolean p1){
       ClientEvent$ElementPackage obj;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uob, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ClientEvent$ElementPackage();
       obj.action2 = "CORRECTION_BUTTON";
       b tt = (!p0 && p1)? this.s: this.t;
       obj.params = a.k().e("name", tt).d("params", a.k().e("search_session_id", this.u).a("correction_type", (p1 ^ 0x01)).j()).i();
       return obj;
    }
    public final void W8(a p0,boolean p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uob, "5")) {
          return;
       }
       if (p0 == null) {
          this.p.setBackgroundColor(ContextCompat.getColor(this.getContext(), R.color.arg_RES_7f060774));
       }else if(!p1){
          this.p.setBackgroundColor(p0.c);
       }else {
          this.p.setBackgroundColor(0);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.p = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.q = this.r8("FRAGMENT");
       this.r = this.q8(SearchItem.class);
       return;
    }
}
