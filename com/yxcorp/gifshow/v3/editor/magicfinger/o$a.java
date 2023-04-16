package com.yxcorp.gifshow.v3.editor.magicfinger.o$a;
import voc.y;
import com.yxcorp.gifshow.v3.editor.magicfinger.o;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import voc.x;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.kwai.video.editorsdk2.PreviewPlayer;
import com.yxcorp.gifshow.v3.editor.i;
import java.util.Objects;
import com.yxcorp.gifshow.widget.adv.model.f;
import java.util.Collection;
import ekd.q;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.minecraft.model.nano.Minecraft$MagicTouchOverall;
import ekd.j;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Scrawl$b;
import com.kuaishou.edit.draft.Scrawl;
import com.kuaishou.edit.draft.TimeRange;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.TimeRange$b;
import com.kwai.video.minecraft.model.nano.Minecraft$Range;
import com.kwai.video.minecraft.model.nano.Minecraft$MagicTouchPoint;
import com.kuaishou.edit.draft.Scrawl$Touch$a;
import com.kuaishou.edit.draft.Scrawl$Touch;
import com.kuaishou.edit.draft.FeatureId$b;
import com.kuaishou.edit.draft.FeatureId;
import java.lang.Integer;
import com.yxcorp.gifshow.v3.editor.magicfinger.model.MagicFingerItem;
import nrc.m;
import java.lang.Runnable;
import android.view.View;

public class o$a implements y	// class@00103d
{
    public final o b;

    public void o$a(o p0){
       this.b = p0;
       super();
    }
    public void Md(){
       if (PatchProxy.applyVoid(null, this, o$a.class, "3")) {
          return;
       }
       o$a tb = this.b;
       o s = tb.s;
       if (s != null && tb.V == null) {
          s.setVisibility(0);
       }
       return;
    }
    public void N0(){
       x.f(this);
    }
    public void O(){
       x.e(this);
    }
    public void c2(){
       x.d(this);
    }
    public void o4(){
       if (PatchProxy.applyVoid(null, this, o$a.class, "2")) {
          return;
       }
       o s = this.b.s;
       if (s != null) {
          s.setVisibility(8);
       }
       return;
    }
    public void onRestart(){
       x.i(this);
    }
    public void rd(){
       if (PatchProxy.applyVoid(null, this, o$a.class, "5")) {
          return;
       }
       o$a tb = this.b;
       if (tb.E == null) {
          return;
       }
       tb.X8(true, true);
       if (this.b.P8().getPlayer() != null) {
          this.b.P8().getPlayer().undoMagicTouch((this.b.P8().getPlayer().getTouchDataSize() - this.b.T));
       }
       this.b.E.c(false);
       return;
    }
    public void x9(){
       x.b(this);
    }
    public void yd(){
       int b2;
       Minecraft$MagicTouchOverall[] magicTouchOv1;
       Scrawl$b uob;
       FeatureId$b uob2;
       Object obj = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, o$a.class, "4")) {
          return;
       }
       o$a b = obj.b;
       if (b.E == null) {
          return;
       }
       boolean b1 = true;
       b.X8(b1, b1);
       if (obj.b.P8().getPlayer() != null) {
          b = obj.b;
          b.T = b.P8().getPlayer().getTouchDataSize();
       }
       obj.b.P8().storeMagicTouchDataToProject(b1);
       b = obj.b;
       Objects.requireNonNull(b);
       if (!PatchProxy.applyVoid(objArray, b, o.class, "24")) {
          if (b.E.i() != null && (q.f(b.E.i().g) || j.h(b.P8().getVideoProject().touchData().toNormalArray()))) {
             b2 = true;
             b.G.e(b2);
          label_019c :
             obj.b.E.c(b2);
             return;
          }else {
             b.G.c0();
             b2 = b.G.p();
             Minecraft$MagicTouchOverall[] magicTouchOv = b.P8().getVideoProject().touchData().toNormalArray();
             int i = 0;
             int i1 = 0;
             while (i < magicTouchOv.length) {
                object oobject = magicTouchOv[i];
                if (oobject == null) {
                   i1 = i1 + 1;
                   magicTouchOv1 = magicTouchOv;
                }else if(i < b.G.p()){
                   uob = b.G.n(i);
                }else {
                   uob = b.G.b();
                }
                uob.copyOnWrite();
                uob.instance.clearTouches();
                TimeRange$b uob1 = uob.instance.getRange().toBuilder();
                uob1.b(oobject.range().start());
                uob1.a(oobject.range().duration());
                Minecraft$MagicTouchPoint[] magicTouchPo = oobject.points().toNormalArray();
                int len = magicTouchPo.length;
                int i2 = 0;
                while (i2 < len) {
                   object oobject1 = magicTouchPo[i2];
                   Scrawl$Touch$a touch$a = Scrawl$Touch.newBuilder();
                   touch$a.copyOnWrite();
                   touch$a.instance.setTimePoint(oobject1.time());
                   touch$a.copyOnWrite();
                   touch$a.instance.setX(oobject1.touchX());
                   touch$a.copyOnWrite();
                   touch$a.instance.setY(oobject1.touchY());
                   uob.copyOnWrite();
                   uob.instance.addTouches(touch$a);
                   i2 = i2 + 1;
                   magicTouchOv = magicTouchOv;
                   uob2 = 1;
                }
                magicTouchOv1 = magicTouchOv;
                uob2 = FeatureId.newBuilder();
                uob2.c(MagicFingerItem.geFeatureIdFromTouchFilterId(oobject.touchFilter()).intValue());
                uob.copyOnWrite();
                uob.instance.setFeatureId(uob2);
                uob.copyOnWrite();
                uob.instance.setSdkType(oobject.touchFilter());
                uob.copyOnWrite();
                uob.instance.setRange(uob1);
                i = i + 1;
                magicTouchOv = magicTouchOv1;
                double d = Double.MIN_VALUE;
             }
             b2 = (b2 - magicTouchOv.length) + i1;
             for (int i3 = 0; i3 < b2; i3 = i3 + 1) {
                b.G.Y();
             }
             b.G.f();
          }
       }
       b2 = true;
       goto label_019c ;
    }
    public void z2(){
       if (PatchProxy.applyVoid(null, this, o$a.class, "1")) {
          return;
       }
       this.b.b9(true);
       this.b.w.postDelayed(new m(this), 500);
       return;
    }
}
