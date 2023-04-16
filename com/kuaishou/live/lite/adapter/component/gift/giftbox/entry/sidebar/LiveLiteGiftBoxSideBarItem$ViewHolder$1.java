package com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.sidebar.LiveLiteGiftBoxSideBarItem$ViewHolder$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.sidebar.LiveLiteGiftBoxSideBarItem$ViewHolder;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.widget.selector.view.SelectShapeView;
import java.util.Objects;
import q73.b;
import d61.k;
import bld.b;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public final class LiveLiteGiftBoxSideBarItem$ViewHolder$1 extends Lambda implements a	// class@001dca
{
    public final LiveLiteGiftBoxSideBarItem$ViewHolder this$0;

    public void LiveLiteGiftBoxSideBarItem$ViewHolder$1(LiveLiteGiftBoxSideBarItem$ViewHolder p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       LiveLiteGiftBoxSideBarItem$ViewHolder i;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveLiteGiftBoxSideBarItem$ViewHolder$1.class, "1")) {
          return;
       }
       SelectShapeView selectShapeV = this.this$0.c();
       if (selectShapeV != null) {
          LiveLiteGiftBoxSideBarItem$ViewHolder$1 tthis$0 = this.this$0;
          Objects.requireNonNull(tthis$0);
          if (!PatchProxy.applyVoidOneRefs(selectShapeV, tthis$0, LiveLiteGiftBoxSideBarItem$ViewHolder.class, "5")) {
             if (tthis$0.j != null) {
                i = tthis$0.i;
                if (i != null) {
                   objArray = i.bottomBackgroundColor;
                }
             }else {
                i = tthis$0.i;
                if (i != null) {
                   objArray = i.backgroundColor;
                }
             }
             b uob = new b();
             uob.g(KwaiRadiusStyles.FULL);
             uob.v(k.c(objArray, 0));
             selectShapeV.setBackground(uob.a());
          }
       }
       return;
    }
}
