package fe9.f;
import lc9.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import ekd.k1;
import nc9.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import lnc.a1;
import lc9.a;
import com.yxcorp.gifshow.camera.record.base.b;
import brd.t;
import java.lang.IllegalAccessException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import com.yxcorp.gifshow.camera.record.magic.a;
import com.yxcorp.gifshow.camera.record.magic.a$a;
import j8c.a;
import q87.c;
import lnc.s6;
import ce9.l;
import fe9.d;
import erd.g;
import w3b.r;
import nc9.b;
import i4b.g;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.ChildMagicFace;
import ekd.j;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import lnc.e0;
import z3b.a0;
import fe9.c;
import io.reactivex.g;
import le9.e;
import le9.e$a;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import w3b.l;
import jd.c;
import java.lang.Exception;
import com.yxcorp.gifshow.magic.exception.UnSupportedMagicException;
import r5b.e;
import oc9.w;
import java.util.List;
import java.util.Iterator;
import oc9.t;
import com.yxcorp.gifshow.camera.record.video.w;
import com.yxcorp.gifshow.camera.record.magic.e;

public class f implements b	// class@002308
{
    public MagicEmoji$MagicFace a;

    public void f(){
       super();
    }
    public String a(Object p0,int p1,boolean p2){
       String obj;
       Object[] objArray;
       if (PatchProxy.isSupport(f.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, f.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!this.r(p0)) {
          return "";
       }else if(k1.f()){
          obj = a.a(p0);
       }else {
          obj = "";
       }
       if (p1 == 2 || p1 == 1) {
          return this.o(p0, 0, p2);
       }else if(p1 == 4){
          if (TextUtils.x(obj)) {
             int i = (PostExperimentUtils.p())? 0x7f10100f: 0x7f10100e;
             return a1.p(i);
          }else {
             objArray = new Object[]{obj};
             return String.format(this.u(), objArray);
          }
       }else if(p1 == 5){
          objArray = new Object[]{obj};
          return String.format(this.w(), objArray);
       }else if(p1 == 6){
          objArray = new Object[]{obj};
          return String.format(this.t(), objArray);
       }else if(p1 == 7){
          objArray = new Object[]{obj};
          return String.format(this.s(), objArray);
       }else {
          return "";
       }
    }
    public void b(Object p0,int p1){
       a.d(this, p0, p1);
    }
    public t c(Object p0,b p1){
       l obj = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.r(p0)) {
          return t.error(new IllegalAccessException("don\'t support "+p0));
       }
       int i = 0;
       if (MagicEmoji$MagicFace.isImmerseMagicFace(p0) && !p1.d(a.d.a()).c()) {
          Object[] objArray = new Object[i];
          a.D().w("MagicDownloadProcessor", "not support immerseMagic", objArray);
          return t.just(Boolean.FALSE);
       }else if(s6.H()){
          obj = l.i;
          if (p1.d(obj).a != null) {
             Object[] objArray1 = new Object[i];
             a.D().w("MagicDownloadProcessor", "has magic face selected", objArray1);
             this.x(p1.d(obj).a);
             return t.just(Boolean.TRUE);
          }
       }
       return this.y(p1, p0).doOnNext(new d(this, p0));
    }
    public int d(Object p0,b p1){
       return a.b(this, p0, p1);
    }
    public void e(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "4")) {
          return;
       }
       if (!this.r(p0)) {
          return;
       }
       if (r.a == p0) {
          r.a = null;
       }
       return;
    }
    public void f(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "8")) {
          return;
       }
       r.a = null;
       this.y(p0, null);
       return;
    }
    public void g(Object p0,int p1){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, f.class, "18")) {
          return;
       }
       b.c(p1, "Ä§·¨×ÊÔ´");
       return;
    }
    public boolean h(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.r(p0)) {
          return false;
       }
       return g.y(p0);
    }
    public String i(Object p0,int p1){
       return a.a(this, p0, p1);
    }
    public CDNUrl[] j(Object p0){
       MagicEmoji$MagicFace obj = PatchProxy.applyOneRefs(p0, this, f.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.r(p0)) {
          p0 = new CDNUrl[0];
          return p0;
       }else {
          obj = p0.mChildMagicFace;
          if (obj != null && !j.h(obj.mIcons)) {
             return p0.mChildMagicFace.mIcons;
          }
          if (!j.h(p0.mImages)) {
             return p0.mImages;
          }
          return e0.h(p0.mImage);
       }
    }
    public void k(Object p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "7")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("MagicDownloadProcessor", "cancelDownloadingMagicFace", objArray);
       if (this.a == null) {
          return;
       }
       if (r.a == this.a) {
          r.a = null;
       }
       a0.o().k(this.a);
       return;
    }
    public t l(Object p0,b p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "3");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (!this.r(p0)) {
          return t.error(new IllegalAccessException("don\'t support "+p0));
       }
       this.a = p0;
       return t.create(new c(this));
    }
    public boolean m(){
       boolean b = (this.a != null)? true: false;
       return b;
    }
    public t n(Object p0,b p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.r(p0)) {
          return t.error(new IllegalAccessException("don\'t support "+p0));
       }
       String str = p1.d(e.c.a()).a();
       if (TextUtils.x(p0.mId)) {
          return t.error(new IllegalAccessException("magicFace id isEmpty"));
       }
       Object[] objArray = new Object[0];
       a.D().w("MagicDownloadProcessor", "getMagicAndUse:"+p0.mName, objArray);
       return l.n(p0, MagicBusinessId.VIDEO, str);
    }
    public String o(Object p0,int p1,boolean p2){
       String obj;
       if (PatchProxy.isSupport(f.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, f.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String str = "";
       if (!this.r(p0)) {
          return str;
       }else {
          obj = this.v();
          p0 = (k1.f() && !TextUtils.x(p0.mName))? p0.mName: str;
          int i = 1;
          if (!TextUtils.x(p0)) {
             Object[] objArray = new Object[]{p0,String.valueOf(p1)};
             return String.format(obj, objArray)+"%";
          }else {
             p0 = a1.p(R.string.arg_RES_7f103de3);
             if (!k1.f()) {
                p0 = p0+" ";
             }
             Object[] objArray1 = new Object[i];
             objArray1[0] = Integer.valueOf(p1);
             return p0+(String.format(a1.p(0x7f10375e), objArray1)).replaceAll("\\p{P}", str)+"%";
          }
       }
    }
    public c p(Object p0){
       return a.c(this, p0);
    }
    public t q(Object p0,b p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.r(p0)) {
          return t.error(new IllegalAccessException("don\'t support "+p0));
       }
       Object[] objArray = new Object[0];
       a.D().w("MagicDownloadProcessor", "checkMagicFaceSupport", objArray);
       if (TextUtils.x(p0.mId)) {
          return t.error(new IllegalAccessException("checkMagicFace is null"));
       }
       if (!l.q(p0)) {
          return t.error(l.k(p0));
       }
       if (MagicEmoji$MagicFace.isImmerseMagicFace(p0) && !p1.d(a.d.a()).c()) {
          return t.error(new UnSupportedMagicException("UnSupportedMagicException mobile does not support magic"));
       }
       r.a = p0;
       return t.just(p0);
    }
    public boolean r(Object p0){
       return p0 instanceof MagicEmoji$MagicFace;
    }
    public String s(){
       Object obj = PatchProxy.apply(null, this, f.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a1.p(0x7f10315f);
    }
    public String t(){
       Object obj = PatchProxy.apply(null, this, f.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = (PostExperimentUtils.p())? 0x7f10315a: 0x7f103159;
       return a1.p(i);
    }
    public String u(){
       Object obj = PatchProxy.apply(null, this, f.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = (PostExperimentUtils.p())? 0x7f103157: 0x7f103156;
       return a1.p(i);
    }
    public String v(){
       Object obj = PatchProxy.apply(null, this, f.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = (PostExperimentUtils.p())? 0x7f10315c: 0x7f10315b;
       return a1.p(i);
    }
    public String w(){
       Object obj = PatchProxy.apply(null, this, f.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = (PostExperimentUtils.p())? 0x7f10315e: 0x7f10315d;
       return a1.p(i);
    }
    public final void x(MagicEmoji$MagicFace p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "6")) {
          return;
       }
       e.d(p0, 3);
       return;
    }
    public final t y(b p0,MagicEmoji$MagicFace p1){
       t obj = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Iterator iterator = p0.b().za().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return t.just(Boolean.FALSE);
          }
          obj = iterator.next();
          if (obj instanceof w) {
             break ;
          }
       }
       return t.just(Boolean.valueOf(obj.r2(p1)));
    }
}
