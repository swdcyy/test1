package com.yxcorp.gifshow.v3.editor.cover.q0$j;
import ppc.m;
import com.yxcorp.gifshow.v3.editor.cover.q0;
import java.lang.Object;
import brd.a0;
import ppc.l;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.lang.Boolean;
import java.lang.Integer;
import com.yxcorp.gifshow.v3.editor.text.model.EditTextBaseElementData;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import android.graphics.Bitmap;
import com.smile.gifmaker.mvps.utils.observable.ObservableSet;
import brd.t;
import com.smile.gifmaker.mvps.utils.DefaultObservable;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import gr8.c;
import brd.x;
import com.yxcorp.gifshow.v3.editor.cover.t0;
import erd.r;
import com.yxcorp.gifshow.v3.editor.cover.q0$e;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.v3.editor.text.element.EditTextBaseElement;
import rwc.j;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import android.widget.ImageView;
import voc.l;
import java.lang.Float;
import faa.a;
import q87.c;
import juc.b;
import juc.c;
import wba.h0;
import com.yxcorp.gifshow.edit.previewer.utils.StickerTextValueType;
import lnc.z2;
import lnc.o6;
import java.lang.StringBuilder;

public class q0$j implements m	// class@000ec4
{
    public float b;
    public final q0 c;

    public void q0$j(q0 p0){
       this.c = p0;
       super();
       this.b = 0x3f800000;
    }
    public double Pf(){
       return 0xbff0000000000000;
    }
    public a0 Sd(){
       return l.a(this);
    }
    public List V9(){
       ArrayList obj = PatchProxy.apply(null, this, q0$j.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       q0$j tc = this.c;
       if (tc.Y0 != null && tc.S.booleanValue()) {
          for (int i = 0; i < this.c.X0; i = i + 1) {
             int i1 = this.c.R.intValue() + i;
             obj.add(Integer.valueOf(i1));
          }
       }else {
          obj.add(this.c.R);
       }
       return obj;
    }
    public String Yf(){
       EditTextBaseElementData obj = PatchProxy.apply(null, this, q0$j.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c.S8();
       if (obj != null) {
          return obj.l();
       }
       return null;
    }
    public Bitmap getCover(){
       Object obj = this;
       Object[] objArray = null;
       q0$j obj1 = PatchProxy.apply(objArray, obj, q0$j.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (!obj.c.p.isEmpty()) {
          obj.c.p.observable().compose(c.c(obj.c.y.m(), FragmentEvent.DESTROY)).filter(t0.b).blockingFirst();
       }
       obj1 = obj.c;
       q0 a1 = obj1.a1;
       if (a1 != null) {
          objArray = a1.a;
       }
       EditTextBaseElement topElement = obj1.Y.getTopElement();
       j oj = new j(objArray);
       if (topElement != null && (objArray != null && !(topElement.getEditTextBaseElementData().B0()).isEmpty())) {
          float f = obj.c.P8(new Size(objArray.getWidth(), objArray.getHeight()), new Size(obj.c.t.getWidth(), obj.c.t.getHeight()));
          q0$j b = obj.b;
          if (!PatchProxy.isSupport(l.class) || !PatchProxy.applyVoidFourRefs(topElement, oj, Float.valueOf(f), Float.valueOf(b), null, l.class, "2")) {
             if (oj.getValue() == null) {
                objArray = new Object[0];
                a.D().w("EditCoverDrawAssetUtils", "drawElementTextToVideoBitmap realCoverBitmapRef is null", objArray);
             }else {
                EditTextBaseElementData editTextBase = topElement.getEditTextBaseElementData();
                float f1 = (((((float)oj.getValue().getWidth() / f) * editTextBase.A()) * editTextBase.m()) * editTextBase.d()) * b;
                float f2 = editTextBase.w();
                float f3 = editTextBase.x();
                float f4 = editTextBase.z();
                h0 oh0 = new h0(f2, f3, 0x3f800000, (f4 + editTextBase.q()), StickerTextValueType.EditElement, 0x3f800000, topElement.getInputScale(), topElement.getDecorationId());
                o6.b(oj, l.b(topElement.getEditPainter(), f1), v7);
                Object[] objArray1 = new Object[0];
                a.D().w("EditCoverDrawAssetUtils", "drawElementTextToPhotoBitmap editTextBaseElement:"+topElement+",scale:"+f1+",globalScale:"+b, objArray1);
             }
          }
       }
       return oj.getValue();
    }
    public String k8(){
       EditTextBaseElementData obj = PatchProxy.apply(null, this, q0$j.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c.S8();
       if (obj != null) {
          return obj.B0();
       }
       return null;
    }
}
