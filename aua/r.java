package aua.r;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.CommonMeta;
import ga5.b;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.w;
import com.kwai.framework.model.user.User;
import android.widget.TextView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import im8.f;
import com.kwai.component.feedstaggercard.PhotoItemViewParam;
import android.content.res.Resources;
import android.view.View;
import ekd.m1;

public class r extends PresenterV2	// class@00031d
{
    public CommonMeta p;
    public User q;
    public f r;
    public TextView s;
    public PhotoItemViewParam t;
    public BaseFeed u;
    public boolean v;

    public void r(){
       super(false);
    }
    public void r(boolean p0){
       super();
       this.v = false;
       this.v = p0;
    }
    public void E8(){
       r tr;
       if (PatchProxy.applyVoid(null, this, r.class, "3")) {
          return;
       }
       int i = 4;
       if (b.d(this.p) || w.k0(this.u)) {
          tr = this.r;
          if (tr != null) {
             tr.set(Boolean.FALSE);
          }
          this.s.setVisibility(i);
          return;
       }else if(this.v != null && this.q.mFavorited != null){
          this.s.setVisibility(i);
       }else {
          int i1 = 0;
          if (!TextUtils.x(this.p.mRelationTypeText)) {
             tr = this.r;
             if (tr != null) {
                tr.set(Boolean.TRUE);
             }
             this.s.setVisibility(i1);
             this.s.setText(this.p.mRelationTypeText);
          }else if(this.p.mRelationType == 1){
             tr = this.r;
             if (tr != null) {
                tr.set(Boolean.TRUE);
             }
             this.s.setVisibility(i1);
             this.s.setText(R.string.home_icon_relation_friend);
          }else {
             tr = this.r;
             if (tr != null) {
                tr.set(Boolean.FALSE);
             }
             this.s.setVisibility(i);
          }
       }
       tr = this.t;
       if (tr != null && tr.mIsShowNewTagIcon != null) {
          this.s.setBackgroundResource(R.drawable.arg_RES_7f080989);
          tr = this.s;
          tr.setTextColor(tr.getResources().getColor(R.color.arg_RES_7f061c48));
       }else {
          this.s.setBackgroundResource(R.drawable.feed_friends_bubble_orange);
          tr = this.s;
          tr.setTextColor(tr.getResources().getColor(R.color.arg_RES_7f061f86));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a3563);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, r.class, "1")) {
          return;
       }
       this.p = this.q8(CommonMeta.class);
       this.q = this.q8(User.class);
       this.r = this.w8("FEED_HAS_SHOWN_FRIEND_ICON");
       this.t = this.t8("FEED_ITEM_VIEW_PARAM");
       this.u = this.t8("feed");
       return;
    }
}
