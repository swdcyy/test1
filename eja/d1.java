package eja.d1;
import aua.j;
import com.kwai.component.feedstaggercard.model.CardStyle;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.android.model.mix.CoverCommonTagsModel;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel;

public final class d1 extends j	// class@0026bb
{

    public void d1(CardStyle p0){
       a.p(p0, "style");
       super(p0);
    }
    public void E8(){
       Object[] objArray1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d1.class, "1")) {
          return;
       }
       this.W8();
       j tt = this.t;
       if (tt != null) {
          CommonMeta mCoverCommon = tt.mCoverCommonTags;
          if (mCoverCommon != null) {
             CoverCommonTagsModel mAuthorRight = mCoverCommon.mAuthorRightSideTag;
          label_001b :
             this.S8(mAuthorRight);
             tt = this.t;
             if (tt != null) {
                mCoverCommon = tt.mCoverCommonTags;
                if (mCoverCommon != null) {
                   mAuthorRight = mCoverCommon.mAuthorRelationBigHeadTag;
                label_002a :
                   this.R8(mAuthorRight);
                   tt = this.t;
                   if (tt != null) {
                      mCoverCommon = tt.mCoverCommonTags;
                      if (mCoverCommon != null) {
                         objArray = mCoverCommon.mRightBottomTag;
                      }
                   }
                   this.V8(objArray);
                   return;
                }
             }
             objArray1 = objArray;
             goto label_002a ;
          }
       }
       objArray1 = objArray;
       goto label_001b ;
    }
    public void W8(){
       if (PatchProxy.applyVoid(null, this, d1.class, "2")) {
          return;
       }
       this.x = false;
       return;
    }
}
