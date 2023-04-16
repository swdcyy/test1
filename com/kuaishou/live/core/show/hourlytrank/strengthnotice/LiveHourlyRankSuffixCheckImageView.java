package com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankSuffixCheckImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import android.util.AttributeSet;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ekd.j;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.facebook.drawee.view.DraweeView;
import com.kuaishou.live.common.core.basic.tools.l;

public class LiveHourlyRankSuffixCheckImageView extends KwaiImageView	// class@000c3c
{
    public String x;
    public boolean y;

    public void LiveHourlyRankSuffixCheckImageView(Context p0){
       super(p0);
    }
    public void LiveHourlyRankSuffixCheckImageView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void U(CDNUrl[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHourlyRankSuffixCheckImageView.class, "1")) {
          return;
       }
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveHourlyRankSuffixCheckImageView.class, "5");
       String str = "";
       if (obj != PatchProxyResult.class) {
          str = obj;
       }else if(j.h(p0)){
          int len = p0.length;
          int i = 0;
          while (i < len) {
             object oobject = p0[i];
             if (oobject != null && !TextUtils.x(oobject.mUrl)) {
                String[] stringArray = (oobject.mUrl).split("/");
                if (!j.h(stringArray) && stringArray.length > 0) {
                   str = stringArray[(stringArray.length - 1)];
                   break ;
                }
             }
             i = i + 1;
          }
       }
       if (!TextUtils.x(this.x) && (this.y != null || !TextUtils.n(this.x, str))) {
          this.p0();
          super.U(p0);
          this.x = str;
          this.y = false;
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveHourlyRankSuffixCheckImageView.class, "3")) {
          return;
       }
       super.onDetachedFromWindow();
       this.p0();
       return;
    }
    public void p0(){
       if (PatchProxy.applyVoid(null, this, LiveHourlyRankSuffixCheckImageView.class, "4")) {
          return;
       }
       l.j(this);
       this.y = false;
       this.x = null;
       return;
    }
}
