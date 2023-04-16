package com.yxcorp.gifshow.edit.previewer.loaderv2.u;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a;
import java.lang.Boolean;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cba.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.util.List;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.lang.StringBuilder;
import com.kwai.video.minecraft.model.nano.Minecraft$MagicTouchOverall;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.kuaishou.edit.draft.Scrawl;
import com.kuaishou.edit.draft.TimeRange;
import com.kwai.video.minecraft.model.nano.Minecraft$Range;
import com.kwai.video.minecraft.model.nano.Minecraft$MagicTouchPoint;
import com.kuaishou.edit.draft.Scrawl$Touch;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;

public class u extends a	// class@001b4d
{
    public a h;
    public Boolean i;

    public void u(){
       super();
       this.i = Boolean.FALSE;
    }
    public void c(a$a p0,Object[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, u.class, "1")) {
          return;
       }
       this.h = p0.a.R0();
       return;
    }
    public void d(){
       Boolean uBoolean = this;
       if (PatchProxy.applyVoid(null, uBoolean, u.class, "2")) {
          return;
       }
       List list = uBoolean.h.z();
       int i = 0;
       boolean b = (uBoolean.h.o().size() != list.size())? true: false;
       uBoolean.i = Boolean.valueOf(b);
       uBoolean.a("ScrawlLoaderV2 load mScrawlChanged:"+uBoolean.i);
       Minecraft$MagicTouchOverall[] magicTouchOv = new Minecraft$MagicTouchOverall[list.size()];
       int[] ointArray = new int[1];
       ointArray[i] = i;
       if (!q.f(list)) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             Scrawl scrawl = iterator.next();
             if (scrawl.hasRange() && scrawl.hasFeatureId()) {
                Minecraft$MagicTouchOverall magicTouchOv1 = new Minecraft$MagicTouchOverall();
                TimeRange range = scrawl.getRange();
                uBoolean.a("ScrawlLoaderV2 load start:"+range.getStart()+",duration:"+range.getDuration());
                Minecraft$Range range1 = new Minecraft$Range();
                List touchesList = scrawl.getTouchesList();
                Minecraft$MagicTouchPoint[] magicTouchPo = new Minecraft$MagicTouchPoint[touchesList.size()];
                int i1 = 0;
                while (i1 < touchesList.size()) {
                   Scrawl$Touch touch = touchesList.get(i1);
                   Minecraft$MagicTouchPoint magicTouchPo1 = new Minecraft$MagicTouchPoint();
                   Scrawl scrawl1 = scrawl;
                   magicTouchPo1.setTime(touch.getTimePoint());
                   magicTouchPo1.setTouchX(touch.getX());
                   magicTouchPo1.setTouchY(touch.getY());
                   if (!i1) {
                      magicTouchPo1.setTouchEvent(1);
                   }else {
                      i = touchesList.size() - 1;
                      if (i1 == i) {
                         magicTouchPo1.setTouchEvent(3);
                      }else {
                         magicTouchPo1.setTouchEvent(2);
                      }
                   }
                   magicTouchPo[i1] = magicTouchPo1;
                   i1 = i1 + 1;
                   scrawl = scrawl1;
                   double d = 0;
                }
                range1.setDuration(range.getDuration());
                range1.setStart(range.getStart());
                magicTouchOv1.setRange(range1);
                magicTouchOv1.setPoints(magicTouchPo);
                magicTouchOv1.setTouchFilter(scrawl.getSdkType());
                i = 0;
                magicTouchOv[ointArray[i]] = magicTouchOv1;
                int i2 = ointArray[i] + 1;
                ointArray[i] = i2;
             }
          }
       }
       uBoolean.b.setTouchData(magicTouchOv);
       return;
    }
    public int g(){
       return 1;
    }
}
