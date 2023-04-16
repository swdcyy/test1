package fe9.h;
import fe9.f;
import com.yxcorp.gifshow.magic.data.repo.response.MagicEmojiEntrance;
import com.yxcorp.gifshow.magic.data.repo.response.MagicDownloadIndicatorConfig;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.base.b;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fe9.g;
import erd.g;
import java.lang.Integer;
import lnc.a1;
import java.lang.Boolean;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import ekd.k1;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import oa0.a;

public class h extends f	// class@00230a
{
    public final MagicEmojiEntrance b;

    public void h(MagicEmojiEntrance p0){
       super();
       this.b = p0;
       if (p0.mIndicatorConfig == null) {
          p0.mIndicatorConfig = MagicDownloadIndicatorConfig.sDefaultIndicator;
       }
       return;
    }
    public t c(Object p0,b p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, h.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.c(p0, p1).doOnNext(new g(this));
    }
    public String i(Object p0,int p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oh, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!this.r(p0)) {
          return "";
       }else if(p1 == 4){
          return a1.p(0x7f1042c3);
       }else if(p1 != 3 && (p1 == 5 || p1 == 6)){
          return a1.p(0x7f1004b4);
       }else {
          return "";
       }
    }
    public String o(Object p0,int p1,boolean p2){
       String obj;
       if (PatchProxy.isSupport(h.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, h.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String str = "";
       if (!this.r(p0)) {
          return str;
       }else {
          obj = this.v();
          if (k1.f() && !TextUtils.x(p0.mName)) {
             str = p0.mName;
          }
          p0 = new Object[]{str};
          return String.format(obj, p0);
       }
    }
    public t q(Object p0,b p1){
       h oh = h.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, oh, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!PatchProxy.applyVoid(null, this, oh, "9")) {
          a.I0((a.e() + 1));
       }
       return super.q(p0, p1);
    }
    public String s(){
       Object obj = PatchProxy.apply(null, this, h.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a1.p(0x7f1004b4);
    }
    public String t(){
       String obj = PatchProxy.apply(null, this, h.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.z(this.b.mIndicatorConfig.mIndicatorAppliedSuccessText);
       if (TextUtils.x(obj)) {
          obj = a1.p(R.string.arg_RES_7f10313b);
       }
       return obj;
    }
    public String u(){
       String obj = PatchProxy.apply(null, this, h.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.z(this.b.mIndicatorConfig.mIndicatorAppliedFailedText);
       if (TextUtils.x(obj)) {
          obj = a1.p(R.string.arg_RES_7f103156);
       }
       return obj;
    }
    public String v(){
       String obj = PatchProxy.apply(null, this, h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.z(this.b.mIndicatorConfig.mIndicatorDownloadingText);
       if (TextUtils.x(obj)) {
          obj = a1.p(R.string.arg_RES_7f10313c);
       }
       return obj;
    }
    public String w(){
       String obj = PatchProxy.apply(null, this, h.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.z(this.b.mIndicatorConfig.mIndicatorAppliedSuccessText);
       if (TextUtils.x(obj)) {
          obj = a1.p(R.string.arg_RES_7f10313b);
       }
       return obj;
    }
    public final String z(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       int i1 = 1;
       Object[] objArray = new Object[i1];
       objArray[0] = Integer.valueOf(i);
       String str = "${%s}";
       while (p0.contains(String.format(str, objArray))) {
          objArray = new Object[i1];
          objArray[0] = Integer.valueOf(i);
          Object[] objArray1 = new Object[i1];
          i = i + 1;
          objArray1[0] = Integer.valueOf(i);
          p0 = p0.replace(String.format(str, objArray), String.format("%%%s$s", objArray1));
       }
       return p0;
    }
}
