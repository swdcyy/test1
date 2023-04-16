package com.yxcorp.gifshow.activity.share.presenter.a2;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f66.i;
import jq.a;
import q87.c;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.share.topic.ShareTopicGuideFragment;
import android.os.Bundle;
import xw8.p0;
import com.yxcorp.gifshow.widget.KSTextDisplayHandler;
import com.yxcorp.gifshow.widget.EmojiEditText;
import java.util.ArrayList;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.util.List;
import com.yxcorp.gifshow.activity.share.topic.ShareTopicExtra;
import com.kwai.robust.PatchProxyResult;
import h69.j;
import tkd.b;
import tkd.d;
import l26.e;
import l26.f;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.kuaishou.android.post.topic.model.TopicItem;
import com.yxcorp.gifshow.model.topic.TopicItemType;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import androidx.fragment.app.e;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import com.trello.rxlifecycle3.android.ActivityEvent;
import gr8.b;
import gr8.c;
import brd.x;
import zw8.g4;
import com.yxcorp.gifshow.activity.share.presenter.z1;
import erd.g;
import crd.b;
import zw8.f4;
import com.yxcorp.gifshow.activity.share.presenter.a2$a;
import android.widget.TextView;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;

public class a2 extends PresenterV2	// class@0013be
{
    public TextView A;
    public KwaiLoadingView B;
    public GifshowActivity p;
    public p0 q;
    public String r;
    public String s;
    public c t;
    public QPhoto u;
    public VideoContext v;
    public String w;
    public EmojiEditText x;
    public ShareTopicGuideFragment y;
    public View z;

    public void a2(){
       super();
    }
    public void E8(){
       p0 c;
       a2 uoa2 = a2.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa2, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa2, "5")) {
          Object[] objArray1 = new Object[0];
          a.b().w("ShareTopicGuidePresenter", "initFragment", objArray1);
          Fragment uFragment = this.p.getSupportFragmentManager().findFragmentByTag("ShareTopicGuidePresenter");
          if (uFragment != null) {
             this.y = uFragment;
          }
          if (this.y != null) {
             this.P8();
          }else {
             this.y = new ShareTopicGuideFragment();
             this.P8();
             Bundle uBundle = new Bundle();
             uBundle.putString("photo_task_id", this.r);
             uBundle.putString("editSessionId", this.s);
             uBundle.putString("from_page", this.w);
             a2 tq = this.q;
             if (tq.C == null) {
                tq.C = ShareTopicExtra.generateData(this.t, this.x.getKSTextDisplayHandler().e(), this.s);
             }
             c = this.q.C;
             Object[] objArray2 = PatchProxy.apply(objArray, this, uoa2, "9");
             if (objArray2 != PatchProxyResult.class) {
             }else if(j.j(this.t)){
                List list = d.a(-1077260241).vt();
                if (!q.f(list)) {
                   objArray = new ArrayList();
                   Iterator iterator = list.iterator();
                   while (iterator.hasNext()) {
                      TopicItem topicItem = new TopicItem(iterator.next(), 0, TopicItemType.RECOMMEND, null, null, 0);
                      objArray.add(v5);
                   }
                }
             }
             objArray2 = objArray;
             c.setForceTopItems(objArray2);
             SerializableHook.putSerializable(uBundle, "topic_extra", c);
             this.y.setArguments(uBundle);
             e uoe = this.p.getSupportFragmentManager().beginTransaction();
             uoe.g(R.id.topic_guide_wrap, this.y, "ShareTopicGuidePresenter");
             uoe.m();
          }
       }
       this.X7(this.q.b.compose(c.c(this.p.m(), ActivityEvent.DESTROY)).subscribe(new g4(this), z1.b));
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, a2.class, "6")) {
          return;
       }
       a2 ty = this.y;
       ty.o = new f4(this);
       ty.y = new a2$a(this);
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, a2.class, "8")) {
          return;
       }
       this.A.setCompoundDrawablesWithIntrinsicBounds(R.drawable.arg_RES_7f081bbe, 0, 0, 0);
       this.B.setVisibility(8);
       this.B.i();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a2.class, "2")) {
          return;
       }
       this.x = m1.f(p0, 0x7f0a0ca8);
       p0 = m1.f(p0, R.id.preview_root);
       this.z = m1.f(p0, 0x7f0a448f);
       this.A = m1.f(p0, 0x7f0a4021);
       this.B = m1.f(p0, 0x7f0a4020);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a2.class, "1")) {
          return;
       }
       this.p = this.r8("SHARE_ACTIVITY");
       this.q = this.r8("SHARE_PAGE_PRESENTER_MODEL");
       this.r = this.t8("PHOTO_TASK_ID");
       this.s = this.t8("EDIT_SESSION_ID");
       this.t = this.t8("WORKSPACE");
       this.u = this.t8("SHARE_QPHOTO");
       this.v = this.t8("SHARE_VIDEO_CONTEXT");
       this.w = this.t8("SHARE_FROM_PAGE");
       return;
    }
}
