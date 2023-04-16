package com.yxcorp.gifshow.v3.editor.music_v2.ui.lyric.element.EditAELyricElement;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.lyric.element.EditLyricElementData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import java.lang.Number;
import android.widget.AbsoluteLayout$LayoutParams;
import android.graphics.RectF;
import android.content.Context;
import android.widget.AbsoluteLayout;
import android.view.ViewGroup$LayoutParams;
import android.os.Parcel;

public final class EditAELyricElement extends EditDecorationBaseDrawer	// class@0010da
{
    public final float DRAWER_MOVE_LIMIT_AREA_WIDTH;
    public final float SCALE;
    public final EditLyricElementData editLyricElementData;

    public void EditAELyricElement(EditLyricElementData p0){
       a.p(p0, "editLyricElementData");
       super(p0, p0.l(), p0.m0(), p0.j0(), p0.l0());
       this.editLyricElementData = p0;
       this.SCALE = 0x3f8ccccd;
       this.DRAWER_MOVE_LIMIT_AREA_WIDTH = 0x3a83126f;
    }
    public int describeContents(){
       return 0;
    }
    public final EditLyricElementData getEditLyricElementData(){
       return this.editLyricElementData;
    }
    public View initView(DecorationContainerView p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       BaseDrawer obj = PatchProxy.applyOneRefs(p0, this, EditAELyricElement.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "decorationContainerView");
       obj = this.mBaseDrawerData;
       Object[] objArray = null;
       Object obj1 = PatchProxy.apply(objArray, this, EditAELyricElement.class, "2");
       float f = (obj1 != patchProxyRe)? obj1.floatValue(): this.mBaseDrawerData.i() * this.SCALE;
       obj.P(f);
       obj = this.mBaseDrawerData;
       obj1 = PatchProxy.apply(objArray, this, EditAELyricElement.class, "3");
       float f1 = (obj1 != patchProxyRe)? obj1.floatValue(): this.mBaseDrawerData.f() * this.SCALE;
       obj.M(f1);
       this.mBaseDrawerData.L(0);
       this.mBaseDrawerData.b0(0x3f800000);
       EditAELyricElement tDRAWER_MOVE = this.DRAWER_MOVE_LIMIT_AREA_WIDTH;
       float f2 = - tDRAWER_MOVE;
       float f3 = - tDRAWER_MOVE;
       float f4 = - tDRAWER_MOVE;
       this.mBaseDrawerData.V(new RectF(f2, f3, f4, (- tDRAWER_MOVE)));
       View view = new View(p0.getContext());
       view.setLayoutParams(new AbsoluteLayout$LayoutParams((int)this.mBaseDrawerData.i(), (int)this.mBaseDrawerData.f(), 0, 0));
       this.mDecorationShowingView = view;
       return view;
    }
    public boolean isEnableSelectBox(){
       return false;
    }
    public void writeToParcel(Parcel p0,int p1){
    }
}
