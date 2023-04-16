package com.yxcorp.gifshow.v3.editor.sticker.y0;
import com.yxcorp.gifshow.v3.editor.sticker.j0;
import java.util.concurrent.atomic.AtomicInteger;
import com.yxcorp.gifshow.v3.editor.sticker.y0$a;
import com.yxcorp.gifshow.v3.editor.sticker.y0$b;
import zpc.j;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.sticker.e;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView$b;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.decoration.widget.f$a;
import com.yxcorp.gifshow.v3.editor.sticker.v0;
import com.yxcorp.gifshow.decoration.widget.f$b;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import aw9.z;
import java.lang.Integer;
import im8.f;
import java.util.Set;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import androidx.fragment.app.Fragment;
import lwc.h;
import com.yxcorp.gifshow.v3.f;
import com.yxcorp.gifshow.v3.editor.sticker.w0;
import com.yxcorp.gifshow.v3.editor.sticker.x0;
import erd.g;
import crd.b;
import brd.t;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import com.yxcorp.gifshow.widget.adv.model.a;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import io.reactivex.subjects.PublishSubject;

public class y0 extends j0	// class@0012f1
{
    public EditDecorationContainerView$b U0;
    public y V0;
    public f W;
    public PublishSubject X;
    public AtomicInteger Y;
    public j Z;

    public void y0(){
       super();
       this.Y = new AtomicInteger(Integer.MIN_VALUE);
       this.U0 = new y0$a(this);
       this.V0 = new y0$b(this);
       j oj = new j();
       this.Z = oj;
       this.U7(oj);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, y0.class, "2")) {
          return;
       }
       super.E8();
       this.Z.G = this.D;
       this.G.setDelegate(this.U0);
       e tG = this.G;
       f$a uoa = new f$a();
       uoa.b(false);
       uoa.a(false);
       tG.X(uoa, tG.a);
       this.W.set(Integer.valueOf((int)this.C.g()));
       this.r.add(this.V0);
       this.X7(this.X.subscribe(new w0(this, f.l(this.D.q())), x0.b));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, y0.class, "4")) {
          return;
       }
       super.J8();
       this.r.remove(this.V0);
       return;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, y0.class, "3")) {
          return;
       }
       this.C.h();
       return;
    }
    public double Y8(double p0){
       return 0;
    }
    public a e9(StickerDetailInfo p0,EditorSdk2V2$AnimatedSubAsset p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, y0.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.V8(p0, p1, this.C.g());
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, y0.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(y0.class, null);
       return objectsByTag;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, y0.class, "1")) {
          return;
       }
       super.j8();
       this.W = this.x8("CURRENT_PROGRESS");
       this.X = this.r8("ADJUST_DECORATION_VIEW_SIZE_PUBLISHER");
       return;
    }
}
