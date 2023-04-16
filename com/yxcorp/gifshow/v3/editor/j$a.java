package com.yxcorp.gifshow.v3.editor.j$a;
import com.yxcorp.gifshow.v3.editor.i;
import com.yxcorp.gifshow.v3.editor.j;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.EditorDelegate$ShowLoggerType;
import k2b.s$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.editor.BaseEditor;
import uwc.b;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.f;
import java.lang.RuntimeException;
import java.lang.Boolean;
import voc.o;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import gka.g;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.yxcorp.gifshow.widget.adv.model.f;
import lwc.f;
import lwc.h;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.Fragment;

public class j$a implements i	// class@000fb6
{
    public final j a;

    public void j$a(j p0){
       this.a = p0;
       super();
    }
    public s$b a(EditorDelegate$ShowLoggerType p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j$a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.i().a(p0);
    }
    public b b(){
       Object obj = PatchProxy.apply(null, this, j$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (f.E(this.a.i().getType())) {
          return f.k(this.a.i());
       }
       throw new RuntimeException("video not support this method getEditPicturesViewModel");
    }
    public void c(boolean p0){
       j$a ta;
       j$a uoa = j$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "6")) {
          return;
       }
       if (!p0) {
          if (f.E(this.a.d.getType())) {
             ta = this.a;
             ta.Q(ta.d.x(), this.b());
          }else {
             ta = this.a;
             ta.R(ta.d.x(), f.n(this.a.d));
          }
          BaseEditor e = this.a.e;
          if (e != null) {
             e.d();
          }
       }else {
          ta = this.a;
          f.a(ta.p, ta.r);
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, j$a.class, "1")) {
          return;
       }
       j$a ta = this.a;
       ta.q = ta.r.b(ta);
       return;
    }
    public EditorSdk2V2$VideoEditorProject e(){
       Object obj = PatchProxy.apply(null, this, j$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!f.E(this.a.i().getType())) {
          return this.a.p;
       }
       throw new RuntimeException("pictures not support this method getVideoEditProject");
    }
    public EditorDelegate f(){
       Object obj = PatchProxy.apply(null, this, j$a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.i();
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, j$a.class, "7")) {
          return;
       }
       BaseEditor e = this.a.e;
       if (e != null) {
          e.d();
       }
       return;
    }
    public f h(){
       return this.a.q;
    }
    public f i(){
       return this.a.r;
    }
    public VideoSDKPlayerView j(){
       Object obj = PatchProxy.apply(null, this, j$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!f.E(this.a.i().getType())) {
          return f.n(this.a.d);
       }
       throw new RuntimeException("pictures not support this method getVideoSDKPlayerView");
    }
    public EditorSdk2V2$VideoEditorProject k(){
       Object obj = PatchProxy.apply(null, this, j$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!f.E(this.a.i().getType())) {
          return this.a.o;
       }
       throw new RuntimeException("pictures not support this method getOriginVideoEditProject");
    }
    public h l(){
       Object obj = PatchProxy.apply(null, this, j$a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return f.l(this.f().q());
    }
}
