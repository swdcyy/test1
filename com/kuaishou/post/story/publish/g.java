package com.kuaishou.post.story.publish.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.post.api.feature.story.model.PostStoryParams;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import fq4.a;
import com.kwai.feature.post.api.feature.story.model.PostStoryParams$StoryCameraCallSource;
import rp4.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.kuaishou.post.story.widget.StoryHollowTextView;
import com.kuaishou.post.story.publish.a;
import android.view.View$OnClickListener;
import androidx.fragment.app.Fragment;
import im8.f;
import java.lang.Integer;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import uld.g;

public class g extends PresenterV2	// class@000b85
{
    public a A;
    public boolean B;
    public VideoSDKPlayerView p;
    public DecorationContainerView q;
    public Fragment r;
    public StoryHollowTextView s;
    public f t;
    public int u;
    public String v;
    public VideoContext w;
    public g x;
    public String y;
    public PostStoryParams z;

    public void g(){
       super();
       this.B = false;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       if (!TextUtils.x(this.z.getFinishBtnText())) {
          this.s.setText(this.z.getFinishBtnText());
       }
       if (this.A.m.getCameraCallSource() == PostStoryParams$StoryCameraCallSource.SOURCE_CLASS && !PatchProxy.applyVoid(null, null, c.class, "12")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "CARD_QUES_CONFIRM";
          u1.u0(6, uElementPack, null);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3120);
       this.q = m1.f(p0, 0x7f0a0a6c);
       this.s = m1.f(p0, 0x7f0a0c00);
       m1.a(p0, new a(this), R.id.done_btn);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.r = this.r8("FRAGMENT");
       this.t = this.x8("INTENT_STORY_TYPE");
       this.u = this.r8("INTENT_STORY_SOURCE").intValue();
       this.v = this.r8("task_id");
       this.w = this.r8("VIDEO_CONTEXT");
       this.x = this.r8("DECORATION_DRAWER_FILE_MANAGER");
       this.y = this.t8("ENCODE_PROFILE_KEY");
       this.z = this.r8("START_STORY_PARAMS");
       this.A = this.r8("STORY_EDIT_CONTEXT");
       return;
    }
}
