package com.kuaishou.nearby_poi.poi.comment.PoiCommentElement$d;
import erd.g;
import com.kuaishou.nearby_poi.poi.comment.PoiCommentElement;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.StringBuilder;
import tkd.b;
import tkd.d;
import xw5.c;
import android.content.Context;
import lr3.f;
import com.yxcorp.gifshow.entity.QPhoto;

public final class PoiCommentElement$d implements g	// class@000a19
{
    public final PoiCommentElement b;

    public void PoiCommentElement$d(PoiCommentElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PoiCommentElement$d.class, "1")) {
       }else {
          PoiCommentElement$d tb = this.b;
          a.o(p0, "index");
          int i = p0.intValue();
          Objects.requireNonNull(tb);
          PoiCommentElement poiCommentEl = PoiCommentElement.class;
          if (!PatchProxy.isSupport(poiCommentEl) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), tb, poiCommentEl, "6")) {
             StringBuilder str = "";
             PoiCommentElement v = tb.v;
             if (v == null) {
                a.S("mJumpUrl");
             }
             i = str+v+"&starPosition="+(i + 1);
             c uoc = d.a(0x1e777b83);
             PoiCommentElement w = tb.w;
             if (w == null) {
                a.S("mActivity");
             }
             uoc.gd(w, i);
             f.a("PoiCommentElement", i, "openCommentPanel");
             i = tb.A;
             if (i != null) {
                d.a(0x1e777b83).CI(i, 1);
             }
          }
       }
       return;
    }
}
