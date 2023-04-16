package b4d.n0$a;
import xk5.c;
import b4d.n0;
import java.lang.Object;
import bk5.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import wkd.b;
import x3d.f;
import yk5.f;
import a4d.s;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import android.view.View;
import com.kwai.emotionsdk.bean.EmotionInfo;
import java.lang.Integer;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditConfig;
import android.util.Pair;
import io.reactivex.subjects.PublishSubject;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$d;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import com.yxcorp.plugin.emotion.searchgif.SearchEmotionGifFragment;
import b4d.m0;
import c4d.e;
import com.yxcorp.plugin.emotion.searchgif.SearchEmotionGifFragment$c;
import b4d.l0;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import xk5.b;
import java.lang.Boolean;
import java.lang.Number;

public class n0$a implements c	// class@00037f
{
    public final n0 a;

    public void n0$a(n0 p0){
       this.a = p0;
       super();
    }
    public void a(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n0$a.class, "1")) {
          return;
       }
       if (p0.b != null) {
          this.a.q.add(p0);
       }
       b.a(-602662273).b(p0.a);
       return;
    }
    public void b(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n0$a.class, "7")) {
          return;
       }
       this.a.r.f(p0, "slid");
       String str = this.a.P8(p0.d());
       if (str != null) {
          n0 r = this.a.r;
          Objects.requireNonNull(r);
          if (!PatchProxy.applyVoidOneRefs(str, r, s.class, "5")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "EMOTION_TAB";
             i3 oi3 = i3.f();
             oi3.d("type", str);
             uElementPack.params = oi3.e();
             u1.u(1, uElementPack, null);
          }
       }
       return;
    }
    public void c(View p0,EmotionInfo p1,int p2){
       String this;
       if (PatchProxy.isSupport(n0$a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, n0$a.class, "2")) {
          return;
       }
       if (this.a.v.isEnableClickPreview()) {
          n0 u = this.a.u;
          if (u != null) {
             u.onNext(new Pair(p0, p1));
          }else if(this.a.s.Mh() != null){
             this.a.s.Mh().b(p1);
          }
       }else {
          goto label_0033 ;
       }
       this = this.a.P8(p2);
       if (this != null) {
          this.a.r.d(0, p1.mIndex, p1.mId, this, false);
       }
       return;
    }
    public void d(View p0,EmotionInfo p1,int p2){
       String this;
       if (PatchProxy.isSupport(n0$a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, n0$a.class, "3")) {
          return;
       }
       this = this.a.P8(p2);
       if (this != null) {
          this.a.r.d(0, p1.mIndex, p1.mId, this, true);
       }
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, n0$a.class, "4")) {
          return;
       }
       n0 r = this.a.r;
       Objects.requireNonNull(r);
       if (!PatchProxy.applyVoid(null, r, s.class, "7")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "EMOTION_ADD";
          u1.u(1, uElementPack, null);
       }
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, n0$a.class, "5")) {
          return;
       }
       SearchEmotionGifFragment searchEmotio = new SearchEmotionGifFragment();
       m0 om0 = new m0(this);
       if (!PatchProxy.applyVoidOneRefs(om0, searchEmotio, SearchEmotionGifFragment.class, "13")) {
          searchEmotio.E = new e(searchEmotio, om0);
       }
       searchEmotio.k0(new l0(this, searchEmotio));
       searchEmotio.show(this.a.s.getChildFragmentManager(), "searchGif");
       this.a.R8(false, false);
       n0 r = this.a.r;
       Objects.requireNonNull(r);
       if (!PatchProxy.applyVoid(null, r, s.class, "8")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "GIF_SEARCH_BUTTON";
          u1.u(1, uElementPack, null);
       }
       return;
    }
    public boolean g(c p0){
       return b.j(this, p0);
    }
    public void h(){
       b.a(this);
    }
    public void i(){
       b.i(this);
    }
    public void j(f p0,boolean p1){
       n0$a uoa = n0$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "6")) {
          return;
       }
       this.a.r.f(p0, "slid");
       String str = this.a.P8(p0.d());
       if (str != null) {
          n0 r = this.a.r;
          int i = 0;
          Objects.requireNonNull(r);
          s os = s.class;
          if (!PatchProxy.isSupport(os) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), str, r, os, "4")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "EMOTION_PANEL";
             i3 oi3 = i3.f();
             oi3.c("page_index", Integer.valueOf(i));
             oi3.d("type", str);
             uElementPack.params = oi3.e();
             u1.u0(1, uElementPack, null);
          }
       }
       return;
    }
}
