package eja.b$c;
import android.view.View$OnAttachStateChangeListener;
import eja.b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.android.model.mix.CoverCommonTagsModel;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel;
import java.util.Map;
import java.lang.Double;
import android.view.ViewStub;
import ga5.d;
import com.yxcorp.gifshow.entity.QPhoto;
import aja.c;

public final class b$c implements View$OnAttachStateChangeListener	// class@0026b3
{
    public final b b;

    public void b$c(b p0){
       this.b = p0;
       super();
    }
    public void onViewAttachedToWindow(View p0){
       boolean b;
       int i;
       int i1;
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "1")) {
          return;
       }
       if (b.P8(this.b).mInteractionTagShowed != null) {
          return;
       }
       b = true;
       p0.mInteractionTagShowed = b;
       try{
          i = 0;
          CommonMeta mCoverCommon = b.P8(this.b).mCoverCommonTags;
          if (mCoverCommon != null) {
             CoverCommonTagsModel mAuthorRight = mCoverCommon.mAuthorRightSideTag;
             if (mAuthorRight != null) {
                CoverCommonTagLabelModel extParams = mAuthorRight.extParams;
                if (extParams != null) {
                   String obj = extParams.get("tag_show_type");
                   if (obj != null) {
                      obj = obj.toString();
                      if (obj != null) {
                         i1 = (int)Double.parseDouble(obj);
                      }
                   }
                }
             }
          }
          i1 = 0;
       }catch(java.lang.Exception e0){
       }
       b$c tb = this.b;
       if (tb.B == null) {
          b a = tb.A;
          if (a != null) {
             View view = d.a(a);
             if (view != null && (!view.getVisibility() && i1 > 0)) {
                c.a(b.R8(this.b), i, i1);
             }
          }
       }else {
          c.a(b.R8(tb), e0, i);
       }
       return;
    }
    public void onViewDetachedFromWindow(View p0){
    }
}
