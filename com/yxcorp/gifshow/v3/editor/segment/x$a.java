package com.yxcorp.gifshow.v3.editor.segment.x$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.v3.editor.segment.x;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.segment.model.SingleSegmentInfo;
import com.kuaishou.edit.draft.Asset;
import com.kuaishou.edit.draft.Asset$PositionType;
import e17.i;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.v3.editor.segment.l$a;

public class x$a extends m	// class@0011f7
{
    public final x c;

    public void x$a(x p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x$a.class, "1")) {
          return;
       }
       if (this.c.w.isSelected() && !this.c.w.isEditable()) {
          int i = 0x7f11066a;
          if (this.c.w.getAsset().getPositionType() == Asset$PositionType.OPENING) {
             i.a(i, R.string.arg_RES_7f1045fc);
          }else if(this.c.w.getAsset().getPositionType() == Asset$PositionType.ENDING){
             i.a(i, R.string.arg_RES_7f1045fb);
          }
          Object[] objArray = new Object[0];
          a.D().w("SegmentItemPresenter", "current item is selected, skip", objArray);
          return;
       }else {
          x$a tc = this.c;
          tc.x.a(tc.w);
          return;
       }
    }
}
