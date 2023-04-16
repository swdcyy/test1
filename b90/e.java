package b90.e;
import androidx.lifecycle.ViewModel;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.logic.c;
import b90.e$b;
import com.kuaishou.logic.c$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import crd.b;
import android.graphics.Bitmap;
import com.kwai.robust.PatchProxyResult;
import z80.c;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import java.util.Objects;
import c90.b;
import c90.c;
import z80.s;
import com.kwai.feature.post.api.mediascene.MediaSceneLaunchParams;
import java.lang.Boolean;
import com.kwai.feature.post.api.mediascene.MediaSceneConfig;
import java.util.List;
import b90.e$a;

public final class e extends ViewModel	// class@000af8
{
    public final MutableLiveData a;
    public final MutableLiveData b;
    public final MutableLiveData c;
    public int d;
    public int e;
    public e$a f;
    public b g;
    public Bitmap h;
    public final c i;
    public final BaseFragment j;

    public void e(BaseFragment p0){
       a.p(p0, "mFragment");
       super();
       this.j = p0;
       this.a = new MutableLiveData();
       this.b = new MutableLiveData();
       this.c = new MutableLiveData();
       this.i = new c(20.00f, new e$b(this), true);
    }
    public final void o0(){
       if (PatchProxy.applyVoid(null, this, e.class, "9")) {
          return;
       }
       e tg = this.g;
       if (tg != null && !tg.isDisposed()) {
          tg.dispose();
       }
       return;
    }
    public final Bitmap p0(){
       Bitmap uBitmap1;
       MediaSceneLaunchParams b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       c obj = PatchProxy.apply(objArray, this, e.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = c.j;
       Resources resources = this.j.getResources();
       a.o(resources, "mFragment.resources");
       Objects.requireNonNull(obj);
       Bitmap uBitmap = PatchProxy.applyOneRefs(resources, obj, c.class, "20");
       if (uBitmap != patchProxyRe) {
       }else {
          a.p(resources, "resources");
          c h = c.h;
          if (!h instanceof b) {
             uBitmap1 = h.a(resources);
          }else {
             s d = s.d;
             b = c.b;
             MediaSceneLaunchParams mTopColor = (b != null)? b.mTopColor: objArray;
             if (b != null) {
                objArray = b.mBottomColor;
             }
             uBitmap1 = d.e(resources, mTopColor, objArray);
          }
          uBitmap = uBitmap1;
       }
       return uBitmap;
    }
    public final MutableLiveData q0(){
       return this.a;
    }
    public final MutableLiveData r0(){
       return this.b;
    }
    public final MutableLiveData s0(){
       return this.c;
    }
    public final boolean t0(){
       c obj = PatchProxy.apply(null, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = c.j;
       MediaSceneConfig mediaSceneCo = obj.r();
       boolean b = (mediaSceneCo == null || (mediaSceneCo.getSceneType() == 100 || obj.u() != null))? true: false;
       return b;
    }
    public final void u0(){
       int i;
       int i1;
       e$a e;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e.class, "8")) {
          return;
       }
       if (this.f == null) {
          c j = c.j;
          MediaSceneLaunchParams mediaSceneLa = j.u();
          if (mediaSceneLa != null) {
             mediaSceneLa = mediaSceneLa.mLoadingTitles;
             if (mediaSceneLa != null) {
                i = mediaSceneLa.size();
             label_0023 :
                MediaSceneLaunchParams mediaSceneLa1 = j.u();
                if (mediaSceneLa1 != null) {
                   mediaSceneLa1 = mediaSceneLa1.mLoadingSubTitles;
                   if (mediaSceneLa1 != null) {
                      i1 = mediaSceneLa1.size();
                   label_0033 :
                      this.f = new e$a(this, i, i1);
                   }
                }
                i1 = 0;
                goto label_0033 ;
             }
          }
          i = 0;
          goto label_0023 ;
       }
       e tf = this.f;
       if (tf != null && (!PatchProxy.applyVoid(objArray, tf, e$a.class, "1") && tf.b == null)) {
          tf.b = true;
          e = tf.e;
          e.d = 0;
          e.e = 0;
          tf.run();
       }
    label_005a :
       return;
    }
}
