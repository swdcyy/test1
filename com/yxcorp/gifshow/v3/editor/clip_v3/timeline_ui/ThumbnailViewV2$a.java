package com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.ThumbnailViewV2$a;
import com.yxcorp.gifshow.widget.trimvideo.LinearBitmapContainer$b;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.ThumbnailViewV2;
import android.graphics.Bitmap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import fpc.a;
import java.lang.Math;
import com.yxcorp.gifshow.v3.editor.k;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.ThumbnailViewV2$a$a;
import p16.c;
import java.lang.Number;

public final class ThumbnailViewV2$a extends LinearBitmapContainer$b	// class@000dcd
{
    public final ThumbnailViewV2 d;

    public void ThumbnailViewV2$a(ThumbnailViewV2 p0){
       this.d = p0;
       super();
    }
    public Bitmap d(int p0,int p1,int p2){
       ThumbnailViewV2$a obj;
       if (PatchProxy.isSupport(ThumbnailViewV2$a.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, ThumbnailViewV2$a.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       ThumbnailViewV2$a td = this.d;
       double d = Math.min(((double)((float)p0 + 0x3f000000) / (double)td.e), (ThumbnailViewV2.a(td).a() - 0x3fb999999999999a));
       if (d - (double)0 < 0) {
          d = 0;
       }
       ThumbnailViewV2$a td1 = this.d;
       if (ThumbnailViewV2.a(this.d).k() - td1.d >= 0) {
          td1 = this.d;
          d = d + (ThumbnailViewV2.a(td1).c() + td1.d);
          if ((ThumbnailViewV2.a(td1).c() + ThumbnailViewV2.a(this.d).k()) - d < 0) {
             d = (ThumbnailViewV2.a(this.d).c() + ThumbnailViewV2.a(this.d).k()) - this.d.d;
          }
       }
       obj = this.d;
       return k.f().d(obj.g, d, obj.l, obj.m, new ThumbnailViewV2$a$a(this, p0));
    }
    public int getCount(){
       Object obj = PatchProxy.apply(null, this, ThumbnailViewV2$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (int)Math.ceil((ThumbnailViewV2.a(this.d).k() * (double)this.d.e));
    }
}
