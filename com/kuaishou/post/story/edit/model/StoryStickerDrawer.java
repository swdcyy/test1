package com.kuaishou.post.story.edit.model.StoryStickerDrawer;
import com.yxcorp.gifshow.decoration.drawer.DecorationDrawer;
import com.kuaishou.post.story.edit.data.StoryStickerDrawerData;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.kuaishou.post.story.edit.model.a;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import rp4.c;
import ekd.b0;

public abstract class StoryStickerDrawer extends DecorationDrawer	// class@000b22
{

    public void StoryStickerDrawer(StoryStickerDrawerData p0){
       super(p0);
    }
    public void StoryStickerDrawer(StoryStickerDrawerData p0,int p1){
       super(p0);
       this.mBaseDrawerData.T(0);
       p0.w = p1;
       this.setAnimationListener(a.a);
    }
    public int getStickerType(){
       Object obj = PatchProxy.apply(null, this, StoryStickerDrawer.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mBaseDrawerData.e0();
    }
    public void onDecorationRemoved(){
       if (PatchProxy.applyVoid(null, this, StoryStickerDrawer.class, "2")) {
          return;
       }
       c.b(404, "drop_sticker");
       return;
    }
    public void onDecorationScaleAndRotate(){
       if (PatchProxy.applyVoid(null, this, StoryStickerDrawer.class, "3")) {
          return;
       }
       c.b(404, "scale_sticker");
       return;
    }
    public void setDimension(b0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StoryStickerDrawer.class, "4")) {
          return;
       }
       this.mBaseDrawerData.P((float)p0.a);
       this.mBaseDrawerData.M((float)p0.b);
       return;
    }
}
