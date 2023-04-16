package com.yxcorp.plugin.search.utils.SearchLiveDanmakuHelper$b;
import ufd.i;
import com.yxcorp.plugin.search.utils.SearchLiveDanmakuHelper;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import com.yxcorp.plugin.search.result.danmu.SearchLiveCommentBulletsResponse$Comment;
import java.lang.Integer;
import ekd.q;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.content.Context;
import android.view.View;
import i2b.a;
import java.util.Objects;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.kwai.framework.model.user.UserInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.image.KwaiImageView;
import bld.b;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.content.res.Resources;
import com.yxcorp.widget.selector.drawable.DrawableCreator$Shape;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.Boolean;

public class SearchLiveDanmakuHelper$b extends i	// class@000789
{
    public List b;
    public final SearchLiveDanmakuHelper c;

    public void SearchLiveDanmakuHelper$b(SearchLiveDanmakuHelper p0,List p1){
       this.c = p0;
       super();
       this.b = p1;
    }
    public void a(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchLiveDanmakuHelper$b.class, "1")) {
          return;
       }
       this.b.addAll(p0);
       return;
    }
    public void b(SearchLiveCommentBulletsResponse$Comment p0,int p1){
       SearchLiveDanmakuHelper$b uob = SearchLiveDanmakuHelper$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "4")) {
          return;
       }
       if (!q.f(this.b) && (p1 < this.b.size() && p1 >= 0)) {
          this.b.add(p1, p0);
       }
    label_002c :
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, SearchLiveDanmakuHelper$b.class, "6")) {
          return;
       }
       super.d();
       this.b.clear();
       return;
    }
    public int e(){
       Object obj = PatchProxy.apply(null, this, SearchLiveDanmakuHelper$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.size();
    }
    public View f(Context p0,int p1,View p2){
       TextView obj;
       b uob;
       if (PatchProxy.isSupport(SearchLiveDanmakuHelper$b.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, SearchLiveDanmakuHelper$b.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p2 == null) {
          int i = (this.c.p != null)? 0x7f0d1423: 0x7f0d1424;
          i = a.a(p0, i);
       }
       Object obj1 = this.b.get(p1);
       if (p2.getTag() == obj1) {
          return p2;
       }else {
          SearchLiveDanmakuHelper$b tc = this.c;
          Objects.requireNonNull(tc);
          if (!PatchProxy.isSupport(SearchLiveDanmakuHelper.class) || (!PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, obj1, tc, SearchLiveDanmakuHelper.class, "13") && obj1 != null)) {
             if (tc.p != null) {
                TextView textView = p2.findViewById(R.id.danmaku_name);
                obj = p2.findViewById(R.id.danmaku_text);
                p2.setBackgroundColor(ContextCompat.getColor(p0, R.color.arg_RES_7f061994));
                textView.setShadowLayer(2.00f, 0x3f000000, 0x3f000000, ContextCompat.getColor(p0, R.color.arg_RES_7f06203c));
                obj.setShadowLayer(2.00f, 0x3f000000, 0x3f000000, ContextCompat.getColor(p0, R.color.arg_RES_7f06203c));
                p2.findViewById(R.id.danmaku_divider).setShadowLayer(2.00f, 0x3f000000, 0x3f000000, ContextCompat.getColor(p0, R.color.arg_RES_7f06203c));
                SearchLiveCommentBulletsResponse$Comment mUserInfo = obj1.mUserInfo;
                if (mUserInfo != null && !TextUtils.x(mUserInfo.mName)) {
                   textView.setText(obj1.mUserInfo.mName);
                }
                obj.setText(obj1.mContent);
             }else {
                KwaiImageView kwaiImageVie = p2.findViewById(R.id.image);
                KwaiImageView kwaiImageVie1 = p2.findViewById(R.id.circle_image);
                TextView textView1 = p2.findViewById(R.id.comment);
                if (tc.r != null && obj1.isRedBackground != null) {
                   uob = new b();
                   uob.g(KwaiRadiusStyles.FULL);
                   uob.v(p0.getResources().getColor(R.color.arg_RES_7f061b2b));
                   uob.s(DrawableCreator$Shape.Rectangle);
                   p2.setBackground(uob.a());
                   textView1.setSingleLine(true);
                   textView1.setMaxWidth(SearchLiveDanmakuHelper.w);
                   if (obj1.mUserInfo != null) {
                      kwaiImageVie.setVisibility(0);
                      kwaiImageVie.U(obj1.mUserInfo.mHeadUrls);
                   }
                   kwaiImageVie1.setVisibility(8);
                }else {
                   uob = new b();
                   uob.g(KwaiRadiusStyles.FULL);
                   uob.v(p0.getResources().getColor(R.color.arg_RES_7f0619a3));
                   uob.s(DrawableCreator$Shape.Rectangle);
                   p2.setBackground(uob.a());
                   kwaiImageVie1.setPlaceHolderImage(R.drawable.detail_avatar_secret);
                   if (obj1.mUserInfo != null) {
                      kwaiImageVie1.setVisibility(0);
                      kwaiImageVie1.U(obj1.mUserInfo.mHeadUrls);
                   }
                   kwaiImageVie.setVisibility(8);
                }
                textView1.setText(obj1.mContent);
             }
             p2.setTag(obj1);
          }
          return p2;
       }
    }
    public boolean g(){
       Object obj = PatchProxy.apply(null, this, SearchLiveDanmakuHelper$b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (!q.f(this.b) && (this.b.size() > 1 && (this.b.get(i).isRedBackground != null && this.b.get(1).isRedBackground != null))) {
          i = true;
       }
    label_003f :
       return i;
    }
}
