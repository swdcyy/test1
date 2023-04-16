package bq4.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import bq4.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.post.story.widget.StoryDecorationContainerView;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$d;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import android.graphics.Rect;
import rp4.a;
import q87.c;
import com.kuaishou.post.story.edit.model.StoryTextDrawer;
import java.lang.CharSequence;
import android.widget.EditText;
import dq4.f;
import com.kuaishou.post.story.widget.StoryEditText;
import android.view.ViewTreeObserver;
import bq4.a$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.widget.FrameLayout;
import java.lang.StringBuilder;
import android.text.Editable;
import androidx.appcompat.widget.AppCompatEditText;
import qq4.e;
import android.graphics.RectF;
import java.lang.Math;
import ekd.b0;
import com.yxcorp.gifshow.decoration.drawer.DecorationDrawer;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import uld.g;
import java.lang.Integer;
import java.lang.Boolean;

public class a extends PresenterV2	// class@0003b5
{
    public StoryDecorationContainerView p;
    public VideoSDKPlayerView q;
    public g r;
    public DecorationDrawer s;
    public int t;
    public StoryEditText u;
    public FrameLayout v;
    public boolean w;
    public boolean x;
    public boolean y;
    public DecorationContainerView$e z;

    public void a(){
       super();
       this.w = false;
       this.x = true;
       this.y = false;
       this.z = new a$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       boolean b = true;
       this.p.setEnableDecorationView(b);
       this.p.setEnableAutoUnSelect(b);
       this.p.d(this.z);
       a ts = this.s;
       a uoa = 8;
       if (ts != null) {
          ts.enableAction(0x101111);
          boolean b1 = false;
          this.w = b1;
          if (this.y != null) {
             if (this.p.getEditorRect().width() >= 0 && this.p.getEditorRect().height() >= 0) {
                Object[] objArray = new Object[b1];
                a.D().w("StoryDecorationContainerViewPresenter", "onBind DecorationEditView pre layout", objArray);
                this.w = b;
             }
             this.x = b1;
             a ts1 = this.s;
             this.u.setText(ts1.mText);
             this.u.setGravity(f.a(ts1.getAlignment(), ts1.getTextMode()));
             this.u.setTextMode(ts1.getTextMode());
             this.u.getViewTreeObserver().addOnGlobalLayoutListener(new a$b(this));
          }else {
             this.v.setVisibility(uoa);
          }
          Object[] objArray1 = new Object[b1];
          a.D().w("StoryDecorationContainerViewPresenter", "onBind mIsDefaultDrawerNotPreview:"+this.y, objArray1);
       }else {
          ts = this.v;
          if (ts != null) {
             ts.setVisibility(uoa);
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       this.p.M(this.z);
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("StoryDecorationContainerViewPresenter", "initNotPreviewDrawer", objArray);
       a ts = this.s;
       this.u.a();
       ts.mText = this.u.getText();
       ts.setCustomMaxLine(this.u.getLineCount());
       ts.mContentRect = this.u.getBackgroundSpan().e();
       ts.mStoryEditTextWidth = (float)this.u.getWidth();
       StoryTextDrawer mContentRect = ts.mContentRect;
       ts.mStoryEditTextHeight = Math.max((float)this.u.getHeight(), (mContentRect.top + mContentRect.height()));
       ts.setDimension(new b0((int)ts.mContentRect.width(), (int)ts.mContentRect.height()));
       ts.setNeedReGenerateFile(true);
       this.R8();
       Object[] objArray1 = new Object[0];
       a.D().w("StoryDecorationContainerViewPresenter", "initNotPreviewDrawer:"+this.u.getBackgroundSpan().e(), objArray1);
       return;
    }
    public void R8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "5")) {
          return;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       String str = "StoryDecorationContainerViewPresenter";
       a.D().w(str, "initPreviewDrawer", objArray1);
       a ts = this.s;
       if (ts == null) {
          objArray = new Object[i];
          a.D().w(str, "initPreviewDrawer null return", objArray);
          return;
       }else if(ts.isEnableAddingAnimation()){
          this.p.R();
          this.s.addSelectWithAnimation(this.p);
       }else {
          this.p.Y(this.s, i, objArray, true);
          this.p.c0(this.s);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0a6c);
       this.q = m1.f(p0, 0x7f0a3120);
       this.u = m1.f(p0, 0x7f0a0a7c);
       this.v = m1.f(p0, 0x7f0a0a7d);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.r = this.r8("DECORATION_DRAWER_FILE_MANAGER");
       this.s = this.t8("DEFAULT_DECORATION_DRAWER");
       this.t = this.r8("INTENT_STORY_SOURCE").intValue();
       this.y = this.r8("IS_DEFAULT_DRAWER_NOT_PREVIEW").booleanValue();
       return;
    }
}
