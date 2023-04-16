package com.yxcorp.gifshow.v3.editor.cover.s$c;
import voc.y;
import com.yxcorp.gifshow.v3.editor.cover.s;
import java.lang.Object;
import voc.x;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ppc.v;
import java.lang.Runnable;
import android.widget.AbsoluteLayout;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import qaa.a;
import haa.a;
import hba.a;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Text;
import com.kuaishou.edit.draft.StickerResult;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.yxcorp.gifshow.v3.editor.cover.CoverEditorFragment;
import ppc.k;
import java.lang.Boolean;
import java.util.List;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import oa0.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;
import faa.a;
import q87.c;
import java.util.Objects;
import qr4.i;
import qr4.e$h;
import qr4.e$e;

public class s$c implements y	// class@000ed1
{
    public final s b;

    public void s$c(s p0){
       this.b = p0;
       super();
    }
    public void Md(){
       x.g(this);
    }
    public void N0(){
       if (PatchProxy.applyVoid(null, this, s$c.class, "1")) {
          return;
       }
       this.b.F.post(new v(this));
       return;
    }
    public void O(){
       x.e(this);
    }
    public void c2(){
       x.d(this);
    }
    public void o4(){
       x.h(this);
    }
    public void onRestart(){
       x.i(this);
    }
    public void rd(){
       x.a(this);
    }
    public void x9(){
       x.b(this);
    }
    public void yd(){
       e$h k;
       Text text;
       boolean b;
       SharedPreferences a;
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, s$c.class, "2")) {
          return;
       }
       a uoa = a.f(obj.b.v).f0();
       boolean i = 0;
       if (uoa == null || uoa.v() == null) {
          Object[] objArray1 = new Object[i];
          a.D().w("CoverTextPresenter", "saveCoverPhotoMeta: no cover text", objArray1);
          VideoContext videoContext = obj.b.v.d1();
          Objects.requireNonNull(videoContext);
          if (PatchProxy.apply(objArray, videoContext, VideoContext.class, "67") != patchProxyRe) {
          }else {
             VideoContext.b();
             i d = videoContext.a.d;
             if (d != null) {
                k = d.k;
                if (k != null) {
                   k.b = "";
                   k.c = "";
                   k.e = i;
                   k.g = 0;
                   k.h = 0;
                   k.i = 0;
                   k.j = 0;
                   k.l = "";
                   k.m = "";
                   k.n = "";
                   k.f = "";
                }
             }
          }
          return;
       }else {
          text = uoa.v();
          StickerResult result = text.getResult();
          VideoContext videoContext1 = obj.b.v.d1();
          String text1 = text.getText();
          String str = obj.b.D.Yf();
          s f = obj.b.F;
          SharedPreferences$Editor obj1 = PatchProxy.applyOneRefs(f, objArray, k.class, "3");
          if (obj1 != patchProxyRe) {
             i = obj1.booleanValue();
          }else {
             List decorationDr = f.getDecorationDrawerList();
             if (q.f(decorationDr)) {
                b = false;
             label_0072 :
                videoContext1.F0(text1, str, b, (result.getCenterX() * 100.00f), (result.getCenterY() * 100.00f), result.getRotate(), result.getScale(), text.getTimeText(), text.getAuthorText(), text.getLocationText(), text.getContentFontName());
                a = a.a;
                obj1 = a.edit();
                obj1.putString("cover_bubble_outer_sequence", b.e(obj.b.W));
                g.a(obj1);
                obj1 = a.edit();
                obj1.putString("cover_bubble_sequence_v2", b.e(obj.b.X));
                g.a(obj1);
                SharedPreferences$Editor uEditor = a.edit();
                uEditor.putString("cover_text_used_list", b.e(obj.b.Y));
                g.a(uEditor);
                return;
             }else {
                i = decorationDr.get(i).isInSafeArea();
             }
          }
          b = i;
          goto label_0072 ;
       }
    }
    public void z2(){
       x.c(this);
    }
}
