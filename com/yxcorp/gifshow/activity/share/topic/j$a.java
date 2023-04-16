package com.yxcorp.gifshow.activity.share.topic.j$a;
import y8c.r;
import com.yxcorp.gifshow.activity.share.topic.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nl8.p;
import com.kuaishou.android.post.topic.model.TopicItem;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.model.topic.TopicItemType;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.Context;
import zf6.j;
import lnc.a1;
import com.yxcorp.gifshow.model.topic.TopicIcon;
import fx8.s;
import zf6.k;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.util.Objects;
import q46.f;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import o56.c;
import o56.a;
import android.app.Application;
import g9c.a;
import com.yxcorp.utility.n;
import fx8.i0;
import android.view.View$OnClickListener;

public class j$a extends r	// class@001481
{
    public final j i;

    public void j$a(j p0){
       this.i = p0;
       super();
    }
    public void z(){
       TopicIcon mDarkUrls;
       float f;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, j$a.class, "1")) {
          return;
       }
       TopicItem topicItem = this.t();
       int i = 1;
       if (topicItem != null) {
          KwaiImageView kwaiImageVie = this.q(R.id.iv_tag);
          TextView textView = this.q(R.id.tag_text);
          KwaiImageView kwaiImageVie1 = this.q(R.id.tag_icon);
          int i1 = 8;
          kwaiImageVie1.setVisibility(i1);
          textView.setCompoundDrawables(objArray, objArray, objArray, objArray);
          textView.setText(topicItem.getKeyWorld());
          textView.requestLayout();
          textView.invalidate();
          if (!TextUtils.x(topicItem.getMKsOrderId()) || topicItem.getType() == TopicItemType.RECOMMEND) {
             if (s.e(topicItem.getLeftIcon())) {
                mDarkUrls = (k.d())? topicItem.getLeftIcon().mDarkUrls: topicItem.getLeftIcon().mUrls;
                kwaiImageVie.X(mDarkUrls, this);
             }
             if (s.e(topicItem.getTopicIcon())) {
                mDarkUrls = (k.d())? topicItem.getTopicIcon().mDarkUrls: topicItem.getTopicIcon().mUrls;
                kwaiImageVie1.X(mDarkUrls, this);
                kwaiImageVie1.setVisibility(0);
             }
          }else if(topicItem.getType() == TopicItemType.HISTORY){
             Drawable uDrawable = j.n(this.C(), R.drawable.arg_RES_7f08200c, 0x7f0616aa);
             if (uDrawable != null) {
                uDrawable.setBounds(0, 0, a1.d(R.dimen.arg_RES_7f070295), a1.d(R.dimen.arg_RES_7f070295));
             }
             textView.setCompoundDrawables(objArray, objArray, uDrawable, objArray);
          }
          TextView textView1 = this.q(R.id.tv_video_num);
          j$a ti = this.i;
          Objects.requireNonNull(ti);
          if (!PatchProxy.applyVoidTwoRefs(textView1, topicItem, ti, j.class, "2")) {
             if (topicItem.getType() != TopicItemType.HISTORY) {
                textView1.setVisibility(0);
                Object[] objArray1 = new Object[]{f.a.a(topicItem.getViewCount()),a1.p(0x7f10403a)};
                textView1.setText(String.format("%s%s", objArray1));
                textView1.setTextColor(j.d(textView1, R.color.arg_RES_7f06166c));
                RelativeLayout$LayoutParams layoutParams1 = textView1.getLayoutParams();
                layoutParams1.leftMargin = a1.d(0x7f0702cc);
                textView1.setLayoutParams(layoutParams1);
             }else {
                textView1.setVisibility(i1);
             }
          }
       }
       View view = this.q(R.id.bottom_divider);
       if (view != null && view.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
          ViewGroup$MarginLayoutParams layoutParams = view.getLayoutParams();
          Application uApplication = a.a().a();
          f = (this.F() == (this.i.getItemCount() - i))? 0: 16.00f;
          layoutParams.leftMargin = n.c(uApplication, f);
          view.setLayoutParams(layoutParams);
          view.setVisibility(0);
       }
       this.q(R.id.item_container).setOnClickListener(new i0(this, topicItem));
       return;
    }
}
