package com.yxcorp.gifshow.v3.editor.sticker.drawer.EditOriginFileImageViewDrawer;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditOriginFileDrawer;
import ptc.a;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.widget.AbsoluteLayout$LayoutParams;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.v3.editor.sticker.model.EditStickerBaseDrawerData;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import android.widget.AbsoluteLayout;
import java.io.File;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;

public class EditOriginFileImageViewDrawer extends EditOriginFileDrawer	// class@001222
{
    public KwaiImageView c;

    public void EditOriginFileImageViewDrawer(){
       super();
    }
    public void EditOriginFileImageViewDrawer(double p0,double p1,int p2,a p3,float p4,float p5,float p6){
       super(p0, p1, p2, p3, p4, p5, p6);
    }
    public View initView(DecorationContainerView p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EditOriginFileImageViewDrawer.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       KwaiImageView kwaiImageVie = new KwaiImageView(p0.getContext());
       this.c = kwaiImageVie;
       kwaiImageVie.v(new File(this.mBaseDrawerData.k()), (int)this.mBaseDrawerData.i(), (int)this.mBaseDrawerData.f());
       this.c.setLayoutParams(new AbsoluteLayout$LayoutParams((int)this.mBaseDrawerData.i(), (int)this.mBaseDrawerData.f(), 0, 0));
       return this.c;
    }
    public void replace(DecorationContainerView p0,a p1,StickerDetailInfo p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, EditOriginFileImageViewDrawer.class, "2")) {
          return;
       }
       super.replace(p0, p1, p2);
       EditOriginFileImageViewDrawer tc = this.c;
       if (tc == null) {
          View view = this.initView(p0);
          this.mDecorationShowingView = view;
          p0.addView(view);
       }else {
          tc.v(new File(this.mBaseDrawerData.k()), (int)this.mBaseDrawerData.i(), (int)this.mBaseDrawerData.f());
          this.c.invalidate();
       }
       return;
    }
}
