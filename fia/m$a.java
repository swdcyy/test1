package fia.m$a;
import d6a.a;
import fia.m;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import fv5.a;
import cia.w;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import gv5.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.feature.api.social.followSlide.model.FollowSlideRecoGuide;

public final class m$a extends a	// class@00291c
{
    public final m b;

    public void m$a(m p0){
       this.b = p0;
       super();
    }
    public void F1(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, m$a.class, "1")) {
          return;
       }
       a uoa = b.a(0x46e56f43);
       SlidePlayViewModel slidePlayVie = this.b.P8().O();
       int i = 0;
       int i1 = (slidePlayVie != null)? slidePlayVie.a0(): 0;
       if (i1 > 0) {
          m$a tb = this.b;
          SlidePlayViewModel slidePlayVie1 = tb.P8().O();
          QPhoto qPhoto = (slidePlayVie1 != null)? slidePlayVie1.n((i1 - 1)): objArray;
          if (tb.R8(qPhoto)) {
             slidePlayVie = this.b.P8().O();
             if (slidePlayVie != null && slidePlayVie.C() == true) {
                slidePlayVie = this.b.P8().O();
                if (slidePlayVie == null || slidePlayVie.I() != true) {
                   m$a tb1 = this.b;
                   SlidePlayViewModel slidePlayVie2 = tb1.P8().O();
                   if (slidePlayVie2 != null) {
                      objArray = slidePlayVie2.getCurrentPhoto();
                   }
                   Objects.requireNonNull(tb1);
                   a obj = PatchProxy.applyOneRefs(objArray, tb1, m.class, "7");
                   if (obj != PatchProxyResult.class) {
                      b = obj.booleanValue();
                   }else if(objArray != null){
                      QPhoto mEntity = objArray.mEntity;
                      if (mEntity != null) {
                         obj = a.a;
                         FollowSlideRecoGuide uFollowSlide = obj.a(mEntity);
                         if (uFollowSlide != null && uFollowSlide.mRecoGuideHasShowed == 1) {
                            FollowSlideRecoGuide uFollowSlide1 = obj.a(mEntity);
                            if (uFollowSlide1 != null && uFollowSlide1.mEnableAutoNext == 1) {
                               i = 1;
                            }
                         }
                      }
                   }
                   b = i;
                   if (!b) {
                   label_00b2 :
                      return;
                   }
                }
                uoa.f(2);
                goto label_00b2 ;
             }else {
                goto label_00b2 ;
             }
          }else {
             goto label_00b2 ;
          }
       }else {
          goto label_00b2 ;
       }
    }
}
