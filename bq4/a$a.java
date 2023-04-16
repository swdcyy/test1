package bq4.a$a;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$e;
import bq4.a;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import java.lang.Object;
import com.yxcorp.gifshow.decoration.drawer.DecorationDrawer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uld.g;
import rp4.a;
import java.lang.StringBuilder;
import q87.c;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;

public class a$a extends DecorationContainerView$e	// class@0003b3
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void d(BaseDrawer p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a.class, "2")) {
       }else {
          super.d(p0, p1);
          this.a.r.f(p0);
       }
       return;
    }
    public void g(){
       Object[] objArray;
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       super.g();
       a$a ta = this.a;
       int i = 0;
       boolean b = true;
       if (ta.w != null || ta.s == null) {
          ta.w = b;
          objArray = new Object[i];
          a.D().w("StoryDecorationContainerViewPresenter", "onEditRectInitialized return mIsDefaultDrawerNotPreview:"+this.a.y+",mDefaultDecorationDrawer:"+this.a.s, objArray);
          return;
       }else {
          objArray = new Object[i];
          a.D().w("StoryDecorationContainerViewPresenter", "onEditRectInitialized mIsDefaultDrawerNotPreview:"+this.a.y+",mIsStoryEditTextInitialized:"+this.a.x, objArray);
          ta = this.a;
          if (ta.y != null) {
             if (ta.x != null) {
                ta.P8();
                this.a.v.setVisibility(8);
             }
          }else {
             ta.R8();
             this.a.v.setVisibility(8);
          }
          this.a.w = b;
          return;
       }
    }
    public void l(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "3")) {
       }else {
          super.l(p0);
          Object[] objArray = new Object[0];
          a.D().w("StoryDecorationContainerViewPresenter", "onUnSelect |||||||||| DecorationDrawerFileManager decorationDrawer:"+p0+",isNeedReGenerateFile:"+p0.isNeedReGenerateFile(), objArray);
          if (p0.isNeedReGenerateFile()) {
             a$a ta = this.a;
             if (ta.t == 2) {
                p0.generateDecorationBitmap(null, null);
             }else {
                p0.generateDecorationBitmap(ta.p, ta.q);
             }
             this.a.r.a(p0);
             p0.setNeedReGenerateFile(0);
          }
       }
       return;
    }
}
