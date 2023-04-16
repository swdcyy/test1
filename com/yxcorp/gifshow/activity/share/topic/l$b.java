package com.yxcorp.gifshow.activity.share.topic.l$b;
import y8c.r;
import com.yxcorp.gifshow.activity.share.topic.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f66.i;
import jq.a;
import q87.c;
import android.view.View;
import nl8.p;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.model.topic.TopicSearchResultItem;
import android.widget.TextView;
import android.widget.ImageView;
import com.yxcorp.gifshow.model.topic.TopicIcon;
import com.yxcorp.gifshow.model.topic.RecommendItem;
import fx8.s;
import zf6.k;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.model.topic.TopicItemType;
import com.yxcorp.gifshow.activity.share.topic.l$b$a;
import ub.b;
import com.yxcorp.gifshow.model.topic.RecommendItem$Tag;
import java.lang.CharSequence;
import vw8.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.model.topic.HistoryItem;
import java.lang.StringBuilder;
import q46.f;
import lnc.a1;
import zf6.j;
import fx8.p0;
import android.view.View$OnClickListener;

public class l$b extends r	// class@001486
{
    public final l i;

    public void l$b(l p0){
       this.i = p0;
       super();
    }
    public void z(){
       boolean b;
       l$b uob = l$b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       String str = "TopicSearchResultItemPresenter";
       a.b().s(str, "onBind", objArray1);
       KwaiImageView kwaiImageVie = this.q(R.id.iv_tag);
       TopicSearchResultItem topicSearchR = this.t();
       TextView textView = this.q(R.id.tag_text);
       KwaiImageView kwaiImageVie1 = this.q(R.id.tag_icon);
       if (kwaiImageVie1 != null) {
          kwaiImageVie1.setVisibility(8);
       }
       if (s.e(topicSearchR.getLeftIcon())) {
          TopicIcon mDarkUrls = (k.d())? topicSearchR.getLeftIcon().mDarkUrls: topicSearchR.getLeftIcon().mUrls;
          kwaiImageVie.X(mDarkUrls, this);
       }else if(this.i.f0(this.F()) == TopicItemType.SEARCH_RESULT_TIPS.getValue()){
          kwaiImageVie.setImageResource(R.drawable.arg_RES_7f081bad);
       }else {
          kwaiImageVie.setImageResource(R.drawable.arg_RES_7f081bbf);
       }
       if (kwaiImageVie1 != null && s.e(topicSearchR.getTopicIcon())) {
          TopicIcon mDarkUrls1 = (k.d())? topicSearchR.getTopicIcon().mDarkUrls: topicSearchR.getTopicIcon().mUrls;
          kwaiImageVie1.Y(mDarkUrls1, this, new l$b$a(this, kwaiImageVie1));
          kwaiImageVie1.setVisibility(i);
       }
       String name = topicSearchR.getTag().getName();
       if (name.startsWith("#")) {
          name = name.substring(1);
       }
       textView.setText(name);
       textView.requestLayout();
       textView.invalidate();
       if (topicSearchR.getTag().getMarkedWorthless()) {
          Object[] objArray2 = new Object[i];
          a.b().w(str, "show no sense topic tips", objArray2);
          if (!PatchProxy.applyVoid(objArray, objArray, a.class, "91")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "NOSENSE_TOPIC_REMIND";
             u1.u0(3, uElementPack, objArray);
          }
       }else {
          TextView textView1 = this.q(R.id.tv_video_num);
          if (!PatchProxy.applyVoidTwoRefs(textView1, topicSearchR, this, uob, "2")) {
             RelativeLayout$LayoutParams layoutParams = textView1.getLayoutParams();
             if (!topicSearchR.getPhotoCount()) {
                Object obj = PatchProxy.applyOneRefs(topicSearchR, this, uob, "3");
                if (obj != PatchProxyResult.class) {
                   b = obj.booleanValue();
                }else if(topicSearchR.getTag() == null || topicSearchR.getKeyWord() == null){
                   b = false;
                }else {
                   b = (topicSearchR.getKeyWord()).equals(topicSearchR.getTag().getName());
                }
                if (b) {
                   textView1.setText(R.string.arg_RES_7f104745);
                   layoutParams.leftMargin = i;
                }
             }
             textView1.setTextColor(j.d(textView1, R.color.arg_RES_7f06166c));
             layoutParams.leftMargin = a1.d(0x7f0702cc);
             textView1.setLayoutParams(layoutParams);
             textView1.setText(f.a.a(topicSearchR.getViewCount())+a1.p(R.string.arg_RES_7f10403a));
          }
       }
       this.q(R.id.item_container).setOnClickListener(new p0(this, topicSearchR));
       return;
    }
}
