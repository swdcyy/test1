package nfd.s3;
import nfd.j0;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import com.yxcorp.plugin.search.SearchSource;
import java.lang.String;
import nfd.s3$a;
import com.yxcorp.plugin.search.SearchPage;
import udd.d;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import udd.e;
import com.yxcorp.gifshow.fragment.f;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.feature.component.entry.SearchSceneSource;
import android.view.View;
import com.yxcorp.plugin.search.result.SearchKeywordContext;
import e7d.a;
import android.view.ViewGroup;
import i2b.a;
import android.widget.ImageView;
import android.widget.TextView;
import android.text.TextPaint;
import wh5.c;
import lnc.a1;
import java.lang.CharSequence;
import com.yxcorp.plugin.search.utils.i0;
import android.text.TextUtils;
import java.lang.Integer;
import k2b.e0;
import com.yxcorp.plugin.search.entity.SearchItem;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import gbd.t;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import sy5.a;
import gbd.i;
import nfd.s3$b;
import android.view.View$OnClickListener;
import java.lang.StringBuilder;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import zf6.j;
import com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView;
import com.facebook.drawee.view.SimpleDraweeView;
import android.widget.LinearLayout;
import android.view.View$OnAttachStateChangeListener;

public class s3 extends j0	// class@001e09
{
    public TextView E;
    public View F;
    public final String G;
    public final View$OnAttachStateChangeListener H;

    public void s3(SearchResultFragment p0,SearchSource p1,String p2,String p3){
       super(p0, p1, p2);
       this.H = new s3$a(this);
       this.G = p3;
    }
    public void C(boolean p0){
    }
    public d D(SearchPage p0,String p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, s3.class, "3");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new e(this.C, p1, this.g, this.D);
    }
    public View J0(){
       Object[] objArray = null;
       SearchPage obj = PatchProxy.apply(objArray, this, s3.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.C = this.B.b1.f().mMajorKeyword;
       obj = this.B.kc();
       if (this.v == null) {
          View view = a.i(this.a, R.layout.arg_RES_7f0d1446);
          this.v = view;
          ImageView imageView = view.findViewById(R.id.empty_icon);
          TextView textView = this.v.findViewById(R.id.empty_text);
          this.E = textView;
          textView.getPaint().setFakeBoldText(true);
          this.w = this.v.findViewById(0x7f0a115d);
          textView = this.v.findViewById(R.id.profile_search_more_title);
          textView.getPaint().setFakeBoldText(true);
          View view1 = this.v.findViewById(R.id.vertical_empty_search_more);
          this.N(view1);
          if (c.b()) {
             textView.setVisibility(8);
             view1.setVisibility(8);
             this.w.setVisibility(8);
          }
          if (this.L() || this.D == SearchSceneSource.HISTORY_PAGE) {
             imageView.setImageResource(R.drawable.arg_RES_7f0805fc);
          }else if(obj == SearchPage.PROFILE_COLLECT){
             imageView.setImageResource(R.drawable.arg_RES_7f0822c1);
          }else if(obj == SearchPage.PROFILE_LIKE){
             imageView.setImageResource(R.drawable.arg_RES_7f0822de);
          }
       }
       if (this.L()) {
          this.E.setText(a1.r(R.string.arg_RES_7f101399, this.G));
       }else if(obj == SearchPage.HISTORY_PAGE){
          this.E.setText(R.string.arg_RES_7f104106);
       }else if(!TextUtils.isEmpty(this.r)){
          this.E.setText(this.r);
          this.r = objArray;
       }else if(obj == SearchPage.PROFILE_COLLECT){
          this.E.setText(R.string.arg_RES_7f105007);
       }else if(obj == SearchPage.PROFILE_LIKE){
          this.E.setText(R.string.arg_RES_7f105009);
       }else if(obj == SearchPage.PROFILE_FEED){
          this.E.setText(R.string.arg_RES_7f105008);
       }
       this.O(this.v, R.drawable.arg_RES_7f08230e, -1);
       return this.v;
    }
    public final boolean L(){
       boolean b = (this.D == SearchSceneSource.PROFILE)? true: false;
       return b;
    }
    public void M(int p0){
       s3 os3 = s3.class;
       if (PatchProxy.isSupport(os3) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, os3, "6")) {
          return;
       }
       ClientEvent$AreaPackage uAreaPackage = t.a(this.B, "SEARCH_RESULT", null);
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       j0 tD = this.D;
       String str = (tD == SearchSceneSource.PROFILE)? "search_entrance_profile_result": "search_entrance_my_profile_result";
       if (tD == SearchSceneSource.HISTORY_PAGE) {
          str = "search_entrance_recent_browse_result_allsite";
       }
       uElementPack.action2 = "SEARCH_MORE_BUTTON";
       uElementPack.params = a.k().e("entry_source", str).i();
       i.j(p0, this.B, uElementPack, uAreaPackage);
       return;
    }
    public final void N(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s3.class, "4")) {
          return;
       }
       p0.findViewById(R.id.search_more_tips).getPaint().setFakeBoldText(true);
       p0.setOnClickListener(new s3$b(this));
       return;
    }
    public final void O(View p0,int p1,int p2){
       if (PatchProxy.isSupport(s3.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, s3.class, "5")) {
          return;
       }
       TextView textView = p0.findViewById(R.id.search_more_tips);
       String str = a1.p(R.string.arg_RES_7f105027);
       String str1 = str+this.C;
       SpannableString spannableStr = new SpannableString(str1);
       spannableStr.setSpan(super(j.d(textView, R.color.arg_RES_7f06175e)), str.length(), str1.length(), 17);
       textView.setText(spannableStr);
       KwaiCDNImageView kwaiCDNImage = p0.findViewById(R.id.search_more_icon);
       if (p1 != -1) {
          kwaiCDNImage.setImageResource(p1);
       }else if(p2 != -1){
          kwaiCDNImage.n0(p2);
       }
       return;
    }
    public void p(){
       if (PatchProxy.applyVoid(null, this, s3.class, "1")) {
          return;
       }
       super.p();
       i0 ts = this.s;
       if (ts != null && this.F == null) {
          View view = ts.findViewById(R.id.vertical_empty_search_more);
          this.F = view;
          this.N(view);
       }
       s3 tF = this.F;
       if (tF != null) {
          tF.removeOnAttachStateChangeListener(this.H);
          this.F.addOnAttachStateChangeListener(this.H);
          this.O(this.F, -1, R.string.arg_RES_7f104574);
       }
       return;
    }
    public int w(){
       return 0x7f0d124d;
    }
}
