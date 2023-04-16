package com.kuaishou.live.core.show.hourlytrank.LiveHourlyRankFancyResultTopGuardsUserItemView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import java.lang.Integer;

public class LiveHourlyRankFancyResultTopGuardsUserItemView extends FrameLayout	// class@000bf3
{
    public KwaiImageView b;
    public ImageView c;
    public UserInfo d;
    public int[] e;

    public void LiveHourlyRankFancyResultTopGuardsUserItemView(Context p0){
       super(p0, null, 0);
    }
    public void LiveHourlyRankFancyResultTopGuardsUserItemView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveHourlyRankFancyResultTopGuardsUserItemView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       int i = 3;
       this.e = new int[i]{0x7f0812b4,0x7f0812b5,0x7f0812b6};
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHourlyRankFancyResultTopGuardsUserItemView.class, "1")) {
       }else {
          this.e = new int[i]{0x7f081453,0x7f081454,0x7f081455};
          a.d(p0, R.layout.arg_RES_7f0d0afc, this, true);
          this.b = this.findViewById(0x7f0a1c71);
          this.c = this.findViewById(0x7f0a1c72);
       }
       return;
    }
    public void setRank(int p0){
       if (PatchProxy.isSupport(LiveHourlyRankFancyResultTopGuardsUserItemView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveHourlyRankFancyResultTopGuardsUserItemView.class, "3")) {
          return;
       }
       LiveHourlyRankFancyResultTopGuardsUserItemView te = this.e;
       if (p0 <= te.length && p0 > 0) {
          p0--;
          this.c.setImageResource(te[p0]);
       }
       return;
    }
}
