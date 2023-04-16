package jd9.f$a;
import com.yxcorp.gifshow.bubble.a;
import jd9.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import oc9.d0;
import oa0.a;
import xf6.g;
import com.yxcorp.gifshow.camera.record.base.d;
import oc9.w;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.bubble.c;
import com.yxcorp.gifshow.camera.bubble.RecordBubbleItem;
import ra9.c;
import ra9.a;
import brd.t;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.bubble.PostBubbleManager$c;
import com.yxcorp.gifshow.model.config.LipSynchGuideConfig;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.yxcorp.gifshow.model.CDNUrl;
import jd9.c;
import jd9.f$a$a;
import java.util.Objects;
import jd9.c$a;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.widget.record.CoverVideoView;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import u07.t$a;
import android.app.Activity;
import u07.a;
import lnc.a1;
import java.lang.CharSequence;
import jd9.a;
import u07.u;
import jd9.b;
import bg9.a;
import w07.l;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import android.content.SharedPreferences$Editor;
import oe6.g;
import j8c.a;
import q87.c;

public class f$a implements a	// class@002a60
{
    public final f b;

    public void f$a(f p0){
       this.b = p0;
       super();
    }
    public boolean c(){
       f$a obj = PatchProxy.apply(null, this, f$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       obj = (this.b.f2() && (!a.G() || g.l0()))? 1: null;
       if (obj) {
          return b;
       }else {
          this.b.d.b().V7().u(RecordBubbleItem.LIP_SYNCH);
          return false;
       }
    }
    public c d(){
       return RecordBubbleItem.LIP_SYNCH;
    }
    public void dismiss(){
       a.b(this);
    }
    public t e(){
       return a.a(this);
    }
    public boolean f(){
       return a.d(this);
    }
    public boolean g(String p0){
       return a.c(this, p0);
    }
    public boolean i(FragmentActivity p0,PostBubbleManager$c p1){
       Object obj = this;
       Object obj1 = p0;
       c obj2 = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LipSynchGuideConfig obj3 = PatchProxy.applyTwoRefs(obj1, obj2, obj, f$a.class, "2");
       if (obj3 != patchProxyRe) {
          return obj3.booleanValue();
       }
       obj3 = LipSynchGuideConfig.class;
       SharedPreferences a = a.a;
       String str = a.getString("lipsSyncConfig", "null");
       obj3 = (str == null || str == "")? null: b.a(str, obj3);
       int i = 0;
       if (obj3 != null && (!q.f(obj3.mGuideCoverUrl) && (!q.f(obj3.mGuideVideoUrl) && ((obj3.mGuideCoverUrl.get(i).mUrl).isEmpty() || (obj3.mGuideVideoUrl.get(i).mUrl).isEmpty())))) {
          obj.b.d.b().V7().u(RecordBubbleItem.LIP_SYNCH);
          Object[] objArray = new Object[i];
          a.D().w("LipSynchGuideController", "url is empty, dialog can\'t show", objArray);
          return i;
       }else {
          Object obj4 = obj3.mGuideCoverUrl.get(i);
          Object obj5 = obj3.mGuideVideoUrl.get(i);
          f$a b = obj.b;
          c$a s = c.s;
          f$a$a uoa$a = new f$a$a(obj, obj2, obj);
          Objects.requireNonNull(s);
          obj2 = PatchProxy.applyFourRefs(p0, obj5, obj4, uoa$a, s, c$a.class, "1");
          if (obj2 != patchProxyRe) {
          }else {
             a.p(obj1, "activity");
             a.p(obj5, "videoUrl");
             a.p(obj4, "coverUrl");
             a.p(uoa$a, "listener");
             CoverVideoView uCoverVideoV = new CoverVideoView(obj5, obj4, p0, null, 8, null);
             t$a uoa = a.b(new t$a(obj1));
             a.o(uoa, "BottomDialogBuilderFacto¡­nStyle\(Builder\(activity\)\)");
             uoa.X0(a1.p(R.string.arg_RES_7f101cd8));
             uoa.z0(a1.p(R.string.arg_RES_7f101cd9));
             uoa.T0(a1.p(R.string.arg_RES_7f101cda));
             uoa.u0(a.b);
             uoa.s0(b.b);
             uoa.a0(new a(R.drawable.arg_RES_7f082541, 0x7f061ff3, a1.e(168.00f)));
             uoa.w0(true);
             uoa.z(true);
             uoa.M(uoa$a);
             obj2 = new c(uoa, patchProxyRe);
          }
          b.o = obj2;
          obj.b.o.Z();
          SharedPreferences$Editor uEditor = a.edit();
          uEditor.putBoolean("has_shown_lipsynch_guide", true);
          g.a(uEditor);
          return true;
       }
    }
}
