package com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.AtlasOrSinglePictureSubViewBinder$b;
import android.view.View$OnTouchListener;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.AtlasOrSinglePictureSubViewBinder;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import android.widget.AbsoluteLayout;
import android.graphics.Rect;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;

public final class AtlasOrSinglePictureSubViewBinder$b implements View$OnTouchListener	// class@000b37
{
    public final AtlasOrSinglePictureSubViewBinder b;

    public void AtlasOrSinglePictureSubViewBinder$b(AtlasOrSinglePictureSubViewBinder p0){
       this.b = p0;
       super();
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, AtlasOrSinglePictureSubViewBinder$b.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       a.o(p1, "event");
       if (!p1.getAction()) {
          int[] ointArray = new int[2];
          this.b.h.getLocationOnScreen(ointArray);
          if (!new Rect(ointArray[0], ointArray[1], (ointArray[0] + this.b.h.getWidth()), (ointArray[1] + this.b.h.getHeight())).contains((int)p1.getRawX(), (int)p1.getRawY())) {
             this.b.h.Q0(p1);
          }
       }
       return 0;
    }
}
